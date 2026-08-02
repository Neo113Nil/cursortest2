package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class b35 implements vhw0, jms {
    public final /* synthetic */ sls a;

    public b35(sls slsVar) {
        this.a = slsVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vhw0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.vhw0
    public final /* synthetic */ Object get() {
        return this.a.invoke();
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
