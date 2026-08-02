package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CartProductChangesPatch.kt */
/* loaded from: classes18.dex */
public abstract class sx9 {

    /* compiled from: CartProductChangesPatch.kt */
    public static final class a extends sx9 {
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
            return gp.b(new StringBuilder("CartCleared(communityId="), this.a, ')');
        }
    }

    /* compiled from: CartProductChangesPatch.kt */
    public static final class b extends sx9 {
        public final UserId a;
        public final long b;
        public final boolean c;

        public b(long j, UserId userId, boolean z) {
            this.a = userId;
            this.b = j;
            this.c = z;
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
            return Boolean.hashCode(this.c) + bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProductFaveChanged(communityId=");
            sb.append(this.a);
            sb.append(", productId=");
            sb.append(this.b);
            sb.append(", isFave=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CartProductChangesPatch.kt */
    public static final class c extends sx9 {
        public final UserId a;
        public final long b;
        public final int c;
        public final int d;

        public c(int i, int i2, long j, UserId userId) {
            this.a = userId;
            this.b = j;
            this.c = i;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProductQuantityChanged(communityId=");
            sb.append(this.a);
            sb.append(", productId=");
            sb.append(this.b);
            sb.append(", oldQuantity=");
            sb.append(this.c);
            sb.append(", newQuantity=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: CartProductChangesPatch.kt */
    public static final class d extends sx9 {
        public final UserId a;
        public final long b;
        public final int c;

        public d(UserId userId, long j, int i) {
            this.a = userId;
            this.b = j;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProductRemoved(communityId=");
            sb.append(this.a);
            sb.append(", productId=");
            sb.append(this.b);
            sb.append(", productCartQuantity=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
