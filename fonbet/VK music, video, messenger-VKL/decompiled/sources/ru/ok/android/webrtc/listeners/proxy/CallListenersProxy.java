package ru.ok.android.webrtc.listeners.proxy;

/* loaded from: classes9.dex */
public interface CallListenersProxy {
    ActiveSessionRoomParticipantsListenerProxy getActiveSessionRoomParticipantsListenerProxy();

    AsrListenerProxy getAsrListenerProxy();

    AsrOnlineListenerProxy getAsrOnlineListenerProxy();

    CallOptionChangedListenerProxy getCallOptionChangedListenerProxy();

    ChatListenerProxy getChatListenerProxy();

    ContactCallListenerProxy getContactCallListenerProxy();

    FeedbackListenerProxy getFeedbackListenerProxy();

    FingerprintListenerProxy getFingerprintListenerProxy();

    InternalHoldStateListenerProxy getInternalHoldListenerProxy();

    MediaMuteListenerProxy getMediaMuteListenerProxy();

    NetworkStatusListenerProxy getNetworkStatusListenerProxy();

    ParticipantStateListenerProxy getParticipantStateListenerProxy();

    ParticipantsListenerProxy getParticipantsListenerProxy();

    RateCallListenerProxy getRateCallListenersProxy();

    RecordListenerProxy getRecordProxy();

    RtcStatsListenerProxy getRtcStatsListenerProxy();

    SessionRoomAsrRecordListenerProxy getSessionRoomAsrRecordInfoProxy();

    SessionRoomRecordInfoListenerProxy getSessionRoomRecordInfoProxy();

    SessionRoomsListenerProxy getSessionRoomsListenerProxy();

    StatsListenerProxy getStatsListenerProxy();

    TopologyUpgradeStatEventListenerProxy getTopologyUpgradeListenerProxy();

    UrlSharingListenerProxy getUrlSharingListenerProxy();

    VideoQualityListenerProxy getVideoQualityListenerProxy();

    WaitingRoomListenerProxy getWaitingRoomListenerProxy();
}
