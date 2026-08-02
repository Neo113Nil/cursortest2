package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.categories.impl.presentation.CategoriesFragment;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.it80;
import xsna.q630;
import xsna.suq;
import xsna.ty6;
import xsna.vos;
import xsna.xrg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l71 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l71(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.b;
        VKList vKList = null;
        int i2 = 9;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i3 = com.vk.channelrestrictions.a.g1;
                ((com.vk.channelrestrictions.a) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                BanReasonBottomSheet.a aVar = BanReasonBottomSheet.g1;
                ((BanReasonBottomSheet) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((CategoriesFragment.b) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                xrg.a aVar2 = (xrg.a) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1146373219, intValue, -1, "com.vk.profile.community.impl.ui.item.header.CommunityArtistPageItem.CommunityArtistPageViewHolder.<anonymous>.<anonymous>.<anonymous> (CommunityArtistPageItem.kt:50)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630.a aVar4 = q630.a.a;
                    q630 c = qri.c(aVar3, aVar4);
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
                    k9q0.w(aVar3, a, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    jqu0.a(s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 3.5d, 7)), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar3, 0, 14);
                    String N = d370.N(R.string.music_artist_card, 0, aVar3);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(6976586, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MusicMicOutline24> (VkIcons.kt:7812)");
                    }
                    lg90 b = or.b(aVar3, 1681219927, R.drawable.vk_icon_music_mic_outline_24, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().a;
                    boolean y = aVar3.y(aVar2);
                    Object x = aVar3.x();
                    if (y || x == c0012a) {
                        x = new sbg(aVar2, 3);
                        aVar3.R(x);
                    }
                    qiu0.a(N, (gzs) x, null, b, new l5g(j), null, 0, null, null, null, null, false, aVar3, 4096, 8164);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                x7u x7uVar = (x7u) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-502190345, intValue2, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewItemComposeViewHolder.bind.<anonymous> (GoodReviewItemComposeViewHolder.kt:76)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-16762212, new nx7(x7uVar, 5), aVar6), aVar6, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 5:
                ips ipsVar = (ips) obj3;
                List list = (List) obj;
                List list2 = (List) obj2;
                VKList<zxq0> vKList2 = ipsVar.b;
                vos.b bVar = ipsVar.d;
                if (vKList2 != null) {
                    vKList = new VKList(vKList2.i(), vKList2.k());
                    vKList.n(vKList2.j());
                    vKList.addAll(list);
                }
                VKFromList vKFromList = new VKFromList(bVar.a.i());
                vKFromList.addAll(list2);
                return new gps(ipsVar.a, vKList, ipsVar.c, new ass(vKFromList, bVar.b));
            case 6:
                int intValue3 = ((Integer) obj).intValue();
                ((Integer) obj2).getClass();
                dhc0 dhc0Var = ((enc0) obj3).h0;
                mnc0 mnc0Var = dhc0Var.c;
                q420 q420Var = dhc0Var.d;
                q420Var.l = intValue3;
                String valueOf = String.valueOf(dhc0Var.b.getText());
                int e = yjo0.e(intValue3, valueOf);
                Integer num = q420Var.i;
                if (num == null || num.intValue() != e) {
                    q420Var.i = Integer.valueOf(e);
                }
                Character z0 = erm0.z0(e, valueOf);
                if (!yjo0.p(z0 != null ? z0.charValue() : ' ') || e >= intValue3) {
                    UserId a2 = q420Var.a(intValue3);
                    if (fkq0.c(a2)) {
                        mnc0Var.N3(a2);
                    } else {
                        mnc0Var.Y0();
                    }
                } else {
                    try {
                        str = valueOf.substring(e + 1, yjo0.d(intValue3, valueOf));
                    } catch (IndexOutOfBoundsException unused) {
                        str = "";
                    }
                    mnc0Var.x0(str);
                }
                return s3q0.a;
            case 7:
                nkd0 nkd0Var = (nkd0) obj3;
                hnd0 hnd0Var = (hnd0) obj;
                if (((Boolean) obj2).booleanValue()) {
                    com.vk.core.view.components.spinner.c cVar = new com.vk.core.view.components.spinner.c(hnd0Var.a.getContext());
                    nkd0Var.c = cVar;
                    cVar.setCancelable(false);
                    com.vk.core.view.components.spinner.c cVar2 = nkd0Var.c;
                    if (cVar2 != null) {
                        cVar2.setCanceledOnTouchOutside(false);
                    }
                    com.vk.core.view.components.spinner.c cVar3 = nkd0Var.c;
                    if (cVar3 != null) {
                        cVar3.setOnDismissListener(new mkd0(nkd0Var, r7 ? 1 : 0));
                    }
                    com.vk.core.view.components.spinner.c cVar4 = nkd0Var.c;
                    if (cVar4 != null) {
                        cVar4.show();
                    }
                } else {
                    com.vk.core.view.components.spinner.c cVar5 = nkd0Var.c;
                    if (cVar5 != null) {
                        cVar5.dismiss();
                    }
                }
                return s3q0.a;
            case 8:
                bdn0 bdn0Var = (bdn0) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1732078211, intValue4, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.ScrollStub.<anonymous> (SuperAppWidgetRedesignV6Holder.kt:79)");
                    }
                    q630 H = s200.H(txj0.h(txj0.f(q630.a.a, 1.0f), 104), 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    dt1.a.getClass();
                    ty6.b bVar2 = dt1.a.k;
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    boolean y2 = aVar7.y(bdn0Var);
                    Object x2 = aVar7.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new u2k0(bdn0Var, i2);
                        aVar7.R(x2);
                    }
                    lqy.b(H, null, null, lVar, bVar2, null, false, null, (izs) x2, aVar7, 12804102, 334);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                t7u0.a((Alert$Button) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                q8w0 q8w0Var = (q8w0) obj3;
                Boolean bool = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() || !bool.booleanValue()) {
                    it80.b.getClass();
                    return it80.a.a();
                }
                it80.a aVar8 = it80.b;
                FeatureId featureId = q8w0Var.a;
                suq suqVar = new suq(featureId, q8w0Var.a(featureId), new suq.c.a(R.string.voip_feature_onboarding_vmoji_title, R.string.voip_feature_onboarding_vmoji_subtitle, 48, Integer.valueOf(R.drawable.vk_icon_vmoji_outline_28)));
                aVar8.getClass();
                return new it80(suqVar);
        }
    }

    public /* synthetic */ l71(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
