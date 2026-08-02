package defpackage;

import com.yandex.go.flex.main_screen.data.widgets.tracking.TrackingListProperties$Styles;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class i601 {
    public final String a;
    public final hzx b;
    public final TrackingListProperties$Styles c;

    public i601(String str, hzx hzxVar, TrackingListProperties$Styles trackingListProperties$Styles) {
        this.a = str;
        this.b = hzxVar;
        this.c = trackingListProperties$Styles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i601)) {
            return false;
        }
        i601 i601Var = (i601) obj;
        return jl40.l(this.a, i601Var.a) && jl40.l(this.b, i601Var.b) && this.c == i601Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        hzx hzxVar = this.b;
        return this.c.hashCode() + ((hashCode + (hzxVar != null ? hzxVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TrackingListProperties(filter=" + this.a + ", layout=" + this.b + ", style=" + this.c + Extension.C_BRAKE;
    }
}
