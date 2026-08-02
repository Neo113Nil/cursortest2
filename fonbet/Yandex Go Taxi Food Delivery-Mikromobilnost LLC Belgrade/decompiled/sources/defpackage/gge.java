package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class gge {
    public final sls a;
    public final j18 b;

    public gge(j18 j18Var, sls slsVar) {
        this.a = slsVar;
        this.b = j18Var;
    }

    public final String toString() {
        j18 j18Var = this.b;
        pse pseVar = (pse) j18Var.x.get(pse.b);
        String str = pseVar != null ? pseVar.a : null;
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        rza.a(16);
        sb.append(Integer.toString(hashCode, 16));
        sb.append(str != null ? oyr.p("[", str, "](") : Extension.O_BRAKE);
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(j18Var);
        sb.append(')');
        return sb.toString();
    }
}
