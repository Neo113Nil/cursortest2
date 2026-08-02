package com.yandex.passport.internal.ui.authsdk;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.TurboAppAuthProperties;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oo31;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class m {
    public static AuthSdkProperties a(Bundle bundle, Activity activity) {
        Filter a;
        String callingPackage = activity.getCallingPackage();
        String str = jl40.l(callingPackage, activity.getPackageName()) ? null : callingPackage;
        TurboAppAuthProperties.Companion.getClass();
        TurboAppAuthProperties turboAppAuthProperties = (TurboAppAuthProperties) bundle.getParcelable("turbo_app_auth_properties");
        if (turboAppAuthProperties != null) {
            String turboAppIdentifier = str == null ? turboAppAuthProperties.getTurboAppIdentifier() : null;
            String clientId = turboAppAuthProperties.getClientId();
            List<String> scopes = turboAppAuthProperties.getScopes();
            LoginProperties.a aVar = new LoginProperties.a();
            aVar.a = true;
            PassportEnvironmentImpl environment = turboAppAuthProperties.getEnvironment();
            Filter.a aVar2 = new Filter.a();
            aVar2.e(environment);
            aVar2.c(PassportAccountType.CHILDISH);
            aVar.g(aVar2.a());
            aVar.y = turboAppAuthProperties.getTheme();
            aVar.A = turboAppAuthProperties.getUid();
            aVar.J = "passport/turboapp";
            return new AuthSdkProperties(clientId, scopes, AuthSdkActivity.RESPONSE_TYPE_TOKEN, aVar.a(), true, turboAppAuthProperties.getUid(), str, b(activity.getPackageManager(), str), turboAppIdentifier);
        }
        String string = bundle.getString(AuthSdkActivity.EXTRA_CLIENT_ID);
        if (string == null) {
            ny61.r("Required value was null.");
            return null;
        }
        List stringArrayList = bundle.getStringArrayList(AuthSdkActivity.EXTRA_SCOPES);
        if (stringArrayList == null) {
            stringArrayList = EmptyList.a;
        }
        List list = stringArrayList;
        String string2 = bundle.getString(AuthSdkActivity.EXTRA_RESPONSE_TYPE, AuthSdkActivity.RESPONSE_TYPE_TOKEN);
        boolean z = bundle.getBoolean(AuthSdkActivity.EXTRA_USE_TESTING_ENV, false);
        try {
            a = (Filter) bundle.getParcelable(AuthSdkActivity.EXTRA_ACCOUNTS_FILTER);
            if (a == null) {
                PassportEnvironmentImpl passportEnvironmentImpl = z ? PassportEnvironmentImpl.TESTING : PassportEnvironmentImpl.PRODUCTION;
                Filter.a aVar3 = new Filter.a();
                aVar3.e(passportEnvironmentImpl);
                aVar3.c(PassportAccountType.CHILDISH);
                a = aVar3.a();
            }
        } catch (Exception unused) {
            PassportEnvironmentImpl passportEnvironmentImpl2 = z ? PassportEnvironmentImpl.TESTING : PassportEnvironmentImpl.PRODUCTION;
            Filter.a aVar4 = new Filter.a();
            aVar4.e(passportEnvironmentImpl2);
            aVar4.c(PassportAccountType.CHILDISH);
            a = aVar4.a();
        }
        PassportTheme passportTheme = PassportTheme.values()[bundle.getInt(AuthSdkActivity.EXTRA_THEME, 0)];
        PassportUidImpl passportUidImpl = (PassportUidImpl) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-uid");
        if (passportUidImpl == null && bundle.containsKey(AuthSdkActivity.EXTRA_UID_VALUE)) {
            long j = bundle.getLong(AuthSdkActivity.EXTRA_UID_VALUE);
            if (j > 0) {
                passportUidImpl = new PassportUidImpl(a.getPrimaryEnvironment(), j);
            }
        }
        PassportUidImpl passportUidImpl2 = passportUidImpl;
        String string3 = bundle.getString(AuthSdkActivity.EXTRA_LOGIN_HINT);
        boolean z2 = bundle.getBoolean(AuthSdkActivity.EXTRA_FORCE_CONFIRM, false);
        LoginProperties.a aVar5 = new LoginProperties.a();
        aVar5.a = true;
        aVar5.g(a);
        aVar5.y = passportTheme;
        aVar5.E = string3;
        aVar5.A = passportUidImpl2;
        aVar5.J = "passport/authsdk";
        return new AuthSdkProperties(string, list, string2, aVar5.a(), z2, passportUidImpl2, str, b(activity.getPackageManager(), str), null);
    }

    public static String b(PackageManager packageManager, String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArr = com.yandex.passport.internal.entities.o.c;
            byte[] a = com.yandex.passport.internal.util.p.f(packageManager, str).a();
            ArrayList arrayList = new ArrayList(a.length);
            for (byte b : a) {
                arrayList.add(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
            }
            return kotlin.collections.a.X(arrayList, ":", null, null, null, 62);
        } catch (Exception unused) {
            return null;
        }
    }
}
