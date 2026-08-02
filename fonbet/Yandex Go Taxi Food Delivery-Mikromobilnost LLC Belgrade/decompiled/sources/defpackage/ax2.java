package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.support.BKSTrustStore;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes4.dex */
public final class ax2 implements tsr, ca20, r30 {
    public Activity a;
    public ea20 b;

    public final void a(ba20 ba20Var, boolean z) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        if (z) {
            intent.addFlags(SelfTester_JCP.IMITA);
        }
        Activity activity = this.a;
        if (activity != null) {
            intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            activity.startActivity(intent);
        }
        ba20Var.success(null);
    }

    public final void b(String str, ba20 ba20Var, boolean z) {
        try {
            Intent intent = new Intent(str);
            if (z) {
                intent.addFlags(SelfTester_JCP.IMITA);
            }
            Activity activity = this.a;
            if (activity != null) {
                activity.startActivity(intent);
            }
            ba20Var.success(null);
        } catch (Exception unused) {
            a(ba20Var, z);
        }
    }

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        this.a = (Activity) ((wrr) l40Var).b;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "com.spencerccf.app_settings/methods");
        this.b = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        this.a = null;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        this.a = null;
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.b;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        String str = x920Var.a;
        if (!jl40.l(str, "openSettings")) {
            if (!jl40.l(str, "openSettingsPanel")) {
                ((ba20) da20Var).notImplemented();
                return;
            }
            Activity activity = this.a;
            if (activity == null) {
                ((ba20) da20Var).success(null);
                return;
            }
            String str2 = (String) x920Var.a("type");
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -810883302:
                        if (str2.equals("volume")) {
                            activity.startActivity(new Intent("android.settings.panel.action.VOLUME"));
                            ((ba20) da20Var).success(null);
                            return;
                        }
                        break;
                    case 108971:
                        if (str2.equals("nfc")) {
                            activity.startActivity(new Intent("android.settings.panel.action.NFC"));
                            ((ba20) da20Var).success(null);
                            return;
                        }
                        break;
                    case 3649301:
                        if (str2.equals(StartupRequest.PARAM_WIFI)) {
                            activity.startActivity(new Intent("android.settings.panel.action.WIFI"));
                            ((ba20) da20Var).success(null);
                            return;
                        }
                        break;
                    case 21015448:
                        if (str2.equals("internetConnectivity")) {
                            activity.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                            ((ba20) da20Var).success(null);
                            return;
                        }
                        break;
                }
            }
            ((ba20) da20Var).notImplemented();
            return;
        }
        Boolean bool = (Boolean) x920Var.a("asAnotherTask");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str3 = (String) x920Var.a("type");
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -2045253606:
                    if (str3.equals("batteryOptimization")) {
                        b("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case -1928150741:
                    if (str3.equals("generalSettings")) {
                        b("android.settings.SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case -1770066084:
                    if (str3.equals("manageUnknownAppSources")) {
                        b("android.settings.MANAGE_UNKNOWN_APP_SOURCES", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case -1335157162:
                    if (str3.equals("device")) {
                        b("android.settings.DEVICE_INFO_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case -1000044642:
                    if (str3.equals("wireless")) {
                        b("android.settings.WIRELESS_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case -213139122:
                    if (str3.equals("accessibility")) {
                        b("android.settings.ACCESSIBILITY_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case -114233073:
                    if (str3.equals("dataRoaming")) {
                        b("android.settings.DATA_ROAMING_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case -80681014:
                    if (str3.equals("developer")) {
                        b("android.settings.APPLICATION_DEVELOPMENT_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 96799:
                    if (str3.equals("apn")) {
                        b("android.settings.APN_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 108971:
                    if (str3.equals("nfc")) {
                        b("android.settings.NFC_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 116980:
                    if (str3.equals("vpn")) {
                        b("android.settings.VPN_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 3076014:
                    if (str3.equals(MetaDataField.DATE_FIELD)) {
                        b("android.settings.DATE_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 3649301:
                    if (str3.equals(StartupRequest.PARAM_WIFI)) {
                        b("android.settings.WIFI_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 92895825:
                    if (str3.equals("alarm")) {
                        if (Build.VERSION.SDK_INT < 31) {
                            a((ba20) da20Var, booleanValue);
                            return;
                        }
                        Activity activity2 = this.a;
                        Uri fromParts = activity2 != null ? Uri.fromParts("package", activity2.getPackageName(), null) : null;
                        if (fromParts == null) {
                            ((ba20) da20Var).success(null);
                            return;
                        }
                        Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", fromParts);
                        ba20 ba20Var = (ba20) da20Var;
                        if (booleanValue) {
                            try {
                                intent.addFlags(SelfTester_JCP.IMITA);
                            } catch (Exception unused) {
                                a(ba20Var, booleanValue);
                                return;
                            }
                        }
                        Activity activity3 = this.a;
                        if (activity3 != null) {
                            activity3.startActivity(intent);
                        }
                        ba20Var.success(null);
                        return;
                    }
                    break;
                case 109627663:
                    if (str3.equals("sound")) {
                        b("android.settings.SOUND_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 595233003:
                    if (str3.equals("notification")) {
                        Activity activity4 = this.a;
                        if (activity4 != null) {
                            Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", activity4.getPackageName());
                            if (booleanValue) {
                                putExtra.addFlags(SelfTester_JCP.IMITA);
                            }
                            activity4.startActivity(putExtra);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 949122880:
                    if (str3.equals(BKSTrustStore.STORAGE_DIRECTORY)) {
                        b("android.settings.SECURITY_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 1039955198:
                    if (str3.equals("internalStorage")) {
                        b("android.settings.INTERNAL_STORAGE_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 1099603663:
                    if (str3.equals("hotspot")) {
                        Intent className = new Intent().setClassName("com.android.settings", "com.android.settings.TetherSettings");
                        ba20 ba20Var2 = (ba20) da20Var;
                        if (booleanValue) {
                            try {
                                className.addFlags(SelfTester_JCP.IMITA);
                            } catch (Exception unused2) {
                                a(ba20Var2, booleanValue);
                                return;
                            }
                        }
                        Activity activity5 = this.a;
                        if (activity5 != null) {
                            activity5.startActivity(className);
                        }
                        ba20Var2.success(null);
                        return;
                    }
                    break;
                case 1214667623:
                    if (str3.equals("lockAndPassword")) {
                        b("android.app.action.SET_NEW_PASSWORD", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 1294374875:
                    if (str3.equals("appLocale")) {
                        if (Build.VERSION.SDK_INT < 33) {
                            ((ba20) da20Var).success(null);
                            return;
                        }
                        Intent intent2 = new Intent("android.settings.APP_LOCALE_SETTINGS");
                        if (booleanValue) {
                            intent2.addFlags(SelfTester_JCP.IMITA);
                        }
                        Activity activity6 = this.a;
                        if (activity6 != null) {
                            intent2.setData(Uri.fromParts("package", activity6.getPackageName(), null));
                            activity6.startActivity(intent2);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1434631203:
                    if (str3.equals("settings")) {
                        a((ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 1671764162:
                    if (str3.equals("display")) {
                        b("android.settings.DISPLAY_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 1901043637:
                    if (str3.equals("location")) {
                        b("android.settings.LOCATION_SOURCE_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
                case 1968882350:
                    if (str3.equals("bluetooth")) {
                        b("android.settings.BLUETOOTH_SETTINGS", (ba20) da20Var, booleanValue);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        this.a = (Activity) ((wrr) l40Var).b;
    }
}
