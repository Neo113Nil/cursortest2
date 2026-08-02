package xsna;

import androidx.compose.runtime.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lhf implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lhf(yhf yhfVar, xhf xhfVar, Object obj, q630 q630Var) {
        this.d = yhfVar;
        this.e = xhfVar;
        this.f = obj;
        this.c = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                yhf yhfVar = (yhf) this.d;
                xhf xhfVar = (xhf) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(660919814, intValue, -1, "com.vk.clips.upload.ui.impl.compose.views.ClipsUploadScreenContainer.<anonymous> (ClipsUploadScreen.kt:109)");
                    }
                    if (yhfVar != null) {
                        aVar.K(1332133475);
                        z7f0 z7f0Var = xhfVar.j;
                        boolean J = aVar.J(xhfVar);
                        Object x = aVar.x();
                        if (J || x == a.C0011a.a) {
                            x = new fre(xhfVar, 6);
                            aVar.R(x);
                        }
                        vhf.a(yhfVar, z7f0Var, (izs) x, this.f, this.c, aVar, 24576);
                    } else {
                        aVar.K(1326334460);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                l3k.a((keb0) this.d, (w7b0) this.e, this.c, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lhf(keb0 keb0Var, w7b0 w7b0Var, q630 q630Var, izs izsVar, int i) {
        this.d = keb0Var;
        this.e = w7b0Var;
        this.c = q630Var;
        this.f = izsVar;
    }
}
