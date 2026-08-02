package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import java.util.List;
import java.util.Set;

/* compiled from: StoryStatisticsInteractor.kt */
/* loaded from: classes6.dex */
public interface jfm0 {
    public static final a a = a.a;

    void b(int i, UserId userId);

    io.reactivex.rxjava3.core.x c(int i, UserId userId, int i2);

    io.reactivex.rxjava3.core.q<c3m0> d(UserId userId, int i, LoadStrategy loadStrategy);

    io.reactivex.rxjava3.core.q<Set<UserId>> e(UserId userId, UserId userId2);

    io.reactivex.rxjava3.core.q<tnm0> f(v3u0 v3u0Var, LoadStrategy loadStrategy);

    io.reactivex.rxjava3.core.q<Set<UserId>> g(UserId userId, UserId userId2);

    io.reactivex.rxjava3.core.q<Poll> h(int i, UserId userId, boolean z);

    io.reactivex.rxjava3.core.q<VKList<StoryQuestionEntry>> i(rqe0 rqe0Var, LoadStrategy loadStrategy, boolean z);

    io.reactivex.rxjava3.core.q<Set<UserId>> j(UserId userId, LoadStrategy loadStrategy);

    io.reactivex.rxjava3.core.x k(int i, UserId userId, int i2);

    io.reactivex.rxjava3.core.x l(int i, UserId userId, int i2);

    io.reactivex.rxjava3.core.q<List<StoriesContainer>> m(UserId userId, int i, String str, LoadStrategy loadStrategy);

    void n(List<? extends StoryEntry> list);

    ysg0<oem0> o();

    /* compiled from: StoryStatisticsInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final jfm0 STUB = new C3119a();

        public final jfm0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoryStatisticsInteractor.kt */
        /* renamed from: xsna.jfm0$a$a, reason: collision with other inner class name */
        public static final class C3119a implements jfm0 {
            public final ysg0<oem0> b = new ysg0<>();

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.x c(int i, UserId userId, int i2) {
                return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            }

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.q<c3m0> d(UserId userId, int i, LoadStrategy loadStrategy) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.q<Set<UserId>> e(UserId userId, UserId userId2) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.q<tnm0> f(v3u0 v3u0Var, LoadStrategy loadStrategy) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.q<Set<UserId>> g(UserId userId, UserId userId2) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.q<Poll> h(int i, UserId userId, boolean z) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.q<VKList<StoryQuestionEntry>> i(rqe0 rqe0Var, LoadStrategy loadStrategy, boolean z) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.q<Set<UserId>> j(UserId userId, LoadStrategy loadStrategy) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.x k(int i, UserId userId, int i2) {
                return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            }

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.x l(int i, UserId userId, int i2) {
                return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            }

            @Override // xsna.jfm0
            public final io.reactivex.rxjava3.core.q<List<StoriesContainer>> m(UserId userId, int i, String str, LoadStrategy loadStrategy) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.jfm0
            public final ysg0<oem0> o() {
                return this.b;
            }

            @Override // xsna.jfm0
            public final void n(List<? extends StoryEntry> list) {
            }

            @Override // xsna.jfm0
            public final void b(int i, UserId userId) {
            }
        }
    }
}
