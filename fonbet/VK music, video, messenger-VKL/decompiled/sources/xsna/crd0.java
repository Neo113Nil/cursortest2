package xsna;

import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;

/* compiled from: ProductPreviewNavigationEvent.kt */
/* loaded from: classes18.dex */
public interface crd0 {

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class a implements crd0 {
        public final jz00 a;

        public a(jz00 jz00Var) {
            this.a = jz00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Call(params=" + this.a + ')';
        }
    }

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class b implements crd0 {
        public static final b a = new b();
    }

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class c implements crd0 {
        public static final c a = new c();
    }

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class d implements crd0 {
        public final UserId a;
        public final Integer b;

        public d(UserId userId, Integer num) {
            this.a = userId;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.b) * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCart(ownerId=");
            sb.append(this.a);
            sb.append(", cartQuantity=");
            return uqi.b(sb, this.b, ')');
        }
    }

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class e implements crd0 {
        public final Good a;

        public e(Good good) {
            this.a = good;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenChat(good=" + this.a + ')';
        }
    }

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class f implements crd0 {
        public final UserId a;
        public final long b;

        public f(long j, UserId userId) {
            this.a = userId;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCheckout(groupId=");
            sb.append(this.a);
            sb.append(", itemId=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class g implements crd0 {
        public final String a;

        public g(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(link="), this.a, ')');
        }
    }

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class h implements crd0 {
        public static final h a = new h();
    }

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class i implements crd0 {
        public final Good a;
        public final Integer b;

        public i(Good good, Integer num) {
            this.a = good;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenProductCard(good=");
            sb.append(this.a);
            sb.append(", position=");
            return uqi.b(sb, this.b, ')');
        }
    }

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class j implements crd0 {
        public final UserId a;
        public final long b;
        public final boolean c;

        public j(long j, UserId userId, boolean z) {
            this.a = userId;
            this.b = j;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.a, jVar.a) && this.b == jVar.b && this.c == jVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenSearch(ownerId=");
            sb.append(this.a);
            sb.append(", itemId=");
            sb.append(this.b);
            sb.append(", openVoiceSearch=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ProductPreviewNavigationEvent.kt */
    public static final class k implements crd0 {
        public final Good a;

        public k(Good good) {
            this.a = good;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShareGood(good=" + this.a + ')';
        }
    }
}
