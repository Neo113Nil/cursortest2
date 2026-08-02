package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: ReactionsFeedMviTask.kt */
/* loaded from: classes4.dex */
public interface y4f0 extends hn50 {

    /* compiled from: ReactionsFeedMviTask.kt */
    public interface a extends y4f0 {

        /* compiled from: ReactionsFeedMviTask.kt */
        /* renamed from: xsna.y4f0$a$a, reason: collision with other inner class name */
        public static final class C4075a implements a {
            public static final C4075a b = new C4075a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return v5n.c;
            }
        }

        /* compiled from: ReactionsFeedMviTask.kt */
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

        /* compiled from: ReactionsFeedMviTask.kt */
        public static final class c implements a {
            public final String b;

            public c(String str) {
                this.b = str;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return w5n.c;
            }
        }
    }
}
