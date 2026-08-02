package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ix41 {
    public static final ix41 d = new ix41("", "", EmptyList.a);
    public final List a;
    public final CharSequence b;
    public final CharSequence c;

    public ix41(CharSequence charSequence, CharSequence charSequence2, List list) {
        this.a = list;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix41)) {
            return false;
        }
        ix41 ix41Var = (ix41) obj;
        return this.a.equals(ix41Var.a) && jl40.l(this.b, ix41Var.b) && jl40.l(this.c, ix41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WheelDatePickerData(items=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", button=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }
}
