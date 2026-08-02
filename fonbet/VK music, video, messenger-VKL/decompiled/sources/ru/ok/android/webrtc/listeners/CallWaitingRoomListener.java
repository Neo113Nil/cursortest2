package ru.ok.android.webrtc.listeners;

import ru.ok.android.webrtc.chatroom.CallWaitingRoomEvent;

/* loaded from: classes9.dex */
public interface CallWaitingRoomListener {
    void onAttendee(CallWaitingRoomEvent.Attendee attendee);

    void onFeedback(CallWaitingRoomEvent.Feedback feedback);

    void onHandUp(CallWaitingRoomEvent.HandUp handUp);

    void onMeInWaitingRoomChanged(boolean z);

    void onPromotionUpdated(CallWaitingRoomEvent.PromotionApproved promotionApproved);
}
