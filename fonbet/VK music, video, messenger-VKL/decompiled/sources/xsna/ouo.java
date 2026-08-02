package xsna;

import java.util.ArrayList;

/* compiled from: EasterEggPosition.kt */
/* loaded from: classes18.dex */
public final class ouo {
    public final String a;
    public final puo b;
    public final ArrayList c;
    public final int d;

    public ouo(String str, puo puoVar, ArrayList arrayList, int i) {
        this.a = str;
        this.b = puoVar;
        this.c = arrayList;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouo)) {
            return false;
        }
        ouo ouoVar = (ouo) obj;
        return epx.f(this.a, ouoVar.a) && this.b.equals(ouoVar.b) && this.c.equals(ouoVar.c) && this.d == ouoVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qr.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EasterEggPosition(navScreen=");
        sb.append(this.a);
        sb.append(", appearance=");
        sb.append(this.b);
        sb.append(", constraints=");
        sb.append(this.c);
        sb.append(", positionId=");
        return vu5.b(sb, this.d, ')');
    }
}
