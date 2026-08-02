package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class k530 implements l530 {
    public final Uri a;

    public final boolean equals(Object obj) {
        if (obj instanceof k530) {
            return jl40.l(this.a, ((k530) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.m(this.a, "UriModified(uri=", Extension.C_BRAKE);
    }
}
