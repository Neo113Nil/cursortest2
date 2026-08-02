package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.narratives.Narrative;
import java.util.List;

/* compiled from: HighlightEvent.kt */
/* loaded from: classes3.dex */
public abstract class d5v {

    /* compiled from: HighlightEvent.kt */
    public static final class a extends d5v {
        public final Narrative a;

        public a(Narrative narrative) {
            this.a = narrative;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Changed(highlight=" + this.a + ')';
        }
    }

    /* compiled from: HighlightEvent.kt */
    public static final class b extends d5v {
        public final Narrative a;

        public b(Narrative narrative) {
            this.a = narrative;
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
            return "Created(highlight=" + this.a + ')';
        }
    }

    /* compiled from: HighlightEvent.kt */
    public static final class c extends d5v {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Deleted(highlightId="), this.a, ')');
        }
    }

    /* compiled from: HighlightEvent.kt */
    public static final class d extends d5v {
        public final List<Narrative> a;

        public d(VKList vKList) {
            this.a = vKList;
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
            return ms9.a(')', new StringBuilder("ListChanged(highlights="), this.a);
        }
    }
}
