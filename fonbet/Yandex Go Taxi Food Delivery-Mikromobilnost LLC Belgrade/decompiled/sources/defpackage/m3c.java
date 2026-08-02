package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class m3c implements xe10, we10 {
    public final xe10 a;
    public we10 b;
    public l3c[] c = new l3c[0];
    public long w;
    public long x;
    public long y;
    public ClippingMediaSource$IllegalClippingException z;

    public m3c(xe10 xe10Var, boolean z, long j, long j2) {
        this.a = xe10Var;
        this.w = z ? j : -9223372036854775807L;
        this.x = j;
        this.y = j2;
    }

    public final boolean a() {
        return this.w != -9223372036854775807L;
    }

    @Override // defpackage.xe10
    public final long c(long j, g7q0 g7q0Var) {
        long j2 = this.x;
        if (j == j2) {
            return j2;
        }
        long j3 = tw21.j(g7q0Var.a, 0L, j - j2);
        long j4 = g7q0Var.b;
        long j5 = this.y;
        long j6 = tw21.j(j4, 0L, j5 == Long.MIN_VALUE ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : j5 - j);
        if (j3 != g7q0Var.a || j6 != g7q0Var.b) {
            g7q0Var = new g7q0(j3, j6);
        }
        return this.a.c(j, g7q0Var);
    }

    @Override // defpackage.xe10
    public final long e(long j) {
        this.w = -9223372036854775807L;
        for (l3c l3cVar : this.c) {
            if (l3cVar != null) {
                l3cVar.b = false;
            }
        }
        long e = this.a.e(j);
        long j2 = this.x;
        long j3 = this.y;
        long max = Math.max(e, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    @Override // defpackage.xe10
    public final long f() {
        if (a()) {
            long j = this.w;
            this.w = -9223372036854775807L;
            long f = f();
            return f != -9223372036854775807L ? f : j;
        }
        long f2 = this.a.f();
        if (f2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.x;
        long j3 = this.y;
        long max = Math.max(f2, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    @Override // defpackage.urq0
    public final long g() {
        long g = this.a.g();
        if (g != Long.MIN_VALUE) {
            long j = this.y;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.xe10
    public final yzz0 getTrackGroups() {
        return this.a.getTrackGroups();
    }

    @Override // defpackage.urq0
    public final void h(long j) {
        this.a.h(j);
    }

    @Override // defpackage.urq0
    public final long i() {
        long i = this.a.i();
        if (i != Long.MIN_VALUE) {
            long j = this.y;
            if (j == Long.MIN_VALUE || i < j) {
                return i;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.urq0
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // defpackage.xe10
    public final void j() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.z;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.a.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // defpackage.xe10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(loo[] looVarArr, boolean[] zArr, xyl0[] xyl0VarArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        this.c = new l3c[xyl0VarArr.length];
        xyl0[] xyl0VarArr2 = new xyl0[xyl0VarArr.length];
        for (int i2 = 0; i2 < xyl0VarArr.length; i2++) {
            l3c[] l3cVarArr = this.c;
            l3c l3cVar = (l3c) xyl0VarArr[i2];
            l3cVarArr[i2] = l3cVar;
            xyl0VarArr2[i2] = l3cVar != null ? l3cVar.a : null;
        }
        long k = this.a.k(looVarArr, zArr, xyl0VarArr2, zArr2, j);
        long j3 = this.y;
        long max = Math.max(k, j);
        if (j3 != Long.MIN_VALUE) {
            max = Math.min(max, j3);
        }
        if (a()) {
            if (k >= j) {
                if (k != 0) {
                    for (loo looVar : looVarArr) {
                        if (looVar != null) {
                            a selectedFormat = looVar.getSelectedFormat();
                            if (!eh20.a(selectedFormat.n, selectedFormat.k)) {
                            }
                        }
                    }
                }
            }
            j2 = max;
            this.w = j2;
            for (i = 0; i < xyl0VarArr.length; i++) {
                xyl0 xyl0Var = xyl0VarArr2[i];
                l3c[] l3cVarArr2 = this.c;
                if (xyl0Var == null) {
                    l3cVarArr2[i] = null;
                } else {
                    l3c l3cVar2 = l3cVarArr2[i];
                    if (l3cVar2 == null || l3cVar2.a != xyl0Var) {
                        l3cVarArr2[i] = new l3c(this, xyl0Var);
                    }
                }
                xyl0VarArr[i] = l3cVarArr2[i];
            }
            return max;
        }
        j2 = -9223372036854775807L;
        this.w = j2;
        while (i < xyl0VarArr.length) {
        }
        return max;
    }

    @Override // defpackage.xe10
    public final void l(we10 we10Var, long j) {
        this.b = we10Var;
        this.a.l(this, j);
    }

    @Override // defpackage.urq0
    public final boolean n(xzy xzyVar) {
        return this.a.n(xzyVar);
    }

    @Override // defpackage.trq0
    public final void onContinueLoadingRequested(urq0 urq0Var) {
        we10 we10Var = this.b;
        we10Var.getClass();
        we10Var.onContinueLoadingRequested(this);
    }

    @Override // defpackage.we10
    public final void onPrepared(xe10 xe10Var) {
        if (this.z != null) {
            return;
        }
        we10 we10Var = this.b;
        we10Var.getClass();
        we10Var.onPrepared(this);
    }

    @Override // defpackage.xe10
    public final void s(long j, boolean z) {
        this.a.s(j, z);
    }
}
