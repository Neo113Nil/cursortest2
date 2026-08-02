package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rbo implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ rbo(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ybo.c((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ibp0.a((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((lrq0) this.c).d(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }
}
