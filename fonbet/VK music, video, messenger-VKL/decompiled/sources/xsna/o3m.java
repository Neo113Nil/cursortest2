package xsna;

import androidx.compose.runtime.a;
import xsna.lh70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class o3m implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ i6v0 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o3m(r3m r3mVar, izs izsVar, q630 q630Var, int i) {
        this.d = r3mVar;
        this.c = izsVar;
        this.e = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                r3m r3mVar = (r3m) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                r3mVar.h(ne7.I(513), (androidx.compose.runtime.a) obj, this.c, q630Var);
                break;
            default:
                th70 th70Var = (th70) this.d;
                wh50 wh50Var = (wh50) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1821471192, intValue, -1, "com.vk.settings.impl.presentation.base.mvi.settings.NotificationSettingsView.ThemedContent.<anonymous> (NotificationSettingsView.kt:74)");
                    }
                    lh70.a aVar2 = (lh70.a) ((lh70) wh50Var.getValue());
                    wh50 b = jk50.b(th70Var.f, aVar);
                    boolean y = aVar.y(th70Var);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new pf40(th70Var, 3);
                        aVar.R(x);
                    }
                    th70Var.h(aVar2, b, this.c, x, null, aVar, 0);
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

    public /* synthetic */ o3m(th70 th70Var, izs izsVar, wh50 wh50Var) {
        this.d = th70Var;
        this.c = izsVar;
        this.e = wh50Var;
    }
}
