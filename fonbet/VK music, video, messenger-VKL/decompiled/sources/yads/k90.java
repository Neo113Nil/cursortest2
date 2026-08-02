package yads;

import android.net.Uri;
import xsna.epx;

/* loaded from: classes10.dex */
public final class k90 implements m90 {
    public final Uri a;

    public k90(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k90) && epx.f(this.a, ((k90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShareReport(reportUri=" + this.a + ")";
    }
}
