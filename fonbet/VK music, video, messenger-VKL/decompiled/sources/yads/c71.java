package yads;

import android.net.Uri;
import xsna.epx;

/* loaded from: classes10.dex */
public final class c71 implements d71 {
    public final Uri a;

    public c71(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c71) && epx.f(this.a, ((c71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(reportUri=" + this.a + ")";
    }
}
