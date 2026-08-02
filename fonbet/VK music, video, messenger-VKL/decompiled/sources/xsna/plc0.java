package xsna;

import com.vk.newsfeed.impl.posting.settings.mvi.ui.SettingType;

/* compiled from: PostingSettingsAdapterItem.kt */
/* loaded from: classes4.dex */
public abstract class plc0 {
    public final SettingType a;

    /* compiled from: PostingSettingsAdapterItem.kt */
    public static final class a extends plc0 {
        public final boolean b;
        public final boolean c;

        public a(boolean z) {
            super(SettingType.PRIVACY);
            this.b = true;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Privacy(changeCommentPrivacyAllowed=");
            sb.append(this.b);
            sb.append(", isCommentsEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PostingSettingsAdapterItem.kt */
    public static abstract class b extends plc0 {

        /* compiled from: PostingSettingsAdapterItem.kt */
        public static final class a extends b {
            public final boolean b;

            public a() {
                this(false);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("AdvertisingOrd(isAddAdvertising="), this.b, ')');
            }

            public a(boolean z) {
                super(SettingType.ADVERTISING_ORD);
                this.b = z;
            }
        }

        /* compiled from: PostingSettingsAdapterItem.kt */
        /* renamed from: xsna.plc0$b$b, reason: collision with other inner class name */
        public static final class C3517b extends b {
            public final String b;

            public C3517b(String str) {
                super(SettingType.SELECTOR_POST_SOURCE);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3517b) && epx.f(this.b, ((C3517b) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("PostSource(sourceLink="), this.b, ')');
            }
        }

        /* compiled from: PostingSettingsAdapterItem.kt */
        public static final class c extends b {
            public final long b;

            public c(long j) {
                super(SettingType.SELECTOR_POSTING_TIME);
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("PostingTime(timestamp="));
            }
        }
    }

    /* compiled from: PostingSettingsAdapterItem.kt */
    public static final class c extends plc0 {
        public static final c b = new c();

        public c() {
            super(SettingType.DETAILS_SOURCE);
        }
    }

    /* compiled from: PostingSettingsAdapterItem.kt */
    public static abstract class d extends plc0 {

        /* compiled from: PostingSettingsAdapterItem.kt */
        public static final class a extends d {
            public final boolean b;
            public final boolean c;

            public a(boolean z, boolean z2) {
                super(SettingType.SWITCH_COMMENTS);
                this.b = z;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && this.c == aVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Comments(isChecked=");
                sb.append(this.b);
                sb.append(", isEnabled=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: PostingSettingsAdapterItem.kt */
        public static final class b extends d {
            public final boolean b;

            public b(boolean z) {
                super(SettingType.HIDE_NAME);
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
                return defpackage.q0.a(new StringBuilder("HideName(needHide="), this.b, ')');
            }
        }

        /* compiled from: PostingSettingsAdapterItem.kt */
        public static final class c extends d {
            public final boolean b;

            public c(boolean z) {
                super(SettingType.SWITCH_NOTIFY);
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
                return defpackage.q0.a(new StringBuilder("Notifications(isChecked="), this.b, ')');
            }
        }
    }

    public plc0(SettingType settingType) {
        this.a = settingType;
    }
}
