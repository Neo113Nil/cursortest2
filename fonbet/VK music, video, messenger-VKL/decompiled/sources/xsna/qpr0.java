package xsna;

import java.util.List;

/* compiled from: VerticalizationModePatch.kt */
/* loaded from: classes16.dex */
public abstract class qpr0 implements xl50 {

    /* compiled from: VerticalizationModePatch.kt */
    public static final class a extends qpr0 {
        public final List<String> b;

        public a(List<String> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("ImagesLoaded(urls="), this.b);
        }
    }

    /* compiled from: VerticalizationModePatch.kt */
    public static final class b extends qpr0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1625149739;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: VerticalizationModePatch.kt */
    public static final class c extends qpr0 {
        public final int b;

        public c(int i) {
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
            return vu5.b(new StringBuilder("SelectPickerItem(position="), this.b, ')');
        }
    }
}
