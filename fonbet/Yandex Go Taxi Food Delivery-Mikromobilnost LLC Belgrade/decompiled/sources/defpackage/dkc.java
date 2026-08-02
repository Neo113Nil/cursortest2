package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class dkc {
    public static final ckc Companion = new ckc();
    public static final i3y[] e;
    public final String a;
    public final png b;
    public final List c;
    public final Boolean d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, a.b(lazyThreadSafetyMode, new z2c(14)), a.b(lazyThreadSafetyMode, new z2c(15)), null};
    }

    public /* synthetic */ dkc(int i, String str, png pngVar, List list, Boolean bool) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, bkc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = pngVar;
        this.c = list;
        this.d = bool;
    }

    public final String a() {
        return this.a;
    }

    public final png b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final Boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkc)) {
            return false;
        }
        dkc dkcVar = (dkc) obj;
        return jl40.l(this.a, dkcVar.a) && jl40.l(this.b, dkcVar.b) && jl40.l(this.c, dkcVar.c) && jl40.l(this.d, dkcVar.d);
    }

    public final int hashCode() {
        int c = unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        Boolean bool = this.d;
        return c + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "Payload(id=" + this.a + ", initialState=" + this.b + ", supportedDirectives=" + this.c + ", isLocal=" + this.d + Extension.C_BRAKE;
    }

    public dkc(String str, png pngVar, List list, Boolean bool) {
        this.a = str;
        this.b = pngVar;
        this.c = list;
        this.d = bool;
    }
}
