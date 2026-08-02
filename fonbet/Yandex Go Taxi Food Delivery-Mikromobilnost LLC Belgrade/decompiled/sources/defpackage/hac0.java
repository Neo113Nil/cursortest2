package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class hac0 implements sy60, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ hac0(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
            case 1:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof sy60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof sy60) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof sy60) && (obj instanceof jms)) {
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
