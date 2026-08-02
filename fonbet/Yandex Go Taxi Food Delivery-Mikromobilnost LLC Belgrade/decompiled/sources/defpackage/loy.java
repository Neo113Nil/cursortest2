package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class loy {
    public static final loy e = new loy(0);
    public final boolean a;
    public final sny b;
    public final String c;
    public final String d;

    public loy(boolean z, sny snyVar, String str, String str2) {
        this.a = z;
        this.b = snyVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loy)) {
            return false;
        }
        loy loyVar = (loy) obj;
        return this.a == loyVar.a && jl40.l(this.b, loyVar.b) && jl40.l(this.c, loyVar.c) && jl40.l(this.d, loyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedOrderNotification(visible=");
        sb.append(this.a);
        sb.append(", orderKey=");
        sb.append(this.b);
        sb.append(", title=");
        return g8e.r(sb, this.c, ", subtitle=", this.d, Extension.C_BRAKE);
    }

    public loy() {
        this(0);
    }

    public /* synthetic */ loy(int i) {
        this(false, sny.c, "", "");
    }
}
