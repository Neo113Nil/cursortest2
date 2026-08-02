package xsna;

import android.graphics.RectF;
import java.io.File;
import xsna.kjw;

/* compiled from: ProfilePhotoCropHelper.kt */
/* loaded from: classes5.dex */
public final class bzd0 {

    /* compiled from: ProfilePhotoCropHelper.kt */
    public static final class a {
        public final kjw.a a;
        public final RectF b;

        public a(kjw.a aVar, RectF rectF) {
            this.a = aVar;
            this.b = rectF;
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
            return "Crop(size=" + this.a + ", offset=" + this.b + ')';
        }
    }

    /* compiled from: ProfilePhotoCropHelper.kt */
    public static final class b {
        public final a a;
        public final File b;

        public b(a aVar, File file) {
            this.a = aVar;
            this.b = file;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FileCrop(crop=" + this.a + ", file=" + this.b + ')';
        }
    }
}
