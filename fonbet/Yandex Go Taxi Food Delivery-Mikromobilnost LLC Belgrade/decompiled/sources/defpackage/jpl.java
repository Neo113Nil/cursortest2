package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jpl extends gc5 {
    public final ctu0 c;
    public final rr51 d;
    public final String e;
    public final kpl f;
    public final List g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jpl(ctu0 ctu0Var, rr51 rr51Var, kpl kplVar, ArrayList arrayList, int i) {
        super(r0, 2);
        String str = rr51Var.e;
        kplVar = (i & 8) != 0 ? null : kplVar;
        List list = (i & 16) != 0 ? EmptyList.a : arrayList;
        this.c = ctu0Var;
        this.d = rr51Var;
        this.e = str;
        this.f = kplVar;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpl)) {
            return false;
        }
        jpl jplVar = (jpl) obj;
        return this.c.equals(jplVar.c) && jl40.l(this.d, jplVar.d) && this.e.equals(jplVar.e) && jl40.l(this.f, jplVar.f) && this.g.equals(jplVar.g);
    }

    public final int hashCode() {
        int b = unr0.b((this.d.hashCode() + (this.c.a.hashCode() * 31)) * 31, 31, this.e);
        kpl kplVar = this.f;
        return this.g.hashCode() + ((b + (kplVar == null ? 0 : kplVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivViewItem(type=");
        sb.append(this.c);
        sb.append(", divData=");
        sb.append(this.d);
        sb.append(", id=");
        sb.append(this.e);
        sb.append(", payload=");
        sb.append(this.f);
        sb.append(", localVariables=");
        return ly3.s(sb, this.g, Extension.C_BRAKE);
    }
}
