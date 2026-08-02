package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import java.util.Set;
import xsna.svh0;

/* compiled from: PostPublisherIdIndex.kt */
/* loaded from: classes4.dex */
public final class y6c0 implements svh0<a, Post> {
    public final xg50<qh50<Post>> a = new xg50<>(16);

    /* compiled from: PostPublisherIdIndex.kt */
    public static final class a extends svh0.a {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Key(publisherId="), this.a, ')');
        }
    }

    @Override // xsna.svh0
    public final Set<Post> a(a aVar) {
        qh50<Post> b = this.a.b(aVar.a.b);
        if (b != null) {
            return new fzi0(b);
        }
        return null;
    }

    @Override // xsna.svh0
    public final void add(Object obj) {
        if (obj instanceof Post) {
            long j = ((Post) obj).o.b.b;
            qh50<Post> qh50Var = new qh50<>((Object) null);
            xg50<qh50<Post>> xg50Var = this.a;
            qh50<Post> c = xg50Var.c(j, qh50Var);
            c.e(obj);
            if (xg50Var.a(j)) {
                return;
            }
            xg50Var.i(j, c);
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
        xg50<qh50<Post>> xg50Var = this.a;
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
                        ((qh50) objArr[(i << 3) + i3]).m(obj);
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
