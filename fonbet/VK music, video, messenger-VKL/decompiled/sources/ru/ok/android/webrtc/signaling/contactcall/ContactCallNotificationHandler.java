package ru.ok.android.webrtc.signaling.contactcall;

import org.json.JSONObject;
import ru.ok.android.webrtc.listeners.CallContactCallListener;
import ru.ok.android.webrtc.listeners.proxy.ContactCallListenerProxy;
import ru.ok.android.webrtc.participant.CallExternalId;
import ru.ok.android.webrtc.participant.CallParticipants;
import ru.ok.android.webrtc.signaling.contactcall.event.SignalingDecorativeIdChangedEvent;

/* loaded from: classes9.dex */
public final class ContactCallNotificationHandler {
    public final CallParticipants a;
    public final ContactCallParser b;
    public final ContactCallListenerProxy c;

    public ContactCallNotificationHandler(CallParticipants callParticipants, ContactCallParser contactCallParser, ContactCallListenerProxy contactCallListenerProxy) {
        this.a = callParticipants;
        this.b = contactCallParser;
        this.c = contactCallListenerProxy;
    }

    public final void onDecorativeIdChanged(JSONObject jSONObject) {
        CallExternalId decorativeExternalParticipantId;
        SignalingDecorativeIdChangedEvent parseChangedDecorativeId = this.b.parseChangedDecorativeId(jSONObject);
        if (parseChangedDecorativeId == null || (decorativeExternalParticipantId = parseChangedDecorativeId.getDecorativeExternalParticipantId()) == null || this.a.getParticipant(parseChangedDecorativeId.getParticipantId()) == null) {
            return;
        }
        this.a.deAnon(parseChangedDecorativeId.getParticipantId(), parseChangedDecorativeId.getDecorativeExternalParticipantId());
        this.c.onDecorativeParticipantIdChanged(new CallContactCallListener.DecorativeParticipantIdChanged(parseChangedDecorativeId.getParticipantId(), decorativeExternalParticipantId));
    }
}
