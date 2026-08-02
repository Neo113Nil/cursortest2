package defpackage;

import com.yandex.plus.core.analytics.logging.PlusLogTag;

/* loaded from: classes2.dex */
public abstract class iz4 {
    public final Object a;
    public Object b;
    public boolean c;
    public final jse d;
    public ike e;

    public iz4(jse jseVar, Object obj) {
        this.a = obj;
        this.b = obj;
        this.d = jseVar;
    }

    public final void b(Object obj) {
        this.b = obj;
        if (this.c) {
            h();
        }
        this.e = c();
    }

    public final ike c() {
        return bvf0.a(cvw.U(jl40.a(), this.d).plus(new pse(this.b.getClass().getSimpleName())));
    }

    public void d() {
        if (this.c) {
            g();
        }
        this.b = this.a;
        ike ikeVar = this.e;
        if (ikeVar != null) {
            bvf0.i(ikeVar, "detach view from presenter", null);
        }
    }

    public final tse e() {
        ike ikeVar = this.e;
        if (ikeVar != null) {
            return ikeVar;
        }
        String concat = "Using cancelled scope instead of ".concat("mainScope");
        IllegalStateException illegalStateException = new IllegalStateException(concat);
        skd0.c(PlusLogTag.SDK, concat, null);
        ike c = c();
        bvf0.i(c, "Already cancelled", illegalStateException);
        return c;
    }

    public void g() {
    }

    public void h() {
    }

    public final void i() {
        boolean z = this.c;
        this.c = false;
        if (!z || this.b == this.a) {
            return;
        }
        g();
    }

    public final void j() {
        boolean z = this.c;
        this.c = true;
        if (z || this.b == this.a) {
            return;
        }
        h();
    }
}
