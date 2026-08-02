package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kdw0 implements mdw0 {
    public final LinkedHashMap a;
    public final ArrayList b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Integer h;

    public kdw0(LinkedHashMap linkedHashMap, ArrayList arrayList, String str, long j, long j2, long j3, long j4, Integer num) {
        this.a = linkedHashMap;
        this.b = arrayList;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdw0)) {
            return false;
        }
        kdw0 kdw0Var = (kdw0) obj;
        return this.a.equals(kdw0Var.a) && this.b.equals(kdw0Var.b) && jl40.l(this.c, kdw0Var.c) && this.d == kdw0Var.d && this.e == kdw0Var.e && this.f == kdw0Var.f && this.g == kdw0Var.g && jl40.l(this.h, kdw0Var.h);
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int c = qv10.c(qv10.c(qv10.c(qv10.c((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        Integer num = this.h;
        return c + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Animated(items=");
        sb.append(this.a);
        sb.append(", keyframes=");
        sb.append(this.b);
        sb.append(", accessibilityText=");
        ly3.y(this.d, this.c, ", hideDelay=", sb);
        x4e.A(this.e, ", hideDuration=", ", showDelay=", sb);
        sb.append(this.f);
        x4e.A(this.g, ", showDuration=", ", repeatCount=", sb);
        return oo31.j(sb, this.h, Extension.C_BRAKE);
    }
}
