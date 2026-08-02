package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.video.m3.player.impl.source.dash.manifest.YandexDashManifest;
import ru.yandex.video.m3.player.lowlatency.BandwidthMeterProvider;
import ru.yandex.video.m3.source.chunk.ContainerMediaChunkFactory;

/* loaded from: classes10.dex */
public abstract class ol51 implements dgg {
    public final tyy b;
    public final int[] c;
    public final int d;
    public final kpg e;
    public final long f;
    public final int g;
    public final syc0 h;
    public final i9h[] i;
    public loo j;
    public final String k;
    public egg l;
    public int m;
    public IOException n;
    public boolean o;
    public final ContainerMediaChunkFactory a = new ContainerMediaChunkFactory();
    public boolean p = false;

    /* JADX WARN: Multi-variable type inference failed */
    public ol51(ru6 ru6Var, tyy tyyVar, egg eggVar, jc5 jc5Var, int i, int[] iArr, loo looVar, int i2, kpg kpgVar, long j, int i3, boolean z, List list, syc0 syc0Var) {
        this.k = null;
        this.b = tyyVar;
        this.l = eggVar;
        this.c = iArr;
        this.j = looVar;
        int i4 = i2;
        this.d = i4;
        this.e = kpgVar;
        this.m = i;
        this.f = j;
        this.g = i3;
        syc0 syc0Var2 = syc0Var;
        this.h = syc0Var2;
        long periodDurationUs = eggVar.getPeriodDurationUs(i);
        ArrayList l = l();
        this.i = new i9h[looVar.length()];
        int i5 = 0;
        while (i5 < this.i.length) {
            s4j0 s4j0Var = (s4j0) l.get(looVar.getIndexInTrackGroup(i5));
            ic5 c = jc5Var.c(s4j0Var.b);
            long j2 = periodDurationUs;
            this.i[i5] = new i9h(j2, s4j0Var, c == null ? (ic5) s4j0Var.b.get(0) : c, ru6Var.a(i4, s4j0Var.a, z, list, syc0Var2), 0L, s4j0Var.b(), 1);
            i5++;
            syc0Var2 = syc0Var;
            periodDurationUs = j2;
            i4 = i2;
        }
        if (eggVar instanceof YandexDashManifest) {
            this.k = ((YandexDashManifest) eggVar).getManifestUrl();
        }
    }

    @Override // defpackage.usb
    public final void b() {
        IOException iOException = this.n;
        if (iOException != null) {
            throw iOException;
        }
        this.b.b();
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

    @Override // defpackage.usb
    public final boolean e(long j, nsb nsbVar, List list) {
        int i;
        long j2;
        List list2 = list;
        int i2 = 0;
        if (this.n != null) {
            return false;
        }
        long W = tw21.W(tw21.E(this.f));
        loo looVar = this.j;
        if ((looVar instanceof BandwidthMeterProvider) && ((BandwidthMeterProvider) looVar).getBandwidthMeter().getBitrateEstimate() < nsbVar.w.j) {
            long j3 = nsbVar.z;
            k(W);
            ib10 ib10Var = list2.isEmpty() ? null : (ib10) b64.c(1, list2);
            long j4 = j3 - j;
            int length = this.j.length();
            jb10[] jb10VarArr = new jb10[length];
            while (i2 < length) {
                i9h i9hVar = this.i[i2];
                ib10 ib10Var2 = ib10Var;
                pgg pggVar = i9hVar.e;
                jzz jzzVar = jb10.J2;
                if (pggVar == null) {
                    jb10VarArr[i2] = jzzVar;
                    i = length;
                } else {
                    long c = i9hVar.c(W);
                    long d = i9hVar.d(W);
                    if (ib10Var2 != null) {
                        j2 = ib10Var2.a();
                        i = length;
                    } else {
                        pgg pggVar2 = i9hVar.e;
                        d6z.z(pggVar2);
                        i = length;
                        j2 = tw21.j(pggVar2.t(j3, i9hVar.f) + i9hVar.g, c, d);
                    }
                    if (j2 < c) {
                        jb10VarArr[i2] = jzzVar;
                    } else {
                        jb10VarArr[i2] = new j9h(j2, d, 2, m(i2));
                    }
                }
                i2++;
                ib10Var = ib10Var2;
                length = i;
            }
            list2 = list;
            this.j.updateSelectedTrack(j, j4, j(W, j), list2, jb10VarArr);
        }
        return this.j.shouldCancelChunkLoad(j, nsbVar, list2);
    }

    @Override // defpackage.usb
    public final int f(long j, List list) {
        return (this.n != null || this.j.length() < 2) ? list.size() : this.j.evaluateQueueSize(j, list);
    }

    @Override // defpackage.dgg
    public final void i(loo looVar) {
        this.j = looVar;
    }

    public final long j(long j, long j2) {
        if (!this.l.dynamic) {
            return -9223372036854775807L;
        }
        i9h[] i9hVarArr = this.i;
        return Math.max(0L, Math.min(k(j), i9hVarArr[0].f(i9hVarArr[0].d(j))) - j2);
    }

    public final long k(long j) {
        egg eggVar = this.l;
        long j2 = eggVar.availabilityStartTimeMs;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - tw21.W(j2 + eggVar.getPeriod(this.m).b);
    }

    public final ArrayList l() {
        List list = this.l.getPeriod(this.m).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((a70) list.get(i)).c);
        }
        return arrayList;
    }

    public abstract i9h m(int i);

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
