package xsna;

import com.vk.vmoji.character.model.VmojiProductModel;
import java.util.List;

/* compiled from: VmojiProductsState.kt */
/* loaded from: classes7.dex */
public abstract class v9w0 implements xl50 {

    /* compiled from: VmojiProductsState.kt */
    public static final class a extends v9w0 {
        public final List<VmojiProductModel> b;

        public a(List<VmojiProductModel> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("Content(vmojiProducts="), this.b);
        }
    }

    /* compiled from: VmojiProductsState.kt */
    public static final class b extends v9w0 {
        public static final b b = new b();
    }

    /* compiled from: VmojiProductsState.kt */
    public static abstract class c extends v9w0 {

        /* compiled from: VmojiProductsState.kt */
        public static final class a extends c {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
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
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VmojiProductsState.kt */
        public static final class b extends c {
            public final List<VmojiProductModel> b;

            public b(List<VmojiProductModel> list) {
                this.b = list;
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
                return ms9.a(')', new StringBuilder("Result(vmojiProducts="), this.b);
            }
        }

        /* compiled from: VmojiProductsState.kt */
        /* renamed from: xsna.v9w0$c$c, reason: collision with other inner class name */
        public static final class C3875c extends c {
            public static final C3875c b = new C3875c();
        }
    }

    /* compiled from: VmojiProductsState.kt */
    public static final class d extends v9w0 {
        public final VmojiProductModel b;

        public d(VmojiProductModel vmojiProductModel) {
            this.b = vmojiProductModel;
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
            return "SelectVmojiProduct(product=" + this.b + ')';
        }
    }
}
