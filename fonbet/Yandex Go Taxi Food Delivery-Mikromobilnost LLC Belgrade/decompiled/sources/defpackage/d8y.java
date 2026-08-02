package defpackage;

@gsq0
/* loaded from: classes9.dex */
public final class d8y {
    public static final c8y Companion = new c8y();
    public final String a;
    public final int b;
    public final long c;

    public /* synthetic */ d8y(int i, String str, int i2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, b8y.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = 0L;
    }

    public final String toString() {
        return oyr.l(this.b, "WifiNetwork(level=", ", mac='", this.a, "')");
    }

    public d8y(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }
}
