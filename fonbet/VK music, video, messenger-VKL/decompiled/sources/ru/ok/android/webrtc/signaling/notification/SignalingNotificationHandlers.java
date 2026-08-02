package ru.ok.android.webrtc.signaling.notification;

import ru.ok.android.webrtc.CallEvents;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.listeners.proxy.CallListenersProxy;
import ru.ok.android.webrtc.listeners.proxy.RateCallListenerProxy;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.sessionroom.CallSessionRoomsManager;
import ru.ok.android.webrtc.signaling.chat.ChatHandler;
import ru.ok.android.webrtc.signaling.contactcall.ContactCallNotificationHandler;
import ru.ok.android.webrtc.signaling.feature.CallFeatureNotificationHandler;
import ru.ok.android.webrtc.signaling.feedback.FeedbackNotificationHandler;
import ru.ok.android.webrtc.signaling.movie.MovieShareNotificationHandler;
import ru.ok.android.webrtc.signaling.parser.SignalingParsers;
import ru.ok.android.webrtc.signaling.sessionroom.SessionRoomNotificationHandler;
import ru.ok.android.webrtc.signaling.urlsharing.UrlSharingHandler;
import ru.ok.android.webrtc.signaling.waitingroom.WaitingRoomNotificationHandler;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes9.dex */
public final class SignalingNotificationHandlers {
    public final MovieShareNotificationHandler a;
    public final CallFeatureNotificationHandler b;
    public final SessionRoomNotificationHandler c;
    public final FeedbackNotificationHandler d;
    public final WaitingRoomNotificationHandler e;
    public final RateCallListenerProxy f;
    public final ContactCallNotificationHandler g;
    public final UrlSharingHandler h;
    public final ChatHandler i;

    public SignalingNotificationHandlers(CallSessionRoomsManager callSessionRoomsManager, CallParticipants callParticipants, SignalingParsers signalingParsers, wzs<? super CallEvents, Object, s3q0> wzsVar, CallListenersProxy callListenersProxy, RTCLog rTCLog) {
        this.a = new MovieShareNotificationHandler(callParticipants, signalingParsers.movieSharesInfoParser, wzsVar);
        this.b = new CallFeatureNotificationHandler(wzsVar, rTCLog, signalingParsers.featureParser, signalingParsers.rolesParser);
        this.c = new SessionRoomNotificationHandler(signalingParsers.sessionRoomUpdateParser, signalingParsers.sessionRoomParticipantsUpdateParser, signalingParsers.sessionRoomsParser, callSessionRoomsManager);
        this.d = new FeedbackNotificationHandler(rTCLog, signalingParsers.feedbackParser, signalingParsers.sessionRoomCommonParser, callListenersProxy.getFeedbackListenerProxy());
        this.e = new WaitingRoomNotificationHandler(signalingParsers.waitingRoomParser, callListenersProxy.getWaitingRoomListenerProxy());
        this.f = callListenersProxy.getRateCallListenersProxy();
        this.g = new ContactCallNotificationHandler(callParticipants, signalingParsers.contactCallParser, callListenersProxy.getContactCallListenerProxy());
        this.h = new UrlSharingHandler(callListenersProxy.getUrlSharingListenerProxy(), signalingParsers.urlSharingParser);
        this.i = new ChatHandler(callListenersProxy.getChatListenerProxy(), signalingParsers.chatParser);
    }

    public final CallFeatureNotificationHandler getCallFeatureNotificationHandler() {
        return this.b;
    }

    public final ChatHandler getChatHandler() {
        return this.i;
    }

    public final ContactCallNotificationHandler getContactCallNotificationHandler() {
        return this.g;
    }

    public final FeedbackNotificationHandler getFeedbackNotificationHandler() {
        return this.d;
    }

    public final MovieShareNotificationHandler getMovieShareNotificationHandler() {
        return this.a;
    }

    public final RateCallListenerProxy getRateCallHandler() {
        return this.f;
    }

    public final SessionRoomNotificationHandler getSessionRoomNotificationHandler() {
        return this.c;
    }

    public final UrlSharingHandler getUrlSharingHandler() {
        return this.h;
    }

    public final WaitingRoomNotificationHandler getWaitingRoomNotificationHandler() {
        return this.e;
    }
}
