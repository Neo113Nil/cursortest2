package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import java.util.Collections;
import java.util.Set;
import xsna.svh0;

/* compiled from: PostOwnerIdPostIdIndex.kt */
/* loaded from: classes4.dex */
public final class j6c0 implements svh0<a, Post> {
    public final xg50<pg50<Post>> a = new xg50<>(16);

    /* compiled from: PostOwnerIdPostIdIndex.kt */
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
    public final Set<Post> a(a aVar) {
        Post b;
        a aVar2 = aVar;
        pg50<Post> b2 = this.a.b(aVar2.a.b);
        if (b2 == null || (b = b2.b(aVar2.b)) == null) {
            return null;
        }
        return Collections.singleton(b);
    }

    @Override // xsna.svh0
    public final void add(Object obj) {
        if (obj instanceof Post) {
            Post post = (Post) obj;
            UserId userId = post.m;
            long j = userId.b;
            long j2 = userId.b;
            pg50<Post> pg50Var = new pg50<>((Object) null);
            xg50<pg50<Post>> xg50Var = this.a;
            pg50<Post> c = xg50Var.c(j, pg50Var);
            c.h(post.n, obj);
            if (xg50Var.a(j2)) {
                return;
            }
            xg50Var.i(j2, c);
        }
    }

    @Override // xsna.svh0
    public final void clear() {
        this.a.d();
    }

    @Override // xsna.svh0
    public final void remove(Object obj) {
        if (!(obj instanceof Post)) {
            return;
        }
        xg50<pg50<Post>> xg50Var = this.a;
        Object[] objArr = xg50Var.c;
        long[] jArr = xg50Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((pg50) objArr[(i << 3) + i3]).i(((Post) obj).n);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
