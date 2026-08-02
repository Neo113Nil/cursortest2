package xsna;

import com.vk.biometrics.lock.impl.domain.model.UnlockType;

/* compiled from: UnlockItem.kt */
/* loaded from: classes15.dex */
public interface r4q0 {

    /* compiled from: UnlockItem.kt */
    public static final class a implements r4q0 {
        public final int a;
        public final UnlockType b;
        public final long c;
        public final long d;

        public a(int i, UnlockType unlockType, long j, long j2) {
            this.a = i;
            this.b = unlockType;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + bh10.a((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FailureUnlockItem(failureAttempts=");
            sb.append(this.a);
            sb.append(", unlockType=");
            sb.append(this.b);
            sb.append(", startTime=");
            sb.append(this.c);
            sb.append(", endTime=");
            return vu5.a(')', this.d, sb);
        }
    }

    /* compiled from: UnlockItem.kt */
    public static final class b implements r4q0 {
        public final int a;
        public final UnlockType b;

        public b(int i, UnlockType unlockType) {
            this.a = i;
            this.b = unlockType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "SuccessUnlockItem(failureAttempts=" + this.a + ", unlockType=" + this.b + ')';
        }
    }
}
