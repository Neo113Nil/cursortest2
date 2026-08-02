package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class u38 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gzs d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u38(int i, int i2, Object obj, gzs gzsVar, boolean z) {
        this.b = i2;
        this.c = z;
        this.d = gzsVar;
        this.f = obj;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.e | 1);
                v38.a(this.c, this.d, (gzs) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                ofp.a(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, this.d, q630Var, this.c);
                break;
        }
        return s3q0.a;
    }
}
