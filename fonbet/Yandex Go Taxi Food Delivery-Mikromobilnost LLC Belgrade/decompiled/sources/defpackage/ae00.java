package defpackage;

/* loaded from: classes.dex */
public final class ae00 implements q0k0 {
    public boolean b;
    public boolean c;
    public boolean a = true;
    public final hz40 w = new hz40((Object) null);

    public final void a() {
        hz40 hz40Var = this.w;
        Object[] objArr = hz40Var.c;
        long[] jArr = hz40Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof xy40) {
                                xy40 xy40Var = (xy40) obj;
                                Object[] objArr2 = xy40Var.a;
                                int i4 = xy40Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        hz40Var.h();
    }
}
