package defpackage;

/* loaded from: classes4.dex */
public final class iid extends eid {
    public final boolean c;

    public iid(xrw xrwVar, boolean z) {
        super(xrwVar);
        this.c = z;
    }

    @Override // defpackage.eid
    public final void d(byte b) {
        if (this.c) {
            j(String.valueOf(b & 255));
        } else {
            h(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.eid
    public final void f(int i) {
        boolean z = this.c;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            j(unsignedString);
        } else {
            h(unsignedString);
        }
    }

    @Override // defpackage.eid
    public final void g(long j) {
        boolean z = this.c;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            j(unsignedString);
        } else {
            h(unsignedString);
        }
    }

    @Override // defpackage.eid
    public final void i(short s) {
        if (this.c) {
            j(String.valueOf(s & 65535));
        } else {
            h(String.valueOf(s & 65535));
        }
    }
}
