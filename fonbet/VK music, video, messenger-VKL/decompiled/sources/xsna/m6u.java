package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: GoodPreviewGoodChangedEvent.kt */
/* loaded from: classes18.dex */
public interface m6u {

    /* compiled from: GoodPreviewGoodChangedEvent.kt */
    public static final class a implements m6u {
        public final long a;
        public final UserId b;

        public a(long j, UserId userId) {
            this.a = j;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return Integer.hashCode(1) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
        }

        public final String toString() {
            return "AddedToCart(id=" + this.a + ", ownerId=" + this.b + ", quantity=1)";
        }
    }

    /* compiled from: GoodPreviewGoodChangedEvent.kt */
    public static final class b implements m6u {
        public final long a;
        public final UserId b;
        public final boolean c;

        public b(long j, UserId userId, boolean z) {
            this.a = j;
            this.b = userId;
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
            return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggledFavourite(id=");
            sb.append(this.a);
            sb.append(", ownerId=");
            sb.append(this.b);
            sb.append(", isFave=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
