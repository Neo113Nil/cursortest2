package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipsProfileToolbarState.kt */
/* loaded from: classes17.dex */
public interface hye extends km50 {

    /* compiled from: ClipsProfileToolbarState.kt */
    public static final class a implements hye {
        public final boolean b;
        public final UserId c;
        public final List d;
        public final int e;

        public a(int i, UserId userId, List list, boolean z) {
            this.b = z;
            this.c = userId;
            this.d = list;
            this.e = i;
        }

        public static a a(a aVar, List list) {
            boolean z = aVar.b;
            UserId userId = aVar.c;
            int i = aVar.e;
            aVar.getClass();
            return new a(i, userId, list, z);
        }

        @Override // xsna.hye
        public final boolean F0() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            UserId userId = this.c;
            return Integer.hashCode(this.e) + fw3.a((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.d);
        }

        @Override // xsna.hye
        public final UserId p() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(isOwnerGrid=");
            sb.append(this.b);
            sb.append(", initialAuthorId=");
            sb.append(this.c);
            sb.append(", user=");
            mr.c(", initialPage=", sb, this.d);
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: ClipsProfileToolbarState.kt */
    public static final class b implements hye {
        public final boolean b;
        public final UserId c;

        public b(UserId userId, boolean z) {
            this.b = z;
            this.c = userId;
        }

        @Override // xsna.hye
        public final boolean F0() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            UserId userId = this.c;
            return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
        }

        @Override // xsna.hye
        public final UserId p() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(isOwnerGrid=");
            sb.append(this.b);
            sb.append(", initialAuthorId=");
            return gp.b(sb, this.c, ')');
        }
    }

    boolean F0();

    UserId p();
}
