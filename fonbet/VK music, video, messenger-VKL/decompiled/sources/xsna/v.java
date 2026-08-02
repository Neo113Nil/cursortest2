package xsna;

import androidx.compose.runtime.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.e;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.common.Good;
import com.vk.ecomm.onlinebooking.impl.services.presentation.ui.BookingServicesScreenKt;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.b;
import xsna.loh0;
import xsna.n1b0;
import xsna.q630;
import xsna.rrd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class v implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                gzs gzsVar2 = (gzs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                w.a(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, gzsVar2, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.settings.g) this.c).i((e.a) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                BookingServicesScreenKt.d((com.vk.ecomm.onlinebooking.impl.services.presentation.model.a) this.d, (izs) this.e, (gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                vzo.c((euc) this.d, (dlv0) this.e, (gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 4:
                i4u i4uVar = (i4u) this.c;
                ynd0 ynd0Var = (ynd0) this.d;
                wh50 wh50Var = (wh50) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-367634204, intValue, -1, "com.vk.ecomm.market.good.ui.holder.description.GoodDescriptionComposeViewHolder.onBind.<anonymous>.<anonymous> (GoodDescriptionComposeViewHolders.kt:106)");
                    }
                    sdz sdzVar = i4uVar.n;
                    CharSequence charSequence = ynd0Var.a;
                    CharSequence charSequence2 = ynd0Var.b;
                    Good good = ynd0Var.c;
                    n4u n4uVar = new n4u(charSequence, charSequence2, good.o, good.H, good.d, good.a0);
                    boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new g9c(1, wh50Var);
                        aVar.R(x);
                    }
                    m4u.a(sdzVar, n4uVar, booleanValue, (gzs) x, ahn.E(txj0.f(q630.a.a, 1.0f), "product_card_description_block"), aVar, 27648);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                sju.b((loh0.a) this.d, (gzs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                String str = (String) this.c;
                String str2 = (String) this.d;
                q630 q630Var2 = (q630) this.e;
                ((Integer) obj2).getClass();
                dl10.b(ne7.I(1), (androidx.compose.runtime.a) obj, str, str2, q630Var2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((i1b0) this.c).i((n1b0.b) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((rrd0) this.c).q6((rrd0.f) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((zph0) this.c).i((b.a.C1766a) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            default:
                ((Integer) obj2).getClass();
                ((TopBar$Middle.Cell.Middle.Text.Title) this.c).a((com.vk.core.compose.component.topbar.k) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ v(i4u i4uVar, ynd0 ynd0Var, wh50 wh50Var) {
        this.b = 4;
        this.c = i4uVar;
        this.d = ynd0Var;
        this.e = wh50Var;
    }

    public /* synthetic */ v(lm50 lm50Var, Object obj, gzs gzsVar, int i, int i2) {
        this.b = i2;
        this.d = lm50Var;
        this.e = obj;
        this.c = gzsVar;
    }

    public /* synthetic */ v(loh0.a aVar, gzs gzsVar, q630 q630Var, int i) {
        this.b = 5;
        this.d = aVar;
        this.c = gzsVar;
        this.e = q630Var;
    }
}
