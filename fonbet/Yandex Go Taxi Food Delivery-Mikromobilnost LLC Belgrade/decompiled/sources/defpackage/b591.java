package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class b591 implements r691 {
    public final boolean a;

    public b591(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.r691
    public final r691 b(String str, cr71 cr71Var, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z = this.a;
        if (equals) {
            return new a791(Boolean.toString(z));
        }
        ny61.g(unr0.o(Boolean.toString(z), Extension.DOT_CHAR, str, " is not a function."));
        return null;
    }

    @Override // defpackage.r691
    public final r691 e() {
        return new b591(Boolean.valueOf(this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b591) && this.a == ((b591) obj).a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // defpackage.r691
    public final String zzc() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.r691
    public final Double zzd() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    @Override // defpackage.r691
    public final Boolean zze() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.r691
    public final Iterator zzf() {
        return null;
    }
}
