package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Post;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import xsna.svh0;

/* compiled from: DigestPostOwnerIdPostIdIndex.kt */
/* loaded from: classes4.dex */
public final class rym implements svh0<a, Digest> {
    public final xg50<pg50<Digest>> a = new xg50<>(0);
    public final qh50<Digest> b = new qh50<>(0);

    /* compiled from: DigestPostOwnerIdPostIdIndex.kt */
    public static final class a extends svh0.a {
        public final UserId a;
        public final int b;

        public a(UserId userId, int i) {
            this.a = userId;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(ownerId=");
            sb.append(this.a);
            sb.append(", postId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    @Override // xsna.svh0
    public final Set<Digest> a(a aVar) {
        Digest b;
        a aVar2 = aVar;
        pg50<Digest> b2 = this.a.b(aVar2.a.b);
        if (b2 == null || (b = b2.b(aVar2.b)) == null) {
            return null;
        }
        return Collections.singleton(b);
    }

    @Override // xsna.svh0
    public final void add(Object obj) {
        if (obj instanceof Digest) {
            Digest digest = (Digest) obj;
            qh50<Digest> qh50Var = this.b;
            if (qh50Var.a(digest)) {
                remove(digest);
            }
            qh50Var.e(digest);
            Iterator it = digest.q.iterator();
            while (it.hasNext()) {
                Post post = (Post) it.next();
                UserId userId = post.m;
                long j = userId.b;
                pg50<Digest> pg50Var = new pg50<>((Object) null);
                xg50<pg50<Digest>> xg50Var = this.a;
                pg50<Digest> c = xg50Var.c(j, pg50Var);
                c.k(post.n, obj);
                if (!xg50Var.a(userId.b)) {
                    xg50Var.i(userId.b, c);
                }
            }
        }
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.d();
        this.b.f();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        if (obj instanceof Digest) {
            Iterator it = ((Digest) obj).q.iterator();
            while (it.hasNext()) {
                Post post = (Post) it.next();
                pg50<Digest> b = this.a.b(post.m.b);
                if (b != null) {
                    b.i(post.n);
                }
            }
            this.b.m(obj);
        }
    }
}
