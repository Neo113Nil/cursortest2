package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.b3v;
import xsna.hsk0;
import xsna.i3v;
import xsna.q97;
import xsna.x2v;

/* compiled from: HideAppContentFeature.kt */
/* loaded from: classes15.dex */
public final class a3v extends wk50<l3v, j3v, x2v, b3v> {
    public final p97 f;
    public final io.reactivex.rxjava3.subjects.d<q97> g;
    public final f4z h;

    public a3v(p97 p97Var, io.reactivex.rxjava3.subjects.d<q97> dVar) {
        super(x2v.a.b, new g3v(new j3v(false, false, false)));
        this.f = p97Var;
        this.g = dVar;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(j3v j3vVar, x2v x2vVar) {
        j3v j3vVar2 = j3vVar;
        x2v x2vVar2 = x2vVar;
        boolean z = j3vVar2.b;
        boolean z2 = x2vVar2 instanceof x2v.a;
        p97 p97Var = this.f;
        if (z2) {
            T(new b3v.b(p97Var.d(), p97Var.m()));
            return;
        }
        boolean z3 = x2vVar2 instanceof x2v.b;
        io.reactivex.rxjava3.subjects.d<q97> dVar = this.g;
        if (z3) {
            boolean z4 = !j3vVar2.c;
            this.h.b(new i3v.a(new hsk0.e(z4)));
            p97Var.c(z4);
            dVar.onNext(new q97.g(z4));
            T(new b3v.c(z4, z4));
            return;
        }
        if (!(x2vVar2 instanceof x2v.c)) {
            if (!(x2vVar2 instanceof w2v)) {
                throw new NoWhenBranchMatchedException();
            }
            T(new b3v.a());
        } else {
            boolean z5 = !z;
            dVar.onNext(new q97.h(z5));
            p97Var.n(z5);
            T(new b3v.d(z5));
        }
    }
}
