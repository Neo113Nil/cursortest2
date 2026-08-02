package xsna;

/* compiled from: Composers.kt */
/* loaded from: classes8.dex */
public final class uri extends rri {
    public final boolean d;

    public uri(lhx lhxVar, boolean z) {
        super(lhxVar);
        this.d = z;
    }

    @Override // xsna.rri
    public final void e(byte b) {
        if (this.d) {
            k(String.valueOf(b & 255));
        } else {
            i(String.valueOf(b & 255));
        }
    }

    @Override // xsna.rri
    public final void g(int i) {
        boolean z = this.d;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            k(unsignedString);
        } else {
            i(unsignedString);
        }
    }

    @Override // xsna.rri
    public final void h(long j) {
        boolean z = this.d;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            k(unsignedString);
        } else {
            i(unsignedString);
        }
    }

    @Override // xsna.rri
    public final void j(short s) {
        if (this.d) {
            k(String.valueOf(s & 65535));
        } else {
            i(String.valueOf(s & 65535));
        }
    }
}
