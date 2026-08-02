package xsna;

import com.vk.donut.design.compose.banner.DonutBannerKt;
import xsna.dt1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class txn implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ txn(vs9 vs9Var, boolean z, gzs gzsVar, int i) {
        this.e = vs9Var;
        this.c = z;
        this.f = gzsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.d | 1);
                DonutBannerKt.a((vs9) this.e, this.c, (gzs) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                u150.i(this.c, (dt1.b) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ txn(boolean z, dt1.b bVar, q630 q630Var, int i) {
        this.c = z;
        this.e = bVar;
        this.f = q630Var;
        this.d = i;
    }
}
