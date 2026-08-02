package xsna;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.SectionNavigationLinksViewHolder;
import com.vk.catalog2.feature.music.holders.ComposeMusicActionPlayAudiosFromBlockIdVh;
import com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.b78;
import xsna.cri;
import xsna.dt1;
import xsna.kyl;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gx implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gx(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        Object obj3;
        switch (this.b) {
            case 0:
                kx kxVar = (kx) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1038269918, intValue, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.ThemedContent.<anonymous>.<anonymous>.<anonymous> (ActionButtonsContentView.kt:70)");
                    }
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new tw(izsVar, 0);
                        aVar.R(x);
                    }
                    kxVar.n(512, aVar, (gzs) x, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((mh2) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                o.a aVar2 = (o.a) this.c;
                izs izsVar2 = (izs) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1333052959, intValue2, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingMenuView.<anonymous> (BookingStartScreen.kt:165)");
                    }
                    vz7.h(aVar2.d, aVar2.e, izsVar2, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                izs izsVar3 = (izs) this.d;
                ClipCoauthorListVS clipCoauthorListVS = (ClipCoauthorListVS) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1820928858, intValue3, -1, "com.vk.clips.coauthors.list.common.mvi.ClipsCoauthorsListContent.<anonymous> (ClipsCoauthorsListContent.kt:60)");
                    }
                    float f = 12;
                    q630 d = rte0.d(q630.a.a, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 E = ahn.E(hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), "ClipsCoauthorsListContent");
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar4, 0);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630 c = qri.c(aVar4, E);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar5);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, a, cri.a.f);
                    k9q0.w(aVar4, D, cri.a.e);
                    k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar4, cri.a.h);
                    k9q0.w(aVar4, c, cri.a.d);
                    TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.clips_coauthors_bs_title, 0, aVar4), null, null, null, null, aVar4, 196608, 30), null, null, null, aVar4, 14);
                    String N = d370.N(R.string.clips_coauthors_selection_accessibility_close, 0, aVar4);
                    boolean J2 = aVar4.J(izsVar3);
                    Object x2 = aVar4.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J2 || x2 == c0012a) {
                        x2 = new se1(izsVar3, 4);
                        aVar4.R(x2);
                    }
                    TopBar$Before.d a3 = TopBar$Before.d.a.a(N, (gzs) x2, null, null, aVar4, 24576, 12);
                    boolean z = clipCoauthorListVS.e;
                    ArrayList arrayList2 = clipCoauthorListVS.b;
                    muv0.h(a2, null, null, null, null, a3, null, null, true ^ z, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 0, 0, 7902);
                    String str = clipCoauthorListVS.c;
                    int size = arrayList2.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            arrayList = arrayList2;
                            obj3 = arrayList.get(i);
                            if (!((ClipCoauthorListVS.Owner) obj3).e) {
                                i++;
                                arrayList2 = arrayList;
                            }
                        } else {
                            arrayList = arrayList2;
                            obj3 = null;
                        }
                    }
                    ClipCoauthorListVS.Owner owner = (ClipCoauthorListVS.Owner) obj3;
                    if (owner == null || owner.f) {
                        str = null;
                    }
                    boolean J3 = aVar4.J(izsVar3);
                    Object x3 = aVar4.x();
                    if (J3 || x3 == c0012a) {
                        x3 = new iz7(izsVar3, 1);
                        aVar4.R(x3);
                    }
                    pmd.d(str, (gzs) x3, aVar4, 0);
                    boolean z2 = clipCoauthorListVS.e;
                    boolean J4 = aVar4.J(izsVar3);
                    Object x4 = aVar4.x();
                    if (J4 || x4 == c0012a) {
                        x4 = new d74(izsVar3, 2);
                        aVar4.R(x4);
                    }
                    izs izsVar4 = (izs) x4;
                    boolean J5 = aVar4.J(izsVar3);
                    Object x5 = aVar4.x();
                    if (J5 || x5 == c0012a) {
                        x5 = new mmd(izsVar3, 0);
                        aVar4.R(x5);
                    }
                    izs izsVar5 = (izs) x5;
                    boolean J6 = aVar4.J(izsVar3);
                    Object x6 = aVar4.x();
                    if (J6 || x6 == c0012a) {
                        x6 = new f74(izsVar3, 2);
                        aVar4.R(x6);
                    }
                    pmd.c(z2, arrayList, izsVar4, izsVar5, clipCoauthorListVS.d ? (gzs) x6 : null, aVar4, 0);
                    aVar4.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                ComposeMusicActionPlayAudiosFromBlockIdVh composeMusicActionPlayAudiosFromBlockIdVh = (ComposeMusicActionPlayAudiosFromBlockIdVh) this.c;
                View view = (View) this.d;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1192984879, intValue4, -1, "com.vk.catalog2.feature.music.holders.ComposeMusicActionPlayAudiosFromBlockIdVh.createView.<anonymous>.<anonymous> (ComposeMusicActionPlayAudiosFromBlockIdVh.kt:69)");
                    }
                    rrv0.d(null, null, null, null, kai.c(79296630, new y61(4, composeMusicActionPlayAudiosFromBlockIdVh, view), aVar6), aVar6, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                egi.a((bei0) this.c, (jai) this.d, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                kxl.c((qow) this.c, (kyl.d) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                hmd0 hmd0Var = (hmd0) this.c;
                q7u q7uVar = (q7u) this.d;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-462983005, intValue5, -1, "com.vk.ecomm.market.good.ui.holder.reject.GoodRejectInfoHolder.onBind.<anonymous>.<anonymous> (GoodRejectInfoHolder.kt:42)");
                    }
                    Context context = (Context) aVar7.r(AndroidCompositionLocals_androidKt.b);
                    boolean y = aVar7.y(q7uVar) | aVar7.y(context);
                    Object x7 = aVar7.x();
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (y || x7 == c0012a2) {
                        x7 = new yl0(10, q7uVar, context);
                        aVar7.R(x7);
                    }
                    izs izsVar6 = (izs) x7;
                    boolean y2 = aVar7.y(q7uVar) | aVar7.y(context);
                    Object x8 = aVar7.x();
                    if (y2 || x8 == c0012a2) {
                        x8 = new com.vk.movika.sdk.base.logic.interactor.i(14, q7uVar, context);
                        aVar7.R(x8);
                    }
                    izs izsVar7 = (izs) x8;
                    boolean y3 = aVar7.y(q7uVar) | aVar7.y(context);
                    Object x9 = aVar7.x();
                    if (y3 || x9 == c0012a2) {
                        x9 = new rp1(11, q7uVar, context);
                        aVar7.R(x9);
                    }
                    fjd0.a(hmd0Var, izsVar6, izsVar7, (gzs) x9, txj0.f(s200.E(q630.a.a, kqu0.b, kqu0.v), 1.0f), aVar7, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                n750.a((b78.d) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((f9d0) this.c).s((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                lkd0 lkd0Var = (lkd0) this.c;
                jkd0 jkd0Var = (jkd0) this.d;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-79377890, intValue6, -1, "com.vk.ecomm.market.good.good2.presentation.community.market.ProductCardCommunityMarketInfoHolder.onBind.<anonymous> (ProductCardCommunityMarketInfoHolder.kt:46)");
                    }
                    if (lkd0Var == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    rrv0.d(null, null, null, null, kai.c(-620181287, new cx(14, lkd0Var, jkd0Var), aVar8), aVar8, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            case 11:
                com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.b bVar = (com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.b) this.c;
                SectionNavigationLinksViewHolder sectionNavigationLinksViewHolder = (SectionNavigationLinksViewHolder) this.d;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1919319453, intValue7, -1, "com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.SectionNavigationLinksViewHolder.createView.<anonymous>.<anonymous>.<anonymous> (SectionNavigationLinksViewHolder.kt:54)");
                    }
                    boolean y4 = aVar9.y(sectionNavigationLinksViewHolder);
                    Object x10 = aVar9.x();
                    a.C0011a.C0012a c0012a3 = a.C0011a.a;
                    if (y4 || x10 == c0012a3) {
                        SectionNavigationLinksViewHolder.a aVar10 = new SectionNavigationLinksViewHolder.a(1, sectionNavigationLinksViewHolder, SectionNavigationLinksViewHolder.class, "onPrimaryLinkClicked", "onPrimaryLinkClicked(Lcom/vk/catalog2/common/ui/mvp/holder/search/section_navigator_vh/SectionNavigationLinksState$Link;)V", 0);
                        aVar9.R(aVar10);
                        x10 = aVar10;
                    }
                    izs izsVar8 = (izs) ((fcy) x10);
                    boolean y5 = aVar9.y(sectionNavigationLinksViewHolder);
                    Object x11 = aVar9.x();
                    if (y5 || x11 == c0012a3) {
                        SectionNavigationLinksViewHolder.b bVar2 = new SectionNavigationLinksViewHolder.b(1, sectionNavigationLinksViewHolder, SectionNavigationLinksViewHolder.class, "onLinkClicked", "onLinkClicked(Lcom/vk/catalog2/common/ui/mvp/holder/search/section_navigator_vh/SectionNavigationLinksState$Link;)V", 0);
                        aVar9.R(bVar2);
                        x11 = bVar2;
                    }
                    com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.a.b(bVar, izsVar8, (izs) ((fcy) x11), aVar9, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                i5k0.b((j5k0) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ gx(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ gx(izs izsVar, ClipCoauthorListVS clipCoauthorListVS) {
        this.b = 3;
        this.d = izsVar;
        this.c = clipCoauthorListVS;
    }
}
