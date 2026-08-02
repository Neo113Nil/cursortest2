package xsna;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import xsna.a080;
import xsna.cri;
import xsna.dt1;
import xsna.loh0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pmg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pmg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        StickersBonusResult stickersBonusResult;
        switch (this.b) {
            case 0:
                StickerStockItem stickerStockItem = (StickerStockItem) this.c;
                Context context = (Context) this.d;
                nge0 nge0Var = (nge0) obj2;
                boolean z = stickerStockItem.m;
                int i = stickerStockItem.b;
                if (z || stickerStockItem.n.Db() != 0) {
                    y9l0.a(new s1l0(i));
                } else {
                    y9l0.a(new q1l0(i));
                }
                if (nge0Var != null && (stickersBonusResult = nge0Var.l) != null) {
                    new gl7().a(context, stickersBonusResult);
                }
                return s3q0.a;
            case 1:
                mtk0 mtk0Var = (mtk0) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1848596247, intValue, -1, "com.vk.clips.coauthors.selector.ui.MainContent.<anonymous>.<anonymous> (MainContent.kt:93)");
                    }
                    q630 m = hr80.m(q630.a.a, l5g.j, androidx.compose.ui.graphics.e.a);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    mm2.f(!((d8p0) mtk0Var.getValue()).b.isEmpty(), null, null, null, null, kai.c(1674810617, new nd00(0, mtk0Var, izsVar), aVar), aVar, 196608, 30);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                izs izsVar2 = (izs) this.c;
                wh50 wh50Var = (wh50) this.d;
                ((Integer) obj2).getClass();
                wh50Var.setValue(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                izsVar2.invoke(a080.b.b);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                lig0.c((loh0.f.d) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                jpl0 jpl0Var = (jpl0) this.c;
                izs izsVar3 = (izs) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-766907219, intValue2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontScreen.<anonymous>.<anonymous> (StorefrontScreen.kt:70)");
                    }
                    hpl0.b(jpl0Var.b.a, izsVar3, ahn.E(q630.a.a, "storefront_top_bar"), aVar3, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                w1o0 w1o0Var = (w1o0) this.c;
                dk3 dk3Var = (dk3) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-109749680, intValue3, -1, "com.vk.dialogtags.impl.TagsFactoryImpl.createMenuView.<anonymous>.<anonymous> (TagsFactoryImpl.kt:53)");
                    }
                    w1o0Var.b(dk3Var, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                twu0.b(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ pmg(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = q630Var;
    }
}
