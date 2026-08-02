package xsna;

import android.os.Parcel;

/* compiled from: ClipboardUtils.android.kt */
/* loaded from: classes11.dex */
public final class mip {
    public Parcel a;

    public final void a(byte b) {
        this.a.writeByte(b);
    }

    public final void b(float f) {
        this.a.writeFloat(f);
    }

    public final void c(long j) {
        long c = fno0.c(j);
        byte b = 0;
        if (!gno0.a(c, 0L)) {
            if (gno0.a(c, 4294967296L)) {
                b = 1;
            } else if (gno0.a(c, 8589934592L)) {
                b = 2;
            }
        }
        a(b);
        if (gno0.a(fno0.c(j), 0L)) {
            return;
        }
        b(fno0.d(j));
    }
}
