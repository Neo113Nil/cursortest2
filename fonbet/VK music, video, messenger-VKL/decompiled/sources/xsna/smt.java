package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: GeoPostsMviTask.kt */
/* loaded from: classes4.dex */
public interface smt extends hn50 {

    /* compiled from: GeoPostsMviTask.kt */
    public interface a extends smt {

        /* compiled from: GeoPostsMviTask.kt */
        /* renamed from: xsna.smt$a$a, reason: collision with other inner class name */
        public static final class C3680a implements a {
            public static final C3680a b = new C3680a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return tmt.a;
            }
        }

        /* compiled from: GeoPostsMviTask.kt */
        public static final class b implements a {
            public final ds60.f b;

            public b(ds60.f fVar) {
                this.b = fVar;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return this.b.getId();
            }
        }
    }
}
