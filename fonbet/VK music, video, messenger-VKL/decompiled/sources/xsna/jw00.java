package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MarketCountersManager.kt */
/* loaded from: classes18.dex */
public abstract class jw00 {

    /* compiled from: MarketCountersManager.kt */
    public static final class a extends jw00 {
        public static final C3150a c = new C3150a();
        public final int a;
        public final d b = c;

        /* compiled from: MarketCountersManager.kt */
        /* renamed from: xsna.jw00$a$a, reason: collision with other inner class name */
        public static final class C3150a implements d {
        }

        public a(int i) {
            this.a = i;
        }

        @Override // xsna.jw00
        public final int a() {
            return this.a;
        }

        @Override // xsna.jw00
        public final d b() {
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
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Cart(count=" + this.a + ", key=" + this.b + ')';
        }
    }

    /* compiled from: MarketCountersManager.kt */
    public static final class b extends jw00 {
        public final int a;
        public final a b;

        /* compiled from: MarketCountersManager.kt */
        public static final class a implements d {
            public final UserId a;

            public a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                UserId userId;
                UserId a = fkq0.a(this.a);
                UserId userId2 = null;
                a aVar = obj instanceof a ? (a) obj : null;
                if (aVar != null && (userId = aVar.a) != null) {
                    userId2 = fkq0.a(userId);
                }
                return a.equals(userId2);
            }

            public final int hashCode() {
                return Long.hashCode(fkq0.a(this.a).b);
            }

            public final String toString() {
                return String.valueOf(fkq0.a(this.a).b);
            }
        }

        public b(int i, a aVar) {
            this.a = i;
            this.b = aVar;
        }

        @Override // xsna.jw00
        public final int a() {
            return this.a;
        }

        @Override // xsna.jw00
        public final d b() {
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
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "CommunityCart(count=" + this.a + ", key=" + this.b + ')';
        }
    }

    /* compiled from: MarketCountersManager.kt */
    public static final class c extends jw00 {
        public static final a c = new a();
        public final int a;
        public final d b = c;

        /* compiled from: MarketCountersManager.kt */
        public static final class a implements d {
        }

        public c(int i) {
            this.a = i;
        }

        @Override // xsna.jw00
        public final int a() {
            return this.a;
        }

        @Override // xsna.jw00
        public final d b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Fave(count=" + this.a + ", key=" + this.b + ')';
        }
    }

    /* compiled from: MarketCountersManager.kt */
    public interface d {
    }

    public abstract int a();

    public abstract d b();
}
