package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.tooling.PreviewActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vkontakte.android.R;
import xsna.chs;
import xsna.cri;
import xsna.dt1;
import xsna.jdh0;
import xsna.q630;
import xsna.wxe0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class o21 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o21(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        ga70 ga70Var = null;
        q630.a aVar = q630.a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                s21.y((String) obj, null, (String) obj4, (tm0) obj3);
                return s3q0.a;
            case 1:
                chs chsVar = (chs) obj4;
                lg90 lg90Var = (lg90) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                float f = w3k.a;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-336909527, intValue, -1, "com.vk.music.stickyplayer.presentation.components.Cover.<anonymous>.<anonymous> (CoversCarousel.kt:291)");
                    }
                    if ((chsVar instanceof chs.b) || (chsVar instanceof chs.a) || (chsVar instanceof chs.c)) {
                        aVar2.K(466988731);
                        nsa0.a(f, 54, aVar2, txj0.d(aVar, 1.0f));
                        aVar2.j();
                    } else {
                        aVar2.K(467218503);
                        q630 d = rte0.d(txj0.d(aVar, 1.0f), vog0.b(f));
                        float f2 = 1;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        y18 a = aqw.a(f2, ylu0Var.getImage().a);
                        vjw.a(lg90Var, null, r18.b(a.a, a.b, d, vog0.b(f)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 56, 120);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                aco.b((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                pet.a((mc90) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                h8u h8uVar = (h8u) obj4;
                g8u g8uVar = (g8u) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-146352263, intValue2, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewsComposeHolder.setupRatingBlock.<anonymous>.<anonymous> (GoodReviewsComposeHolder.kt:267)");
                    }
                    q630 E = ahn.E(txj0.f(aVar, 1.0f), "reviews_info_rating_block");
                    Float f3 = h8uVar.f;
                    cye0 e = wp80.e(f3 != null ? f3.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, h8uVar.s, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1485387153, 0, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewsComposeHolder.createNotification (GoodReviewsComposeHolder.kt:283)");
                    }
                    if (h8uVar.r) {
                        aVar3.K(-120470697);
                        String string = g8uVar.b6().getString(R.string.good_review_item_admin_not_send_reviews);
                        boolean y = aVar3.y(g8uVar);
                        Object x = aVar3.x();
                        if (y || x == a.C0011a.a) {
                            x = new jcg(g8uVar, 22);
                            aVar3.R(x);
                        }
                        ga70Var = wxe0.a.a(string, (gzs) x, aVar3);
                        aVar3.j();
                    } else {
                        aVar3.K(-120160201);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    sd10.a(e, E, ga70Var, aVar3, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                izs izsVar = (izs) obj4;
                wh50 wh50Var = (wh50) obj3;
                boolean z = ((l9x) obj).b > ((l9x) obj2).b;
                if (izsVar != null) {
                    izsVar.invoke(Boolean.valueOf(z));
                }
                wh50Var.setValue(Boolean.valueOf(z));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                n750.e((b78) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                String str = (String) obj4;
                String str2 = (String) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i2 = PreviewActivity.f;
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-840626948, intValue3, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:74)");
                    }
                    fai.u(str, str2, aVar4, new Object[0]);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 8:
                jdh0.a aVar5 = (jdh0.a) obj4;
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(703529976, intValue4, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.screen.ScreenLoaded.<anonymous> (Screen.kt:57)");
                    }
                    d3k.a(aVar5.c, izsVar2, txj0.d(aVar, 1.0f), aVar6, 384);
                    if (aVar5.d) {
                        aVar6.K(-578691186);
                        dt1.a.getClass();
                        ty6 ty6Var = dt1.a.f;
                        q630 d2 = txj0.d(aVar, 1.0f);
                        cp10 d3 = ja8.d(ty6Var, false);
                        int hashCode = Long.hashCode(n34.n(aVar6));
                        sy90 D = aVar6.D();
                        q630 c = qri.c(aVar6, d2);
                        cri.h7.getClass();
                        LayoutNode.a aVar7 = cri.a.b;
                        if (aVar6.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar6.H();
                        if (aVar6.L()) {
                            aVar6.I(aVar7);
                        } else {
                            aVar6.f();
                        }
                        k9q0.w(aVar6, d3, cri.a.f);
                        k9q0.w(aVar6, D, cri.a.e);
                        k9q0.w(aVar6, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar6, cri.a.h);
                        k9q0.w(aVar6, c, cri.a.d);
                        zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, null, null, aVar6, 6, 510);
                        aVar6.G();
                    } else {
                        aVar6.K(-580877430);
                    }
                    aVar6.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                o7v0.b((g7v0) obj4, (VkOnboarding$TintColor) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ o21(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
