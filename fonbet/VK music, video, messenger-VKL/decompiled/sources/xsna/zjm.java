package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.f6u;
import xsna.m5u;
import xsna.oap;
import xsna.q630;
import xsna.ty6;
import xsna.wkj;
import xsna.xpb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zjm implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zjm(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.b;
        String str2 = null;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                akm.a((xpb0.a) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((sti) obj).a(new w3n((sl50) obj2, ((a5n) obj4).n, (pn0) obj3));
                return s3q0.a;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i2 = GoodPreviewFragment.X;
                f6u.c cVar = (f6u.c) ((f6u) obj3);
                ((GoodPreviewFragment) obj4).getFeature().C(new m5u.s(cVar.a, booleanValue, cVar.c));
                return s3q0.a;
            case 3:
                InfoModalBottomSheet.Params params = (InfoModalBottomSheet.Params) obj4;
                InfoModalBottomSheet infoModalBottomSheet = (InfoModalBottomSheet) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = InfoModalBottomSheet.g1;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1868329498, intValue, -1, "com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet.Content.<anonymous> (InfoModalBottomSheet.kt:37)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630.a aVar2 = q630.a.a;
                    q630 c = qri.c(aVar, aVar2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    lg90 a2 = pg90.a(params.b, 0, aVar);
                    ty6.a aVar4 = dt1.a.o;
                    vjw.a(a2, null, ahn.E(new gcv(aVar4), "MODAL_BOTTOM_SHEET_IMAGE"), null, wkj.a.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 24632, 104);
                    yqv0.c(params.c, ahn.E(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13).g(new gcv(aVar4)), "MODAL_BOTTOM_SHEET_TITLE"), wlb0.h(aVar).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar).C, aVar, 0, 0, 8120);
                    yqv0.c(params.d, ahn.E(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13).g(new gcv(aVar4)), "MODAL_BOTTOM_SHEET_TEXT"), wlb0.h(aVar).getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar).e0, aVar, 0, 0, 8120);
                    q630 E = ahn.E(txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), "MODAL_BOTTOM_SHEET_BUTTON");
                    String str3 = params.e;
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Secondary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean y = aVar.y(infoModalBottomSheet);
                    Object x = aVar.x();
                    if (y || x == c0012a) {
                        x = new v3n(infoModalBottomSheet, 11);
                        aVar.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, str3, null, null, null, null, false, null, null, null, aVar, 28080, 0, 0, 4190176);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                wbz wbzVar = (wbz) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1591500946, intValue2, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVKBidScreen.<anonymous> (LinkVKBidScreen.kt:48)");
                    }
                    if (wbzVar == null || wbzVar.a.isEmpty()) {
                        aVar5.K(258870512);
                    } else {
                        aVar5.K(260760427);
                        fdz.a(wbzVar.c, wbzVar.d, s200.E(q630.a.a, 16, 12), izsVar, aVar5, 384);
                    }
                    aVar5.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                kv80.a(ne7.I(1), (androidx.compose.runtime.a) obj, (izs) obj4, (q630) obj3);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                vma0.f((g770) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                xab0.a(obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) obj4;
                UserId userId = (UserId) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                arrayList.add(uIBlockSearchAuthor.u - 1, uIBlockSearchAuthor);
                for (UIBlock uIBlock : arrayList) {
                    if (uIBlock instanceof UIBlockSearchAuthor) {
                        UIBlockSearchAuthor uIBlockSearchAuthor2 = (UIBlockSearchAuthor) uIBlock;
                        if (uIBlockSearchAuthor2.Pb().equals(userId)) {
                            oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor2.y;
                            if (oapVar instanceof oap.b) {
                                ((Group) ((oap.b) oapVar).a).k0 = VideoNotificationsStatus.PREFERRED.i();
                            } else {
                                if (!(oapVar instanceof oap.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return new UIBlockList(uIBlockList, arrayList);
            case 9:
                k7i0 k7i0Var = (k7i0) obj4;
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-453865196, intValue3, -1, "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.SelectGroupVerificationMviView.SelectGroupVerificationMain.<anonymous> (SelectGroupVerificationMviView.kt:65)");
                    }
                    if (k7i0Var != null && (str = k7i0Var.c) != null && str.length() > 0) {
                        str2 = str;
                    }
                    if (str2 == null) {
                        str2 = zq.a(aVar6, 1922215754, R.string.verification_types_title, aVar6, 0);
                    } else {
                        aVar6.K(1922213584);
                        aVar6.j();
                    }
                    boolean J = aVar6.J(izsVar2);
                    Object x2 = aVar6.x();
                    int i4 = 6;
                    if (J || x2 == c0012a) {
                        x2 = new zje(izsVar2, i4);
                        aVar6.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    boolean J2 = aVar6.J(izsVar2);
                    Object x3 = aVar6.x();
                    if (J2 || x3 == c0012a) {
                        x3 = new q0(izsVar2, i4);
                        aVar6.R(x3);
                    }
                    o8i0.a(str2, gzsVar, (gzs) x3, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((f4k0) obj4).d((bn50) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ zjm(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
