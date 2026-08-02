package xsna;

import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.listeners.CallParticipantsListener;
import ru.ok.android.webrtc.stereo.CallStereoRoom;

/* loaded from: classes8.dex */
public final class wwy0 implements CallParticipantsListener {
    public final /* synthetic */ CallStereoRoom b;

    public wwy0(CallStereoRoom callStereoRoom) {
        this.b = callStereoRoom;
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public final void onCallParticipantsAdded(CallParticipantsListener.AddedParams addedParams) {
        Call call;
        Call call2;
        Call call3;
        CallStereoRoom callStereoRoom = this.b;
        call = callStereoRoom.a;
        if (call.isAnswered()) {
            return;
        }
        call2 = callStereoRoom.a;
        if (call2.getParticipants().isEmpty()) {
            return;
        }
        call3 = callStereoRoom.a;
        call3.onUserAnswered();
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public final void onCallParticipantsChanged(CallParticipantsListener.ChangedParams changedParams) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public final void onCallParticipantsDeAnonimized(CallParticipantsListener.DeAnonParams deAnonParams) {
    }

    @Override // ru.ok.android.webrtc.listeners.CallParticipantsListener
    public final void onCallParticipantsRemoved(CallParticipantsListener.RemovedParams removedParams) {
    }
}
