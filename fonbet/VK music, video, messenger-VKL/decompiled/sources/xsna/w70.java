package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.j;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.List;
import xsna.cri;
import xsna.d280;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class w70 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w70(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
        this.e = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                List list = (List) this.d;
                q630 q630Var = (q630) this.c;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).getClass();
                z70.b(ne7.I(1), (androidx.compose.runtime.a) obj, list, izsVar, q630Var);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                xi1.f((tl1) this.d, (String) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ex9.a((izs) this.e, (CartItem) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((d9k) this.d).h((g9k) this.c, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 4:
                izs izsVar2 = (izs) this.e;
                mc90 mc90Var = (mc90) this.d;
                mtk0 mtk0Var = (mtk0) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(457263580, intValue, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContentLego.<anonymous>.<anonymous> (GamesCatalogMainTabScreen.kt:198)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630.a aVar2 = q630.a.a;
                    q630 c = qri.c(aVar, aVar2);
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
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    u6t.a((tet) mtk0Var.getValue(), izsVar2, txj0.f(aVar2, 1.0f), aVar, 384);
                    r6t.a(mc90Var, null, aVar, 0);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 5:
                String str = (String) this.d;
                gzs gzsVar = (gzs) this.e;
                q630 q630Var2 = (q630) this.c;
                ((Integer) obj2).getClass();
                rqw.b(ne7.I(1), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var2);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                fe00.b((j.a) this.d, (gzs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                vm30 vm30Var = (vm30) this.d;
                MsgFromUser msgFromUser = (MsgFromUser) this.c;
                fm20 fm20Var = (fm20) this.e;
                ym30 ym30Var = vm30Var.t0;
                if (ym30Var != null) {
                    ym30Var.g0(msgFromUser);
                }
                fm20Var.invoke();
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                n080.b((d280.a) this.d, (izs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                twu0.c((jys) this.d, (mc90) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ w70(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = q630Var;
    }

    public /* synthetic */ w70(izs izsVar, CartItem cartItem, q630 q630Var, int i) {
        this.b = 2;
        this.e = izsVar;
        this.d = cartItem;
        this.c = q630Var;
    }

    public /* synthetic */ w70(izs izsVar, mc90 mc90Var, mtk0 mtk0Var) {
        this.b = 4;
        this.e = izsVar;
        this.d = mc90Var;
        this.c = mtk0Var;
    }

    public /* synthetic */ w70(vm30 vm30Var, MsgFromUser msgFromUser, fm20 fm20Var) {
        this.b = 7;
        this.d = vm30Var;
        this.c = msgFromUser;
        this.e = fm20Var;
    }
}
