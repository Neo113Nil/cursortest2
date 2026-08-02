package defpackage;

/* loaded from: classes11.dex */
public final class n9s {
    public static final n9s d = new n9s("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new n9s("\n", "  ", true);
    }

    public n9s(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            ny61.g("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            ny61.g("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
