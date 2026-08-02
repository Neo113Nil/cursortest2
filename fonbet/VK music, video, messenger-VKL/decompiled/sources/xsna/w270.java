package xsna;

/* compiled from: NoMemoryNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface w270 {

    /* compiled from: NoMemoryNavigationEvent.kt */
    public static final class a implements w270 {
        public static final a a = new a();
    }

    /* compiled from: NoMemoryNavigationEvent.kt */
    public static final class b implements w270 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OpenMemorySettings(hasDownloads="), this.a, ')');
        }
    }
}
