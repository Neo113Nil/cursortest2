package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: EcosystemMultiAccountAction.kt */
/* loaded from: classes6.dex */
public abstract class hxo implements kj50 {

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class a extends hxo {
        public static final a b = new a();
    }

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class b extends hxo {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2138787272;
        }

        public final String toString() {
            return "CloseSwitcher";
        }
    }

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class c extends hxo {
        public static final c b = new c();
    }

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class d extends hxo {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1807543129;
        }

        public final String toString() {
            return "LogoutMainUserClick";
        }
    }

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class e extends hxo {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1211169865;
        }

        public final String toString() {
            return "LogoutMainUserConfirmClick";
        }
    }

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class f extends hxo {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1822550579;
        }

        public final String toString() {
            return "LogoutMainUserStart";
        }
    }

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class g extends hxo {
        public final com.vk.superapp.multiaccount.api.f b;

        public g(com.vk.superapp.multiaccount.api.f fVar) {
            this.b = fVar;
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
            return "LogoutUserClick(user=" + this.b + ')';
        }
    }

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class h extends hxo {
        public final com.vk.superapp.multiaccount.api.f b;

        public h(com.vk.superapp.multiaccount.api.f fVar) {
            this.b = fVar;
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
            return "LogoutUserConfirmClick(user=" + this.b + ')';
        }
    }

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class i extends hxo {
        public static final i b = new i();
    }

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class j extends hxo {
        public final UserId b;

        public j(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
        }

        public final int hashCode() {
            UserId userId = this.b;
            if (userId == null) {
                return 0;
            }
            return Long.hashCode(userId.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("SwitchAccount(user="), this.b, ')');
        }
    }

    /* compiled from: EcosystemMultiAccountAction.kt */
    public static final class k extends hxo {
        public final com.vk.superapp.multiaccount.api.f b;

        public k(com.vk.superapp.multiaccount.api.f fVar) {
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UserClick(user=" + this.b + ')';
        }
    }
}
