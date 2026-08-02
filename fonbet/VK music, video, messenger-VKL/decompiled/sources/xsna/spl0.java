package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;

/* compiled from: StoriesAppOpenBridge.kt */
/* loaded from: classes15.dex */
public interface spl0 {
    void a(Context context, String str, String str2);

    ga50 b(Activity activity, MusicTrack musicTrack, gkc0 gkc0Var, rzl0 rzl0Var);

    void c(Context context, Poll poll);

    void e(Context context, String str, int i, UserId userId, String str2, String str3);

    void f(Context context);

    void g(String str, UserId userId, String str2, String str3, jbs jbsVar);

    Intent h(Context context, StoryEntry storyEntry, StoriesContainer storiesContainer, String str, boolean z);

    void i(Context context, String str, String str2);

    void j(Context context, UserId userId);

    void k(Context context, boolean z, boolean z2, Integer num);

    void l(Activity activity, ApiApplication apiApplication, String str, String str2, sa0 sa0Var);

    void m(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint);

    void n(Context context, String str);

    void o(Context context, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint creationEntryPoint);

    void p(Context context, String str);

    void q(Context context, ApiApplication apiApplication);
}
