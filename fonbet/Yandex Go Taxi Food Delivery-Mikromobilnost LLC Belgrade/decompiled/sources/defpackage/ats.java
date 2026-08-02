package defpackage;

/* loaded from: classes.dex */
public final class ats {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ats(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bts btsVar = (bts) obj;
                btsVar.A--;
                break;
            default:
                m3t0 m3t0Var = (m3t0) obj;
                m3t0Var.k--;
                break;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((bts) obj).A++;
                break;
            default:
                ((m3t0) obj).k++;
                break;
        }
    }
}
