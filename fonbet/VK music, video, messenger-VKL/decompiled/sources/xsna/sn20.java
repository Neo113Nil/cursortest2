package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sn20 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sn20(Object obj, boolean z, xzs xzsVar, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = z;
        this.f = xzsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.d | 1);
                un20.c((com.vk.notifications.core.item.a) this.e, this.c, (izs) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                ((ar20) this.e).b(this.c, (jai) this.f, (androidx.compose.runtime.a) obj, I2);
                break;
            default:
                ((Integer) obj2).intValue();
                int I3 = ne7.I(this.d | 1);
                mwd0.c((gzs) this.e, (dwd0) this.f, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sn20(gzs gzsVar, dwd0 dwd0Var, boolean z, int i) {
        this.b = 2;
        this.e = gzsVar;
        this.f = dwd0Var;
        this.c = z;
        this.d = i;
    }
}
