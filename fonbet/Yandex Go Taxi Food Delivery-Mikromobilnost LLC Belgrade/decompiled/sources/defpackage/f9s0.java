package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class f9s0 extends kr {
    public static final e9s0 Companion = new e9s0();
    public static final i3y[] d;
    public final String a;
    public final Set b;
    public final Set c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new wyr0(11)), a.b(lazyThreadSafetyMode, new wyr0(12))};
    }

    public /* synthetic */ f9s0(int i, String str, Set set, Set set2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, d9s0.a.getDescriptor());
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f9s0.class != obj.getClass()) {
            return false;
        }
        f9s0 f9s0Var = (f9s0) obj;
        return jl40.l(this.a, f9s0Var.a) && jl40.l(this.b, f9s0Var.b) && jl40.l(this.c, f9s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g8e.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowSnippetsAction(sectionId=");
        sb.append(this.a);
        sb.append(", showSnippetIds=");
        sb.append(this.b);
        sb.append(", showSnippetTags=");
        return vfc.q(sb, this.c, Extension.C_BRAKE);
    }
}
