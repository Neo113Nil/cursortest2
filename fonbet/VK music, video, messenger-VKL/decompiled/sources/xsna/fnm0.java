package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.ideas.StoryIdea;

/* compiled from: StoryViewerInteractor.kt */
/* loaded from: classes6.dex */
public interface fnm0 {
    io.reactivex.rxjava3.core.x<StoriesContainer> a(StoriesContainer storiesContainer);

    void b();

    io.reactivex.rxjava3.core.a c(String str);

    io.reactivex.rxjava3.core.a d(StoryIdea storyIdea);

    void e();

    io.reactivex.rxjava3.core.a f(StoryIdea storyIdea);

    io.reactivex.rxjava3.core.q<Boolean> g();

    /* compiled from: StoryViewerInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final fnm0 STUB = new C2886a();

        public final fnm0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoryViewerInteractor.kt */
        /* renamed from: xsna.fnm0$a$a, reason: collision with other inner class name */
        public static final class C2886a implements fnm0 {
            @Override // xsna.fnm0
            public final io.reactivex.rxjava3.core.x<StoriesContainer> a(StoriesContainer storiesContainer) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.fnm0
            public final io.reactivex.rxjava3.core.a c(String str) {
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            }

            @Override // xsna.fnm0
            public final io.reactivex.rxjava3.core.a d(StoryIdea storyIdea) {
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            }

            @Override // xsna.fnm0
            public final io.reactivex.rxjava3.core.a f(StoryIdea storyIdea) {
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            }

            @Override // xsna.fnm0
            public final io.reactivex.rxjava3.core.q<Boolean> g() {
                return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
            }

            @Override // xsna.fnm0
            public final void b() {
            }

            @Override // xsna.fnm0
            public final void e() {
            }
        }
    }
}
