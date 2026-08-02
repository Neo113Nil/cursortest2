package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class j95 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j95(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                k95.d((l95) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((es7) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((w8d0) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((z1f0) this.d).A(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((e6p0) this.d).i(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                apu0.b((com.vk.core.compose.component.datetime.d) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ j95(es7 es7Var, int i) {
        this.b = 1;
        this.d = es7Var;
        this.c = i;
    }

    public /* synthetic */ j95(w8d0 w8d0Var, int i) {
        this.b = 2;
        this.d = w8d0Var;
        this.c = i;
    }
}
