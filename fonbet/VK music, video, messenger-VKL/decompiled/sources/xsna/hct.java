package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoFlatActionViewHolder;
import com.vk.dto.common.ImageSize;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hct implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hct(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                v6p0 v6p0Var = (v6p0) this.c;
                izs izsVar = (izs) this.d;
                mc90 mc90Var = (mc90) this.e;
                mtk0 mtk0Var = (mtk0) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1294206275, intValue, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContentLego.<anonymous> (GamesCatalogMainTabScreen.kt:195)");
                    }
                    xlu0.a(v6p0Var, null, kai.c(457263580, new w70(izsVar, mc90Var, mtk0Var), aVar), dgi.b, aVar, 3456);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                VideoFlatActionViewHolder videoFlatActionViewHolder = (VideoFlatActionViewHolder) this.c;
                u4a u4aVar = videoFlatActionViewHolder.c;
                ComposeView composeView = (ComposeView) this.d;
                UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) this.e;
                ImageSize imageSize = (ImageSize) this.f;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2039227599, intValue2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoFlatActionViewHolder.createView.<anonymous>.<anonymous>.<anonymous> (VideoFlatActionViewHolder.kt:83)");
                    }
                    float f = u4aVar.b.c ? 96 : 94;
                    q630.a aVar3 = q630.a.a;
                    q630 h = txj0.h(aVar3, f);
                    float f2 = kqu0.v;
                    q630 d = rte0.d(txj0.f(s200.H(h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), vog0.b(kqu0.f));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(d, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a);
                    boolean y = aVar2.y(videoFlatActionViewHolder) | aVar2.y(composeView) | aVar2.y(uIBlockActionOpenSection);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new defpackage.d0(videoFlatActionViewHolder, composeView, uIBlockActionOpenSection, 6);
                        aVar2.R(x);
                    }
                    q630 c = ojc.c(m, false, null, null, (gzs) x, 15);
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.b;
                    cp10 d2 = ja8.d(ty6Var, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c2 = qri.c(aVar2, c);
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
                    k9q0.w(aVar2, d2, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c2, cri.a.d);
                    String str = imageSize != null ? imageSize.d.d : null;
                    boolean y2 = aVar2.y(videoFlatActionViewHolder);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new ape0(videoFlatActionViewHolder, 27);
                        aVar2.R(x2);
                    }
                    vjw.a(fwu0.l(null, str, (izs) x2, null, aVar2, 0, 45), null, txj0.d(aVar3, 1.0f), dt1.a.j, wkj.a.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 28088, 96);
                    String str2 = uIBlockActionOpenSection.z;
                    long j = l5g.d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str2, s200.E(ra8.a.b(aVar3, ty6Var), u4aVar.b.c ? kqu0.w : f2, f2), j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.h0, aVar2, 384, 0, 8184);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
