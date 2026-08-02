package ru.ok.android.externcalls.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.video.calls.sdk.conversation.hold.HoldException;
import one.video.calls.sdk.error.ServiceUnavailableException;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import one.video.calls.sdk.experiments.c;
import one.video.calls.sdk.experiments.models.PcapLabelConfig;
import one.video.calls.sdk.internal.join.FastJoinException;
import one.video.calls.sdk.internal.upload.config.BitrateDumpGatheringConfig;
import one.video.calls.sdk.net.signaling.WSSignaling;
import one.video.calls.sdk.net.signaling.WTSignaling;
import one.video.calls.sdk.rest.api.error.ApiErrorParticipantLimitExceeded;
import one.video.calls.sdk.rest.api.error.ApiErrorTooManyUsers;
import one.video.calls.sdk.rest.api.error.ApiErrorUserBanned;
import one.video.calls.sdk.rest.api.error.ApiErrorUserBlocked;
import one.video.calls.sdk.rest.api.error.ApiErrorUserPrivate;
import one.video.calls.sdk.rest.api.error.ApiInvocationError;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationImpl;
import ru.ok.android.externcalls.sdk.api.CallApiServiceImpl;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ChatHistoryEntry;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.ExternApiException;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.api.extern.ExternErrorParser;
import ru.ok.android.externcalls.sdk.api.interceptor.ExecutionTimeInterceptor;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdByExternalId;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr.internal.AsrManagerImpl;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.AsrOnlineManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManagerImpl;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.audio.internal.MicrophoneManagerImpl;
import ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.chat.internal.ChatManagerImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManagerImpl;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.contacts.internal.ContactCallManagerImpl;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.FastStartException;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Action;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionResult;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.dev.internal.DebugManagerImpl;
import ru.ok.android.externcalls.sdk.di.ApiModule;
import ru.ok.android.externcalls.sdk.di.ApiModuleImpl;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.HangupHint;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.exception.CallTerminatingException;
import ru.ok.android.externcalls.sdk.exception.Domain;
import ru.ok.android.externcalls.sdk.exception.SubDomain;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListenersImpl;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.internal.FeedbackManagerImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.mapping.ExternalToInternalIdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.InternalToExternalIdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.MediaMuteManagerImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManagerImpl;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManager;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl;
import ru.ok.android.externcalls.sdk.ml.delegate.NSFeatureDelegate;
import ru.ok.android.externcalls.sdk.ml.model.AvailableMLFeatureInfo;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;
import ru.ok.android.externcalls.sdk.net.internal.NetworkConnectionManagerImpl;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitorImpl;
import ru.ok.android.externcalls.sdk.p2prelay.P2PRelaySwitchConfigProviderImpl;
import ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStateChanger;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerConfigProviderImpl;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.renderer.ConversationRenderers;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.SessionRoomsManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantStatesHandler;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingTransportBuilder;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;
import ru.ok.android.externcalls.sdk.stat.audio.AudioErrorStat;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics;
import ru.ok.android.externcalls.sdk.stat.topology.ServerTopologyRequestedStat;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.UrlSharingManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;
import ru.ok.android.externcalls.sdk.util.ConversationListenerProxy;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;
import ru.ok.android.externcalls.sdk.video.internal.CameraManagerImpl;
import ru.ok.android.externcalls.sdk.video.internal.DisplayLayoutSenderImpl;
import ru.ok.android.externcalls.sdk.video.internal.ScreenCaptureManagerImpl;
import ru.ok.android.externcalls.sdk.video.internal.VideoRenderManagerImpl;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.WatchTogetherPlayerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom.SessionRoomWatchTogetherHandler;
import ru.ok.android.internal.tracer.TracerRTCLog;
import ru.ok.android.processing.PCMWrapper;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.CallEvents;
import ru.ok.android.webrtc.CallFlags;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.CallTimings;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.DelayedVideoRendererSource;
import ru.ok.android.webrtc.HangupReason;
import ru.ok.android.webrtc.OKCameraCapturer;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.RTCLogConfiguration;
import ru.ok.android.webrtc.SharedPeerConnectionFactory;
import ru.ok.android.webrtc.SignalingErrors;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.animoji.util.AnimojiControl;
import ru.ok.android.webrtc.camera.DefaultCameraCapturerFactory;
import ru.ok.android.webrtc.cid.CidExtKt;
import ru.ok.android.webrtc.cid.ConversationIdProviderImpl;
import ru.ok.android.webrtc.di.CallModuleImpl;
import ru.ok.android.webrtc.hangup.HangupParameters;
import ru.ok.android.webrtc.listeners.CallFingerprintListener;
import ru.ok.android.webrtc.listeners.CallNetworkStatusListener;
import ru.ok.android.webrtc.listeners.CallOptionChangedListener;
import ru.ok.android.webrtc.listeners.CallParticipantStateListener;
import ru.ok.android.webrtc.listeners.CallRecordListener;
import ru.ok.android.webrtc.listeners.InternalHoldStateListener;
import ru.ok.android.webrtc.listeners.ShouldRateCallListener;
import ru.ok.android.webrtc.listeners.TopologyUpgradeStatEventListener;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.CallExternalId;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.media.MuteEvent;
import ru.ok.android.webrtc.participant.media.MuteState;
import ru.ok.android.webrtc.sharedprefs.MLFeaturesInfoDataSource;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingStat;
import ru.ok.android.webrtc.signaling.feature.event.CallFeatureSetChangedEvent;
import ru.ok.android.webrtc.signaling.feature.event.CallFeaturesPerRoleChangedEvent;
import ru.ok.android.webrtc.signaling.transport.SignalingTransportAdapter;
import ru.ok.android.webrtc.signaling.util.UtilsKt;
import ru.ok.android.webrtc.stat.MediaStat;
import ru.ok.android.webrtc.stat.NegotiationError;
import ru.ok.android.webrtc.stat.audio.AudioErrorEvent;
import ru.ok.android.webrtc.stat.camera.CameraStatProvider;
import ru.ok.android.webrtc.stat.ice.IceCandidateAddFailedEvent;
import ru.ok.android.webrtc.stat.ice.IceCandidateGatheringFailedEvent;
import ru.ok.android.webrtc.topology.TopologyChangedEvent;
import ru.ok.android.webrtc.utils.AudioProcessor;
import ru.ok.android.webrtc.utils.Consumer;
import ru.ok.android.webrtc.utils.HangupInfo;
import ru.ok.android.webrtc.utils.PreferencesHelper;
import ru.ok.android.webrtc.utils.ThreadUtils;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import ru.ok.android.webrtc.watch_together.MovieStartInfo;
import ru.ok.android.webrtc.watch_together.MovieStateUpdates;
import ru.ok.android.webrtc.watch_together.MovieStopInfo;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.ao;
import xsna.bpv;
import xsna.clq;
import xsna.cqi;
import xsna.cvh;
import xsna.d0y;
import xsna.d370;
import xsna.dmq;
import xsna.drm0;
import xsna.dsj0;
import xsna.dx3;
import xsna.ear;
import xsna.far;
import xsna.g39;
import xsna.gav;
import xsna.gbh;
import xsna.gm70;
import xsna.gzs;
import xsna.h39;
import xsna.h6;
import xsna.hav;
import xsna.i5f;
import xsna.iav;
import xsna.iie;
import xsna.ir;
import xsna.izs;
import xsna.j39;
import xsna.k39;
import xsna.kz;
import xsna.m2g;
import xsna.od7;
import xsna.p0y;
import xsna.p5h;
import xsna.pd7;
import xsna.q40;
import xsna.q5f;
import xsna.qcy;
import xsna.qd7;
import xsna.qkx;
import xsna.qs90;
import xsna.qxm0;
import xsna.rd7;
import xsna.rs90;
import xsna.s3q0;
import xsna.sd7;
import xsna.sfg;
import xsna.td7;
import xsna.ud7;
import xsna.vd7;
import xsna.wyg0;
import xsna.xar;
import xsna.xrj;
import xsna.y1d0;
import xsna.yce;
import xsna.yrj;
import xsna.z1d0;

@CallInternalApi
/* loaded from: classes9.dex */
class ConversationImpl implements Conversation {
    private static final float AUDIO_LEVEL_CLAMP_MAX = 10000.0f;
    private static final float AUDIO_LEVEL_MIN = 1000.0f;
    private static final String LOG_TAG = "Conversation";
    private final AddParticipantsCommands addParticipantsCommands;
    private final AnimojiDataSupplierInterface animojiDataSupplier;

    @Nullable
    private String anonToken;
    private final ApiModule apiModule;

    @NonNull
    private final OkApiServiceInternal apiService;
    private final AsrListenerManagerImpl asrListenerManager;
    private final AsrManager asrManager;
    private final AsrOnlineManagerImpl asrOnlineManager;
    private final SharedPeerConnectionFactory.AudioEventsListener audioEventsListener;
    private final int audioLevelFrequencyMs;

    @NonNull
    private final AudioSampleEnergyCalculator audioSampleEnergyCalculator;
    private boolean audioSampleEnergyCalculatorRegistered;

    @NonNull
    private final Call call;
    private final h39 callFinishHandler;
    private CallInfo callInfo;
    private final CallParams callParams;
    private final Runnable callParticipantResolutionRunnable;

    @NonNull
    private final CameraManager cameraManager;
    private final ChatListenerManagerImpl chatListenerManager;
    private final ChatManagerImpl chatManager;
    private final ChatStateListener chatStateListener;
    private final ConversationIdProvider cidProvider;
    private final ClientCapabilities clientCapabilities;
    private final ContactCallManagerImpl contactCallManager;
    private final ConversationFeatureListenersImpl conversationFeatureListeners;
    private final ConversationFeatureManagerImpl conversationFeatureManager;
    private ConversationParams conversationParams;
    private final ConversationStart conversationStart;
    private final ConversationStats conversationStats;
    private final ConversationFactory creator;

    @NonNull
    private final DebugManager debugManager;

    @NonNull
    private final DisplayLayoutSender displayLayoutSender;
    private final io.reactivex.rxjava3.disposables.b disposable;

    @NonNull
    private final MultiEventListener eventListener;

    @NonNull
    private final ExecutionTimeInterceptor executionTimeInterceptor;
    private final ExecutorService executorService;
    private boolean expectedChat;
    private final ExperimentsInterface experiments;
    private final ExternalIdsResolver externalIdsResolver;
    private final FeedbackListenerManagerImpl feedbackListenerManager;
    private final FeedbackManager feedbackManager;
    private boolean forceRelayPolicy;
    private final IdMappingWrapper idMappingWrapper;
    private volatile boolean inited;

    @Nullable
    private final String initialJoinLink;

    @Nullable
    private ConversationParticipant initialOpponent;
    private final InternalHoldStateListener internalHoldStateListener;

    @NonNull
    private final IdsMapper<ParticipantId, CallParticipant.ParticipantId> internalIdsMapper;

    @NonNull
    private final InternalIdsResolver internalIdsResolver;
    private final qkx internalParamsProvider;
    private final boolean isAnswer;
    private final boolean isCaller;
    private boolean isConcurrent;
    private boolean isConcurrentByApi;
    private final AtomicBoolean isHoldStateProcessingActive;
    private final boolean isJoined;
    private final d0y joinConversationDelegate;

    @NonNull
    private final ListenerImpl listener;

    @NonNull
    private final ConversationListenerProxy<ListenerImpl> listenerProxy;
    private final LocalIdMappings localIdMappings;
    private final Locale locale;
    private final RTCLog log;
    private final RTCLogConfiguration logConfiguration;
    private final Handler mainThreadHandler;

    /* renamed from: me, reason: collision with root package name */
    @NonNull
    private final ConversationParticipant f105me;
    private final MediaConnectionManagerImpl mediaConnectionManager;
    private final MediaMuteListenerManagerImpl mediaMuteListenerManager;
    private final MediaMuteManagerImpl mediaMuteManager;

    @NonNull
    private final MicrophoneManager microphoneManager;
    private final MLFeaturesInfoDataSource mlFeaturesInfoDataSource;
    private final MLFeaturesManager mlFeaturesManager;

    @NonNull
    private final NetworkConnectionManager networkConnectionManager;

    @NonNull
    private final NoiseSuppressionManager noiseSuppressionManager;

    @Nullable
    private P2pRelaySwitchTrigger p2pRelaySwitchTrigger;
    private final ParticipantStatesManagerImpl participantStatesManager;
    private final ParticipantsUpdater participantsUpdater;
    private qs90 pcapLabelProvider;
    private final PeerIdGenerator peerIdGenerator;
    private final PreferencesHelper preferencesHelper;
    private volatile boolean prepared;
    private final RateManagerImpl rateManager;
    private final RecordManagerImpl recordManager;
    private final RemoteSettings remoteSettings;

    @NonNull
    private final ScreenCaptureManager screenCaptureManager;
    private final SessionRoomsManagerImpl sessionRoomManager;
    private final SessionRoomParticipantStatesHandler sessionRoomParticipantStatesHandler;
    private final SessionRoomWatchTogetherHandler sessionRoomWatchTogetherHandler;
    private Signaling.Transport signalingTransport;
    private final wyg0 sslProvider;
    private final StartCallApiParams startCallApiParams;
    private final StatMonitor statMonitor;
    private final AtomicReference<Conversation.State> state;
    private final Object stateTransitionLock = new Object();

    @NonNull
    private final StereoRoomManagerImpl stereoRoomManager;

    @NonNull
    private final ParticipantStore store;
    private final TimeProvider timeProvider;
    private final CallTimings timings;
    private final TopologyUpgradeStatEventListener topologyUpgradeStatEventListener;
    private final UrlSharingListenerManagerImpl urlSharingListenerManager;
    private final UrlSharingManagerImpl urlSharingManager;
    private final String version;

    @NonNull
    private final VideoRenderManager videoRenderManager;
    private final DelayedVideoRendererSource videoRendererProvider;
    private final WaitingRoomParticipants waitingRoomParticipants;
    private volatile boolean wantsApiHangup;
    private volatile boolean wasHungUp;
    private final WatchTogetherListenerManagerImpl watchTogetherListenerManager;
    private final WatchTogetherPlayer watchTogetherPlayer;

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$1, reason: invalid class name */
    public class AnonymousClass1 extends AudioSampleEnergyCalculator {
        public AnonymousClass1(Handler handler) {
            super(handler);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSample$0() {
            if (ConversationImpl.this.listener.listener == null || ConversationImpl.this.call.isAudioMixEnabled()) {
                return;
            }
            ConversationImpl.this.updateTalkingParticipants();
        }

        @Override // ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator, ru.ok.android.external.sdk.MicSampleListener
        public void onSample(int i, int i2, int i3, @NonNull PCMWrapper pCMWrapper) {
            super.onSample(i, i2, i3, pCMWrapper);
            ConversationImpl.this.mainThreadHandler.post(new Runnable() { // from class: ru.ok.android.externcalls.sdk.j1
                @Override // java.lang.Runnable
                public final void run() {
                    ConversationImpl.AnonymousClass1.this.lambda$onSample$0();
                }
            });
        }
    }

    /* renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$android$webrtc$CallEvents;

        static {
            int[] iArr = new int[CallEvents.values().length];
            $SwitchMap$ru$ok$android$webrtc$CallEvents = iArr;
            try {
                iArr[CallEvents.PARTICIPANT_HANGUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.CONVERSATION_CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.LOCAL_MEDIA_SETTINGS_CHANGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.PEER_MEDIA_SETTINGS_CHANGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.ACCEPTED_ON_OTHER_DEVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.MICROPHONE_MUTED_BY_API.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.CAMERA_MUTED_BY_API.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.ICE_DISCONNECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.CAMERA_CHANGED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.CALL_ACCEPTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.ICE_CONNECTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.PEER_REGISTERED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.DESTROYED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.INVALID_TOKEN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.MUTE_MICRO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.UNMUTE_MICRO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.CALL_SIGNALING_CONNECTED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.ROLES_CHANGED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.ROLES_CHANGED_MULTI_DEVICES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.MUTE_PARTICIPANT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.PIN_PARTICIPANT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.PIN_PARTICIPANT_INITIATOR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.RTMP_FALLBACK.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.GROUP_CALL_CHAT_CREATED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.GROUP_CALL_CHAT_EXISTS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.MUTE_STATE_INITIALIZED.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.MIGRATED_TO_SERVER_TOPOLOGY_FROM_DIRECT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.JOIN_LINK_CHANGED.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.WATCH_TOGETHER_START.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.WATCH_TOGETHER_UPDATE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.WATCH_TOGETHER_STOP.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.FEATURE_SET_CHANGED.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.FEATURES_PER_ROLE_CHANGED.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[CallEvents.SIGNALING_ERROR.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
        }
    }

    public class ListenerImpl implements Call.EventListener, Call.CustomDataListener, CallFingerprintListener, CallNetworkStatusListener, CallParticipantStateListener, WaitingRoomParticipants.Listener, ShouldRateCallListener, CallOptionChangedListener {
        private boolean callAcceptedFired;
        private boolean callAcceptedForwarded;
        private ConversationEventsListener listener;

        public ListenerImpl(ConversationEventsListener conversationEventsListener) {
            this.listener = conversationEventsListener;
        }

        private void handleCallAccepted(CallParticipant callParticipant) {
            if (!ConversationImpl.this.isJoined && ConversationImpl.this.call.topologyIdentity() == Topology.DIRECT) {
                ConversationImpl.this.conversationStats.acceptCallStat.onAcceptCall(ConversationImpl.this.isCaller, Objects.equals(callParticipant, ConversationImpl.this.f105me.getCallParticipant()), ConversationImpl.this.isConcurrent);
            }
            if (!this.callAcceptedForwarded && (!ConversationImpl.this.isCaller || this.callAcceptedFired)) {
                this.listener.onCallAccepted();
                maybeInitP2PRelaySwitchTrigger();
                this.callAcceptedForwarded = true;
            }
            this.callAcceptedFired = true;
            this.listener.onCallAcceptedForAll();
        }

        private void handleHangup(@NonNull Call call, @Nullable Object obj) {
            this.listener.onCallEnded(ConversationImpl.this.getCallEndInfo(call.rejectReason, obj));
            this.listener.onCallEnded(new ConversationEndInfo(call.callEndInfoHolder.getReason()));
            ConversationImpl.this.handleCallFinished(call.callFinishReason);
            ConversationImpl.this.conversationStats.wsSignalingStat.onCallFinished();
        }

        private void handleMuteParticipant(@NonNull MuteState muteState) {
            if (shouldNotifyLegacyListener(muteState)) {
                this.listener.onMuteChanged(muteState.getMuteEvent());
            }
            ConversationImpl.this.mediaMuteListenerManager.onMuteChanged(muteState.getMuteEvent());
        }

        private void handleMuteStateInitialized(@NonNull MuteState muteState) {
            if (!muteState.isForAll() || !ConversationImpl.this.isMeCreatorOrAdmin()) {
                this.listener.onMuteStateInitialized(muteState.getMuteEvent());
            }
            ConversationImpl.this.mediaMuteListenerManager.onMuteStateInitialized(muteState.getMuteEvent());
        }

        private void handleRolesChanged(@NonNull CallParticipant callParticipant) {
            ParticipantId convert;
            CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
            ConversationParticipant byInternal = participantId != null ? ConversationImpl.this.store.getByInternal(participantId) : null;
            if (byInternal == null && callParticipant.getExternalId() != null && (convert = CallExternalIdConverter.convert(callParticipant.getExternalId())) != null) {
                byInternal = ConversationImpl.this.store.getParticipantById(convert);
            }
            if (byInternal != null) {
                if (byInternal.getCallParticipant() == null) {
                    byInternal.setCallParticipant(callParticipant, ConversationImpl.this.localIdMappings);
                }
                ConversationEventsListener conversationEventsListener = this.listener;
                if (conversationEventsListener != null) {
                    conversationEventsListener.onRolesChanged(byInternal);
                }
                if ((ConversationImpl.this.f105me.getInternalId() == null || !ConversationImpl.this.f105me.getInternalId().equals(callParticipant.getParticipantId())) && byInternal != ConversationImpl.this.f105me) {
                    return;
                }
                ConversationImpl.this.waitingRoomParticipants.onIsMeAdminMayHaveChanged(ConversationImpl.this.isMeCreatorOrAdmin());
            }
        }

        private void maybeInitP2PRelaySwitchTrigger() {
            if (ConversationImpl.this.isCaller && ConversationImpl.this.call.topologyIdentity() == Topology.DIRECT) {
                P2PRelaySwitchConfigProviderImpl p2PRelaySwitchConfigProviderImpl = new P2PRelaySwitchConfigProviderImpl(ConversationImpl.this.remoteSettings, ConversationImpl.this.log);
                ConversationImpl conversationImpl = ConversationImpl.this;
                StatMonitor statMonitor = ConversationImpl.this.statMonitor;
                RTCLog rTCLog = ConversationImpl.this.log;
                Call call = ConversationImpl.this.call;
                Objects.requireNonNull(call);
                conversationImpl.p2pRelaySwitchTrigger = new P2pRelaySwitchTrigger(statMonitor, rTCLog, new gbh(call, 3), ConversationImpl.this.conversationStats, p2PRelaySwitchConfigProviderImpl);
            }
        }

        private boolean shouldNotifyLegacyListener(@NonNull MuteState muteState) {
            Map<MediaOption, MediaOptionState> changedMediaOptionsState;
            if (!muteState.isForAll() || !ConversationImpl.this.isMeCreatorOrAdmin()) {
                return true;
            }
            MuteEvent muteEvent = muteState.getMuteEvent();
            if (muteEvent == null || (changedMediaOptionsState = muteEvent.getChangedMediaOptionsState()) == null) {
                return false;
            }
            Iterator<MediaOption> it = muteEvent.getRequestedMedia().iterator();
            while (it.hasNext()) {
                MediaOptionState mediaOptionState = changedMediaOptionsState.get(it.next());
                if (mediaOptionState != null && mediaOptionState == MediaOptionState.UNMUTED) {
                    return true;
                }
            }
            return false;
        }

        @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
        public void onAdminInCallChanged() {
            this.listener.onAdminInCallChanged(ConversationImpl.this.isAdminHere());
        }

        @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
        public void onAnonJoinForbiddenChanged() {
            this.listener.onAnonJoinForbiddenChanged(ConversationImpl.this.isAnonJoinForbidden());
        }

        @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
        public void onAsrOnlineAvailableChanged() {
            ConversationImpl.this.asrOnlineManager.onAsrAvailableChanged(ConversationImpl.this.call.isAsrAvailable());
        }

        @Override // ru.ok.android.webrtc.listeners.CallFingerprintListener
        public void onCallParticipantFingerprint(@NonNull CallParticipant callParticipant, long j) {
            ConversationEventsListener conversationEventsListener;
            if (ConversationImpl.this.call.getParticipants().size() == 1 && ConversationImpl.this.call.getOpponent() == callParticipant && (conversationEventsListener = this.listener) != null) {
                conversationEventsListener.onOpponentFingerprintChanged(j);
            }
        }

        @Override // ru.ok.android.webrtc.listeners.CallNetworkStatusListener
        public void onCallParticipantNetworkStatusChanged(@NonNull List<CallParticipant> list) {
            ConversationParticipant byInternal;
            ArrayList arrayList = new ArrayList();
            for (CallParticipant callParticipant : list) {
                CallParticipant.ParticipantId participantId = callParticipant.getParticipantId();
                if (participantId != null && (byInternal = ConversationImpl.this.store.getByInternal(participantId)) != null) {
                    if (byInternal.getCallParticipant() == null) {
                        byInternal.setCallParticipant(callParticipant, ConversationImpl.this.localIdMappings);
                    }
                    if (ConversationImpl.this.store.getParticipantRoomId(byInternal) == ConversationImpl.this.store.getActiveRoomId()) {
                        arrayList.add(byInternal);
                    }
                }
            }
            if (this.listener == null || arrayList.isEmpty()) {
                return;
            }
            this.listener.onCallParticipantsNetworkStatusChanged(arrayList);
        }

        @Override // ru.ok.android.webrtc.Call.CustomDataListener
        public void onCustomData(CallParticipant.ParticipantId participantId, JSONObject jSONObject) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onCustomData(jSONObject);
            }
        }

        @Override // ru.ok.android.webrtc.Call.EventListener
        public void onEvent(@NonNull Call call, @NonNull CallEvents callEvents, @Nullable Object obj) {
            ConversationImpl.this.log.log(ConversationImpl.LOG_TAG, "EVENT: " + callEvents);
            if (this.listener != null) {
                switch (AnonymousClass6.$SwitchMap$ru$ok$android$webrtc$CallEvents[callEvents.ordinal()]) {
                    case 1:
                    case 2:
                        handleHangup(call, obj);
                        break;
                    case 3:
                        this.listener.onLocalMediaChanged();
                        break;
                    case 4:
                        this.listener.onOpponentMediaChanged();
                        break;
                    case 5:
                        this.listener.onCallEnded(new ConversationEventsListener.CallEndInfo(HangupReason.CANCELED, Collections.EMPTY_SET, null));
                        call.callEndInfoHolder.setReason(ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE);
                        this.listener.onCallEnded(new ConversationEndInfo(call.callEndInfoHolder.getReason()));
                        ConversationImpl.this.conversationStats.wsSignalingStat.onCallFinished();
                        break;
                    case 6:
                        this.listener.onMicrophoneForciblyMuted();
                        break;
                    case 7:
                        this.listener.onCameraForciblyMuted();
                        break;
                    case 8:
                        ConversationImpl.this.mediaConnectionManager.onIceDisconnected();
                        this.listener.onDisconnected();
                        break;
                    case 9:
                        this.listener.onCameraChanged();
                        break;
                    case 10:
                        handleCallAccepted(obj instanceof CallParticipant ? (CallParticipant) obj : null);
                        break;
                    case 11:
                        ConversationImpl.this.mediaConnectionManager.onIceConnected();
                        this.listener.onConnected();
                        if (!ConversationImpl.this.audioSampleEnergyCalculatorRegistered) {
                            ConversationImpl.this.audioSampleEnergyCalculatorRegistered = true;
                            call.registerAudioSampleCallback(ConversationImpl.this.audioSampleEnergyCalculator, ConversationImpl.this.audioLevelFrequencyMs);
                            break;
                        }
                        break;
                    case 12:
                        this.listener.onOpponentRegistered();
                        break;
                    case 13:
                        this.listener.onDestroyed(ConversationImpl.this.getDestroyReason());
                        this.listener.onDestroyed(new ConversationDestroyedInfo(call.callEndInfoHolder.getReason()));
                        ConversationImpl.this.idMappingWrapper.scheduleWriteCacheToDisk();
                        ConversationImpl.this.handleCallFinished(call.callFinishReason);
                        ConversationImpl.this.conversationStats.wsSignalingStat.onCallFinished();
                        break;
                    case 14:
                        ConversationImpl.this.resetSignaling();
                        break;
                    case 15:
                        call.setMuted(true);
                        this.listener.onMicChanged(true);
                        break;
                    case 16:
                        call.setMuted(false);
                        this.listener.onMicChanged(false);
                        break;
                    case 17:
                        this.listener.onCallSignalingConnected();
                        break;
                    case 18:
                        if (obj instanceof CallParticipant) {
                            handleRolesChanged((CallParticipant) obj);
                            break;
                        }
                        break;
                    case 19:
                        if (obj instanceof Set) {
                            Iterator it = ((Set) obj).iterator();
                            while (it.hasNext()) {
                                handleRolesChanged((CallParticipant) it.next());
                            }
                            break;
                        }
                        break;
                    case 20:
                        if (obj instanceof MuteState) {
                            handleMuteParticipant((MuteState) obj);
                            break;
                        }
                        break;
                    case 21:
                    case 22:
                        CallParticipant.ParticipantId participantId = obj instanceof CallParticipant.ParticipantId ? (CallParticipant.ParticipantId) obj : null;
                        this.listener.onPinChanged(participantId != null ? ConversationImpl.this.store.getByInternal(participantId) : null, callEvents == CallEvents.PIN_PARTICIPANT_INITIATOR);
                        break;
                    case 24:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatCreated(((Long) obj).longValue());
                            break;
                        }
                        break;
                    case 25:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatUpdated(((Long) obj).longValue());
                            break;
                        }
                        break;
                    case 26:
                        if (obj instanceof MuteState) {
                            handleMuteStateInitialized((MuteState) obj);
                            break;
                        }
                        break;
                    case 27:
                        this.listener.onMigratedToServerTopology();
                        ConversationImpl.this.asrOnlineManager.onMigratedToServerCallTopology();
                        break;
                    case 28:
                        if (obj instanceof String) {
                            this.listener.onJoinLinkUpdated((String) obj);
                            break;
                        }
                        break;
                    case 29:
                        if (obj instanceof MovieStartInfo) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStarted((MovieStartInfo) obj);
                            break;
                        }
                        break;
                    case 30:
                        if (obj instanceof MovieStateUpdates) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStatesUpdatedChanged((MovieStateUpdates) obj);
                            break;
                        }
                        break;
                    case 31:
                        if (obj instanceof MovieStopInfo) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStopped((MovieStopInfo) obj);
                            break;
                        }
                        break;
                    case 32:
                        if (obj instanceof CallFeatureSetChangedEvent) {
                            ConversationImpl.this.conversationFeatureListeners.onFeatureSetChanged((CallFeatureSetChangedEvent) obj);
                            break;
                        }
                        break;
                    case 33:
                        if (obj instanceof CallFeaturesPerRoleChangedEvent) {
                            ConversationImpl.this.conversationFeatureListeners.onFeaturesPerRoleChanged((CallFeaturesPerRoleChangedEvent) obj);
                            break;
                        }
                        break;
                    case 34:
                        if (obj instanceof SignalingErrors.CallIsUnfeasibleError) {
                            this.listener.onCallIsUnfeasibleError((SignalingErrors.CallIsUnfeasibleError) obj);
                            break;
                        }
                        break;
                }
            }
        }

        @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
        public void onFeedbackEnabledChanged() {
            ConversationImpl.this.feedbackListenerManager.onFeedbackEnabledChanged(ConversationImpl.this.isFeedbackEnabled());
        }

        @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
        public void onMeInWaitingRoomChanged(boolean z) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onMeInWaitingRoomChanged(z);
            }
        }

        @Override // ru.ok.android.webrtc.listeners.ShouldRateCallListener
        public void onRateCall(@NonNull JSONObject jSONObject) {
            RateCallData rateCallData;
            ConversationParams conversationParams = ConversationImpl.this.conversationParams;
            if (conversationParams == null) {
                rateCallData = new RateCallData(0, Collections.EMPTY_LIST);
            } else {
                rateCallData = conversationParams.rateCallData;
                if (rateCallData == null) {
                    rateCallData = new RateCallData(0, Collections.EMPTY_LIST);
                }
            }
            this.listener.onRateCall(rateCallData);
        }

        @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
        public void onRecurringChanged() {
            this.listener.onRecurringChanged(ConversationImpl.this.isRecurring());
        }

        @Override // ru.ok.android.webrtc.listeners.CallParticipantStateListener
        public void onStateChanged(@NonNull CallParticipant.ParticipantId participantId, @NonNull CallParticipant.ParticipantState participantState) {
            if (this.listener != null) {
                ConversationParticipant byInternal = ConversationImpl.this.store.getByInternal(participantId);
                if (byInternal == null) {
                    byInternal = ConversationParticipant.fromInternal(participantId, ConversationImpl.this.idMappingWrapper);
                }
                this.listener.onStateChanged(byInternal, participantState);
                ConversationImpl.this.participantStatesManager.onStateChanged(participantId, participantState);
            }
        }

        @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
        public void onWaitForAdminChanged() {
            this.listener.onWaitForAdminEnabled();
        }

        @Override // ru.ok.android.webrtc.listeners.CallOptionChangedListener
        public void onWaitingHallEnabledChanged() {
            ConversationImpl.this.waitingRoomParticipants.onWaitingRoomEnabled(ConversationImpl.this.isWaitingRoomEnabled());
            this.listener.onWaitingRoomEnabledChanged(ConversationImpl.this.isWaitingRoomEnabled());
        }

        @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
        public void onWaitingRoomParticipantsChanged(@NonNull WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }

        public void release() {
            this.listener = null;
        }
    }

    public ConversationImpl(ConversationBuilder conversationBuilder) {
        CallApiServiceImpl callApiServiceImpl;
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        LocalIdMappings localIdMappings = new LocalIdMappings();
        this.localIdMappings = localIdMappings;
        this.peerIdGenerator = new PeerIdGenerator();
        this.callParticipantResolutionRunnable = new Runnable() { // from class: ru.ok.android.externcalls.sdk.w0
            @Override // java.lang.Runnable
            public final void run() {
                ConversationImpl.this.resolveUnknownExternals();
            }
        };
        this.audioSampleEnergyCalculatorRegistered = false;
        AtomicReference<Conversation.State> atomicReference = new AtomicReference<>(Conversation.State.None);
        this.state = atomicReference;
        this.p2pRelaySwitchTrigger = null;
        this.isHoldStateProcessingActive = new AtomicBoolean();
        this.creator = conversationBuilder.creator;
        this.executorService = conversationBuilder.executorService;
        this.version = conversationBuilder.version;
        boolean z = conversationBuilder.isCaller;
        this.isCaller = z;
        this.isAnswer = conversationBuilder.isAnswer;
        this.isJoined = conversationBuilder.isJoined;
        this.forceRelayPolicy = conversationBuilder.forceRelayPolicy;
        this.disposable = new io.reactivex.rxjava3.disposables.b();
        PreferencesHelper preferencesHelper = new PreferencesHelper(conversationBuilder.context);
        this.preferencesHelper = preferencesHelper;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        ConversationEventsListener conversationEventsListener = conversationBuilder.eventListener;
        if (conversationEventsListener != null) {
            copyOnWriteArraySet.add(conversationEventsListener);
        }
        MultiEventListener multiEventListener = new MultiEventListener(copyOnWriteArraySet);
        this.eventListener = multiEventListener;
        ListenerImpl listenerImpl = new ListenerImpl(multiEventListener);
        this.listener = listenerImpl;
        ConversationListenerProxy<ListenerImpl> conversationListenerProxy = new ConversationListenerProxy<>(listenerImpl);
        this.listenerProxy = conversationListenerProxy;
        this.internalHoldStateListener = new InternalHoldStateListener() { // from class: ru.ok.android.externcalls.sdk.a1
            @Override // ru.ok.android.webrtc.listeners.InternalHoldStateListener
            public final void onParticipantHoldStateChanged(String str, boolean z2) {
                ConversationImpl.this.lambda$new$0(str, z2);
            }
        };
        q40 q40Var = new q40(multiEventListener, 11);
        String str = conversationBuilder.cid;
        ConversationIdProviderImpl conversationIdProviderImpl = new ConversationIdProviderImpl(q40Var, str == null ? "" : str);
        this.cidProvider = conversationIdProviderImpl;
        RTCLog rTCLog = conversationBuilder.log;
        if (rTCLog instanceof TracerRTCLog) {
            ((TracerRTCLog) rTCLog).setCidProvider(conversationIdProviderImpl);
        }
        CidLogger cidLogger = new CidLogger(conversationIdProviderImpl, rTCLog);
        this.log = cidLogger;
        RTCLogConfiguration rTCLogConfiguration = conversationBuilder.logConfiguration;
        this.logConfiguration = rTCLogConfiguration;
        IdMappingWrapper idMappingWrapper = conversationBuilder.idMappingWrapper;
        this.idMappingWrapper = idMappingWrapper;
        this.initialJoinLink = conversationBuilder.joinLink;
        this.anonToken = conversationBuilder.anonToken;
        StatMonitorImpl statMonitorImpl = new StatMonitorImpl(cidLogger);
        this.statMonitor = statMonitorImpl;
        xar.b = new xar.a(cidLogger);
        ConversationParticipant conversationParticipant = conversationBuilder.f104me;
        this.f105me = conversationParticipant;
        conversationParticipant.setReported(true);
        ParticipantStore participantStore = new ParticipantStore(conversationParticipant, localIdMappings);
        this.store = participantStore;
        this.audioLevelFrequencyMs = conversationBuilder.audioLevelFrequencyMs;
        this.mlFeaturesInfoDataSource = new MLFeaturesInfoDataSource.Impl(new gzs() { // from class: ru.ok.android.externcalls.sdk.b1
            @Override // xsna.gzs
            public final Object invoke() {
                RTCLog lambda$new$1;
                lambda$new$1 = ConversationImpl.this.lambda$new$1();
                return lambda$new$1;
            }
        }, conversationBuilder.context);
        vd7 vd7Var = new vd7(new sd7(new gzs() { // from class: ru.ok.android.externcalls.sdk.c1
            @Override // xsna.gzs
            public final Object invoke() {
                RTCLog lambda$new$2;
                lambda$new$2 = ConversationImpl.this.lambda$new$2();
                return lambda$new$2;
            }
        }, conversationBuilder.context, "bitrate_dump_config"));
        applyBitrateDumpGatheringConfig(conversationBuilder.experiments, vd7Var, conversationBuilder.context);
        CallParams createCallParams = CallUtil.createCallParams(conversationBuilder);
        this.callParams = createCallParams;
        AnimojiDataSupplierInterface animojiDataSupplierInterface = conversationBuilder.animojiRenderProvider;
        this.animojiDataSupplier = animojiDataSupplierInterface;
        this.clientCapabilities = configureSignalingCapabilities(conversationParticipant, conversationBuilder.clientCapabilities);
        ExperimentsInterface experiments = createCallParams.getExperiments();
        this.experiments = experiments;
        StartCallApiParams createStartCallApiParams = createStartCallApiParams(conversationBuilder);
        this.startCallApiParams = createStartCallApiParams;
        CallParticipant callParticipant = new CallParticipant(conversationParticipant.getInternalId(), null, null, null);
        conversationParticipant.setCallParticipant(callParticipant, localIdMappings);
        ConversationParticipant conversationParticipant2 = conversationBuilder.initialOpponent;
        ConversationParticipant conversationParticipant3 = (conversationParticipant2 == null || Objects.equals(conversationParticipant2.getExternalId(), conversationParticipant.getExternalId())) ? null : conversationBuilder.initialOpponent;
        this.initialOpponent = conversationParticipant3;
        if (conversationParticipant3 != null) {
            participantStore.addToActiveSessionRoom(conversationParticipant3);
            this.initialOpponent.setReported(true);
        }
        TimeProvider timeProvider = conversationBuilder.timeProvider;
        this.timeProvider = timeProvider;
        boolean z2 = this.initialOpponent != null;
        boolean isVideo = createStartCallApiParams.isVideo();
        boolean z3 = this.forceRelayPolicy;
        ClientCapabilities clientCapabilities = conversationBuilder.clientCapabilities;
        CallFlags callFlags = new CallFlags(z2, isVideo, z3, clientCapabilities != null && clientCapabilities.has(ClientCapabilities.Capability.SESSION_STATE_UPDATES));
        CallApiServiceImpl callApiServiceImpl2 = new CallApiServiceImpl(conversationIdProviderImpl, this.anonToken);
        createCallParams.getExperiments().getClass();
        CallTimings create = CallTimings.create(timeProvider, false, cidLogger);
        this.timings = create;
        IdMappingResolver createIdMappingResolver = createIdMappingResolver();
        SignalingProvider createSignalingProvider = createSignalingProvider();
        RecordManagerImpl createRecordManager = createRecordManager(createIdMappingResolver, idMappingWrapper, createSignalingProvider);
        this.recordManager = createRecordManager;
        Context context = conversationBuilder.context;
        boolean z4 = conversationBuilder.isJoined;
        OKCameraCapturer.Factory factory = conversationBuilder.cameraCapturerFactory;
        if (factory == null) {
            callApiServiceImpl = callApiServiceImpl2;
            factory = new DefaultCameraCapturerFactory(conversationBuilder.frameInterceptor, cidLogger);
        } else {
            callApiServiceImpl = callApiServiceImpl2;
        }
        CallApiServiceImpl callApiServiceImpl3 = callApiServiceImpl;
        CallModuleImpl callModuleImpl = new CallModuleImpl(context, createCallParams, z, z4, callParticipant, conversationIdProviderImpl, cidLogger, rTCLogConfiguration, factory, conversationBuilder.rotationProvider, animojiDataSupplierInterface, timeProvider, conversationBuilder.analyticsSender, preferencesHelper, conversationBuilder.screenCapturePermissionProvider, callFlags, callApiServiceImpl3, create, createRecordManager, this.pcapLabelProvider, conversationBuilder.ringingTimeout);
        Call call = callModuleImpl.getCall();
        this.call = call;
        Objects.requireNonNull(call);
        int i = 29;
        ApiStats apiStats = new ApiStats(new h6(call, i));
        call.addEventListener(conversationListenerProxy);
        ExecutionTimeInterceptor executionTimeInterceptor = conversationBuilder.executionTimeInterceptor;
        this.executionTimeInterceptor = executionTimeInterceptor;
        executionTimeInterceptor.setApiStats(apiStats);
        ApiModuleImpl apiModuleImpl = new ApiModuleImpl(conversationBuilder.api, conversationParticipant, conversationBuilder.okApiService, new h6(call, i), cidLogger, timeProvider, null);
        this.apiModule = apiModuleImpl;
        OkApiServiceInternal okApiServiceInternal = apiModuleImpl.getOkApiServiceInternal();
        this.apiService = okApiServiceInternal;
        callApiServiceImpl3.setApiServiceImpl(okApiServiceInternal);
        this.screenCaptureManager = new ScreenCaptureManagerImpl(call);
        this.cameraManager = new CameraManagerImpl(call, new gzs() { // from class: ru.ok.android.externcalls.sdk.d1
            @Override // xsna.gzs
            public final Object invoke() {
                Boolean lambda$new$3;
                lambda$new$3 = ConversationImpl.this.lambda$new$3();
                return lambda$new$3;
            }
        }, experiments.c());
        VideoRenderManagerImpl videoRenderManagerImpl = new VideoRenderManagerImpl(new yce(atomicReference, 10), call, new ConversationRenderers(), participantStore, experiments.c());
        this.videoRendererProvider = videoRenderManagerImpl;
        this.videoRenderManager = videoRenderManagerImpl;
        this.microphoneManager = new MicrophoneManagerImpl(call, new gzs() { // from class: ru.ok.android.externcalls.sdk.e1
            @Override // xsna.gzs
            public final Object invoke() {
                Boolean lambda$new$4;
                lambda$new$4 = ConversationImpl.this.lambda$new$4();
                return lambda$new$4;
            }
        });
        this.noiseSuppressionManager = new NoiseSuppressionManagerImpl(call);
        NetworkConnectionManagerImpl networkConnectionManagerImpl = new NetworkConnectionManagerImpl(call);
        this.networkConnectionManager = networkConnectionManagerImpl;
        this.debugManager = new DebugManagerImpl(call, cidLogger, callModuleImpl.getPeerVideoSettingsAdapter(), createSignalingProvider);
        ParticipantStatesManagerImpl createParticipantStatesManager = createParticipantStatesManager(participantStore, new ParticipantStateChanger(createSignalingProvider), multiEventListener);
        this.participantStatesManager = createParticipantStatesManager;
        this.waitingRoomParticipants = createWaitingRoomParticipants(idMappingWrapper, createIdMappingResolver, listenerImpl);
        this.stereoRoomManager = createStereoRoomManager(createSignalingProvider, createIdMappingResolver);
        IdsMapper<ParticipantId, CallParticipant.ParticipantId> idsMapper = conversationBuilder.internalIdsMapper;
        idsMapper = idsMapper == null ? new ExternalToInternalIdsMapper(okApiServiceInternal, cidLogger) : idsMapper;
        this.internalIdsMapper = idsMapper;
        this.internalIdsResolver = createInternalIdsResolver(participantStore, idMappingWrapper, idsMapper);
        this.externalIdsResolver = createExternalIdsResolver(participantStore, idMappingWrapper, conversationBuilder.externalIdsMapper);
        this.addParticipantsCommands = new AddParticipantsCommands(createSignalingProvider, call, idMappingWrapper, new yce(atomicReference, 10));
        WatchTogetherListenerManagerImpl watchTogetherListenerManagerImpl = new WatchTogetherListenerManagerImpl(participantStore);
        this.watchTogetherListenerManager = watchTogetherListenerManagerImpl;
        SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl = new SessionRoomListenerManagerImpl(participantStore);
        WatchTogetherPlayer createWatchTogetherPlayer = createWatchTogetherPlayer(watchTogetherListenerManagerImpl, createSignalingProvider);
        this.watchTogetherPlayer = createWatchTogetherPlayer;
        FeedbackListenerManagerImpl feedbackListenerManagerImpl = new FeedbackListenerManagerImpl(this, participantStore, createIdMappingResolver, idMappingWrapper);
        this.feedbackListenerManager = feedbackListenerManagerImpl;
        this.feedbackManager = createFeedbackManager(feedbackListenerManagerImpl, createSignalingProvider);
        AsrListenerManagerImpl asrListenerManagerImpl = new AsrListenerManagerImpl(participantStore);
        this.asrListenerManager = asrListenerManagerImpl;
        this.asrManager = createAsrManager(asrListenerManagerImpl, participantStore, createSignalingProvider);
        this.contactCallManager = new ContactCallManagerImpl(participantStore, conversationBuilder.answerAsContact);
        this.asrOnlineManager = createAsrOnlineManager(participantStore);
        this.chatStateListener = conversationBuilder.chatStateListener;
        this.conversationFeatureListeners = createConversationFeatureListeners();
        this.conversationFeatureManager = createFeatureManager(createSignalingProvider);
        this.sessionRoomManager = createSessionRoomManager(sessionRoomListenerManagerImpl, createParticipantStatesManager, createIdMappingResolver, createSignalingProvider);
        this.participantsUpdater = createParticipantsUpdater(createParticipantStatesManager);
        this.locale = conversationBuilder.locale;
        if (experiments.c()) {
            registerParticipantsUpdaterListeners();
        }
        this.sessionRoomWatchTogetherHandler = new SessionRoomWatchTogetherHandler(participantStore, createWatchTogetherPlayer);
        this.sessionRoomParticipantStatesHandler = createParticipantStatesHandler(createParticipantStatesManager);
        RemoteSettings createRemoteSettings = createRemoteSettings(conversationBuilder.remoteSettings);
        this.remoteSettings = createRemoteSettings;
        ConversationStats createConversationStats = createConversationStats(createRemoteSettings);
        this.conversationStats = createConversationStats;
        final AudioErrorStat audioErrorStat = createConversationStats.audioErrorStat;
        Objects.requireNonNull(audioErrorStat);
        SharedPeerConnectionFactory.AudioEventsListener audioEventsListener = new SharedPeerConnectionFactory.AudioEventsListener() { // from class: xsna.zrj
            @Override // ru.ok.android.webrtc.SharedPeerConnectionFactory.AudioEventsListener
            public final void onAudioError(AudioErrorEvent audioErrorEvent) {
                AudioErrorStat.this.report(audioErrorEvent);
            }
        };
        this.audioEventsListener = audioEventsListener;
        call.registerAudioEventsListener(audioEventsListener);
        this.urlSharingListenerManager = createUrlSharingListenerManager();
        this.urlSharingManager = createUrlSharingManager();
        ChatListenerManagerImpl createChatListenerManager = createChatListenerManager(participantStore);
        this.chatListenerManager = createChatListenerManager;
        this.chatManager = createChatManager(participantStore, createChatListenerManager);
        MediaMuteListenerManagerImpl createMediaMuteListenerManager = createMediaMuteListenerManager();
        this.mediaMuteListenerManager = createMediaMuteListenerManager;
        this.mediaMuteManager = createMediaMuteManager(createSignalingProvider, createMediaMuteListenerManager);
        this.displayLayoutSender = new DisplayLayoutSenderImpl(new iie(participantStore, 6), new izs() { // from class: ru.ok.android.externcalls.sdk.x0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                s3q0 lambda$new$5;
                lambda$new$5 = ConversationImpl.this.lambda$new$5((List) obj);
                return lambda$new$5;
            }
        });
        qkx qkxVar = new qkx(conversationBuilder.api.getDeviceIdProvider(), conversationBuilder.api.getAppKeyProvider());
        this.internalParamsProvider = qkxVar;
        this.conversationStart = new ConversationStart(okApiServiceInternal, conversationBuilder.startConversationDelegate, conversationIdProviderImpl, participantStore, conversationParticipant, cidLogger, qkxVar, experiments);
        this.audioSampleEnergyCalculator = new AnonymousClass1(handler);
        MediaConnectionManagerImpl mediaConnectionManagerImpl = new MediaConnectionManagerImpl(cidLogger, new gzs() { // from class: ru.ok.android.externcalls.sdk.y0
            @Override // xsna.gzs
            public final Object invoke() {
                return Boolean.valueOf(ConversationImpl.this.isDestroyed());
            }
        }, conversationBuilder.mediaConnectionSettings);
        this.mediaConnectionManager = mediaConnectionManagerImpl;
        networkConnectionManagerImpl.plusAssign(mediaConnectionManagerImpl);
        this.rateManager = new RateManagerImpl(cidLogger, new RateManagerConfigProviderImpl(createRemoteSettings, cidLogger), new sfg(call, 8), statMonitorImpl);
        final ServerTopologyRequestedStat serverTopologyRequestedStat = createConversationStats.serverTopologyRequestedStat;
        Objects.requireNonNull(serverTopologyRequestedStat);
        this.topologyUpgradeStatEventListener = new TopologyUpgradeStatEventListener() { // from class: xsna.asj
            @Override // ru.ok.android.webrtc.listeners.TopologyUpgradeStatEventListener
            public final void onTopologyUpgradeEvent(TopologyChangedEvent topologyChangedEvent) {
                ServerTopologyRequestedStat.this.onServerTopologyRequested(topologyChangedEvent);
            }
        };
        od7 od7Var = new od7(experiments.f0());
        String str2 = this.anonToken;
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{od7Var}[0];
        Objects.requireNonNull(obj);
        if (!hashSet.add(obj)) {
            throw new IllegalArgumentException(cqi.c(obj, "duplicate element: "));
        }
        this.callFinishHandler = new h39(okApiServiceInternal, cidLogger, conversationIdProviderImpl, str2, Collections.unmodifiableSet(hashSet));
        td7 td7Var = new td7(createRemoteSettings, cidLogger, "android.dump.bitrate", "BitrateDumpGatheringConfigProviderImpl");
        rd7 rd7Var = new rd7(td7Var, vd7Var, cidLogger);
        td7Var.getConfig().subscribe(new pd7(rd7Var), new qd7(rd7Var), new kz(rd7Var, 2));
        createConversationStats.callInitStat.onCallInitialized();
        this.mlFeaturesManager = createMLFeatureManager(conversationBuilder.context);
    }

    private void applyBitrateDumpGatheringConfig(one.video.calls.sdk.experiments.c cVar, ud7 ud7Var, Context context) {
        BitrateDumpGatheringConfig bitrateDumpGatheringConfig = (BitrateDumpGatheringConfig) ((sd7) ((vd7) ud7Var).b).get("bitrate_config_key", BitrateDumpGatheringConfig.class);
        gm70 y = cVar.y();
        AvailableMLFeatureInfo availableMLFeatureInfo = (AvailableMLFeatureInfo) this.mlFeaturesInfoDataSource.get(UcumUtils.UCUM_NANOSECONDS, AvailableMLFeatureInfo.class);
        boolean z = true;
        boolean z2 = availableMLFeatureInfo != null && availableMLFeatureInfo.getVersion().equals(NSFeatureDelegate.getFeatureKeyByVersion(y.a));
        c.a aVar = cVar.W;
        qcy<Object>[] qcyVarArr = one.video.calls.sdk.experiments.c.j0;
        PcapLabelConfig pcapLabelConfig = (PcapLabelConfig) aVar.a(qcyVarArr[47]);
        rs90 rs90Var = new rs90(pcapLabelConfig, y, cVar.o(), z2);
        this.pcapLabelProvider = rs90Var;
        PcapLabelConfig a = rs90Var.a();
        if ((bitrateDumpGatheringConfig == null || !bitrateDumpGatheringConfig.d()) && a == null) {
            z = false;
        }
        this.log.log(LOG_TAG, "BitrateDumpGatheringConfig=" + bitrateDumpGatheringConfig + ", initial pcapLabel=" + pcapLabelConfig + ", isActualNsModelAvailable=" + z2 + ", actual pcapLabel=" + a + ". Summary, is dump gathering enabled=" + z);
        Object bVar = z ? new ExperimentsInterface.a.b(context) : ExperimentsInterface.a.C2170a.a;
        c.a aVar2 = cVar.O;
        qcy<Object> qcyVar = qcyVarArr[39];
        aVar2.b(bVar);
    }

    private void assertInited() {
        if (!this.inited) {
            throw new IllegalStateException("Conversation not initialized");
        }
        if (isDestroyed()) {
            throw new IllegalStateException("Conversation already destroyed");
        }
    }

    private void assertPrepared() {
        if (!this.prepared) {
            throw new IllegalStateException("Conversation not ready");
        }
        if (isDestroyed()) {
            throw new IllegalStateException("Conversation already destroyed");
        }
    }

    private bpv chooseIceServersResolver() {
        return this.experiments.b0() == ExperimentsInterface.EmulatedIceCandidatesError.LOCAL ? new d370(12) : new qxm0();
    }

    @NonNull
    private ClientCapabilities configureSignalingCapabilities(ConversationParticipant conversationParticipant, @NonNull ClientCapabilities clientCapabilities) {
        ClientCapabilities capabilitiesForCurrentUser = getCapabilitiesForCurrentUser(clientCapabilities, this.callParams, this.animojiDataSupplier.enabled());
        conversationParticipant.setCapabilities(capabilitiesForCurrentUser);
        return capabilitiesForCurrentUser;
    }

    @NonNull
    private AsrManager createAsrManager(@NonNull AsrListenerManager asrListenerManager, @NonNull ParticipantStore participantStore, @NonNull SignalingProvider signalingProvider) {
        return new AsrManagerImpl(new AsrCommandsExecutorImpl(signalingProvider, participantStore), asrListenerManager);
    }

    @NonNull
    private AsrOnlineManagerImpl createAsrOnlineManager(@NonNull ParticipantStore participantStore) {
        return new AsrOnlineManagerImpl(new AsrOnlineCommandsExecutorImpl(new gzs() { // from class: ru.ok.android.externcalls.sdk.p0
            @Override // xsna.gzs
            public final Object invoke() {
                Call lambda$createAsrOnlineManager$7;
                lambda$createAsrOnlineManager$7 = ConversationImpl.this.lambda$createAsrOnlineManager$7();
                return lambda$createAsrOnlineManager$7;
            }
        }, createSignalingProvider()), new AsrOnlineListenerManagerImpl(participantStore), new gzs() { // from class: ru.ok.android.externcalls.sdk.q0
            @Override // xsna.gzs
            public final Object invoke() {
                Call lambda$createAsrOnlineManager$8;
                lambda$createAsrOnlineManager$8 = ConversationImpl.this.lambda$createAsrOnlineManager$8();
                return lambda$createAsrOnlineManager$8;
            }
        });
    }

    @NonNull
    private ChatListenerManagerImpl createChatListenerManager(ParticipantStore participantStore) {
        return new ChatListenerManagerImpl(participantStore);
    }

    @NonNull
    private ChatManagerImpl createChatManager(ParticipantStore participantStore, ChatListenerManagerImpl chatListenerManagerImpl) {
        return new ChatManagerImpl(new ChatCommandExecutorImpl(createSignalingProvider(), participantStore), chatListenerManagerImpl);
    }

    @NonNull
    private ConversationFeatureListenersImpl createConversationFeatureListeners() {
        return new ConversationFeatureListenersImpl();
    }

    @NonNull
    private ConversationStats createConversationStats(RemoteSettings remoteSettings) {
        Call call = this.call;
        Objects.requireNonNull(call);
        return new ConversationStats(new h6(call, 29), new one.video.calls.sdk.internal.stat.webrtc.config.a(remoteSettings, this.log, "android.webrtc.stats", "BitrateDumpGatheringConfigProviderImpl"), getCallType(), this.timeProvider, this.log, this.anonToken != null, this.callParams.getExperiments().Y());
    }

    @NonNull
    private ExternalIdsResolver createExternalIdsResolver(@NonNull ParticipantStore participantStore, @NonNull IdMappingWrapper idMappingWrapper, @Nullable IdsMapper<CallParticipant.ParticipantId, ParticipantId> idsMapper) {
        MultiEventListener multiEventListener = this.eventListener;
        Objects.requireNonNull(multiEventListener);
        com.vk.movika.sdk.base.hooks.k kVar = new com.vk.movika.sdk.base.hooks.k(multiEventListener, 18);
        ao aoVar = new ao(11);
        LocalIdMappings localIdMappings = this.localIdMappings;
        if (idsMapper == null) {
            idsMapper = new InternalToExternalIdsMapper(this.apiService, this.log);
        }
        return new ExternalIdsResolver(participantStore, idMappingWrapper, kVar, aoVar, localIdMappings, idsMapper);
    }

    @NonNull
    private clq createFastJoinPrepare() {
        return new clq(this.internalParamsProvider, this.cidProvider, this.internalIdsResolver, this.externalIdsResolver, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.f105me, this.experiments);
    }

    @NonNull
    private dmq createFastStartPrepare() {
        return new dmq(this.internalIdsResolver, this.externalIdsResolver, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.f105me, this.experiments);
    }

    @NonNull
    private ConversationFeatureManagerImpl createFeatureManager(@NonNull SignalingProvider signalingProvider) {
        return new ConversationFeatureManagerImpl(new ConversationFeatureCommandExecutorImpl(signalingProvider), this.conversationFeatureListeners);
    }

    @NonNull
    private FeedbackManager createFeedbackManager(@NonNull FeedbackListenerManager feedbackListenerManager, @NonNull SignalingProvider signalingProvider) {
        return new FeedbackManagerImpl(new FeedbackCommandsExecutorImpl(signalingProvider), feedbackListenerManager);
    }

    private IdMappingResolver createIdMappingResolver() {
        return new IdMappingResolver() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.5
            @Override // ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver
            public void resolveExternalsByInternalsIds(@NonNull List<CallParticipant.ParticipantId> list, @NonNull Runnable runnable, @NonNull Runnable runnable2) {
                ConversationImpl.this.resolveExternalsByInternalsIds(list, runnable, runnable2);
            }

            @Override // ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver
            public void withInternalId(@NonNull ParticipantId participantId, @NonNull Consumer<CallParticipant.ParticipantId> consumer, @Nullable Runnable runnable) {
                ConversationImpl.this.withInternalId(participantId, consumer, runnable);
            }
        };
    }

    @NonNull
    private InternalIdsResolver createInternalIdsResolver(@NonNull ParticipantStore participantStore, @NonNull IdMappingWrapper idMappingWrapper, @NonNull IdsMapper<ParticipantId, CallParticipant.ParticipantId> idsMapper) {
        return new InternalIdsResolver(participantStore, idMappingWrapper, new ir(11), this.localIdMappings, idsMapper);
    }

    @NonNull
    private p0y createJoinPrepare() {
        return new p0y(this.apiService, this.cidProvider, this.internalIdsResolver, this.externalIdsResolver, this.startCallApiParams, this.peerIdGenerator, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.f105me, this.experiments);
    }

    private MLFeaturesManager createMLFeatureManager(Context context) {
        DownloadService.Impl impl = new DownloadService.Impl(this.log);
        MLFeaturesInfoDataSource mLFeaturesInfoDataSource = this.mlFeaturesInfoDataSource;
        RTCLog rTCLog = this.log;
        RemoteSettings remoteSettings = this.remoteSettings;
        ConversationStats conversationStats = this.conversationStats;
        NoiseSuppressionManager noiseSuppressionManager = this.noiseSuppressionManager;
        ExperimentsInterface experimentsInterface = this.experiments;
        Call call = this.call;
        Objects.requireNonNull(call);
        xrj xrjVar = new xrj(call, 0);
        Call call2 = this.call;
        Objects.requireNonNull(call2);
        return new MLFeaturesManagerImpl(mLFeaturesInfoDataSource, impl, context, rTCLog, remoteSettings, conversationStats, noiseSuppressionManager, experimentsInterface, xrjVar, new m2g(call2, 9));
    }

    @NonNull
    private MediaMuteListenerManagerImpl createMediaMuteListenerManager() {
        return new MediaMuteListenerManagerImpl();
    }

    @NonNull
    private MediaMuteManagerImpl createMediaMuteManager(@NonNull SignalingProvider signalingProvider, MediaMuteListenerManager mediaMuteListenerManager) {
        gzs gzsVar = new gzs() { // from class: ru.ok.android.externcalls.sdk.j0
            @Override // xsna.gzs
            public final Object invoke() {
                Call lambda$createMediaMuteManager$6;
                lambda$createMediaMuteManager$6 = ConversationImpl.this.lambda$createMediaMuteManager$6();
                return lambda$createMediaMuteManager$6;
            }
        };
        izs izsVar = new izs() { // from class: ru.ok.android.externcalls.sdk.k0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                CallParticipant.ParticipantId callParticipantId;
                callParticipantId = ConversationImpl.this.getCallParticipantId((ParticipantId) obj);
                return callParticipantId;
            }
        };
        ParticipantStore participantStore = this.store;
        Objects.requireNonNull(participantStore);
        return new MediaMuteManagerImpl(new MediaMuteCommandExecutorImpl(signalingProvider, gzsVar, izsVar, new p5h(participantStore, 7)), mediaMuteListenerManager);
    }

    @NonNull
    private SessionRoomParticipantStatesHandler createParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        return new SessionRoomParticipantStatesHandler(participantStatesManagerImpl, new gzs() { // from class: ru.ok.android.externcalls.sdk.c0
            @Override // xsna.gzs
            public final Object invoke() {
                return Boolean.valueOf(ConversationImpl.this.isMeCreatorOrAdmin());
            }
        });
    }

    @NonNull
    private ParticipantStatesManagerImpl createParticipantStatesManager(@NonNull ParticipantStore participantStore, @NonNull ParticipantStateChanger participantStateChanger, @NonNull ConversationEventsListener conversationEventsListener) {
        return new ParticipantStatesManagerImpl(participantStore, participantStateChanger, conversationEventsListener);
    }

    @NonNull
    private ParticipantsUpdater createParticipantsUpdater(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        MultiEventListener multiEventListener = this.eventListener;
        ParticipantStore participantStore = this.store;
        IdMappingWrapper idMappingWrapper = this.idMappingWrapper;
        LocalIdMappings localIdMappings = this.localIdMappings;
        ParticipantsUpdater.MappingUpdater mappingUpdater = new ParticipantsUpdater.MappingUpdater() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.2
            @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MappingUpdater
            public void reportIfApplicable() {
                ConversationImpl.this.reportIfApplicable();
            }

            @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MappingUpdater
            public void triggerMapUpdate() {
                ConversationImpl.this.mainThreadHandler.removeCallbacks(ConversationImpl.this.callParticipantResolutionRunnable);
                ConversationImpl.this.mainThreadHandler.post(ConversationImpl.this.callParticipantResolutionRunnable);
            }
        };
        ConversationParticipant conversationParticipant = this.f105me;
        Objects.requireNonNull(conversationParticipant);
        return new ParticipantsUpdater(multiEventListener, participantStore, participantStatesManagerImpl, idMappingWrapper, localIdMappings, mappingUpdater, new com.vk.movika.sdk.base.flow.binding.c(conversationParticipant, 15));
    }

    @NonNull
    private RecordManagerImpl createRecordManager(@NonNull IdMappingResolver idMappingResolver, @NonNull IdMappingWrapper idMappingWrapper, @NonNull SignalingProvider signalingProvider) {
        return new RecordManagerImpl(this.log, this.store, idMappingResolver, idMappingWrapper, signalingProvider, this.eventListener, this.experiments.n());
    }

    @NonNull
    private SessionRoomsManagerImpl createSessionRoomManager(@NonNull SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, @NonNull ParticipantStatesManagerImpl participantStatesManagerImpl, @NonNull IdMappingResolver idMappingResolver, @NonNull SignalingProvider signalingProvider) {
        SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl = new SessionRoomCommandExecutorImpl(participantStatesManagerImpl, signalingProvider);
        SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl = new SessionRoomParticipantsDataProviderImpl(this.store, sessionRoomListenerManagerImpl, idMappingResolver, this.idMappingWrapper);
        return new SessionRoomsManagerImpl(sessionRoomListenerManagerImpl, sessionRoomCommandExecutorImpl, new SessionRoomAdminCommandExecutorImpl(signalingProvider, sessionRoomParticipantsDataProviderImpl), sessionRoomParticipantsDataProviderImpl);
    }

    private SignalingProvider createSignalingProvider() {
        return new SignalingProvider() { // from class: ru.ok.android.externcalls.sdk.l
            @Override // ru.ok.android.externcalls.sdk.signaling.SignalingProvider
            public final Signaling getSignaling() {
                Signaling lambda$createSignalingProvider$42;
                lambda$createSignalingProvider$42 = ConversationImpl.this.lambda$createSignalingProvider$42();
                return lambda$createSignalingProvider$42;
            }
        };
    }

    @NonNull
    private dsj0 createSimplePrepare(ConversationParams conversationParams) {
        return new dsj0(this.apiService, this.cidProvider, conversationParams, this.internalIdsResolver, this.externalIdsResolver, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.f105me, this.experiments);
    }

    @NonNull
    private StartCallApiParams createStartCallApiParams(ConversationBuilder conversationBuilder) {
        return new StartCallApiParams(conversationBuilder.domainId, conversationBuilder.payload, conversationBuilder.isWatchTogetherEnabledForAll, conversationBuilder.hasVideo, conversationBuilder.clientType, conversationBuilder.multipleDevicesEnabled, conversationBuilder.chatId, conversationBuilder.waitForAdminEnabled, this.clientCapabilities.getHexValueString());
    }

    @NonNull
    private StereoRoomManagerImpl createStereoRoomManager(@NonNull SignalingProvider signalingProvider, @NonNull IdMappingResolver idMappingResolver) {
        return new StereoRoomManagerImpl(this.log, this.store, idMappingResolver, new StereoRoomManagerImpl.GrantRolesRequest() { // from class: ru.ok.android.externcalls.sdk.z0
            @Override // ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.GrantRolesRequest
            public final void grantRoles(CallParticipant.ParticipantId participantId, boolean z, CallParticipant.Role[] roleArr, Runnable runnable, Runnable runnable2) {
                ConversationImpl.this.grantRoles(participantId, z, roleArr, runnable, runnable2);
            }
        }, new StereoRoomCommandExecutorImpl(signalingProvider, this.log), this.idMappingWrapper, new StereoRoomListenerManagerImpl(), this.timeProvider);
    }

    @NonNull
    private UrlSharingListenerManagerImpl createUrlSharingListenerManager() {
        return new UrlSharingListenerManagerImpl(createIdMappingResolver(), this.idMappingWrapper, this.log);
    }

    @NonNull
    private UrlSharingManagerImpl createUrlSharingManager() {
        return new UrlSharingManagerImpl(new UrlSharingCommandsExecutorImpl(createSignalingProvider()), this.urlSharingListenerManager);
    }

    @NonNull
    private WaitingRoomParticipants createWaitingRoomParticipants(@NonNull IdMappingWrapper idMappingWrapper, @NonNull IdMappingResolver idMappingResolver, @NonNull final ListenerImpl listenerImpl) {
        return new WaitingRoomParticipants(new WaitingRoomParticipants.Listener() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.3
            @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
            public void onMeInWaitingRoomChanged(boolean z) {
                listenerImpl.onMeInWaitingRoomChanged(z);
            }

            @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
            public void onWaitingRoomParticipantsChanged(@NonNull WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
                listenerImpl.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }, idMappingWrapper, idMappingResolver, this.log);
    }

    @NonNull
    private WatchTogetherPlayer createWatchTogetherPlayer(@NonNull WatchTogetherListenerManager watchTogetherListenerManager, @NonNull SignalingProvider signalingProvider) {
        Call call = this.call;
        Objects.requireNonNull(call);
        return new WatchTogetherPlayerImpl(new WatchTogetherCommandExecutorImpl(signalingProvider, new q5f(call, 9)), watchTogetherListenerManager);
    }

    private <T> void executeOnBg(@NonNull gzs<T> gzsVar, @NonNull Consumer<T> consumer, @Nullable Runnable runnable) {
        this.disposable.b(CallsThreadUtilsKt.executeOnIoThread(gzsVar, consumer, runnable));
    }

    private <P extends ActionParams, R extends ActionResult> io.reactivex.rxjava3.core.x<R> executeWithState(Conversation.State state, Conversation.State state2, Action<P, R> action, P p) {
        AtomicReference<Conversation.State> atomicReference = this.state;
        while (!atomicReference.compareAndSet(state, state2)) {
            if (atomicReference.get() != state) {
                return io.reactivex.rxjava3.core.x.i(new IllegalStateException("State " + this.state.get() + " doesn't match wanted state " + state));
            }
        }
        return action.execute(p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public ConversationEventsListener.CallEndInfo getCallEndInfo(@Nullable HangupReason hangupReason, @Nullable Object obj) {
        HashSet hashSet;
        String str;
        if (obj instanceof HangupInfo) {
            HangupInfo hangupInfo = (HangupInfo) obj;
            hashSet = new HashSet();
            if (hangupInfo.shouldSuggestReconnect()) {
                hashSet.add(HangupHint.SHOULD_RECONNECT);
            }
            str = hangupInfo.explanationHtml;
        } else {
            hashSet = null;
            str = null;
        }
        return new ConversationEventsListener.CallEndInfo(hangupReason, hashSet, str);
    }

    private CallParticipant getCallParticipantByExternalId(@NonNull ParticipantId participantId) {
        ConversationParticipant byExternalWithAnyDevice = this.store.getByExternalWithAnyDevice(participantId);
        if (byExternalWithAnyDevice != null) {
            return byExternalWithAnyDevice.getCallParticipant();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public CallParticipant.ParticipantId getCallParticipantId(@Nullable ParticipantId participantId) {
        ConversationParticipant byExternal;
        CallParticipant callParticipant;
        if (participantId == null || (byExternal = this.store.getByExternal(participantId)) == null || (callParticipant = byExternal.getCallParticipant()) == null) {
            return null;
        }
        return callParticipant.getParticipantId();
    }

    @NonNull
    public static ClientCapabilities getCapabilitiesForCurrentUser(@NonNull ClientCapabilities clientCapabilities, @NonNull CallParams callParams, boolean z) {
        ClientCapabilities clientCapabilities2 = clientCapabilities.set(ClientCapabilities.Capability.VIDEO_TRACKS, callParams.isVideoTracksCountEnabled());
        ClientCapabilities.Capability capability = ClientCapabilities.Capability.VMOJI;
        return clientCapabilities2.set(capability, clientCapabilities.has(capability) && z);
    }

    @Nullable
    @Deprecated
    private ConversationParticipant getParticipantByExternalId(@NonNull String str) {
        return this.store.getByExternalWithAnyDevice(ParticipantId.authorized(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCallFinished(@Nullable CallTerminatingException callTerminatingException) {
        reportCallFinished(callTerminatingException);
        final h39 h39Var = this.callFinishHandler;
        if (h39Var.f.compareAndSet(false, true)) {
            for (far farVar : h39Var.e) {
                io.reactivex.rxjava3.core.k<ear> shouldSend = farVar.shouldSend();
                io.reactivex.rxjava3.functions.l lVar = new io.reactivex.rxjava3.functions.l() { // from class: xsna.i39
                    @Override // io.reactivex.rxjava3.functions.l
                    public final Object apply(Object obj) {
                        ear earVar = (ear) obj;
                        h39 h39Var2 = h39.this;
                        io.reactivex.rxjava3.core.x<mst> requestUploadUrl = h39Var2.a.requestUploadUrl(h39Var2.c.getConversationId(), earVar.b, h39Var2.d);
                        m39 m39Var = new m39(earVar);
                        requestUploadUrl.getClass();
                        return new io.reactivex.rxjava3.internal.operators.single.r(requestUploadUrl, m39Var).r(60L, TimeUnit.SECONDS).h(new n39(earVar));
                    }
                };
                shouldSend.getClass();
                new io.reactivex.rxjava3.internal.operators.maybe.n(shouldSend, lVar).n(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new j39(h39Var, farVar), new k39(h39Var, farVar), new g39(0, h39Var, farVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* renamed from: handleCallStartException, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$runStartConversation$18(Throwable th, Consumer<Throwable> consumer) {
        ApiInvocationException apiErrorParticipantLimitExceeded;
        if (th instanceof FastStartException) {
            consumer.accept(new CallTerminatingException.Builder(Domain.EXTERNAL, th).setSubDomain(SubDomain.START).build());
            return;
        }
        if (th instanceof FastJoinException) {
            consumer.accept(new CallTerminatingException.Builder(Domain.EXTERNAL, th).setSubDomain(SubDomain.JOIN).build());
            return;
        }
        if (th instanceof IOException) {
            consumer.accept(new CallTerminatingException.Builder(Domain.NETWORK, th).build());
            return;
        }
        if (!(th instanceof ApiInvocationException)) {
            consumer.accept(new CallTerminatingException.Builder(Domain.SERVER, th).setSubDomain(SubDomain.API).build());
            return;
        }
        ApiInvocationException apiInvocationException = (ApiInvocationException) th;
        int errorCode = apiInvocationException.getErrorCode();
        String errorMessage = apiInvocationException.getErrorMessage();
        if (errorCode == 1104 || errorCode == 1114) {
            handleExternalApiException(apiInvocationException, consumer);
            return;
        }
        if (errorCode == 2) {
            consumer.accept(new CallTerminatingException.Builder(Domain.SERVER, new ServiceUnavailableException()).setSubDomain(SubDomain.API).setCode(errorCode).build());
            return;
        }
        if (errorCode != 4 || errorMessage == null) {
            consumer.accept(new CallTerminatingException.Builder(Domain.SERVER, th).setSubDomain(SubDomain.API).setCode(errorCode).build());
            return;
        }
        int i = ApiInvocationError.b;
        if (drm0.D(errorMessage, "error.friend.restricted-access", false)) {
            apiErrorParticipantLimitExceeded = new ApiErrorUserPrivate(77990, apiInvocationException);
        } else if (drm0.D(errorMessage, "auth.banned", false)) {
            apiErrorParticipantLimitExceeded = new ApiErrorUserBanned(77993, apiInvocationException);
        } else if (drm0.D(errorMessage, "not.found.User", false)) {
            apiErrorParticipantLimitExceeded = new ApiErrorUserBlocked(77992, apiInvocationException);
        } else {
            if (!drm0.D(errorMessage, "error.send-message.too-many-users", false)) {
                if (drm0.D(errorMessage, "error.participants.limit.exceeded", false)) {
                    apiErrorParticipantLimitExceeded = new ApiErrorParticipantLimitExceeded(77994, apiInvocationException);
                }
                if (apiInvocationException.getErrorCode() == 77993) {
                    consumer.accept(new CallTerminatingException.Builder(Domain.SERVER, apiInvocationException).setSubDomain(SubDomain.API).setCode(apiInvocationException.getErrorCode()).build());
                    return;
                } else {
                    this.call.callEndInfoHolder.setReason(ConversationEndReason.Banned.INSTANCE);
                    consumer.accept(apiInvocationException);
                    return;
                }
            }
            apiErrorParticipantLimitExceeded = new ApiErrorTooManyUsers(77991, apiInvocationException);
        }
        apiInvocationException = apiErrorParticipantLimitExceeded;
        if (apiInvocationException.getErrorCode() == 77993) {
        }
    }

    private void handleExternalApiException(ApiInvocationException apiInvocationException, Consumer<Throwable> consumer) {
        ExternErrorParser.ErrorDescription parse = new ExternErrorParser().parse(apiInvocationException);
        String errorCode = parse.getErrorCode();
        ExternApiException externApiException = new ExternApiException(apiInvocationException, apiInvocationException.getErrorCode(), errorCode);
        if (errorCode == null || !errorCode.toLowerCase().startsWith("obsolete_client")) {
            consumer.accept(new CallTerminatingException.Builder(Domain.EXTERNAL, externApiException, parse.getErrorCode()).setSubDomain(SubDomain.API).build());
        } else {
            this.call.callEndInfoHolder.setReason(new ConversationEndReason.ObsoleteClient(null, errorCode));
            consumer.accept(externApiException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSignalingError(Signaling.ConnectFailureListener.FailureReason failureReason, final Signaling.Transport transport) {
        String str;
        HangupReason hangupReason;
        Domain domain;
        final String str2;
        final HangupReason hangupReason2;
        final Domain domain2;
        if (failureReason instanceof Signaling.ConnectFailureListener.FailureReason.ReconnectTimeout) {
            hangupReason = HangupReason.TIMEOUT;
            domain = Domain.INTERNAL;
            str = "signaling timeout";
        } else {
            if (failureReason instanceof Signaling.ConnectFailureListener.FailureReason.BadEndpoint) {
                HangupReason hangupReason3 = HangupReason.FAILED;
                Domain domain3 = Domain.INTERNAL;
                str2 = ((Signaling.ConnectFailureListener.FailureReason.BadEndpoint) failureReason).message;
                hangupReason2 = hangupReason3;
                domain2 = domain3;
                this.mainThreadHandler.post(new Runnable() { // from class: ru.ok.android.externcalls.sdk.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConversationImpl.this.lambda$handleSignalingError$23(domain2, str2, transport, hangupReason2);
                    }
                });
            }
            str = "Unknown ErrorType " + failureReason;
            hangupReason = HangupReason.FAILED;
            domain = Domain.UNKNOWN;
        }
        hangupReason2 = hangupReason;
        domain2 = domain;
        str2 = str;
        this.mainThreadHandler.post(new Runnable() { // from class: ru.ok.android.externcalls.sdk.h0
            @Override // java.lang.Runnable
            public final void run() {
                ConversationImpl.this.lambda$handleSignalingError$23(domain2, str2, transport, hangupReason2);
            }
        });
    }

    private boolean hasNoInternalId(y1d0.b bVar, Boolean bool, Consumer<Throwable> consumer) {
        ArrayList arrayList = new ArrayList(bVar.b);
        if (!arrayList.isEmpty()) {
            this.eventListener.onCallStartResolutionFailed(arrayList);
        }
        if (!bool.booleanValue()) {
            boolean z = !arrayList.isEmpty();
            Iterator<ConversationParticipant> it = this.store.iterator();
            int i = 0;
            while (it.hasNext()) {
                ConversationParticipant next = it.next();
                boolean equals = Objects.equals(next.getExternalId(), this.f105me.getExternalId());
                boolean z2 = next.getInternalId() != null;
                z &= !z2 || equals;
                i += (!z2 || equals) ? 0 : 1;
            }
            if (z) {
                consumer.accept(wrapInternalError(new CallFailedException("no call targets left")));
                return true;
            }
            if (i == 1) {
                Iterator<ConversationParticipant> it2 = this.store.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ConversationParticipant next2 = it2.next();
                    if (next2.getInternalId() != null && !Objects.equals(next2.getExternalId(), this.f105me.getExternalId())) {
                        this.initialOpponent = next2;
                        break;
                    }
                }
            }
        }
        return false;
    }

    private boolean isWebTransportEnabled() {
        return this.callParams.getExperiments().u() && WTSignaling.isAvailable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addParticipant$28(Consumer consumer, JSONObject jSONObject) throws JSONException {
        if (consumer != null) {
            consumer.accept(jSONObject.optString("error", ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$29(Boolean bool, boolean z, final Consumer consumer, Collection collection) {
        this.call.addParticipant((CallParticipant.ParticipantId) collection.iterator().next(), bool, Boolean.valueOf(z), null, new Signaling.Listener() { // from class: ru.ok.android.externcalls.sdk.u
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                ConversationImpl.lambda$addParticipant$28(Consumer.this, jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addParticipant$30(Consumer consumer, JSONObject jSONObject) throws JSONException {
        if (consumer != null) {
            consumer.accept(jSONObject.optString("error", ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$31(boolean z, final Consumer consumer, GetOkIdByExternalId.Response response) throws Throwable {
        this.call.addParticipant(new CallParticipant.ParticipantId(response.getOkId(), CallParticipant.ParticipantId.Type.USER, 0), Boolean.valueOf(z), Boolean.FALSE, null, new Signaling.Listener() { // from class: ru.ok.android.externcalls.sdk.w
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                ConversationImpl.lambda$addParticipant$30(Consumer.this, jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addParticipant$32(Throwable th) throws Throwable {
        this.log.reportException(LOG_TAG, "failed to add participant", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Call lambda$createAsrOnlineManager$7() {
        return this.call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Call lambda$createAsrOnlineManager$8() {
        return this.call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Call lambda$createMediaMuteManager$6() {
        return this.call;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Signaling lambda$createSignalingProvider$42() {
        return this.call.getSignaling();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleSignalingError$23(Domain domain, String str, Signaling.Transport transport, HangupReason hangupReason) {
        if (this.listener.listener != null) {
            this.call.callFinishReason = new CallTerminatingException.Builder(domain, str).setSubDomain(UtilsKt.subDomain(transport.type())).build();
            hangup(new HangupParameters.Builder().setReason(hangupReason).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(String str, boolean z) {
        this.eventListener.onParticipantHoldStateChanged(new iav(str, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ RTCLog lambda$new$1() {
        return this.log;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ RTCLog lambda$new$2() {
        return this.log;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$3() {
        return Boolean.valueOf(this.prepared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$4() {
        return Boolean.valueOf(this.prepared);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ s3q0 lambda$new$5(List list) {
        this.call.updateDisplayLayout(list);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performConfroomJoin$13(ConversationParams conversationParams, Consumer consumer, Consumer consumer2, JoinConversation.Response response) throws Throwable {
        this.forceRelayPolicy |= response.getP2pForbidden();
        performConnect(response.getEndpoint(), null, response.getWtEndpoint(), null, conversationParams, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performConnect$20(String str) {
        this.recordManager.onRecordError(new CallRecordListener.RecordErrorInfo(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$performConnect$21(boolean z) {
        return Boolean.valueOf(this.experiments.Z() || z || this.conversationStart.isFastStartEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performConnect$22(Consumer consumer, Call call) {
        this.conversationStats.connectedToSignalingStat.onConnectedToSignaling();
        this.isConcurrent = call.isConcurrent();
        this.state.getAndSet(Conversation.State.Connected);
        if (consumer != null) {
            consumer.accept(this);
        }
        this.mlFeaturesManager.start();
        call.setConnectionListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$prepare$9(boolean z, Consumer consumer, Consumer consumer2, y1d0.b bVar) throws Throwable {
        if (this.conversationStart.isFastStartEnabled() || !hasNoInternalId(bVar, Boolean.valueOf(z), consumer)) {
            ConversationParams conversationParams = bVar.a;
            if (conversationParams == null && !this.isCaller) {
                consumer.accept(wrapInternalError(new NullPointerException("Conversation parameters object MUST not be null for a not calling participant")));
                return;
            }
            if (this.isCaller) {
                runStartConversation(conversationParams, z, consumer2, consumer);
            } else if (this.expectedChat) {
                performConfroomJoin(conversationParams, consumer2, consumer);
            } else {
                performConnect(conversationParams.endpoint, conversationParams.wsIps, conversationParams.wtEndpoint, conversationParams.wtIps, conversationParams, consumer2, consumer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$prepareJoinByLink$11(Consumer consumer, Consumer consumer2, y1d0.b bVar) throws Throwable {
        ConversationParams conversationParams = bVar.a;
        if (conversationParams == null) {
            consumer.accept(wrapInternalError(new NullPointerException("Conversation parameters object MUST not be null")));
            return;
        }
        this.forceRelayPolicy |= conversationParams.isP2PForbidden;
        performConnect(conversationParams.endpoint, conversationParams.wsIps, conversationParams.wtEndpoint, conversationParams.wtIps, conversationParams, consumer2, consumer);
        this.call.joinLink = this.initialJoinLink;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$promoteParticipant$34(boolean z, CallParticipant.ParticipantId participantId) {
        this.call.promoteParticipant(participantId, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryChatHistory$39(Conversation.ChatHistoryCallback chatHistoryCallback, JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray("messages");
        if (optJSONArray == null) {
            return;
        }
        int length = optJSONArray.length();
        ChatHistoryEntry[] chatHistoryEntryArr = new ChatHistoryEntry[length];
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                CallParticipant.ParticipantId extractParticipantIdFromAny = SignalingProtocol.extractParticipantIdFromAny(optJSONObject);
                ConversationParticipant byInternal = this.store.getByInternal(extractParticipantIdFromAny);
                if (byInternal == null) {
                    byInternal = ConversationParticipant.fromInternal(extractParticipantIdFromAny, this.idMappingWrapper);
                }
                chatHistoryEntryArr[i] = new ChatHistoryEntry(optJSONObject.optString("message", ""), optJSONObject.optBoolean(SignalingProtocol.KEY_CHAT_DIRECT, false), byInternal);
            }
        }
        chatHistoryCallback.onResponse(chatHistoryEntryArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshParams$15(Runnable runnable, ConversationParams conversationParams) throws Throwable {
        this.conversationParams = conversationParams;
        this.prepared = true;
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeParticipant$33(boolean z, CallParticipant.ParticipantId participantId) {
        this.call.removeParticipant(participantId, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestHoldStateChange$26(boolean z, hav havVar, Void r3) {
        this.state.set(z ? Conversation.State.HeldByMe : Conversation.State.Connected);
        this.isHoldStateProcessingActive.set(false);
        havVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$requestHoldStateChange$27(hav havVar, gav gavVar) {
        this.isHoldStateProcessingActive.set(false);
        new HoldException.SignalingCommandExecution(gavVar.a);
        havVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveExternalsByInternalsIds$40(Runnable runnable, Throwable th) throws Throwable {
        if (runnable != null) {
            runnable.run();
        }
        this.log.reportException(LOG_TAG, "failed to get mapping", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runStartConversation$17(Consumer consumer, ConversationParams conversationParams, Consumer consumer2, ConversationStart.Result result) throws Throwable {
        String str;
        CallInfo callInfo = result.getCallInfo();
        this.callInfo = callInfo;
        boolean z = true;
        this.wantsApiHangup = true;
        if (!callInfo.isConcurrent && ((str = callInfo.id) == null || str.equals(this.cidProvider.getConversationId()))) {
            z = false;
        }
        this.isConcurrentByApi = z;
        this.forceRelayPolicy |= callInfo.isP2PForbidden;
        String str2 = callInfo.id;
        if (str2 != null) {
            CidExtKt.update(this.cidProvider, str2);
        }
        String str3 = callInfo.endpoint;
        String str4 = callInfo.wtEndpoint;
        if (str3 == null && (!isWebTransportEnabled() || str4 == null)) {
            consumer.accept(wrapInternalError(new IllegalStateException("couldn't create call endpoint is null")));
            return;
        }
        List<String> list = callInfo.wsIps;
        List<String> list2 = callInfo.wtIps;
        if (conversationParams == null) {
            conversationParams = callInfo.toParams();
        }
        performConnect(str3, list, str4, list2, conversationParams, consumer2, consumer);
        this.call.joinLink = callInfo.joinLink;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCallOptionEnabled$24(boolean z, Call.Option option, Consumer consumer, JSONObject jSONObject) throws JSONException {
        if (z) {
            this.call.addOption(option);
        } else {
            this.call.removeOption(option);
        }
        if (consumer != null) {
            consumer.accept(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setCallOptionEnabled$25(Consumer consumer, JSONObject jSONObject) throws JSONException {
        if (consumer != null) {
            consumer.accept(jSONObject.optString("error"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setMuteState$41(Signaling signaling, boolean z, CallParticipant.ParticipantId participantId) {
        signaling.send(SignalingProtocol.createSwitchMicro(participantId, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$withInternalId$35(ParticipantId participantId, MappingContext mappingContext) {
        return this.internalIdsMapper.map(Collections.singleton(participantId), mappingContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$withInternalId$36(ParticipantId participantId, Consumer consumer, Map map) {
        CallParticipant.ParticipantId participantId2 = (CallParticipant.ParticipantId) map.get(participantId);
        if (participantId2 != null) {
            consumer.accept(participantId2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$withInternalIds$37(ArrayList arrayList, MappingContext mappingContext) {
        return this.internalIdsMapper.map(arrayList, mappingContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$withInternalIds$38(Consumer consumer, ArrayList arrayList, Map map) {
        if (consumer != null) {
            arrayList.addAll(map.values());
            consumer.accept(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wrapExternalErrorConsumer$19(Consumer consumer, Throwable th) {
        Throwable th2;
        CallTerminatingException wrapInternalError;
        if (th instanceof CallTerminatingException) {
            wrapInternalError = (CallTerminatingException) th;
            th2 = wrapInternalError.getCause();
            if (th2 == null) {
                th2 = new IllegalStateException(wrapInternalError.asString());
            }
        } else {
            th2 = th;
            wrapInternalError = this.call.callEndInfoHolder.getReason() == ConversationEndReason.Unknown.INSTANCE ? wrapInternalError(th) : null;
        }
        handleCallFinished(wrapInternalError);
        consumer.accept(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSignalingRefresh() {
        Signaling.Transport transport;
        ConversationParams conversationParams;
        if (this.call.isDestroyed() || (transport = this.signalingTransport) == null || (conversationParams = this.conversationParams) == null) {
            return;
        }
        transport.restart(conversationParams.token, Long.valueOf(this.f105me.getInternalId().id));
    }

    private void performConfroomJoin(@NonNull final ConversationParams conversationParams, final Consumer<Conversation> consumer, final Consumer<Throwable> consumer2) {
        this.disposable.b(this.apiService.joinToConversation(this.cidProvider.getConversationId(), this.peerIdGenerator.generatePeerId(), this.startCallApiParams).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.u0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$performConfroomJoin$13(conversationParams, consumer, consumer2, (JoinConversation.Response) obj);
            }
        }, new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.v0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$performConfroomJoin$14(consumer2, (Throwable) obj);
            }
        }));
    }

    private void performConnect(String str, List<String> list, String str2, List<String> list2, ConversationParams conversationParams, final Consumer<Conversation> consumer, Consumer<Throwable> consumer2) {
        String str3;
        String str4;
        String str5;
        i5f i5fVar;
        String str6;
        boolean z;
        if (this.experiments.P()) {
            str3 = "";
            str4 = "";
        } else {
            str3 = str;
            str4 = str2;
        }
        this.timings.trace("conv.api.done");
        synchronized (this.stateTransitionLock) {
            try {
                if (isDestroyed()) {
                    return;
                }
                if (conversationParams == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("No conversation parameters in performConnect()");
                    this.log.reportException(LOG_TAG, "An attempt to connect without conversation parameters", illegalStateException);
                    consumer2.accept(wrapInternalError(illegalStateException));
                    return;
                }
                if (this.startCallApiParams.isMultipleDevicesEnabled()) {
                    this.f105me.setDeviceIndex(conversationParams.deviceIndex, this.localIdMappings);
                    this.store.updateMe(this.f105me);
                }
                this.conversationParams = conversationParams;
                AtomicReference<Conversation.State> atomicReference = this.state;
                Conversation.State state = Conversation.State.Preparing;
                Conversation.State state2 = Conversation.State.Starting;
                while (!atomicReference.compareAndSet(state, state2)) {
                    String str7 = str4;
                    if (atomicReference.get() != state) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Wrong state within performConnect(): " + this.state.get() + " expected state is " + Conversation.State.Preparing);
                        this.log.reportException(LOG_TAG, "An attempt to connect while conversation not in preparing state", illegalStateException2);
                        consumer2.accept(illegalStateException2);
                        return;
                    }
                    str4 = str7;
                }
                this.conversationStats.startedStat.onConversationStarted();
                CallParticipant callParticipant = this.f105me.getCallParticipant();
                callParticipant.updateId(this.f105me.getInternalId());
                if (this.isCaller || this.expectedChat) {
                    callParticipant.setCallAccepted();
                }
                ConversationParticipant conversationParticipant = this.initialOpponent;
                if (conversationParticipant != null && conversationParticipant.getInternalId() != null) {
                    this.call.updateParticipantInfo(this.initialOpponent.getInternalId());
                }
                if (this.isConcurrentByApi) {
                    this.call.setConcurrent(true);
                }
                this.listenerProxy.unlock();
                this.call.setCustomDataListener(this.listener);
                subscribeCallListeners();
                setupSessionRoomWatchTogetherHandler(this.call);
                setupSessionRoomHandHandler(this.call);
                this.call.setRecordErrorConsumer(new Consumer() { // from class: ru.ok.android.externcalls.sdk.n
                    @Override // ru.ok.android.webrtc.utils.Consumer
                    public final void accept(Object obj) {
                        ConversationImpl.this.lambda$performConnect$20((String) obj);
                    }
                });
                String valueOf = this.f105me.getInternalId() != null ? String.valueOf(this.f105me.getInternalId().id) : null;
                Signaling.ConnectFailureListener connectFailureListener = new Signaling.ConnectFailureListener() { // from class: ru.ok.android.externcalls.sdk.o
                    @Override // ru.ok.android.webrtc.signaling.api.Signaling.ConnectFailureListener
                    public final void onConnectFailed(Signaling.ConnectFailureListener.FailureReason failureReason, Signaling.Transport transport) {
                        ConversationImpl.this.handleSignalingError(failureReason, transport);
                    }
                };
                final boolean a = this.experiments.a();
                if (a) {
                    str5 = conversationParams.token + BundleUtil.UNDERLINE_TAG;
                } else {
                    str5 = conversationParams.token;
                }
                EndpointParameters.Builder protocolVersion = new EndpointParameters.Builder().setConversationId(this.cidProvider.getConversationId()).setToken(str5).setUserId(valueOf).setDeviceIdx(conversationParams.deviceIndex).setAppVersion(this.version).setPeerid(null).setClientType(conversationParams.clientType).setCapabilities(this.clientCapabilities.getHexValueString()).setIspAsNo(conversationParams.ispAsNo).setIspAsOrg(conversationParams.ispAsOrg).setLocCc(conversationParams.locCc).setLocReg(conversationParams.locReg).setLocale(this.locale).setProtocolVersion(this.startCallApiParams.isMultipleDevicesEnabled() ? 6 : 5);
                String str8 = this.isCaller ? "caller" : this.expectedChat ? "join_call" : "incoming";
                try {
                    if (this.experiments.D()) {
                        PeerIdGenerator peerIdGenerator = this.peerIdGenerator;
                        Objects.requireNonNull(peerIdGenerator);
                        i5fVar = new i5f(peerIdGenerator, 11);
                    } else {
                        i5fVar = null;
                    }
                    if (isWebTransportEnabled()) {
                        this.log.log(LOG_TAG, "WebTransport is enabled and available, use fallback aware signaling transport adapter");
                        CallParams callParams = this.callParams;
                        str6 = str8;
                        this.signalingTransport = new SignalingTransportAdapter.Builder(new cvh(new SignalingTransportBuilder(protocolVersion, str4, list2, str3, list, callParams, connectFailureListener, this.executorService, this.conversationStats, new gzs() { // from class: ru.ok.android.externcalls.sdk.p
                            @Override // xsna.gzs
                            public final Object invoke() {
                                Boolean lambda$performConnect$21;
                                lambda$performConnect$21 = ConversationImpl.this.lambda$performConnect$21(a);
                                return lambda$performConnect$21;
                            }
                        }, this.timeProvider, callParams.getExperiments().U(), this.logConfiguration, i5fVar, this.callParams.getExperiments().N(), null, this.log), 1)).build();
                    } else {
                        str6 = str8;
                        i5f i5fVar2 = i5fVar;
                        ru.ok.android.webrtc.signaling.api.SignalingTransportBuilder<WSSignaling.Builder> endpointParameters = new WSSignaling.Builder().setTimeoutMS(this.callParams.getTimeouts().getSignalingMaxRetryTimeout()).setConnectFailureListener(connectFailureListener).setSignalingStat((SignalingStat) this.conversationStats.wsSignalingStat).setExecutor(this.executorService).setLog(this.log).setTimeProvider(this.timeProvider).setLogConfiguration(this.logConfiguration).setServerPingTimeoutMs(this.callParams.getTimeouts().getSignalingPingTimeout()).setFastRecoverEnabled(this.callParams.isFastRecoverEnabled()).setEndpointParameters(protocolVersion.setEndpointBaseUrl(str3).setEndpointIPs(list).build());
                        if (!this.experiments.Z() && !a && !this.conversationStart.isFastStartEnabled()) {
                            z = false;
                            this.signalingTransport = endpointParameters.setIsReplaceParametersInEndpointEnabled(z).setIsSummaryStatsEnabled(this.callParams.getExperiments().Y()).setIsSignalingLogThrottlingEnabled(this.callParams.getExperiments().K()).setUseOfIPEnabled(this.callParams.getExperiments().p()).setSNIEnabled(this.callParams.getExperiments().T()).setPeerIdGenerator((gzs<Long>) i5fVar2).setSSLProvider(null).setTimeouts(this.callParams.getExperiments().N()).build();
                        }
                        z = true;
                        this.signalingTransport = endpointParameters.setIsReplaceParametersInEndpointEnabled(z).setIsSummaryStatsEnabled(this.callParams.getExperiments().Y()).setIsSignalingLogThrottlingEnabled(this.callParams.getExperiments().K()).setUseOfIPEnabled(this.callParams.getExperiments().p()).setSNIEnabled(this.callParams.getExperiments().T()).setPeerIdGenerator((gzs<Long>) i5fVar2).setSSLProvider(null).setTimeouts(this.callParams.getExperiments().N()).build();
                    }
                    Call.OnConnectedListener onConnectedListener = new Call.OnConnectedListener() { // from class: ru.ok.android.externcalls.sdk.q
                        @Override // ru.ok.android.webrtc.Call.OnConnectedListener
                        public final void onConnected(Call call) {
                            ConversationImpl.this.lambda$performConnect$22(consumer, call);
                        }
                    };
                    this.call.setPeerConnectionEventListener(new Call.PeerConnectionEventListener() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.4
                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onIceCandidateAddFailed(IceCandidateAddFailedEvent iceCandidateAddFailedEvent) {
                            ConversationImpl.this.conversationStats.uceCandidateAddFailedStat.report(iceCandidateAddFailedEvent);
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onIceCandidateGatheringFailed(IceCandidateGatheringFailedEvent iceCandidateGatheringFailedEvent) {
                            ConversationImpl.this.conversationStats.iceCandidateGatheringFailedStat.report(iceCandidateGatheringFailedEvent);
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onIceRestart() {
                            ConversationImpl.this.conversationStats.iceRestartStat.onIceRestart();
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onLocalCandidateCreated(String str9) {
                            ConversationImpl.this.conversationStats.webrtcStats.onIceCandidateGenerated(str9);
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onLocalSdpCreated(SessionDescription.Type type) {
                            if (type == SessionDescription.Type.OFFER) {
                                ConversationImpl.this.conversationStats.webrtcStats.onOfferGenerated();
                            } else if (type == SessionDescription.Type.ANSWER || type == SessionDescription.Type.PRANSWER) {
                                ConversationImpl.this.conversationStats.webrtcStats.onAnswerGenerated();
                            }
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onNegotiationError(NegotiationError negotiationError) {
                            ConversationImpl.this.conversationStats.negotiationErrorStat.onError(negotiationError);
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onPeerConnectionIceGatheringStateChanged(PeerConnection.IceGatheringState iceGatheringState) {
                            ConversationImpl.this.conversationStats.webrtcStats.onGatheringStateChanged(iceGatheringState);
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onPeerConnectionSignalingStateChanged(PeerConnection.SignalingState signalingState) {
                            ConversationImpl.this.conversationStats.webrtcStats.onSignalingStateChanged(signalingState);
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState, boolean z2) {
                            ConversationImpl.this.conversationStats.peerConnectionStateChangedStat.onStateChanged(peerConnectionState, z2);
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onRemoteCandidateReceived(String str9) {
                            ConversationImpl.this.conversationStats.webrtcStats.onIceCandidateReceived(str9);
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onRemoteSdpReceived(SessionDescription.Type type) {
                            if (type == SessionDescription.Type.OFFER) {
                                ConversationImpl.this.conversationStats.webrtcStats.onOfferReceived();
                            } else if (type == SessionDescription.Type.ANSWER || type == SessionDescription.Type.PRANSWER) {
                                ConversationImpl.this.conversationStats.webrtcStats.onAnswerReceived();
                            }
                        }

                        @Override // ru.ok.android.webrtc.Call.PeerConnectionEventListener
                        public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
                            ConversationImpl.this.conversationStats.iceCandidatePairChangedStat.onSelectedCandidatePairChanged(candidatePairChangeEvent);
                        }
                    });
                    this.call.init(this.signalingTransport, chooseIceServersResolver().a(conversationParams.stunTurnServers), str6);
                    this.waitingRoomParticipants.setCall(this.call);
                    this.wantsApiHangup = true;
                    this.prepared = true;
                    this.state.set(Conversation.State.Connecting);
                    this.call.setConnectionListener(onConnectedListener);
                } catch (Throwable th) {
                    this.log.logException(LOG_TAG, "Can't connect conversation", th);
                    consumer2.accept(new CallTerminatingException.Builder(Domain.SERVER, th).build());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    private io.reactivex.rxjava3.disposables.c refreshParams(final Runnable runnable, final Consumer<Throwable> consumer) {
        return this.apiService.getConversationParams(this.anonToken, false, null).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.e0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$refreshParams$15(runnable, (ConversationParams) obj);
            }
        }, new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.f0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                Consumer.this.accept((Throwable) obj);
            }
        });
    }

    private void registerParticipantsUpdaterListeners() {
        this.call.getCallListenersCollection().addParticipantsListener(this.participantsUpdater);
        this.call.getCallListenersCollection().addActiveSessionRoomParticipantsListener(this.participantsUpdater);
        this.call.getCallListenersCollection().addSessionRoomListener(this.participantsUpdater);
    }

    private void reportCallFinished(@Nullable CallTerminatingException callTerminatingException) {
        ConversationEndReason error = callTerminatingException != null ? new ConversationEndReason.Error(callTerminatingException) : this.call.callEndInfoHolder.getReason();
        this.conversationStats.callFinish.onCallFinished(error, this.rateManager.getRateHints(), error.getDescription(), this.isCaller);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportIfApplicable() {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (!next.isReported() && next.getExternalId() != null && this.listener.listener != null) {
                next.setReported(true);
                arrayList.add(next);
                this.store.addToActiveSessionRoom(next);
            }
        }
        if (this.listener.listener == null || arrayList.isEmpty()) {
            return;
        }
        this.listener.listener.onParticipantsAdded(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetSignaling() {
        this.store.clearMapping();
        this.apiModule.getOkApiHolder().clearSession();
        this.disposable.b(refreshParams(new Runnable() { // from class: ru.ok.android.externcalls.sdk.m0
            @Override // java.lang.Runnable
            public final void run() {
                ConversationImpl.this.onSignalingRefresh();
            }
        }, new yrj()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveExternalsByInternalsIds(@NonNull List<CallParticipant.ParticipantId> list, @NonNull Runnable runnable, @Nullable final Runnable runnable2) {
        if (list.isEmpty()) {
            runnable.run();
            return;
        }
        io.reactivex.rxjava3.internal.operators.completable.u o = this.externalIdsResolver.resolveIds(list, new MappingContext(this.log, this.callParams.getExperiments().R())).o(io.reactivex.rxjava3.android.schedulers.a.b());
        Objects.requireNonNull(runnable);
        this.disposable.b(o.subscribe(new dx3(runnable, 4), new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.o0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$resolveExternalsByInternalsIds$40(runnable2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveUnknownExternals() {
        resolveExternalsByInternalsIds(this.externalIdsResolver.collectExternalIdResolutionCandidates(), new Runnable() { // from class: ru.ok.android.externcalls.sdk.i0
            @Override // java.lang.Runnable
            public final void run() {
                ConversationImpl.this.reportIfApplicable();
            }
        }, null);
    }

    private void runStartConversation(final ConversationParams conversationParams, boolean z, final Consumer<Conversation> consumer, final Consumer<Throwable> consumer2) {
        if (isDestroyed()) {
            return;
        }
        this.disposable.b(this.conversationStart.execute(new ConversationStart.Params(conversationParams, z, this.initialOpponent, this.startCallApiParams)).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.r0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$runStartConversation$17(consumer2, conversationParams, consumer, (ConversationStart.Result) obj);
            }
        }, new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.t0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$runStartConversation$18(consumer2, (Throwable) obj);
            }
        }));
    }

    private void setupSessionRoomHandHandler(Call call) {
        call.getCallListenersCollection().addSessionRoomListener(this.sessionRoomParticipantStatesHandler);
        call.getCallListenersCollection().addActiveSessionRoomParticipantsListener(this.sessionRoomParticipantStatesHandler);
    }

    private void setupSessionRoomWatchTogetherHandler(Call call) {
        call.getCallListenersCollection().addSessionRoomListener(this.sessionRoomWatchTogetherHandler);
    }

    private void subscribeCallListeners() {
        if (!this.experiments.c()) {
            registerParticipantsUpdaterListeners();
        }
        this.call.getCallListenersCollection().addFingerprintListener(this.listener);
        this.call.getCallListenersCollection().addNetworkStatusListener(this.listener);
        this.call.getCallListenersCollection().addSessionRoomListener(this.sessionRoomManager);
        this.call.getCallListenersCollection().addSessionRoomListener(this.recordManager);
        this.call.getCallListenersCollection().addSessionRoomListener(this.asrListenerManager);
        this.call.getCallListenersCollection().addRecordListener(this.recordManager);
        this.call.getCallListenersCollection().addFeedbackListener(this.feedbackListenerManager);
        this.call.getCallListenersCollection().addAsrListener(this.asrListenerManager);
        this.call.getCallListenersCollection().addParticipantStateListener(this.listener);
        this.call.getCallListenersCollection().addAsrOnlineListener(this.asrOnlineManager);
        this.call.getCallListenersCollection().addContactCallListener(this.contactCallManager);
        this.call.getCallListenersCollection().addCallShouldRateListener(this.listener);
        this.call.getCallListenersCollection().addCallOptionChangedListener(this.listener);
        this.call.getCallListenersCollection().addWaitingRoomListener(this.waitingRoomParticipants);
        this.call.getCallListenersCollection().addWaitingRoomListener(this.stereoRoomManager);
        this.call.getCallListenersCollection().addUrlSharingListener(this.urlSharingListenerManager);
        this.call.getCallListenersCollection().addSessionRoomListener(this.urlSharingListenerManager);
        this.call.getCallListenersCollection().addChatListener(this.chatListenerManager);
        this.call.getCallListenersCollection().addMediaMuteListener(this.mediaMuteListenerManager);
        this.call.getCallListenersCollection().addStatsListener(this.mediaConnectionManager);
        this.call.getCallListenersCollection().addRtcStatsListener(this.statMonitor);
        this.call.getCallListenersCollection().addTopologyUpgradeStatEventListener(this.topologyUpgradeStatEventListener);
        this.call.getCallListenersCollection().addInternalHoldListener(this.internalHoldStateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTalkingParticipants() {
        Call call = this.call;
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipant conversationParticipant : this.store.getParticipants()) {
            CallParticipant callParticipant = conversationParticipant.getCallParticipant();
            boolean z = getAdjustedAudioLevel(conversationParticipant) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (callParticipant != null && z) {
                arrayList.add(callParticipant.getParticipantId());
            }
        }
        call.updateTalkingParticipants(arrayList);
    }

    private void withInternalId(ParticipantId participantId, Consumer<CallParticipant.ParticipantId> consumer) {
        withInternalId(participantId, consumer, null);
    }

    private void withInternalIds(@NonNull Collection<ParticipantId> collection, @Nullable final Consumer<Collection<CallParticipant.ParticipantId>> consumer) {
        final ArrayList arrayList = new ArrayList(collection.size());
        final ArrayList arrayList2 = new ArrayList(collection.size());
        for (ParticipantId participantId : collection) {
            CallParticipant.ParticipantId byExternal = this.idMappingWrapper.getByExternal(participantId);
            if (byExternal == null) {
                arrayList.add(participantId);
            } else {
                arrayList2.add(byExternal);
            }
        }
        if (!arrayList.isEmpty()) {
            final MappingContext mappingContext = new MappingContext(this.log, this.callParams.getExperiments().R());
            executeOnBg(new gzs() { // from class: ru.ok.android.externcalls.sdk.r
                @Override // xsna.gzs
                public final Object invoke() {
                    Map lambda$withInternalIds$37;
                    lambda$withInternalIds$37 = ConversationImpl.this.lambda$withInternalIds$37(arrayList, mappingContext);
                    return lambda$withInternalIds$37;
                }
            }, new Consumer() { // from class: ru.ok.android.externcalls.sdk.s
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationImpl.lambda$withInternalIds$38(Consumer.this, arrayList2, (Map) obj);
                }
            }, null);
        } else if (consumer != null) {
            try {
                consumer.accept(arrayList2);
            } catch (Exception e) {
                this.log.reportException(LOG_TAG, "unable to use internal id", e);
            }
        }
    }

    private Consumer<Throwable> wrapExternalErrorConsumer(final Consumer<Throwable> consumer) {
        return new Consumer() { // from class: ru.ok.android.externcalls.sdk.g0
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$wrapExternalErrorConsumer$19(consumer, (Throwable) obj);
            }
        };
    }

    private CallTerminatingException wrapInternalError(Throwable th) {
        return new CallTerminatingException.Builder(Domain.INTERNAL, th).build();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addEventsListener(@NonNull ConversationEventsListener conversationEventsListener) {
        this.eventListener.add(conversationEventsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipant(@NonNull ParticipantId participantId, @Nullable final Boolean bool, final boolean z, @Nullable final Consumer<String> consumer) {
        withInternalIds(Collections.singletonList(participantId), new Consumer() { // from class: ru.ok.android.externcalls.sdk.k
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$addParticipant$29(bool, z, consumer, (Collection) obj);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipantByLink(@NonNull String str, @NonNull Runnable runnable, @NonNull Consumer<Throwable> consumer) {
        this.addParticipantsCommands.addParticipantByLink(str, runnable, consumer);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipants(@NonNull Collection<ParticipantId> collection, @Nullable Boolean bool, boolean z, @NonNull izs<AddParticipantsResult, s3q0> izsVar, @Nullable izs<Throwable, s3q0> izsVar2) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ParticipantId participantId : collection) {
            arrayList.add(new CallExternalId(participantId.id, participantId.isAnon ? CallExternalId.Type.ANONYM : CallExternalId.Type.VK, participantId.deviceIndex));
        }
        this.addParticipantsCommands.addParticipantsExtIds(arrayList, bool, z, izsVar, izsVar2);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void changeMyState(@NonNull Map<String, String> map) {
        changeMyState(map, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void connect() {
        assertInited();
        this.call.connectIfReady();
    }

    @NonNull
    public RemoteSettings createRemoteSettings(RemoteSettings remoteSettings) {
        return remoteSettings != null ? remoteSettings : new RemoteSettingsImplV2(this.apiService, this.log, RemoteSettings.getKeys());
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public float getAdjustedAudioLevel(@NonNull ConversationParticipant conversationParticipant) {
        AudioProcessor audioLevel = getAudioLevel(conversationParticipant);
        if (audioLevel == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float averageAudioLevel = audioLevel.getAverageAudioLevel();
        if (conversationParticipant == this.f105me) {
            averageAudioLevel *= 5.0f;
        }
        if (averageAudioLevel < AUDIO_LEVEL_MIN) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (averageAudioLevel > AUDIO_LEVEL_CLAMP_MAX) {
            return 1.0f;
        }
        return averageAudioLevel / 9000.0f;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public AnimojiControl getAnimojiControl() {
        return this.call.getAnimojiControl();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public AsrManager getAsrManager() {
        return this.asrManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public AsrOnlineManager getAsrOnlineManager() {
        return this.asrOnlineManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Nullable
    public AudioProcessor getAudioLevel(@NonNull ConversationParticipant conversationParticipant) {
        if (this.f105me == conversationParticipant) {
            return this.audioSampleEnergyCalculator.getProcessor();
        }
        MediaStat participantMediaStat = this.call.getParticipantMediaStat(conversationParticipant.getCallParticipant());
        if (participantMediaStat == null) {
            return null;
        }
        return participantMediaStat.audioProcessor;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Nullable
    public CallInfo getCallInfo() {
        return this.callInfo;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public Conversation.CallType getCallType() {
        return this.isAnswer ? Conversation.CallType.Incoming : this.isCaller ? Conversation.CallType.Outgoing : Conversation.CallType.Join;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public CameraManager getCameraManager() {
        return this.cameraManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Nullable
    public CameraStatProvider getCameraStatProvider() {
        return this.call.getCameraStatProvider();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public ChatManager getChatManager() {
        return this.chatManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public ContactCallManager getContactCallManager() {
        return this.contactCallManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public String getConversationId() {
        return this.cidProvider.getConversationId();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public DebugManager getDebugManager() {
        return this.debugManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Nullable
    public String getDestroyReason() {
        return this.call.getDestroyReason();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public DisplayLayoutSender getDisplayLayoutSender() {
        return this.displayLayoutSender;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public ConversationFeatureManager getFeatureManager() {
        return this.conversationFeatureManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public FeedbackManager getFeedbackManager() {
        return this.feedbackManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Nullable
    public String getJoinLink() {
        String str = this.call.joinLink;
        if (str != null) {
            return str;
        }
        CallInfo callInfo = this.callInfo;
        return callInfo != null ? callInfo.joinLink : this.initialJoinLink;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public ConversationParticipant getMe() {
        return this.f105me;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public MediaConnectionManager getMediaConnectionManager() {
        return this.mediaConnectionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public MediaMuteManager getMediaMuteManager() {
        return this.mediaMuteManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public MicrophoneManager getMicrophoneManager() {
        return this.microphoneManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public NetworkConnectionManager getNetworkConnectionManager() {
        return this.networkConnectionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public NoiseSuppressionManager getNoiseSuppressionManager() {
        return this.noiseSuppressionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Nullable
    public ConversationParticipant getOpponent() {
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next != this.f105me) {
                return next;
            }
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Nullable
    public MediaStat getParticipantMediaStat(@NonNull ConversationParticipant conversationParticipant) {
        return this.call.getParticipantMediaStat(conversationParticipant.getCallParticipant());
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public ParticipantStatesManager getParticipantStatesManager() {
        return this.participantStatesManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public ParticipantCollection getParticipants() {
        return this.store;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Nullable
    public ConversationParticipant getPinnedParticipant() {
        CallParticipant.ParticipantId pinnedParticipantId = this.call.getPinnedParticipantId();
        if (pinnedParticipantId != null) {
            return this.store.getByInternal(pinnedParticipantId);
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public RateManager getRateManager() {
        return this.rateManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public RecordManager getRecordManager() {
        return this.recordManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Nullable
    public HangupReason getRejectReason() {
        return this.call.rejectReason;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public ScreenCaptureManager getScreenCaptureManager() {
        return this.screenCaptureManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public SessionRoomsManager getSessionRoomManager() {
        return this.sessionRoomManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public Conversation.State getState() {
        return this.state.get();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public StereoRoomManager getStereoRoomManager() {
        return this.stereoRoomManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public Call getUnderlyingCall() {
        return this.debugManager.getUnderlyingCall();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public UrlSharingManager getUrlSharingManager() {
        return this.urlSharingManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public VideoRenderManager getVideoRenderManager() {
        return this.videoRenderManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @NonNull
    public WatchTogetherPlayer getWatchTogetherPlayer() {
        return this.watchTogetherPlayer;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void grantRoles(@NonNull ParticipantId participantId, boolean z, @NonNull CallParticipant.Role... roleArr) {
        CallParticipant callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId == null || callParticipantByExternalId.getParticipantId() == null) {
            return;
        }
        grantRoles(callParticipantByExternalId.getParticipantId(), z, roleArr, null, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void hangup(@NonNull HangupParameters hangupParameters) {
        this.call.hangup(hangupParameters);
        this.wasHungUp = true;
        handleCallFinished(this.call.callFinishReason);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean hasRegisteredParticipnats() {
        return this.call.hasRegisteredParticipnats();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void init() {
        this.log.log(LOG_TAG, "init called");
        synchronized (this.stateTransitionLock) {
            try {
                if (isDestroyed()) {
                    this.log.log(LOG_TAG, "attempted to continue init after release, ignoring");
                    return;
                }
                assertPrepared();
                ConversationParticipant conversationParticipant = this.initialOpponent;
                if (conversationParticipant != null && conversationParticipant.getInternalId() != null) {
                    ConversationParticipant conversationParticipant2 = this.initialOpponent;
                    conversationParticipant2.setCallParticipant(this.call.getParticipant(conversationParticipant2.getInternalId()), this.localIdMappings);
                }
                this.call.setVideoRendererSource(this.videoRendererProvider);
                this.inited = true;
                this.call.onUserAnswered();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initAsConfJoin() {
        this.expectedChat = true;
    }

    public void initStore(Collection<ParticipantId> collection) {
        boolean z = collection.size() > 1;
        Iterator<ParticipantId> it = collection.iterator();
        while (it.hasNext()) {
            ConversationParticipant fromExternal = ConversationParticipant.fromExternal(it.next(), this.idMappingWrapper);
            this.store.addToActiveSessionRoom(fromExternal);
            if (!z) {
                this.initialOpponent = fromExternal;
                fromExternal.setReported(true);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAdminHere() {
        return this.call.isAdminHere();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAnonJoinForbidden() {
        return this.call.containsInOptions(Call.Option.REQUIRE_AUTH_TO_JOIN);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAnswered() {
        return this.call.isAnswered();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAudioMixEnabled() {
        return this.call.isAudioMixEnabled();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isCaller() {
        return this.isCaller;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isConcurrent() {
        return this.isConcurrent;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isConditionAccepted() {
        return this.call.isConditionAccepted();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isConnected() {
        return this.call.isConnected();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isDestroyed() {
        return this.state.get() == Conversation.State.Finished;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isFeatureAddParticipantEnabled() {
        return this.call.isFeatureAddParticipantEnabled();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isFeedbackEnabled() {
        return this.call.isFeedbackEnabled();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isGroupCall() {
        return this.call.isGroupCall();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isHeldByMe() {
        return getState().equals(Conversation.State.HeldByMe);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isInited() {
        return this.inited;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isInitialVideoEnabled() {
        return this.call.initialVideoEnabled;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMeCreatorOrAdmin() {
        return this.call.isMeCreatorOrAdmin();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMeInWaitingRoom() {
        return this.call.isMeInWaitingRoom();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMuteParticipantsPermitted() {
        return this.call.isMuteParticipantsPermitted();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isParticipantAdmin(@NonNull String str) {
        CallParticipant callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        return this.call.isParticipantAdmin(callParticipant);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isParticipantCreator(@NonNull String str) {
        CallParticipant callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        return this.call.isParticipantCreator(callParticipant);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isParticipantCreatorOrAdmin(String str) {
        CallParticipant callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        return this.call.isParticipantCreatorOrAdmin(callParticipant);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isPermissionsGranted() {
        return this.call.permissionsGranted();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isPrepared() {
        return this.prepared;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isRecurring() {
        return this.call.isRecurring();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isVideoPermissionGranted() {
        return this.call.isVideoPermissionGranted();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isWaitForAdminEnabled() {
        return this.call.isWaitForAdminEnabled();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isWaitingRoomEnabled() {
        return this.call.isWaitingRoomEnabled();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void muteAll() {
        Signaling signaling = this.call.getSignaling();
        if (signaling != null) {
            signaling.send(SignalingProtocol.createMuteAll());
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void pinParticipant(@NonNull ParticipantId participantId, boolean z) {
        CallParticipant callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId == null || callParticipantByExternalId.getParticipantId() == null) {
            return;
        }
        this.call.pinParticipant(callParticipantByExternalId.getParticipantId(), z);
    }

    public void prepare(ConversationParams conversationParams, Consumer<Conversation> consumer, Consumer<Throwable> consumer2) {
        prepare(conversationParams, false, consumer, consumer2);
    }

    public void prepareJoinByLink(final Consumer<Conversation> consumer, Consumer<Throwable> consumer2) {
        final Consumer<Throwable> wrapExternalErrorConsumer = wrapExternalErrorConsumer(consumer2);
        if (this.initialJoinLink == null) {
            wrapExternalErrorConsumer.accept(wrapInternalError(new NullPointerException("Initial join link MUST not be null during joining BY LINK")));
        } else {
            this.disposable.b(executeWithState(Conversation.State.None, Conversation.State.Preparing, createJoinPrepare(), new p0y.a(this.initialJoinLink, this.anonToken)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.f1
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    ConversationImpl.this.lambda$prepareJoinByLink$11(wrapExternalErrorConsumer, consumer, (y1d0.b) obj);
                }
            }, new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.g1
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    ConversationImpl.this.lambda$prepareJoinByLink$12(wrapExternalErrorConsumer, (Throwable) obj);
                }
            }));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void promoteParticipant(@NonNull ParticipantId participantId, final boolean z) {
        withInternalId(participantId, new Consumer() { // from class: ru.ok.android.externcalls.sdk.v
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$promoteParticipant$34(z, (CallParticipant.ParticipantId) obj);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void queryChatHistory(@Nullable Integer num, @Nullable Integer num2, @NonNull final Conversation.ChatHistoryCallback chatHistoryCallback) {
        Signaling signaling = this.call.getSignaling();
        if (signaling != null) {
            signaling.send(SignalingProtocol.createGetChatHistory(num, num2), new Signaling.Listener() { // from class: ru.ok.android.externcalls.sdk.t
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    ConversationImpl.this.lambda$queryChatHistory$39(chatHistoryCallback, jSONObject);
                }
            });
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void release() {
        SupportedCodecsStatistics.tryToReport(this.apiService, this.preferencesHelper, this.log);
        ThreadUtils.INSTANCE.assertMainThreadSafe();
        this.rateManager.logHints();
        this.disposable.e();
        this.waitingRoomParticipants.release();
        this.participantStatesManager.release();
        this.mediaConnectionManager.release();
        this.rateManager.release();
        this.remoteSettings.release();
        this.executionTimeInterceptor.release();
        this.mlFeaturesManager.dispose();
        P2pRelaySwitchTrigger p2pRelaySwitchTrigger = this.p2pRelaySwitchTrigger;
        if (p2pRelaySwitchTrigger != null) {
            p2pRelaySwitchTrigger.release();
        }
        this.conversationStats.release();
        synchronized (this.stateTransitionLock) {
            try {
                if (this.wantsApiHangup && this.wasHungUp) {
                    HangupReason hangupReason = this.call.rejectReason;
                    if (hangupReason == null) {
                        hangupReason = HangupReason.CANCELED;
                    }
                    this.creator.hangup(hangupReason, this.cidProvider.getConversationId(), this.anonToken);
                }
                this.call.setCustomDataListener(null);
                this.call.setRecordErrorConsumer(null);
                this.call.removeEventListener(this.listener);
                this.call.removeAudioSampleCallback(this.audioSampleEnergyCalculator);
                this.call.removeAudioEventsListener(this.audioEventsListener);
                this.call.destroy("release", null);
                this.state.set(Conversation.State.Finished);
                this.listener.release();
                this.eventListener.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeEventsListener(@NonNull ConversationEventsListener conversationEventsListener) {
        this.eventListener.remove(conversationEventsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeParticipant(@NonNull ParticipantId participantId) {
        removeParticipant(participantId, false);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void requestHoldStateChange(final boolean z, @NonNull hav havVar) {
        if (isHeldByMe() == z) {
            new HoldException.SameStateRequested(z);
            havVar.a();
        } else {
            if (!this.isHoldStateProcessingActive.compareAndSet(false, true)) {
                new HoldException.AlreadyProcessing();
                havVar.a();
                return;
            }
            try {
                this.call.changeHoldState(z, new Consumer() { // from class: ru.ok.android.externcalls.sdk.z
                    @Override // ru.ok.android.webrtc.utils.Consumer
                    public final void accept(Object obj) {
                        ConversationImpl.this.lambda$requestHoldStateChange$26(z, null, (Void) obj);
                    }
                }, new Consumer() { // from class: ru.ok.android.externcalls.sdk.a0
                    @Override // ru.ok.android.webrtc.utils.Consumer
                    public final void accept(Object obj) {
                        ConversationImpl.this.lambda$requestHoldStateChange$27(null, (gav) obj);
                    }
                });
            } catch (Exception e) {
                this.isHoldStateProcessingActive.set(false);
                new HoldException.Unspecified(e);
                havVar.a();
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void sendData(ConversationParticipant conversationParticipant, @NonNull JSONObject jSONObject) {
        CallParticipant.ParticipantId participantId;
        if (this.call.isDestroyed() || conversationParticipant == null || (participantId = conversationParticipant.getCallParticipant().getParticipantId()) == null) {
            return;
        }
        this.call.sendCustomData(participantId, jSONObject);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAnonJoinForbidden(boolean z) {
        setAnonJoinForbidden(z, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAudioCaptureEnabled(boolean z) {
        this.screenCaptureManager.setAudioCaptureEnabled(z);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setCallOptionEnabled(@NonNull final Call.Option option, final boolean z, @Nullable final Consumer<String> consumer) {
        Signaling signaling = this.call.getSignaling();
        if (!isMeCreatorOrAdmin()) {
            if (consumer != null) {
                consumer.accept("user is not creator or admin");
            }
            this.log.log(LOG_TAG, "user is not creator or admin");
        } else if (signaling != null) {
            Set singleton = Collections.singleton(option);
            signaling.send(z ? SignalingProtocol.createChangeOptions(singleton, null) : SignalingProtocol.createChangeOptions(null, singleton), new Signaling.Listener() { // from class: ru.ok.android.externcalls.sdk.b0
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    ConversationImpl.this.lambda$setCallOptionEnabled$24(z, option, consumer, jSONObject);
                }
            }, new Signaling.Listener() { // from class: ru.ok.android.externcalls.sdk.d0
                @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
                public final void onResponse(JSONObject jSONObject) {
                    ConversationImpl.lambda$setCallOptionEnabled$25(Consumer.this, jSONObject);
                }
            });
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setFeedbackEnabled(boolean z) {
        setFeedbackEnabled(z, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setMuteState(@NonNull ParticipantId participantId, final boolean z) {
        final Signaling signaling = this.call.getSignaling();
        if (signaling != null) {
            withInternalId(participantId, new Consumer() { // from class: ru.ok.android.externcalls.sdk.n0
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationImpl.lambda$setMuteState$41(Signaling.this, z, (CallParticipant.ParticipantId) obj);
                }
            });
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setWaitingRoomEnabled(boolean z) {
        setWaitingRoomEnabled(z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void withInternalId(final ParticipantId participantId, final Consumer<CallParticipant.ParticipantId> consumer, @Nullable Runnable runnable) {
        CallParticipant.ParticipantId byExternal = this.idMappingWrapper.getByExternal(participantId);
        if (byExternal == null) {
            final MappingContext mappingContext = new MappingContext(this.log, this.callParams.getExperiments().R());
            executeOnBg(new gzs() { // from class: ru.ok.android.externcalls.sdk.h1
                @Override // xsna.gzs
                public final Object invoke() {
                    Map lambda$withInternalId$35;
                    lambda$withInternalId$35 = ConversationImpl.this.lambda$withInternalId$35(participantId, mappingContext);
                    return lambda$withInternalId$35;
                }
            }, new Consumer() { // from class: ru.ok.android.externcalls.sdk.i1
                @Override // ru.ok.android.webrtc.utils.Consumer
                public final void accept(Object obj) {
                    ConversationImpl.lambda$withInternalId$36(ParticipantId.this, consumer, (Map) obj);
                }
            }, runnable);
            return;
        }
        try {
            consumer.accept(byExternal);
        } catch (Exception e) {
            if (runnable != null) {
                runnable.run();
            }
            this.log.reportException(LOG_TAG, "unable to use internal id", e);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public void addParticipant(@NonNull String str, final boolean z, final Consumer<String> consumer) {
        this.disposable.b(this.apiService.getOkIdByExternalId(str).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.l0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$addParticipant$31(z, consumer, (GetOkIdByExternalId.Response) obj);
            }
        }, new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.s0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$addParticipant$32((Throwable) obj);
            }
        }));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void changeMyState(@NonNull Map<String, String> map, @Nullable Signaling.Listener listener) {
        this.participantStatesManager.updateOwnState(map, listener);
    }

    public void prepare(ConversationParams conversationParams, final boolean z, final Consumer<Conversation> consumer, Consumer<Throwable> consumer2) {
        io.reactivex.rxjava3.core.x executeWithState = this.conversationStart.isFastStartEnabled() ? executeWithState(Conversation.State.None, Conversation.State.Preparing, createFastStartPrepare(), z1d0.a) : executeWithState(Conversation.State.None, Conversation.State.Preparing, createSimplePrepare(conversationParams), z1d0.a);
        final Consumer<Throwable> wrapExternalErrorConsumer = wrapExternalErrorConsumer(consumer2);
        this.disposable.b(executeWithState.m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.x
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$prepare$9(z, wrapExternalErrorConsumer, consumer, (y1d0.b) obj);
            }
        }, new io.reactivex.rxjava3.functions.f() { // from class: ru.ok.android.externcalls.sdk.y
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$prepare$10(wrapExternalErrorConsumer, (Throwable) obj);
            }
        }));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeParticipant(@NonNull ParticipantId participantId, final boolean z) {
        withInternalId(participantId, new Consumer() { // from class: ru.ok.android.externcalls.sdk.m
            @Override // ru.ok.android.webrtc.utils.Consumer
            public final void accept(Object obj) {
                ConversationImpl.this.lambda$removeParticipant$33(z, (CallParticipant.ParticipantId) obj);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAnonJoinForbidden(boolean z, @Nullable Consumer<String> consumer) {
        setCallOptionEnabled(Call.Option.REQUIRE_AUTH_TO_JOIN, z, consumer);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setFeedbackEnabled(boolean z, @Nullable Consumer<String> consumer) {
        setCallOptionEnabled(Call.Option.FEEDBACK, z, consumer);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setWaitingRoomEnabled(boolean z, @Nullable Consumer<String> consumer) {
        setCallOptionEnabled(Call.Option.WAITING_HALL, z, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void grantRoles(@NonNull CallParticipant.ParticipantId participantId, boolean z, CallParticipant.Role[] roleArr, @Nullable Runnable runnable, @Nullable Runnable runnable2) {
        this.call.grantRoles(participantId, Arrays.asList(roleArr), z, runnable, runnable2);
    }
}
