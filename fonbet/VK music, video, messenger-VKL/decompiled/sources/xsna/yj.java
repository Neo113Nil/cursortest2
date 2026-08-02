package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessTokenRefresher.kt */
/* loaded from: classes15.dex */
public interface yj {

    /* compiled from: AccessTokenRefresher.kt */
    public static final class a {
        public final ArrayList a;
        public final ArrayList b;
        public final List<UserId> c;

        public a(ArrayList arrayList, ArrayList arrayList2, List list) {
            this.a = arrayList;
            this.b = arrayList2;
            this.c = list;
        }

        public final List<UserId> a() {
            return this.b;
        }

        public final List<UserId> b() {
            return this.c;
        }

        public final List<com.vk.api.sdk.auth.a> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RefreshResult(successRefresh=");
            sb.append(this.a);
            sb.append(", errorRefresh=");
            sb.append(this.b);
            sb.append(", noRefreshToken=");
            return vp.b(")", sb, this.c);
        }
    }

    a refresh();
}
