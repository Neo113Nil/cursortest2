package xsna;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.donut.design.compose.banner.DonutBannerSkeletonContent;
import com.vk.donut.design.compose.banner.b;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.cvj0;
import xsna.dt1;
import xsna.lru;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gyn implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gyn(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        long j;
        int i = this.b;
        q630.a aVar = q630.a.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                DonutBannerSkeletonContent.Type type = (DonutBannerSkeletonContent.Type) obj4;
                qa8 qa8Var = (qa8) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar2.J(qa8Var) ? 4 : 2;
                }
                if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1524128059, intValue, -1, "com.vk.donut.design.compose.banner.DonutBannerCardSkeletonShimmer.<anonymous>.<anonymous> (DonutBannerSkeleton.kt:211)");
                    }
                    q630 D = s200.D(aVar, kqu0.u);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c = qri.c(aVar2, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D2, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    iyk0 iyk0Var = rrv0.c;
                    wuv0 wuv0Var = (wuv0) aVar2.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    erv0.a(1, wuv0Var.h0, txj0.v(aVar, 80), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 390, 8);
                    androidx.compose.runtime.a aVar4 = aVar2;
                    f9t.e(txj0.h(aVar, kqu0.s), aVar4, 0);
                    int i2 = b.a.$EnumSwitchMapping$0[type.ordinal()];
                    if (i2 == 1) {
                        aVar4.K(-1122041092);
                        com.vk.donut.design.compose.banner.b.a(null, aVar4, 0);
                        aVar4.j();
                    } else {
                        if (i2 != 2) {
                            throw alb0.c(-36196875, aVar4);
                        }
                        aVar4.K(-1121885534);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var2 = (wuv0) aVar4.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        erv0.a(1, wuv0Var2.s0, txj0.v(aVar, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 390, 8);
                        aVar4 = aVar4;
                        aVar4.j();
                    }
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    f9t.e(new xpy(1.0f, true), aVar4, 0);
                    dhu0.a(ButtonSize.Small, ButtonStyle.Secondary, txj0.v(aVar, 93), aVar4, 438);
                    aVar4.G();
                    akv0.a(SkeletonType.Circle, qa8Var.b(txj0.q(kci.l(aVar, 34, 10), 96), dt1.a.j), aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                Drawable drawable = (Drawable) obj4;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1620306970, intValue2, -1, "com.vk.profile.design.view.profileheader.rememberInlineContentWithEmojis.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EmojiHelper.kt:139)");
                    }
                    pzu0.b(w65.p(drawable, aVar5, 0), null, null, l5g.k, aVar5, 3128, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 2:
                lru.a aVar6 = (lru.a) obj4;
                Group group = (Group) obj;
                String str = (String) obj2;
                View view = (View) obj3;
                int i3 = group.C;
                if (i3 == 1 || i3 == 2 || i3 == 4) {
                    aVar6.o.d(new GroupSuggestion(group, null, null, str, null), group, aVar6.n);
                } else {
                    q3n0 q3n0Var = aVar6.o;
                    GroupSuggestion groupSuggestion = new GroupSuggestion(group, null, null, str, null);
                    String str2 = ((lru) aVar6.m).i;
                    UiTracker uiTracker = UiTracker.a;
                    String name = UiTracker.c().name();
                    UiTrackingScreen b = UiTracker.j.b();
                    String name2 = (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) ? null : mobileOfficialAppsCoreNavStat$EventScreen.name();
                    FullSourceJoinApi.SourceType sourceType = FullSourceJoinApi.SourceType.SIMILAR_GROUPS_BLOCK;
                    String h = sourceType.h();
                    String h2 = sourceType.h();
                    String i4 = FullSourceJoinApi.EntryServiceType.COMMUNITY.i();
                    q3n0Var.b(groupSuggestion, group, str2, view, new FullSourceJoinApi(cqm0.m(name), name2 != null ? cqm0.m(name2) : null, h != null ? cqm0.m(h) : null, h2 != null ? cqm0.m(h2) : null, i4 != null ? cqm0.m(i4) : null, null));
                }
                return s3q0.a;
            case 3:
                fxu fxuVar = (fxu) obj4;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar7.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1409082857, intValue3, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.HeaderImpl.Content.<anonymous>.<anonymous>.<anonymous> (BookingCalendarDayBlockView.kt:210)");
                    }
                    q630 E = ahn.E(aVar, "calendar_next_period");
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2338790, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron24> (VkSdkIcons.kt:412)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_chevron_24, 0, aVar7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.booking_accessibility_select_next_month, 0, aVar7);
                    if (((Boolean) fxuVar.f.getValue()).booleanValue()) {
                        aVar7.K(-1213915327);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar7.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getIcon().a;
                        aVar7.j();
                    } else {
                        aVar7.K(-1213912508);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar7.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getIcon().l;
                        aVar7.j();
                    }
                    pzu0.b(a2, N, E, j, aVar7, 392, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 4:
                cvj0 cvj0Var = (cvj0) obj4;
                int intValue4 = ((Integer) obj).intValue();
                List list = (List) obj2;
                Activity activity = (Activity) obj3;
                ImageViewer d = myc0.d();
                cvj0.e eVar = (cvj0.e) cvj0Var.b0.getValue();
                String str3 = cvj0Var.v;
                String str4 = cvj0Var.u;
                s1c0 s1c0Var = cvj0Var.x;
                return d.e(intValue4, list, activity, eVar, str3, str4, (s1c0Var != null ? s1c0Var.k : false) ^ true, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint.NEWS_ITEM);
            default:
                wh50 wh50Var = (wh50) obj4;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (aVar8.t(intValue5 & 1, (intValue5 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-465175815, intValue5, -1, "com.vk.design.demo.presentation.screens.typography.TypographyPlaygroundContent.Content.<anonymous>.<anonymous> (TypographyPlaygroundContent.kt:184)");
                    }
                    q630 D3 = s200.D(txj0.f(aVar, 1.0f), 12);
                    a.m mVar2 = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, aVar8, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar8));
                    sy90 D4 = aVar8.D();
                    q630 c2 = qri.c(aVar8, D3);
                    cri.h7.getClass();
                    LayoutNode.a aVar9 = cri.a.b;
                    if (aVar8.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar8.H();
                    if (aVar8.L()) {
                        aVar8.I(aVar9);
                    } else {
                        aVar8.f();
                    }
                    k9q0.w(aVar8, a3, cri.a.f);
                    k9q0.w(aVar8, D4, cri.a.e);
                    k9q0.w(aVar8, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(aVar8, cri.a.h);
                    k9q0.w(aVar8, c2, cri.a.d);
                    q630 f = txj0.f(aVar, 1.0f);
                    String str5 = (String) wh50Var.getValue();
                    Object x = aVar8.x();
                    if (x == a.C0011a.a) {
                        x = new qzl0(wh50Var, 10);
                        aVar8.R(x);
                    }
                    hqv0.c(str5, (izs) x, f, null, null, 0, 0, false, false, 0L, 0L, null, null, null, null, null, null, null, aVar8, Tensorflow.FRAME_WIDTH, 1048568);
                    aVar8.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
        }
    }
}
