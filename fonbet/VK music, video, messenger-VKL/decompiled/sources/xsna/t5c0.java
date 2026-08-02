package xsna;

import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import java.util.List;
import xsna.ds60;
import xsna.ln50;
import xsna.on50;

/* compiled from: PostMviTask.kt */
/* loaded from: classes4.dex */
public interface t5c0 extends hn50 {

    /* compiled from: PostMviTask.kt */
    public interface a extends t5c0 {

        /* compiled from: PostMviTask.kt */
        /* renamed from: xsna.t5c0$a$a, reason: collision with other inner class name */
        public static final class C3720a implements a {
            public final Post b;

            public C3720a(Post post) {
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

        /* compiled from: PostMviTask.kt */
        public static final class b implements a {
            public final Post b;

            public b(Post post) {
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

        /* compiled from: PostMviTask.kt */
        public static final class c implements a {
            public final Post b;

            public c(Post post) {
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

    /* compiled from: PostMviTask.kt */
    public interface b extends t5c0 {

        /* compiled from: PostMviTask.kt */
        public static final class a implements b {
            public static final a b = new a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return on50.a.a;
            }
        }

        /* compiled from: PostMviTask.kt */
        /* renamed from: xsna.t5c0$b$b, reason: collision with other inner class name */
        public static final class C3721b implements b {
            public final Group b;

            public C3721b(Group group) {
                this.b = group;
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

        /* compiled from: PostMviTask.kt */
        public static final class c implements b {
            public final List<LikeInfo> b;

            public c(List<LikeInfo> list) {
                this.b = list;
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

        /* compiled from: PostMviTask.kt */
        public static final class d implements b {
            public final int b;

            public d(int i) {
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

        /* compiled from: PostMviTask.kt */
        public static final class e implements b {
            public final UserProfile b;

            public e(UserProfile userProfile) {
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

        /* compiled from: PostMviTask.kt */
        public static final class f implements b {
            public final UserId b;

            public f(UserId userId) {
                this.b = userId;
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

    /* compiled from: PostMviTask.kt */
    public interface c extends t5c0 {

        /* compiled from: PostMviTask.kt */
        public static final class a implements c, sn50<ds60.a> {
            public final ds60.a b;

            public a(ds60.a aVar) {
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

        /* compiled from: PostMviTask.kt */
        public static final class b implements c {
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

    /* compiled from: PostMviTask.kt */
    public interface d extends t5c0 {

        /* compiled from: PostMviTask.kt */
        public static final class a implements d {
            public static final a b = new a();

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return a6c0.a;
            }
        }

        /* compiled from: PostMviTask.kt */
        public static final class b implements d {
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

        /* compiled from: PostMviTask.kt */
        public static final class c implements d {
            public final UserId b;

            public c(UserId userId) {
                this.b = userId;
            }

            @Override // xsna.hn50
            public final ln50<on50> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final on50 getId() {
                return b6c0.a;
            }
        }
    }
}
