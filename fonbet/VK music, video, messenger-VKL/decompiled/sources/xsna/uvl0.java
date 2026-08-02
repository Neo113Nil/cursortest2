package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import java.io.File;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StoriesUploadInteractor.kt */
/* loaded from: classes6.dex */
public interface uvl0 {
    void a(int i);

    int b(StoryMultiData storyMultiData);

    void c(int i);

    void clear();

    boolean d(StoriesContainer storiesContainer);

    void e(int i, StoryEntry storyEntry, int i2, int i3);

    List f(int i, UserId userId);

    boolean g(int i);

    float h(int i);

    void i(int i, File file);

    void init();

    boolean j(int i);

    void k(int i, String str);

    int l(StoriesContainer storiesContainer);

    boolean m(int i);

    boolean n(int i);

    void o(int i, int i2);

    /* compiled from: StoriesUploadInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final uvl0 STUB = new C3837a();

        public final uvl0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoriesUploadInteractor.kt */
        /* renamed from: xsna.uvl0$a$a, reason: collision with other inner class name */
        public static final class C3837a implements uvl0 {
            @Override // xsna.uvl0
            public final int b(StoryMultiData storyMultiData) {
                return 0;
            }

            @Override // xsna.uvl0
            public final boolean d(StoriesContainer storiesContainer) {
                return false;
            }

            @Override // xsna.uvl0
            public final List f(int i, UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.uvl0
            public final boolean g(int i) {
                return false;
            }

            @Override // xsna.uvl0
            public final float h(int i) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }

            @Override // xsna.uvl0
            public final boolean j(int i) {
                return false;
            }

            @Override // xsna.uvl0
            public final int l(StoriesContainer storiesContainer) {
                return 0;
            }

            @Override // xsna.uvl0
            public final boolean m(int i) {
                return false;
            }

            @Override // xsna.uvl0
            public final boolean n(int i) {
                return false;
            }

            @Override // xsna.uvl0
            public final void clear() {
            }

            @Override // xsna.uvl0
            public final void init() {
            }

            @Override // xsna.uvl0
            public final void a(int i) {
            }

            @Override // xsna.uvl0
            public final void c(int i) {
            }

            @Override // xsna.uvl0
            public final void i(int i, File file) {
            }

            @Override // xsna.uvl0
            public final void k(int i, String str) {
            }

            @Override // xsna.uvl0
            public final void o(int i, int i2) {
            }

            @Override // xsna.uvl0
            public final void e(int i, StoryEntry storyEntry, int i2, int i3) {
            }
        }
    }
}
