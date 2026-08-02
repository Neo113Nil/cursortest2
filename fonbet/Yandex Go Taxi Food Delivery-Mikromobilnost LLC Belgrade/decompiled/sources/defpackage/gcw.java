package defpackage;

import kotlinx.serialization.json.b;

/* loaded from: classes5.dex */
public final class gcw {
    public final String a;
    public final String b;
    public final b c;
    public final zzs d;

    public gcw(String str, String str2, b bVar, zzs zzsVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcw)) {
            return false;
        }
        gcw gcwVar = (gcw) obj;
        return jl40.l(this.a, gcwVar.a) && jl40.l(this.b, gcwVar.b) && jl40.l(this.c, gcwVar.c) && jl40.l(this.d, gcwVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        b bVar = this.c;
        int hashCode = (b + (bVar == null ? 0 : bVar.hashCode())) * 31;
        zzs zzsVar = this.d;
        return hashCode + (zzsVar != null ? zzsVar.hashCode() : 0);
    }
}
