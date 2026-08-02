package defpackage;

/* loaded from: classes.dex */
public final class b2x0 {
    public final int a;
    public final int b;
    public final int c;
    public final tls d;

    public b2x0(int i, int i2, int i3, tls tlsVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = tlsVar;
    }

    public final int a(boolean z) {
        if (this.c == 0) {
            return 0;
        }
        return z ? this.b : this.a;
    }
}
