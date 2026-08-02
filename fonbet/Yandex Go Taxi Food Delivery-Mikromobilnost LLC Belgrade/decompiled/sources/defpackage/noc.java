package defpackage;

@gsq0
/* loaded from: classes5.dex */
public final class noc implements jmx {
    public static final moc Companion = new moc();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ noc(String str, String str2, String str3, String str4, int i, String str5) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, loc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    @Override // defpackage.jmx
    public final String a() {
        return this.a;
    }

    @Override // defpackage.jmx
    public final String getService() {
        return this.b;
    }

    public noc(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = str3;
        this.e = str4;
    }

    public /* synthetic */ noc(String str, String str2) {
        this(str, str2, null, null);
    }
}
