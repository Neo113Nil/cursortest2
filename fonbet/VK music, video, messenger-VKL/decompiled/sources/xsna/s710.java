package xsna;

import com.vk.dto.common.id.UserId;
import xsna.ln50;
import xsna.on50;

/* compiled from: MarketLinkedContentTask.kt */
/* loaded from: classes18.dex */
public interface s710 extends hn50 {

    /* compiled from: MarketLinkedContentTask.kt */
    public static final class a implements s710 {
        public final UserId b;
        public final long c;
        public final int d;
        public final boolean e;

        public a(int i, long j, UserId userId, boolean z) {
            this.b = userId;
            this.c = j;
            this.d = i;
            this.e = z;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + qoy.b(shy.a(this.d, bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadData(ownerId=");
            sb.append(this.b);
            sb.append(", itemId=");
            sb.append(this.c);
            sb.append(", offset=");
            sb.append(this.d);
            sb.append(", isForce=");
            return n23.b(sb, this.e, ", isRefresh=false)");
        }
    }
}
