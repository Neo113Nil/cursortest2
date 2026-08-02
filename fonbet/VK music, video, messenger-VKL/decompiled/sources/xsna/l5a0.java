package xsna;

import android.net.Uri;
import android.util.ArrayMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: PhotoAttachesAnalytics.kt */
/* loaded from: classes15.dex */
public final class l5a0 {
    public static a c;
    public static boolean e;
    public static final l5a0 a = new l5a0();
    public static final ArrayMap<Uri, b> b = new ArrayMap<>();
    public static final HashSet<Uri> d = new HashSet<>();
    public static final List<String> f = thp0.c;

    /* compiled from: PhotoAttachesAnalytics.kt */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(false) * 31, 31, false), 31, false), 31, false), 31, false), 31, false);
        }

        public final String toString() {
            return "Edit(saved=false, drawing=false, stickers=false, text=false, filters=false, camera=false, autoEnhance=false)";
        }
    }

    /* compiled from: PhotoAttachesAnalytics.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final int c;

        public b(boolean z, boolean z2, int i) {
            this.a = z;
            this.b = z2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Selection(fromFullView=");
            sb.append(this.a);
            sb.append(", quick=");
            sb.append(this.b);
            sb.append(", pos=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
