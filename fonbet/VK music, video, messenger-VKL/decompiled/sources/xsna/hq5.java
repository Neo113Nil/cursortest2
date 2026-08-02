package xsna;

import android.content.Context;
import android.widget.ImageView;
import androidx.compose.runtime.a;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.orders.impl.orderlist.presentation.OrderListFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.TopBarSubscriptionManageType;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.q630;
import xsna.xjd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class hq5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hq5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x046d  */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [com.vk.core.compose.component.topbar.d] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v78, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        SemanticsConfiguration.Mode mode;
        TopBar$Before.e eVar;
        com.vk.core.compose.component.topbar.d dVar;
        ?? r16;
        ImageView imageView;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i2 = 2;
        int i3 = 3;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                iq5 iq5Var = (iq5) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1159756348, intValue, -1, "com.vk.avatarchange.AvatarChangePublishFragment.switchWithHighlight.<anonymous>.<anonymous> (AvatarChangePublishFragment.kt:133)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(402437945, new com.vk.movika.tools.controls.seekbar.m(iq5Var, i2), aVar), aVar, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ny9.f((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 2:
                VideoFile videoFile = (VideoFile) obj3;
                ((Integer) obj).intValue();
                xjd xjdVar = (xjd) obj2;
                if ((xjdVar instanceof xjd.a) && epx.f(((xjd.a) xjdVar).a.r1(), videoFile.r1())) {
                    r7 = true;
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                int i4 = com.vk.attachpicker.collages.a.k1;
                ((lds0) obj3).onError();
                break;
            case 4:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = CommunityReviewsFragment.o0;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(143690151, intValue2, -1, "com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment.setupTopBar.<anonymous>.<anonymous> (CommunityReviewsFragment.kt:542)");
                    }
                    TopBar$Middle.Text.Title a = TopBar$Middle.Text.Title.b.a(d370.N(R.string.reviews_toolbar_title, 0, aVar2), null, null, null, null, aVar2, 196608, 30);
                    androidx.compose.runtime.a aVar3 = aVar2;
                    TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(a, null, null, null, aVar3, 14);
                    Context requireContext = communityReviewsFragment.requireContext();
                    HashSet hashSet = iah0.a;
                    if (fnj.c(requireContext)) {
                        aVar3.K(-1408777751);
                        lg90 m = m200.m(aVar3);
                        String N = d370.N(R.string.vk_back, 0, aVar3);
                        boolean y = aVar3.y(communityReviewsFragment);
                        Object x = aVar3.x();
                        if (y || x == c0012a) {
                            x = new defpackage.f(communityReviewsFragment, 29);
                            aVar3.R(x);
                        }
                        mode = null;
                        TopBar$Before.e a3 = TopBar$Before.e.a.a(m, N, (gzs) x, null, null, null, aVar3, 1572872, 56);
                        aVar3 = aVar3;
                        aVar3.j();
                        eVar = a3;
                    } else {
                        mode = null;
                        aVar3.K(-1408476121);
                        aVar3.j();
                        eVar = null;
                    }
                    int i6 = CommunityReviewsFragment.c.$EnumSwitchMapping$0[((TopBarSubscriptionManageType) ((zak0) communityReviewsFragment.j0).getValue()).ordinal()];
                    if (i6 == 1) {
                        aVar3.K(-1408274838);
                        Object x2 = aVar3.x();
                        if (x2 == c0012a) {
                            x2 = new fi80(new z4f(communityReviewsFragment, 11), new zqf(communityReviewsFragment, 7));
                            aVar3.R(x2);
                        }
                        dVar = (fi80) x2;
                        aVar3.j();
                    } else if (i6 != 2) {
                        aVar3.K(-1406757482);
                        aVar3.j();
                        r16 = mode;
                        muv0.h(a2, null, null, null, null, eVar, r16, null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar3, 100663296, 0, 7838);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.K(-1407516888);
                        lg90 r = m200.r(aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().b;
                        boolean y2 = aVar3.y(communityReviewsFragment);
                        Object x3 = aVar3.x();
                        if (y2 || x3 == c0012a) {
                            x3 = new defpackage.j(communityReviewsFragment, 28);
                            aVar3.R(x3);
                        }
                        androidx.compose.runtime.a aVar4 = aVar3;
                        d.c.C0760d a4 = d.c.C0760d.a.a(r, null, (gzs) x3, null, new l5g(j), null, aVar4, 1572872, 42);
                        aVar3 = aVar4;
                        Object x4 = aVar3.x();
                        if (x4 == c0012a) {
                            x4 = new com.vk.movika.sdk.base.observable.u(18);
                            aVar3.R(x4);
                        }
                        dVar = d.a.a(a4, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 3), aVar3, 24576, 6);
                        aVar3.j();
                    }
                    r16 = dVar;
                    muv0.h(a2, null, null, null, null, eVar, r16, null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar3, 100663296, 0, 7838);
                    if (androidx.compose.runtime.b.d()) {
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 5:
                uco0 uco0Var = (uco0) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                aVar5.K(666084174);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(666084174, intValue3, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:145)");
                }
                String str = ((edo0) uco0Var).b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((wvq) obj3).i(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((o4r) obj3).eo(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 8:
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((com.vk.core.compose.component.cell.content.e0) obj3).a(tpg0.a, q630.a.a, (androidx.compose.runtime.a) obj, ne7.I(55));
                break;
            case 10:
                float floatValue = ((Float) obj2).floatValue();
                ((xlb0) obj).a();
                ((Ref$FloatRef) obj3).element = floatValue;
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((go20) obj3).c(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 12:
                OrderListFragment orderListFragment = (OrderListFragment) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = OrderListFragment.Q;
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1587130430, intValue4, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.OrderListFragment.onCreateView.<anonymous>.<anonymous> (OrderListFragment.kt:90)");
                    }
                    nzw nzwVar = orderListFragment.N;
                    qcy<Object> qcyVar = OrderListFragment.Q[0];
                    ew80 ew80Var = (ew80) bu00.k(nzwVar);
                    FragmentActivity kn = orderListFragment.kn();
                    HashSet hashSet2 = iah0.a;
                    boolean d = fnj.d(kn);
                    boolean y3 = aVar6.y(orderListFragment);
                    Object x5 = aVar6.x();
                    if (y3 || x5 == c0012a) {
                        x5 = new uv20(orderListFragment, 14);
                        aVar6.R(x5);
                    }
                    izs izsVar = (izs) x5;
                    boolean y4 = aVar6.y(orderListFragment);
                    Object x6 = aVar6.x();
                    if (y4 || x6 == c0012a) {
                        x6 = new o010(orderListFragment, 23);
                        aVar6.R(x6);
                    }
                    fv80.a(ew80Var, d, izsVar, (izs) x6, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 13:
                Integer num = (Integer) obj;
                if (((GroupCallViewModel.GroupCallViewMode) obj2) != ((ha90) obj3).b) {
                    break;
                } else {
                    break;
                }
            case 14:
                ((Integer) obj2).getClass();
                ((fgb0) obj3).b(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 15:
                ftc0 ftc0Var = (ftc0) obj3;
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                esc0 esc0Var = ftc0Var.i;
                isiVar.c = new lxs(isiVar.a(new dsc0(esc0Var, sj50Var)), isiVar.a(new asc0(esc0Var, sj50Var)), isiVar.a(new yrc0(esc0Var, sj50Var)), isiVar.a(new csc0(esc0Var, sj50Var, ftc0Var.f)), 1);
                break;
            case 16:
                zph0 zph0Var = (zph0) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1117854916, intValue5, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent.ThemedContent.<anonymous> (SearchDatabaseViewContent.kt:112)");
                    }
                    zph0Var.k(8, aVar7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                break;
            case 17:
                o0i0 o0i0Var = (o0i0) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gzs gzsVar = (gzs) obj2;
                io.reactivex.rxjava3.disposables.c cVar = o0i0Var.k;
                if (cVar != null) {
                    cVar.dispose();
                }
                if (booleanValue) {
                    if (o0i0Var.e.e == null || !(!drm0.N(r1))) {
                        gzsVar.invoke();
                    } else {
                        o0i0Var.k = io.reactivex.rxjava3.core.a.s(1000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new kv(o0i0Var, i3));
                    }
                } else {
                    o0i0Var.b.z0(false, true);
                }
                break;
            case 18:
                k7k0 k7k0Var = (k7k0) obj3;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-261845785, intValue6, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:181)");
                    }
                    djo0.b(k7k0Var.getMessage(), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar8, 0, 0, 131070);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                break;
            default:
                fbw0 fbw0Var = (fbw0) obj3;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                if (((gmq) obj2).equals(fbw0Var.C) && (imageView = fbw0Var.H) != null) {
                    imageView.setActivated(booleanValue2);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ hq5(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
