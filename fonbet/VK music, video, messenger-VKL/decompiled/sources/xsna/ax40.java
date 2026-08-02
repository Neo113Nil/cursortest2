package xsna;

import xsna.by40;

/* compiled from: MusicPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class ax40 implements gzs<s3q0> {
    public final /* synthetic */ rw40 b;
    public final /* synthetic */ com.vk.music.player.f c;
    public final /* synthetic */ rw40 d;

    public ax40(rw40 rw40Var, com.vk.music.player.f fVar, rw40 rw40Var2) {
        this.b = rw40Var;
        this.c = fVar;
        this.d = rw40Var2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (((sy40) this.b.f.c).s == null && this.c.c() != null) {
            this.d.T(new by40.s(this.c.c()));
        }
        return s3q0.a;
    }
}
