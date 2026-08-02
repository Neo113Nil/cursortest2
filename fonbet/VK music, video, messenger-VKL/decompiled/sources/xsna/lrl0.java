package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ideas.StoryIdea;
import java.util.Collection;
import java.util.List;

/* compiled from: StoriesCacheInteractor.kt */
/* loaded from: classes11.dex */
public interface lrl0 {
    void a(int i);

    void b(List<? extends StoriesContainer> list, boolean z);

    void c(StoriesContainer storiesContainer);

    void clear();

    io.reactivex.rxjava3.core.q<GetStoriesResponse> d();

    void e(Collection<? extends StoryEntry> collection, izs<? super StoryEntry, s3q0> izsVar);

    void f(List<? extends StoryEntry> list);

    io.reactivex.rxjava3.core.q<GetStoriesResponse> g();

    void h(String str);

    GetStoriesResponse i();

    void j(GetStoriesResponse getStoriesResponse);

    void k(StoriesContainer storiesContainer);

    long l();

    void m(StoriesContainer storiesContainer);

    void n(StoryIdea storyIdea);

    void o();

    /* compiled from: StoriesCacheInteractor.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final lrl0 STUB = new C3284a();

        public final lrl0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoriesCacheInteractor.kt */
        /* renamed from: xsna.lrl0$a$a, reason: collision with other inner class name */
        public static final class C3284a implements lrl0 {
            @Override // xsna.lrl0
            public final io.reactivex.rxjava3.core.q<GetStoriesResponse> d() {
                return io.reactivex.rxjava3.internal.operators.observable.l1.b;
            }

            @Override // xsna.lrl0
            public final io.reactivex.rxjava3.core.q<GetStoriesResponse> g() {
                return io.reactivex.rxjava3.internal.operators.observable.l1.b;
            }

            @Override // xsna.lrl0
            public final GetStoriesResponse i() {
                return null;
            }

            @Override // xsna.lrl0
            public final long l() {
                return 0L;
            }

            @Override // xsna.lrl0
            public final void clear() {
            }

            @Override // xsna.lrl0
            public final void o() {
            }

            @Override // xsna.lrl0
            public final void a(int i) {
            }

            @Override // xsna.lrl0
            public final void c(StoriesContainer storiesContainer) {
            }

            @Override // xsna.lrl0
            public final void f(List<? extends StoryEntry> list) {
            }

            @Override // xsna.lrl0
            public final void h(String str) {
            }

            @Override // xsna.lrl0
            public final void j(GetStoriesResponse getStoriesResponse) {
            }

            @Override // xsna.lrl0
            public final void k(StoriesContainer storiesContainer) {
            }

            @Override // xsna.lrl0
            public final void m(StoriesContainer storiesContainer) {
            }

            @Override // xsna.lrl0
            public final void n(StoryIdea storyIdea) {
            }

            @Override // xsna.lrl0
            public final void b(List<? extends StoriesContainer> list, boolean z) {
            }

            @Override // xsna.lrl0
            public final void e(Collection<? extends StoryEntry> collection, izs<? super StoryEntry, s3q0> izsVar) {
            }
        }
    }
}
