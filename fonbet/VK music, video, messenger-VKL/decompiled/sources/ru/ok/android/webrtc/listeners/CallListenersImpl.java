package ru.ok.android.webrtc.listeners;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import ru.ok.android.webrtc.listeners.collection.ActiveSessionRoomParticipantsListenersCollection;
import ru.ok.android.webrtc.listeners.collection.AsrListenersCollection;
import ru.ok.android.webrtc.listeners.collection.AsrOnlineListenersCollection;
import ru.ok.android.webrtc.listeners.collection.CallOptionChangedCollection;
import ru.ok.android.webrtc.listeners.collection.CallShouldRateListenerCollection;
import ru.ok.android.webrtc.listeners.collection.CallUrlSharingListenerCollection;
import ru.ok.android.webrtc.listeners.collection.ChatListenerCollection;
import ru.ok.android.webrtc.listeners.collection.ContactCallListenersCollection;
import ru.ok.android.webrtc.listeners.collection.FeedbackListenersCollection;
import ru.ok.android.webrtc.listeners.collection.FingerprintListenersCollection;
import ru.ok.android.webrtc.listeners.collection.InternalHoldListenersCollection;
import ru.ok.android.webrtc.listeners.collection.MediaMuteListenerCollection;
import ru.ok.android.webrtc.listeners.collection.NetworkStatusListenersCollection;
import ru.ok.android.webrtc.listeners.collection.ParticipantStateListenersCollection;
import ru.ok.android.webrtc.listeners.collection.ParticipantsListenersCollection;
import ru.ok.android.webrtc.listeners.collection.RecordListenersCollection;
import ru.ok.android.webrtc.listeners.collection.RtcStatsListenersCollection;
import ru.ok.android.webrtc.listeners.collection.SessionRoomAsrRecordInfoListenersCollection;
import ru.ok.android.webrtc.listeners.collection.SessionRoomRecordInfoListenersCollection;
import ru.ok.android.webrtc.listeners.collection.SessionRoomsListenersCollection;
import ru.ok.android.webrtc.listeners.collection.StatsListenersCollection;
import ru.ok.android.webrtc.listeners.collection.TopologyUpgradeListenerCollection;
import ru.ok.android.webrtc.listeners.collection.VideoQualityListenersCollection;
import ru.ok.android.webrtc.listeners.collection.WaitingRoomListenersCollection;
import ru.ok.android.webrtc.listeners.proxy.ActiveSessionRoomParticipantsListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.ActiveSessionRoomParticipantsListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.AsrListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.AsrListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.AsrOnlineListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.AsrOnlineListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.CallContactCallListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.CallOptionChangedListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.CallOptionChangedListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.ChatListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.ChatListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.ContactCallListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.FeedbackListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.FeedbackListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.FingerprintListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.FingerprintListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.InternalHoldStateListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.InternalHoldStateListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.MediaMuteListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.MediaMuteListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.NetworkStatusListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.NetworkStatusListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.ParticipantStateListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.ParticipantStateListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.ParticipantsListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.ParticipantsListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.RateCallListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.RateListenersCollectionProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.RecordListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.RecordListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.RtcStatsListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.RtcStatsListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.SessionRoomAsrRecordInfoListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.SessionRoomAsrRecordListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.SessionRoomRecordInfoListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.SessionRoomRecordInfoListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.SessionRoomsListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.SessionRoomsListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.StatsListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.StatsListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.TopologyUpgradeStatEventListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.TopologyUpgradeStatEventListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.UrlSharingListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.UrlSharingListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.VideoQualityListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.VideoQualityListenerProxyImpl;
import ru.ok.android.webrtc.listeners.proxy.WaitingRoomListenerProxy;
import ru.ok.android.webrtc.listeners.proxy.WaitingRoomListenerProxyImpl;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class CallListenersImpl implements CallListeners, ActiveSessionRoomParticipantsListenersCollection, FingerprintListenersCollection, ParticipantsListenersCollection, WaitingRoomListenersCollection, NetworkStatusListenersCollection, SessionRoomsListenersCollection, SessionRoomRecordInfoListenersCollection, SessionRoomAsrRecordInfoListenersCollection, RecordListenersCollection, FeedbackListenersCollection, ContactCallListenersCollection, VideoQualityListenersCollection, AsrListenersCollection, ParticipantStateListenersCollection, AsrOnlineListenersCollection, CallShouldRateListenerCollection, CallUrlSharingListenerCollection, ChatListenerCollection, MediaMuteListenerCollection, StatsListenersCollection, RtcStatsListenersCollection, TopologyUpgradeListenerCollection, CallOptionChangedCollection, InternalHoldListenersCollection {
    public final ActiveSessionRoomParticipantsListenerProxyImpl a;
    public final FingerprintListenerProxyImpl b;
    public final ParticipantsListenerProxyImpl c;
    public final WaitingRoomListenerProxyImpl d;
    public final NetworkStatusListenerProxyImpl e;
    public final SessionRoomsListenerProxyImpl f;
    public final SessionRoomRecordInfoListenerProxyImpl g;
    public final SessionRoomAsrRecordInfoListenerProxyImpl h;
    public final RecordListenerProxyImpl i;
    public final FeedbackListenerProxyImpl j;
    public final CallContactCallListenerProxyImpl k;
    public final VideoQualityListenerProxyImpl l;
    public final AsrListenerProxyImpl m;
    public final ParticipantStateListenerProxyImpl n;
    public final AsrOnlineListenerProxyImpl o;
    public final RateListenersCollectionProxyImpl p;
    public final UrlSharingListenerProxyImpl q;
    public final ChatListenerProxyImpl r;
    public final MediaMuteListenerProxyImpl s;
    public final StatsListenerProxyImpl t;
    public final RtcStatsListenerProxyImpl u;
    public final TopologyUpgradeStatEventListenerProxyImpl v;
    public final CallOptionChangedListenerProxyImpl w;
    public final InternalHoldStateListenerProxyImpl x;

    public CallListenersImpl() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ActiveSessionRoomParticipantsListenersCollection
    public void addActiveSessionRoomParticipantsListener(CallActiveSessionRoomParticipantsListener callActiveSessionRoomParticipantsListener) {
        this.a.addActiveSessionRoomParticipantsListener(callActiveSessionRoomParticipantsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.AsrListenersCollection
    public void addAsrListener(CallAsrListener callAsrListener) {
        this.m.addAsrListener(callAsrListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.AsrOnlineListenersCollection
    public void addAsrOnlineListener(CallAsrOnlineListener callAsrOnlineListener) {
        this.o.addAsrOnlineListener(callAsrOnlineListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.CallOptionChangedCollection
    public void addCallOptionChangedListener(CallOptionChangedListener callOptionChangedListener) {
        this.w.addCallOptionChangedListener(callOptionChangedListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.CallShouldRateListenerCollection
    public void addCallShouldRateListener(ShouldRateCallListener shouldRateCallListener) {
        this.p.addCallShouldRateListener(shouldRateCallListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ChatListenerCollection
    public void addChatListener(CallChatListener callChatListener) {
        this.r.addChatListener(callChatListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ContactCallListenersCollection
    public void addContactCallListener(CallContactCallListener callContactCallListener) {
        this.k.addContactCallListener(callContactCallListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.FeedbackListenersCollection
    public void addFeedbackListener(CallFeedbackListener callFeedbackListener) {
        this.j.addFeedbackListener(callFeedbackListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.FingerprintListenersCollection
    public void addFingerprintListener(CallFingerprintListener callFingerprintListener) {
        this.b.addFingerprintListener(callFingerprintListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.InternalHoldListenersCollection
    public void addInternalHoldListener(InternalHoldStateListener internalHoldStateListener) {
        this.x.addInternalHoldListener(internalHoldStateListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.MediaMuteListenerCollection
    public void addMediaMuteListener(CallMediaMuteListener callMediaMuteListener) {
        this.s.addMediaMuteListener(callMediaMuteListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.NetworkStatusListenersCollection
    public void addNetworkStatusListener(CallNetworkStatusListener callNetworkStatusListener) {
        this.e.addNetworkStatusListener(callNetworkStatusListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ParticipantStateListenersCollection
    public void addParticipantStateListener(CallParticipantStateListener callParticipantStateListener) {
        this.n.addParticipantStateListener(callParticipantStateListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ParticipantsListenersCollection
    public void addParticipantsListener(CallParticipantsListener callParticipantsListener) {
        this.c.addParticipantsListener(callParticipantsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.RecordListenersCollection
    public void addRecordListener(CallRecordListener callRecordListener) {
        this.i.addRecordListener(callRecordListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.RtcStatsListenersCollection
    public void addRtcStatsListener(CallRtcStatsListener callRtcStatsListener) {
        this.u.addRtcStatsListener(callRtcStatsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomAsrRecordInfoListenersCollection
    public void addSessionRoomAsrRecordInfoListener(CallSessionRoomAsrRecordListener callSessionRoomAsrRecordListener) {
        this.h.addSessionRoomAsrRecordInfoListener(callSessionRoomAsrRecordListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomsListenersCollection
    public void addSessionRoomListener(CallSessionRoomsListener callSessionRoomsListener) {
        this.f.addSessionRoomListener(callSessionRoomsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomRecordInfoListenersCollection
    public void addSessionRoomRecordInfoListener(CallSessionRoomRecordInfoListener callSessionRoomRecordInfoListener) {
        this.g.addSessionRoomRecordInfoListener(callSessionRoomRecordInfoListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.StatsListenersCollection
    public void addStatsListener(CallStatsListener callStatsListener) {
        this.t.addStatsListener(callStatsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.TopologyUpgradeListenerCollection
    public void addTopologyUpgradeStatEventListener(TopologyUpgradeStatEventListener topologyUpgradeStatEventListener) {
        this.v.addTopologyUpgradeStatEventListener(topologyUpgradeStatEventListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.CallUrlSharingListenerCollection
    public void addUrlSharingListener(CallUrlSharingListener callUrlSharingListener) {
        this.q.addUrlSharingListener(callUrlSharingListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.VideoQualityListenersCollection
    public void addVideoQualityUpdateListener(CallVideoQualityUpdateListener callVideoQualityUpdateListener) {
        this.l.addVideoQualityUpdateListener(callVideoQualityUpdateListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.WaitingRoomListenersCollection
    public void addWaitingRoomListener(CallWaitingRoomListener callWaitingRoomListener) {
        this.d.addWaitingRoomListener(callWaitingRoomListener);
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public ActiveSessionRoomParticipantsListenerProxy getActiveSessionRoomParticipantsListenerProxy() {
        return this.a;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public AsrListenerProxy getAsrListenerProxy() {
        return this.m;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public AsrOnlineListenerProxy getAsrOnlineListenerProxy() {
        return this.o;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public CallOptionChangedListenerProxy getCallOptionChangedListenerProxy() {
        return this.w;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public ChatListenerProxy getChatListenerProxy() {
        return this.r;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public ContactCallListenerProxy getContactCallListenerProxy() {
        return this.k;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public FeedbackListenerProxy getFeedbackListenerProxy() {
        return this.j;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public FingerprintListenerProxy getFingerprintListenerProxy() {
        return this.b;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public InternalHoldStateListenerProxy getInternalHoldListenerProxy() {
        return this.x;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public MediaMuteListenerProxy getMediaMuteListenerProxy() {
        return this.s;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public NetworkStatusListenerProxy getNetworkStatusListenerProxy() {
        return this.e;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public ParticipantStateListenerProxy getParticipantStateListenerProxy() {
        return this.n;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public ParticipantsListenerProxy getParticipantsListenerProxy() {
        return this.c;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public RateCallListenerProxy getRateCallListenersProxy() {
        return this.p;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public RecordListenerProxy getRecordProxy() {
        return this.i;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public RtcStatsListenerProxy getRtcStatsListenerProxy() {
        return this.u;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public SessionRoomAsrRecordListenerProxy getSessionRoomAsrRecordInfoProxy() {
        return this.h;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public SessionRoomRecordInfoListenerProxy getSessionRoomRecordInfoProxy() {
        return this.g;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public SessionRoomsListenerProxy getSessionRoomsListenerProxy() {
        return this.f;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public StatsListenerProxy getStatsListenerProxy() {
        return this.t;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public TopologyUpgradeStatEventListenerProxy getTopologyUpgradeListenerProxy() {
        return this.v;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public UrlSharingListenerProxy getUrlSharingListenerProxy() {
        return this.q;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public VideoQualityListenerProxy getVideoQualityListenerProxy() {
        return this.l;
    }

    @Override // ru.ok.android.webrtc.listeners.proxy.CallListenersProxy
    public WaitingRoomListenerProxy getWaitingRoomListenerProxy() {
        return this.d;
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ActiveSessionRoomParticipantsListenersCollection
    public void removeActiveSessionRoomParticipantsListener(CallActiveSessionRoomParticipantsListener callActiveSessionRoomParticipantsListener) {
        this.a.removeActiveSessionRoomParticipantsListener(callActiveSessionRoomParticipantsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.AsrListenersCollection
    public void removeAsrListener(CallAsrListener callAsrListener) {
        this.m.removeAsrListener(callAsrListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.AsrOnlineListenersCollection
    public void removeAsrOnlineListener(CallAsrOnlineListener callAsrOnlineListener) {
        this.o.removeAsrOnlineListener(callAsrOnlineListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.CallOptionChangedCollection
    public void removeCallOptionChangedListener(CallOptionChangedListener callOptionChangedListener) {
        this.w.removeCallOptionChangedListener(callOptionChangedListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ChatListenerCollection
    public void removeChatListener(CallChatListener callChatListener) {
        this.r.removeChatListener(callChatListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ContactCallListenersCollection
    public void removeContactCallListener(CallContactCallListener callContactCallListener) {
        this.k.removeContactCallListener(callContactCallListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.FeedbackListenersCollection
    public void removeFeedbackListener(CallFeedbackListener callFeedbackListener) {
        this.j.removeFeedbackListener(callFeedbackListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.FingerprintListenersCollection
    public void removeFingerprintListener(CallFingerprintListener callFingerprintListener) {
        this.b.removeFingerprintListener(callFingerprintListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.InternalHoldListenersCollection
    public void removeInternalHoldListener(InternalHoldStateListener internalHoldStateListener) {
        this.x.removeInternalHoldListener(internalHoldStateListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.MediaMuteListenerCollection
    public void removeMediaMuteListener(CallMediaMuteListener callMediaMuteListener) {
        this.s.removeMediaMuteListener(callMediaMuteListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.NetworkStatusListenersCollection
    public void removeNetworkStatusListener(CallNetworkStatusListener callNetworkStatusListener) {
        this.e.removeNetworkStatusListener(callNetworkStatusListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ParticipantStateListenersCollection
    public void removeParticipantStateListener(CallParticipantStateListener callParticipantStateListener) {
        this.n.removeParticipantStateListener(callParticipantStateListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.ParticipantsListenersCollection
    public void removeParticipantsListener(CallParticipantsListener callParticipantsListener) {
        this.c.removeParticipantsListener(callParticipantsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.RecordListenersCollection
    public void removeRecordListener(CallRecordListener callRecordListener) {
        this.i.removeRecordListener(callRecordListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.RtcStatsListenersCollection
    public void removeRtcStatsListener(CallRtcStatsListener callRtcStatsListener) {
        this.u.removeRtcStatsListener(callRtcStatsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomAsrRecordInfoListenersCollection
    public void removeSessionRoomAsrRecordInfoListener(CallSessionRoomAsrRecordListener callSessionRoomAsrRecordListener) {
        this.h.removeSessionRoomAsrRecordInfoListener(callSessionRoomAsrRecordListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomsListenersCollection
    public void removeSessionRoomListener(CallSessionRoomsListener callSessionRoomsListener) {
        this.f.removeSessionRoomListener(callSessionRoomsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.SessionRoomRecordInfoListenersCollection
    public void removeSessionRoomRecordInfoListener(CallSessionRoomRecordInfoListener callSessionRoomRecordInfoListener) {
        this.g.removeSessionRoomRecordInfoListener(callSessionRoomRecordInfoListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.CallShouldRateListenerCollection
    public void removeShouldRateCallListener(ShouldRateCallListener shouldRateCallListener) {
        this.p.removeShouldRateCallListener(shouldRateCallListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.StatsListenersCollection
    public void removeStatsListener(CallStatsListener callStatsListener) {
        this.t.removeStatsListener(callStatsListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.TopologyUpgradeListenerCollection
    public void removeTopologyUpgradeStatEventListener(TopologyUpgradeStatEventListener topologyUpgradeStatEventListener) {
        this.v.removeTopologyUpgradeStatEventListener(topologyUpgradeStatEventListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.CallUrlSharingListenerCollection
    public void removeUrlSharingListener(CallUrlSharingListener callUrlSharingListener) {
        this.q.removeUrlSharingListener(callUrlSharingListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.VideoQualityListenersCollection
    public void removeVideoQualityUpdateListener(CallVideoQualityUpdateListener callVideoQualityUpdateListener) {
        this.l.removeVideoQualityUpdateListener(callVideoQualityUpdateListener);
    }

    @Override // ru.ok.android.webrtc.listeners.collection.WaitingRoomListenersCollection
    public void removeWaitingRoomListener(CallWaitingRoomListener callWaitingRoomListener) {
        this.d.removeWaitingRoomListener(callWaitingRoomListener);
    }

    public CallListenersImpl(ActiveSessionRoomParticipantsListenerProxyImpl activeSessionRoomParticipantsListenerProxyImpl, FingerprintListenerProxyImpl fingerprintListenerProxyImpl, ParticipantsListenerProxyImpl participantsListenerProxyImpl, WaitingRoomListenerProxyImpl waitingRoomListenerProxyImpl, NetworkStatusListenerProxyImpl networkStatusListenerProxyImpl, SessionRoomsListenerProxyImpl sessionRoomsListenerProxyImpl, SessionRoomRecordInfoListenerProxyImpl sessionRoomRecordInfoListenerProxyImpl, SessionRoomAsrRecordInfoListenerProxyImpl sessionRoomAsrRecordInfoListenerProxyImpl, RecordListenerProxyImpl recordListenerProxyImpl, FeedbackListenerProxyImpl feedbackListenerProxyImpl, CallContactCallListenerProxyImpl callContactCallListenerProxyImpl, VideoQualityListenerProxyImpl videoQualityListenerProxyImpl, AsrListenerProxyImpl asrListenerProxyImpl, ParticipantStateListenerProxyImpl participantStateListenerProxyImpl, AsrOnlineListenerProxyImpl asrOnlineListenerProxyImpl, RateListenersCollectionProxyImpl rateListenersCollectionProxyImpl, UrlSharingListenerProxyImpl urlSharingListenerProxyImpl, ChatListenerProxyImpl chatListenerProxyImpl, MediaMuteListenerProxyImpl mediaMuteListenerProxyImpl, StatsListenerProxyImpl statsListenerProxyImpl, RtcStatsListenerProxyImpl rtcStatsListenerProxyImpl, TopologyUpgradeStatEventListenerProxyImpl topologyUpgradeStatEventListenerProxyImpl, CallOptionChangedListenerProxyImpl callOptionChangedListenerProxyImpl, InternalHoldStateListenerProxyImpl internalHoldStateListenerProxyImpl) {
        this.a = activeSessionRoomParticipantsListenerProxyImpl;
        this.b = fingerprintListenerProxyImpl;
        this.c = participantsListenerProxyImpl;
        this.d = waitingRoomListenerProxyImpl;
        this.e = networkStatusListenerProxyImpl;
        this.f = sessionRoomsListenerProxyImpl;
        this.g = sessionRoomRecordInfoListenerProxyImpl;
        this.h = sessionRoomAsrRecordInfoListenerProxyImpl;
        this.i = recordListenerProxyImpl;
        this.j = feedbackListenerProxyImpl;
        this.k = callContactCallListenerProxyImpl;
        this.l = videoQualityListenerProxyImpl;
        this.m = asrListenerProxyImpl;
        this.n = participantStateListenerProxyImpl;
        this.o = asrOnlineListenerProxyImpl;
        this.p = rateListenersCollectionProxyImpl;
        this.q = urlSharingListenerProxyImpl;
        this.r = chatListenerProxyImpl;
        this.s = mediaMuteListenerProxyImpl;
        this.t = statsListenerProxyImpl;
        this.u = rtcStatsListenerProxyImpl;
        this.v = topologyUpgradeStatEventListenerProxyImpl;
        this.w = callOptionChangedListenerProxyImpl;
        this.x = internalHoldStateListenerProxyImpl;
    }

    public /* synthetic */ CallListenersImpl(ActiveSessionRoomParticipantsListenerProxyImpl activeSessionRoomParticipantsListenerProxyImpl, FingerprintListenerProxyImpl fingerprintListenerProxyImpl, ParticipantsListenerProxyImpl participantsListenerProxyImpl, WaitingRoomListenerProxyImpl waitingRoomListenerProxyImpl, NetworkStatusListenerProxyImpl networkStatusListenerProxyImpl, SessionRoomsListenerProxyImpl sessionRoomsListenerProxyImpl, SessionRoomRecordInfoListenerProxyImpl sessionRoomRecordInfoListenerProxyImpl, SessionRoomAsrRecordInfoListenerProxyImpl sessionRoomAsrRecordInfoListenerProxyImpl, RecordListenerProxyImpl recordListenerProxyImpl, FeedbackListenerProxyImpl feedbackListenerProxyImpl, CallContactCallListenerProxyImpl callContactCallListenerProxyImpl, VideoQualityListenerProxyImpl videoQualityListenerProxyImpl, AsrListenerProxyImpl asrListenerProxyImpl, ParticipantStateListenerProxyImpl participantStateListenerProxyImpl, AsrOnlineListenerProxyImpl asrOnlineListenerProxyImpl, RateListenersCollectionProxyImpl rateListenersCollectionProxyImpl, UrlSharingListenerProxyImpl urlSharingListenerProxyImpl, ChatListenerProxyImpl chatListenerProxyImpl, MediaMuteListenerProxyImpl mediaMuteListenerProxyImpl, StatsListenerProxyImpl statsListenerProxyImpl, RtcStatsListenerProxyImpl rtcStatsListenerProxyImpl, TopologyUpgradeStatEventListenerProxyImpl topologyUpgradeStatEventListenerProxyImpl, CallOptionChangedListenerProxyImpl callOptionChangedListenerProxyImpl, InternalHoldStateListenerProxyImpl internalHoldStateListenerProxyImpl, int i, zcl zclVar) {
        this((i & 1) != 0 ? new ActiveSessionRoomParticipantsListenerProxyImpl() : activeSessionRoomParticipantsListenerProxyImpl, (i & 2) != 0 ? new FingerprintListenerProxyImpl() : fingerprintListenerProxyImpl, (i & 4) != 0 ? new ParticipantsListenerProxyImpl() : participantsListenerProxyImpl, (i & 8) != 0 ? new WaitingRoomListenerProxyImpl() : waitingRoomListenerProxyImpl, (i & 16) != 0 ? new NetworkStatusListenerProxyImpl() : networkStatusListenerProxyImpl, (i & 32) != 0 ? new SessionRoomsListenerProxyImpl() : sessionRoomsListenerProxyImpl, (i & 64) != 0 ? new SessionRoomRecordInfoListenerProxyImpl() : sessionRoomRecordInfoListenerProxyImpl, (i & 128) != 0 ? new SessionRoomAsrRecordInfoListenerProxyImpl() : sessionRoomAsrRecordInfoListenerProxyImpl, (i & 256) != 0 ? new RecordListenerProxyImpl() : recordListenerProxyImpl, (i & 512) != 0 ? new FeedbackListenerProxyImpl() : feedbackListenerProxyImpl, (i & 1024) != 0 ? new CallContactCallListenerProxyImpl() : callContactCallListenerProxyImpl, (i & 2048) != 0 ? new VideoQualityListenerProxyImpl() : videoQualityListenerProxyImpl, (i & 4096) != 0 ? new AsrListenerProxyImpl() : asrListenerProxyImpl, (i & 8192) != 0 ? new ParticipantStateListenerProxyImpl() : participantStateListenerProxyImpl, (i & 16384) != 0 ? new AsrOnlineListenerProxyImpl() : asrOnlineListenerProxyImpl, (i & 32768) != 0 ? new RateListenersCollectionProxyImpl() : rateListenersCollectionProxyImpl, (i & 65536) != 0 ? new UrlSharingListenerProxyImpl() : urlSharingListenerProxyImpl, (i & 131072) != 0 ? new ChatListenerProxyImpl() : chatListenerProxyImpl, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? new MediaMuteListenerProxyImpl() : mediaMuteListenerProxyImpl, (i & 524288) != 0 ? new StatsListenerProxyImpl() : statsListenerProxyImpl, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? new RtcStatsListenerProxyImpl() : rtcStatsListenerProxyImpl, (i & 2097152) != 0 ? new TopologyUpgradeStatEventListenerProxyImpl() : topologyUpgradeStatEventListenerProxyImpl, (i & 4194304) != 0 ? new CallOptionChangedListenerProxyImpl() : callOptionChangedListenerProxyImpl, (i & 8388608) != 0 ? new InternalHoldStateListenerProxyImpl() : internalHoldStateListenerProxyImpl);
    }
}
