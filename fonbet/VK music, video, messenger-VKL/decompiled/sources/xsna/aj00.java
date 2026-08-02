package xsna;

/* compiled from: ManagedRetainedValuesStore.kt */
/* loaded from: classes11.dex */
public final class aj00 implements reg0 {
    public boolean c;
    public boolean d;
    public boolean b = true;
    public final ph50<Object, Object> e = new ph50<>((Object) null);

    public final void a() {
        ph50<Object, Object> ph50Var = this.e;
        Object[] objArr = ph50Var.c;
        long[] jArr = ph50Var.a;
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
                            if (obj instanceof fh50) {
                                fh50 fh50Var = (fh50) obj;
                                Object[] objArr2 = fh50Var.a;
                                int i4 = fh50Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                    if (obj2 instanceof neg0) {
                                        ((neg0) obj2).a();
                                    }
                                }
                            } else if (obj instanceof neg0) {
                                ((neg0) obj).a();
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
        ph50Var.h();
    }
}
