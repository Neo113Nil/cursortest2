package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class t7p implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gzs e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ t7p(int i, String str, gzs gzsVar, y4i0 y4i0Var, boolean z) {
        this.f = y4i0Var;
        this.g = str;
        this.d = z;
        this.e = gzsVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                y4i0 y4i0Var = (y4i0) this.f;
                String str = (String) this.g;
                ((Integer) obj2).intValue();
                a8p.f(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, str, this.e, y4i0Var, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                cup.a(this.c, this.d, this.e, (q630) this.f, (Integer) this.g, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t7p(int i, boolean z, gzs gzsVar, q630 q630Var, Integer num, int i2) {
        this.c = i;
        this.d = z;
        this.e = gzsVar;
        this.f = q630Var;
        this.g = num;
    }
}
