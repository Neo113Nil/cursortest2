package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dhq0 {
    public final String a;
    public final MapBuilder b;

    public dhq0(String str) {
        this.a = str;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("time_since_app_launch", str);
        this.b = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhq0) && this.a.equals(((dhq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SelectedLocationLegacyStartupParams(timeSinceAppLaunch=", this.a, Extension.C_BRAKE);
    }
}
