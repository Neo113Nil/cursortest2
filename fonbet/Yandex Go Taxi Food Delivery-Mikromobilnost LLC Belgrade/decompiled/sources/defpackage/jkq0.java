package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class jkq0 implements mv60, jms {
    public final /* synthetic */ sls a;

    public jkq0(sls slsVar) {
        this.a = slsVar;
    }

    @Override // defpackage.mv60
    public final /* synthetic */ long a() {
        return ((wu60) this.a.invoke()).a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof mv60) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
