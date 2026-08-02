package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.ui.stopsline.LineState;

/* loaded from: classes6.dex */
public final class diu0 implements giu0 {
    public final String a;
    public final LineState b;
    public final String c;
    public final jiu0 d;
    public final int e;

    public diu0(String str, LineState lineState, String str2, jiu0 jiu0Var, int i) {
        this.a = str;
        this.b = lineState;
        this.c = str2;
        this.d = jiu0Var;
        this.e = i;
    }

    public static diu0 c(diu0 diu0Var, jiu0 jiu0Var) {
        String str = diu0Var.a;
        LineState lineState = diu0Var.b;
        String str2 = diu0Var.c;
        int i = diu0Var.e;
        diu0Var.getClass();
        return new diu0(str, lineState, str2, jiu0Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diu0)) {
            return false;
        }
        diu0 diu0Var = (diu0) obj;
        return this.a.equals(diu0Var.a) && this.b == diu0Var.b && jl40.l(this.c, diu0Var.c) && this.d.equals(diu0Var.d) && this.e == diu0Var.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NamedChevron(id=");
        sb.append(this.a);
        sb.append(", lineState=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", itemsContainer=");
        sb.append(this.d);
        sb.append(", mainTrackingColor=");
        return oyr.m(this.e, Extension.C_BRAKE, sb);
    }
}
