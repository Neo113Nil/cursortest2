package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;

/* compiled from: PasskeyCheckContentState.kt */
/* loaded from: classes15.dex */
public abstract class sl90 {
    public final int a;
    public final int b;

    /* compiled from: PasskeyCheckContentState.kt */
    public static abstract class a extends sl90 {
        public final int c;
        public final Integer d;

        /* compiled from: PasskeyCheckContentState.kt */
        /* renamed from: xsna.sl90$a$a, reason: collision with other inner class name */
        public static final class C3673a extends a {
            public static final C3673a e = new C3673a(R.string.vk_passkey_failed_passkey_otp_auth_description, R.string.vk_passkey_ayth_by_alternative_way, null, SchemeStatSak$EventScreen.OTHER);
        }

        /* compiled from: PasskeyCheckContentState.kt */
        public static abstract class b extends a {

            /* compiled from: PasskeyCheckContentState.kt */
            /* renamed from: xsna.sl90$a$b$a, reason: collision with other inner class name */
            public static final class C3674a extends b {
                public static final C3674a e = new C3674a(R.string.vk_passkey_restore_account, null);

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3674a);
                }

                public final int hashCode() {
                    return 652547226;
                }

                public final String toString() {
                    return "Default";
                }
            }

            /* compiled from: PasskeyCheckContentState.kt */
            /* renamed from: xsna.sl90$a$b$b, reason: collision with other inner class name */
            public static final class C3675b extends b {
                public static final C3675b e = new C3675b(R.string.vk_passkey_qr_web_to_app, Integer.valueOf(R.string.vk_passkey_restore_account));

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3675b);
                }

                public final int hashCode() {
                    return -262163442;
                }

                public final String toString() {
                    return "WithQr";
                }
            }

            public b(int i, Integer num) {
                super(R.string.vk_passkey_failed_passkey_only_auth_description, i, num, SchemeStatSak$EventScreen.OTHER);
            }
        }

        public a(int i, int i2, Integer num, SchemeStatSak$EventScreen schemeStatSak$EventScreen) {
            super(R.string.vk_passkey_failed_auth, i);
            this.c = i2;
            this.d = num;
        }
    }

    /* compiled from: PasskeyCheckContentState.kt */
    public static final class b extends sl90 {
        public static final b c;

        static {
            SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.ACCOUNT_CONFIRM_PASSWORD;
            c = new b(R.string.vk_passkey_auth_by_passkey, R.string.vk_passkey_auth_by_passkey_hint);
        }
    }

    public sl90(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
