package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class o4r {
    public final ycb0 a;
    public final String b;
    public final boolean c;

    public o4r(ycb0 ycb0Var, String str, boolean z) {
        this.a = ycb0Var;
        this.b = str;
        this.c = z;
    }

    public static o4r a(o4r o4rVar, boolean z) {
        ycb0 ycb0Var = o4rVar.a;
        String str = o4rVar.b;
        o4rVar.getClass();
        return new o4r(ycb0Var, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4r)) {
            return false;
        }
        o4r o4rVar = (o4r) obj;
        return this.a.equals(o4rVar.a) && this.b.equals(o4rVar.b) && this.c == o4rVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String a = tab0.a(this.b);
        StringBuilder sb = new StringBuilder("Item(title=");
        sb.append(this.a);
        sb.append(", filterId=");
        sb.append(a);
        sb.append(", isToggled=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
