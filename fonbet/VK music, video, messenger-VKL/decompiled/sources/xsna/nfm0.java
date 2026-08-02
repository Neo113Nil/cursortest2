package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;

/* compiled from: StoryStatisticsPatch.kt */
/* loaded from: classes6.dex */
public abstract class nfm0 implements xl50 {

    /* compiled from: StoryStatisticsPatch.kt */
    public static final class a extends nfm0 {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ChangeCurrentStory(index="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsPatch.kt */
    public static final class b extends nfm0 {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PreviewItemImageLoaded(storyId="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsPatch.kt */
    public static final class c extends nfm0 {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SelectTab(position="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsPatch.kt */
    public static final class d extends nfm0 {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShowPreviewBlur(isVisible="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsPatch.kt */
    public static final class e extends nfm0 {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShowPreviewContent(isVisible="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsPatch.kt */
    public static final class f extends nfm0 {
        public final int b;
        public final int c;

        public f(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.b == fVar.b && this.c == fVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StoryViewersCountLoaded(storyId=");
            sb.append(this.b);
            sb.append(", viewersTotalCount=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: StoryStatisticsPatch.kt */
    public static final class g extends nfm0 {
        public final StoryPrivacyType b;

        public g(StoryPrivacyType storyPrivacyType) {
            this.b = storyPrivacyType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdatePrivacy(newPrivacy=" + this.b + ')';
        }
    }
}
