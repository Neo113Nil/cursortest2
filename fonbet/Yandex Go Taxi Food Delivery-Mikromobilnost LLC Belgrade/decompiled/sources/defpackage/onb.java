package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class onb implements qnb {
    public final vz01 a;
    public final CharSequence b;
    public final List c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public onb() {
        this(new vz01(null, 0 == true ? 1 : 0, 31), "", EmptyList.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onb)) {
            return false;
        }
        onb onbVar = (onb) obj;
        return jl40.l(this.a, onbVar.a) && jl40.l(this.b, onbVar.b) && jl40.l(this.c, onbVar.c) && jl40.l(this.d, onbVar.d);
    }

    public final int hashCode() {
        int c = unr0.c(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseDirectionUIState(transport=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", directions=");
        return n.l(", startingStopId=", this.d, Extension.C_BRAKE, sb, this.c);
    }

    public onb(vz01 vz01Var, CharSequence charSequence, List list, String str) {
        this.a = vz01Var;
        this.b = charSequence;
        this.c = list;
        this.d = str;
    }
}
