package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class b451 {
    public final LinkedHashMap a;
    public final String b;

    public b451(String str, LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b451)) {
            return false;
        }
        b451 b451Var = (b451) obj;
        return this.a.equals(b451Var.a) && jl40.l(this.b, b451Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "WidgetUpdateParams(data=" + this.a + ", widgetType=" + this.b + Extension.C_BRAKE;
    }
}
