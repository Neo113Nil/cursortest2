package xsna;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.preference.Preference;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.user.UserProfile;
import com.vk.friends.requests.impl.allrequests.presentation.FriendRequestsTabFragment;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.qv4;
import xsna.sau;
import xsna.ty6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dv4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dv4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i3 = 2;
        us2 us2Var = null;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                qv4.a aVar = (qv4.a) obj3;
                kkm kkmVar = (kkm) obj2;
                Drawable background = ((View) obj).getBackground();
                if (background != null) {
                    sjo.a(background, kkmVar.f(aVar.a() ? R.attr.vk_legacy_destructive : R.attr.vk_legacy_accent), iah0.a(2));
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                xa5.f((to5) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((hr8) obj3).i(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-917853023, intValue, -1, "com.vk.clips.compose.ClipsComposeThemeProvider.Theme.<anonymous> (ClipsComposeThemeProvider.kt:18)");
                    }
                    rvi.a(c490.a.b(null), kai.c(1171611617, new com.vk.movika.sdk.base.ui.q0(jaiVar, i3), aVar2), aVar2, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                return ClipsPlaylist.a((ClipsPlaylist) obj2, ((e8b0) obj).b - ((List) obj3).size());
            case 5:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj3;
                CharSequence charSequence = (CharSequence) obj2;
                String[] strArr = DebugDevSettingsFragment.t0;
                if (charSequence.length() != 0) {
                    o2l o2lVar = o2l.a;
                    int parseInt = Integer.parseInt(charSequence.toString());
                    o2lVar.getClass();
                    o2l.i(parseInt, "__dbg_api_max_length");
                    Preference findPreference = debugDevSettingsFragment.findPreference("__dbg_api_max_length");
                    if (findPreference != null) {
                        o2lVar.getClass();
                        int i4 = com.vk.core.preference.Preference.j().getInt("__dbg_api_max_length", 0);
                        findPreference.I(i4 < 1 ? "Без ограничений" : Integer.toString(i4));
                    }
                    DebugDevSettingsFragment.jo();
                }
                return null;
            case 6:
                final FriendRequestsTabFragment friendRequestsTabFragment = (FriendRequestsTabFragment) obj3;
                UserProfile userProfile = (UserProfile) obj;
                final View view = (View) obj2;
                int i5 = FriendRequestsTabFragment.X0;
                final Activity h = e3m.h(friendRequestsTabFragment.B());
                if (h != null) {
                    otl0 r2 = ((StoriesComponent) j6i.b(m7m.f(friendRequestsTabFragment), StoriesComponent.class)).r2();
                    final StoryViewerRouter tb = ((StoryViewerComponent) j6i.b(m7m.f(friendRequestsTabFragment), StoryViewerComponent.class)).tb();
                    friendRequestsTabFragment.V0.b(r2.g(userProfile.c).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.sjs
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // io.reactivex.rxjava3.functions.f
                        public final void accept(Object obj4) {
                            List list = (List) obj4;
                            int i6 = FriendRequestsTabFragment.X0;
                            MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST;
                            String ref = FriendRequestsTabFragment.this.getRef();
                            Activity activity = h;
                            tb.c(activity, list, mobileOfficialAppsConStoriesStat$ViewEntryPoint, ref, activity instanceof f5z ? (f5z) activity : null, new tjs(view));
                        }
                    }, new ce9(1, friendRequestsTabFragment, userProfile)));
                }
                return s3q0.a;
            case 7:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1133444454, intValue2, -1, "com.vk.onboardingscreens.impl.georequest.presentation.view.GeoRequestContent.<anonymous>.<anonymous> (GeoRequestContent.kt:38)");
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
                    float f = 12;
                    q630 E = s200.E(aVar4, 4, f);
                    ty6 ty6Var = dt1.a.d;
                    ra8 ra8Var = ra8.a;
                    q630 E2 = ahn.E(ra8Var.b(E, ty6Var), "skipGeoRequest");
                    String N = d370.N(R.string.push_request_skip_button, 0, aVar3);
                    boolean J = aVar3.J(izsVar);
                    Object x = aVar3.x();
                    if (J || x == c0012a) {
                        x = new u2(izsVar, 1);
                        aVar3.R(x);
                    }
                    zmt.b(0, aVar3, N, (gzs) x, E2);
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
                    if (androidx.compose.runtime.b.d()) {
                        i = 0;
                        androidx.compose.runtime.b.f(2069246772, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationPinInCircle96> (VkIcons.kt:3932)");
                    } else {
                        i = 0;
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_illustration_pin_in_circle_96, i, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vqv.a(a2, null, ahn.E(txj0.q(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 38, 7), 100), "localPositionIcon"), ylu0Var.getBackground().d, aVar3, 440, 0);
                    gcv gcvVar = new gcv(aVar6);
                    float f2 = 16;
                    q630 E3 = ahn.E(s200.H(gcvVar, f2, f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), "allowAccessToLocationText");
                    String N2 = d370.N(R.string.geo_request_title, 0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N2, E3, 0L, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.g, aVar3, 0, 0, 8124);
                    aVar3.G();
                    q630 E4 = ahn.E(ra8Var.b(s200.E(txj0.f(aVar4, 1.0f), f2, f), dt1.a.i), "allowAccessToLocationButton");
                    String N3 = d370.N(R.string.geo_request_button, 0, aVar3);
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean J2 = aVar3.J(izsVar);
                    Object x2 = aVar3.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new w2(izsVar, 4);
                        aVar3.R(x2);
                    }
                    bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E4, null, false, false, null, null, null, N3, null, null, null, null, false, null, null, null, aVar3, X2.b.f, 0, 0, 4190176);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 8:
                sau sauVar = (sau) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1488039266, intValue3, -1, "com.vk.profile.core.gov.GovernmentOrganizationBottomSheet.ThemedContent.<anonymous> (GovernmentOrganizationBottomSheet.kt:26)");
                    }
                    aVar7.K(1820492525);
                    boolean y = aVar7.y(sauVar);
                    Object x3 = aVar7.x();
                    if (y || x3 == c0012a) {
                        sau.b bVar2 = new sau.b(0, sauVar, sau.class, "onActionClick", "onActionClick()V", 0);
                        aVar7.R(bVar2);
                        x3 = bVar2;
                    }
                    gzs gzsVar = (gzs) ((fcy) x3);
                    boolean y2 = aVar7.y(sauVar);
                    Object x4 = aVar7.x();
                    if (y2 || x4 == c0012a) {
                        x4 = new sau.c(0, sauVar, sau.class, "dismiss", "dismiss()V", 0);
                        aVar7.R(x4);
                    }
                    uau.c(0, aVar7, gzsVar, (gzs) ((fcy) x4), null);
                    aVar7.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 9:
                qcy<Object>[] qcyVarArr = MviImplFragment.P;
                return ((MviImplFragment) obj3).x8((Bundle) obj, (km50) obj2);
            case 10:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                ((rg50) obj3).C((int) floatValue);
                return s3q0.a;
            case 11:
                TextClassification textClassification = (TextClassification) obj3;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                aVar8.K(950061013);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(950061013, intValue4, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:246)");
                }
                String valueOf2 = String.valueOf(textClassification.getLabel());
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar8.j();
                return valueOf2;
            case 12:
                DonutVideoUiModel.PreviewBadge previewBadge = (DonutVideoUiModel.PreviewBadge) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                aVar9.K(-1892230392);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1892230392, intValue5, -1, "com.vk.catalog.mvi.block.video.impl.video.video.VideoViewStateMapper.getPreview.<anonymous>.<anonymous> (VideoViewStateMapper.kt:140)");
                }
                DonutPriceTemplate donutPriceTemplate = previewBadge.c;
                if (donutPriceTemplate == null) {
                    aVar9.K(10195422);
                } else {
                    aVar9.K(-1662239101);
                    us2Var = z1o.a(donutPriceTemplate, null, aVar9, 1);
                }
                aVar9.j();
                if (us2Var == null) {
                    aVar9.K(-1662236989);
                    us2Var = ws2.b(previewBadge.b, aVar9, 0);
                    aVar9.j();
                } else {
                    aVar9.K(-1662239686);
                    aVar9.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar9.j();
                return us2Var;
            default:
                return nnx0.B((nnx0) obj3, (androidx.compose.runtime.a) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ dv4(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
