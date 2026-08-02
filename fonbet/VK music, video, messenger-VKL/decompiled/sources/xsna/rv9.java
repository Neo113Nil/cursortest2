package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import org.json.JSONObject;

/* compiled from: CartAction.kt */
/* loaded from: classes18.dex */
public abstract class rv9 implements kj50 {

    /* compiled from: CartAction.kt */
    public static abstract class a extends rv9 {

        /* compiled from: CartAction.kt */
        /* renamed from: xsna.rv9$a$a, reason: collision with other inner class name */
        public static final class C3634a extends a {
            public final UserId b;
            public final Long c;

            public C3634a(UserId userId, Long l) {
                this.b = userId;
                this.c = l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3634a)) {
                    return false;
                }
                C3634a c3634a = (C3634a) obj;
                return epx.f(this.b, c3634a.b) && epx.f(this.c, c3634a.c);
            }

            public final int hashCode() {
                int hashCode = Long.hashCode(this.b.b) * 31;
                Long l = this.c;
                return hashCode + (l == null ? 0 : l.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClearCart(communityId=");
                sb.append(this.b);
                sb.append(", onProductIdRemoval=");
                return iq.b(sb, this.c, ')');
            }
        }

        /* compiled from: CartAction.kt */
        public static final class b extends a {
            public final UserId b;

            public b(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ConfirmClearCart(communityId="), this.b, ')');
            }
        }

        /* compiled from: CartAction.kt */
        public static final class c extends a {
            public final UserId b;

            public c(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("HideCartInfo(communityId="), this.b, ')');
            }
        }

        /* compiled from: CartAction.kt */
        public static final class d extends a {
            public final UserId b;

            public d(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenCommunityShop(communityId="), this.b, ')');
            }
        }

        /* compiled from: CartAction.kt */
        public static final class e extends a {
            public final UserId b;

            public e(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ShowMenu(communityId="), this.b, ')');
            }
        }

        /* compiled from: CartAction.kt */
        public static final class f extends a {
            public final UserId b;

            public f(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("Subscribe(communityId="), this.b, ')');
            }
        }

        /* compiled from: CartAction.kt */
        public static final class g extends a {
            public final UserId b;

            public g(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("WriteToSeller(communityId="), this.b, ')');
            }
        }
    }

    /* compiled from: CartAction.kt */
    public static final class b extends rv9 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -580012724;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: CartAction.kt */
    public static final class c extends rv9 {
        public static final c b = new c();
    }

    /* compiled from: CartAction.kt */
    public static final class d extends rv9 {
        public static final d b = new d();
    }

    /* compiled from: CartAction.kt */
    public static final class e extends rv9 {
        public final UserId b;

        public e(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("LoadNextProductPage(communityId="), this.b, ')');
        }
    }

    /* compiled from: CartAction.kt */
    public static final class f extends rv9 {
        public final JSONObject b;

        public f(JSONObject jSONObject) {
            this.b = jSONObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            JSONObject jSONObject = this.b;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public final String toString() {
            return "MiniAppOzonAction(payloadJson=" + this.b + ')';
        }
    }

    /* compiled from: CartAction.kt */
    public static final class g extends rv9 {
        public final UserId b;

        public g(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenCheckout(communityId="), this.b, ')');
        }
    }

    /* compiled from: CartAction.kt */
    public static final class h extends rv9 {
        public final String b;

        public h(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(link="), this.b, ')');
        }
    }

    /* compiled from: CartAction.kt */
    public static abstract class i extends rv9 {

        /* compiled from: CartAction.kt */
        public static final class a extends i {
            public final a.C0919a b;

            public a(a.C0919a c0919a) {
                this.b = c0919a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "AmountUpdated(id=" + this.b + ')';
            }
        }

        /* compiled from: CartAction.kt */
        public static final class b extends i {
            public final a.C0919a b;

            public b(a.C0919a c0919a) {
                this.b = c0919a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ConfirmRemoveProduct(id=" + this.b + ')';
            }
        }

        /* compiled from: CartAction.kt */
        public static final class c extends i {
            public final a.C0919a b;

            public c(a.C0919a c0919a) {
                this.b = c0919a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "DecrementProductAmount(id=" + this.b + ')';
            }
        }

        /* compiled from: CartAction.kt */
        public static final class d extends i {
            public final a.C0919a b;

            public d(a.C0919a c0919a) {
                this.b = c0919a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "IncrementProductAmount(id=" + this.b + ')';
            }
        }

        /* compiled from: CartAction.kt */
        public static final class e extends i {
            public final a.C0919a b;

            public e(a.C0919a c0919a) {
                this.b = c0919a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "MoveFromCartToFavorite(id=" + this.b + ')';
            }
        }

        /* compiled from: CartAction.kt */
        public static final class f extends i {
            public final a.C0919a b;

            public f(a.C0919a c0919a) {
                this.b = c0919a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenProductFullPage(id=" + this.b + ')';
            }
        }

        /* compiled from: CartAction.kt */
        public static final class g extends i {
            public final a.C0919a b;

            public g(a.C0919a c0919a) {
                this.b = c0919a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "RemoveProduct(id=" + this.b + ')';
            }
        }

        /* compiled from: CartAction.kt */
        public static final class h extends i {
            public final a.C0919a b;

            public h(a.C0919a c0919a) {
                this.b = c0919a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "SelectAnother(id=" + this.b + ')';
            }
        }

        /* compiled from: CartAction.kt */
        /* renamed from: xsna.rv9$i$i, reason: collision with other inner class name */
        public static final class C3635i extends i {
            public final a.C0919a b;

            public C3635i(a.C0919a c0919a) {
                this.b = c0919a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3635i) && epx.f(this.b, ((C3635i) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ToggleFavorite(id=" + this.b + ')';
            }
        }

        /* compiled from: CartAction.kt */
        public static final class j extends i {
            public final a.C0919a b;

            public j(a.C0919a c0919a) {
                this.b = c0919a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ToggleFavoriteError(id=" + this.b + ')';
            }
        }

        /* compiled from: CartAction.kt */
        public static final class k extends i {
            public final a.C0919a b;
            public final boolean c;

            public k(a.C0919a c0919a, boolean z) {
                this.b = c0919a;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return epx.f(this.b, kVar.b) && this.c == kVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ToggleFavoriteSuccess(id=");
                sb.append(this.b);
                sb.append(", isFavorite=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: CartAction.kt */
    public static final class j extends rv9 {
        public static final j b = new j();
    }

    /* compiled from: CartAction.kt */
    public static final class k extends rv9 {
        public static final k b = new k();
    }
}
