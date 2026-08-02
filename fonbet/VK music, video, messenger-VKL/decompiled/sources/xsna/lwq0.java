package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.ds60;
import xsna.ln50;
import xsna.on50;

/* compiled from: UserProfileWallMviTask.kt */
/* loaded from: classes4.dex */
public interface lwq0 extends hn50 {

    /* compiled from: UserProfileWallMviTask.kt */
    public interface a extends lwq0 {

        /* compiled from: UserProfileWallMviTask.kt */
        /* renamed from: xsna.lwq0$a$a, reason: collision with other inner class name */
        public static final class C3305a implements a, sn50<ds60.a> {
            public final ds60.a b;

            public C3305a(ds60.a aVar) {
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

        /* compiled from: UserProfileWallMviTask.kt */
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

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class c implements a {
            public static final c b = new c();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class d implements a {
            public final NewsEntry b;

            public d(NewsEntry newsEntry) {
                this.b = newsEntry;
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

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class e implements a {
            public final NewsEntry b;

            public e(NewsEntry newsEntry) {
                this.b = newsEntry;
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

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class f implements a {
            public static final f b = new f();

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

    /* compiled from: UserProfileWallMviTask.kt */
    public interface b extends lwq0 {

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class a implements b {
            public final UserId b;
            public final int c;

            public a(UserId userId, int i) {
                this.b = userId;
                this.c = i;
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

        /* compiled from: UserProfileWallMviTask.kt */
        /* renamed from: xsna.lwq0$b$b, reason: collision with other inner class name */
        public static final class C3306b implements b {
            public final UserId b;
            public final boolean c;

            public C3306b(UserId userId, boolean z) {
                this.b = userId;
                this.c = z;
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

    /* compiled from: UserProfileWallMviTask.kt */
    public interface c extends lwq0 {

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class a implements c {
        }

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class b implements c {
            public static final b b = new b();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return atc0.b;
            }
        }

        /* compiled from: UserProfileWallMviTask.kt */
        /* renamed from: xsna.lwq0$c$c, reason: collision with other inner class name */
        public static final class C3307c implements c {
            public final ds60.f b;

            public C3307c(ds60.f fVar) {
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

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class d implements c {
            public final NewsEntry b;

            public d(Post post) {
                this.b = post;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return btc0.b;
            }
        }

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class e implements c {
            public static final e b = new e();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return swq0.a;
            }
        }

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class f implements c {
            public final int b;

            public f(int i) {
                this.b = i;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return twq0.a;
            }
        }

        /* compiled from: UserProfileWallMviTask.kt */
        public static final class g implements c {
            public static final g b = new g();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return uwq0.a;
            }
        }
    }
}
