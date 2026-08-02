package xsna;

import com.vk.dto.common.id.UserId;
import xsna.ln50;
import xsna.on50;

/* compiled from: BookingRecordCompletedScreenTask.kt */
/* loaded from: classes18.dex */
public interface ru7 extends hn50 {

    /* compiled from: BookingRecordCompletedScreenTask.kt */
    public static final class a implements ru7 {
        public final UserId b;
        public final int c;

        public a(UserId userId, int i) {
            this.b = userId;
            this.c = i;
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
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelRecord(groupId=");
            sb.append(this.b);
            sb.append(", recordId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: BookingRecordCompletedScreenTask.kt */
    public static final class b implements ru7 {
        public static final b b = new b();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return 1039720989;
        }

        public final String toString() {
            return "LoadRecord";
        }
    }
}
