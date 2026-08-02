package xsna;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.atu0;
import xsna.b78;
import xsna.kyl;
import xsna.smd0;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                a3.a((y0) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                kxl.d((qow) this.c, (kyl.f) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                cto ctoVar = (cto) this.c;
                String str2 = (String) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                aVar.K(1411461639);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1411461639, intValue, -1, "com.vk.dzenarticle.impl.ui.store.DzenArticleViewStateMapper.buildInfoDialogText.<anonymous> (DzenArticleViewStateMapper.kt:315)");
                }
                String N = d370.N(R.string.dzen_article_info_text, 0, aVar);
                String N2 = d370.N(R.string.dzen_article_info_text_word_link, 0, aVar);
                us2.b bVar = new us2.b();
                bVar.g(N);
                int K = drm0.K(0, 6, N, "dzen.ru", false);
                if (K >= 0) {
                    aVar.K(-1827306969);
                    ctoVar.c(bVar, "https://dzen.ru", K, K + 7, false, aVar, 24632, 0);
                } else {
                    aVar.K(-1840663536);
                }
                aVar.j();
                int O = drm0.O(0, 6, N, N2);
                if (O >= 0) {
                    aVar.K(-1827060643);
                    ctoVar.c(bVar, str2, O, N2.length() + O, false, aVar, 24584, 0);
                } else {
                    aVar.K(-1840663536);
                }
                aVar.j();
                us2 n = bVar.n();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return n;
            case 3:
                hmd0 hmd0Var = (hmd0) this.c;
                q7u q7uVar = (q7u) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(154205224, intValue2, -1, "com.vk.ecomm.market.good.ui.holder.reject.GoodRejectInfoHolder.onBind.<anonymous> (GoodRejectInfoHolder.kt:37)");
                    }
                    if (hmd0Var == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    rrv0.d(null, null, null, null, kai.c(-462983005, new gx(7, hmd0Var, q7uVar), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                pz00 pz00Var = (pz00) this.c;
                gmq gmqVar = (gmq) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                pz00Var.E.T4(new MarketProductTileConfig.b(booleanValue, true));
                ((FaveMarketItem) gmqVar).b.J = booleanValue;
                return s3q0.a;
            case 5:
                com.vk.core.ui.bottomsheet.actionsheet.a aVar3 = (com.vk.core.ui.bottomsheet.actionsheet.a) this.c;
                Context context = (Context) this.d;
                View view = (View) obj;
                ModalActionSheetListItem modalActionSheetListItem = (ModalActionSheetListItem) obj2;
                if (!aVar3.d) {
                    aVar3.b.invoke(modalActionSheetListItem);
                }
                view.postDelayed(new ke9(4, aVar3, modalActionSheetListItem), context.getResources().getInteger(android.R.integer.config_shortAnimTime));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                n750.i((b78.d) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                f64 f64Var = (f64) this.c;
                f64 f64Var2 = (f64) this.d;
                qk50 qk50Var = (qk50) obj;
                smd0 smd0Var = (smd0) obj2;
                if (smd0Var instanceof smd0.b) {
                    return qk50Var.a(f64Var, smd0Var);
                }
                if (smd0Var instanceof smd0.a) {
                    return qk50Var.a(f64Var2, smd0Var);
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                t0k0 t0k0Var = (t0k0) this.c;
                rod0 rod0Var = (rod0) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-178073923, intValue3, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterSliderHolder.bind.<anonymous> (ProductFilterSliderHolder.kt:26)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1183154270, new ljf(4, t0k0Var, rod0Var), aVar4), aVar4, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                i5k0.c((j5k0) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((bdn0) this.c).g6((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                gbp0.a((jbp0) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            default:
                atu0 atu0Var = (atu0) this.c;
                atu0.a.b bVar2 = (atu0.a.b) this.d;
                String str3 = ((wmu0) obj).a;
                String str4 = ((fcu0) obj2).a;
                atu0Var.getClass();
                zsu0 zsu0Var = new zsu0();
                zsu0Var.a = bVar2.a;
                zsu0Var.b = bVar2.b;
                String str5 = bVar2.c;
                if (str5 != null && (str = bVar2.d) != null) {
                    zsu0Var.e = true;
                    zsu0Var.c = str;
                    zsu0Var.d = str5;
                }
                if (!epx.f(str4, "")) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", "login_with_user_external");
                    jSONObject.put("token", str4);
                    zsu0Var.f = Base64.encodeToString(jSONObject.toString().getBytes(emb.b), 10);
                }
                return zsu0Var.a(str3);
        }
    }

    public /* synthetic */ x2(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
