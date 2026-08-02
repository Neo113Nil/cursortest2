package xsna;

import xsna.ub9;
import xsna.ugw;

/* compiled from: ImageCapture.java */
/* loaded from: classes11.dex */
public final class vgw implements o0t<Void> {
    public final /* synthetic */ ugw.i b;
    public final /* synthetic */ ub9.a c;
    public final /* synthetic */ ugw d;

    public vgw(ugw ugwVar, ugw.i iVar, ub9.a aVar) {
        this.d = ugwVar;
        this.b = iVar;
        this.c = aVar;
    }

    @Override // xsna.o0t
    public final void onFailure(Throwable th) {
        this.d.x(this.b);
        this.c.d(th);
    }

    @Override // xsna.o0t
    public final void onSuccess(Void r2) {
        this.d.x(this.b);
    }
}
