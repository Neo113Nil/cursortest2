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

/* compiled from: StoryStatisticsInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class kfm0 implements jfm0 {
    public final qgm0 b;
    public final ysg0<oem0> c;

    public kfm0(zgm0 zgm0Var) {
        this.b = zgm0Var;
        this.c = zgm0Var.d;
    }

    @Override // xsna.jfm0
    public final void b(int i, UserId userId) {
        this.b.b(i, userId);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.x c(int i, UserId userId, int i2) {
        return this.b.c(i, userId, i2);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.q<c3m0> d(UserId userId, int i, LoadStrategy loadStrategy) {
        return this.b.d(userId, i, loadStrategy);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.q<Set<UserId>> e(UserId userId, UserId userId2) {
        return this.b.e(userId, userId2);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.q<tnm0> f(v3u0 v3u0Var, LoadStrategy loadStrategy) {
        return this.b.f(v3u0Var, loadStrategy);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.q<Set<UserId>> g(UserId userId, UserId userId2) {
        return this.b.g(userId, userId2);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.q<Poll> h(int i, UserId userId, boolean z) {
        return this.b.h(i, userId, z);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.q<VKList<StoryQuestionEntry>> i(rqe0 rqe0Var, LoadStrategy loadStrategy, boolean z) {
        return this.b.i(rqe0Var, loadStrategy, z);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.q<Set<UserId>> j(UserId userId, LoadStrategy loadStrategy) {
        return this.b.j(userId, loadStrategy);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.x k(int i, UserId userId, int i2) {
        return this.b.k(i, userId, i2);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.x l(int i, UserId userId, int i2) {
        return this.b.l(i, userId, i2);
    }

    @Override // xsna.jfm0
    public final io.reactivex.rxjava3.core.q<List<StoriesContainer>> m(UserId userId, int i, String str, LoadStrategy loadStrategy) {
        return this.b.m(userId, i, str, loadStrategy);
    }

    @Override // xsna.jfm0
    public final void n(List<? extends StoryEntry> list) {
        this.b.n(list);
    }

    @Override // xsna.jfm0
    public final ysg0<oem0> o() {
        return this.c;
    }
}
