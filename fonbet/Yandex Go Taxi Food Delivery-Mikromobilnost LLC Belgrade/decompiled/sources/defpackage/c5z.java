package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c5z {
    public final String a;
    public final String b;
    public final List c;

    public c5z(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5z)) {
            return false;
        }
        c5z c5zVar = (c5z) obj;
        return jl40.l(this.a, c5zVar.a) && jl40.l(this.b, c5zVar.b) && jl40.l(this.c, c5zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("LocalVariable(name=", this.a, ", value=", this.b, ", possibleMutations="), this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ c5z(String str, String str2) {
        this(str, str2, EmptyList.a);
    }
}
