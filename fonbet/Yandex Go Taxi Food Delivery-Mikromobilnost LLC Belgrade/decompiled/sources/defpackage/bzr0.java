package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bzr0 {
    public final List a;
    public final zh4 b;
    public final float c;

    public bzr0(List list, zh4 zh4Var, float f) {
        this.a = list;
        this.b = zh4Var;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzr0)) {
            return false;
        }
        bzr0 bzr0Var = (bzr0) obj;
        return jl40.l(this.a, bzr0Var.a) && jl40.l(this.b, bzr0Var.b) && y7m.b(this.c, bzr0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zh4 zh4Var = this.b;
        return Float.hashCode(this.c) + ((hashCode + (zh4Var == null ? 0 : zh4Var.hashCode())) * 31);
    }

    public final String toString() {
        String c = y7m.c(this.c);
        StringBuilder sb = new StringBuilder("ShortcutContentUiModel(layers=");
        sb.append(this.a);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", cornerRadius=");
        return oyr.t(sb, c, Extension.C_BRAKE);
    }
}
