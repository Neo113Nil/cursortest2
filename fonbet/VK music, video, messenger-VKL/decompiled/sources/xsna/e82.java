package xsna;

import android.content.Context;

/* compiled from: AndroidOverscroll.android.kt */
/* loaded from: classes11.dex */
public final class e82 implements f490 {
    public final Context a;
    public final azl b;
    public final long c;
    public final s890 d;

    public e82(Context context, azl azlVar, long j, s890 s890Var) {
        this.a = context;
        this.b = azlVar;
        this.c = j;
        this.d = s890Var;
    }

    @Override // xsna.f490
    public final d82 a() {
        return new d82(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e82.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e82 e82Var = (e82) obj;
        return epx.f(this.a, e82Var.a) && epx.f(this.b, e82Var.b) && l5g.d(this.c, e82Var.c) && epx.f(this.d, e82Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = l5g.l;
        return this.d.hashCode() + bh10.a(hashCode, 31, this.c);
    }
}
