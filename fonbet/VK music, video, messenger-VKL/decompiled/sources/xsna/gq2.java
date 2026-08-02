package xsna;

import xsna.wq2;

/* compiled from: AnimationState.kt */
/* loaded from: classes11.dex */
public final class gq2<T, V extends wq2> {
    public final itp0<T, V> a;
    public final T b;
    public final long c;
    public final gzs<s3q0> d;
    public final wh50 e;
    public V f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final wh50 i = androidx.compose.runtime.k.b(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public gq2(Object obj, itp0 itp0Var, wq2 wq2Var, long j, Object obj2, long j2, gzs gzsVar) {
        this.a = itp0Var;
        this.b = obj2;
        this.c = j2;
        this.d = gzsVar;
        this.e = androidx.compose.runtime.k.b(obj);
        this.f = (V) sua.f(wq2Var);
        this.g = j;
    }

    public final void a() {
        ((zak0) this.i).setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final T b() {
        return this.a.b().invoke(this.f);
    }
}
