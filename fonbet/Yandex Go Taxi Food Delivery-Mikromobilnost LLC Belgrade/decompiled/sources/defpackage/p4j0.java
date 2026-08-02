package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.yandex.go.external_service.preloader.data.models.RepositoryConfiguration$BundleStrategy;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes.dex */
public final class p4j0 {
    public final String a;
    public final RepositoryConfiguration$BundleStrategy b;
    public final int c;
    public final int d;
    public final long e;
    public final Map f;

    public p4j0(String str, RepositoryConfiguration$BundleStrategy repositoryConfiguration$BundleStrategy, int i, int i2) {
        this.a = str;
        this.b = repositoryConfiguration$BundleStrategy;
        this.c = i;
        this.d = i2;
        this.e = i2 * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        this.f = g8e.z(ExtFunctionsKt.HEADER_USER_AGENT, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4j0)) {
            return false;
        }
        p4j0 p4j0Var = (p4j0) obj;
        return jl40.l(this.a, p4j0Var.a) && this.b == p4j0Var.b && this.c == p4j0Var.c && this.d == p4j0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepositoryConfiguration(userAgent=");
        sb.append(this.a);
        sb.append(", bundleStrategy=");
        sb.append(this.b);
        sb.append(", maxConcurrency=");
        return ly3.k(this.c, this.d, ", maxCacheSizeInMb=", Extension.C_BRAKE, sb);
    }
}
