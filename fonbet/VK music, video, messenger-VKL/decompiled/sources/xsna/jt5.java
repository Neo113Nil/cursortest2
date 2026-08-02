package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.n3i0;

/* compiled from: AviExtractor.java */
/* loaded from: classes12.dex */
public final class jt5 implements pgq {
    public final xi90 a;
    public final b b;
    public final boolean c;
    public final anl d;
    public int e;
    public rgq f;
    public kt5 g;
    public long h;
    public hcc[] i;
    public long j;

    @Nullable
    public hcc k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    /* compiled from: AviExtractor.java */
    public class a implements n3i0 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        @Override // xsna.n3i0
        public final long getDurationUs() {
            return this.a;
        }

        @Override // xsna.n3i0
        public final n3i0.a getSeekPoints(long j) {
            jt5 jt5Var = jt5.this;
            n3i0.a b = jt5Var.i[0].b(j);
            int i = 1;
            while (true) {
                hcc[] hccVarArr = jt5Var.i;
                if (i >= hccVarArr.length) {
                    return b;
                }
                n3i0.a b2 = hccVarArr[i].b(j);
                if (b2.a.b < b.a.b) {
                    b = b2;
                }
                i++;
            }
        }

        @Override // xsna.n3i0
        public final boolean isSeekable() {
            return true;
        }
    }

    /* compiled from: AviExtractor.java */
    public static class b {
        public int a;
        public int b;
        public int c;
    }

    public jt5(int i, anl anlVar) {
        this.d = anlVar;
        this.c = (i & 1) == 0;
        this.a = new xi90(12);
        this.b = new b();
        this.f = new cdi();
        this.i = new hcc[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    @Override // xsna.pgq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        boolean z;
        hcc hccVar;
        int i;
        long j;
        int i2;
        int i3;
        hcc hccVar2;
        int i4 = 0;
        if (this.j != -1) {
            long position = qgqVar.getPosition();
            long j2 = this.j;
            if (j2 < position || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                pzb0Var.a = j2;
                z = true;
                this.j = -1L;
                if (!z) {
                    return 1;
                }
                int i5 = this.e;
                int i6 = 4;
                hcc hccVar3 = null;
                b bVar = this.b;
                int i7 = 2;
                xi90 xi90Var = this.a;
                switch (i5) {
                    case 0:
                        if (!d(qgqVar)) {
                            throw ParserException.a(null, "AVI Header List not found");
                        }
                        qgqVar.skipFully(12);
                        this.e = 1;
                        return 0;
                    case 1:
                        qgqVar.readFully(xi90Var.a, 0, 12);
                        xi90Var.P(0);
                        bVar.getClass();
                        bVar.a = xi90Var.r();
                        bVar.b = xi90Var.r();
                        bVar.c = 0;
                        if (bVar.a != 1414744396) {
                            throw ParserException.a(null, "LIST expected, found: " + bVar.a);
                        }
                        int r = xi90Var.r();
                        bVar.c = r;
                        if (r == 1819436136) {
                            this.l = bVar.b;
                            this.e = 2;
                            return 0;
                        }
                        throw ParserException.a(null, "hdrl expected, found: " + bVar.c);
                    case 2:
                        int i8 = this.l - 4;
                        xi90 xi90Var2 = new xi90(i8);
                        qgqVar.readFully(xi90Var2.a, 0, i8);
                        fez b2 = fez.b(1819436136, xi90Var2);
                        int i9 = b2.b;
                        if (i9 != 1819436136) {
                            throw ParserException.a(null, "Unexpected header list type " + i9);
                        }
                        kt5 kt5Var = (kt5) b2.a(kt5.class);
                        if (kt5Var == null) {
                            throw ParserException.a(null, "AviHeader not found");
                        }
                        this.g = kt5Var;
                        this.h = kt5Var.c * kt5Var.a;
                        ArrayList arrayList = new ArrayList();
                        ImmutableList.b listIterator = b2.a.listIterator(0);
                        int i10 = 0;
                        while (listIterator.hasNext()) {
                            it5 it5Var = (it5) listIterator.next();
                            if (it5Var.getType() == 1819440243) {
                                fez fezVar = (fez) it5Var;
                                int i11 = i10 + 1;
                                lt5 lt5Var = (lt5) fezVar.a(lt5.class);
                                tom0 tom0Var = (tom0) fezVar.a(tom0.class);
                                if (lt5Var == null) {
                                    ahn.F("Missing Stream Header");
                                } else if (tom0Var == null) {
                                    ahn.F("Missing Stream Format");
                                } else {
                                    long j3 = lt5Var.c;
                                    String str = y2r0.a;
                                    long d0 = y2r0.d0(lt5Var.d, lt5Var.b * 1000000, j3, RoundingMode.DOWN);
                                    androidx.media3.common.a aVar = tom0Var.a;
                                    a.C0043a a2 = aVar.a();
                                    a2.i(i10);
                                    int i12 = lt5Var.e;
                                    if (i12 != 0) {
                                        a2.n = i12;
                                    }
                                    yom0 yom0Var = (yom0) fezVar.a(yom0.class);
                                    if (yom0Var != null) {
                                        a2.b = yom0Var.a;
                                    }
                                    int i13 = io20.i(aVar.n);
                                    if (i13 == 1 || i13 == i7) {
                                        rgp0 track = this.f.track(i10, i13);
                                        track.c(new androidx.media3.common.a(a2));
                                        track.e(d0);
                                        this.h = Math.max(this.h, d0);
                                        hccVar = new hcc(i10, lt5Var, track);
                                        if (hccVar != null) {
                                            arrayList.add(hccVar);
                                        }
                                        i10 = i11;
                                    }
                                }
                                hccVar = null;
                                if (hccVar != null) {
                                }
                                i10 = i11;
                            }
                            i7 = 2;
                        }
                        this.i = (hcc[]) arrayList.toArray(new hcc[0]);
                        this.f.endTracks();
                        this.e = 3;
                        return 0;
                    case 3:
                        if (this.m != -1) {
                            long position2 = qgqVar.getPosition();
                            i = 16;
                            long j4 = this.m;
                            if (position2 != j4) {
                                this.j = j4;
                                return 0;
                            }
                        } else {
                            i = 16;
                        }
                        qgqVar.peekFully(xi90Var.a, 0, 12);
                        qgqVar.resetPeekPosition();
                        xi90Var.P(0);
                        bVar.getClass();
                        bVar.a = xi90Var.r();
                        bVar.b = xi90Var.r();
                        bVar.c = 0;
                        int r2 = xi90Var.r();
                        int i14 = bVar.a;
                        if (i14 == 1179011410) {
                            qgqVar.skipFully(12);
                            return 0;
                        }
                        if (i14 != 1414744396 || r2 != 1769369453) {
                            this.j = qgqVar.getPosition() + bVar.b + 8;
                            return 0;
                        }
                        long position3 = qgqVar.getPosition();
                        this.m = position3;
                        this.n = position3 + bVar.b + 8;
                        if (!this.p) {
                            kt5 kt5Var2 = this.g;
                            kt5Var2.getClass();
                            if ((kt5Var2.b & i) == i) {
                                this.e = 4;
                                this.j = this.n;
                                return 0;
                            }
                            this.f.f(new n3i0.b(this.h));
                            this.p = true;
                        }
                        this.j = qgqVar.getPosition() + 12;
                        this.e = 6;
                        return 0;
                    case 4:
                        qgqVar.readFully(xi90Var.a, 0, 8);
                        xi90Var.P(0);
                        int r3 = xi90Var.r();
                        int r4 = xi90Var.r();
                        if (r3 != 829973609) {
                            this.j = qgqVar.getPosition() + r4;
                            return 0;
                        }
                        this.e = 5;
                        this.o = r4;
                        return 0;
                    case 5:
                        xi90 xi90Var3 = new xi90(this.o);
                        qgqVar.readFully(xi90Var3.a, 0, this.o);
                        if (xi90Var3.a() < 16) {
                            j = 0;
                        } else {
                            int i15 = xi90Var3.b;
                            xi90Var3.Q(8);
                            long r5 = xi90Var3.r();
                            long j5 = this.m;
                            j = r5 > j5 ? 0L : j5 + 8;
                            xi90Var3.P(i15);
                        }
                        while (xi90Var3.a() >= 16) {
                            int r6 = xi90Var3.r();
                            int r7 = xi90Var3.r();
                            long r8 = xi90Var3.r() + j;
                            xi90Var3.Q(i6);
                            hcc[] hccVarArr = this.i;
                            int length = hccVarArr.length;
                            int i16 = i4;
                            while (true) {
                                if (i16 < length) {
                                    hccVar2 = hccVarArr[i16];
                                    i3 = i4;
                                    if (hccVar2.c != r6 && hccVar2.d != r6) {
                                        i16++;
                                        i4 = i3;
                                    }
                                } else {
                                    i3 = i4;
                                    hccVar2 = null;
                                }
                            }
                            if (hccVar2 != null) {
                                int i17 = (r7 & 16) == 16 ? 1 : i3;
                                if (hccVar2.l == -1) {
                                    hccVar2.l = r8;
                                }
                                if (i17 != 0) {
                                    if (hccVar2.k == hccVar2.n.length) {
                                        long[] jArr = hccVar2.m;
                                        hccVar2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr = hccVar2.n;
                                        hccVar2.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                    }
                                    long[] jArr2 = hccVar2.m;
                                    int i18 = hccVar2.k;
                                    jArr2[i18] = r8;
                                    hccVar2.n[i18] = hccVar2.j;
                                    hccVar2.k = i18 + 1;
                                }
                                hccVar2.j++;
                            }
                            i4 = i3;
                            i6 = 4;
                        }
                        int i19 = i4;
                        hcc[] hccVarArr2 = this.i;
                        int length2 = hccVarArr2.length;
                        for (int i20 = i19; i20 < length2; i20++) {
                            hcc hccVar4 = hccVarArr2[i20];
                            hccVar4.m = Arrays.copyOf(hccVar4.m, hccVar4.k);
                            hccVar4.n = Arrays.copyOf(hccVar4.n, hccVar4.k);
                            if ((hccVar4.c & 1651965952) == 1651965952 && hccVar4.a.f != 0 && (i2 = hccVar4.k) > 0) {
                                hccVar4.f = i2;
                            }
                        }
                        this.p = true;
                        if (this.i.length == 0) {
                            this.f.f(new n3i0.b(this.h));
                        } else {
                            this.f.f(new a(this.h));
                        }
                        this.e = 6;
                        this.j = this.m;
                        return i19;
                    case 6:
                        if (qgqVar.getPosition() >= this.n) {
                            return -1;
                        }
                        hcc hccVar5 = this.k;
                        if (hccVar5 != null) {
                            int i21 = hccVar5.h;
                            int g = i21 - hccVar5.b.g(qgqVar, i21, false);
                            hccVar5.h = g;
                            boolean z2 = g == 0;
                            if (z2) {
                                if (hccVar5.g > 0) {
                                    rgp0 rgp0Var = hccVar5.b;
                                    int i22 = hccVar5.i;
                                    rgp0Var.a((hccVar5.e * i22) / hccVar5.f, Arrays.binarySearch(hccVar5.n, i22) >= 0 ? 1 : 0, hccVar5.g, 0, null);
                                }
                                hccVar5.i++;
                            }
                            if (z2) {
                                this.k = null;
                            }
                            return 0;
                        }
                        if ((qgqVar.getPosition() & 1) == 1) {
                            qgqVar.skipFully(1);
                        }
                        qgqVar.peekFully(xi90Var.a, 0, 12);
                        xi90Var.P(0);
                        int r9 = xi90Var.r();
                        if (r9 == 1414744396) {
                            xi90Var.P(8);
                            qgqVar.skipFully(xi90Var.r() == 1769369453 ? 12 : 8);
                            qgqVar.resetPeekPosition();
                            return 0;
                        }
                        int r10 = xi90Var.r();
                        if (r9 == 1263424842) {
                            this.j = qgqVar.getPosition() + r10 + 8;
                            return 0;
                        }
                        qgqVar.skipFully(8);
                        qgqVar.resetPeekPosition();
                        for (hcc hccVar6 : this.i) {
                            if (hccVar6.c == r9 || hccVar6.d == r9) {
                                hccVar3 = hccVar6;
                                if (hccVar3 != null) {
                                    this.j = qgqVar.getPosition() + r10;
                                    return 0;
                                }
                                hccVar3.g = r10;
                                hccVar3.h = r10;
                                this.k = hccVar3;
                                return 0;
                            }
                        }
                        if (hccVar3 != null) {
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                qgqVar.skipFully((int) (j2 - position));
            }
        }
        z = false;
        this.j = -1L;
        if (!z) {
        }
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        xi90 xi90Var = this.a;
        qgqVar.peekFully(xi90Var.a, 0, 12);
        xi90Var.P(0);
        if (xi90Var.r() != 1179011410) {
            return false;
        }
        xi90Var.Q(4);
        return xi90Var.r() == 541677121;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.e = 0;
        if (this.c) {
            rgqVar = new e1n0(rgqVar, this.d);
        }
        this.f = rgqVar;
        this.j = -1L;
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (hcc hccVar : this.i) {
            if (hccVar.k == 0) {
                hccVar.i = 0;
            } else {
                hccVar.i = hccVar.n[y2r0.f(hccVar.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
