package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.ldh;
import xsna.q630;
import xsna.rjh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        lg90 l;
        androidx.compose.runtime.a aVar;
        CharSequence a;
        CharSequence a2;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i2 = 4;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b6.a((vxj) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c cVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-230980951, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.ContentScene.<anonymous> (BiometricsLockPinView.kt:169)");
                    }
                    boolean z = !epx.f(cVar, c.e.a);
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    if (J || x == c0012a) {
                        x = new ne1(izsVar, r10 ? 1 : 0);
                        aVar2.R(x);
                    }
                    b57.a((gzs) x, null, z, null, 0L, aVar2, 0, 26);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                ldh.a aVar3 = (ldh.a) obj4;
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1832319074, intValue2, -1, "com.vk.profile.community.impl.ui.item.header.priorityblock.goods.CommunityPriorityBlockGoodsItem.ViewHolder.<anonymous> (CommunityPriorityBlockGoodsItem.kt:77)");
                    }
                    rrv0.d(null, null, null, null, kai.c(914061767, new ud6(i2, aVar3, izsVar2), aVar4), aVar4, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 3:
                a010 a010Var = (a010) obj4;
                rjh.a aVar5 = (rjh.a) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1356126768, intValue3, -1, "com.vk.profile.community.impl.ui.profile.content.holders.market.CommunityProfileContentMarketInfoBlockAdapter.OzonInfoBlockViewHolder.onBind.<anonymous> (CommunityProfileContentMarketInfoBlockAdapter.kt:65)");
                    }
                    ely elyVar = a010Var.a;
                    if (elyVar == null) {
                        aVar6.K(1910208200);
                        aVar6.j();
                        aVar = aVar6;
                        l = null;
                    } else {
                        aVar6.K(1910208201);
                        l = fwu0.l(aVar5.o ? elyVar.a : elyVar.b, null, null, null, aVar6, 0, 62);
                        aVar = aVar6;
                        aVar.j();
                    }
                    if (l == null) {
                        aVar.K(1862739585);
                        qzu0.a.getClass();
                        l = qzu0.v(aVar);
                        aVar.j();
                    } else {
                        aVar.K(1862734470);
                        aVar.j();
                    }
                    q630.a aVar7 = q630.a.a;
                    q630 f = txj0.f(aVar7, 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar8 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar8);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a3, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    float f2 = 16;
                    ijv0.c(SeparatorDpi.At1x, SeparatorAppearance.PrimaryAlpha, s200.H(aVar7, f2, 7, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), aVar, 54, 0);
                    q630 G = s200.G(aVar7, f2, f2, f2, 12);
                    boolean y = aVar.y(aVar5);
                    Object x2 = aVar.x();
                    if (y || x2 == c0012a) {
                        x2 = new kbe(aVar5, 5);
                        aVar.R(x2);
                    }
                    q630 c2 = ojc.c(G, true, null, null, (gzs) x2, 14);
                    ContentBadgeSize contentBadgeSize = ContentBadgeSize.Large;
                    ContentBadgeMode contentBadgeMode = ContentBadgeMode.Secondary;
                    ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Accent;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1304645628, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronOutline16> (VkSdkIcons.kt:472)");
                    }
                    lg90 b = or.b(aVar, 1539019876, R.drawable.vk_icon_chevron_outline_16, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    rnu0.c(contentBadgeSize, contentBadgeMode, design, c2, l, new l5g(l5g.k), a010Var.b, null, b, null, false, null, false, null, aVar, 134447542, 0, 16000);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((xph) obj4).a((List) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((uoj) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                com.vk.ecomm.design.compose.product_info.e.c(ne7.I(1), (androidx.compose.runtime.a) obj, (List) obj4, (q630) obj3);
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((vn20) obj4).b((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((xu70) obj4).a(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj3);
                return s3q0.a;
            case 9:
                hh80 hh80Var = (hh80) obj4;
                izs izsVar3 = (izs) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(806681792, intValue4, -1, "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoContent.<anonymous> (OnboardingPromoContent.kt:27)");
                    }
                    if (hh80Var.b) {
                        aVar9.K(1515291350);
                        cg80.d(hh80Var, izsVar3, aVar9, 0);
                        aVar9.j();
                    } else {
                        aVar9.K(1515436120);
                        pf80.d(hh80Var, izsVar3, aVar9, 0);
                        aVar9.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                uob0.a((gzs) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                ((vqd0) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 12:
                UserId userId = (UserId) obj4;
                CatalogProfileLocalState.FollowSource followSource = (CatalogProfileLocalState.FollowSource) obj3;
                UIBlock uIBlock = (UIBlock) obj2;
                if (!(uIBlock instanceof UIBlockSearchAuthor)) {
                    return s3q0.a;
                }
                UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) uIBlock;
                oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
                if (epx.f(userId, enh0.a(oapVar, false))) {
                    uIBlockSearchAuthor.C.b = followSource;
                    Group b2 = oapVar.b();
                    if (b2 != null) {
                        b2.k0 = VideoNotificationsStatus.PREFERRED.i();
                    }
                }
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                frj0.a((q630) obj3, (jai) obj4, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 14:
                a7k0 a7k0Var = (a7k0) obj4;
                dlv0 dlv0Var = (dlv0) obj3;
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar10.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1597558251, intValue5, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontScreen.<anonymous>.<anonymous> (StorefrontScreen.kt:95)");
                    }
                    if (a7k0Var == null) {
                        aVar10.K(325293175);
                        aVar10.j();
                    } else {
                        aVar10.K(325293176);
                        mqv g = jvi.g(aVar10);
                        tlo0 tlo0Var = a7k0Var.a;
                        if (tlo0Var == null) {
                            aVar10.K(1925014719);
                            aVar10.j();
                            a = null;
                        } else {
                            aVar10.K(1170475906);
                            a = tlo0Var.a((Context) aVar10.r(AndroidCompositionLocals_androidKt.b));
                            aVar10.j();
                        }
                        String obj5 = a != null ? a.toString() : null;
                        tlo0 tlo0Var2 = a7k0Var.b;
                        if (tlo0Var2 == null) {
                            aVar10.K(1925111935);
                            aVar10.j();
                            a2 = null;
                        } else {
                            aVar10.K(1170479042);
                            a2 = tlo0Var2.a((Context) aVar10.r(AndroidCompositionLocals_androidKt.b));
                            aVar10.j();
                        }
                        zkv0.c(dlv0Var, wlb0.m(obj5, a2 != null ? a2.toString() : null, null, aVar10, 4), null, g, null, null, aVar10, 6, 116);
                        aVar10.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                return s3q0.a;
            case 15:
                ((sti) obj).a(new fpp0((sl50) obj2, (sos0) obj4, ((epp0) obj3).d().c.c));
                return s3q0.a;
            case 16:
                VideoDialog videoDialog = (VideoDialog) obj4;
                int i3 = VideoDialog.P0;
                hit0 N8 = ((VideoGrowthComponent) obj3).N8();
                Context requireContext = videoDialog.requireContext();
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                N8.b(requireContext, (String) obj, (VideoGrowthAppStore) obj2, s490.f(b.C1208b.a()), null);
                videoDialog.O0.b();
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((hr80) obj4).a(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj3);
                return s3q0.a;
        }
    }

    public /* synthetic */ a6(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ a6(q630 q630Var, jai jaiVar, int i) {
        this.b = 13;
        this.d = q630Var;
        this.c = jaiVar;
    }

    public /* synthetic */ a6(enh0 enh0Var, UserId userId, CatalogProfileLocalState.FollowSource followSource) {
        this.b = 12;
        this.c = userId;
        this.d = followSource;
    }
}
