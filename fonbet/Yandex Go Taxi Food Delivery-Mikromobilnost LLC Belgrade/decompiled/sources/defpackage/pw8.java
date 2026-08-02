package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class pw8 implements ays, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ pw8(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.ays
    public final /* synthetic */ void a(Object obj) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(obj);
                break;
            case 1:
                tlsVar.invoke(obj);
                break;
            case 2:
                tlsVar.invoke(obj);
                break;
            case 3:
                tlsVar.invoke(obj);
                break;
            default:
                tlsVar.invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
