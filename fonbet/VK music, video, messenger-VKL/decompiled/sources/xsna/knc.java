package xsna;

import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class knc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ knc(int i, int i2, gzs gzsVar, q630 q630Var) {
        this.b = 2;
        this.d = q630Var;
        this.c = i;
        this.e = gzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                onc.a((znc) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                g3x.g((wh50) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                q630 q630Var = (q630) this.d;
                gzs gzsVar = (gzs) this.e;
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                p540.a(this.c, I, (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            case 3:
                ((Integer) obj2).intValue();
                os70.a((ObtainVerificationScreenContent) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                q630 q630Var2 = (q630) this.d;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).getClass();
                xkf0.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                rok0.c((xow) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((b1n0) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((VkTopBar.f) this.d).e((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ knc(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}
