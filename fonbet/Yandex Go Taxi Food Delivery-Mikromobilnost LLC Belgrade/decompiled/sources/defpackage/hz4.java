package defpackage;

/* loaded from: classes5.dex */
public abstract class hz4 extends p35 {
    public ike d;

    public final void c(Object obj) {
        this.a = obj;
        if (this.c) {
            b();
        }
        this.d = bvf0.M(bvf0.M(bvf0.b(), new pse(obj.getClass().getSimpleName())), new gz4(new Throwable().getStackTrace(), 0));
    }

    public void d() {
        if (this.c) {
            a();
        }
        this.a = this.b;
        ike ikeVar = this.d;
        if (ikeVar != null) {
            bvf0.i(ikeVar, "detach view from presenter", null);
        }
    }

    public final ike e() {
        ike ikeVar = this.d;
        if (ikeVar != null) {
            return ikeVar;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Using cancelled scope instead of mainScope");
        xby.d.w(illegalStateException);
        ike b = bvf0.b();
        bvf0.i(b, "Already cancelled", illegalStateException);
        return b;
    }
}
