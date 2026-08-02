package xsna;

/* compiled from: NotificationSettingsCell.kt */
/* loaded from: classes5.dex */
public interface dg70 {

    /* compiled from: NotificationSettingsCell.kt */
    public static final class a implements dg70 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tq.f(new StringBuilder("BannerDivider(key="), this.a, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class b implements dg70 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return "DisableDndBanner";
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("DisableDndBanner(dndUntil="), this.a, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class c implements dg70 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tq.f(new StringBuilder("Divider(key="), this.a, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class d implements dg70 {
        public static final d a = new d();

        @Override // xsna.dg70
        public final Object getKey() {
            return "EnableDndBanner";
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class e implements dg70 {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return "HeadphoneNotificationSetting";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("HeadphoneNotificationSetting(enabled="), this.a, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class f implements dg70 {
        public final int a;

        public f(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return "LEDColor";
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("LEDColor(color="), this.a, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class g implements dg70 {
        public final boolean a;

        public g(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return "LEDSwitch";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("LEDSwitch(enabled="), this.a, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class h implements dg70 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            ((h) obj).getClass();
            return true;
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return "MessengerCounterSetting";
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "MessengerCounterSetting(isAllChats=false)";
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class i implements dg70 {

        /* compiled from: NotificationSettingsCell.kt */
        public static final class a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "IncludedFolder(folderTitle=null, isIncluded=false, folderType=null)";
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            ((i) obj).getClass();
            throw null;
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return "MessengerIncludeFoldersToCounterSetting";
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("MessengerIncludeFoldersToCounterSetting(customFolders="), null);
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class j implements dg70 {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return "MultiAccountPushSwitch";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("MultiAccountPushSwitch(enabled="), this.a, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class k implements dg70 {
        public final int a;
        public final boolean b;

        public k(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a == kVar.a && this.b == kVar.b;
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return "NotifyBanner";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyBanner(title=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class l implements dg70 {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;

        public l(String str, String str2, String str3, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b) && epx.f(this.c, lVar.c) && this.d == lVar.d;
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return this.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Section(id=");
            sb.append(this.a);
            sb.append(", icon=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", enabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class m implements dg70 {
        public final int a;

        public m(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return Integer.valueOf(this.a);
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SectionTitle(title="), this.a, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class n implements dg70 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final tlo0 e;
        public final boolean f;
        public final String g;

        public n(String str, String str2, String str3, String str4, tlo0 tlo0Var, boolean z, String str5) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = tlo0Var;
            this.f = z;
            this.g = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return epx.f(this.a, nVar.a) && epx.f(this.b, nVar.b) && epx.f(this.c, nVar.c) && epx.f(this.d, nVar.d) && epx.f(this.e, nVar.e) && this.f == nVar.f && epx.f(this.g, nVar.g);
        }

        @Override // xsna.dg70
        public final Object getKey() {
            return this.a + '@' + this.b;
        }

        public final int hashCode() {
            int b = qoy.b(com.vk.movika.sdk.base.model.history.b.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
            String str = this.g;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Setting(id=");
            sb.append(this.a);
            sb.append(", sectionId=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", icon=");
            sb.append(this.d);
            sb.append(", subtitle=");
            sb.append(this.e);
            sb.append(", isEnabled=");
            sb.append(this.f);
            sb.append(", selectedOptionLabel=");
            return ho8.a(sb, this.g, ')');
        }
    }

    /* compiled from: NotificationSettingsCell.kt */
    public static final class o implements dg70 {
        public static final o a = new o();

        @Override // xsna.dg70
        public final Object getKey() {
            return "SystemNotificationsEnableBanner";
        }
    }

    Object getKey();
}
