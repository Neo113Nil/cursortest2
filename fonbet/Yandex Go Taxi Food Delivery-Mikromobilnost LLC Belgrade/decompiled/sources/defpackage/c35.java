package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class c35 implements ct41, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;

    public /* synthetic */ c35(wls wlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
    }

    @Override // defpackage.ct41
    public final /* synthetic */ boolean a(mn41 mn41Var, urd0 urd0Var) {
        switch (this.a) {
        }
        return ((Boolean) this.b.invoke(mn41Var, urd0Var)).booleanValue();
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof ct41) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof ct41) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
