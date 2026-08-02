package androidx.compose.runtime.snapshots;

import defpackage.f73;
import defpackage.fy40;
import defpackage.jl40;
import defpackage.o370;
import defpackage.tcc;
import defpackage.vng;
import defpackage.vrq0;
import defpackage.xfx;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class a implements Iterable, xfx {
    public static final a x = new a(0, 0, 0, null);
    public final long a;
    public final long b;
    public final long c;
    public final long[] w;

    public a(long j, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.w = jArr;
    }

    public final a a(a aVar) {
        long[] jArr;
        a aVar2 = this;
        a aVar3 = x;
        if (aVar == aVar3) {
            return aVar2;
        }
        if (aVar2 == aVar3) {
            return aVar3;
        }
        long j = aVar.c;
        long j2 = aVar.c;
        long[] jArr2 = aVar.w;
        long j3 = aVar.b;
        long j4 = aVar.a;
        long j5 = aVar2.c;
        if (j == j5 && jArr2 == (jArr = aVar2.w)) {
            return new a(aVar2.a & (~j4), aVar2.b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                aVar2 = aVar2.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    aVar2 = aVar2.b(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    aVar2 = aVar2.b(i2 + j2 + 64);
                }
            }
        }
        return aVar2;
    }

    public final a b(long j) {
        long[] jArr;
        int f;
        long[] jArr2;
        long j2 = j - this.c;
        if (jl40.r(j2, 0L) >= 0 && jl40.r(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new a(this.a, j4 & (~j3), this.c, this.w);
            }
        } else if (jl40.r(j2, 64L) >= 0 && jl40.r(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.a;
            if ((j6 & j5) != 0) {
                return new a(j6 & (~j5), this.b, this.c, this.w);
            }
        } else if (jl40.r(j2, 0L) < 0 && (jArr = this.w) != null && (f = vng.f(j, jArr)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (f > 0) {
                    f73.f(jArr, jArr3, 0, 0, f);
                }
                if (f < i) {
                    f73.f(jArr, jArr3, f, f + 1, length);
                }
                jArr2 = jArr3;
            }
            return new a(this.a, this.b, this.c, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.c;
        return (jl40.r(j2, 0L) < 0 || jl40.r(j2, 64L) >= 0) ? (jl40.r(j2, 64L) < 0 || jl40.r(j2, 128L) >= 0) ? jl40.r(j2, 0L) <= 0 && (jArr = this.w) != null && vng.f(j, jArr) >= 0 : ((1 << (((int) j2) + (-64))) & this.a) != 0 : ((1 << ((int) j2)) & this.b) != 0;
    }

    public final a e(a aVar) {
        a aVar2;
        long[] jArr;
        a aVar3 = this;
        a aVar4 = x;
        if (aVar == aVar4) {
            return aVar3;
        }
        if (aVar3 == aVar4) {
            return aVar;
        }
        long j = aVar.c;
        long j2 = aVar.c;
        long[] jArr2 = aVar.w;
        long j3 = aVar.b;
        long j4 = aVar.a;
        long j5 = aVar3.c;
        long j6 = aVar3.b;
        long j7 = aVar3.a;
        if (j == j5 && jArr2 == (jArr = aVar3.w)) {
            return new a(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = aVar3.w;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    aVar3 = aVar3.f(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        aVar3 = aVar3.f(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        aVar3 = aVar3.f(i + j2 + 64);
                    }
                    i++;
                }
            }
            return aVar3;
        }
        if (jArr3 != null) {
            aVar2 = aVar;
            for (long j9 : jArr3) {
                aVar2 = aVar2.f(j9);
            }
        } else {
            aVar2 = aVar;
        }
        long j10 = aVar3.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    aVar2 = aVar2.f(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    aVar2 = aVar2.f(i + j10 + 64);
                }
                i++;
            }
        }
        return aVar2;
    }

    public final a f(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.c;
        long j6 = j - j5;
        long j7 = 0;
        int r = jl40.r(j6, 0L);
        long j8 = this.b;
        if (r < 0 || jl40.r(j6, 64L) >= 0) {
            int r2 = jl40.r(j6, 64L);
            long j9 = this.a;
            int i2 = 64;
            if (r2 < 0 || jl40.r(j6, 128L) >= 0) {
                int r3 = jl40.r(j6, 128L);
                long[] jArr3 = this.w;
                if (r3 < 0) {
                    if (jArr3 == null) {
                        return new a(this.a, this.b, this.c, new long[]{j});
                    }
                    int f = vng.f(j, jArr3);
                    if (f < 0) {
                        int i3 = -(f + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        f73.f(jArr3, jArr4, 0, 0, i3);
                        f73.f(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new a(this.a, this.b, this.c, jArr4);
                    }
                } else if (!d(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (jl40.r(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    o370 o370Var = null;
                    while (true) {
                        if (jl40.r(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (o370Var == null) {
                                o370Var = new o370(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((fy40) o370Var.a).a(i4 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i4++;
                                j7 = j4;
                            }
                        } else {
                            i = i2;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i2 = i;
                        j11 = j7;
                    }
                    if (o370Var != null) {
                        fy40 fy40Var = (fy40) o370Var.a;
                        int i5 = fy40Var.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = fy40Var.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new a(j11, j3, j2, jArr).f(j);
                        }
                    }
                    jArr = jArr3;
                    return new a(j11, j3, j2, jArr).f(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new a(j9 | j13, this.b, this.c, this.w);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new a(this.a, j8 | j14, this.c, this.w);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return vrq0.a(new SnapshotIdSet$iterator$1(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(tcc.n(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) Extension.FIX_SPACE);
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
