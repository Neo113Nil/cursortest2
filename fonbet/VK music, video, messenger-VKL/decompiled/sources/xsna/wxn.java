package xsna;

import com.vk.donut.design.compose.banner.DonutBannerKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wxn implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wxn(int i, q630 q630Var, boolean z) {
        this.c = z;
        this.e = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.d | 1);
                DonutBannerKt.l((gvw) this.e, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                u150.l(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, q630Var, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wxn(gvw gvwVar, boolean z, int i) {
        this.e = gvwVar;
        this.c = z;
        this.d = i;
    }
}
