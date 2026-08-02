package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class gks0 {
    public static final fks0 Companion = new fks0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(16))};
    public final tg2 a;

    public /* synthetic */ gks0(int i, tg2 tg2Var) {
        if (1 == (i & 1)) {
            this.a = tg2Var;
        } else {
            qje.Z(i, 1, eks0.a.getDescriptor());
            throw null;
        }
    }

    public final tg2 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gks0.class == obj.getClass() && jl40.l(this.a, ((gks0) obj).a);
    }

    public final int hashCode() {
        tg2 tg2Var = this.a;
        if (tg2Var != null) {
            return tg2Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Animations(onShow=" + this.a + Extension.C_BRAKE;
    }
}
