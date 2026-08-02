package xsna;

import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ate;
import xsna.gte;

/* compiled from: ClipsPlaylistsFolderNamingReducer.kt */
/* loaded from: classes16.dex */
public final class fte extends dm50<ite, ate, gte> {
    public final Object d;

    public fte() {
        super(gte.b.b);
        this.d = msy.a(LazyThreadSafetyMode.NONE, new r(9));
    }

    @Override // xsna.dm50
    public final gte c(gte gteVar, ate ateVar) {
        gte gteVar2 = gteVar;
        ate ateVar2 = ateVar;
        boolean z = ateVar2 instanceof ate.b;
        gte.a.InterfaceC2955a.d dVar = gte.a.InterfaceC2955a.d.a;
        if (z) {
            if (!(gteVar2 instanceof gte.a)) {
                return new gte.a(((ate.b) ateVar2).b, false, dVar);
            }
            ate.b bVar = (ate.b) ateVar2;
            return defpackage.b.e(bVar.b.a.c) > 25 ? gte.a.a((gte.a) gteVar2, null, true, null, 5) : gte.a.a((gte.a) gteVar2, bVar.b, false, null, 6);
        }
        if (ateVar2 instanceof ate.a) {
            if (gteVar2 instanceof gte.a) {
                return gte.a.a((gte.a) gteVar2, null, false, null, 5);
            }
            fp.d("You should call Animation end only from Content state");
            return gteVar2;
        }
        if (ateVar2.equals(ete.b)) {
            if (gteVar2 instanceof gte.a) {
                return gte.a.a((gte.a) gteVar2, null, false, gte.a.InterfaceC2955a.c.a, 3);
            }
            fp.d("You should call Save only from Content state");
            return gteVar2;
        }
        if (ateVar2 instanceof bte) {
            if (gteVar2 instanceof gte.a) {
                return gte.a.a((gte.a) gteVar2, null, false, new gte.a.InterfaceC2955a.C2956a(((bte) ateVar2).b), 3);
            }
            fp.d("You should call Save only from Content state");
            return gteVar2;
        }
        if (ateVar2.equals(cte.b)) {
            if (gteVar2 instanceof gte.a) {
                return gte.a.a((gte.a) gteVar2, null, false, gte.a.InterfaceC2955a.b.a, 3);
            }
            fp.d("You should call Save only from Content state");
            return gteVar2;
        }
        if (!ateVar2.equals(dte.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (gteVar2 instanceof gte.a) {
            return gte.a.a((gte.a) gteVar2, null, false, dVar, 3);
        }
        fp.d("You should call Save only from Content state");
        return gteVar2;
    }

    @Override // xsna.dm50
    public final ite d() {
        return new ite(e(new oc0(13)), e(new go1(this, 24)));
    }

    @Override // xsna.dm50
    public final void h(gte gteVar, ite iteVar) {
        gte gteVar2 = gteVar;
        ite iteVar2 = iteVar;
        if (gteVar2 instanceof gte.a) {
            f(iteVar2.b, gteVar2);
        } else {
            if (!gteVar2.equals(gte.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f(iteVar2.a, gteVar2);
        }
    }
}
