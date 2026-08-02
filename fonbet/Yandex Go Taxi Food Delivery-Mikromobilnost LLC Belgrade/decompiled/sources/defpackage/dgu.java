package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
public final class dgu {
    public static final dgu b = new dgu();
    public final boolean a = true;

    public dgu() {
        if (d1b1.a("")) {
            return;
        }
        d1b1.a("");
    }

    public final void a(String str, StringBuilder sb) {
        g8e.D(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(HexString.CHAR_COMMA);
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final boolean b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a(Extension.TAB_CHAR, sb);
        sb.append('\n');
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
