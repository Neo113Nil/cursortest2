package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class he40 {
    public final CharSequence a;
    public final List b;
    public final CharSequence c;

    public he40(CharSequence charSequence, CharSequence charSequence2, List list) {
        this.a = charSequence;
        this.b = list;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he40)) {
            return false;
        }
        he40 he40Var = (he40) obj;
        return jl40.l(this.a, he40Var.a) && jl40.l(this.b, he40Var.b) && jl40.l(this.c, he40Var.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int c = unr0.c((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
        CharSequence charSequence2 = this.c;
        return c + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtTrainConditionsUiState(title=");
        sb.append((Object) this.a);
        sb.append(", conditions=");
        sb.append(this.b);
        sb.append(", applyButtonTitle=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }

    public he40() {
        this(0);
    }

    public /* synthetic */ he40(int i) {
        this(null, null, EmptyList.a);
    }
}
