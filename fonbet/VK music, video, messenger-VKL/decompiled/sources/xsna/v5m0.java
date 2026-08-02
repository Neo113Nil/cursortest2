package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.api.domain.preload.StoryVideoMemoryCache;

/* compiled from: StoryLoaderContent.kt */
/* loaded from: classes11.dex */
public interface v5m0 {
    j1d0 a();

    io.reactivex.rxjava3.core.a b(StoryEntry storyEntry, StoryVideoMemoryCache storyVideoMemoryCache);

    void cancel();

    /* compiled from: StoryLoaderContent.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final v5m0 STUB = new C3869a();

        public final v5m0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoryLoaderContent.kt */
        /* renamed from: xsna.v5m0$a$a, reason: collision with other inner class name */
        public static final class C3869a implements v5m0 {
            @Override // xsna.v5m0
            public final j1d0 a() {
                return null;
            }

            @Override // xsna.v5m0
            public final io.reactivex.rxjava3.core.a b(StoryEntry storyEntry, StoryVideoMemoryCache storyVideoMemoryCache) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.v5m0
            public final void cancel() {
            }
        }
    }
}
