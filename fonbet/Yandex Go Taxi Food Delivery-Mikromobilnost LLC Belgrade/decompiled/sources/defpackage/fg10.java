package defpackage;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class fg10 implements yf10, nmm {
    public final hg10 a;
    public final /* synthetic */ jg10 b;

    public fg10(jg10 jg10Var, hg10 hg10Var) {
        this.b = jg10Var;
        this.a = hg10Var;
    }

    public final Pair a(int i, sf10 sf10Var) {
        sf10 sf10Var2;
        hg10 hg10Var = this.a;
        sf10 sf10Var3 = null;
        if (sf10Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= hg10Var.c.size()) {
                    sf10Var2 = null;
                    break;
                }
                if (((sf10) hg10Var.c.get(i2)).d == sf10Var.d) {
                    Object obj = sf10Var.a;
                    Object obj2 = hg10Var.b;
                    int i3 = kzc0.k;
                    sf10Var2 = sf10Var.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (sf10Var2 == null) {
                return null;
            }
            sf10Var3 = sf10Var2;
        }
        return Pair.create(Integer.valueOf(i + hg10Var.d), sf10Var3);
    }

    @Override // defpackage.yf10
    public final void onDownstreamFormatChanged(int i, sf10 sf10Var, he10 he10Var) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new bg10(this, a, he10Var, 1));
        }
    }

    @Override // defpackage.nmm
    public final void onDrmKeysLoaded(int i, sf10 sf10Var) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new eg10(this, a, 3));
        }
    }

    @Override // defpackage.nmm
    public final void onDrmKeysRemoved(int i, sf10 sf10Var) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new eg10(this, a, 0));
        }
    }

    @Override // defpackage.nmm
    public final void onDrmKeysRestored(int i, sf10 sf10Var) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new eg10(this, a, 1));
        }
    }

    @Override // defpackage.nmm
    public final void onDrmSessionAcquired(int i, sf10 sf10Var, int i2) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new z50(this, a, i2, 9));
        }
    }

    @Override // defpackage.nmm
    public final void onDrmSessionManagerError(int i, sf10 sf10Var, Exception exc) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new p7h(29, this, a, exc));
        }
    }

    @Override // defpackage.nmm
    public final void onDrmSessionReleased(int i, sf10 sf10Var) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new eg10(this, a, 2));
        }
    }

    @Override // defpackage.yf10
    public final void onLoadCanceled(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new dg10(this, a, uwyVar, he10Var, 0));
        }
    }

    @Override // defpackage.yf10
    public final void onLoadCompleted(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new dg10(this, a, uwyVar, he10Var, 1));
        }
    }

    @Override // defpackage.yf10
    public final void onLoadError(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new cg10(this, a, uwyVar, he10Var, iOException, z, 0));
        }
    }

    @Override // defpackage.yf10
    public final void onLoadStarted(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var, int i2) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new nbb(this, a, uwyVar, he10Var, i2));
        }
    }

    @Override // defpackage.yf10
    public final void onUpstreamDiscarded(int i, sf10 sf10Var, he10 he10Var) {
        Pair a = a(i, sf10Var);
        if (a != null) {
            this.b.i.e(new bg10(this, a, he10Var, 0));
        }
    }
}
