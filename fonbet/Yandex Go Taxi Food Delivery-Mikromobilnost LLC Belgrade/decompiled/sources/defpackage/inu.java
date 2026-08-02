package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.common.a;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class inu {
    public final jch a;
    public final kpg b;
    public final kpg c;
    public final tez0 d;
    public final Uri[] e;
    public final a[] f;
    public final mch g;
    public final xzz0 h;
    public final List i;
    public final vyc0 k;
    public boolean l;
    public BehindLiveWindowException n;
    public Uri o;
    public boolean p;
    public loo q;
    public boolean s;
    public final androidx.media3.exoplayer.hls.a j = new androidx.media3.exoplayer.hls.a();
    public byte[] m = tw21.c;
    public long r = -9223372036854775807L;

    public inu(jch jchVar, mch mchVar, Uri[] uriArr, a[] aVarArr, gyc gycVar, cj01 cj01Var, tez0 tez0Var, List list, vyc0 vyc0Var) {
        this.a = jchVar;
        this.g = mchVar;
        this.e = uriArr;
        this.f = aVarArr;
        this.d = tez0Var;
        this.i = list;
        this.k = vyc0Var;
        kpg createDataSource = ((ipg) gycVar.a).createDataSource();
        this.b = createDataSource;
        if (cj01Var != null) {
            createDataSource.addTransferListener(cj01Var);
        }
        this.c = ((ipg) gycVar.a).createDataSource();
        this.h = new xzz0("", aVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((aVarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        xzz0 xzz0Var = this.h;
        int[] e = com.google.common.primitives.a.e(arrayList);
        gnu gnuVar = new gnu(0, xzz0Var, e);
        gnuVar.a = gnuVar.indexOf(xzz0Var.d[e[0]]);
        this.q = gnuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jb10[] a(lnu lnuVar, long j) {
        List p;
        inu inuVar = this;
        lnu lnuVar2 = lnuVar;
        int a = lnuVar2 == null ? -1 : inuVar.h.a(lnuVar2.w);
        int length = inuVar.q.length();
        jb10[] jb10VarArr = new jb10[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int indexInTrackGroup = inuVar.q.getIndexInTrackGroup(i);
            Uri uri = inuVar.e[indexInTrackGroup];
            mch mchVar = inuVar.g;
            if (mchVar.c(uri)) {
                unu a2 = mchVar.a(uri, z);
                a2.getClass();
                long j2 = a2.h - mchVar.G;
                Pair c = inuVar.c(lnuVar2, indexInTrackGroup != a ? true : z, a2, j2, j);
                long longValue = ((Long) c.first).longValue();
                int intValue = ((Integer) c.second).intValue();
                long j3 = a2.k;
                ImmutableList immutableList = a2.s;
                ImmutableList immutableList2 = a2.r;
                int i2 = (int) (longValue - j3);
                if (i2 < 0 || immutableList2.size() < i2) {
                    p = ImmutableList.p();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < immutableList2.size()) {
                        if (intValue != -1) {
                            rnu rnuVar = (rnu) immutableList2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(rnuVar);
                            } else if (intValue < rnuVar.F.size()) {
                                ImmutableList immutableList3 = rnuVar.F;
                                arrayList.addAll(immutableList3.subList(intValue, immutableList3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(immutableList2.subList(i2, immutableList2.size()));
                        intValue = 0;
                    }
                    if (a2.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < immutableList.size()) {
                            arrayList.addAll(immutableList.subList(intValue, immutableList.size()));
                        }
                    }
                    p = Collections.unmodifiableList(arrayList);
                }
                jb10VarArr[i] = new fnu(j2, p);
            } else {
                jb10VarArr[i] = jb10.J2;
            }
            i++;
            inuVar = this;
            lnuVar2 = lnuVar;
            z = false;
        }
        return jb10VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(lnu lnuVar) {
        int i = lnuVar.H;
        if (i == -1) {
            return 1;
        }
        unu a = this.g.a(this.e[this.h.a(lnuVar.w)], false);
        a.getClass();
        ImmutableList immutableList = a.r;
        int i2 = (int) (lnuVar.C - a.k);
        if (i2 < 0) {
            return 1;
        }
        ImmutableList immutableList2 = i2 < immutableList.size() ? ((rnu) immutableList.get(i2)).F : a.s;
        if (i >= immutableList2.size()) {
            return 2;
        }
        pnu pnuVar = (pnu) immutableList2.get(i);
        if (pnuVar.F) {
            return 0;
        }
        return Objects.equals(Uri.parse(m4m0.i(a.a, pnuVar.a)), lnuVar.b.a) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair c(lnu lnuVar, boolean z, unu unuVar, long j, long j2) {
        boolean z2 = true;
        if (lnuVar != null) {
            long j3 = lnuVar.C;
            int i = lnuVar.H;
            if (!z) {
                if (!lnuVar.c0) {
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i));
                }
                if (i == -1) {
                    j3 = lnuVar.a();
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i != -1 ? i + 1 : -1));
            }
        }
        long j4 = unuVar.u;
        ImmutableList immutableList = unuVar.s;
        long j5 = unuVar.k;
        ImmutableList immutableList2 = unuVar.r;
        long j6 = j4 + j;
        if (lnuVar != null && !this.p) {
            j2 = lnuVar.z;
        }
        if (!unuVar.o && j2 >= j6) {
            return new Pair(Long.valueOf(j5 + immutableList2.size()), -1);
        }
        long j7 = j2 - j;
        Long valueOf = Long.valueOf(j7);
        int i2 = 0;
        if (this.g.F && lnuVar != null) {
            z2 = false;
        }
        int c = tw21.c(immutableList2, valueOf, z2);
        long j8 = c + j5;
        if (c >= 0) {
            rnu rnuVar = (rnu) immutableList2.get(c);
            ImmutableList immutableList3 = j7 < rnuVar.x + rnuVar.c ? rnuVar.F : immutableList;
            while (true) {
                if (i2 >= immutableList3.size()) {
                    break;
                }
                pnu pnuVar = (pnu) immutableList3.get(i2);
                if (j7 >= pnuVar.x + pnuVar.c) {
                    i2++;
                } else if (pnuVar.E) {
                    j8 += immutableList3 == immutableList ? 1L : 0L;
                    r1 = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j8), Integer.valueOf(r1));
    }

    public final dnu d(int i, Uri uri, boolean z) {
        if (uri == null) {
            return null;
        }
        androidx.media3.exoplayer.hls.a aVar = this.j;
        byte[] bArr = (byte[]) aVar.a.remove(uri);
        if (bArr != null) {
            return null;
        }
        mpg mpgVar = new mpg();
        mpgVar.a = uri;
        mpgVar.i = 1;
        npg a = mpgVar.a();
        a aVar2 = this.f[i];
        int selectionReason = this.q.getSelectionReason();
        Object selectionData = this.q.getSelectionData();
        byte[] bArr2 = this.m;
        dnu dnuVar = new dnu(this.c, a, 3, aVar2, selectionReason, selectionData, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = tw21.c;
        }
        dnuVar.C = bArr2;
        return dnuVar;
    }
}
