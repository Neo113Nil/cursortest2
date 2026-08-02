package xsna;

import xsna.by40;

/* compiled from: MusicPlayerFeature.kt */
/* loaded from: classes3.dex */
public final class uw40 implements uww {
    public final /* synthetic */ rw40 a;

    public uw40(rw40 rw40Var) {
        this.a = rw40Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uww
    public final void a(boolean z) {
        rw40 rw40Var = this.a;
        if (((Boolean) rw40Var.E.getValue()).booleanValue()) {
            rw40Var.T(new by40.l(z));
        }
    }
}
