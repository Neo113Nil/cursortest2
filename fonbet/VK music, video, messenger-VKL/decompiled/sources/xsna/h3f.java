package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.f9j0;

/* compiled from: ClipsShareMemoryStorage.kt */
/* loaded from: classes17.dex */
public final class h3f {
    public volatile a a;

    /* compiled from: ClipsShareMemoryStorage.kt */
    public static final class a {
        public final u3f a;
        public final List<f9j0.c> b;
        public final UserId c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(u3f u3fVar, List<? extends f9j0.c> list, UserId userId) {
            this.a = u3fVar;
            this.b = list;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + fw3.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CacheState(params=");
            sb.append(this.a);
            sb.append(", targets=");
            sb.append(this.b);
            sb.append(", userId=");
            return gp.b(sb, this.c, ')');
        }
    }
}
