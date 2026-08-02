package ru.ok.android.webrtc.stereo;

import ru.ok.android.webrtc.Call;
import xsna.wwy0;

/* loaded from: classes9.dex */
public final class CallStereoRoom {
    public final Call a;
    public wwy0 b;

    public CallStereoRoom(Call call) {
        this.a = call;
    }

    public final boolean canAnswerRightNow() {
        if (!this.a.getParticipants().isEmpty()) {
            return true;
        }
        if (this.b != null) {
            return false;
        }
        wwy0 wwy0Var = new wwy0(this);
        this.a.getCallListenersCollection().addParticipantsListener(wwy0Var);
        this.b = wwy0Var;
        return false;
    }

    public final boolean isActive() {
        return this.a.containsInOptions(Call.Option.AUDIENCE_MODE);
    }

    public final void onUserAnswered() {
        wwy0 wwy0Var = this.b;
        if (wwy0Var != null) {
            this.a.getCallListenersCollection().removeParticipantsListener(wwy0Var);
            this.b = null;
        }
    }
}
