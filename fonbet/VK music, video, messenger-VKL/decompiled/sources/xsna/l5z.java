package xsna;

/* compiled from: LifecycleRetainedValuesStoreOwner.android.kt */
/* loaded from: classes11.dex */
public final class l5z extends nyt0 {
    public final pg50<fh50<b>> b = g9x.a();

    /* compiled from: LifecycleRetainedValuesStoreOwner.android.kt */
    public interface a {
        qq9 a(m5z m5zVar);
    }

    /* compiled from: LifecycleRetainedValuesStoreOwner.android.kt */
    public static final class b {
        public final m0g0 a;
        public final m0g0 b;
        public boolean c;
        public qq9 d;

        public b() {
            m0g0 m0g0Var = new m0g0(5);
            this.a = m0g0Var;
            this.b = m0g0Var;
        }
    }

    @Override // xsna.nyt0
    public final void h() {
        pg50<fh50<b>> pg50Var = this.b;
        int[] iArr = pg50Var.b;
        Object[] objArr = pg50Var.c;
        long[] jArr = pg50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8;
                int i3 = 8 - ((~(i - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        fh50 fh50Var = (fh50) objArr[i5];
                        Object[] objArr2 = fh50Var.a;
                        int i7 = fh50Var.b;
                        int i8 = 0;
                        while (i8 < i7) {
                            b bVar = (b) objArr2[i8];
                            int i9 = i2;
                            qq9 qq9Var = bVar.d;
                            if (qq9Var != null) {
                                qq9Var.cancel();
                            }
                            bVar.d = null;
                            aj00 aj00Var = (aj00) bVar.a.b;
                            aj00Var.c = true;
                            aj00Var.b = false;
                            aj00Var.a();
                            i8++;
                            i2 = i9;
                        }
                    }
                    int i10 = i2;
                    j >>= i10;
                    i4++;
                    i2 = i10;
                }
                if (i3 != i2) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
