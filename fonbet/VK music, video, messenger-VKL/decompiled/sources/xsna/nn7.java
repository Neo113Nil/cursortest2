package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.fragment.app.FragmentManager;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.VkTooltipAppearance;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.fragment.DiscoverSearchTabs;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vungle.ads.internal.protos.Sdk;
import xsna.au00;
import xsna.cri;
import xsna.dt1;
import xsna.gu1;
import xsna.ktv0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nn7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nn7(int i, int i2, Object obj, Object obj2, xzs xzsVar) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = xzsVar;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i2 = 2;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((pn7) obj5).h((sn7) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 1:
                fuv0 fuv0Var = (fuv0) obj5;
                zc0 zc0Var = (zc0) obj4;
                zhf0 zhf0Var = (zhf0) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1668958905, intValue, -1, "com.vk.profile.community.impl.ui.view.CommunityAdBannerComposeView.AdvertInformationTooltip.<anonymous> (CommunityAdBannerComposeView.kt:246)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 d = txj0.d(a5j0.b(aVar2, 4, null, false, 0L, 0L, 30), 1.0f);
                    Object x = aVar.x();
                    if (x == c0012a) {
                        x = ir.h(aVar);
                    }
                    sg50 sg50Var = (sg50) x;
                    boolean J = aVar.J(fuv0Var);
                    Object x2 = aVar.x();
                    if (J || x2 == c0012a) {
                        x2 = new bb(fuv0Var, 24);
                        aVar.R(x2);
                    }
                    q630 b = ojc.b(d, sg50Var, null, false, null, (gzs) x2, 28);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, b);
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
                    k9q0.w(aVar, d2, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    String str = zc0Var.h;
                    ktv0.e eVar = ktv0.e.a;
                    VkTooltipAppearance vkTooltipAppearance = VkTooltipAppearance.Neutral;
                    float f = 0;
                    boolean J2 = aVar.J(zhf0Var);
                    Object x3 = aVar.x();
                    if (J2 || x3 == c0012a) {
                        x3 = new dsc(zhf0Var, 11);
                        aVar.R(x3);
                    }
                    cuv0.b("", eVar, vkTooltipAppearance, kci.k(aVar2, (izs) x3), str, false, false, false, false, fuv0Var, null, f, null, null, 0, q6x.f, aVar, 1573254, 196656, 30112);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                xsh0 xsh0Var = (xsh0) obj5;
                FragmentManager fragmentManager = (FragmentManager) ((gbh) obj4).c;
                VkGroupsSearchParams vkGroupsSearchParams = (VkGroupsSearchParams) obj3;
                Activity activity = (Activity) obj2;
                if (((Boolean) DiscoverSearchTabs.a.getValue()).booleanValue()) {
                    Context baseContext = activity.getBaseContext();
                    int i3 = DiscoverSearchFragment.s0;
                    xsh0Var.a(baseContext, fragmentManager, vkGroupsSearchParams.copy());
                } else {
                    dxh0 dxh0Var = new dxh0(activity, new vqu(vkGroupsSearchParams.copy(), activity));
                    int i4 = DiscoverSearchFragment.s0;
                    dxh0Var.a(fragmentManager);
                }
                return s3q0.a;
            case 3:
                gu1.b bVar = (gu1.b) obj5;
                m5v m5vVar = (m5v) obj4;
                String str2 = (String) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1365896325, intValue2, -1, "com.vk.narratives.impl.highlights.list.HighlightViewHolder.onBind.<anonymous> (HighlightViewHolder.kt:79)");
                    }
                    rrv0.d(null, null, null, null, kai.c(662319862, new qq0(bVar, m5vVar, str2, i2), aVar4), aVar4, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                String str3 = (String) obj5;
                gzs gzsVar = (gzs) obj4;
                ButtonAppearance buttonAppearance = (ButtonAppearance) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1512946131, intValue3, -1, "com.vk.ecomm.market.good.ui.CartButtonContent.<anonymous> (ProductButtonsBinderImpl.kt:440)");
                    }
                    q630 E = ahn.E(q630.a.a, "product_card_cart_button_compose_test_tag");
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    Object x4 = aVar5.x();
                    if (x4 == c0012a) {
                        x4 = new pey(20);
                        aVar5.R(x4);
                    }
                    com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3);
                    Object x5 = aVar5.x();
                    if (x5 == c0012a) {
                        x5 = new pyz(20);
                        aVar5.R(x5);
                    }
                    zt00.a(gzsVar, buttonStyle, buttonAppearance, E, null, au00.b.a.a(str3, null, null, null, null, a, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), aVar5, 805306368, Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE), false, null, null, aVar5, 3120, 2000);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 5:
                UserProfileBaseInfoState.a aVar6 = (UserProfileBaseInfoState.a) obj5;
                ztm0 ztm0Var = (ztm0) obj;
                o6j o6jVar = (o6j) obj2;
                m540 m540Var = wjo0.a((wjo0) obj4, aVar6.a.toString(), (nmo0) obj3, 2, o6jVar.a, 968).b;
                CharSequence charSequence = aVar6.a;
                if ((charSequence instanceof Spanned) && m540Var.f > 1) {
                    if (((Spanned) charSequence).getSpans(m540Var.f(1), m540Var.c(1, true), wdp.class).length != 0) {
                        r6 = true;
                    }
                }
                tra0 N = ((zo10) j5g.Y(ztm0Var.t1("text", new jai(-558531613, new asc(aVar6, r6), true)))).N(o6jVar.a);
                return ztm0Var.Q(N.b, N.c, jgp.b, new qjl0(N, 7));
            default:
                ((Integer) obj2).getClass();
                qnr0.c((String) obj5, (gzs) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ nn7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ nn7(fuv0 fuv0Var, zc0 zc0Var, zhf0 zhf0Var) {
        this.b = 1;
        this.c = fuv0Var;
        this.d = zc0Var;
        this.e = zhf0Var;
    }
}
