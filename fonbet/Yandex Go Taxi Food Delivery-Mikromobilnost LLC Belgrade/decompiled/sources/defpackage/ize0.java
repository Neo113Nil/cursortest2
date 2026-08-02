package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ize0 implements kze0 {
    public final CharSequence a;
    public final wp2 b;
    public final boolean c;
    public final String d;

    public ize0(CharSequence charSequence, wp2 wp2Var, boolean z, String str) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ize0)) {
            return false;
        }
        ize0 ize0Var = (ize0) obj;
        if (!jl40.l(this.a, ize0Var.a) || !jl40.l(this.b, ize0Var.b) || Float.compare(0.5f, 0.5f) != 0 || this.c != ize0Var.c) {
            return false;
        }
        bdu bduVar = bdu.a;
        return bduVar.equals(bduVar) && jl40.l(this.d, ize0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((Boolean.hashCode(this.c) + g8e.c(0.5f, n.b(this.b, this.a.hashCode() * 31, 31), 31)) * 31) - 404947013) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultUiState(text=");
        sb.append((Object) this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", textAlpha=0.5, isShimmering=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(bdu.a);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.d, Extension.C_BRAKE);
    }
}
