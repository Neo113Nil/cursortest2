package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class egu {
    public static final egu c = new egu(cgu.c, dgu.b);
    public final cgu a;
    public final dgu b;

    public egu(cgu cguVar, dgu dguVar) {
        this.a = cguVar;
        this.b = dguVar;
    }

    public final cgu a() {
        return this.a;
    }

    public final dgu b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder t = qv10.t("HexFormat(\n    upperCase = false,\n    bytes = BytesHexFormat(\n");
        this.a.a("        ", t);
        t.append('\n');
        t.append("    ),");
        t.append('\n');
        t.append("    number = NumberHexFormat(");
        t.append('\n');
        this.b.a("        ", t);
        t.append('\n');
        t.append("    )");
        t.append('\n');
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
