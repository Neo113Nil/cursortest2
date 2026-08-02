package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class egj implements ggj {
    public final rfj a;
    public final jfj b;
    public final yfj c;
    public final p4p d;
    public final String e;

    public egj(rfj rfjVar, jfj jfjVar, yfj yfjVar, p4p p4pVar, String str) {
        this.a = rfjVar;
        this.b = jfjVar;
        this.c = yfjVar;
        this.d = p4pVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egj)) {
            return false;
        }
        egj egjVar = (egj) obj;
        return this.a.equals(egjVar.a) && this.b.equals(egjVar.b) && jl40.l(this.c, egjVar.c) && this.d.equals(egjVar.d) && jl40.l(this.e, egjVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        yfj yfjVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (yfjVar == null ? 0 : yfjVar.a.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loaded(dialogueLeadUiState=");
        sb.append(this.a);
        sb.append(", dialogueBodyUiState=");
        sb.append(this.b);
        sb.append(", dialogueTrail2UiState=");
        sb.append(this.c);
        sb.append(", style=");
        sb.append(this.d);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
