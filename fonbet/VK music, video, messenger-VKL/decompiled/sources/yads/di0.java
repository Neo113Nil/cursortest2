package yads;

import android.net.Uri;
import xsna.epx;

/* loaded from: classes10.dex */
public final class di0 {
    public final Uri a;

    public di0(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof di0) && epx.f(this.a, ((di0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivKitClickExtensionData(url=" + this.a + ")";
    }
}
