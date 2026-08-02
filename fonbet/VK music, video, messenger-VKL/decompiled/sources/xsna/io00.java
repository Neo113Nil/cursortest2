package xsna;

import com.google.android.gms.maps.model.MarkerOptions;
import xsna.s9u;
import xsna.wl00;

/* compiled from: MarkerManager.java */
/* loaded from: classes13.dex */
public final class io00 extends wl00<eo00, a> implements s9u.e, s9u.h, s9u.i, s9u.b, s9u.f {

    /* compiled from: MarkerManager.java */
    public class a extends wl00.b {
        public s9u.e c;
        public s9u.f d;
        public s9u.h e;

        public a() {
            super(io00.this);
        }

        public final eo00 b(MarkerOptions markerOptions) {
            eo00 a = io00.this.b.a(markerOptions);
            this.a.add(a);
            this.b.d.put(a, this);
            return a;
        }
    }

    @Override // xsna.s9u.f
    public final void a(eo00 eo00Var) {
        s9u.f fVar;
        a aVar = (a) this.d.get(eo00Var);
        if (aVar == null || (fVar = aVar.d) == null) {
            return;
        }
        fVar.a(eo00Var);
    }

    @Override // xsna.s9u.h
    public final boolean e(eo00 eo00Var) {
        s9u.h hVar;
        a aVar = (a) this.d.get(eo00Var);
        if (aVar == null || (hVar = aVar.e) == null) {
            return false;
        }
        return hVar.e(eo00Var);
    }

    @Override // xsna.s9u.e
    public final void f(eo00 eo00Var) {
        s9u.e eVar;
        a aVar = (a) this.d.get(eo00Var);
        if (aVar == null || (eVar = aVar.c) == null) {
            return;
        }
        eVar.f(eo00Var);
    }
}
