package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kfj {
    public final CharSequence a;
    public final wp2 b;
    public final wp2 c;
    public final agj d;

    public kfj(CharSequence charSequence, wp2 wp2Var, wp2 wp2Var2, agj agjVar) {
        this.a = charSequence;
        this.b = wp2Var;
        this.c = wp2Var2;
        this.d = agjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfj)) {
            return false;
        }
        kfj kfjVar = (kfj) obj;
        return jl40.l(this.a, kfjVar.a) && jl40.l(this.b, kfjVar.b) && jl40.l(this.c, kfjVar.c) && this.d.equals(kfjVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + n.b(this.c, n.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DialogueButtonUiState(text=" + ((Object) this.a) + ", textAppColor=" + this.b + ", bgAppColor=" + this.c + ", dialogueUiAction=" + this.d + Extension.C_BRAKE;
    }
}
