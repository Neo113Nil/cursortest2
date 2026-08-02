package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class eir {
    public final Uri a;
    public final LinkedHashMap b;

    public eir(Uri uri, LinkedHashMap linkedHashMap) {
        this.a = uri;
        this.b = linkedHashMap;
    }

    public final Uri a() {
        return this.a;
    }

    public final Map b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eir)) {
            return false;
        }
        eir eirVar = (eir) obj;
        return jl40.l(this.a, eirVar.a) && this.b.equals(eirVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FlexDeeplink(deeplinkUri=" + this.a + ", queryParams=" + this.b + Extension.C_BRAKE;
    }
}
