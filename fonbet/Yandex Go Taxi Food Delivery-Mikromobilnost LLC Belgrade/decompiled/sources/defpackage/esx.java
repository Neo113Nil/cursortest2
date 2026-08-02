package defpackage;

import android.net.Uri;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class esx {
    public final Uri a;
    public final List b;

    public esx(Uri uri, List list) {
        this.a = uri;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esx)) {
            return false;
        }
        esx esxVar = (esx) obj;
        return this.a.equals(esxVar.a) && jl40.l(this.b, esxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Last3ds(uri=" + this.a + ", trustedUrls=" + this.b + Extension.C_BRAKE;
    }
}
