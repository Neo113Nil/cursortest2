package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class e0h implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ gzs d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e0h(int i, int i2, Object obj, gzs gzsVar, boolean z) {
        this.b = i2;
        this.f = obj;
        this.c = z;
        this.d = gzsVar;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.e | 1);
                com.vk.community.design.compose.onboarding.a.a((String) this.f, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).intValue();
                int I2 = ne7.I(this.e | 1);
                ((z5u) this.f).h6(this.c, this.d, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }
}
