package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.webapp.fragments.PrivacyFragment;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import xsna.k840;

/* compiled from: CommonStoriesOpenBridge.kt */
/* loaded from: classes7.dex */
public final class dng implements spl0 {
    public final ProfileFragmentProviderComponent a;

    public dng(ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = profileFragmentProviderComponent;
    }

    @Override // xsna.spl0
    public final void a(Context context, String str, String str2) {
        com.vk.common.links.c.P(context, str, null, "story_viewer_try_mask", str2);
    }

    @Override // xsna.spl0
    public final ga50 b(Activity activity, MusicTrack musicTrack, gkc0 gkc0Var, rzl0 rzl0Var) {
        com.vk.music.track.a aVar = new com.vk.music.track.a();
        u2b0 b = k840.a.g().b();
        lq40 d = k840.a.d();
        MusicBottomSheetLaunchPoint.Stories stories = MusicBottomSheetLaunchPoint.Stories.b;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.d;
        if (musicTrack == null) {
            return null;
        }
        ga50 ga50Var = new ga50(stories, musicPlaybackLaunchContext, aVar, d, b, musicTrack, null, new cng(rzl0Var), null, gkc0Var, true, 576);
        ga50Var.a(activity);
        return ga50Var;
    }

    @Override // xsna.spl0
    public final void c(Context context, Poll poll) {
        new PollResultsFragment.a(poll, true).k(context);
    }

    @Override // xsna.spl0
    public final void e(Context context, String str, int i, UserId userId, String str2, String str3) {
        int i2 = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        if (!(str2 == null || str2.length() == 0)) {
            a.I(str2);
        }
        if (myc0.f(str3)) {
            a.A(str3);
        }
        a.K(str);
        a.D(i);
        a.G(userId);
        a.k(context);
    }

    @Override // xsna.spl0
    public final void f(Context context) {
        k(context, true, false, null);
    }

    @Override // xsna.spl0
    public final void g(String str, UserId userId, String str2, String str3, jbs jbsVar) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_ARCHIVE), str);
        aVar.q(userId, str3, str2);
        aVar.D(jbsVar, 228, null);
    }

    @Override // xsna.spl0
    public final Intent h(Context context, StoryEntry storyEntry, StoriesContainer storiesContainer, String str, boolean z) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, str);
        aVar.g = xa4.t();
        aVar.f = StoryCameraMode.STORY;
        aVar.m = storyEntry != null ? storyEntry.v : null;
        aVar.q = new StoryEntryExtended(storyEntry, storiesContainer.b, z);
        return aVar.B(context, false);
    }

    @Override // xsna.spl0
    public final void i(Context context, String str, String str2) {
        int i = ReportFragment.a0;
        ReportFragment.a a = ReportFragment.b.a();
        a.I("story");
        if (myc0.f(str2)) {
            a.A(str2);
        }
        a.K("ad");
        a.y(str);
        a.k(context);
    }

    @Override // xsna.spl0
    public final void j(Context context, UserId userId) {
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        this.a.ye(userId, null).k(context);
    }

    @Override // xsna.spl0
    public final void k(Context context, boolean z, boolean z2, Integer num) {
        int i = PrivacyFragment.a0;
        PrivacyFragment.a a = PrivacyFragment.b.a(z, z2, null, null, 60);
        if (num == null) {
            a.k(context);
        } else {
            a.i(xa4.L(context), num.intValue());
        }
    }

    @Override // xsna.spl0
    public final void l(Activity activity, ApiApplication apiApplication, String str, String str2, sa0 sa0Var) {
        hf3.e(activity, new op20(apiApplication, activity, new mq20(str, (String) null, (String) null, str2, 54, (String) null, ""), new iq20(null, "link", null, null, null, null, null, null, 253), null, 16), sa0Var);
    }

    @Override // xsna.spl0
    public final void m(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(mobileOfficialAppsCoreNavStat$EventScreen, creationEntryPoint);
        aVar.E0 = true;
        aVar.C(context);
    }

    @Override // xsna.spl0
    public final void n(Context context, String str) {
        WebViewFragment.c cVar = new WebViewFragment.c(str);
        cVar.F(false, false);
        cVar.w(R.style.StoryActivityTheme);
        cVar.k(context);
    }

    @Override // xsna.spl0
    public final void o(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint) {
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(mobileOfficialAppsCoreNavStat$EventScreen, creationEntryPoint);
        aVar.F0 = true;
        aVar.C(context);
    }

    @Override // xsna.spl0
    public final void p(Context context, String str) {
        if (str == null) {
            str = "";
        }
        com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(str, "new_story_avatar");
        aVar.E0 = true;
        aVar.C(context);
    }

    @Override // xsna.spl0
    public final void q(Context context, ApiApplication apiApplication) {
        hf3.c(new op20(apiApplication, context, null, new iq20(null, "stories", null, null, null, null, null, null, 253), null, 20));
    }
}
