package xsna;

import java.util.Map;

/* compiled from: Preferences.kt */
/* loaded from: classes.dex */
public abstract class uyc0 {

    /* compiled from: Preferences.kt */
    public static final class a<T> {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return this.a;
        }
    }

    /* compiled from: Preferences.kt */
    public static final class b<T> {
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);
}
