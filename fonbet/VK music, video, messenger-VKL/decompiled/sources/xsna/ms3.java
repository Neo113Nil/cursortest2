package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ms3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ms3(int i, int i2, gzs gzsVar) {
        this.b = 4;
        this.c = i;
        this.d = gzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                os3.d((ds3) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((noa) this.d).d(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                ((Integer) obj2).intValue();
                r510.a((izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                ((ala0) this.d).b(this.c, I, (androidx.compose.runtime.a) obj);
                break;
            default:
                gzs gzsVar = (gzs) this.d;
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                kci.a(this.c, I2, (androidx.compose.runtime.a) obj, gzsVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ms3(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    public /* synthetic */ ms3(ala0 ala0Var, int i, int i2) {
        this.b = 3;
        this.d = ala0Var;
        this.c = i;
    }
}
