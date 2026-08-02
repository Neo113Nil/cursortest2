package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class d3u {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;

    public d3u(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3u)) {
            return false;
        }
        d3u d3uVar = (d3u) obj;
        return jl40.l(this.a, d3uVar.a) && this.b.equals(d3uVar.b) && this.c.equals(d3uVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b64.n(Extension.C_BRAKE, x4e.m("GroupedRequirements(tariffClass=", this.a, ", requirements=", ", forceTopRequirements=", this.b), this.c);
    }
}
