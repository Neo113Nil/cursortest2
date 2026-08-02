package xsna;

import xsna.ejm0;

/* compiled from: StoryTemplateAction.kt */
/* loaded from: classes6.dex */
public abstract class vim0 implements kj50 {

    /* compiled from: StoryTemplateAction.kt */
    public static final class a extends vim0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1756744692;
        }

        public final String toString() {
            return "CloseMemoriesBanner";
        }
    }

    /* compiled from: StoryTemplateAction.kt */
    public static final class b extends vim0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1811143364;
        }

        public final String toString() {
            return "LoadPage";
        }
    }

    /* compiled from: StoryTemplateAction.kt */
    public static final class c extends vim0 {
        public final ejm0.a b;

        public c(ejm0.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.a.hashCode();
        }

        public final String toString() {
            return "OpenCreateStory(template=" + this.b + ')';
        }
    }

    /* compiled from: StoryTemplateAction.kt */
    public static final class d extends vim0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 872506488;
        }

        public final String toString() {
            return "OpenMemories";
        }
    }
}
