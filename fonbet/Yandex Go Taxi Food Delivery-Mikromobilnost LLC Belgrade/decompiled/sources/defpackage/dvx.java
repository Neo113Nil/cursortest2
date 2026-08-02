package defpackage;

import java.util.Objects;

/* loaded from: classes9.dex */
public final class dvx {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public dvx(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
    }

    public final boolean a() {
        return this.b && this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dvx.class.equals(obj.getClass())) {
            dvx dvxVar = (dvx) obj;
            if (jl40.l(this.a, dvxVar.a) && jl40.l(this.e, dvxVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.e) * 32) + Objects.hashCode(this.a);
    }
}
