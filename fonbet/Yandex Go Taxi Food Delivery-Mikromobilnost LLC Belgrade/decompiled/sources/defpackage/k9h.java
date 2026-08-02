package defpackage;

import android.os.SystemClock;
import androidx.media3.common.a;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes10.dex */
public final class k9h implements dgg {
    public final tyy a;
    public final jc5 b;
    public final int[] c;
    public final int d;
    public final kpg e;
    public final long f;
    public final int g;
    public final syc0 h;
    public final i9h[] i;
    public loo j;
    public egg k;
    public int l;
    public BehindLiveWindowException m;
    public boolean n;

    /* JADX WARN: Multi-variable type inference failed */
    public k9h(ru6 ru6Var, tyy tyyVar, egg eggVar, jc5 jc5Var, int i, int[] iArr, loo looVar, int i2, kpg kpgVar, long j, int i3, boolean z, ArrayList arrayList, syc0 syc0Var) {
        this.a = tyyVar;
        this.k = eggVar;
        this.b = jc5Var;
        this.c = iArr;
        this.j = looVar;
        int i4 = i2;
        this.d = i4;
        this.e = kpgVar;
        this.l = i;
        this.f = j;
        this.g = i3;
        syc0 syc0Var2 = syc0Var;
        this.h = syc0Var2;
        long periodDurationUs = eggVar.getPeriodDurationUs(i);
        ArrayList j2 = j();
        this.i = new i9h[looVar.length()];
        int i5 = 0;
        while (i5 < this.i.length) {
            s4j0 s4j0Var = (s4j0) j2.get(looVar.getIndexInTrackGroup(i5));
            ic5 c = jc5Var.c(s4j0Var.b);
            long j3 = periodDurationUs;
            this.i[i5] = new i9h(j3, s4j0Var, c == null ? (ic5) s4j0Var.b.get(0) : c, ru6Var.a(i4, s4j0Var.a, z, arrayList, syc0Var2), 0L, s4j0Var.b(), 0);
            i5++;
            syc0Var2 = syc0Var;
            periodDurationUs = j3;
            i4 = i2;
        }
    }

    @Override // defpackage.dgg
    public final void a(egg eggVar, int i) {
        i9h[] i9hVarArr = this.i;
        try {
            this.k = eggVar;
            this.l = i;
            long periodDurationUs = eggVar.getPeriodDurationUs(i);
            ArrayList j = j();
            for (int i2 = 0; i2 < i9hVarArr.length; i2++) {
                i9hVarArr[i2] = i9hVarArr[i2].a(periodDurationUs, (s4j0) j.get(this.j.getIndexInTrackGroup(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.m = e;
        }
    }

    @Override // defpackage.usb
    public final void b() {
        BehindLiveWindowException behindLiveWindowException = this.m;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 < (((r9.C() + r7) + r10) - 1)) goto L15;
     */
    @Override // defpackage.usb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j, g7q0 g7q0Var) {
        long j2;
        long j3 = j;
        i9h[] i9hVarArr = this.i;
        int length = i9hVarArr.length;
        int i = 0;
        while (i < length) {
            i9h i9hVar = i9hVarArr[i];
            pgg pggVar = i9hVar.e;
            long j4 = i9hVar.g;
            pgg pggVar2 = i9hVar.e;
            if (pggVar != null) {
                long e = i9hVar.e();
                if (e != 0) {
                    d6z.z(pggVar2);
                    long t = pggVar2.t(j3, i9hVar.f) + j4;
                    long g = i9hVar.g(t);
                    if (g < j3) {
                        if (e != -1) {
                            d6z.z(pggVar2);
                        }
                        j2 = i9hVar.g(t + 1);
                        return g7q0Var.a(j3, g, j2);
                    }
                    j2 = g;
                    return g7q0Var.a(j3, g, j2);
                }
            }
            i++;
            j3 = j;
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r1.e.onChunkLoadError(r2 != -9223372036854775807L && r2 < r12.z) != false) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.usb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(nsb nsbVar, boolean z, swy swyVar, twy twyVar) {
        rwy fallbackSelectionFor;
        long j;
        if (z) {
            syc0 syc0Var = this.h;
            if (syc0Var != null) {
                long j2 = syc0Var.d;
            }
            boolean z2 = this.k.dynamic;
            i9h[] i9hVarArr = this.i;
            if (!z2 && (nsbVar instanceof ib10)) {
                IOException iOException = swyVar.a;
                if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 404) {
                    i9h i9hVar = i9hVarArr[this.j.indexOf(nsbVar.w)];
                    long e = i9hVar.e();
                    if (e != -1 && e != 0) {
                        pgg pggVar = i9hVar.e;
                        d6z.z(pggVar);
                        if (((ib10) nsbVar).a() > ((pggVar.C() + i9hVar.g) + e) - 1) {
                            this.n = true;
                            return true;
                        }
                    }
                }
            }
            i9h i9hVar2 = i9hVarArr[this.j.indexOf(nsbVar.w)];
            s4j0 s4j0Var = i9hVar2.c;
            ic5 ic5Var = i9hVar2.d;
            ImmutableList immutableList = s4j0Var.b;
            jc5 jc5Var = this.b;
            ic5 c = jc5Var.c(immutableList);
            if (c == null || ic5Var.equals(c)) {
                loo looVar = this.j;
                ImmutableList immutableList2 = i9hVar2.c.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int length = looVar.length();
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (looVar.isTrackExcluded(i2, elapsedRealtime)) {
                        i++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i3 = 0; i3 < immutableList2.size(); i3++) {
                    hashSet.add(Integer.valueOf(((ic5) immutableList2.get(i3)).c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList a = jc5Var.a(immutableList2);
                for (int i4 = 0; i4 < a.size(); i4++) {
                    hashSet2.add(Integer.valueOf(((ic5) a.get(i4)).c));
                }
                qwy qwyVar = new qwy(size, size - hashSet2.size(), length, i);
                if ((qwyVar.a(2) || qwyVar.a(1)) && (fallbackSelectionFor = twyVar.getFallbackSelectionFor(qwyVar, swyVar)) != null) {
                    long j3 = fallbackSelectionFor.b;
                    int i5 = fallbackSelectionFor.a;
                    if (qwyVar.a(i5)) {
                        if (i5 == 2) {
                            loo looVar2 = this.j;
                            return looVar2.excludeTrack(looVar2.indexOf(nsbVar.w), j3);
                        }
                        if (i5 == 1) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() + j3;
                            String str = ic5Var.b;
                            HashMap hashMap = jc5Var.a;
                            if (hashMap.containsKey(str)) {
                                Long l = (Long) hashMap.get(str);
                                int i6 = tw21.a;
                                j = Math.max(elapsedRealtime2, l.longValue());
                            } else {
                                j = elapsedRealtime2;
                            }
                            hashMap.put(str, Long.valueOf(j));
                            int i7 = ic5Var.c;
                            if (i7 != Integer.MIN_VALUE) {
                                Integer valueOf = Integer.valueOf(i7);
                                HashMap hashMap2 = jc5Var.b;
                                if (hashMap2.containsKey(valueOf)) {
                                    Long l2 = (Long) hashMap2.get(valueOf);
                                    int i8 = tw21.a;
                                    elapsedRealtime2 = Math.max(elapsedRealtime2, l2.longValue());
                                }
                                hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.usb
    public final boolean e(long j, nsb nsbVar, List list) {
        if (this.m != null) {
            return false;
        }
        return this.j.shouldCancelChunkLoad(j, nsbVar, list);
    }

    @Override // defpackage.usb
    public final int f(long j, List list) {
        return (this.m != null || this.j.length() < 2) ? list.size() : this.j.evaluateQueueSize(j, list);
    }

    @Override // defpackage.usb
    public final void g(nsb nsbVar) {
        if (nsbVar instanceof swv) {
            int indexOf = this.j.indexOf(((swv) nsbVar).w);
            i9h[] i9hVarArr = this.i;
            i9h i9hVar = i9hVarArr[indexOf];
            if (i9hVar.e == null) {
                osb osbVar = i9hVar.b;
                d6z.z(osbVar);
                qsb a = ((su6) osbVar).a();
                if (a != null) {
                    s4j0 s4j0Var = i9hVar.c;
                    i9hVarArr[indexOf] = new i9h(i9hVar.f, s4j0Var, i9hVar.d, i9hVar.b, i9hVar.g, new qgg(a, s4j0Var.c, 0), 0);
                }
            }
        }
        syc0 syc0Var = this.h;
        if (syc0Var != null) {
            long j = syc0Var.d;
            if (j == -9223372036854775807L || nsbVar.A > j) {
                syc0Var.d = nsbVar.A;
            }
            syc0Var.e.onChunkLoadCompleted(nsbVar);
        }
    }

    @Override // defpackage.usb
    public final void h(xzy xzyVar, long j, List list, psb psbVar) {
        i9h[] i9hVarArr;
        long j2;
        long j3;
        boolean z;
        long j4;
        long j5;
        int i;
        nsb feeVar;
        long j6;
        jzz jzzVar;
        long j7;
        if (this.m != null) {
            return;
        }
        long j8 = xzyVar.a;
        long j9 = j - j8;
        long W = tw21.W(this.k.getPeriod(this.l).b) + tw21.W(this.k.availabilityStartTimeMs) + j;
        syc0 syc0Var = this.h;
        if (syc0Var == null || !syc0Var.e.maybeRefreshManifestBeforeLoadingNextChunk(W)) {
            long W2 = tw21.W(tw21.E(this.f));
            egg eggVar = this.k;
            long j10 = eggVar.availabilityStartTimeMs;
            long W3 = j10 == -9223372036854775807L ? -9223372036854775807L : W2 - tw21.W(j10 + eggVar.getPeriod(this.l).b);
            ib10 ib10Var = list.isEmpty() ? null : (ib10) b64.c(1, list);
            int length = this.j.length();
            jb10[] jb10VarArr = new jb10[length];
            int i2 = 0;
            while (true) {
                i9hVarArr = this.i;
                if (i2 >= length) {
                    break;
                }
                i9h i9hVar = i9hVarArr[i2];
                long j11 = j8;
                pgg pggVar = i9hVar.e;
                jzz jzzVar2 = jb10.J2;
                if (pggVar == null) {
                    jb10VarArr[i2] = jzzVar2;
                    j6 = j9;
                } else {
                    long c = i9hVar.c(W2);
                    long d = i9hVar.d(W2);
                    if (ib10Var != null) {
                        j7 = ib10Var.a();
                        j6 = j9;
                        jzzVar = jzzVar2;
                    } else {
                        pgg pggVar2 = i9hVar.e;
                        d6z.z(pggVar2);
                        j6 = j9;
                        jzzVar = jzzVar2;
                        j7 = tw21.j(pggVar2.t(j, i9hVar.f) + i9hVar.g, c, d);
                    }
                    if (j7 < c) {
                        jb10VarArr[i2] = jzzVar;
                    } else {
                        jb10VarArr[i2] = new j9h(j7, d, 0, k(i2));
                    }
                }
                i2++;
                j8 = j11;
                j9 = j6;
            }
            long j12 = j8;
            long j13 = j9;
            long j14 = 0;
            if (!this.k.dynamic || i9hVarArr[0].e() == 0) {
                j2 = -9223372036854775807L;
            } else {
                long f = i9hVarArr[0].f(i9hVarArr[0].d(W2));
                egg eggVar2 = this.k;
                long j15 = eggVar2.availabilityStartTimeMs;
                long min = Math.min(j15 == -9223372036854775807L ? -9223372036854775807L : W2 - tw21.W(j15 + eggVar2.getPeriod(this.l).b), f) - j12;
                j14 = 0;
                j2 = Math.max(0L, min);
            }
            long j16 = j14;
            long j17 = W3;
            this.j.updateSelectedTrack(j12, j13, j2, list, jb10VarArr);
            int selectedIndex = this.j.getSelectedIndex();
            SystemClock.elapsedRealtime();
            i9h k = k(selectedIndex);
            long j18 = k.f;
            long j19 = k.g;
            pgg pggVar3 = k.e;
            ic5 ic5Var = k.d;
            osb osbVar = k.b;
            s4j0 s4j0Var = k.c;
            if (osbVar != null) {
                z = true;
                w6i0 w6i0Var = ((su6) osbVar).B == null ? s4j0Var.x : null;
                j3 = j19;
                w6i0 c2 = pggVar3 == null ? s4j0Var.c() : null;
                if (w6i0Var != null || c2 != null) {
                    a selectedFormat = this.j.getSelectedFormat();
                    int selectionReason = this.j.getSelectionReason();
                    Object selectionData = this.j.getSelectionData();
                    if (w6i0Var != null) {
                        w6i0 a = w6i0Var.a(c2, ic5Var.a);
                        if (a != null) {
                            w6i0Var = a;
                        }
                    } else {
                        c2.getClass();
                        w6i0Var = c2;
                    }
                    psbVar.a = new swv(this.e, jd00.c(s4j0Var, ic5Var.a, w6i0Var, 0, ImmutableMap.f()), selectedFormat, selectionReason, selectionData, k.b);
                    return;
                }
            } else {
                j3 = j19;
                z = true;
            }
            egg eggVar3 = this.k;
            boolean z2 = (eggVar3.dynamic && this.l == eggVar3.getPeriodCount() + (-1)) ? z : false;
            boolean z3 = (z2 && j18 == -9223372036854775807L) ? false : z;
            if (k.e() == j16) {
                psbVar.b = z3;
                return;
            }
            long c3 = k.c(W2);
            long d2 = k.d(W2);
            if (z2) {
                long f2 = k.f(d2);
                z3 &= (f2 - k.g(d2)) + f2 >= j18 ? z : false;
            }
            if (ib10Var != null) {
                j5 = ib10Var.a();
                j4 = d2;
            } else {
                d6z.z(pggVar3);
                j4 = d2;
                j5 = tw21.j(pggVar3.t(j, j18) + j3, c3, j4);
            }
            long j20 = j5;
            if (j20 < c3) {
                this.m = new BehindLiveWindowException();
                return;
            }
            if (j20 > j4 || (this.n && j20 >= j4)) {
                psbVar.b = z3;
                return;
            }
            if (z3 && k.g(j20) >= j18) {
                psbVar.b = z;
                return;
            }
            int min2 = (int) Math.min(this.g, (j4 - j20) + 1);
            int i3 = (j18 > (-9223372036854775807L) ? 1 : (j18 == (-9223372036854775807L) ? 0 : -1));
            int i4 = 1;
            if (i3 != 0) {
                while (min2 > 1 && k.g((min2 + j20) - 1) >= j18) {
                    min2--;
                }
            }
            long j21 = list.isEmpty() ? j : -9223372036854775807L;
            a selectedFormat2 = this.j.getSelectedFormat();
            int selectionReason2 = this.j.getSelectionReason();
            Object selectionData2 = this.j.getSelectionData();
            long g = k.g(j20);
            d6z.z(pggVar3);
            w6i0 G = pggVar3.G(j20 - j3);
            kpg kpgVar = this.e;
            if (osbVar == null) {
                feeVar = new xhs0(kpgVar, jd00.c(s4j0Var, ic5Var.a, G, k.h(j20, j17) ? 0 : 8, ImmutableMap.f()), selectedFormat2, selectionReason2, selectionData2, g, k.f(j20), j20, this.d, selectedFormat2);
            } else {
                int i5 = 1;
                while (true) {
                    if (i5 >= min2) {
                        i = i3;
                        break;
                    }
                    int i6 = min2;
                    i = i3;
                    d6z.z(pggVar3);
                    w6i0 a2 = G.a(pggVar3.G((j20 + i5) - j3), ic5Var.a);
                    if (a2 == null) {
                        break;
                    }
                    i4++;
                    i5++;
                    i3 = i;
                    G = a2;
                    min2 = i6;
                }
                long j22 = (j20 + i4) - 1;
                long f3 = k.f(j22);
                long j23 = (i == 0 || j18 > f3) ? -9223372036854775807L : j18;
                npg c4 = jd00.c(s4j0Var, ic5Var.a, G, k.h(j22, j17) ? 0 : 8, ImmutableMap.f());
                long j24 = -s4j0Var.c;
                if (eh20.n(selectedFormat2.n)) {
                    j24 += g;
                }
                feeVar = new fee(kpgVar, c4, selectedFormat2, selectionReason2, selectionData2, g, f3, j21, j23, j20, i4, j24, k.b);
            }
            psbVar.a = feeVar;
        }
    }

    @Override // defpackage.dgg
    public final void i(loo looVar) {
        this.j = looVar;
    }

    public final ArrayList j() {
        List list = this.k.getPeriod(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((a70) list.get(i)).c);
        }
        return arrayList;
    }

    public final i9h k(int i) {
        i9h[] i9hVarArr = this.i;
        i9h i9hVar = i9hVarArr[i];
        ic5 c = this.b.c(i9hVar.c.b);
        if (c == null || c.equals(i9hVar.d)) {
            return i9hVar;
        }
        i9h i9hVar2 = new i9h(i9hVar.f, i9hVar.c, c, i9hVar.b, i9hVar.g, i9hVar.e, 0);
        i9hVarArr[i] = i9hVar2;
        return i9hVar2;
    }

    @Override // defpackage.usb
    public final void release() {
        for (i9h i9hVar : this.i) {
            osb osbVar = i9hVar.b;
            if (osbVar != null) {
                ((su6) osbVar).d();
            }
        }
    }
}
