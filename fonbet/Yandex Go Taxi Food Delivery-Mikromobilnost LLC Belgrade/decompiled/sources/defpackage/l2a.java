package defpackage;

@gsq0
/* loaded from: classes5.dex */
public final class l2a implements jmx {
    public static final k2a Companion = new k2a();
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;

    public /* synthetic */ l2a(int i, String str, String str2, String str3, Boolean bool) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, j2a.a.getDescriptor());
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
            this.d = bool;
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

    public l2a(String str, String str2, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = bool;
    }
}
