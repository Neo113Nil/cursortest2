package xsna;

import java.util.ArrayList;

/* compiled from: GapComposer.kt */
/* loaded from: classes11.dex */
public final class ygt {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final pg50<dlu> e;
    public final bpn0 f;

    public ygt(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            gxc0.a("Invalid start index");
        }
        this.d = new ArrayList();
        pg50<dlu> pg50Var = new pg50<>((Object) null);
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ldy ldyVar = (ldy) this.a.get(i3);
            int i4 = ldyVar.c;
            int i5 = ldyVar.d;
            pg50Var.k(i4, new dlu(i3, i2, i5));
            i2 += i5;
        }
        this.e = pg50Var;
        this.f = new bpn0(new xgt(this));
    }

    public final boolean a(int i, int i2) {
        int i3;
        pg50<dlu> pg50Var = this.e;
        dlu b = pg50Var.b(i);
        if (b == null) {
            return false;
        }
        int i4 = b.b;
        int i5 = i2 - b.c;
        b.c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = pg50Var.c;
        long[] jArr = pg50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        dlu dluVar = (dlu) objArr[(i6 << 3) + i8];
                        if (dluVar.b >= i4 && !dluVar.equals(b) && (i3 = dluVar.b + i5) >= 0) {
                            dluVar.b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
