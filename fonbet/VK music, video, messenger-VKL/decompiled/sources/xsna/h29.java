package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.a29;
import xsna.f29;

/* compiled from: CallDebugMenuReducer.kt */
/* loaded from: classes7.dex */
public final class h29 extends dm50<p29, f29, a29> {
    public h29() {
        super(new a29(0));
    }

    @Override // xsna.dm50
    public final a29 c(a29 a29Var, f29 f29Var) {
        a29 a29Var2 = a29Var;
        f29 f29Var2 = f29Var;
        a29.b bVar = a29Var2.c;
        if (f29Var2 instanceof f29.c) {
            boolean z = ((f29.c) f29Var2).b;
            boolean z2 = bVar.a;
            bVar.getClass();
            return a29.a(a29Var2, null, new a29.b(z2, z), null, null, null, null, 61);
        }
        if (f29Var2 instanceof f29.a) {
            a29.a aVar = a29Var2.b;
            String str = ((f29.a) f29Var2).b;
            aVar.getClass();
            return a29.a(a29Var2, new a29.a(str), null, null, null, null, null, 62);
        }
        if (f29Var2 instanceof f29.b) {
            f29.b bVar2 = (f29.b) f29Var2;
            boolean z3 = bVar2.b;
            boolean z4 = bVar.b;
            bVar.getClass();
            a29.b bVar3 = new a29.b(z3, z4);
            a29Var2.d.getClass();
            return a29.a(a29Var2, null, bVar3, new a29.d(z3), a29.c.a(a29Var2.e, bVar2.b, false, false, false, 14), null, null, 49);
        }
        if (f29Var2 instanceof f29.d) {
            f29.d dVar = (f29.d) f29Var2;
            return a29.a(a29Var2, null, null, null, a29.c.a(a29Var2.e, false, dVar.b, dVar.c, dVar.d, 1), null, null, 55);
        }
        if (f29Var2 instanceof f29.f) {
            a29.f fVar = a29Var2.f;
            boolean z5 = ((f29.f) f29Var2).b;
            fVar.getClass();
            return a29.a(a29Var2, null, null, null, null, new a29.f(z5), null, 47);
        }
        if (!(f29Var2 instanceof f29.e)) {
            throw new NoWhenBranchMatchedException();
        }
        a29.e eVar = a29Var2.g;
        boolean z6 = ((f29.e) f29Var2).b;
        eVar.getClass();
        return a29.a(a29Var2, null, null, null, null, null, new a29.e(z6), 31);
    }

    @Override // xsna.dm50
    public final p29 d() {
        return new p29(e(new yx0(this, 13)));
    }

    @Override // xsna.dm50
    public final void h(a29 a29Var, p29 p29Var) {
        f(p29Var.a, a29Var);
    }
}
