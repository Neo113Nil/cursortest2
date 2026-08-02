package com.yandex.passport.internal;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.passport.R;
import com.yandex.passport.api.n0;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.ui.YxAuthActivity;
import defpackage.b64;
import defpackage.oo31;
import defpackage.unr0;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class w {
    public static final String[] f = {"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"};
    public static final String[] g = {"android.permission.USE_CREDENTIALS", "android.permission.MANAGE_ACCOUNTS", "android.permission.AUTHENTICATE_ACCOUNTS"};
    public static final Credentials h;
    public static final List i;
    public final Context a;
    public final PackageManager b;
    public final String c;
    public final IReporterYandex d;
    public final n0 e;

    static {
        ClientCredentials.Factory.getClass();
        h = new Credentials("2Eq+GoeQ4M7aD8O4hyWLq/dOMIdRYItNPnrcy+M6iGP2bgK3xLJnmOAJlR2Q6MhQ", "2h60H4DE4sjTWZG4hymJqIniU5FFaR+DF1fDwbPqaUv68hDH1dP0Jkr8TUkH2fEB");
        i = Arrays.asList("com.yandex.passport.testapp1", "com.yandex.passport.testapp2", "com.yandex.passport.test", "ru.yandex.auth.client", "ru.yandex.auth.client.am_release_sl", "net.yandex.alien1.testapp5", "net.yandex.alien2.testapp6", "net.yandex.alien3.testapp7", "net.yandex.alien4.testapp8", "com.accountmanagerrnexample", "com.yandex.passport.perfapp", "com.yandex.passport.contacts.demo");
    }

    public w(Application application, IReporterYandex iReporterYandex, n0 n0Var) {
        this.a = application.getApplicationContext();
        this.b = application.getPackageManager();
        this.c = application.getPackageName();
        this.d = iReporterYandex;
        this.e = n0Var;
    }

    public static void a(String str, List list) {
        com.yandex.passport.legacy.a.a("addError: ".concat(str));
        list.add(new IllegalStateException(str));
    }

    public static void f(ArrayList arrayList, String str, boolean z, boolean z2, String str2) {
        StringBuilder l = oo31.l("checkProperty: property=", str, " actual=", " expected=", z);
        l.append(z2);
        l.append(" component=");
        l.append(str2);
        com.yandex.passport.legacy.a.a(l.toString());
        if (z != z2) {
            StringBuilder v = b64.v("Passport library verification error: Component ", str2, " has wrong '", str, "' value. Should be ");
            v.append(z2);
            v.append(Extension.DOT_CHAR);
            a(v.toString(), arrayList);
        }
    }

    public final ComponentName b(ArrayList arrayList, String str, String str2, RuntimeConfigurationValidator$ComponentType runtimeConfigurationValidator$ComponentType, boolean z) {
        ComponentInfo activityInfo;
        ComponentName componentName = new ComponentName(this.a.getPackageName(), str);
        try {
            int ordinal = runtimeConfigurationValidator$ComponentType.ordinal();
            PackageManager packageManager = this.b;
            if (ordinal == 0) {
                activityInfo = packageManager.getActivityInfo(componentName, 0);
            } else if (ordinal == 1) {
                activityInfo = packageManager.getServiceInfo(componentName, 512);
            } else if (ordinal != 2) {
                a("Passport library verification error: Unknown component type", arrayList);
                activityInfo = null;
            } else {
                activityInfo = packageManager.getReceiverInfo(componentName, 0);
            }
            if (activityInfo != null) {
                f(arrayList, "exported", activityInfo.exported, z, str);
            }
            return componentName;
        } catch (PackageManager.NameNotFoundException unused) {
            a("Passport library verification error: Component " + str + " not found. It is needed for " + str2, arrayList);
            return componentName;
        }
    }

    public final void c(ArrayList arrayList, String str, Intent intent, RuntimeConfigurationValidator$ComponentType runtimeConfigurationValidator$ComponentType) {
        ArrayList arrayList2;
        int ordinal = runtimeConfigurationValidator$ComponentType.ordinal();
        PackageManager packageManager = this.b;
        if (ordinal == 0) {
            arrayList2 = new ArrayList();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 0).iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().activityInfo.name);
            }
        } else if (ordinal == 1) {
            arrayList2 = new ArrayList();
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(intent, 512).iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().serviceInfo.name);
            }
        } else {
            if (ordinal != 2) {
                a("Passport library verification error: Unknown component type", arrayList);
                return;
            }
            arrayList2 = new ArrayList();
            Iterator<ResolveInfo> it3 = packageManager.queryBroadcastReceivers(intent, 0).iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().activityInfo.name);
            }
        }
        if (arrayList2.contains(str)) {
            return;
        }
        if (str.equals("**any activity**") && arrayList2.size() == 1) {
            return;
        }
        a(String.format("Passport library verification error: There is no response from %s to %s. Please check the documentation on how to declare this component", str, intent), arrayList);
    }

    public final void d(ArrayList arrayList) {
        PackageInfo packageInfo = this.b.getPackageInfo(this.c, 4096);
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        if (permissionInfoArr != null) {
            int length = permissionInfoArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (permissionInfoArr[i2].name.equals("com.yandex.permission.AM_COMMUNICATION")) {
                    a("Passport library verification error: There is no need to declare com.yandex.permission.AM_COMMUNICATION. Please remove DECLARATION(<permission> element) from manifest", arrayList);
                    break;
                }
                i2++;
            }
        }
        if (!Arrays.asList(packageInfo.requestedPermissions).contains("com.yandex.permission.AM_COMMUNICATION")) {
            a("Passport library verification error: You should still declare com.yandex.permission.AM_COMMUNICATION to be able to stop old AM.", arrayList);
        }
        for (int i3 = 0; i3 < 2; i3++) {
            String str = f[i3];
            if (!Arrays.asList(packageInfo.requestedPermissions).contains(str)) {
                a("Passport library verification error: Permission " + str + " is not used in manifest. It is needed for internet communication to get tokens, authorize users etc.", arrayList);
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            String str2 = g[i4];
            if (!Arrays.asList(packageInfo.requestedPermissions).contains(str2)) {
                a("Passport library verification error: Permission " + str2 + " is not used in manifest. It is needed for work with system account manager.", arrayList);
            }
        }
    }

    public final void e(ArrayList arrayList, ServiceInfo serviceInfo) {
        com.yandex.passport.legacy.a.a("checkProcess: processName=" + ((ComponentInfo) serviceInfo).processName + " component=" + ((ComponentInfo) serviceInfo).name);
        StringBuilder sb = new StringBuilder();
        sb.append(((ComponentInfo) serviceInfo).packageName);
        sb.append(this.a.getString(R.string.passport_process_name));
        String sb2 = sb.toString();
        if (((ComponentInfo) serviceInfo).processName.equals(sb2)) {
            return;
        }
        a(unr0.p("Passport library verification error: Component ", ((ComponentInfo) serviceInfo).name, " has wrong 'process' value. Should be ", sb2, Extension.DOT_CHAR), arrayList);
    }

    public final Intent g(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        if (str2 != null) {
            intent.setData(Uri.parse(str2));
        }
        if (str3 != null) {
            intent.addCategory(str3);
        }
        intent.setPackage(this.a.getPackageName());
        return intent;
    }

    public final void h(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IllegalStateException illegalStateException = (IllegalStateException) it.next();
            com.yandex.passport.legacy.a.c("Error", illegalStateException);
            List list = s.a;
            s.c(this.d, com.yandex.passport.internal.analytics.l.g, illegalStateException);
        }
    }

    public final void i(ArrayList arrayList) {
        boolean d;
        if (i.a.equals("com.yandex.passport")) {
            return;
        }
        if (!i.a.startsWith("com.yandex.passport")) {
            a("Account type should start with com.yandex.passport", arrayList);
        }
        if (i.a.startsWith("com.yandex.passport.wl") || i.a.endsWith(".sso")) {
            return;
        }
        Context context = this.a;
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return;
        }
        byte[] bArr = com.yandex.passport.internal.entities.o.c;
        if (com.yandex.passport.internal.util.p.r(this.b, this.c).b()) {
            return;
        }
        com.yandex.passport.internal.sso.g gVar = new com.yandex.passport.internal.sso.g(context, null, null);
        String packageName = context.getPackageName();
        IReporterYandex iReporterYandex = this.d;
        com.yandex.passport.internal.sso.c c = gVar.c(new com.yandex.passport.internal.sso.d(iReporterYandex, 1), packageName);
        if (c == null) {
            d = false;
        } else {
            d = c.d(gVar.d, new com.yandex.passport.internal.sso.d(iReporterYandex, 2));
        }
        if (d) {
            return;
        }
        com.yandex.passport.internal.sso.c c2 = new com.yandex.passport.internal.sso.g(context, null, null).c(new com.yandex.passport.internal.sso.d(iReporterYandex, 0), context.getPackageName());
        if (!(c2 == null || c2.c() == null) || context.getPackageName().contains("uber.az")) {
            return;
        }
        a("Debug account type is supported only in debuggable applications", arrayList);
    }

    public final void j(ArrayList arrayList) {
        RuntimeConfigurationValidator$ComponentType runtimeConfigurationValidator$ComponentType = RuntimeConfigurationValidator$ComponentType.ACTIVITY;
        b(arrayList, "com.yandex.passport.internal.ui.router.LoginRouterActivity", "authenticate users.", runtimeConfigurationValidator$ComponentType, false);
        c(arrayList, "com.yandex.passport.internal.ui.router.LoginRouterActivity", g("com.yandex.intent.ADD_ACCOUNT", null, "android.intent.category.DEFAULT"), runtimeConfigurationValidator$ComponentType);
        c(arrayList, "com.yandex.passport.internal.ui.router.LoginRouterActivity", g("com.yandex.passport.ACTION_SYSTEM_ADD_ACCOUNT", null, "android.intent.category.DEFAULT"), runtimeConfigurationValidator$ComponentType);
        n0 n0Var = this.e;
        if (n0Var != null) {
            StringBuilder x = unr0.x("https://yx", com.yandex.passport.internal.util.b.c(n0Var.getEncryptedId()), ".oauth.yandex.ru/magic-link/");
            x.append(this.a.getPackageName());
            x.append("/finish");
            String sb = x.toString();
            com.yandex.passport.legacy.a.a("validateActivitiesFatal: applink path: ".concat(sb));
            c(arrayList, YxAuthActivity.class.getCanonicalName(), g("android.intent.action.VIEW", sb, "android.intent.category.DEFAULT"), runtimeConfigurationValidator$ComponentType);
        }
    }

    public final void k(ArrayList arrayList) {
        Intent intent = new Intent();
        intent.setAction("com.yandex.accounts.AccountAuthenticator");
        String str = this.c;
        intent.setPackage(str);
        List<ResolveInfo> queryIntentServices = this.b.queryIntentServices(intent, 0);
        if (queryIntentServices.size() > 1) {
            a(String.format(Locale.US, "Passport library verification error: Expected 1 AM service, but detected %d: [%s]", Integer.valueOf(queryIntentServices.size()), queryIntentServices), arrayList);
            return;
        }
        if (queryIntentServices.isEmpty()) {
            a("Passport library verification error: Component com.yandex.passport.internal.core.auth.AuthenticationService not found. It is needed for handling authentication in system, displaying yandex accounts in system", arrayList);
            return;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            e(arrayList, resolveInfo.serviceInfo);
            String[] strArr = {"android.accounts.AccountAuthenticator", "com.yandex.accounts.AccountAuthenticator"};
            for (int i2 = 0; i2 < 2; i2++) {
                String str2 = strArr[i2];
                Intent intent2 = new Intent();
                intent2.setAction(str2);
                intent2.setPackage(str);
                c(arrayList, "com.yandex.passport.internal.core.auth.AuthenticationService", intent2, RuntimeConfigurationValidator$ComponentType.SERVICE);
            }
            String str3 = resolveInfo.serviceInfo.name;
            if (!"com.yandex.passport.internal.core.auth.AuthenticationService".equals(str3)) {
                a("Passport library verification error: Authentication service has name " + str3 + ", expected com.yandex.passport.internal.core.auth.AuthenticationService", arrayList);
            }
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            f(arrayList, "exported", serviceInfo.exported, false, serviceInfo.name);
            ServiceInfo serviceInfo2 = resolveInfo.serviceInfo;
            f(arrayList, BackendConfig.Restrictions.ENABLED, serviceInfo2.enabled, true, serviceInfo2.name);
        }
    }

    public final void l(ArrayList arrayList) {
        try {
            PackageInfo packageInfo = this.b.getPackageInfo(this.c, 4096);
            com.yandex.passport.legacy.a.a("packageInfo.installLocation=" + packageInfo.installLocation);
            if (packageInfo.installLocation != 1) {
                a("Manifest verification error: 'android:installLocation' must be set to 'internalOnly'", arrayList);
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (Exception e2) {
            com.yandex.passport.legacy.a.d(e2);
        }
    }

    public final void m(ArrayList arrayList) {
        Bundle bundle = this.b.getApplicationInfo(this.c, 128).metaData;
        if (bundle.getFloat("com.yandex.auth.VERSION", 0.0f) != Float.valueOf("500.99999").floatValue()) {
            a("Manifest meta-data verification error: com.yandex.auth.VERSION", arrayList);
        }
        int i2 = bundle.getInt("com.yandex.auth.INTERNAL_VERSION", 0);
        Context context = this.a;
        if (i2 != context.getResources().getInteger(R.integer.passport_internal_version)) {
            a("Manifest meta-data verification error: com.yandex.auth.INTERNAL_VERSION", arrayList);
        }
        if (bundle.getInt("com.yandex.auth.INTERNAL_BUILD_NUMBER", 0) != context.getResources().getInteger(R.integer.passport_build_number)) {
            a("Manifest meta-data verification error: com.yandex.auth.INTERNAL_BUILD_NUMBER", arrayList);
        }
        if (bundle.getInt("asset_statements", 0) != R.string.passport_asset_statements) {
            a("Manifest meta-data verification error: asset_statements", arrayList);
        }
        if (bundle.getInt("com.yandex.auth.LOGIN_SDK_VERSION", 0) != 2) {
            a("Manifest meta-data verification error: com.yandex.auth.LOGIN_SDK_VERSION", arrayList);
        }
    }
}
