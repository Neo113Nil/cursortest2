package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class d171 {
    public final lg71 a;
    public final il81 b;
    public final List c;

    public d171(lg71 lg71Var, il81 il81Var, List list) {
        this.a = lg71Var;
        this.b = il81Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d171)) {
            return false;
        }
        d171 d171Var = (d171) obj;
        return jl40.l(this.a, d171Var.a) && jl40.l(this.b, d171Var.b) && jl40.l(this.c, d171Var.c);
    }

    public final int hashCode() {
        lg71 lg71Var = this.a;
        int hashCode = (lg71Var == null ? 0 : lg71Var.hashCode()) * 31;
        il81 il81Var = this.b;
        int hashCode2 = (hashCode + (il81Var == null ? 0 : il81Var.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaValue(media=");
        sb.append(this.a);
        sb.append(", video=");
        sb.append(this.b);
        sb.append(", imageValues=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
