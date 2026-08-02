package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import java.util.List;
import java.util.Set;

/* compiled from: StoryStatisticsRepository.kt */
/* loaded from: classes6.dex */
public interface qgm0 {
    void b(int i, UserId userId);

    io.reactivex.rxjava3.internal.operators.single.o c(int i, UserId userId, int i2);

    io.reactivex.rxjava3.core.q<c3m0> d(UserId userId, int i, LoadStrategy loadStrategy);

    io.reactivex.rxjava3.core.q<Set<UserId>> e(UserId userId, UserId userId2);

    io.reactivex.rxjava3.core.q<tnm0> f(v3u0 v3u0Var, LoadStrategy loadStrategy);

    io.reactivex.rxjava3.core.q<Set<UserId>> g(UserId userId, UserId userId2);

    io.reactivex.rxjava3.internal.operators.observable.j1 h(int i, UserId userId, boolean z);

    io.reactivex.rxjava3.core.q<VKList<StoryQuestionEntry>> i(rqe0 rqe0Var, LoadStrategy loadStrategy, boolean z);

    io.reactivex.rxjava3.core.q<Set<UserId>> j(UserId userId, LoadStrategy loadStrategy);

    io.reactivex.rxjava3.internal.operators.single.y k(int i, UserId userId, int i2);

    io.reactivex.rxjava3.internal.operators.single.y l(int i, UserId userId, int i2);

    io.reactivex.rxjava3.core.q<List<StoriesContainer>> m(UserId userId, int i, String str, LoadStrategy loadStrategy);

    void n(List<? extends StoryEntry> list);
}
