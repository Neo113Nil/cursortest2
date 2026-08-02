package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.IconButtonRippleType;
import com.vk.core.compose.component.modal.Mode;
import com.vk.ecomm.cart.impl.checkout.feature.state.PaymentInfoField;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.superapp.api.dto.ad.AdInfo;
import com.vkontakte.android.R;
import xsna.atn;
import xsna.cri;
import xsna.d5h;
import xsna.dt1;
import xsna.h8u;
import xsna.q630;
import xsna.vol;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cg4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = a.C0011a.a;
        int i2 = 7;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dg4.f((String) obj5, (q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 1:
                final gzs gzsVar = (gzs) obj5;
                final PaymentInfoField.a aVar = (PaymentInfoField.a) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1724513886, intValue, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.TooltipContent.<anonymous> (CheckoutTooltipTextInfo.kt:90)");
                    }
                    a030.b(Mode.Card, gzsVar, null, null, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(-1111393148, new yzs() { // from class: xsna.i9c
                        @Override // xsna.yzs
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            cri.a.e eVar;
                            q630.a aVar3;
                            cri.a.C2678a c2678a;
                            cri.a.b bVar;
                            LayoutNode.a aVar4;
                            cri.a.c cVar;
                            cri.a.d dVar;
                            float f;
                            float f2;
                            ty6 ty6Var;
                            PaymentInfoField.a aVar5;
                            gzs gzsVar2;
                            androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj7;
                            int intValue2 = ((Integer) obj8).intValue();
                            if (aVar6.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1111393148, intValue2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.TooltipContent.<anonymous>.<anonymous> (CheckoutTooltipTextInfo.kt:94)");
                                }
                                long j = wlb0.h(aVar6).getBackground().r;
                                e.a aVar7 = androidx.compose.ui.graphics.e.a;
                                q630.a aVar8 = q630.a.a;
                                q630 m = hr80.m(aVar8, j, aVar7);
                                dt1.a.getClass();
                                ty6 ty6Var2 = dt1.a.b;
                                cp10 d = ja8.d(ty6Var2, false);
                                int hashCode = Long.hashCode(n34.n(aVar6));
                                sy90 D = aVar6.D();
                                q630 c = qri.c(aVar6, m);
                                cri.h7.getClass();
                                LayoutNode.a aVar9 = cri.a.b;
                                if (aVar6.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar6.H();
                                if (aVar6.L()) {
                                    aVar6.I(aVar9);
                                } else {
                                    aVar6.f();
                                }
                                cri.a.c cVar2 = cri.a.f;
                                k9q0.w(aVar6, d, cVar2);
                                cri.a.e eVar2 = cri.a.e;
                                k9q0.w(aVar6, D, eVar2);
                                Integer valueOf = Integer.valueOf(hashCode);
                                cri.a.b bVar2 = cri.a.g;
                                k9q0.w(aVar6, valueOf, bVar2);
                                cri.a.C2678a c2678a2 = cri.a.h;
                                k9q0.t(aVar6, c2678a2);
                                cri.a.d dVar2 = cri.a.d;
                                k9q0.w(aVar6, c, dVar2);
                                float f3 = 16;
                                q630 F = s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar8, 1.0f));
                                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar6, 0);
                                int hashCode2 = Long.hashCode(n34.n(aVar6));
                                sy90 D2 = aVar6.D();
                                q630 c2 = qri.c(aVar6, F);
                                if (aVar6.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar6.H();
                                if (aVar6.L()) {
                                    aVar6.I(aVar9);
                                } else {
                                    aVar6.f();
                                }
                                k9q0.w(aVar6, a, cVar2);
                                k9q0.w(aVar6, D2, eVar2);
                                ur.d(hashCode2, aVar6, bVar2, aVar6, c2678a2);
                                k9q0.w(aVar6, c2, dVar2);
                                float f4 = 24;
                                f9t.e(txj0.h(aVar8, f4), aVar6, 6);
                                PaymentInfoField.a aVar10 = PaymentInfoField.a.this;
                                String str = aVar10.a;
                                if (str == null) {
                                    aVar6.K(-163984273);
                                    aVar6.j();
                                    f = f4;
                                    f2 = f3;
                                    aVar5 = aVar10;
                                    eVar = eVar2;
                                    aVar3 = aVar8;
                                    c2678a = c2678a2;
                                    bVar = bVar2;
                                    aVar4 = aVar9;
                                    cVar = cVar2;
                                    dVar = dVar2;
                                    ty6Var = ty6Var2;
                                } else {
                                    aVar6.K(-163984272);
                                    eVar = eVar2;
                                    aVar3 = aVar8;
                                    c2678a = c2678a2;
                                    bVar = bVar2;
                                    aVar4 = aVar9;
                                    cVar = cVar2;
                                    dVar = dVar2;
                                    f = f4;
                                    f2 = f3;
                                    ty6Var = ty6Var2;
                                    aVar5 = aVar10;
                                    yqv0.c(str, txj0.f(aVar8, 1.0f), wlb0.h(aVar6).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar6).g, aVar6, 48, 0, 8120);
                                    aVar6 = aVar6;
                                    f9t.e(txj0.h(aVar3, 8), aVar6, 6);
                                    s3q0 s3q0Var = s3q0.a;
                                    aVar6.j();
                                }
                                String str2 = aVar5.b;
                                if (str2 == null) {
                                    aVar6.K(-163495465);
                                } else {
                                    aVar6.K(-163495464);
                                    androidx.compose.runtime.a aVar11 = aVar6;
                                    yqv0.c(str2, txj0.f(aVar3, 1.0f), wlb0.h(aVar6).getText().n, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar6).Y, aVar11, 48, 0, 8120);
                                    aVar6 = aVar11;
                                    f9t.e(txj0.h(aVar3, f), aVar6, 6);
                                    s3q0 s3q0Var2 = s3q0.a;
                                }
                                aVar6.j();
                                String str3 = aVar5.c;
                                gzs gzsVar3 = gzsVar;
                                if (str3 == null) {
                                    aVar6.K(-163006626);
                                    aVar6.j();
                                    gzsVar2 = gzsVar3;
                                } else {
                                    aVar6.K(-163006625);
                                    androidx.compose.runtime.a aVar12 = aVar6;
                                    bhu0.e(gzsVar3, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.f(aVar3, 1.0f), null, false, false, null, null, null, str3, null, null, null, null, false, null, null, null, aVar12, 28080, 0, 0, 4190176);
                                    gzsVar2 = gzsVar3;
                                    aVar6 = aVar12;
                                    f9t.e(txj0.h(aVar3, f2), aVar6, 6);
                                    s3q0 s3q0Var3 = s3q0.a;
                                    aVar6.j();
                                }
                                aVar6.G();
                                q630 D3 = s200.D(ra8.a.b(aVar3, dt1.a.d), 4);
                                cp10 d2 = ja8.d(ty6Var, false);
                                int hashCode3 = Long.hashCode(n34.n(aVar6));
                                sy90 D4 = aVar6.D();
                                q630 c3 = qri.c(aVar6, D3);
                                if (aVar6.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar6.H();
                                if (aVar6.L()) {
                                    aVar6.I(aVar4);
                                } else {
                                    aVar6.f();
                                }
                                k9q0.w(aVar6, d2, cVar);
                                k9q0.w(aVar6, D4, eVar);
                                ur.d(hashCode3, aVar6, bVar, aVar6, c2678a);
                                k9q0.w(aVar6, c3, dVar);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                                }
                                lg90 b = or.b(aVar6, 861936997, R.drawable.vk_icon_cancel_outline_28, aVar6, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                nzu0.c(gzsVar2, b, d370.N(R.string.ecomm_checkout_close, 0, aVar6), null, 44, wlb0.h(aVar6).getIcon().b, false, IconButtonRippleType.Bounded, false, null, null, aVar6, 12607552, 1864);
                                if (kr.f(aVar6)) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar6.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar2), aVar2, 6, 100663296, 262140);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((d5h.c.a) obj5).c((q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                wco0 wco0Var = (wco0) obj5;
                jdo0 jdo0Var = (jdo0) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1315155414, intValue2, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:124)");
                    }
                    boolean J = aVar3.J(wco0Var);
                    Object x = aVar3.x();
                    if (J || x == obj3) {
                        x = bbk0.b(new vol.b(0, wco0Var, wco0.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0));
                        aVar3.R(x);
                    }
                    vol.a(jdo0Var, (vco0) ((mtk0) x).getValue(), aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 4:
                AboutVideoItem.l lVar = (AboutVideoItem.l) obj5;
                atn.a aVar4 = (atn.a) obj4;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(29162007, intValue3, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.Doc2DocBannerDelegate.ViewHolder.<anonymous>.<anonymous>.<anonymous> (Doc2DocBannerDelegate.kt:56)");
                    }
                    dtn.a(lVar, aVar4.l, null, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 5:
                g8u g8uVar = (g8u) obj5;
                h8u h8uVar = (h8u) obj4;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1647604053, intValue4, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewsComposeHolder.setupBottomBlock.<anonymous>.<anonymous> (GoodReviewsComposeHolder.kt:320)");
                    }
                    boolean q6 = g8uVar.q6(h8uVar);
                    q630.a aVar7 = q630.a.a;
                    if (q6) {
                        aVar6.K(-885981530);
                        h8u.a aVar8 = h8uVar.t;
                        if (aVar8 == null) {
                            aVar6.K(-885938968);
                            aVar6.j();
                        } else {
                            aVar6.K(-885938967);
                            q630 E = ahn.E(txj0.f(aVar7, 1.0f), "reviews_info_show_ozon_reviews_btn");
                            String str = aVar8.a;
                            ButtonSize buttonSize = ButtonSize.Large;
                            ButtonStyle buttonStyle = ButtonStyle.Outline;
                            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                            boolean y = aVar6.y(g8uVar) | aVar6.J(aVar8);
                            Object x2 = aVar6.x();
                            if (y || x2 == obj3) {
                                x2 = new vf1(i2, g8uVar, aVar8);
                                aVar6.R(x2);
                            }
                            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, aVar6, 28080, 0, 0, 4190176);
                            aVar6.j();
                            s3q0 s3q0Var = s3q0.a;
                        }
                        aVar6.j();
                    } else {
                        aVar6.K(-885240103);
                        q630 E2 = ahn.E(txj0.f(aVar7, 1.0f), "reviews_info_show_reviews_btn");
                        String string = g8uVar.b6().getString(R.string.good_review_item_show_all);
                        ButtonSize buttonSize2 = ButtonSize.Large;
                        ButtonStyle buttonStyle2 = ButtonStyle.Outline;
                        ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
                        boolean y2 = aVar6.y(g8uVar);
                        Object x3 = aVar6.x();
                        if (y2 || x3 == obj3) {
                            x3 = new n5i(g8uVar, 20);
                            aVar6.R(x3);
                        }
                        bhu0.e((gzs) x3, buttonSize2, buttonStyle2, buttonAppearance2, E2, null, false, false, null, null, null, string, null, null, null, null, false, null, null, null, aVar6, 28080, 0, 0, 4190176);
                        aVar6.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((vs70) obj5).a(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj4);
                break;
            case 7:
                wzs wzsVar = (wzs) obj5;
                jai jaiVar = (jai) obj4;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1789628237, intValue5, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:104)");
                    }
                    if (wzsVar == null) {
                        aVar9.K(1845819398);
                        t8k0.d(0, aVar9, jaiVar);
                        aVar9.j();
                    } else {
                        aVar9.K(1845823628);
                        t8k0.a(jaiVar, wzsVar, aVar9, 0);
                        aVar9.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                break;
            case 8:
                zdn0 zdn0Var = (zdn0) obj5;
                AdInfo adInfo = (AdInfo) obj4;
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar10.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-135737926, intValue6, -1, "com.vk.superapp.holders.SuperAppWidgetShowcaseSectionScrollHolder.showAdInfoContextMenu.<anonymous> (SuperAppWidgetShowcaseSectionScrollHolder.kt:166)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1053995233, new mq1(9, zdn0Var, adInfo), aVar10), aVar10, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                break;
            default:
                anx anxVar = (anx) obj5;
                jai jaiVar2 = (jai) obj4;
                androidx.compose.runtime.a aVar11 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar11.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-539257892, intValue7, -1, "com.vk.core.compose.component.VkAccentScrollableTabRow.<anonymous>.<anonymous> (VkAccentTabRow.kt:265)");
                    }
                    jaiVar2.invoke(u6u0.g(anxVar, aVar11, 0), aVar11, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar11.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cg4(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
