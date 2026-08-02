package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ech0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ech0(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ich0.i((izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((dnn0) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                ((e6p0) this.d).f(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ech0(izs izsVar, int i) {
        this.b = 0;
        this.d = izsVar;
        this.c = i;
    }
}
