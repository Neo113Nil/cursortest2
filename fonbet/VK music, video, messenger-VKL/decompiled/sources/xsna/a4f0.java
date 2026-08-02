package xsna;

import xsna.xn60;

/* compiled from: ReactionsFeedMviAction.kt */
/* loaded from: classes4.dex */
public interface a4f0 extends lj50 {

    /* compiled from: ReactionsFeedMviAction.kt */
    public static final class a implements a4f0 {
        public final String b;

        public a(String str) {
            this.b = str;
        }
    }

    /* compiled from: ReactionsFeedMviAction.kt */
    public static final class b implements a4f0, pj50<xn60.a> {
        public final xn60.a b;

        public b(xn60.a aVar) {
            this.b = aVar;
        }

        @Override // xsna.pj50
        public final xn60.a h() {
            return this.b;
        }
    }

    /* compiled from: ReactionsFeedMviAction.kt */
    public static final class c implements a4f0, pj50<xn60.b> {
        public final xn60.b b;

        public c(xn60.b bVar) {
            this.b = bVar;
        }

        @Override // xsna.pj50
        public final xn60.b h() {
            return this.b;
        }
    }

    /* compiled from: ReactionsFeedMviAction.kt */
    public static final class d implements a4f0, pj50<xn60.d> {
        public final xn60.d b;

        public d(xn60.d dVar) {
            this.b = dVar;
        }

        @Override // xsna.pj50
        public final xn60.d h() {
            return this.b;
        }
    }
}
