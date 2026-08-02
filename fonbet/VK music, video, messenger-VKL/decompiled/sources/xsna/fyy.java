package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoBottomSheetCallback.kt */
/* loaded from: classes2.dex */
public final class fyy implements l6s0 {
    public final gzs<l6s0> b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new ecm(this, 19));

    /* JADX WARN: Multi-variable type inference failed */
    public fyy(gzs<? extends l6s0> gzsVar) {
        this.b = gzsVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l6s0
    public final k6s0 Y4() {
        l6s0 l6s0Var = (l6s0) this.c.getValue();
        if (l6s0Var != null) {
            return l6s0Var.Y4();
        }
        return null;
    }
}
