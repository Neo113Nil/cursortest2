package xsna;

import com.vk.dto.narratives.Narrative;

/* compiled from: AllHighlightsItem.kt */
/* loaded from: classes3.dex */
public abstract class gu1 {
    public final int a;

    /* compiled from: AllHighlightsItem.kt */
    public static final class a extends gu1 {
        public static final a b = new a(0);
    }

    /* compiled from: AllHighlightsItem.kt */
    public static final class b extends gu1 {
        public final Narrative b;
        public final boolean c;

        public b(Narrative narrative, boolean z) {
            super(1);
            this.b = narrative;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HighlightItem(highlight=");
            sb.append(this.b);
            sb.append(", isInEditMode=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: AllHighlightsItem.kt */
    public static final class c extends gu1 {
        public final int b;

        public c(int i) {
            super(2);
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
            return vu5.b(new StringBuilder("HighlightsCountItem(count="), this.b, ')');
        }
    }

    public gu1(int i) {
        this.a = i;
    }
}
