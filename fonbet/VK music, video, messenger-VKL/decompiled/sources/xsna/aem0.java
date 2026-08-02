package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;

/* compiled from: StoryStatisticsAction.kt */
/* loaded from: classes6.dex */
public abstract class aem0 implements kj50 {

    /* compiled from: StoryStatisticsAction.kt */
    public static final class a extends aem0 {
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
            return vu5.b(new StringBuilder("ChangeCurrentStory(position="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsAction.kt */
    public static final class b extends aem0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1748429275;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: StoryStatisticsAction.kt */
    public static final class c extends aem0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1026412749;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: StoryStatisticsAction.kt */
    public static final class d extends aem0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 537469825;
        }

        public final String toString() {
            return "OpenPrivacy";
        }
    }

    /* compiled from: StoryStatisticsAction.kt */
    public static final class e extends aem0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2075835210;
        }

        public final String toString() {
            return "OpenSettings";
        }
    }

    /* compiled from: StoryStatisticsAction.kt */
    public static final class f extends aem0 {
        public final int b;

        public f(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SelectTab(position="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsAction.kt */
    public static final class g extends aem0 {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShowPreviewContent(isVisible="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsAction.kt */
    public static final class h extends aem0 {
        public final int b;

        public h(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("StoryPreviewItemClick(position="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsAction.kt */
    public static final class i extends aem0 {
        public final int b;

        public i(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("StoryPreviewItemImageLoaded(storyId="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsAction.kt */
    public static final class j extends aem0 {
        public final boolean b;

        public j(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("StoryPreviewScrollStateChanged(isScrolling="), this.b, ')');
        }
    }

    /* compiled from: StoryStatisticsAction.kt */
    public static final class k extends aem0 {
        public final StoryPrivacyType b;

        public k(StoryPrivacyType storyPrivacyType) {
            this.b = storyPrivacyType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.b == ((k) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdatePrivacy(newPrivacy=" + this.b + ')';
        }
    }
}
