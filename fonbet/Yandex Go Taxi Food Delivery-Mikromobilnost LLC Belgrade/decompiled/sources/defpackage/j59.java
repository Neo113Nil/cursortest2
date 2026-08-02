package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j59 {
    public final String a;
    public final Text b;
    public final List c;

    public j59(String str, Text text, List list) {
        this.a = str;
        this.b = text;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j59)) {
            return false;
        }
        j59 j59Var = (j59) obj;
        return jl40.l(this.a, j59Var.a) && this.b.equals(j59Var.b) && jl40.l(this.c, j59Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoryEntity(key=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", settings=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
