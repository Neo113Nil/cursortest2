package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AlbumsRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class up1 implements kv8 {
    public final el1 b;
    public final aha0 a = new aha0();
    public final bpn0 c = new bpn0(new com.vk.movika.sdk.base.logic.interactor.g(2));
    public final iv8 d = new iv8();
    public final iv8 e = new iv8();
    public final iv8 f = new iv8();

    /* compiled from: AlbumsRepositoryImpl.kt */
    public static final class a {
        public final UserId a;
        public final int b;
        public final int c;

        public a(UserId userId, int i, int i2) {
            this.a = userId;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestAllAlbums(ownerId=");
            sb.append(this.a);
            sb.append(", count=");
            sb.append(this.b);
            sb.append(", offset=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: AlbumsRepositoryImpl.kt */
    public static final class b {
        public final UserId a;
        public final int b;
        public final int c;

        public b(UserId userId, int i, int i2) {
            this.a = userId;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestNonSystemAlbums(ownerId=");
            sb.append(this.a);
            sb.append(", count=");
            sb.append(this.b);
            sb.append(", offset=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public up1(el1 el1Var) {
        this.b = el1Var;
    }

    @Override // com.vk.photos.root.photoflow.domain.AlbumsRepository
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(int i, UserId userId) {
        return rsg0.T(yfb.x(zga0.c(this.a, userId, Collections.singletonList(Integer.valueOf(i)), null, null, Boolean.valueOf(i < 0), 26))).U(new e10(new a7(this, i, userId, 1), 3));
    }

    @Override // com.vk.photos.root.photoflow.domain.AlbumsRepository
    public final io.reactivex.rxjava3.internal.operators.observable.b1 b(int i, UserId userId, Integer num, Integer num2) {
        this.a.getClass();
        tfx tfxVar = new tfx("photos.reorderAlbums", new at(28), new bt(25));
        tfx.l(tfxVar, "album_id", i, 0, 0, 12);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "before", num.intValue(), 0, 0, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "after", num2.intValue(), 0, 0, 12);
        }
        return new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.T(yfb.x(tfxVar)));
    }

    @Override // com.vk.photos.root.photoflow.domain.AlbumsRepository
    public final io.reactivex.rxjava3.core.q c(final int i, final int i2, final UserId userId, boolean z) {
        if (z) {
            g();
        }
        return this.f.a(new b(userId, i, i2), new gzs() { // from class: xsna.mp1
            @Override // xsna.gzs
            public final Object invoke() {
                up1 up1Var = up1.this;
                return rsg0.T(yfb.x(zga0.c(up1Var.a, userId, null, Integer.valueOf(i2), Integer.valueOf(i), Boolean.FALSE, 6))).U(new np1(new t6(up1Var, 3), 0));
            }
        });
    }

    @Override // com.vk.photos.root.photoflow.domain.AlbumsRepository
    public final io.reactivex.rxjava3.internal.operators.completable.w d(final int i, final UserId userId) {
        this.a.getClass();
        tfx tfxVar = new tfx("photos.deleteAlbum", new cq(25), new dq(24));
        tfx.l(tfxVar, "album_id", i, 0, 0, 8);
        return new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.T(yfb.x(tfxVar))).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.qp1
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                ysg0.b.a(new ok1(i, userId));
            }
        });
    }

    @Override // com.vk.photos.root.photoflow.domain.AlbumsRepository
    public final void e() {
        g();
    }

    @Override // com.vk.photos.root.photoflow.domain.AlbumsRepository
    public final io.reactivex.rxjava3.core.q f(final int i, final int i2, final UserId userId, boolean z) {
        if (z) {
            g();
        }
        return this.d.a(new a(userId, i, i2), new gzs() { // from class: xsna.pp1
            @Override // xsna.gzs
            public final Object invoke() {
                up1 up1Var = up1.this;
                int i3 = i;
                int i4 = i2;
                UserId userId2 = userId;
                return up1Var.c(i3, i4, userId2, false).L(new tp1(new sp1(i3, up1Var, userId2), 0), false);
            }
        });
    }

    @Override // xsna.kv8
    public final void g() {
        iv8 iv8Var = this.d;
        ((ConcurrentHashMap) iv8Var.b).clear();
        ((ConcurrentHashMap) iv8Var.c).clear();
        iv8 iv8Var2 = this.e;
        ((ConcurrentHashMap) iv8Var2.b).clear();
        ((ConcurrentHashMap) iv8Var2.c).clear();
        iv8 iv8Var3 = this.f;
        ((ConcurrentHashMap) iv8Var3.b).clear();
        ((ConcurrentHashMap) iv8Var3.c).clear();
    }

    @Override // com.vk.photos.root.photoflow.domain.AlbumsRepository
    public final io.reactivex.rxjava3.core.q<VKList<PhotoAlbum>> h(UserId userId, boolean z) {
        if (z) {
            g();
        }
        return this.e.a(userId, new rp1(0, this, userId));
    }
}
