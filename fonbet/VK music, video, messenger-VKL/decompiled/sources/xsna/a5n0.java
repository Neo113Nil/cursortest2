package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import xsna.ds60;
import xsna.ln50;
import xsna.on50;

/* compiled from: SuggestedPostsMviTask.kt */
/* loaded from: classes4.dex */
public interface a5n0 extends hn50 {

    /* compiled from: SuggestedPostsMviTask.kt */
    public interface a extends a5n0 {

        /* compiled from: SuggestedPostsMviTask.kt */
        /* renamed from: xsna.a5n0$a$a, reason: collision with other inner class name */
        public static final class C2523a implements a {
            public final UserProfile b;

            public C2523a(UserProfile userProfile) {
                this.b = userProfile;
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

        /* compiled from: SuggestedPostsMviTask.kt */
        public static final class b implements a, sn50<ds60.a> {
            public final ds60.a b;

            public b(ds60.a aVar) {
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

        /* compiled from: SuggestedPostsMviTask.kt */
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

        /* compiled from: SuggestedPostsMviTask.kt */
        public static final class d implements a {
            public final Post b;

            public d(Post post) {
                this.b = post;
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

        /* compiled from: SuggestedPostsMviTask.kt */
        public static final class e implements a {
            public final int b;

            public e(int i) {
                this.b = i;
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

        /* compiled from: SuggestedPostsMviTask.kt */
        public static final class f implements a {
            public final Post b;

            public f(Post post) {
                this.b = post;
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

    /* compiled from: SuggestedPostsMviTask.kt */
    public interface b extends a5n0 {

        /* compiled from: SuggestedPostsMviTask.kt */
        public static final class a implements b {
            public static final a b = new a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return ypq.b;
            }
        }

        /* compiled from: SuggestedPostsMviTask.kt */
        /* renamed from: xsna.a5n0$b$b, reason: collision with other inner class name */
        public static final class C2524b implements b {
            public final ds60.f b;

            public C2524b(ds60.f fVar) {
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
