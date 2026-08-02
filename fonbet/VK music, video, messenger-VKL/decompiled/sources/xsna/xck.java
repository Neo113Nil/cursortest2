package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTask;
import com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature.SnackBar;
import java.util.List;

/* compiled from: CreationOnboardingTasksState.kt */
/* loaded from: classes5.dex */
public final class xck implements lm50 {
    public final List<OnBoardingTask> b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final StoryEntry g;
    public final NewsEntry h;
    public final SnackBar i;

    public xck(List<OnBoardingTask> list, String str, String str2, String str3, String str4, StoryEntry storyEntry, NewsEntry newsEntry, SnackBar snackBar) {
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = storyEntry;
        this.h = newsEntry;
        this.i = snackBar;
    }

    public static xck a(xck xckVar, StoryEntry storyEntry, NewsEntry newsEntry, SnackBar snackBar, int i) {
        List<OnBoardingTask> list = xckVar.b;
        String str = xckVar.c;
        String str2 = xckVar.d;
        String str3 = xckVar.e;
        String str4 = xckVar.f;
        if ((i & 32) != 0) {
            storyEntry = xckVar.g;
        }
        StoryEntry storyEntry2 = storyEntry;
        if ((i & 64) != 0) {
            newsEntry = xckVar.h;
        }
        xckVar.getClass();
        return new xck(list, str, str2, str3, str4, storyEntry2, newsEntry, snackBar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xck)) {
            return false;
        }
        xck xckVar = (xck) obj;
        return epx.f(this.b, xckVar.b) && epx.f(this.c, xckVar.c) && epx.f(this.d, xckVar.d) && epx.f(this.e, xckVar.e) && epx.f(this.f, xckVar.f) && epx.f(this.g, xckVar.g) && epx.f(this.h, xckVar.h) && this.i == xckVar.i;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        StoryEntry storyEntry = this.g;
        int hashCode = (a + (storyEntry == null ? 0 : storyEntry.hashCode())) * 31;
        NewsEntry newsEntry = this.h;
        int hashCode2 = (hashCode + (newsEntry == null ? 0 : newsEntry.hashCode())) * 31;
        SnackBar snackBar = this.i;
        return hashCode2 + (snackBar != null ? snackBar.hashCode() : 0);
    }

    public final String toString() {
        return "CreationOnboardingTasksState(items=" + this.b + ", imageUrl=" + this.c + ", title=" + this.d + ", description=" + this.e + ", communityUrl=" + this.f + ", lastStoryEntry=" + this.g + ", lastNewsEntry=" + this.h + ", snackBar=" + this.i + ')';
    }
}
