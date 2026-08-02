package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.design.compose.property.config.MarketProperty$VariantState;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipAlreadyAttachedDialogState;
import java.util.ArrayList;
import xsna.cri;
import xsna.dg70;
import xsna.dt1;
import xsna.efu;
import xsna.q630;
import xsna.qrd0;
import xsna.yk8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class au7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ au7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ImageSize Cb;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                fu7.b((vu7) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                weo.d((String) this.c, (Integer) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                h8u h8uVar = (h8u) this.c;
                g8u g8uVar = (g8u) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(946367422, intValue, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewsComposeHolder.setupRatingBlock.<anonymous> (GoodReviewsComposeHolder.kt:266)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-146352263, new o21(4, h8uVar, g8uVar), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                efu.b bVar = (efu.b) this.c;
                a.n nVar = (a.n) this.d;
                azl azlVar = (azl) obj;
                o6j o6jVar = (o6j) obj2;
                if (o6j.h(o6jVar.a) == Integer.MAX_VALUE) {
                    xzw.a("LazyHorizontalGrid's height should be bound by parent.");
                }
                int h = o6j.h(o6jVar.a);
                int[] N0 = j5g.N0(uqy.c(h, bVar.a, azlVar.r0(nVar.a())));
                int[] iArr = new int[N0.length];
                nVar.c(azlVar, h, N0, iArr);
                return new ury(N0, iArr);
            case 4:
                gzs gzsVar = (gzs) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1610158229, intValue2, -1, "com.vk.music.ui.subscription.MusicBuySubscription.<anonymous> (MusicBuySubscription.kt:59)");
                    }
                    y7z g = yk8.a.g(e43.l(new l5g(f870.d(4284809414L)), new l5g(f870.d(4278190080L))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    float f = 16;
                    float f2 = 0;
                    uog0 c = vog0.c(f, f, f2, f2);
                    q630.a aVar3 = q630.a.a;
                    q630 l = hr80.l(aVar3, g, c, 4);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c2 = qri.c(aVar2, l);
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
                    k9q0.w(aVar2, d, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c2, cri.a.d);
                    phv0.b(txj0.d(aVar3, 1.0f), kai.c(2147462644, new com.vk.movika.tools.controls.seekbar.p(gzsVar, 6), aVar2), null, null, null, 0, l5g.j, 0L, kai.c(425049791, new ywq(izsVar, 2), aVar2), aVar2, 817889334, 380);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                ((sti) obj).a(new vt60((sl50) obj2, ((zz60) this.c).t, (xk2) this.d));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                fg70.a((dg70.b) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                gzs gzsVar2 = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                qka0.c(ne7.I(49), (androidx.compose.runtime.a) obj, gzsVar2, q630Var);
                return s3q0.a;
            case 8:
                ird0 ird0Var = (ird0) this.c;
                qrd0 qrd0Var = (qrd0) this.d;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-266552571, intValue3, -1, "com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyVariantsPreviewHolder.onBind.<anonymous> (ProductPropertyVariantsPreviewHolder.kt:33)");
                    }
                    boolean J = aVar5.J(ird0Var);
                    Object x = aVar5.x();
                    if (J || x == a.C0011a.a) {
                        int a = iah0.a(69);
                        String str = ird0Var.a;
                        ArrayList<krd0> arrayList = ird0Var.c;
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        for (krd0 krd0Var : arrayList) {
                            int i = krd0Var.a;
                            Image image = krd0Var.e;
                            String str2 = (image == null || (Cb = image.Cb(a, false, false)) == null) ? null : Cb.d.d;
                            krd0 krd0Var2 = ird0Var.d;
                            boolean z = krd0Var.f;
                            arrayList2.add(new kd10(i, str2, (z || !krd0Var.equals(krd0Var2)) ? !z ? MarketProperty$VariantState.UNAVAILABLE : krd0Var.equals(krd0Var2) ? MarketProperty$VariantState.SELECTED : MarketProperty$VariantState.AVAILABLE : MarketProperty$VariantState.RUN_OUT));
                        }
                        qrd0.f fVar = new qrd0.f(str, arrayList2);
                        aVar5.R(fVar);
                        x = fVar;
                    }
                    rrv0.d(null, null, null, null, kai.c(-1726882646, new oq0(qrd0Var, (qrd0.f) x, ird0Var, 7), aVar5), aVar5, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ich0.b((ClipAlreadyAttachedDialogState) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                lg90 lg90Var = (lg90) this.c;
                String str3 = (String) this.d;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2042999301, intValue4, -1, "com.vk.core.compose.component.PanelHeaderIconButton.<anonymous> (VkTopBar.kt:424)");
                    }
                    q630 d2 = txj0.d(o19.a(q630.a.a, ((Number) aVar6.r(hfj.a)).floatValue()), 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vqv.a(lg90Var, str3, d2, ylu0Var.getIcon().b, aVar6, 8, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ au7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ au7(gzs gzsVar, izs izsVar) {
        this.b = 4;
        this.c = gzsVar;
        this.d = izsVar;
    }
}
