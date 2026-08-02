package defpackage;

import com.yandex.go.modals.progress.api.CircularProgressRouter$Payload;

/* loaded from: classes12.dex */
public final class omr0 extends h55 {
    public final x2b D;
    public final boolean E;
    public sls F;

    public omr0(x2b x2bVar) {
        super(null);
        this.D = x2bVar;
        this.E = true;
        this.F = new bgc(12);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        A((m950) this.D.get(), new CircularProgressRouter$Payload(null, !this.E, 3), new yio0(3, this));
    }

    public final void P(uwd0 uwd0Var) {
        this.F = uwd0Var;
    }
}
