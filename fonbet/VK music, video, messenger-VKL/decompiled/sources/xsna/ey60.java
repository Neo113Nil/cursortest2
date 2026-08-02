package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: NewsfeedSearchMviTask.kt */
/* loaded from: classes4.dex */
public interface ey60 extends hn50 {

    /* compiled from: NewsfeedSearchMviTask.kt */
    public interface a extends ey60 {

        /* compiled from: NewsfeedSearchMviTask.kt */
        /* renamed from: xsna.ey60$a$a, reason: collision with other inner class name */
        public static final class C2840a implements a, sn50<ds60.a> {
            public final ds60.a b;

            public C2840a(ds60.a aVar) {
                this.b = aVar;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.sn50
            public final ds60.a e() {
                return this.b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return this.b.getId();
            }
        }
    }

    /* compiled from: NewsfeedSearchMviTask.kt */
    public interface b extends ey60 {

        /* compiled from: NewsfeedSearchMviTask.kt */
        public static final class a implements b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return ckf.b;
            }
        }

        /* compiled from: NewsfeedSearchMviTask.kt */
        /* renamed from: xsna.ey60$b$b, reason: collision with other inner class name */
        public static final class C2841b implements b {
            public static final C2841b b = new C2841b();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return dkf.b;
            }
        }

        /* compiled from: NewsfeedSearchMviTask.kt */
        public static final class c implements b {
            public final ds60.f b;

            public c(ds60.f fVar) {
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

        /* compiled from: NewsfeedSearchMviTask.kt */
        public static final class d implements b {
            public final String b;

            public d(String str) {
                this.b = str;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return fkf.b;
            }
        }
    }

    /* compiled from: NewsfeedSearchMviTask.kt */
    public interface c extends ey60 {

        /* compiled from: NewsfeedSearchMviTask.kt */
        public static final class a implements c, sn50<ds60.g> {
            public final ds60.g b;

            public a(ds60.g gVar) {
                this.b = gVar;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.sn50
            public final ds60.g e() {
                return this.b;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return this.b.getId();
            }
        }
    }
}
