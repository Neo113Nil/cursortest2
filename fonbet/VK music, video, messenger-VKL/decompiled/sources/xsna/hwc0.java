package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: PostsFromNotificationsMviTask.kt */
/* loaded from: classes4.dex */
public interface hwc0 extends hn50 {

    /* compiled from: PostsFromNotificationsMviTask.kt */
    public interface a extends hwc0 {

        /* compiled from: PostsFromNotificationsMviTask.kt */
        /* renamed from: xsna.hwc0$a$a, reason: collision with other inner class name */
        public static final class C3025a implements a {
            public static final C3025a b = new C3025a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return zpq.b;
            }
        }

        /* compiled from: PostsFromNotificationsMviTask.kt */
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

    /* compiled from: PostsFromNotificationsMviTask.kt */
    public interface b extends hwc0 {

        /* compiled from: PostsFromNotificationsMviTask.kt */
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
