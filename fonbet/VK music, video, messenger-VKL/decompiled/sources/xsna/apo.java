package xsna;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: DynamicColorHolder.kt */
/* loaded from: classes17.dex */
public final class apo {
    public int a;
    public Integer b;
    public boolean c;
    public int d;

    public apo(int i) {
        this.a = i;
        TypedValue typedValue = krv0.a;
        this.b = krv0.b();
        this.d = krv0.m(this.a, b());
    }

    public final int a() {
        Integer num = this.b;
        TypedValue typedValue = krv0.a;
        if (!epx.f(num, krv0.b())) {
            this.b = krv0.b();
            this.d = krv0.m(this.a, b());
        }
        return this.d;
    }

    public final Context b() {
        if (!this.c) {
            dhr0.a.getClass();
            return dhr0.E();
        }
        dhr0.a.getClass();
        cpn0 cpn0Var = dhr0.s;
        qcy<Object> qcyVar = dhr0.b[1];
        return (Context) cpn0Var.a();
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = krv0.m(this.a, b());
    }
}
