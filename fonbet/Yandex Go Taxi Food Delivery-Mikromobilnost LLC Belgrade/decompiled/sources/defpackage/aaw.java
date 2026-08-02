package defpackage;

import kotlinx.serialization.json.b;

/* loaded from: classes15.dex */
public final class aaw extends faw {
    public final String a;
    public final String b;
    public final b c;

    public aaw(String str, String str2, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaw)) {
            return false;
        }
        aaw aawVar = (aaw) obj;
        return jl40.l(this.a, aawVar.a) && jl40.l(this.b, aawVar.b) && jl40.l(this.c, aawVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        b bVar = this.c;
        return b + (bVar == null ? 0 : bVar.hashCode());
    }
}
