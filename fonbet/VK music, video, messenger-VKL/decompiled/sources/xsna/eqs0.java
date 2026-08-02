package xsna;

import java.util.List;

/* compiled from: VideoInfoSegment.kt */
/* loaded from: classes14.dex */
public interface eqs0 {

    /* compiled from: VideoInfoSegment.kt */
    public static final class a implements eqs0 {
        public final List<eqs0> a;
        public final oui b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends eqs0> list, oui ouiVar) {
            this.a = list;
            this.b = ouiVar;
        }
    }

    /* compiled from: VideoInfoSegment.kt */
    public static final class b implements eqs0 {
        public final CharSequence a;
        public final CharSequence b;

        public b(CharSequence charSequence, CharSequence charSequence2) {
            this.a = charSequence;
            this.b = charSequence2;
        }
    }

    /* compiled from: VideoInfoSegment.kt */
    @vby
    public static final class c implements eqs0 {
        public final CharSequence a;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return epx.f(this.a, ((c) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PlainText(text=" + ((Object) this.a) + ')';
        }
    }
}
