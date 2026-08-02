package ru.ok.android.webrtc.signaling.api;

import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.command.SignalingCommand;
import ru.ok.android.webrtc.signaling.command.SignalingCommandQueueIterator;
import xsna.kyc;

/* loaded from: classes9.dex */
public final class e extends SignalingCommandQueueIterator.CommandsQueueItem {
    public final c c;
    public final Signaling.Listener d;
    public final Signaling.Listener e;
    public final /* synthetic */ Signaling f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Signaling signaling, SignalingCommand signalingCommand, c cVar, Signaling.Listener listener, Signaling.Listener listener2) {
        super(signalingCommand, cVar.b);
        this.f = signaling;
        this.c = cVar;
        this.d = listener;
        this.e = listener2;
    }

    public final void a() {
        try {
            this.e.onResponse(new JSONObject().put("error", SignalingProtocol.ERROR_COMMAND_DISCARDED));
        } catch (Throwable th) {
            this.f.a.logException(Signaling.TAG, "Error discarding postponed command", th);
        }
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommandQueueIterator.CommandsQueueItem
    public final void onDiscard() {
        if (this.e == null) {
            return;
        }
        this.f.b.post(new kyc(this, 14));
    }

    public final String toString() {
        c cVar = this.c;
        return cVar == null ? "<unknown command>" : cVar.a;
    }
}
