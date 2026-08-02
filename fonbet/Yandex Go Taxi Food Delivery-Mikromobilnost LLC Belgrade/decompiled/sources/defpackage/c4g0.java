package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes10.dex */
public final class c4g0 {
    public static final b4g0 Companion = new b4g0();
    public static final i3y[] d;
    public final boolean a;
    public final Set b;
    public final Set c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new pmf0(26)), a.b(lazyThreadSafetyMode, new pmf0(27))};
    }

    public /* synthetic */ c4g0(int i, Set set, Set set2, boolean z) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, a4g0.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = set;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4g0)) {
            return false;
        }
        c4g0 c4g0Var = (c4g0) obj;
        return this.a == c4g0Var.a && jl40.l(this.b, c4g0Var.b) && jl40.l(this.c, c4g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g8e.e(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushSettingsParam(enabledBySystem=");
        sb.append(this.a);
        sb.append(", includedTags=");
        sb.append(this.b);
        sb.append(", excludedTags=");
        return vfc.q(sb, this.c, Extension.C_BRAKE);
    }

    public c4g0(Set set, Set set2, boolean z) {
        this.a = z;
        this.b = set;
        this.c = set2;
    }
}
