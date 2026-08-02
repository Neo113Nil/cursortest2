package defpackage;

/* loaded from: classes11.dex */
public final class kcr {
    public String a;
    public String b;
    public String c;
    public String d;

    public final lcr a() {
        return new lcr(this.b, this.a, null, null, this.c, null, this.d);
    }

    public final void b(String str) {
        cvw.j(str, "ApiKey must be set.");
        this.a = str;
    }

    public final void c(String str) {
        cvw.j(str, "ApplicationId must be set.");
        this.b = str;
    }

    public final void d(String str) {
        this.c = str;
    }

    public final void e(String str) {
        this.d = str;
    }
}
