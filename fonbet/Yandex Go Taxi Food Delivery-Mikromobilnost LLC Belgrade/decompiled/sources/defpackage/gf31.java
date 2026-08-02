package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class gf31 {
    public static final ff31 Companion = new ff31();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new b931(5))};
    public final String a;
    public final Set b;

    public /* synthetic */ gf31(int i, String str, Set set) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ef31.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = set;
    }

    public static final /* synthetic */ void d(gf31 gf31Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, gf31Var.a);
        yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), gf31Var.b);
    }

    public final Set b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf31)) {
            return false;
        }
        gf31 gf31Var = (gf31) obj;
        return jl40.l(this.a, gf31Var.a) && jl40.l(this.b, gf31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VerticalMulticlassesSelection(verticalId=" + this.a + ", defaultMulticlassSelectedClasses=" + this.b + Extension.C_BRAKE;
    }

    public gf31(String str, Set set) {
        this.a = str;
        this.b = set;
    }
}
