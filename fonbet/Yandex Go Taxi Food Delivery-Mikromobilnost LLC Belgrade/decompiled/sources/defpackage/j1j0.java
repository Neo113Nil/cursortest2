package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class j1j0 extends kr {
    public static final i1j0 Companion = new i1j0();
    public static final i3y[] f;
    public final String a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, a.b(lazyThreadSafetyMode, new lqi0(16)), a.b(lazyThreadSafetyMode, new lqi0(17)), a.b(lazyThreadSafetyMode, new lqi0(18)), a.b(lazyThreadSafetyMode, new lqi0(19))};
    }

    public /* synthetic */ j1j0(int i, String str, Set set, Set set2, Set set3, Set set4) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, h1j0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        int i2 = i & 2;
        EmptySet emptySet = EmptySet.a;
        if (i2 == 0) {
            this.b = emptySet;
        } else {
            this.b = set;
        }
        if ((i & 4) == 0) {
            this.c = emptySet;
        } else {
            this.c = set2;
        }
        if ((i & 8) == 0) {
            this.d = emptySet;
        } else {
            this.d = set3;
        }
        if ((i & 16) == 0) {
            this.e = emptySet;
        } else {
            this.e = set4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1j0.class != obj.getClass()) {
            return false;
        }
        j1j0 j1j0Var = (j1j0) obj;
        return jl40.l(this.a, j1j0Var.a) && jl40.l(this.b, j1j0Var.b) && jl40.l(this.c, j1j0Var.c) && jl40.l(this.d, j1j0Var.d) && jl40.l(this.e, j1j0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + g8e.e(this.d, g8e.e(this.c, g8e.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplaceSnippetsAction(sectionId=");
        sb.append(this.a);
        sb.append(", hideSnippetIds=");
        sb.append(this.b);
        sb.append(", hideSnippetTags=");
        sb.append(this.c);
        sb.append(", showSnippetIds=");
        sb.append(this.d);
        sb.append(", showSnippetTags=");
        return vfc.q(sb, this.e, Extension.C_BRAKE);
    }
}
