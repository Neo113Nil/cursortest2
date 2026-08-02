package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: PastCallAction.kt */
/* loaded from: classes7.dex */
public abstract class to90 implements r49 {

    /* compiled from: PastCallAction.kt */
    public static final class a extends to90 {
        public static final a b = new a();
    }

    /* compiled from: PastCallAction.kt */
    public static final class b extends to90 {
        public final a59 b;

        public b(a59 a59Var) {
            this.b = a59Var;
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
            return "ConfirmRemove(call=" + this.b + ')';
        }
    }

    /* compiled from: PastCallAction.kt */
    public static abstract class c extends to90 {

        /* compiled from: PastCallAction.kt */
        public static final class a extends c {
            public static final a b = new a();
        }

        /* compiled from: PastCallAction.kt */
        public static final class b extends c {
            public static final b b = new b();
        }
    }

    /* compiled from: PastCallAction.kt */
    public static abstract class d extends to90 {

        /* compiled from: PastCallAction.kt */
        public static final class a extends d {
            public static final a b = new a();
        }

        /* compiled from: PastCallAction.kt */
        public static final class b extends d {
            public final a59 b;

            public b(a59 a59Var) {
                this.b = a59Var;
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
                return "Show(call=" + this.b + ')';
            }
        }

        /* compiled from: PastCallAction.kt */
        public static final class c extends d {
            public final a59 b;

            public c(a59 a59Var) {
                this.b = a59Var;
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
                return "ShowFromMore(call=" + this.b + ')';
            }
        }
    }

    /* compiled from: PastCallAction.kt */
    public static abstract class e extends to90 {

        /* compiled from: PastCallAction.kt */
        public static final class a extends e {
        }

        /* compiled from: PastCallAction.kt */
        public static final class b extends e {
            public final CallsUserId.VkUserId b;

            public b(CallsUserId.VkUserId vkUserId) {
                this.b = vkUserId;
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
                return "FromGroup(id=" + this.b + ')';
            }
        }

        /* compiled from: PastCallAction.kt */
        public static final class c extends e {
            public static final c b = new c();
        }

        /* compiled from: PastCallAction.kt */
        public static final class d extends e {
            public static final d b = new d();
        }
    }

    /* compiled from: PastCallAction.kt */
    public static final class f extends to90 {
        public final a59 b;

        public f(a59 a59Var) {
            this.b = a59Var;
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
            return "RemoveCall(call=" + this.b + ')';
        }
    }

    /* compiled from: PastCallAction.kt */
    public static final class g extends to90 {
        public final a59 b;

        public g(a59 a59Var) {
            this.b = a59Var;
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
            return "ReportCall(call=" + this.b + ')';
        }
    }

    /* compiled from: PastCallAction.kt */
    public static final class h extends to90 {
        public static final h b = new h();
    }

    /* compiled from: PastCallAction.kt */
    public static abstract class i extends to90 {

        /* compiled from: PastCallAction.kt */
        public static final class a extends i {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1638023277;
            }

            public final String toString() {
                return "ShowMaxButton";
            }
        }
    }
}
