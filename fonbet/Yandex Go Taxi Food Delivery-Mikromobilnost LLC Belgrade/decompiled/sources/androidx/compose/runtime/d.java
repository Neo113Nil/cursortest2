package androidx.compose.runtime;

import defpackage.bvf0;
import defpackage.cvw;
import defpackage.dse;
import defpackage.dui0;
import defpackage.ese;
import defpackage.ffx;
import defpackage.fse;
import defpackage.ike;
import defpackage.jhd;
import defpackage.kpb1;
import defpackage.lse;
import defpackage.mse;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.uh6;
import defpackage.wls;
import defpackage.ytd;

/* loaded from: classes.dex */
public final class d implements dui0, mse {
    public final fse a;
    public final wls b;
    public final ike c;
    public pzt0 w;

    public d(fse fseVar, wls wlsVar) {
        this.a = fseVar;
        this.b = wlsVar;
        this.c = bvf0.a(fseVar.plus(this));
    }

    @Override // defpackage.dui0
    public final void b() {
        pzt0 pzt0Var = this.w;
        if (pzt0Var != null) {
            pzt0Var.a(uh6.b("Old job was still running!", null));
        }
        this.w = tje.N(this.c, null, null, this.b, 3);
    }

    @Override // defpackage.dui0
    public final void d() {
        pzt0 pzt0Var = this.w;
        if (pzt0Var != null) {
            pzt0Var.u(new LeftCompositionCancellationException());
        }
        this.w = null;
    }

    @Override // defpackage.dui0
    public final void e() {
        pzt0 pzt0Var = this.w;
        if (pzt0Var != null) {
            pzt0Var.u(new LeftCompositionCancellationException());
        }
        this.w = null;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.dse
    public final ese getKey() {
        return lse.a;
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        ytd ytdVar = (ytd) fseVar.get(ytd.b);
        if (ytdVar != null) {
            kpb1.d(th, new jhd(2, ytdVar, this));
        }
        mse mseVar = (mse) this.a.get(lse.a);
        if (mseVar == null) {
            throw th;
        }
        mseVar.handleException(fseVar, th);
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this, fseVar);
    }
}
