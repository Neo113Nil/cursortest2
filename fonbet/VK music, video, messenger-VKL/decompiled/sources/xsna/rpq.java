package xsna;

import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.entities.FavePage;
import xsna.ds60;
import xsna.ln50;
import xsna.on50;

/* compiled from: FaveFeedMviTask.kt */
/* loaded from: classes4.dex */
public interface rpq extends hn50 {

    /* compiled from: FaveFeedMviTask.kt */
    public interface a extends rpq {

        /* compiled from: FaveFeedMviTask.kt */
        /* renamed from: xsna.rpq$a$a, reason: collision with other inner class name */
        public static final class C3621a implements a, sn50<ds60.a> {
            public final ds60.a b;

            public C3621a(ds60.a aVar) {
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
                return on50.a.a;
            }
        }

        /* compiled from: FaveFeedMviTask.kt */
        public static final class b implements a {
            public static final b b = new b();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }
    }

    /* compiled from: FaveFeedMviTask.kt */
    public interface b extends rpq {

        /* compiled from: FaveFeedMviTask.kt */
        public static final class a implements b {
            public final FavePage b;

            public a(FavePage favePage) {
                this.b = favePage;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: FaveFeedMviTask.kt */
        /* renamed from: xsna.rpq$b$b, reason: collision with other inner class name */
        public static final class C3622b implements b {
            public final FavePage b;

            public C3622b(FavePage favePage) {
                this.b = favePage;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }
    }

    /* compiled from: FaveFeedMviTask.kt */
    public interface c extends rpq {

        /* compiled from: FaveFeedMviTask.kt */
        public static final class a implements c {
            public static final a b = new a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return ypq.a;
            }
        }

        /* compiled from: FaveFeedMviTask.kt */
        public static final class b implements c {
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

        /* compiled from: FaveFeedMviTask.kt */
        /* renamed from: xsna.rpq$c$c, reason: collision with other inner class name */
        public static final class C3623c implements c {
            public final FaveTag b;

            public C3623c(FaveTag faveTag) {
                this.b = faveTag;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return zpq.a;
            }
        }
    }
}
