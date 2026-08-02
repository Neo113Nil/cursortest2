package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes10.dex */
public final class kj2 implements m3u0 {
    public final gl11 a;
    public final oz40 b;
    public sj2 c;
    public long w;
    public long x;
    public boolean y;

    public kj2(gl11 gl11Var, Object obj, sj2 sj2Var, long j, long j2, boolean z) {
        sj2 sj2Var2;
        this.a = gl11Var;
        this.b = f.j(obj);
        if (sj2Var != null) {
            sj2Var2 = ooc.i(sj2Var);
        } else {
            sj2Var2 = (sj2) gl11Var.a.invoke(obj);
            sj2Var2.d();
        }
        this.c = sj2Var2;
        this.w = j;
        this.x = j2;
        this.y = z;
    }

    public final long a() {
        return this.x;
    }

    public final long b() {
        return this.w;
    }

    public final gl11 d() {
        return this.a;
    }

    public final Object e() {
        return this.a.b.invoke(this.c);
    }

    public final sj2 f() {
        return this.c;
    }

    public final boolean g() {
        return this.y;
    }

    @Override // defpackage.m3u0
    public final Object getValue() {
        return this.b.getValue();
    }

    public final void h(long j) {
        this.x = j;
    }

    public final void i(long j) {
        this.w = j;
    }

    public final void j(boolean z) {
        this.y = z;
    }

    public final void k(Object obj) {
        this.b.setValue(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(this.b.getValue());
        sb.append(", velocity=");
        sb.append(e());
        sb.append(", isRunning=");
        sb.append(this.y);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.w);
        sb.append(", finishedTimeNanos=");
        return b64.o(sb, this.x, ')');
    }

    public /* synthetic */ kj2(gl11 gl11Var, Object obj, sj2 sj2Var, int i) {
        this(gl11Var, obj, (i & 4) != 0 ? null : sj2Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
