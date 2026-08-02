package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class b5f {
    public final String a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b5f(int i, Set set) {
        this("", r7 != 0 ? r3 : set, r3, r3, r3);
        int i2 = i & 2;
        EmptySet emptySet = EmptySet.a;
    }

    public static b5f a(b5f b5fVar, String str, Set set, Set set2, int i) {
        if ((i & 1) != 0) {
            str = b5fVar.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            set = b5fVar.b;
        }
        Set set3 = set;
        Set set4 = b5fVar.c;
        if ((i & 8) != 0) {
            set2 = b5fVar.d;
        }
        return new b5f(str2, set3, set4, set2, b5fVar.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5f)) {
            return false;
        }
        b5f b5fVar = (b5f) obj;
        return jl40.l(this.a, b5fVar.a) && jl40.l(this.b, b5fVar.b) && jl40.l(this.c, b5fVar.c) && jl40.l(this.d, b5fVar.d) && jl40.l(this.e, b5fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + g8e.e(this.d, g8e.e(this.c, g8e.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderChangedParams(name=");
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

    public b5f() {
        this(31, null);
    }

    public b5f(String str, Set set, Set set2, Set set3, Set set4) {
        this.a = str;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = set4;
    }
}
