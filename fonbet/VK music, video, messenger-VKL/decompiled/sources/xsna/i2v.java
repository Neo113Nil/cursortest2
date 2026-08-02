package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: HexFormat.kt */
/* loaded from: classes8.dex */
public final class i2v {
    public static final i2v c = new i2v(a.c, b.b);
    public final a a;
    public final b b;

    /* compiled from: HexFormat.kt */
    public static final class a {
        public static final a c = new a();
        public final boolean a = true;
        public final boolean b = true;

        public a() {
            if (nr2.j("  ") || nr2.j("") || nr2.j("")) {
                return;
            }
            nr2.j("");
        }

        public final void a(String str, StringBuilder sb) {
            nyh0.a(Integer.MAX_VALUE, str, "bytesPerLine = ", StringUtils.COMMA, sb);
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(Integer.MAX_VALUE);
            sb.append(StringUtils.COMMA);
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
            n6j.b(sb, str, "bytePrefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append("");
            sb.append("\"");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(\n");
            a("    ", sb);
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: HexFormat.kt */
    public static final class b {
        public static final b b = new b();
        public final boolean a = true;

        public b() {
            if (nr2.j("")) {
                return;
            }
            nr2.j("");
        }

        public final void a(String str, StringBuilder sb) {
            n6j.b(sb, str, "prefix = \"", "", "\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append("");
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(false);
            sb.append(',');
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(1);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(\n");
            a("    ", sb);
            sb.append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    public i2v(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final String toString() {
        StringBuilder e = fw3.e("HexFormat(\n    upperCase = false,\n    bytes = BytesHexFormat(\n");
        this.a.a("        ", e);
        e.append('\n');
        e.append("    ),");
        e.append('\n');
        e.append("    number = NumberHexFormat(");
        e.append('\n');
        this.b.a("        ", e);
        e.append('\n');
        e.append("    )");
        e.append('\n');
        e.append(")");
        return e.toString();
    }
}
