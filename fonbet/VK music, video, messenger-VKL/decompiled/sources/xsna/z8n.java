package xsna;

import xsna.ds60;
import xsna.ln50;

/* compiled from: DiscoverSimilarFeedMviTask.kt */
/* loaded from: classes4.dex */
public interface z8n extends hn50 {

    /* compiled from: DiscoverSimilarFeedMviTask.kt */
    public interface a extends z8n {

        /* compiled from: DiscoverSimilarFeedMviTask.kt */
        /* renamed from: xsna.z8n$a$a, reason: collision with other inner class name */
        public static final class C4166a implements a {
            public static final C4166a b = new C4166a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return u5n.b;
            }
        }

        /* compiled from: DiscoverSimilarFeedMviTask.kt */
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

    /* compiled from: DiscoverSimilarFeedMviTask.kt */
    public interface b extends z8n {

        /* compiled from: DiscoverSimilarFeedMviTask.kt */
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
