package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class kci {
    public final int a;
    public final jci b;
    public final sti c;
    public final List d;

    public kci(int i, jci jciVar, sti stiVar, List list) {
        this.a = i;
        this.b = jciVar;
        this.c = stiVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kci)) {
            return false;
        }
        kci kciVar = (kci) obj;
        return this.a == kciVar.a && this.b.equals(kciVar.b) && jl40.l(this.c, kciVar.c) && this.d.equals(kciVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DeliveryIntervalsOption(index=" + this.a + ", summaryListItem=" + this.b + ", intervalsScreen=" + this.c + ", slots=" + this.d + Extension.C_BRAKE;
    }
}
