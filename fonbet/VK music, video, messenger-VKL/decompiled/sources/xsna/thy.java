package xsna;

import java.util.Arrays;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes11.dex */
public final class thy<T> implements aoo<T> {
    public final b<T> a;

    /* compiled from: AnimationSpec.kt */
    public static final class a<T> extends z9 {
        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(aVar.a, this.a) && epx.f((huo) aVar.b, (huo) this.b);
        }

        public final int hashCode() {
            Object obj = this.a;
            return ((huo) this.b).hashCode() + shy.a(0, (obj != null ? obj.hashCode() : 0) * 31, 31);
        }
    }

    /* compiled from: AnimationSpec.kt */
    public static final class b<T> extends uhy<T, a<T>> {
        public final a a(int i, Object obj) {
            a aVar = new a(obj, luo.d);
            this.b.k(i, aVar);
            return aVar;
        }
    }

    public thy(b<T> bVar) {
        this.a = bVar;
    }

    @Override // xsna.phr, xsna.iq2
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final <V extends wq2> cmr0<V> a(itp0<T, V> itp0Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        b<T> bVar = this.a;
        f9x f9xVar = bVar.b;
        ng50 ng50Var = new ng50(f9xVar.e + 2);
        pg50 pg50Var = new pg50(f9xVar.e);
        int[] iArr3 = f9xVar.b;
        Object[] objArr3 = f9xVar.c;
        long[] jArr = f9xVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            i = i3;
                            a aVar = (a) objArr3[i6];
                            ng50Var.c(i7);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            pg50Var.k(i7, new bmr0((wq2) itp0Var.a().invoke(aVar.a), (huo) aVar.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        iArr3 = iArr2;
                        i3 = i;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!f9xVar.a(0)) {
            int i8 = ng50Var.b;
            if (i8 < 0) {
                alk.D("Index must be between 0 and size");
                throw null;
            }
            ng50Var.d(i8 + 1);
            int[] iArr4 = ng50Var.a;
            int i9 = ng50Var.b;
            if (i9 != 0) {
                jw5.e(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            ng50Var.b++;
        }
        if (!f9xVar.a(bVar.a)) {
            ng50Var.c(bVar.a);
        }
        int i10 = ng50Var.b;
        if (i10 != 0) {
            Arrays.sort(ng50Var.a, 0, i10);
        }
        return new cmr0<>(ng50Var, pg50Var, bVar.a, luo.d);
    }
}
