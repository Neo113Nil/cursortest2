package xsna;

import com.vk.profile.design.compose.header.AuthorHeaderConfig;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class u3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u3(Object obj, boolean z, gzs gzsVar, Object obj2, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = z;
        this.f = gzsVar;
        this.g = obj2;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((x3) this.e).c((AuthorHeaderConfig.Info.InfoSlotData.b.a) this.f, this.c, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((hr0) this.e).k(this.c, (gzs) this.f, (jai) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                col colVar = (col) this.e;
                gzs gzsVar = (gzs) this.f;
                q630 q630Var = (q630) this.g;
                ((Integer) obj2).getClass();
                colVar.b(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, gzsVar, q630Var, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ u3(x3 x3Var, AuthorHeaderConfig.Info.InfoSlotData.b.a aVar, boolean z, q630 q630Var, int i) {
        this.b = 0;
        this.e = x3Var;
        this.f = aVar;
        this.c = z;
        this.g = q630Var;
        this.d = i;
    }
}
