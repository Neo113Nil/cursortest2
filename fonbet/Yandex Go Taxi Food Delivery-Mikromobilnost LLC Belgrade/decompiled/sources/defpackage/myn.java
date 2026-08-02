package defpackage;

import android.os.Parcel;

/* loaded from: classes10.dex */
public final class myn {
    public Parcel a = Parcel.obtain();

    public final void a(byte b) {
        this.a.writeByte(b);
    }

    public final void b(float f) {
        this.a.writeFloat(f);
    }

    public final void c(long j) {
        long b = sty0.b(j);
        byte b2 = 0;
        if (!tty0.a(b, 0L)) {
            if (tty0.a(b, 4294967296L)) {
                b2 = 1;
            } else if (tty0.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        a(b2);
        if (tty0.a(sty0.b(j), 0L)) {
            return;
        }
        b(sty0.c(j));
    }

    public final void d(long j) {
        long j2 = 63 & j;
        if (Long.compareUnsigned(j2, 16L) >= 0) {
            j = (j & (-64)) | (j2 - 1);
        }
        this.a.writeLong(j);
    }
}
