package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sgp implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sgp(Object obj, long j, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.f = obj;
        this.c = j;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((tgp) this.f).a(ne7.I(this.e | 1), this.c, (androidx.compose.runtime.a) obj, this.d);
                break;
            default:
                ((Integer) obj2).intValue();
                ((tsp) this.f).a(ne7.I(this.e | 1), this.c, (androidx.compose.runtime.a) obj, this.d);
                break;
        }
        return s3q0.a;
    }
}
