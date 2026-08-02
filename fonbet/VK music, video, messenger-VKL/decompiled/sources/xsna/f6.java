package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.ecomm.market.goodpreview.domain.state.ProductPreviewError;
import com.vk.stories.design.view.text.TextStyleColorPicker;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.k6;
import xsna.q630;
import xsna.wxe0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class f6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        List<CatalogFilterData> list;
        switch (this.b) {
            case 0:
                k6.a aVar = (k6.a) this.c;
                k6 k6Var = (k6) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1757006982, intValue, -1, "com.vk.video.ui.discovery.minimizable.description.AboutVideoDescriptionDelegate.ViewHolder.<anonymous>.<anonymous> (AboutVideoDescriptionDelegate.kt:67)");
                    }
                    o2m o2mVar = (o2m) ((zak0) aVar.m).getValue();
                    if (o2mVar == null) {
                        aVar2.K(-228495620);
                    } else {
                        aVar2.K(-228495619);
                        q630.a aVar3 = q630.a.a;
                        q630 f = txj0.f(aVar3, 1.0f);
                        Object x = aVar2.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            x = ir.h(aVar2);
                        }
                        sg50 sg50Var = (sg50) x;
                        mlg0 a = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                        boolean y = aVar2.y(k6Var);
                        Object x2 = aVar2.x();
                        if (y || x2 == c0012a) {
                            x2 = new h6(k6Var, 0);
                            aVar2.R(x2);
                        }
                        q630 E = s200.E(ojc.b(f, sg50Var, a, false, null, (gzs) x2, 28), 16, 12);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, E);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a2, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        String str = o2mVar.a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var = wuv0Var.O;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        yqv0.c(str, aVar3, ylu0Var.getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, 100663344, 48, 5880);
                        aVar2 = aVar2;
                        f9t.e(txj0.h(aVar3, 4), aVar2, 6);
                        m6.a(o2mVar.b, null, aVar2, 0);
                        aVar2.G();
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((vo7) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                List list2 = (List) this.c;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).getClass();
                vz7.a(ne7.I(1), (androidx.compose.runtime.a) obj, list2, izsVar);
                return s3q0.a;
            case 3:
                ProductPreviewError productPreviewError = (ProductPreviewError) this.c;
                i7u i7uVar = (i7u) this.d;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-526257897, intValue2, -1, "com.vk.ecomm.market.goodpreview.presentation.view.GoodPreviewView.bindError.<anonymous> (GoodPreviewView.kt:166)");
                    }
                    if (productPreviewError == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    rrv0.d(null, null, null, null, kai.c(-1706840046, new pzj(2, productPreviewError, i7uVar), aVar5), aVar5, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 4:
                k410 k410Var = (k410) this.c;
                l410 l410Var = (l410) this.d;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(684277420, intValue3, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.adapter.header.MarketItemReviewsHeaderItemViewHolder.bind.<anonymous>.<anonymous> (MarketItemReviewsHeaderItemViewHolder.kt:33)");
                    }
                    q630 f2 = txj0.f(q630.a.a, 1.0f);
                    mig0 mig0Var = k410Var.b;
                    cye0 e = wp80.e(mig0Var.c, mig0Var.b, aVar6);
                    String string = l410Var.b6().getString(R.string.market_item_reviews_admin_not_send_reviews);
                    boolean y2 = aVar6.y(l410Var);
                    Object x3 = aVar6.x();
                    if (y2 || x3 == a.C0011a.a) {
                        x3 = new qbj(l410Var, 26);
                        aVar6.R(x3);
                    }
                    ga70 a3 = wxe0.a.a(string, (gzs) x3, aVar6);
                    if (!k410Var.b.e) {
                        a3 = null;
                    }
                    sd10.a(e, f2, a3, aVar6, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 5:
                xp40 xp40Var = (xp40) this.c;
                kea keaVar = (kea) this.d;
                Context context = (Context) obj2;
                UIBlockActionShowFilters uIBlockActionShowFilters = ((UIBlockList) obj).B;
                if (uIBlockActionShowFilters != null && (list = uIBlockActionShowFilters.A) != null) {
                    i4a.b(context, list, Integer.valueOf(R.string.catalog_offline_replacement_title), new he3(28, xp40Var, keaVar));
                }
                return s3q0.a;
            case 6:
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1188511187, intValue4, -1, "com.vk.design.demo.presentation.screens.authorheader.ProfileHeaderScreenContent.Content.<anonymous>.<anonymous> (AuthorHeaderScreenContent.kt:75)");
                    }
                    if (oq.h(770263349, aVar7)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                vgg0.c((String) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                TextStyleColorPicker textStyleColorPicker = (TextStyleColorPicker) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                omo0 omo0Var = (omo0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                ArrayList arrayList = textStyleColorPicker.b;
                Iterator it = arrayList.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    omo0 omo0Var2 = (omo0) next;
                    if (omo0Var2.b) {
                        i = i2;
                    }
                    omo0Var2.b = false;
                    i2 = i3;
                }
                omo0Var.b = true;
                if (i == 0 || intValue5 == 0) {
                    nco0 nco0Var = ((omo0) arrayList.get(0)).a;
                    ((omo0) arrayList.get(0)).a = new nco0(nco0Var.a, n8g.f(nco0Var.a) >= 0.5d, nco0Var.c);
                }
                textStyleColorPicker.b(i, intValue5, true);
                recyclerView.performHapticFeedback(0);
                return s3q0.a;
        }
    }

    public /* synthetic */ f6(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ f6(oxd0 oxd0Var, jgh0 jgh0Var, yjl yjlVar, yvj yvjVar, mtk0 mtk0Var) {
        this.b = 6;
        this.c = yvjVar;
        this.d = mtk0Var;
    }
}
