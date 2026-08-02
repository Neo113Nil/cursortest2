package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class khu0 {
    public final CharSequence a;
    public final List b;
    public final efu0 c;
    public final String d;

    public khu0(String str, List list, efu0 efu0Var, String str2) {
        this.a = str;
        this.b = list;
        this.c = efu0Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khu0)) {
            return false;
        }
        khu0 khu0Var = (khu0) obj;
        return jl40.l(this.a, khu0Var.a) && jl40.l(this.b, khu0Var.b) && jl40.l(this.c, khu0Var.c) && jl40.l(this.d, khu0Var.d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int c = unr0.c((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
        efu0 efu0Var = this.c;
        int hashCode = (c + (efu0Var == null ? 0 : efu0Var.hashCode())) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "StopSelectorData(title=" + ((Object) this.a) + ", stops=" + this.b + ", selectedStop=" + this.c + ", propertyName=" + this.d + Extension.C_BRAKE;
    }

    public khu0() {
        this(0);
    }

    public /* synthetic */ khu0(int i) {
        this(null, EmptyList.a, null, null);
    }
}
