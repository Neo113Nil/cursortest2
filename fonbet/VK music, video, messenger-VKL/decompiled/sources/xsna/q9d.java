package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosSortDto;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.lgj0;
import xsna.mke;

/* compiled from: ClipPlaylistSource.kt */
/* loaded from: classes17.dex */
public abstract class q9d {
    public static final List<String> a = e43.l("verified", "member_status", "friend_status", "first_name_gen", "image_status", "photo_base", "url", "trust_mark");

    /* compiled from: ClipPlaylistSource.kt */
    public static final class a extends q9d {
        public final mke.r.b b;
        public final int c;
        public final boolean d;

        public a(mke.r.b bVar, int i, boolean z) {
            this.b = bVar;
            this.c = i;
            this.d = z;
        }

        @Override // xsna.q9d
        public final dz2 a() {
            ngj0 ngj0Var = new ngj0();
            mke.r.b bVar = this.b;
            UserId userId = bVar.a;
            int i = bVar.b;
            return yfb.x(lgj0.a.g(ngj0Var, userId, Integer.valueOf(this.c), null, q9d.a, null, null, Integer.valueOf(i), null, bVar.e, this.d ? ShortVideoGetOwnerVideosSortDto.ASC : ShortVideoGetOwnerVideosSortDto.DESC, 64180));
        }

        @Override // xsna.q9d
        public final boolean c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialFromMiddle(params=");
            sb.append(this.b);
            sb.append(", count=");
            sb.append(this.c);
            sb.append(", isForward=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ClipPlaylistSource.kt */
    public static final class b extends q9d {
        public final mke.r b;
        public final int c;
        public final boolean d;
        public final PaginationKey e;

        public b(mke.r rVar, int i, boolean z, PaginationKey paginationKey) {
            this.b = rVar;
            this.c = i;
            this.d = z;
            this.e = paginationKey;
        }

        @Override // xsna.q9d
        public final dz2 a() {
            ngj0 ngj0Var = new ngj0();
            mke.r rVar = this.b;
            UserId c = rVar.c();
            int b = rVar.b();
            return yfb.x(lgj0.a.g(ngj0Var, c, Integer.valueOf(this.c), this.e.zb(), q9d.a, null, null, Integer.valueOf(b), null, null, this.d ? ShortVideoGetOwnerVideosSortDto.ASC : ShortVideoGetOwnerVideosSortDto.DESC, 64432));
        }

        @Override // xsna.q9d
        public final boolean c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        }

        public final String toString() {
            return "NextPage(params=" + this.b + ", count=" + this.c + ", isForward=" + this.d + ", paginationKey=" + this.e + ')';
        }
    }

    public abstract dz2 a();

    public final io.reactivex.rxjava3.internal.operators.single.y b() {
        dz2 a2 = a();
        ahn.D(a2);
        return rsg0.W(a2, 7).l(new com.vk.movika.sdk.base.hooks.k(new t9(this, 24), 10));
    }

    public abstract boolean c();
}
