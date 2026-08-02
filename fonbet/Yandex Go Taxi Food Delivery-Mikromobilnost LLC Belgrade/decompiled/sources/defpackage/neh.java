package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;

/* loaded from: classes10.dex */
public final class neh implements kb10 {
    public final qzt0 a;
    public final meh b;
    public fyi0 c;
    public kb10 w;
    public boolean x = true;
    public boolean y;

    public neh(meh mehVar, y3c y3cVar) {
        this.b = mehVar;
        this.a = new qzt0(y3cVar);
    }

    public final void a(fyi0 fyi0Var) {
        kb10 kb10Var;
        kb10 mediaClock = fyi0Var.getMediaClock();
        if (mediaClock == null || mediaClock == (kb10Var = this.w)) {
            return;
        }
        if (kb10Var != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.w = mediaClock;
        this.c = fyi0Var;
        mediaClock.setPlaybackParameters((lxc0) this.a.x);
    }

    @Override // defpackage.kb10
    public final boolean b() {
        if (this.x) {
            this.a.getClass();
            return false;
        }
        kb10 kb10Var = this.w;
        kb10Var.getClass();
        return kb10Var.b();
    }

    @Override // defpackage.kb10
    public final long g() {
        if (this.x) {
            return this.a.g();
        }
        kb10 kb10Var = this.w;
        kb10Var.getClass();
        return kb10Var.g();
    }

    @Override // defpackage.kb10
    /* renamed from: getPlaybackParameters */
    public final lxc0 mo496getPlaybackParameters() {
        kb10 kb10Var = this.w;
        return kb10Var != null ? kb10Var.mo496getPlaybackParameters() : (lxc0) this.a.x;
    }

    @Override // defpackage.kb10
    public final void setPlaybackParameters(lxc0 lxc0Var) {
        kb10 kb10Var = this.w;
        if (kb10Var != null) {
            kb10Var.setPlaybackParameters(lxc0Var);
            lxc0Var = this.w.mo496getPlaybackParameters();
        }
        this.a.setPlaybackParameters(lxc0Var);
    }
}
