package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;

/* compiled from: StoriesSeenInteractor.kt */
/* loaded from: classes11.dex */
public interface rul0 {
    void b(int i, UserId userId);

    void c();

    void d(StoriesContainer storiesContainer, StoryEntry storyEntry);

    void e(UserId userId, StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, int i, boolean z, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen);

    void f(List<? extends StoryEntry> list);

    io.reactivex.rxjava3.core.x<Boolean> g(StoryEntry storyEntry, long j);

    void h(StoriesContainer storiesContainer, StoryEntry storyEntry);

    void i(boolean z);

    void j(StoryEntry storyEntry);

    /* compiled from: StoriesSeenInteractor.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final rul0 STUB = new C3633a();

        public final rul0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoriesSeenInteractor.kt */
        /* renamed from: xsna.rul0$a$a, reason: collision with other inner class name */
        public static final class C3633a implements rul0 {
            @Override // xsna.rul0
            public final io.reactivex.rxjava3.core.x<Boolean> g(StoryEntry storyEntry, long j) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.rul0
            public final void c() {
            }

            @Override // xsna.rul0
            public final void f(List<? extends StoryEntry> list) {
            }

            @Override // xsna.rul0
            public final void i(boolean z) {
            }

            @Override // xsna.rul0
            public final void j(StoryEntry storyEntry) {
            }

            @Override // xsna.rul0
            public final void b(int i, UserId userId) {
            }

            @Override // xsna.rul0
            public final void d(StoriesContainer storiesContainer, StoryEntry storyEntry) {
            }

            @Override // xsna.rul0
            public final void h(StoriesContainer storiesContainer, StoryEntry storyEntry) {
            }

            @Override // xsna.rul0
            public final void e(UserId userId, StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, int i, boolean z, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            }
        }
    }
}
