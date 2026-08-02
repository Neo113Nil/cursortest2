package com.yandex.passport.internal.ui.util;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.base.BaseNotificationActivity;
import defpackage.w511;

/* loaded from: classes15.dex */
public abstract class o {
    public static final PassportTheme a(Context context) {
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i != 16 && i == 32) {
            return PassportTheme.DARK;
        }
        return PassportTheme.LIGHT;
    }

    public static final String b(PassportTheme passportTheme) {
        int i = n.a[passportTheme.ordinal()];
        if (i == 1 || i == 2) {
            return "light";
        }
        if (i == 3) {
            return "dark";
        }
        if (i == 4) {
            return b(a(com.yandex.passport.common.util.a.b()));
        }
        w511.b();
        return null;
    }

    public static final int c(PassportTheme passportTheme, BaseNotificationActivity baseNotificationActivity) {
        int i = n.a[passportTheme.ordinal()];
        if (i == 1 || i == 2) {
            return R.style.Passport_Theme_AutoLoginDialog_Light;
        }
        if (i == 3) {
            return R.style.Passport_Theme_AutoLoginDialog_Dark;
        }
        if (i == 4) {
            return c(a(baseNotificationActivity), baseNotificationActivity);
        }
        w511.b();
        return 0;
    }

    public static final int d(PassportTheme passportTheme, BaseActivity baseActivity) {
        int i = n.a[passportTheme.ordinal()];
        if (i == 1) {
            return R.style.PassportNext_Theme_Light_Immersive;
        }
        if (i == 2) {
            return R.style.PassportNext_Theme_Custom_Immersive;
        }
        if (i == 3) {
            return R.style.PassportNext_Theme_Dark_Immersive;
        }
        if (i == 4) {
            return d(a(baseActivity), baseActivity);
        }
        w511.b();
        return 0;
    }

    public static final int e(PassportTheme passportTheme, AuthSdkActivity authSdkActivity) {
        int i = n.a[passportTheme.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return R.style.Passport_Theme_Dark;
            }
            if (i == 4) {
                return e(a(authSdkActivity), authSdkActivity);
            }
            w511.b();
            return 0;
        }
        return R.style.Passport_Theme_Light;
    }

    public static final int f(PassportTheme passportTheme, AppCompatActivity appCompatActivity) {
        int i = n.a[passportTheme.ordinal()];
        if (i == 1) {
            return R.style.PassportNext_Theme_Light_Transparent_Paranja;
        }
        if (i == 2) {
            return R.style.PassportNext_Theme_Custom_Transparent_Paranja;
        }
        if (i == 3) {
            return R.style.PassportNext_Theme_Dark_Transparent_Paranja;
        }
        if (i == 4) {
            return f(a(appCompatActivity), appCompatActivity);
        }
        w511.b();
        return 0;
    }

    public static final PassportTheme g(Context context, PassportTheme passportTheme) {
        int i = n.a[passportTheme.ordinal()];
        if (i == 1 || i == 2) {
            return PassportTheme.LIGHT;
        }
        if (i == 3) {
            return PassportTheme.DARK;
        }
        if (i == 4) {
            return a(context);
        }
        w511.b();
        return null;
    }
}
