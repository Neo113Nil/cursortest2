package defpackage;

/* loaded from: classes11.dex */
public final class h0n {
    public final int a;
    public final long b;

    public h0n(int i, long j) {
        if (j < 0) {
            w511.q();
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public static h0n a(w971 w971Var, dl81 dl81Var) {
        w971Var.I(dl81Var.a, 0, 8, false);
        dl81Var.m(0);
        return new h0n(false, dl81Var.a(), dl81Var.l());
    }

    public static h0n c(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j = (j * 10) + (charAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new h0n(j, i3);
    }

    public static h0n d(c5p c5pVar, ef90 ef90Var) {
        c5pVar.g(0, 8, ef90Var.a);
        ef90Var.K(0);
        return new h0n(false, ef90Var.k(), ef90Var.p());
    }

    public boolean b() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public /* synthetic */ h0n(boolean z, int i, long j) {
        this.a = i;
        this.b = j;
    }

    public /* synthetic */ h0n(long j, int i) {
        this.b = j;
        this.a = i;
    }
}
