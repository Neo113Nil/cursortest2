package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class d10 implements b470, jms {
    public final /* synthetic */ j1 a;

    public d10(j1 j1Var) {
        this.a = j1Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b470) && (obj instanceof jms)) {
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
