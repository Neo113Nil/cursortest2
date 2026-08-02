package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTask;
import com.vk.profile.community.creationonboarding.impl.tasks.presentation.feature.SnackBar;

/* compiled from: CreationOnboardingTasksAction.kt */
/* loaded from: classes5.dex */
public interface cck extends lj50 {

    /* compiled from: CreationOnboardingTasksAction.kt */
    public static final class a implements cck {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -769062458;
        }

        public final String toString() {
            return "FriendsInvited";
        }
    }

    /* compiled from: CreationOnboardingTasksAction.kt */
    public static final class b implements cck {
        public final OnBoardingTask b;

        public b(OnBoardingTask onBoardingTask) {
            this.b = onBoardingTask;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ItemClick(item=" + this.b + ')';
        }
    }

    /* compiled from: CreationOnboardingTasksAction.kt */
    public static final class c implements cck {
    }

    /* compiled from: CreationOnboardingTasksAction.kt */
    public static final class d implements cck {
        public final SnackBar b;

        public d(SnackBar snackBar) {
            this.b = snackBar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenContentFromSnackBar(snackBar=" + this.b + ')';
        }
    }

    /* compiled from: CreationOnboardingTasksAction.kt */
    public static final class e implements cck {
        public final NewsEntry b;

        public e(NewsEntry newsEntry) {
            this.b = newsEntry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ck70.a(new StringBuilder("PostCreated(newsEntry="), this.b, ')');
        }
    }

    /* compiled from: CreationOnboardingTasksAction.kt */
    public static final class f implements cck {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -677669212;
        }

        public final String toString() {
            return "SnackBarDismissed";
        }
    }

    /* compiled from: CreationOnboardingTasksAction.kt */
    public static final class g implements cck {
        public final StoryEntry b;

        public g(StoryEntry storyEntry) {
            this.b = storyEntry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "StoryCreated(storyEntry=" + this.b + ')';
        }
    }
}
