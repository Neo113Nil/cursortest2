package xsna;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.ExoPlaybackException;

/* compiled from: DefaultMediaClock.java */
/* loaded from: classes12.dex */
public final class gil implements cq10 {
    public final dpk0 b;
    public final androidx.media3.exoplayer.d c;

    @Nullable
    public androidx.media3.exoplayer.j d;

    @Nullable
    public cq10 e;
    public boolean f = true;
    public boolean g;

    public gil(androidx.media3.exoplayer.d dVar, dvf dvfVar) {
        this.c = dVar;
        this.b = new dpk0(dvfVar);
    }

    public final void a(androidx.media3.exoplayer.j jVar) throws ExoPlaybackException {
        cq10 cq10Var;
        cq10 mediaClock = jVar.getMediaClock();
        if (mediaClock == null || mediaClock == (cq10Var = this.e)) {
            return;
        }
        if (cq10Var != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.e = mediaClock;
        this.d = jVar;
        mediaClock.b(this.b.f);
    }

    @Override // xsna.cq10
    public final void b(jwa0 jwa0Var) {
        cq10 cq10Var = this.e;
        if (cq10Var != null) {
            cq10Var.b(jwa0Var);
            jwa0Var = this.e.getPlaybackParameters();
        }
        this.b.b(jwa0Var);
    }

    @Override // xsna.cq10
    public final jwa0 getPlaybackParameters() {
        cq10 cq10Var = this.e;
        return cq10Var != null ? cq10Var.getPlaybackParameters() : this.b.f;
    }

    @Override // xsna.cq10
    public final long getPositionUs() {
        if (this.f) {
            return this.b.getPositionUs();
        }
        cq10 cq10Var = this.e;
        cq10Var.getClass();
        return cq10Var.getPositionUs();
    }

    @Override // xsna.cq10
    public final boolean l() {
        if (this.f) {
            this.b.getClass();
            return false;
        }
        cq10 cq10Var = this.e;
        cq10Var.getClass();
        return cq10Var.l();
    }
}
