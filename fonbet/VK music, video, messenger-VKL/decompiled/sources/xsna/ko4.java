package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.player.PlaybackActionMeta;

/* compiled from: AudioFocusOrchestraPartImpl.kt */
/* loaded from: classes3.dex */
public final class ko4 implements jo4, xza0 {
    public final /* synthetic */ xza0 b;
    public final xv40 c;
    public final fu80 d;
    public final int e;
    public final bpn0 f;

    public ko4(xv40 xv40Var, fu80 fu80Var, int i) {
        xza0 xza0Var = xv40Var.d;
        if (xza0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.b = xza0Var;
        this.c = xv40Var;
        this.d = fu80Var;
        this.e = i;
        if (!epx.f(xv40Var.e, this)) {
            xv40Var.d(this);
        }
        this.f = new bpn0(new z34(1));
    }

    public final void G(boolean z, boolean z2) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"orchestraMode=" + this.e + ", focusLoss=" + z + ", isStop=" + z2});
        }
        xv40 xv40Var = this.c;
        if (!epx.f(xv40Var.e, this)) {
            xv40Var.d(this);
        }
        q().d(this, z, z2);
    }

    public final void I() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"orchestraMode=" + this.e});
        }
        xv40 xv40Var = this.c;
        if (!epx.f(xv40Var.e, this)) {
            xv40Var.d(this);
        }
        q().a(this);
    }

    @Override // xsna.xza0
    public final boolean M(boolean z, PlaybackActionMeta playbackActionMeta, String str) {
        xza0 xza0Var = this.c.d;
        boolean z2 = false;
        if (xza0Var != null && xza0Var.M(true, playbackActionMeta, null)) {
            z2 = true;
        }
        if (q().b(this) != 1 && z2 && this.e == 1) {
            I();
        }
        return z2;
    }

    public final void R() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"orchestraMode=" + this.e});
        }
        q().c(this);
        xv40 xv40Var = this.c;
        xv40Var.d(xv40Var.d);
    }

    @Override // xsna.xza0
    public final boolean f(PlaybackActionMeta playbackActionMeta) {
        xza0 xza0Var = this.c.d;
        boolean z = false;
        if (xza0Var != null && xza0Var.f(playbackActionMeta)) {
            z = true;
        }
        if (q().b(this) != 1 && z && this.e == 1) {
            I();
        }
        return z;
    }

    @Override // xsna.jo4
    public final fu80 getConfig() {
        return this.d;
    }

    @Override // xsna.xza0
    public final float getVolume() {
        return this.b.getVolume();
    }

    @Override // xsna.jo4
    public final xv40 h() {
        return this.c;
    }

    @Override // xsna.xza0
    public final boolean m(String str, int i, boolean z, boolean z2) {
        xza0 xza0Var = this.c.d;
        boolean z3 = xza0Var != null && xza0Var.m(null, i, z, z2);
        int b = q().b(this);
        if (b != 2 && b != 4 && z3 && this.e == 1) {
            G(z, false);
        }
        return z3;
    }

    public final lo4 q() {
        return (lo4) this.f.getValue();
    }

    @Override // xsna.xza0
    public final void setVolume(float f) {
        this.b.setVolume(f);
    }

    @Override // xsna.xza0
    public final void stop(int i) {
        xza0 xza0Var = this.c.d;
        if (xza0Var != null) {
            xza0Var.stop(i);
            if (this.e == 1) {
                G(false, true);
            }
            R();
        }
    }
}
