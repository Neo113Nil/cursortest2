package xsna;

import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import xsna.sx80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ax implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ax(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                kx kxVar = (kx) this.d;
                gzs gzsVar = (gzs) this.e;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                kxVar.n(ne7.I(513), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            case 1:
                q630 q630Var2 = (q630) this.c;
                String str = (String) this.d;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).getClass();
                xa4.h(ne7.I(1), (androidx.compose.runtime.a) obj, str, izsVar, q630Var2);
                break;
            case 2:
                kkd kkdVar = (kkd) this.d;
                ViewGroup viewGroup = (ViewGroup) this.e;
                ComposeView composeView = (ComposeView) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1527843214, intValue, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.ClipsBottomSheetRedesign.show.<anonymous>.<anonymous> (ClipsBottomSheetRedesign.kt:29)");
                    }
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = androidx.compose.runtime.k.b(Boolean.TRUE);
                        aVar.R(x);
                    }
                    wh50 wh50Var = (wh50) x;
                    if (((Boolean) wh50Var.getValue()).booleanValue()) {
                        aVar.K(-2086101055);
                        boolean y = aVar.y(viewGroup) | aVar.y(composeView) | aVar.y(kkdVar);
                        Object x2 = aVar.x();
                        if (y || x2 == c0012a) {
                            x2 = new ura(wh50Var, viewGroup, composeView, kkdVar, 1);
                            aVar.R(x2);
                        }
                        kkdVar.a((gzs) x2, aVar, 0);
                    } else {
                        aVar.K(-2087454732);
                    }
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                d3k.a((n3k) this.d, (izs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.a) this.d).h((ija0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 5:
                ((Integer) obj2).getClass();
                nu80.c((sx80.a.d) this.d, (izs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                n7d0.c((o7d0) this.d, (q630) this.c, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                rzi0.b((szi0) this.d, (izs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            default:
                ((Integer) obj2).getClass();
                ((syq0) this.d).h((tyq0) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ax(int i, String str, izs izsVar, q630 q630Var) {
        this.b = 1;
        this.c = q630Var;
        this.d = str;
        this.e = izsVar;
    }

    public /* synthetic */ ax(kkd kkdVar, ViewGroup viewGroup, ComposeView composeView) {
        this.b = 2;
        this.d = kkdVar;
        this.e = viewGroup;
        this.c = composeView;
    }

    public /* synthetic */ ax(o7d0 o7d0Var, q630 q630Var, gzs gzsVar, int i) {
        this.b = 6;
        this.d = o7d0Var;
        this.c = q630Var;
        this.e = gzsVar;
    }
}
