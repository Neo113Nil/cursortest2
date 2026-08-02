package xsna;

import android.content.Intent;
import android.view.MotionEvent;
import androidx.compose.runtime.a;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.music.offline.ui.presentation.MusicDownloadsSettingsFragment;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.q0h;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lk1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lk1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                nk1.b((rl1) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                Long l = (Long) obj2;
                if (pei0.a((mei0) obj3, l.longValue())) {
                    return l;
                }
                return null;
            case 2:
                int intValue = ((Integer) obj2).intValue();
                int i2 = nxb.k1;
                ((nxb) obj3).startActivityForResult((Intent) obj, intValue);
                return s3q0.a;
            case 3:
                q0h.a aVar = (q0h.a) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1921670337, intValue2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityCuratorPageItem.CommunityArtistPageViewHolder.<anonymous>.<anonymous> (CommunityCuratorPageItem.kt:41)");
                    }
                    String N = d370.N(R.string.music_curator_card, 0, aVar2);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1494182612, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Music24> (VkIcons.kt:7790)");
                    }
                    lg90 b = or.b(aVar2, 153302681, R.drawable.vk_icon_music_24, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().a;
                    boolean y = aVar2.y(aVar);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        x = new nef(aVar, 4);
                        aVar2.R(x);
                    }
                    qiu0.a(N, (gzs) x, null, b, new l5g(j), null, 0, null, null, null, null, false, aVar2, 4096, 8164);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                ListLoadingState listLoadingState = (ListLoadingState) obj2;
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = ((GeoPostsFragment) obj3).a0;
                if (swipeDrawableRefreshLayout != null) {
                    swipeDrawableRefreshLayout.setRefreshing(listLoadingState == ListLoadingState.REFRESHING);
                }
                return s3q0.a;
            case 5:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                ((com.vk.update.core.a) obj3).g.l("has_space:" + bool + " time_to_check:" + bool2);
                if (bool.booleanValue() && bool2.booleanValue()) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 6:
                giy giyVar = (giy) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-546545883, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.KidsAudioBookBigPlayerControls.Content.<anonymous> (KidsAudioBookBigPlayerControls.kt:36)");
                    }
                    giyVar.d(0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((go20) obj3).f(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                MusicDownloadsSettingsFragment musicDownloadsSettingsFragment = (MusicDownloadsSettingsFragment) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = MusicDownloadsSettingsFragment.P;
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1115117396, intValue4, -1, "com.vk.music.offline.ui.presentation.MusicDownloadsSettingsFragment.onCreateView.<anonymous>.<anonymous> (MusicDownloadsSettingsFragment.kt:52)");
                    }
                    musicDownloadsSettingsFragment.eo(0, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 9:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2111791195, intValue5, -1, "com.vk.donut.privacy.levels.levelsbottomsheet.Content.<anonymous>.<anonymous>.<anonymous> (PrivacyEditDonutLevelsBottomSheetView.kt:136)");
                    }
                    boolean J = aVar5.J(izsVar);
                    Object x2 = aVar5.x();
                    if (J || x2 == c0012a) {
                        x2 = new m87(izsVar, 5);
                        aVar5.R(x2);
                    }
                    kdd0.e((gzs) x2, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 10:
                e8j0 e8j0Var = (e8j0) obj3;
                MotionEvent motionEvent = (MotionEvent) obj2;
                int x3 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                return Boolean.valueOf(e8j0.bo(e8j0Var.z1.getPrivacyBtn(), motionEvent, x3, y2) || e8j0.bo(e8j0Var.z1.getLifeTimeBtn(), motionEvent, x3, y2));
            case 11:
                VideoEpisodesFragment videoEpisodesFragment = (VideoEpisodesFragment) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i3 = VideoEpisodesFragment.V;
                if (aVar6.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1359076618, intValue6, -1, "com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment.onCreateContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VideoEpisodesFragment.kt:112)");
                    }
                    List list = (List) ((zak0) videoEpisodesFragment.U).getValue();
                    boolean booleanValue = ((Boolean) videoEpisodesFragment.R.getValue()).booleanValue();
                    ((com.vk.video.kidsprofile.restricteduseractions.a) videoEpisodesFragment.S.getValue()).getClass();
                    boolean y3 = aVar6.y(videoEpisodesFragment);
                    Object x4 = aVar6.x();
                    if (y3 || x4 == c0012a) {
                        x4 = new r6i0(videoEpisodesFragment, 18);
                        aVar6.R(x4);
                    }
                    izs izsVar2 = (izs) x4;
                    boolean y4 = aVar6.y(videoEpisodesFragment);
                    Object x5 = aVar6.x();
                    if (y4 || x5 == c0012a) {
                        x5 = new b3m0(videoEpisodesFragment, 15);
                        aVar6.R(x5);
                    }
                    njs0.a(new hjs0(list, booleanValue, izsVar2, (izs) x5), txj0.d(q630.a.a, 1.0f), aVar6, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 12:
                HashMap r = p4g.r(j5g.u0((List) obj2, (List) obj), d9u0.b);
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj3).iterator();
                while (it.hasNext()) {
                    UserProfile userProfile = (UserProfile) r.get((UserId) it.next());
                    if (userProfile != null) {
                        arrayList.add(userProfile);
                    }
                }
                return arrayList;
            default:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1518187706, intValue7, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkTooltipPopup.<anonymous> (VkOnboardingTooltipWrapper.kt:309)");
                    }
                    if (cq.i(0, aVar7, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ lk1(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
