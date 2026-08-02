package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class jsg {
    public final int a;
    public final Text b;
    public final boolean c;

    public jsg(int i, Text text, boolean z) {
        this.a = i;
        this.b = text;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsg)) {
            return false;
        }
        jsg jsgVar = (jsg) obj;
        return this.a == jsgVar.a && this.b.equals(jsgVar.b) && this.c == jsgVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + n.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DayEntity(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
