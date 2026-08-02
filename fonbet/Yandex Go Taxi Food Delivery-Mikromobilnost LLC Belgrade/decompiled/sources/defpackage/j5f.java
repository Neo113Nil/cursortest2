package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class j5f {
    public final String a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;

    public j5f(String str, Set set, Set set2, Set set3, Set set4) {
        this.a = str;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = set4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5f)) {
            return false;
        }
        j5f j5fVar = (j5f) obj;
        return jl40.l(this.a, j5fVar.a) && jl40.l(this.b, j5fVar.b) && jl40.l(this.c, j5fVar.c) && jl40.l(this.d, j5fVar.d) && jl40.l(this.e, j5fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + g8e.e(this.d, g8e.e(this.c, g8e.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateFolderParams(name=");
        sb.append(this.a);
        sb.append(", includedChatIds=");
        sb.append(this.b);
        sb.append(", excludedChatIds=");
        sb.append(this.c);
        sb.append(", includedFilterIds=");
        sb.append(this.d);
        sb.append(", excludedFilterIds=");
        return vfc.q(sb, this.e, Extension.C_BRAKE);
    }
}
