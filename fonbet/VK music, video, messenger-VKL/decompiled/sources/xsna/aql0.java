package xsna;

import com.vk.dto.stories.model.StoryEntry;

/* compiled from: StoriesBackgroundContentLoader.kt */
/* loaded from: classes6.dex */
public interface aql0 {

    /* compiled from: StoriesBackgroundContentLoader.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final aql0 STUB = new C2562a();

        /* compiled from: StoriesBackgroundContentLoader.kt */
        /* renamed from: xsna.aql0$a$a, reason: collision with other inner class name */
        public static final class C2562a implements aql0 {
            @Override // xsna.aql0
            public final io.reactivex.rxjava3.core.x a(StoryEntry storyEntry) {
                return io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
            }
        }

        public final aql0 getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.x a(StoryEntry storyEntry);
}
