package xsna;

/* compiled from: HttpUrlCall.kt */
/* loaded from: classes15.dex */
public final class tkv {
    public final String a;
    public final boolean b;

    public tkv(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public tkv(String str, long j, boolean z) {
        this.a = str;
        this.b = z;
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Illegal url value: ".concat(str));
        }
    }

    public /* synthetic */ tkv(String str, boolean z, int i) {
        this(str, (i & 2) != 0 ? 0L : 3000L, (i & 8) != 0 ? false : z);
    }
}
