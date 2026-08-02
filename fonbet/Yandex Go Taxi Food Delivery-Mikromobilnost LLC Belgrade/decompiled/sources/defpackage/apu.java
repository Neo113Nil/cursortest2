package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class apu {
    public final Character a;
    public final boolean b;
    public final Character c;
    public final List d;
    public final boolean e;

    public /* synthetic */ apu(boolean z, Character ch, List list, int i) {
        this(null, z, (i & 4) != 0 ? null : ch, (i & 8) != 0 ? EmptyList.a : list, false);
    }

    public static apu a(apu apuVar, Character ch, int i) {
        boolean z = apuVar.b;
        Character ch2 = apuVar.c;
        List list = apuVar.d;
        boolean z2 = (i & 16) != 0 ? apuVar.e : true;
        apuVar.getClass();
        return new apu(ch, z, ch2, list, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apu)) {
            return false;
        }
        apu apuVar = (apu) obj;
        return jl40.l(this.a, apuVar.a) && this.b == apuVar.b && jl40.l(this.c, apuVar.c) && jl40.l(this.d, apuVar.d) && this.e == apuVar.e;
    }

    public final int hashCode() {
        Character ch = this.a;
        int e = unr0.e((ch == null ? 0 : ch.hashCode()) * 31, 31, this.b);
        Character ch2 = this.c;
        return Boolean.hashCode(this.e) + unr0.c((e + (ch2 != null ? ch2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Holder(symbol=");
        sb.append(this.a);
        sb.append(", isReplaceable=");
        sb.append(this.b);
        sb.append(", symbolConstant=");
        sb.append(this.c);
        sb.append(", validators=");
        sb.append(this.d);
        sb.append(", alwaysVisible=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }

    public apu(Character ch, boolean z, Character ch2, List list, boolean z2) {
        this.a = ch;
        this.b = z;
        this.c = ch2;
        this.d = list;
        this.e = z2;
    }
}
