package defpackage;

import kotlin.text.Regex;

/* loaded from: classes15.dex */
public final class ijf0 extends m5j0 {
    public final byte[] b;
    public final String c;
    public final but0 d;
    public final int e;

    public ijf0(byte[] bArr, String str, but0 but0Var) {
        this.b = bArr;
        this.c = str;
        this.d = but0Var;
        this.e = bArr.length;
    }

    @Override // defpackage.m5j0
    public final long a() {
        return this.e;
    }

    @Override // defpackage.m5j0
    public final wg10 b() {
        Regex regex = wg10.e;
        try {
            return qje.o(this.c);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.m5j0
    public final void d(oq6 oq6Var) {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i >= bArr.length) {
                return;
            }
            int min = Math.min(2048, this.e - i);
            oq6Var.n2(i, min, bArr);
            i += min;
            this.d.invoke(Integer.valueOf(i), Integer.valueOf(bArr.length));
        }
    }
}
