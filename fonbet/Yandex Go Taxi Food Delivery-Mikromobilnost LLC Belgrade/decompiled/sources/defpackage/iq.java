package defpackage;

import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class iq implements fr {
    public final String a;
    public final PlacesWebAuthType b;
    public final String c;

    public iq(String str, PlacesWebAuthType placesWebAuthType, String str2) {
        this.a = str;
        this.b = placesWebAuthType;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq)) {
            return false;
        }
        iq iqVar = (iq) obj;
        return jl40.l(this.a, iqVar.a) && this.b == iqVar.b && this.c.equals(iqVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PlacesWebAuthType placesWebAuthType = this.b;
        return this.c.hashCode() + ((hashCode + (placesWebAuthType == null ? 0 : placesWebAuthType.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenWebViewAuthAction(url=");
        sb.append(this.a);
        sb.append(", authType=");
        sb.append(this.b);
        sb.append(", authTypeAnalyticsName=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
