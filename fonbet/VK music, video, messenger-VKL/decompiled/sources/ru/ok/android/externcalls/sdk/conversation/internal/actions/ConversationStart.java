package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import org.webrtc.PeerConnection;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.delegate.InternalParamsDto;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.FastStartException;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;
import ru.ok.android.externcalls.sdk.exception.Domain;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.sdk.api.ApiAppKeyProvider;
import ru.ok.android.sdk.api.ApiDeviceIdProvider;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.RTCLog;
import xsna.ak;
import xsna.brm0;
import xsna.epx;
import xsna.j5g;
import xsna.jxa;
import xsna.qkx;
import xsna.qoy;
import xsna.zcl;

/* compiled from: ConversationStart.kt */
@CallInternalApi
/* loaded from: classes9.dex */
public final class ConversationStart implements Action<Params, Result> {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "ConversationStart";
    private final ConversationIdProvider conversationIdProvider;
    private final ExperimentsInterface experiments;
    private final qkx internalParamsProvider;
    private final RTCLog logger;

    /* renamed from: me, reason: collision with root package name */
    private final ConversationParticipant f107me;
    private final OkApiServiceInternal okApiServiceInternal;
    private final StartConversationDelegate startConversationDelegate;
    private final ParticipantStore store;

    /* compiled from: ConversationStart.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: ConversationStart.kt */
    public static final class Params implements ActionParams {
        private final boolean createLink;
        private final ConversationParticipant opponent;
        private final ConversationParams providedParams;
        private final StartCallApiParams startCallApiParams;

        public Params(ConversationParams conversationParams, boolean z, ConversationParticipant conversationParticipant, StartCallApiParams startCallApiParams) {
            this.providedParams = conversationParams;
            this.createLink = z;
            this.opponent = conversationParticipant;
            this.startCallApiParams = startCallApiParams;
        }

        public static /* synthetic */ Params copy$default(Params params, ConversationParams conversationParams, boolean z, ConversationParticipant conversationParticipant, StartCallApiParams startCallApiParams, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationParams = params.providedParams;
            }
            if ((i & 2) != 0) {
                z = params.createLink;
            }
            if ((i & 4) != 0) {
                conversationParticipant = params.opponent;
            }
            if ((i & 8) != 0) {
                startCallApiParams = params.startCallApiParams;
            }
            return params.copy(conversationParams, z, conversationParticipant, startCallApiParams);
        }

        public final ConversationParams component1() {
            return this.providedParams;
        }

        public final boolean component2() {
            return this.createLink;
        }

        public final ConversationParticipant component3() {
            return this.opponent;
        }

        public final StartCallApiParams component4() {
            return this.startCallApiParams;
        }

        public final Params copy(ConversationParams conversationParams, boolean z, ConversationParticipant conversationParticipant, StartCallApiParams startCallApiParams) {
            return new Params(conversationParams, z, conversationParticipant, startCallApiParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return epx.f(this.providedParams, params.providedParams) && this.createLink == params.createLink && epx.f(this.opponent, params.opponent) && epx.f(this.startCallApiParams, params.startCallApiParams);
        }

        public final boolean getCreateLink() {
            return this.createLink;
        }

        public final ConversationParticipant getOpponent() {
            return this.opponent;
        }

        public final ConversationParams getProvidedParams() {
            return this.providedParams;
        }

        public final StartCallApiParams getStartCallApiParams() {
            return this.startCallApiParams;
        }

        public int hashCode() {
            ConversationParams conversationParams = this.providedParams;
            int b = qoy.b((conversationParams == null ? 0 : conversationParams.hashCode()) * 31, 31, this.createLink);
            ConversationParticipant conversationParticipant = this.opponent;
            return this.startCallApiParams.hashCode() + ((b + (conversationParticipant != null ? conversationParticipant.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Params(providedParams=" + this.providedParams + ", createLink=" + this.createLink + ", opponent=" + this.opponent + ", startCallApiParams=" + this.startCallApiParams + ")";
        }
    }

    /* compiled from: ConversationStart.kt */
    public static final class Result implements ActionResult {
        private final CallInfo callInfo;

        public Result(CallInfo callInfo) {
            this.callInfo = callInfo;
        }

        public static /* synthetic */ Result copy$default(Result result, CallInfo callInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                callInfo = result.callInfo;
            }
            return result.copy(callInfo);
        }

        public final CallInfo component1() {
            return this.callInfo;
        }

        public final Result copy(CallInfo callInfo) {
            return new Result(callInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && epx.f(this.callInfo, ((Result) obj).callInfo);
        }

        public final CallInfo getCallInfo() {
            return this.callInfo;
        }

        public int hashCode() {
            return this.callInfo.hashCode();
        }

        public String toString() {
            return "Result(callInfo=" + this.callInfo + ")";
        }
    }

    /* compiled from: ConversationStart.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Domain.values().length];
            try {
                iArr[Domain.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Domain.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Domain.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConversationStart(OkApiServiceInternal okApiServiceInternal, StartConversationDelegate startConversationDelegate, ConversationIdProvider conversationIdProvider, ParticipantStore participantStore, ConversationParticipant conversationParticipant, RTCLog rTCLog, qkx qkxVar, ExperimentsInterface experimentsInterface) {
        this.okApiServiceInternal = okApiServiceInternal;
        this.startConversationDelegate = startConversationDelegate;
        this.conversationIdProvider = conversationIdProvider;
        this.store = participantStore;
        this.f107me = conversationParticipant;
        this.logger = rTCLog;
        this.internalParamsProvider = qkxVar;
        this.experiments = experimentsInterface;
    }

    private final List<String> collectOpponentExternalIds(ParticipantStore participantStore, ParticipantId participantId) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = participantStore.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getExternalId() != null && !epx.f(next.getExternalId(), participantId)) {
                arrayList.add(next.getExternalId().id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StartConversationDelegate.Result execute$lambda$0(ConversationStart conversationStart, StartConversationDelegate.Params params) {
        return conversationStart.startConversationDelegate.invoke(params);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallInfo maybeEmulateError(CallInfo callInfo) {
        if (this.experiments.L() == null) {
            return callInfo;
        }
        throw null;
    }

    private final String parseTurnServers(List<? extends PeerConnection.IceServer> list) {
        if (list == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) obj;
            if ((iceServer != null ? iceServer.hostname : null) != null && brm0.B(iceServer.hostname, "turn", false)) {
                arrayList.add(obj);
            }
        }
        String g0 = j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, new ak(19), 30);
        return g0 == null ? "" : g0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence parseTurnServers$lambda$1(PeerConnection.IceServer iceServer) {
        String str;
        return (iceServer == null || (str = iceServer.hostname) == null) ? "" : str;
    }

    public final boolean isFastStartEnabled() {
        return this.startConversationDelegate != null;
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public x<Result> execute(Params params) {
        y l;
        if (this.startConversationDelegate != null) {
            String conversationId = this.conversationIdProvider.getConversationId();
            List<String> collectOpponentExternalIds = collectOpponentExternalIds(this.store, this.f107me.getExternalId());
            Long chatId = params.getStartCallApiParams().getChatId();
            boolean isVideo = params.getStartCallApiParams().isVideo();
            qkx qkxVar = this.internalParamsProvider;
            StartCallApiParams startCallApiParams = params.getStartCallApiParams();
            ApiAppKeyProvider apiAppKeyProvider = qkxVar.b;
            String appKey = apiAppKeyProvider != null ? apiAppKeyProvider.getAppKey() : null;
            ApiDeviceIdProvider apiDeviceIdProvider = qkxVar.a;
            StartConversationDelegate.Params params2 = new StartConversationDelegate.Params(conversationId, collectOpponentExternalIds, chatId, isVideo, new InternalParamsDto("ANDROID", "0.2.3", appKey, apiDeviceIdProvider != null ? apiDeviceIdProvider.getDeviceId() : null, startCallApiParams.isMultipleDevicesEnabled() ? 6 : 5, startCallApiParams.getDomainId(), false, startCallApiParams.isWaitForAdminEnabled(), startCallApiParams.getHexCapability()).toJson());
            this.logger.log(LOG_TAG, "startConversationDelegate called with param " + params2);
            l = new v(new jxa(1, this, params2)).l(new l() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart$execute$2
                @Override // io.reactivex.rxjava3.functions.l
                public final CallInfo apply(StartConversationDelegate.Result result) {
                    ExperimentsInterface experimentsInterface;
                    if (result instanceof StartConversationDelegate.Result.Success) {
                        experimentsInterface = ConversationStart.this.experiments;
                        return CallInfo.Companion.createFromStartConversationDelegateResult$calls_sdk_release((StartConversationDelegate.Result.Success) result, experimentsInterface.A());
                    }
                    if (!(result instanceof StartConversationDelegate.Result.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StartConversationDelegate.Result.Error error = (StartConversationDelegate.Result.Error) result;
                    throw new FastStartException(error.getErrorCode(), error.getThrowable());
                }
            });
        } else {
            List<PeerConnection.IceServer> list = null;
            OkApiServiceInternal okApiServiceInternal = this.okApiServiceInternal;
            ConversationParams providedParams = params.getProvidedParams();
            if (providedParams != null) {
                list = providedParams.stunTurnServers;
            }
            l = okApiServiceInternal.startConversation(parseTurnServers(list), this.conversationIdProvider.getConversationId(), params.getCreateLink(), params.getOpponent(), collectOpponentExternalIds(this.store, this.f107me.getExternalId()), params.getStartCallApiParams()).l(new l() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart$execute$3
                @Override // io.reactivex.rxjava3.functions.l
                public final CallInfo apply(CallInfo callInfo) {
                    CallInfo maybeEmulateError;
                    maybeEmulateError = ConversationStart.this.maybeEmulateError(callInfo);
                    return maybeEmulateError;
                }
            });
        }
        return l.l(new l() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart$execute$4
            @Override // io.reactivex.rxjava3.functions.l
            public final ConversationStart.Result apply(CallInfo callInfo) {
                return new ConversationStart.Result(callInfo);
            }
        });
    }
}
