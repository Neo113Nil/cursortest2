package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.Cart;
import com.vk.ecomm.cart.impl.cart.feature.state.ExternalOrderState;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CartPatch.kt */
/* loaded from: classes18.dex */
public interface px9 extends xl50 {

    /* compiled from: CartPatch.kt */
    public interface a extends px9 {

        /* compiled from: CartPatch.kt */
        /* renamed from: xsna.px9$a$a, reason: collision with other inner class name */
        public static final class C3534a implements a {
            public static final C3534a b = new C3534a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3534a);
            }

            public final int hashCode() {
                return -24473211;
            }

            public final String toString() {
                return "Hide";
            }
        }

        /* compiled from: CartPatch.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -24146112;
            }

            public final String toString() {
                return "Show";
            }
        }
    }

    /* compiled from: CartPatch.kt */
    public static abstract class b implements px9 {
        public final a.C0919a b;

        /* compiled from: CartPatch.kt */
        public static final class a extends b {
        }

        /* compiled from: CartPatch.kt */
        /* renamed from: xsna.px9$b$b, reason: collision with other inner class name */
        public static final class C3535b extends b {
        }

        /* compiled from: CartPatch.kt */
        public static final class c extends b {
        }

        /* compiled from: CartPatch.kt */
        public static final class d extends b {
        }

        /* compiled from: CartPatch.kt */
        public static final class e extends b {
            public final adp0 c;
            public final com.vk.ecomm.cart.impl.cart.feature.state.a d;

            public e(a.C0919a c0919a, adp0 adp0Var, com.vk.ecomm.cart.impl.cart.feature.state.a aVar) {
                super(c0919a);
                this.c = adp0Var;
                this.d = aVar;
            }
        }

        public b(a.C0919a c0919a) {
            this.b = c0919a;
        }
    }

    /* compiled from: CartPatch.kt */
    public static abstract class c implements px9 {

        /* compiled from: CartPatch.kt */
        public static final class a extends c {
            public final UserId b;

            public a(UserId userId) {
                this.b = userId;
            }
        }

        /* compiled from: CartPatch.kt */
        public static final class b extends c {
            public final UserId b;

            public b(UserId userId) {
                this.b = userId;
            }
        }

        /* compiled from: CartPatch.kt */
        /* renamed from: xsna.px9$c$c, reason: collision with other inner class name */
        public static final class C3536c extends c {
            public final UserId b;

            public C3536c(UserId userId) {
                this.b = userId;
            }
        }
    }

    /* compiled from: CartPatch.kt */
    public static final class d implements px9 {
        public final UserId b;

        public d(UserId userId) {
            this.b = userId;
        }
    }

    /* compiled from: CartPatch.kt */
    public static abstract class e implements px9 {

        /* compiled from: CartPatch.kt */
        public static final class a extends e {
            public final List<Cart> b;
            public final int c;

            public a(List<Cart> list, int i) {
                this.b = list;
                this.c = i;
            }
        }

        /* compiled from: CartPatch.kt */
        public static final class c extends e {
            public final Throwable b;

            public c(Throwable th) {
                this.b = th;
            }
        }

        /* compiled from: CartPatch.kt */
        public static final class d extends e {
            public static final d b = new d();
        }

        /* compiled from: CartPatch.kt */
        /* renamed from: xsna.px9$e$e, reason: collision with other inner class name */
        public static final class C3537e extends e {
            public static final C3537e b = new C3537e();
        }

        /* compiled from: CartPatch.kt */
        public static final class b extends e {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ClearCartCountState(shouldTrackOnContent="), this.b, ')');
            }

            public b() {
                this(true);
            }
        }
    }

    /* compiled from: CartPatch.kt */
    public static abstract class f implements px9 {

        /* compiled from: CartPatch.kt */
        public static final class a extends f {
            public final ArrayList b;
            public final int c;

            public a(ArrayList arrayList, int i) {
                this.b = arrayList;
                this.c = i;
            }
        }

        /* compiled from: CartPatch.kt */
        public static final class b extends f {
        }

        /* compiled from: CartPatch.kt */
        public static final class c extends f {
            public static final c b = new c();
        }
    }

    /* compiled from: CartPatch.kt */
    public static abstract class g implements px9 {
        public final UserId b;

        /* compiled from: CartPatch.kt */
        public static final class a extends g {
        }

        /* compiled from: CartPatch.kt */
        public static final class b extends g {
            public final List<com.vk.ecomm.cart.impl.cart.feature.state.a> c;

            public b(UserId userId, List<com.vk.ecomm.cart.impl.cart.feature.state.a> list) {
                super(userId);
                this.c = list;
            }
        }

        /* compiled from: CartPatch.kt */
        public static final class c extends g {
        }

        public g(UserId userId) {
            this.b = userId;
        }
    }

    /* compiled from: CartPatch.kt */
    public static abstract class h implements px9 {

        /* compiled from: CartPatch.kt */
        public static final class a extends h {
            public final Cart b;

            public a(Cart cart) {
                this.b = cart;
            }
        }

        /* compiled from: CartPatch.kt */
        public static final class b extends h {
        }

        /* compiled from: CartPatch.kt */
        public static final class c extends h {
            public final UserId b;

            public c(UserId userId) {
                this.b = userId;
            }
        }
    }

    /* compiled from: CartPatch.kt */
    public static abstract class i implements px9 {

        /* compiled from: CartPatch.kt */
        public static final class a extends i {
            public final a.C0919a b;

            public a(a.C0919a c0919a) {
                this.b = c0919a;
            }
        }

        /* compiled from: CartPatch.kt */
        public static final class b extends i {
            public final a.C0919a b;
            public final boolean c;

            public b(a.C0919a c0919a, boolean z) {
                this.b = c0919a;
                this.c = z;
            }
        }

        /* compiled from: CartPatch.kt */
        public static final class c extends i {
            public final a.C0919a b;
            public final adp0 c;

            public c(a.C0919a c0919a, adp0 adp0Var) {
                this.b = c0919a;
                this.c = adp0Var;
            }
        }
    }

    /* compiled from: CartPatch.kt */
    public static final class j implements px9 {
        public final ExternalOrderState b;

        public j() {
            this(null);
        }

        public j(ExternalOrderState externalOrderState) {
            this.b = externalOrderState;
        }
    }

    /* compiled from: CartPatch.kt */
    public static final class k implements px9 {
        public final a.C0919a b;

        public k(a.C0919a c0919a) {
            this.b = c0919a;
        }
    }

    /* compiled from: CartPatch.kt */
    public static final class l implements px9 {
        public final UserId b;

        public l(UserId userId) {
            this.b = userId;
        }
    }
}
