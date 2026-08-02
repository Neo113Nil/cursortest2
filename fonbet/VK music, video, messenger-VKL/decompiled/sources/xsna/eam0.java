package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: StoryPrivacySideEffect.kt */
/* loaded from: classes16.dex */
public abstract class eam0 {

    /* compiled from: StoryPrivacySideEffect.kt */
    public static final class a extends eam0 {
        public static final a a = new a();
    }

    /* compiled from: StoryPrivacySideEffect.kt */
    public static final class b extends eam0 {
        public final List<UserId> a;

        public b(List<UserId> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("OpenHiddenFriendsFragment(excludedFriends="), this.a);
        }
    }

    /* compiled from: StoryPrivacySideEffect.kt */
    public static final class c extends eam0 {
        public final boolean a;
        public final boolean b;
        public final f c;

        public c(boolean z, boolean z2, f fVar) {
            this.a = z;
            this.b = z2;
            this.c = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "Save(confirmed=" + this.a + ", ready=" + this.b + ", privacy=" + this.c + ')';
        }
    }

    /* compiled from: StoryPrivacySideEffect.kt */
    public static final class d extends eam0 {
        public final f a;

        public d(f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowAccountPrivacyBottomSheet(privacy=" + this.a + ')';
        }
    }

    /* compiled from: StoryPrivacySideEffect.kt */
    public static final class e extends eam0 {
        public static final e a = new e();
    }

    /* compiled from: StoryPrivacySideEffect.kt */
    public static final class f {
        public final StoryPrivacyType a;
        public final StoryPrivacyType b;
        public final List<UserId> c;
        public final List<UserId> d;

        public f(StoryPrivacyType storyPrivacyType, StoryPrivacyType storyPrivacyType2, List<UserId> list, List<UserId> list2) {
            this.a = storyPrivacyType;
            this.b = storyPrivacyType2;
            this.c = list;
            this.d = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            StoryPrivacyType storyPrivacyType = this.b;
            return this.d.hashCode() + fw3.a((hashCode + (storyPrivacyType == null ? 0 : storyPrivacyType.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdatedPrivacy(selectedPrivacyType=");
            sb.append(this.a);
            sb.append(", oldPrivacyType=");
            sb.append(this.b);
            sb.append(", bestFriends=");
            sb.append(this.c);
            sb.append(", excludedFriends=");
            return ms9.a(')', sb, this.d);
        }
    }
}
