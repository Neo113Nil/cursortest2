package xsna;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.sht0;

/* compiled from: PrefetchScrollHelperWrapper.kt */
/* loaded from: classes17.dex */
public final class i0d0<T extends sht0> implements v1b0 {
    public final xmf<T> a;
    public final v1b0 b;
    public final mgk0 c;
    public final m960 d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new tju(this, 21));

    public i0d0(xmf xmfVar, v1b0 v1b0Var, mgk0 mgk0Var, m960 m960Var) {
        this.a = xmfVar;
        this.b = v1b0Var;
        this.c = mgk0Var;
        this.d = m960Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.v1b0
    public final t1b0 a(int i) {
        t1b0 a = this.b.a(i);
        if (a != null) {
            return new u1b0(i, a, (w0d0) this.e.getValue());
        }
        return null;
    }

    @Override // xsna.v1b0
    public final List<Integer> b() {
        return this.b.b();
    }
}
