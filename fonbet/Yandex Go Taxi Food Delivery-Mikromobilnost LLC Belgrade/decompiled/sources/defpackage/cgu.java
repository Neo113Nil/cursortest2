package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class cgu {
    public static final cgu c = new cgu();
    public final boolean a = true;
    public final boolean b = true;

    public cgu() {
        if (d1b1.a("  ") || d1b1.a("") || d1b1.a("")) {
            return;
        }
        d1b1.a("");
    }

    public final void a(String str, StringBuilder sb) {
        b64.A(Integer.MAX_VALUE, str, "bytesPerLine = ", ",", sb);
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        g8e.D(sb, str, "bytePrefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        a(Extension.TAB_CHAR, sb);
        sb.append('\n');
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
