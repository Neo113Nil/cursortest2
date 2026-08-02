package yads;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.Objects;
import xsna.az4;

/* loaded from: classes10.dex */
public final class yb0 {
    public final Handler a = new Handler();
    public final xb0 b = new xb0(this);
    public final /* synthetic */ zb0 c;

    public yb0(zb0 zb0Var) {
        this.c = zb0Var;
    }

    public final void a(AudioTrack audioTrack) {
        Handler handler = this.a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new az4(handler), this.b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
