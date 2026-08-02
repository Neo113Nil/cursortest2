package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class c301 {
    public final String a;
    public final String b;
    public final Object c;
    public final List d;
    public final ArrayList e;

    public c301(String str, String str2, Object obj, ListBuilder listBuilder, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = listBuilder;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c301)) {
            return false;
        }
        c301 c301Var = (c301) obj;
        return this.a.equals(c301Var.a) && this.b.equals(c301Var.b) && jl40.l(this.c, c301Var.c) && jl40.l(this.d, c301Var.d) && this.e.equals(c301Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        return this.e.hashCode() + unr0.c((b + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("TrackingAnalyticsData(orderId=", this.a, ", orderStatus=", this.b, ", meta=");
        v.append(this.c);
        v.append(", visibleButtons=");
        v.append(this.d);
        v.append(", dynamicContentButtons=");
        return b64.n(Extension.C_BRAKE, v, this.e);
    }
}
