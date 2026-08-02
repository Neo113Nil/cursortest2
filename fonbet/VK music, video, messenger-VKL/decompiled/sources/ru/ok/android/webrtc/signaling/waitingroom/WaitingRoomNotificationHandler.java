package ru.ok.android.webrtc.signaling.waitingroom;

import org.json.JSONObject;
import ru.ok.android.webrtc.chatroom.CallWaitingRoomEvent;
import ru.ok.android.webrtc.listeners.CallWaitingRoomListener;

/* loaded from: classes9.dex */
public final class WaitingRoomNotificationHandler {
    public final WaitingRoomNotificationParser a;
    public final CallWaitingRoomListener b;

    public WaitingRoomNotificationHandler(WaitingRoomNotificationParser waitingRoomNotificationParser, CallWaitingRoomListener callWaitingRoomListener) {
        this.a = waitingRoomNotificationParser;
        this.b = callWaitingRoomListener;
    }

    public final void handleChatRoomUpdated(JSONObject jSONObject) {
        CallWaitingRoomEvent parseChatRoomUpdated = this.a.parseChatRoomUpdated(jSONObject);
        if (parseChatRoomUpdated != null) {
            if (parseChatRoomUpdated instanceof CallWaitingRoomEvent.Attendee) {
                this.b.onAttendee((CallWaitingRoomEvent.Attendee) parseChatRoomUpdated);
            } else if (parseChatRoomUpdated instanceof CallWaitingRoomEvent.Feedback) {
                this.b.onFeedback((CallWaitingRoomEvent.Feedback) parseChatRoomUpdated);
            } else if (parseChatRoomUpdated instanceof CallWaitingRoomEvent.HandUp) {
                this.b.onHandUp((CallWaitingRoomEvent.HandUp) parseChatRoomUpdated);
            }
        }
    }

    public final void handlePromotionApproved(JSONObject jSONObject) {
        CallWaitingRoomEvent.PromotionApproved parsePromotionApproved = this.a.parsePromotionApproved(jSONObject);
        if (parsePromotionApproved != null) {
            this.b.onPromotionUpdated(parsePromotionApproved);
        }
    }
}
