package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class gxr {
    public final x400 a;
    public final List b;

    public gxr(x400 x400Var, List list) {
        this.a = x400Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxr)) {
            return false;
        }
        gxr gxrVar = (gxr) obj;
        return jl40.l(this.a, gxrVar.a) && jl40.l(this.b, gxrVar.b);
    }

    public final int hashCode() {
        x400 x400Var = this.a;
        return this.b.hashCode() + ((x400Var == null ? 0 : x400Var.hashCode()) * 31);
    }

    public final String toString() {
        return "FoldersData(mainFolderEntity=" + this.a + ", customFoldersEntities=" + this.b + Extension.C_BRAKE;
    }
}
