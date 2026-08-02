package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.tags.Tag;

/* compiled from: PickerTag.kt */
/* loaded from: classes4.dex */
public interface via0 {

    /* compiled from: PickerTag.kt */
    public static final class a implements via0 {
        public final Tag a;
        public final UserId b;
        public final long c;
        public final Good d;

        public a(Tag tag, UserId userId, long j, Good good) {
            this.a = tag;
            this.b = userId;
            this.c = j;
            this.d = good;
        }

        @Override // xsna.via0
        public final Long a() {
            return Long.valueOf(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        @Override // xsna.via0
        public final Tag getTag() {
            return this.a;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            UserId userId = this.b;
            return this.d.hashCode() + bh10.a((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.c);
        }

        public final String toString() {
            return "LocalTag(tag=" + this.a + ", goodOwnerId=" + this.b + ", goodId=" + this.c + ", good=" + this.d + ')';
        }
    }

    /* compiled from: PickerTag.kt */
    public static final class b implements via0 {
        public final Tag a;
        public final UserId b;
        public final Long c;

        public b(Tag tag, UserId userId, Long l) {
            this.a = tag;
            this.b = userId;
            this.c = l;
        }

        @Override // xsna.via0
        public final Long a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        @Override // xsna.via0
        public final Tag getTag() {
            return this.a;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            UserId userId = this.b;
            int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            Long l = this.c;
            return hashCode2 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteTag(tag=");
            sb.append(this.a);
            sb.append(", goodOwnerId=");
            sb.append(this.b);
            sb.append(", goodId=");
            return iq.b(sb, this.c, ')');
        }
    }

    Long a();

    Tag getTag();
}
