package com.yandex.passport.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.u5;
import defpackage.i3y;
import defpackage.w511;

/* loaded from: classes8.dex */
public final class j {
    public final Context a;
    public final i3y b = kotlin.a.a(new com.yandex.passport.internal.d(3, this));

    public j(Context context) {
        this.a = context;
    }

    public static String c(Environment environment) {
        int i = i.a[environment.ordinal()];
        if (i == 1 || i == 2) {
            return "tib.passport.yandex.net";
        }
        if (i == 3 || i == 4 || i == 5) {
            return "tib-test.passport.yandex.net";
        }
        w511.b();
        return null;
    }

    public final Uri a(Environment environment) {
        Uri parse;
        try {
            String string = ((SharedPreferences) this.b.getValue()).getString(com.yandex.passport.internal.util.p.n("backend_uri_template", environment), null);
            if (string != null && (parse = Uri.parse(string)) != null) {
                return parse;
            }
            return new Uri.Builder().scheme(Constants.SCHEME).authority(c(environment)).path("/1/bundle/biometrics/ebs").build();
        } catch (Exception unused) {
            return new Uri.Builder().scheme(Constants.SCHEME).authority(c(environment)).path("/1/bundle/biometrics/ebs").build();
        }
    }

    public final String b(Environment environment) {
        String string = ((SharedPreferences) this.b.getValue()).getString(com.yandex.passport.internal.util.p.n("bio_collecting_type", environment), null);
        return string == null ? "face_only_with_webinterface_age" : string;
    }

    public final String d(Environment environment) {
        String string = ((SharedPreferences) this.b.getValue()).getString(com.yandex.passport.internal.util.p.n("ebs_uri_template", environment), null);
        if (string != null) {
            return string;
        }
        int i = i.a[environment.ordinal()];
        if (i == 1 || i == 2) {
            return "https://gost.ebs.ru/api/v3/verifications/%s/upload";
        }
        if (i == 3 || i == 4 || i == 5) {
            return "https://int.ebs.ru:8896/api/v3/verifications/%s/upload";
        }
        w511.b();
        return null;
    }

    public final Uri e(Environment environment) {
        Uri parse;
        try {
            String string = ((SharedPreferences) this.b.getValue()).getString(com.yandex.passport.internal.util.p.n("tib_uri", environment), null);
            if (string != null && (parse = Uri.parse(string)) != null) {
                return parse;
            }
            return new Uri.Builder().scheme(Constants.SCHEME).authority(c(environment)).path("/servlets/api/v2").build();
        } catch (Exception unused) {
            return new Uri.Builder().scheme(Constants.SCHEME).authority(c(environment)).path("/servlets/api/v2").build();
        }
    }

    public final void f(Environment environment, u5 u5Var) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.b.getValue()).edit();
        if (u5Var == null) {
            edit.clear();
        } else {
            edit.putString(com.yandex.passport.internal.util.p.n("bio_collecting_type", environment), u5Var.a);
            edit.putString(com.yandex.passport.internal.util.p.n("tib_uri", environment), u5Var.b);
            edit.putString(com.yandex.passport.internal.util.p.n("backend_uri_template", environment), u5Var.c);
            edit.putString(com.yandex.passport.internal.util.p.n("ebs_uri_template", environment), u5Var.d);
        }
        edit.commit();
    }
}
