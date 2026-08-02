package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionViewHolder;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.newsfeed.impl.items.posting.item.modals.Onboarding;
import com.vk.newsfeed.impl.items.posting.item.modals.PostingType;
import com.vk.newsfeed.impl.items.posting.item.modals.a;
import com.vk.newsfeed.impl.items.posting.item.modals.d;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.kyl;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class i8c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i8c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        final com.vk.newsfeed.impl.items.posting.item.modals.d dVar;
        Object xrj0Var;
        final wh50 wh50Var;
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                l22 l22Var = (l22) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(152782854, intValue, -1, "com.vk.ecomm.cart.impl.checkout.dropdown_dialog.CheckoutSelectDeliveryAreaBottomSheet.Builder.<anonymous> (CheckoutSelectDeliveryAreaBottomSheet.kt:51)");
                    }
                    p8c.b(arrayList, l22Var, null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                xnd xndVar = (xnd) this.c;
                jai jaiVar = (jai) this.d;
                ((Integer) obj2).getClass();
                xndVar.a(ne7.I(7), (androidx.compose.runtime.a) obj, jaiVar);
                break;
            case 2:
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                szi.a(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ojj.g((dsy) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                kxl.d((qow) this.c, (kyl.f) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                GenreActionViewHolder genreActionViewHolder = (GenreActionViewHolder) this.c;
                ComposeView composeView = (ComposeView) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-262546190, intValue2, -1, "com.vk.catalog2.common.ui.mvp.holder.video.showcase.GenreActionViewHolder.createView.<anonymous>.<anonymous> (GenreActionViewHolder.kt:54)");
                    }
                    UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) ((zak0) genreActionViewHolder.e).getValue();
                    if (uIBlockActionOpenSection == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        rrv0.d(null, null, null, null, kai.c(-1858277203, new i87(genreActionViewHolder, composeView, uIBlockActionOpenSection), aVar2), aVar2, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 6:
                q630 q630Var2 = (q630) this.c;
                List list = (List) this.d;
                ((Integer) obj2).getClass();
                urv.a(ne7.I(1), (androidx.compose.runtime.a) obj, list, q630Var2);
                break;
            case 7:
                pz00 pz00Var = (pz00) this.c;
                gmq gmqVar = (gmq) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                pz00Var.E.T4(new MarketProductTileConfig.b(booleanValue, true));
                ((FaveMarketItem) gmqVar).b.J = booleanValue;
                break;
            case 8:
                xq50 xq50Var = (xq50) this.c;
                wq50 wq50Var = (wq50) this.d;
                hi60 hi60Var = xq50Var.D;
                Context context = ((View) obj).getContext();
                MyTargetNativeAdEntry myTargetNativeAdEntry = wq50Var.i;
                NewsfeedExternalAction.Navigation.OpenMyTargetAds.a aVar3 = new NewsfeedExternalAction.Navigation.OpenMyTargetAds.a(NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.CARD, NativeAdContent.ViewTag.CTA, 6, (wix) obj2);
                u1c0 J0 = xq50Var.J0();
                hi60Var.sa(new NewsfeedExternalAction.Navigation.OpenMyTargetAds(context, myTargetNativeAdEntry, aVar3, J0 != null ? J0.k : -1));
                break;
            case 9:
                UserId userId = (UserId) this.c;
                CatalogProfileLocalState.FollowSource followSource = (CatalogProfileLocalState.FollowSource) this.d;
                UIBlock uIBlock = (UIBlock) obj2;
                if (uIBlock instanceof UIBlockSearchAuthor) {
                    UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) uIBlock;
                    if (epx.f(userId, qxh0.a(uIBlockSearchAuthor.y, false))) {
                        uIBlockSearchAuthor.C.b = followSource;
                    }
                    break;
                } else {
                    break;
                }
            case 10:
                com.vk.newsfeed.impl.items.posting.item.modals.d dVar2 = (com.vk.newsfeed.impl.items.posting.item.modals.d) this.c;
                final String str = (String) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                boolean z = true;
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1957748295, intValue3, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.<anonymous>.<anonymous> (SimplePostingCreateBottomSheet.kt:93)");
                    }
                    Object x = aVar4.x();
                    Object obj3 = a.C0011a.a;
                    if (x == obj3) {
                        com.vk.newsfeed.impl.items.posting.item.modals.b bVar = dVar2.c;
                        rs80 rs80Var = bVar.a;
                        boolean z2 = rs80Var.e;
                        x = androidx.compose.runtime.k.b(bVar.c((z2 && rs80Var.g) ? new PostingType.UserRedesigned(0) : z2 ? PostingType.b.a : PostingType.a.a));
                        aVar4.R(x);
                    }
                    final wh50 wh50Var2 = (wh50) x;
                    boolean J = aVar4.J((List) wh50Var2.getValue());
                    Object x2 = aVar4.x();
                    if (J || x2 == obj3) {
                        List<com.vk.newsfeed.impl.items.posting.item.modals.a> list2 = (List) wh50Var2.getValue();
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            for (com.vk.newsfeed.impl.items.posting.item.modals.a aVar5 : list2) {
                                if ((aVar5 instanceof a.b) && ((a.b) aVar5).e != null) {
                                    x2 = Boolean.valueOf(z);
                                    aVar4.R(x2);
                                }
                            }
                        }
                        z = false;
                        x2 = Boolean.valueOf(z);
                        aVar4.R(x2);
                    }
                    Boolean bool = (Boolean) x2;
                    boolean booleanValue2 = bool.booleanValue();
                    Object x3 = aVar4.x();
                    if (x3 == obj3) {
                        x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                        aVar4.R(x3);
                    }
                    wh50 wh50Var3 = (wh50) x3;
                    wh50 s = nr2.s(dVar2.f, Boolean.FALSE, null, aVar4, 48, 2);
                    Boolean bool2 = (Boolean) s.getValue();
                    bool2.getClass();
                    boolean l = aVar4.l(booleanValue2) | aVar4.J(s) | aVar4.y(dVar2);
                    Object x4 = aVar4.x();
                    if (l || x4 == obj3) {
                        dVar = dVar2;
                        wh50Var = wh50Var3;
                        xrj0Var = new xrj0(booleanValue2, s, wh50Var, dVar, null);
                        aVar4.R(xrj0Var);
                    } else {
                        dVar = dVar2;
                        xrj0Var = x4;
                        wh50Var = wh50Var3;
                    }
                    bap.f(bool, bool2, (wzs) xrj0Var, aVar4, 0);
                    boolean booleanValue3 = ((Boolean) wh50Var.getValue()).booleanValue();
                    Object x5 = aVar4.x();
                    if (x5 == obj3) {
                        x5 = new rt6(1, wh50Var);
                        aVar4.R(x5);
                    }
                    jai c = kai.c(-1114497377, new wzs() { // from class: xsna.wrj0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.wzs
                        public final Object invoke(Object obj4, Object obj5) {
                            Iterator it;
                            q630.a aVar6;
                            Object obj6;
                            androidx.compose.runtime.a aVar7;
                            com.vk.newsfeed.impl.items.posting.item.modals.d dVar3;
                            Cell$Middle.d dVar4;
                            androidx.compose.runtime.a aVar8;
                            androidx.compose.runtime.a aVar9;
                            wrj0 wrj0Var = this;
                            androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj4;
                            int intValue4 = ((Integer) obj5).intValue();
                            if (aVar10.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1114497377, intValue4, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.<anonymous>.<anonymous>.<anonymous> (SimplePostingCreateBottomSheet.kt:128)");
                                }
                                q630.a aVar11 = q630.a.a;
                                q630 E = ahn.E(s200.H(txj0.d(aVar11, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, 7), "PostingCreateBottomSheet");
                                a.m mVar = androidx.compose.foundation.layout.a.c;
                                dt1.a.getClass();
                                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar10, 0);
                                int hashCode = Long.hashCode(n34.n(aVar10));
                                sy90 D = aVar10.D();
                                q630 c2 = qri.c(aVar10, E);
                                cri.h7.getClass();
                                LayoutNode.a aVar12 = cri.a.b;
                                if (aVar10.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar10.H();
                                if (aVar10.L()) {
                                    aVar10.I(aVar12);
                                } else {
                                    aVar10.f();
                                }
                                k9q0.w(aVar10, a, cri.a.f);
                                k9q0.w(aVar10, D, cri.a.e);
                                k9q0.w(aVar10, Integer.valueOf(hashCode), cri.a.g);
                                k9q0.t(aVar10, cri.a.h);
                                k9q0.w(aVar10, c2, cri.a.d);
                                q630 E2 = ahn.E(s200.H(aVar11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 7), "PostingCreateBottomSheetTopbar");
                                TopBar$Middle.Text.Title a2 = TopBar$Middle.Text.Title.b.a(str, null, null, null, null, aVar10, 196608, 30);
                                Object x6 = aVar10.x();
                                Object obj7 = a.C0011a.a;
                                if (x6 == obj7) {
                                    x6 = new acc0(8);
                                    aVar10.R(x6);
                                }
                                q630.a aVar13 = aVar11;
                                Object obj8 = obj7;
                                muv0.h(TopBar$Middle.Text.b.a(a2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3), aVar10, 6), E2, null, null, null, null, null, null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar10, 100663344, 0, 7932);
                                androidx.compose.runtime.a aVar14 = aVar10;
                                aVar14.K(-29168776);
                                Iterator it2 = ((List) wh50Var2.getValue()).iterator();
                                androidx.compose.runtime.a aVar15 = aVar14;
                                while (it2.hasNext()) {
                                    com.vk.newsfeed.impl.items.posting.item.modals.a aVar16 = (com.vk.newsfeed.impl.items.posting.item.modals.a) it2.next();
                                    if (aVar16.b().invoke().booleanValue()) {
                                        aVar15.K(1708132347);
                                        boolean z3 = aVar16 instanceof a.b;
                                        com.vk.newsfeed.impl.items.posting.item.modals.d dVar5 = dVar;
                                        if (z3) {
                                            aVar15.K(1708228354);
                                            a.b bVar2 = (a.b) aVar16;
                                            Onboarding onboarding = bVar2.e;
                                            String str2 = bVar2.g;
                                            if (bVar2.f != null) {
                                                aVar15.K(1708258238);
                                                int i = bVar2.a;
                                                int i2 = bVar2.b;
                                                String str3 = dVar5.a.k.a;
                                                aVar6 = aVar13;
                                                q630 E3 = ahn.E(aVar6, str2);
                                                boolean y = aVar15.y(dVar5);
                                                Object x7 = aVar15.x();
                                                Object obj9 = obj8;
                                                if (y || x7 == obj9) {
                                                    x7 = new b1z(dVar5, 29);
                                                    aVar15.R(x7);
                                                }
                                                androidx.compose.runtime.a aVar17 = aVar15;
                                                dVar5.c(i, i2, str3, E3, (gzs) x7, aVar17, 0);
                                                androidx.compose.runtime.a aVar18 = aVar17;
                                                aVar18.j();
                                                it = it2;
                                                obj6 = obj9;
                                                aVar9 = aVar18;
                                            } else {
                                                aVar6 = aVar13;
                                                Object obj10 = obj8;
                                                aVar15.K(1709295808);
                                                String N = d370.N(bVar2.b, 0, aVar15);
                                                if (onboarding == null || (onboarding.b == Onboarding.ItemType.CommunityVideo && !((Boolean) wh50Var.getValue()).booleanValue())) {
                                                    aVar15.K(1709690314);
                                                    androidx.compose.runtime.a aVar19 = aVar15;
                                                    it = it2;
                                                    obj6 = obj10;
                                                    dVar3 = dVar5;
                                                    Cell$Middle.d a3 = Cell$Middle.d.b.a(N, null, null, 0, null, null, aVar19, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                                                    androidx.compose.runtime.a aVar20 = aVar19;
                                                    aVar20.j();
                                                    dVar4 = a3;
                                                    aVar8 = aVar20;
                                                } else {
                                                    aVar15.K(1709550597);
                                                    aVar15.j();
                                                    dVar3 = dVar5;
                                                    dVar4 = new d.a(zr.a("<u>", N, "</u>"), VkOnboarding$HighlighterMarkerType.Type3, VkOnboarding$TintColor.Lime, 8);
                                                    it = it2;
                                                    obj6 = obj10;
                                                    aVar8 = aVar15;
                                                }
                                                int i3 = bVar2.a;
                                                q630 E4 = ahn.E(aVar6, str2);
                                                tlo0 tlo0Var = onboarding != null ? onboarding.a : null;
                                                boolean y2 = aVar8.y(dVar3) | aVar8.J(aVar16);
                                                Object x8 = aVar8.x();
                                                if (y2 || x8 == obj6) {
                                                    x8 = new qk(18, dVar3, aVar16);
                                                    aVar8.R(x8);
                                                }
                                                gzs gzsVar2 = (gzs) x8;
                                                androidx.compose.runtime.a aVar21 = aVar8;
                                                dVar3.d(i3, dVar4, E4, tlo0Var, gzsVar2, aVar21, 0);
                                                androidx.compose.runtime.a aVar22 = aVar21;
                                                aVar22.j();
                                                aVar9 = aVar22;
                                            }
                                            aVar9.j();
                                            aVar7 = aVar9;
                                        } else {
                                            it = it2;
                                            aVar6 = aVar13;
                                            obj6 = obj8;
                                            if (!(aVar16 instanceof a.C1383a)) {
                                                throw alb0.c(-360539929, aVar15);
                                            }
                                            aVar15.K(1710477125);
                                            a.C1383a c1383a = (a.C1383a) aVar16;
                                            int i4 = c1383a.a;
                                            m7b m7bVar = c1383a.d;
                                            q630 E5 = ahn.E(aVar6, c1383a.e);
                                            boolean y3 = aVar15.y(dVar5) | aVar15.J(aVar16);
                                            Object x9 = aVar15.x();
                                            if (y3 || x9 == obj6) {
                                                x9 = new oe5(21, dVar5, aVar16);
                                                aVar15.R(x9);
                                            }
                                            dVar5.a(i4, m7bVar, E5, (gzs) x9, aVar15, 0);
                                            aVar15.j();
                                            aVar7 = aVar15;
                                        }
                                    } else {
                                        it = it2;
                                        aVar6 = aVar13;
                                        obj6 = obj8;
                                        aVar15.K(1701343564);
                                        aVar7 = aVar15;
                                    }
                                    aVar7.j();
                                    wrj0Var = this;
                                    obj8 = obj6;
                                    aVar13 = aVar6;
                                    it2 = it;
                                    aVar15 = aVar7;
                                }
                                if (gp.d(aVar15)) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar10.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar4);
                    com.vk.newsfeed.impl.items.posting.item.modals.d dVar3 = dVar;
                    dVar3.b(3120, aVar4, c, (gzs) x5, null, booleanValue3);
                    Object x6 = aVar4.x();
                    if (x6 == obj3) {
                        x6 = androidx.compose.runtime.k.b(null);
                        aVar4.R(x6);
                    }
                    wh50 wh50Var4 = (wh50) x6;
                    s3q0 s3q0Var = s3q0.a;
                    boolean y = aVar4.y(dVar3);
                    Object x7 = aVar4.x();
                    if (y || x7 == obj3) {
                        x7 = new com.vk.newsfeed.impl.items.posting.item.modals.c(dVar3, wh50Var2, wh50Var4, null);
                        aVar4.R(x7);
                    }
                    bap.g(s3q0Var, (wzs) x7, aVar4, 6);
                    boolean y2 = aVar4.y(dVar3);
                    Object x8 = aVar4.x();
                    if (y2 || x8 == obj3) {
                        x8 = new com.vk.movika.sdk.base.ui.s0(27, wh50Var4, dVar3);
                        aVar4.R(x8);
                    }
                    bap.c(s3q0Var, (izs) x8, aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 11:
                izs izsVar = (izs) this.c;
                q630 q630Var3 = (q630) this.d;
                ((Integer) obj2).getClass();
                i5k0.e(ne7.I(1), (androidx.compose.runtime.a) obj, izsVar, q630Var3);
                break;
            case 12:
                siq0 siq0Var = (siq0) this.c;
                jai jaiVar2 = (jai) this.d;
                ((Integer) obj2).getClass();
                siq0Var.h(ne7.I(71), (androidx.compose.runtime.a) obj, jaiVar2);
                break;
            default:
                ((Integer) obj2).getClass();
                t7u0.c((String) this.c, (SemanticsConfiguration) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ i8c(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ i8c(qxh0 qxh0Var, UserId userId, CatalogProfileLocalState.FollowSource followSource) {
        this.b = 9;
        this.c = userId;
        this.d = followSource;
    }
}
