package defpackage;

import androidx.media3.exoplayer.upstream.a;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class ais0 implements xe10, oyy {
    public final long A;
    public final a B;
    public final androidx.media3.common.a C;
    public final boolean D;
    public boolean E;
    public byte[] F;
    public int G;
    public final npg a;
    public final ipg b;
    public final cj01 c;
    public final twy w;
    public final xf10 x;
    public final yzz0 y;
    public final ArrayList z = new ArrayList();

    public ais0(npg npgVar, ipg ipgVar, cj01 cj01Var, androidx.media3.common.a aVar, long j, twy twyVar, xf10 xf10Var, boolean z, tsi0 tsi0Var) {
        this.a = npgVar;
        this.b = ipgVar;
        this.c = cj01Var;
        this.C = aVar;
        this.A = j;
        this.w = twyVar;
        this.x = xf10Var;
        this.D = z;
        this.y = new yzz0(new xzz0("", aVar));
        this.B = tsi0Var != null ? new a(tsi0Var) : new a("SingleSampleMediaPeriod");
    }

    @Override // defpackage.xe10
    public final long c(long j, g7q0 g7q0Var) {
        return j;
    }

    @Override // defpackage.oyy
    public final void d(pyy pyyVar, long j, long j2, boolean z) {
        zhs0 zhs0Var = (zhs0) pyyVar;
        x7u0 x7u0Var = zhs0Var.c;
        long j3 = zhs0Var.a;
        uwy uwyVar = new uwy(zhs0Var.b, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        this.w.onLoadTaskConcluded(j3);
        this.x.c(uwyVar, 1, -1, null, 0, null, 0L, this.A);
    }

    @Override // defpackage.xe10
    public final long e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.z;
            if (i >= arrayList.size()) {
                return j;
            }
            yhs0 yhs0Var = (yhs0) arrayList.get(i);
            if (yhs0Var.a == 2) {
                yhs0Var.a = 1;
            }
            i++;
        }
    }

    @Override // defpackage.xe10
    public final long f() {
        return -9223372036854775807L;
    }

    @Override // defpackage.urq0
    public final long g() {
        return this.E ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.xe10
    public final yzz0 getTrackGroups() {
        return this.y;
    }

    @Override // defpackage.urq0
    public final void h(long j) {
    }

    @Override // defpackage.urq0
    public final long i() {
        return (this.E || this.B.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        return this.B.d();
    }

    @Override // defpackage.xe10
    public final void j() {
    }

    @Override // defpackage.xe10
    public final long k(loo[] looVarArr, boolean[] zArr, xyl0[] xyl0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < looVarArr.length; i++) {
            xyl0 xyl0Var = xyl0VarArr[i];
            ArrayList arrayList = this.z;
            if (xyl0Var != null && (looVarArr[i] == null || !zArr[i])) {
                arrayList.remove(xyl0Var);
                xyl0VarArr[i] = null;
            }
            if (xyl0VarArr[i] == null && looVarArr[i] != null) {
                yhs0 yhs0Var = new yhs0(this);
                arrayList.add(yhs0Var);
                xyl0VarArr[i] = yhs0Var;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.xe10
    public final void l(we10 we10Var, long j) {
        we10Var.onPrepared(this);
    }

    @Override // defpackage.oyy
    public final void m(pyy pyyVar, long j, long j2) {
        zhs0 zhs0Var = (zhs0) pyyVar;
        this.G = (int) zhs0Var.c.b;
        byte[] bArr = zhs0Var.w;
        bArr.getClass();
        this.F = bArr;
        this.E = true;
        x7u0 x7u0Var = zhs0Var.c;
        long j3 = zhs0Var.a;
        uwy uwyVar = new uwy(zhs0Var.b, x7u0Var.c, x7u0Var.w, j2, this.G);
        this.w.onLoadTaskConcluded(j3);
        this.x.e(uwyVar, 1, -1, this.C, 0, null, 0L, this.A);
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        if (this.E) {
            return false;
        }
        a aVar = this.B;
        if (aVar.d() || aVar.c()) {
            return false;
        }
        kpg createDataSource = this.b.createDataSource();
        cj01 cj01Var = this.c;
        if (cj01Var != null) {
            createDataSource.addTransferListener(cj01Var);
        }
        aVar.g(new zhs0(createDataSource, this.a), this, this.w.getMinimumLoadableRetryCount(1));
        return true;
    }

    @Override // defpackage.oyy
    public final void o(pyy pyyVar, long j, long j2, int i) {
        zhs0 zhs0Var = (zhs0) pyyVar;
        x7u0 x7u0Var = zhs0Var.c;
        this.x.h(i == 0 ? new uwy(zhs0Var.b) : new uwy(zhs0Var.b, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b), 1, -1, this.C, 0, null, 0L, this.A, i);
    }

    @Override // defpackage.oyy
    public final h0n p(pyy pyyVar, long j, long j2, IOException iOException, int i) {
        h0n h0nVar;
        zhs0 zhs0Var = (zhs0) pyyVar;
        x7u0 x7u0Var = zhs0Var.c;
        uwy uwyVar = new uwy(zhs0Var.b, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        tw21.l0(this.A);
        swy swyVar = new swy(iOException, i);
        twy twyVar = this.w;
        long retryDelayMsFor = twyVar.getRetryDelayMsFor(swyVar);
        boolean z = retryDelayMsFor == -9223372036854775807L || i >= twyVar.getMinimumLoadableRetryCount(1);
        if (this.D && z) {
            lk91.k("Loading failed, treating as end-of-stream.", iOException);
            this.E = true;
            h0nVar = a.e;
        } else {
            h0nVar = retryDelayMsFor != -9223372036854775807L ? new h0n(false, 0, retryDelayMsFor) : a.f;
        }
        h0n h0nVar2 = h0nVar;
        boolean b = h0nVar2.b();
        this.x.f(uwyVar, 1, -1, this.C, 0, null, 0L, this.A, iOException, !b);
        if (!b) {
            twyVar.onLoadTaskConcluded(zhs0Var.a);
        }
        return h0nVar2;
    }

    @Override // defpackage.xe10
    public final void s(long j, boolean z) {
    }
}
