package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class azr0 {
    public final ArrayList a;
    public final rh4 b;
    public final int c;

    public azr0(ArrayList arrayList, rh4 rh4Var, int i) {
        this.a = arrayList;
        this.b = rh4Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azr0)) {
            return false;
        }
        azr0 azr0Var = (azr0) obj;
        return this.a.equals(azr0Var.a) && jl40.l(this.b, azr0Var.b) && this.c == azr0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rh4 rh4Var = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (rh4Var == null ? 0 : rh4Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortcutContentModel(layers=");
        sb.append(this.a);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", cornerRadius=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
