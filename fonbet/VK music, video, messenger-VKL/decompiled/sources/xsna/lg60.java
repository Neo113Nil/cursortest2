package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: NewsfeedCustomMviTask.kt */
/* loaded from: classes4.dex */
public interface lg60 extends hn50 {

    /* compiled from: NewsfeedCustomMviTask.kt */
    public interface a extends lg60 {

        /* compiled from: NewsfeedCustomMviTask.kt */
        /* renamed from: xsna.lg60$a$a, reason: collision with other inner class name */
        public static final class C3266a implements a {
            public static final C3266a b = new C3266a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return v5n.b;
            }
        }

        /* compiled from: NewsfeedCustomMviTask.kt */
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

        /* compiled from: NewsfeedCustomMviTask.kt */
        public static final class c implements a {
            public static final c b = new c();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return w5n.b;
            }
        }

        /* compiled from: NewsfeedCustomMviTask.kt */
        public static final class d implements a {
            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return mg60.a;
            }
        }
    }
}
