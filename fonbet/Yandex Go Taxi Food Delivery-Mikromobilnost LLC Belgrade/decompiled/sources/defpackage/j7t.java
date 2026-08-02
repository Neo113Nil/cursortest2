package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class j7t {
    public final String a;
    public final Set b;

    public j7t(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7t)) {
            return false;
        }
        j7t j7tVar = (j7t) obj;
        return jl40.l(this.a, j7tVar.a) && jl40.l(this.b, j7tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GetFolderAllChatsParams(query=" + this.a + ", includedChatIds=" + this.b + Extension.C_BRAKE;
    }
}
