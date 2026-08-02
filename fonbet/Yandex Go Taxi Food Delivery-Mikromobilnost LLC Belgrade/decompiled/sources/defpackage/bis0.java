package defpackage;

import android.net.Uri;

/* loaded from: classes10.dex */
public final class bis0 extends c45 {
    public final ipg A;
    public final twy C;
    public cj01 E;
    public final long B = -9223372036854775807L;
    public final boolean D = true;

    public bis0(de10 de10Var, ipg ipgVar, twy twyVar) {
        this.A = ipgVar;
        this.C = twyVar;
        new td10().b = Uri.EMPTY;
        de10Var.getClass();
        throw null;
    }

    @Override // defpackage.uf10
    public final xe10 createPeriod(sf10 sf10Var, au1 au1Var, long j) {
        return new ais0(null, this.A, this.E, null, this.B, this.C, a(sf10Var), this.D, null);
    }

    @Override // defpackage.c45
    public final void e(cj01 cj01Var) {
        this.E = cj01Var;
        f(null);
    }

    @Override // defpackage.c45
    public final void g() {
    }

    @Override // defpackage.uf10
    public final fe10 getMediaItem() {
        return null;
    }

    @Override // defpackage.uf10
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // defpackage.uf10
    public final void releasePeriod(xe10 xe10Var) {
        ((ais0) xe10Var).B.f(null);
    }
}
