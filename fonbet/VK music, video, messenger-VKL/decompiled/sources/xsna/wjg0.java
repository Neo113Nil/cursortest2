package xsna;

import android.net.Uri;
import java.io.File;

/* compiled from: RichContent.kt */
/* loaded from: classes5.dex */
public interface wjg0 {

    /* compiled from: RichContent.kt */
    public static final class a implements wjg0 {
        public final File a;
        public final Uri b;

        public a(Uri uri, File file) {
            this.a = file;
            this.b = uri;
        }

        public final void a() {
            try {
                this.a.delete();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: RichContent.kt */
    public static final class b implements wjg0 {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
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
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Text(text=");
            sb.append(this.a);
            sb.append(", isHtml=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
