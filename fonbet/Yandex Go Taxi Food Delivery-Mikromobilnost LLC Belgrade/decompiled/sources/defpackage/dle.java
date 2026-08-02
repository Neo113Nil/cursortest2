package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class dle implements pq60, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ dle(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.pq60
    public final /* synthetic */ void a(Object obj) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                ((vqb) tlsVar).invoke(obj);
                break;
            case 1:
                ((dye) tlsVar).invoke(obj);
                break;
            case 2:
                ((dye) tlsVar).invoke(obj);
                break;
            case 3:
                ((xtf) tlsVar).invoke(obj);
                break;
            case 4:
                ((g8m0) tlsVar).invoke(obj);
                break;
            case 5:
                ((wx11) tlsVar).invoke(obj);
                break;
            default:
                ((wx11) tlsVar).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof pq60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof pq60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof pq60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof pq60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof pq60) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof pq60) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof pq60) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
        }
        return (wx11) tlsVar;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
