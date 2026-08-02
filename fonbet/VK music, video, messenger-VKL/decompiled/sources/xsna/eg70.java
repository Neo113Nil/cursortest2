package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class eg70 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;

    public /* synthetic */ eg70(int i, int i2, izs izsVar) {
        this.b = i2;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                fg70.b(this.c, aVar, ne7.I(this.d | 1));
                break;
            default:
                ich0.c(this.c, aVar, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }
}
