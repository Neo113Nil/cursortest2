package xsna;

/* compiled from: DescriptionState.kt */
/* loaded from: classes17.dex */
public interface m2m {

    /* compiled from: DescriptionState.kt */
    public static final class a implements m2m {
        public final CharSequence a;
        public final CharSequence b;

        public a(CharSequence charSequence, CharSequence charSequence2) {
            this.a = charSequence;
            this.b = charSequence2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Expandable(collapsedText=");
            sb.append((Object) this.a);
            sb.append(", expandedText=");
            return thl0.a(sb, this.b, ')');
        }
    }

    /* compiled from: DescriptionState.kt */
    public static final class b implements m2m {
        public final CharSequence a;

        public b(CharSequence charSequence) {
            this.a = charSequence;
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
            return thl0.a(new StringBuilder("Static(text="), this.a, ')');
        }
    }
}
