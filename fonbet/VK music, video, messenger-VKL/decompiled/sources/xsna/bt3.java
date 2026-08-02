package xsna;

import android.graphics.Point;
import android.util.Size;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.ee30;
import xsna.q630;
import xsna.ty6;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bt3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bt3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0432, code lost:
    
        if (r8 == r7) goto L97;
     */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        float f;
        a.C0011a.C0012a c0012a;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                dt3.d((oq3) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((wk50.a) this.c).b(new ClipItemPatch.ActionButton.a((cut0) obj, (cut0) obj2));
                return s3q0.a;
            case 2:
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-756217679, intValue, -1, "com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetLayout.kt:280)");
                    }
                    if (cq.i(0, aVar, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((eug) this.c).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                StickerAttachment stickerAttachment = (StickerAttachment) obj;
                xwb0 xwb0Var = (xwb0) obj2;
                e2g0 e2g0Var = ((CommunityRepliesFragment) this.c).Z;
                if (e2g0Var != null) {
                    e2g0Var.s(stickerAttachment, xwb0Var);
                }
                return s3q0.a;
            case 5:
                kbq kbqVar = (kbq) this.c;
                kbq kbqVar2 = (kbq) obj2;
                return (kbqVar2 == null || ((so4) ((one.video.player.tracks.a) kbqVar.a.a).c).d > ((so4) ((one.video.player.tracks.a) kbqVar2.a.a).c).d) ? kbqVar : kbqVar2;
            case 6:
                u6u u6uVar = (u6u) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-709084431, intValue2, -1, "com.vk.ecomm.market.goodpreview.presentation.viewholder.GoodPreviewMarketHeaderItemViewHolder.<anonymous> (GoodPreviewMarketHeaderItemViewHolder.kt:28)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-513482474, new ce0(u6uVar, 5), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 7:
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1311256183, intValue3, -1, "com.vk.importcontacts.impl.presentation.main.view.InternalContent.<anonymous> (ImportContactsView.kt:54)");
                    }
                    q630.a aVar4 = q630.a.a;
                    q630 d = txj0.d(aVar4, 1.0f);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, d);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar5);
                    } else {
                        aVar3.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar3, d2, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar3, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar3, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar3, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar3, c, dVar);
                    float f2 = 12;
                    q630 E = s200.E(aVar4, 4, f2);
                    ty6 ty6Var = dt1.a.d;
                    ra8 ra8Var = ra8.a;
                    q630 E2 = ahn.E(ra8Var.b(E, ty6Var), "skipButtonTestTag");
                    String N = d370.N(R.string.import_contacts_skip_button_text, 0, aVar3);
                    boolean J = aVar3.J(izsVar);
                    Object x = aVar3.x();
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (J || x == c0012a2) {
                        f = f2;
                        x = new fe1(izsVar, 2);
                        aVar3.R(x);
                    } else {
                        f = f2;
                    }
                    rqw.b(0, aVar3, N, (gzs) x, E2);
                    q630 b = ra8Var.b(p490.D(s200.H(txj0.f(aVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 68, 5), p490.x(aVar3), 14), dt1.a.f);
                    ty6.a aVar6 = dt1.a.o;
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar6, aVar3, 48);
                    int hashCode2 = Long.hashCode(n34.n(aVar3));
                    sy90 D2 = aVar3.D();
                    q630 c2 = qri.c(aVar3, b);
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar5);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a, cVar);
                    k9q0.w(aVar3, D2, eVar);
                    ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                    k9q0.w(aVar3, c2, dVar);
                    qzu0.a.getClass();
                    vjw.a(qzu0.p0(aVar3), null, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 26, 1, aVar4), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar3, 440, 120);
                    float f3 = 16;
                    float f4 = f;
                    yqv0.c(d370.N(R.string.import_contacts_title, 0, aVar3), ahn.E(s200.H(new gcv(aVar6), f3, f, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), "addFriendsFromContactsTestTag"), 0L, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar3).g, aVar3, 0, 0, 8124);
                    yqv0.c(d370.N(R.string.import_contacts_subtitle, 0, aVar3), lr.c(aVar6, s200.H(aVar4, f3, 8, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8)), wlb0.h(aVar3).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar3).p1, aVar3, 0, 0, 8120);
                    q630 E3 = ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1, aVar4), "whyNeedThisTestTag");
                    String N2 = d370.N(R.string.import_contacts_details_button_text, 0, aVar3);
                    ButtonSize buttonSize = ButtonSize.Medium;
                    ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean J2 = aVar3.J(izsVar);
                    Object x2 = aVar3.x();
                    if (!J2) {
                        c0012a = c0012a2;
                        break;
                    } else {
                        c0012a = c0012a2;
                    }
                    x2 = new zyf(izsVar, 2);
                    aVar3.R(x2);
                    a.C0011a.C0012a c0012a3 = c0012a;
                    bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E3, null, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, aVar3, 28080, 0, 0, 4190176);
                    aVar3.G();
                    q630 E4 = ahn.E(ra8Var.b(s200.E(txj0.f(aVar4, 1.0f), f3, f4), dt1.a.i), "searchInPhoneBookBtnTestTag");
                    String N3 = d370.N(R.string.import_contacts_import_button_text, 0, aVar3);
                    ButtonSize buttonSize2 = ButtonSize.Large;
                    ButtonStyle buttonStyle2 = ButtonStyle.Primary;
                    boolean J3 = aVar3.J(izsVar);
                    Object x3 = aVar3.x();
                    if (J3 || x3 == c0012a3) {
                        x3 = new me0(izsVar, 6);
                        aVar3.R(x3);
                    }
                    bhu0.e((gzs) x3, buttonSize2, buttonStyle2, buttonAppearance, E4, null, false, false, null, null, null, N3, null, null, null, null, false, null, null, null, aVar3, X2.b.f, 0, 0, 4190176);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((uiy) this.c).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 9:
                StickerAttachment stickerAttachment2 = (StickerAttachment) obj;
                xwb0 xwb0Var2 = (xwb0) obj2;
                e2g0 e2g0Var2 = ((MarketItemReviewRepliesFragment) this.c).Y;
                if (e2g0Var2 != null) {
                    e2g0Var2.s(stickerAttachment2, xwb0Var2);
                }
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ie30.b((ee30.a) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                ((lb40) this.c).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                ((vsa0) this.c).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 13:
                List list = (List) this.c;
                HashMap r = p4g.r(j5g.u0((List) obj2, (List) obj), zdd0.b);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UserProfile userProfile = (UserProfile) r.get((UserId) it.next());
                    if (userProfile != null) {
                        arrayList.add(userProfile);
                    }
                }
                return arrayList;
            case 14:
                tt9 tt9Var = (tt9) this.c;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(292394826, intValue4, -1, "com.vk.clips.design.compose.profile.ProfileCard.<anonymous> (ProfileCard.kt:82)");
                    }
                    dt1.a.getClass();
                    ty6.a aVar8 = dt1.a.o;
                    float f5 = 12;
                    q630 G = s200.G(txj0.f(q630.a.a, 1.0f), f5, 16, f5, 13);
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar8, aVar7, 48);
                    int hashCode3 = Long.hashCode(n34.n(aVar7));
                    sy90 D3 = aVar7.D();
                    q630 c3 = qri.c(aVar7, G);
                    cri.h7.getClass();
                    LayoutNode.a aVar9 = cri.a.b;
                    if (aVar7.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar7.H();
                    if (aVar7.L()) {
                        aVar7.I(aVar9);
                    } else {
                        aVar7.f();
                    }
                    k9q0.w(aVar7, a2, cri.a.f);
                    k9q0.w(aVar7, D3, cri.a.e);
                    k9q0.w(aVar7, Integer.valueOf(hashCode3), cri.a.g);
                    k9q0.t(aVar7, cri.a.h);
                    k9q0.w(aVar7, c3, cri.a.d);
                    nud0.h(tt9Var.a, aVar7, 6);
                    nud0.e(tt9Var.b, aVar7, 6);
                    nud0.b(tt9Var.c, null, aVar7, 0);
                    aVar7.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 15:
                cmo0 cmo0Var = (cmo0) this.c;
                int intValue5 = ((Integer) obj).intValue();
                int intValue6 = ((Integer) obj2).intValue();
                xpa0 xpa0Var = cmo0Var.e;
                Size L = xpa0Var.L();
                int width = L != null ? L.getWidth() : 0;
                Size Q = xpa0Var.Q();
                int width2 = (width - (Q != null ? Q.getWidth() : 0)) / 2;
                Size Q2 = xpa0Var.Q();
                return new Point(swe0.g(intValue5, width2, (Q2 != null ? Q2.getWidth() : iah0.f().widthPixels) + width2), intValue6);
            case 16:
                ((Integer) obj2).getClass();
                ((ihs0) this.c).eo(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                return xox0.B((xox0) this.c, (androidx.compose.runtime.a) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ bt3(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
