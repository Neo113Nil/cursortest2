package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zf0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zf0(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                cg0.a((dg0) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((vr9) this.e).a((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                q630 q630Var = (q630) this.c;
                gzs gzsVar = (gzs) this.e;
                ((Integer) obj2).getClass();
                uau.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            default:
                ((Integer) obj2).intValue();
                obp0.b((bbp0) this.e, (jap0) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zf0(q630 q630Var, gzs gzsVar, int i) {
        this.b = 2;
        this.c = q630Var;
        this.e = gzsVar;
        this.d = i;
    }
}
