package defpackage;

import com.yandex.go.zone.dto.objects.VerticalMode;
import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class dk31 {
    public final List a;
    public final VerticalMode b;
    public final Zone c;
    public final Map d;

    public dk31(List list, VerticalMode verticalMode, Zone zone, Map map) {
        this.a = list;
        this.b = verticalMode;
        this.c = zone;
        this.d = map;
    }

    public static dk31 a(dk31 dk31Var, ArrayList arrayList) {
        VerticalMode verticalMode = dk31Var.b;
        Zone zone = dk31Var.c;
        Map map = dk31Var.d;
        dk31Var.getClass();
        return new dk31(arrayList, verticalMode, zone, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk31)) {
            return false;
        }
        dk31 dk31Var = (dk31) obj;
        return this.a.equals(dk31Var.a) && this.b == dk31Var.b && jl40.l(this.c, dk31Var.c) && this.d.equals(dk31Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VerticalsInfo(verticalDescriptions=" + this.a + ", verticalMode=" + this.b + ", zone=" + this.c + ", backendFormats=" + this.d + Extension.C_BRAKE;
    }
}
