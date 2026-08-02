package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class kc7 {
    public final Object a;
    public final jc7 b;
    public final boolean c;
    public final ArrayList d;

    public kc7(Object obj, jc7 jc7Var, boolean z, ArrayList arrayList) {
        this.a = obj;
        this.b = jc7Var;
        this.c = z;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kc7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kc7 kc7Var = (kc7) obj;
        return this.a.equals(kc7Var.a) && this.b.equals(kc7Var.b) && this.c == kc7Var.c && this.d.equals(kc7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "CacheResult(resource=" + this.a + ", lifetime=" + this.b + ", staleIfError=" + this.c + ", parts=" + this.d + Extension.C_BRAKE;
    }
}
