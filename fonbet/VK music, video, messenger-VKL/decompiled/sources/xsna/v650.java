package xsna;

/* compiled from: MusicSnippetsNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface v650 {

    /* compiled from: MusicSnippetsNavigationEvent.kt */
    public static final class a implements v650 {
        public static final a a = new a();
    }

    /* compiled from: MusicSnippetsNavigationEvent.kt */
    public static final class b implements v650 {
        public final String a;

        public b(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("LinkClick(link="), this.a, ')');
        }
    }

    /* compiled from: MusicSnippetsNavigationEvent.kt */
    public static final class c implements v650 {
        public static final c a = new c();
    }
}
