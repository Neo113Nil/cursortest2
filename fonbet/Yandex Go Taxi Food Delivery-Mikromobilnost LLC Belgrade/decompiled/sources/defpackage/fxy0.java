package defpackage;

import android.content.Context;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fxy0 {
    public final Object a;
    public final Object b;

    public fxy0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object a(Context context) {
        return lob1.f(context) ? this.a : this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxy0)) {
            return false;
        }
        fxy0 fxy0Var = (fxy0) obj;
        return jl40.l(this.a, fxy0Var.a) && jl40.l(this.b, fxy0Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ThemedEntity(dark=" + this.a + ", light=" + this.b + Extension.C_BRAKE;
    }
}
