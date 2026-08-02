package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class p3c extends ob51 {
    public final long E;
    public final boolean F;
    public final ArrayList G;
    public final z8z0 H;
    public o3c I;
    public ClippingMediaSource$IllegalClippingException J;
    public long K;
    public long L;

    public p3c(n3c n3cVar) {
        super(n3cVar.a);
        this.E = n3cVar.b;
        this.F = n3cVar.c;
        this.G = new ArrayList();
        this.H = new z8z0();
    }

    @Override // defpackage.uf10
    public final boolean canUpdateMediaItem(fe10 fe10Var) {
        uf10 uf10Var = this.D;
        return uf10Var.getMediaItem().e.equals(fe10Var.e) && uf10Var.canUpdateMediaItem(fe10Var);
    }

    @Override // defpackage.uf10
    public final xe10 createPeriod(sf10 sf10Var, au1 au1Var, long j) {
        m3c m3cVar = new m3c(this.D.createPeriod(sf10Var, au1Var, j), this.F, this.K, this.L);
        this.G.add(m3cVar);
        return m3cVar;
    }

    @Override // defpackage.ekd, defpackage.c45
    public final void g() {
        super.g();
        this.J = null;
        this.I = null;
    }

    @Override // defpackage.ekd, defpackage.uf10
    public final void maybeThrowSourceInfoRefreshError() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.J;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // defpackage.ob51
    public final void q(a9z0 a9z0Var) {
        if (this.J != null) {
            return;
        }
        t(a9z0Var);
    }

    @Override // defpackage.uf10
    public final void releasePeriod(xe10 xe10Var) {
        ArrayList arrayList = this.G;
        d6z.x(arrayList.remove(xe10Var));
        this.D.releasePeriod(((m3c) xe10Var).a);
        if (arrayList.isEmpty()) {
            o3c o3cVar = this.I;
            o3cVar.getClass();
            t(o3cVar.b);
        }
    }

    public final void t(a9z0 a9z0Var) {
        long j;
        z8z0 z8z0Var = this.H;
        a9z0Var.o(z8z0Var, 0);
        long j2 = z8z0Var.o;
        o3c o3cVar = this.I;
        long j3 = this.E;
        ArrayList arrayList = this.G;
        if (o3cVar == null || arrayList.isEmpty()) {
            this.K = j2;
            this.L = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m3c m3cVar = (m3c) arrayList.get(i);
                long j4 = this.K;
                long j5 = this.L;
                m3cVar.x = j4;
                m3cVar.y = j5;
            }
            j = 0;
        } else {
            j = this.K - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.L - j2;
        }
        try {
            o3c o3cVar2 = new o3c(a9z0Var, j, j3);
            this.I = o3cVar2;
            f(o3cVar2);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.J = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((m3c) arrayList.get(i2)).z = this.J;
            }
        }
    }
}
