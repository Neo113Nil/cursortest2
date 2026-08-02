package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import java.util.List;

/* compiled from: CartCheckoutPatch.kt */
/* loaded from: classes18.dex */
public interface aw9 extends xl50 {

    /* compiled from: CartCheckoutPatch.kt */
    public static abstract class a implements aw9 {

        /* compiled from: CartCheckoutPatch.kt */
        /* renamed from: xsna.aw9$a$a, reason: collision with other inner class name */
        public static final class C2577a extends a {
            public static final C2577a b = new C2577a();
        }

        /* compiled from: CartCheckoutPatch.kt */
        public static final class b extends a {
            public static final b b = new b();
        }
    }

    /* compiled from: CartCheckoutPatch.kt */
    public static final class b implements aw9 {
        public final com.vk.ecomm.cart.impl.checkout.feature.state.f b;
        public final boolean c;

        public b(com.vk.ecomm.cart.impl.checkout.feature.state.f fVar, boolean z) {
            this.b = fVar;
            this.c = z;
        }
    }

    /* compiled from: CartCheckoutPatch.kt */
    public static abstract class c implements aw9 {

        /* compiled from: CartCheckoutPatch.kt */
        public static final class a extends c {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }
        }

        /* compiled from: CartCheckoutPatch.kt */
        public static final class b extends c {
            public static final b b = new b();
        }
    }

    /* compiled from: CartCheckoutPatch.kt */
    public interface d extends aw9 {

        /* compiled from: CartCheckoutPatch.kt */
        public static final class a implements d {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }
        }

        /* compiled from: CartCheckoutPatch.kt */
        public static final class b implements d {
            public static final b b = new b();
        }

        /* compiled from: CartCheckoutPatch.kt */
        public static final class c implements d {
            public final List<xw80> b;

            public c(List<xw80> list) {
                this.b = list;
            }
        }
    }

    /* compiled from: CartCheckoutPatch.kt */
    public static final class e implements aw9 {
        public static final e b = new e();
    }

    /* compiled from: CartCheckoutPatch.kt */
    public static final class f implements aw9 {
        public final gbk b;

        public f(gbk gbkVar) {
            this.b = gbkVar;
        }
    }

    /* compiled from: CartCheckoutPatch.kt */
    public static final class g implements aw9 {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: CartCheckoutPatch.kt */
    public static final class h implements aw9 {
        public final FieldKey b;

        public h(FieldKey fieldKey) {
            this.b = fieldKey;
        }
    }

    /* compiled from: CartCheckoutPatch.kt */
    public static final class i implements aw9 {
    }

    /* compiled from: CartCheckoutPatch.kt */
    public static final class j implements aw9 {
        public final com.vk.ecomm.cart.impl.checkout.feature.state.f b;

        public j(com.vk.ecomm.cart.impl.checkout.feature.state.f fVar) {
            this.b = fVar;
        }
    }
}
