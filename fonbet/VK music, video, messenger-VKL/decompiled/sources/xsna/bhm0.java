package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.stories.model.StoryEntry;
import xsna.tlo0;

/* compiled from: StoryStatisticsSideEffect.kt */
/* loaded from: classes6.dex */
public abstract class bhm0 {

    /* compiled from: StoryStatisticsSideEffect.kt */
    public static final class a extends bhm0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2100069997;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: StoryStatisticsSideEffect.kt */
    public static final class b extends bhm0 {
        public final StoryPrivacyType a;
        public final int b;

        public b(StoryPrivacyType storyPrivacyType, int i) {
            this.a = storyPrivacyType;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            StoryPrivacyType storyPrivacyType = this.a;
            return Integer.hashCode(this.b) + ((storyPrivacyType == null ? 0 : storyPrivacyType.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPrivacy(currentPrivacy=");
            sb.append(this.a);
            sb.append(", currentStoryId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsSideEffect.kt */
    public static final class c extends bhm0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1323906680;
        }

        public final String toString() {
            return "OpenSettings";
        }
    }

    /* compiled from: StoryStatisticsSideEffect.kt */
    public static final class d extends bhm0 {
        public final int a;

        public d(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ScrollToItemByClick(position="), this.a, ')');
        }
    }

    /* compiled from: StoryStatisticsSideEffect.kt */
    public static final class e extends bhm0 {
        public final tlo0.f a;

        public e(tlo0.f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.a.a);
        }

        public final String toString() {
            return pr.b(new StringBuilder("ShowSnackBar(message="), this.a, ')');
        }
    }

    /* compiled from: StoryStatisticsSideEffect.kt */
    public static final class f extends bhm0 {
        public final int a;

        public f(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UpdateSelectedPreviewIndex(position="), this.a, ')');
        }
    }

    /* compiled from: StoryStatisticsSideEffect.kt */
    public static final class g extends bhm0 {
        public final StoryEntry a;

        public g(StoryEntry storyEntry) {
            this.a = storyEntry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UpdateTabsOnScrollStopped(storyEntry=" + this.a + ')';
        }
    }

    /* compiled from: StoryStatisticsSideEffect.kt */
    public static final class h extends bhm0 {
        public final int a;

        public h(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a == ((h) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UpdateViewerStory(position="), this.a, ')');
        }
    }
}
