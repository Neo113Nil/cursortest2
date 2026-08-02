package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StoriesInteractor.kt */
/* loaded from: classes6.dex */
public interface xsl0 {

    /* compiled from: StoriesInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final xsl0 STUB = new C4045a();

        /* compiled from: StoriesInteractor.kt */
        /* renamed from: xsna.xsl0$a$a, reason: collision with other inner class name */
        public static final class C4045a implements xsl0 {
            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.q a(Integer num, String str, String str2) {
                return io.reactivex.rxjava3.internal.operators.observable.l1.b;
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.x<Boolean> b(StoryEntry storyEntry, int i) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.a c(List<? extends StoryEntry> list) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.a d(UserId userId) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.x<Boolean> e(StoryEntry storyEntry) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.xsl0
            public final boolean f(StoriesContainer storiesContainer) {
                return false;
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.a g(StoryEntry storyEntry, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.xsl0
            public final bfj h(ArrayList arrayList, StoriesContainer storiesContainer, StoriesContainer storiesContainer2) {
                return null;
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.x<u4m0> i(String str, boolean z) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.disposables.c j(as80 as80Var) {
                return new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.a k(StoryEntry storyEntry, Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.x l(UserId userId, String str, boolean z) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.disposables.c m(as80 as80Var) {
                return new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.a n(UserId userId, StoriesContainer storiesContainer, String str) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.xsl0
            public final io.reactivex.rxjava3.core.x<Boolean> o(StoryEntry storyEntry) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }
        }

        public final xsl0 getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.q a(Integer num, String str, String str2);

    io.reactivex.rxjava3.core.x<Boolean> b(StoryEntry storyEntry, int i);

    io.reactivex.rxjava3.core.a c(List<? extends StoryEntry> list);

    io.reactivex.rxjava3.core.a d(UserId userId);

    io.reactivex.rxjava3.core.x<Boolean> e(StoryEntry storyEntry);

    boolean f(StoriesContainer storiesContainer);

    io.reactivex.rxjava3.core.a g(StoryEntry storyEntry, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen);

    bfj h(ArrayList arrayList, StoriesContainer storiesContainer, StoriesContainer storiesContainer2);

    io.reactivex.rxjava3.core.x<u4m0> i(String str, boolean z);

    io.reactivex.rxjava3.disposables.c j(as80 as80Var);

    io.reactivex.rxjava3.core.a k(StoryEntry storyEntry, Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen);

    io.reactivex.rxjava3.core.x l(UserId userId, String str, boolean z);

    io.reactivex.rxjava3.disposables.c m(as80 as80Var);

    io.reactivex.rxjava3.core.a n(UserId userId, StoriesContainer storiesContainer, String str);

    io.reactivex.rxjava3.core.x<Boolean> o(StoryEntry storyEntry);
}
