package xsna;

import android.graphics.Rect;
import android.util.Size;
import java.util.List;

/* compiled from: CameraParameters.kt */
/* loaded from: classes16.dex */
public interface sj9 {

    /* compiled from: CameraParameters.kt */
    public static final class a {
        public final Rect a;

        public a(Rect rect) {
            this.a = rect;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return Integer.hashCode(1) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Area(rect=" + this.a + ", weight=1)";
        }
    }

    Size[] a();

    String b();

    List<String> c();

    String get(String str);
}
