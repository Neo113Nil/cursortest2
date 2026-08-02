package xsna;

import android.net.Uri;
import java.io.File;

/* compiled from: CopyProperties.kt */
/* loaded from: classes3.dex */
public final class gtj {
    public final File a;
    public final Uri b;

    public gtj(Uri uri, File file) {
        this.a = file;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtj)) {
            return false;
        }
        gtj gtjVar = (gtj) obj;
        return epx.f(this.a, gtjVar.a) && epx.f(this.b, gtjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CopyProperties(outputFile=");
        sb.append(this.a);
        sb.append(", sourceUri=");
        return alb0.b(sb, this.b, ')');
    }
}
