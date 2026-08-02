package xsna;

import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;

/* compiled from: AdditionalSettingsAction.kt */
/* loaded from: classes4.dex */
public interface kq0 extends kj50 {

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class a implements kq0 {
        public final String b;
        public final String c;
        public final boolean d;

        public a(String str, String str2, boolean z) {
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeAdvertisingOrd(predIdAdvertising=");
            sb.append(this.b);
            sb.append(", erId=");
            sb.append(this.c);
            sb.append(", isAddAdvertisingOrd=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class b implements kq0 {
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
            return defpackage.q0.a(new StringBuilder("ChangeCommentEnable(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class c implements kq0 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangeNotificationEnable(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class d implements kq0 {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangeSignEnable(isEnabled="), this.b, ')');
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class e implements kq0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2126344054;
        }

        public final String toString() {
            return "ClickAdvertisingOrd";
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class f implements kq0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1533538114;
        }

        public final String toString() {
            return "ClickOnDisabledByUserAuthorSign";
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class g implements kq0 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1757461709;
        }

        public final String toString() {
            return "ClickTurnOnCommentsAlert";
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class h implements kq0 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 855688809;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class i implements kq0 {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 239627937;
        }

        public final String toString() {
            return "ConfirmTurnOnComments";
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class j implements kq0 {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 236835051;
        }

        public final String toString() {
            return "DismissTurnOnComments";
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class k implements kq0 {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1634784641;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public interface l extends kq0 {

        /* compiled from: AdditionalSettingsAction.kt */
        public static final class a implements l {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 63354126;
            }

            public final String toString() {
                return "OnCreate";
            }
        }

        /* compiled from: AdditionalSettingsAction.kt */
        public static final class b implements l {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1802170840;
            }

            public final String toString() {
                return "OnDestroy";
            }
        }
    }

    /* compiled from: AdditionalSettingsAction.kt */
    public static final class m implements kq0 {
        public final AdditionalSettingsState b;

        public m(AdditionalSettingsState additionalSettingsState) {
            this.b = additionalSettingsState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "RestoreState(state=" + this.b + ')';
        }
    }
}
