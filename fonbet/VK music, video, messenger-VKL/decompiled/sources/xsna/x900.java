package xsna;

import android.graphics.Bitmap;
import java.util.List;

/* compiled from: Luts.kt */
/* loaded from: classes4.dex */
public abstract class x900 {

    /* compiled from: Luts.kt */
    public static final class a extends x900 {
        public static final a a = new a();
    }

    /* compiled from: Luts.kt */
    public static final class b extends x900 {
        public final List<Bitmap> a;

        public b(List<Bitmap> list) {
            this.a = list;
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
            return wq.c("ImageList(lutImages=", ")", this.a);
        }
    }

    /* compiled from: Luts.kt */
    public static final class c extends x900 {
        public static final c a = new c();
    }
}
