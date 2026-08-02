package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: StoryPrivacyPatch.kt */
/* loaded from: classes16.dex */
public abstract class x9m0 implements xl50 {

    /* compiled from: StoryPrivacyPatch.kt */
    public static final class a extends x9m0 {
        public final List<ayv0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends ayv0> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("BestFriendsAvatarsLoaded(avatars="), this.b);
        }
    }

    /* compiled from: StoryPrivacyPatch.kt */
    public static final class b extends x9m0 {
        public final List<ayv0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends ayv0> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ExcludedFriendsAvatarsLoaded(avatars="), this.b);
        }
    }

    /* compiled from: StoryPrivacyPatch.kt */
    public static final class c extends x9m0 {
        public final List<ayv0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends ayv0> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("IncludedFriendsAvatarsLoaded(avatars="), this.b);
        }
    }

    /* compiled from: StoryPrivacyPatch.kt */
    public static final class d extends x9m0 {
        public static final d b = new d();
    }

    /* compiled from: StoryPrivacyPatch.kt */
    public static final class e extends x9m0 {
        public static final e b = new e();
    }

    /* compiled from: StoryPrivacyPatch.kt */
    public static final class f extends x9m0 {
        public final List<UserId> b;

        public f(List<UserId> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateBestFriends(bestFriends="), this.b);
        }
    }

    /* compiled from: StoryPrivacyPatch.kt */
    public static final class g extends x9m0 {
        public final List<UserId> b;

        public g(List<UserId> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateExcludedFriends(excludedFriends="), this.b);
        }
    }

    /* compiled from: StoryPrivacyPatch.kt */
    public static final class h extends x9m0 {
        public final StoryPrivacyType b;

        public h(StoryPrivacyType storyPrivacyType) {
            this.b = storyPrivacyType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateType(type=" + this.b + ')';
        }
    }
}
