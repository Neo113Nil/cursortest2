package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class be40 {
    public final CharSequence a;
    public final CharSequence b;
    public final List c;

    public be40(CharSequence charSequence, CharSequence charSequence2, List list) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be40)) {
            return false;
        }
        be40 be40Var = (be40) obj;
        return jl40.l(this.a, be40Var.a) && jl40.l(this.b, be40Var.b) && jl40.l(this.c, be40Var.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ly3.s(vfc.r(this.a, this.b, "MtTrainConditionInfoDialogData(title=", ", buttonTitle=", ", items="), this.c, Extension.C_BRAKE);
    }

    public be40() {
        this(null, null, EmptyList.a);
    }
}
