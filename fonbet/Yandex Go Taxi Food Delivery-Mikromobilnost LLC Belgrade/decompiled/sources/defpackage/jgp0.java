package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jgp0 {
    public final Uri a;

    public /* synthetic */ jgp0(Uri uri) {
        this.a = uri;
    }

    public static final /* synthetic */ jgp0 a(Uri uri) {
        return new jgp0(uri);
    }

    public final /* synthetic */ Uri b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jgp0) {
            return jl40.l(this.a, ((jgp0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.m(this.a, "ScreenshotEvent(uri=", Extension.C_BRAKE);
    }
}
