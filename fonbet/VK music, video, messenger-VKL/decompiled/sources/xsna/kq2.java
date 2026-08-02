package xsna;

import xsna.wq2;

/* compiled from: AnimationState.kt */
/* loaded from: classes11.dex */
public final class kq2<T, V extends wq2> implements mtk0<T> {
    public final itp0<T, V> b;
    public final wh50 c;
    public V d;
    public long e;
    public long f;
    public boolean g;

    public /* synthetic */ kq2(itp0 itp0Var, Object obj, wq2 wq2Var, int i) {
        this(itp0Var, obj, (i & 4) != 0 ? null : wq2Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final T c() {
        return this.b.b().invoke(this.d);
    }

    @Override // xsna.mtk0
    public final T getValue() {
        return (T) ((zak0) this.c).getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(((zak0) this.c).getValue());
        sb.append(", velocity=");
        sb.append(c());
        sb.append(", isRunning=");
        sb.append(this.g);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.e);
        sb.append(", finishedTimeNanos=");
        return vu5.a(')', this.f, sb);
    }

    public kq2(itp0<T, V> itp0Var, T t, V v, long j, long j2, boolean z) {
        V invoke;
        this.b = itp0Var;
        this.c = androidx.compose.runtime.k.b(t);
        if (v != null) {
            invoke = (V) sua.f(v);
        } else {
            invoke = itp0Var.a().invoke(t);
            invoke.d();
        }
        this.d = invoke;
        this.e = j;
        this.f = j2;
        this.g = z;
    }
}
