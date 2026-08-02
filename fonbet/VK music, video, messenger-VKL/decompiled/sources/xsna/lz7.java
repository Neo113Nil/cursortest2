package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import xsna.uhg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class lz7 implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lz7(yz7 yz7Var, Object obj, yw90 yw90Var, View view, izs izsVar, int i) {
        this.d = yz7Var;
        this.e = obj;
        this.f = yw90Var;
        this.g = view;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                vz7.f((yz7) this.d, this.e, (yw90) this.f, (View) this.g, this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                hhg0.a((uhg0.a) this.d, (gzs) this.e, this.c, (gzs) this.f, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                q630 q630Var = (q630) this.d;
                r5j0 r5j0Var = (r5j0) this.e;
                xim ximVar = (xim) this.f;
                jai jaiVar = (jai) this.g;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(836075678, intValue, -1, "com.vk.core.compose.component.VkAlert.<anonymous> (VkAlert.kt:52)");
                    }
                    shu0.a(q630Var, r5j0Var, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-1092420563, new z77(jaiVar, 16), aVar), aVar, 1572864, 60);
                    boolean J = aVar.J(ximVar);
                    izs izsVar = this.c;
                    boolean J2 = J | aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J2 || x == a.C0011a.a) {
                        x = new com.vk.movika.sdk.base.logic.interactor.c(28, ximVar, izsVar);
                        aVar.R(x);
                    }
                    fo50.k(0, 1, aVar, (gzs) x, false);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lz7(q630 q630Var, r5j0 r5j0Var, xim ximVar, izs izsVar, jai jaiVar) {
        this.d = q630Var;
        this.e = r5j0Var;
        this.f = ximVar;
        this.c = izsVar;
        this.g = jaiVar;
    }

    public /* synthetic */ lz7(uhg0.a aVar, gzs gzsVar, izs izsVar, gzs gzsVar2, q630 q630Var, int i) {
        this.d = aVar;
        this.e = gzsVar;
        this.c = izsVar;
        this.f = gzsVar2;
        this.g = q630Var;
    }
}
