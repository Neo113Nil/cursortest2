package xsna;

import java.util.List;
import xsna.ejm0;

/* compiled from: StoryTemplatePatch.kt */
/* loaded from: classes6.dex */
public interface hjm0 extends xl50 {

    /* compiled from: StoryTemplatePatch.kt */
    public static final class a implements hjm0 {
        public final ejm0.b b;

        public a(ejm0.b bVar) {
            this.b = bVar;
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
            return "AddMemoriesBanner(memoriesBanner=" + this.b + ')';
        }
    }

    /* compiled from: StoryTemplatePatch.kt */
    public static final class b implements hjm0 {
        public final List<ejm0.a> b;

        public b(List<ejm0.a> list) {
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
            return ms9.a(')', new StringBuilder("CompleteTemplate(templates="), this.b);
        }
    }

    /* compiled from: StoryTemplatePatch.kt */
    public static final class c implements hjm0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -624675015;
        }

        public final String toString() {
            return "ErrorTemplate";
        }
    }

    /* compiled from: StoryTemplatePatch.kt */
    public static final class d implements hjm0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 842729645;
        }

        public final String toString() {
            return "LoadingTemplate";
        }
    }

    /* compiled from: StoryTemplatePatch.kt */
    public static final class e implements hjm0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -716127592;
        }

        public final String toString() {
            return "RemoveMemoriesBanner";
        }
    }
}
