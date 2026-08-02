package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class kwx {
    public static final jwx Companion = new jwx();
    public static final i3y[] d;
    public final boolean a;
    public final Set b;
    public final Set c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new aww(21)), a.b(lazyThreadSafetyMode, new aww(22))};
    }

    public /* synthetic */ kwx(int i, Set set, Set set2, boolean z) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, iwx.a.getDescriptor());
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
        if (!(obj instanceof kwx)) {
            return false;
        }
        kwx kwxVar = (kwx) obj;
        return this.a == kwxVar.a && jl40.l(this.b, kwxVar.b) && jl40.l(this.c, kwxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g8e.e(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchPushSettingsParam(enabledBySystem=");
        sb.append(this.a);
        sb.append(", includedTags=");
        sb.append(this.b);
        sb.append(", excludedTags=");
        return vfc.q(sb, this.c, Extension.C_BRAKE);
    }

    public kwx(Set set, Set set2, boolean z) {
        this.a = z;
        this.b = set;
        this.c = set2;
    }
}
