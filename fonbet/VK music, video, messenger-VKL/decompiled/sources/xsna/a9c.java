package xsna;

import java.util.List;
import xsna.ggp0;
import xsna.o9c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class a9c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a9c(int i, int i2, Object obj, Object obj2, xzs xzsVar) {
        this.b = i2;
        this.d = obj;
        this.c = xzsVar;
        this.e = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                b9c.a((o9c.d) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((hdn) this.d).h((ken) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((k3v) this.d).i((l3v) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                nc70 nc70Var = (nc70) this.d;
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                nc70Var.i(ne7.I(513), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            case 4:
                vfp0 vfp0Var = (vfp0) this.d;
                izs<? super tfp0, s3q0> izsVar = (izs) this.c;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-103383059, intValue, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.TrackMenuContentView.ThemedContent.<anonymous> (TrackMenuContentView.kt:69)");
                    }
                    vfp0Var.i((ggp0.a) mtk0Var.getValue(), izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                List list = (List) this.d;
                izs izsVar2 = (izs) this.c;
                wzs wzsVar = (wzs) this.e;
                ((Integer) obj2).getClass();
                ret0.a(ne7.I(1), (androidx.compose.runtime.a) obj, list, izsVar2, wzsVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ a9c(vfp0 vfp0Var, izs izsVar, wh50 wh50Var) {
        this.b = 4;
        this.d = vfp0Var;
        this.c = izsVar;
        this.e = wh50Var;
    }

    public /* synthetic */ a9c(i6v0 i6v0Var, ao50 ao50Var, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = i6v0Var;
        this.e = ao50Var;
        this.c = izsVar;
    }
}
