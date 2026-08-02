package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: PostponedPostsMviTask.kt */
/* loaded from: classes4.dex */
public interface zsc0 extends hn50 {

    /* compiled from: PostponedPostsMviTask.kt */
    public interface a extends zsc0 {

        /* compiled from: PostponedPostsMviTask.kt */
        /* renamed from: xsna.zsc0$a$a, reason: collision with other inner class name */
        public static final class C4196a implements a {
            public static final C4196a b = new C4196a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return atc0.a;
            }
        }

        /* compiled from: PostponedPostsMviTask.kt */
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

        /* compiled from: PostponedPostsMviTask.kt */
        public static final class c implements a {
            public final long b;

            public c(long j) {
                this.b = j;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return btc0.a;
            }
        }
    }

    /* compiled from: PostponedPostsMviTask.kt */
    public interface b extends zsc0 {

        /* compiled from: PostponedPostsMviTask.kt */
        public static final class a implements b {
            public final ds60.g b;

            public a(ds60.g gVar) {
                this.b = gVar;
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
