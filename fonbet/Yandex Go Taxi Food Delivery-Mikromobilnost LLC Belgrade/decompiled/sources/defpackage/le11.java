package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class le11 {
    public static final ke11 Companion = new ke11();
    public static final i3y[] c;
    public final v5x a;
    public final kr b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new z411(23)), a.b(lazyThreadSafetyMode, new z411(24))};
    }

    public /* synthetic */ le11(int i, v5x v5xVar, kr krVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, je11.a.getDescriptor());
            throw null;
        }
        this.a = v5xVar;
        this.b = krVar;
    }

    public final kr a() {
        return this.b;
    }

    public final v5x b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!le11.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        le11 le11Var = (le11) obj;
        return jl40.l(this.a, le11Var.a) && jl40.l(this.b, le11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Trigger2(condition=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
