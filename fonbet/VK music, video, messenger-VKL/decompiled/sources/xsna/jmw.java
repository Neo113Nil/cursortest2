package xsna;

import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: VectorResources.android.kt */
/* loaded from: classes11.dex */
public final class jmw {
    public final HashMap<b, WeakReference<a>> a = new HashMap<>();

    /* compiled from: VectorResources.android.kt */
    public static final class a {
        public final imw a;
        public final int b;

        public a(imw imwVar, int i) {
            this.a = imwVar;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
            sb.append(this.a);
            sb.append(", configFlags=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: VectorResources.android.kt */
    public static final class b {
        public final Resources.Theme a;
        public final int b;

        public b(int i, Resources.Theme theme) {
            this.a = theme;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(theme=");
            sb.append(this.a);
            sb.append(", id=");
            return vu5.b(sb, this.b, ')');
        }
    }
}
