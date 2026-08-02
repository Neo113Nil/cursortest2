package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryOwner;

/* compiled from: StoryOwnerUtil.kt */
/* loaded from: classes6.dex */
public interface s7m0 {

    /* compiled from: StoryOwnerUtil.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final s7m0 STUB = new C3652a();

        /* compiled from: StoryOwnerUtil.kt */
        /* renamed from: xsna.s7m0$a$a, reason: collision with other inner class name */
        public static final class C3652a implements s7m0 {
            @Override // xsna.s7m0
            public final boolean a(StoryOwner storyOwner, UserId userId) {
                return false;
            }

            @Override // xsna.s7m0
            public final String b(StoryOwner storyOwner) {
                return null;
            }

            @Override // xsna.s7m0
            public final boolean c(StoryOwner storyOwner, UserId userId) {
                return false;
            }
        }

        public final s7m0 getSTUB() {
            return STUB;
        }
    }

    boolean a(StoryOwner storyOwner, UserId userId);

    String b(StoryOwner storyOwner);

    boolean c(StoryOwner storyOwner, UserId userId);
}
