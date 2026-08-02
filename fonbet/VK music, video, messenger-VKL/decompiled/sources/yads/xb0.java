package yads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes10.dex */
public final class xb0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ yb0 a;

    public xb0(yb0 yb0Var) {
        this.a = yb0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        mo2 mo2Var;
        zb0 zb0Var = this.a.c;
        if (audioTrack != zb0Var.u) {
            throw new IllegalStateException();
        }
        gl glVar = zb0Var.r;
        if (glVar == null || !zb0Var.U || (mo2Var = ((fl1) glVar).a.Q0) == null) {
            return;
        }
        ((bo0) mo2Var).a.i.a.sendEmptyMessage(2);
    }

    public final void onTearDown(AudioTrack audioTrack) {
        mo2 mo2Var;
        zb0 zb0Var = this.a.c;
        if (audioTrack != zb0Var.u) {
            throw new IllegalStateException();
        }
        gl glVar = zb0Var.r;
        if (glVar == null || !zb0Var.U || (mo2Var = ((fl1) glVar).a.Q0) == null) {
            return;
        }
        ((bo0) mo2Var).a.i.a.sendEmptyMessage(2);
    }
}
