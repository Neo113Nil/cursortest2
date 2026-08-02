package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.c9p0;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class g7g implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g7g(int i, q630 q630Var, int i2) {
        this.c = i;
        this.d = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-195446562, intValue, -1, "com.vk.settings.impl.presentation.base.view.ColorPickerDialog.<anonymous> (ColorPickerDialog.kt:29)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 D = s200.D(txj0.f(aVar2, 1.0f), 24);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D2 = aVar.D();
                    q630 c = qri.c(aVar, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D2, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    q630 f = txj0.f(aVar2, 1.0f);
                    String N = d370.N(R.string.sett_led_color, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.D;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, f, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar, 48, 0, 8184);
                    q630 f2 = txj0.f(aVar2, 1.0f);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new wh1(8);
                        aVar.R(x);
                    }
                    izs izsVar2 = (izs) x;
                    boolean J = aVar.J(izsVar);
                    int i = this.c;
                    boolean o = J | aVar.o(i);
                    Object x2 = aVar.x();
                    if (o || x2 == c0012a) {
                        x2 = new e7g(i, izsVar);
                        aVar.R(x2);
                    }
                    ae2.a(54, 0, aVar, izsVar2, (izs) x2, f2);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                t8s.g(this.c, ne7.I(1), (androidx.compose.runtime.a) obj, q630Var);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((c9p0.e) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ g7g(izs izsVar, int i) {
        this.d = izsVar;
        this.c = i;
    }

    public /* synthetic */ g7g(c9p0.e eVar, int i) {
        this.d = eVar;
        this.c = i;
    }
}
