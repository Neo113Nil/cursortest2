package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Deprecated
/* loaded from: classes11.dex */
public class GcmReceiver extends WakefulBroadcastReceiver {
    private static boolean zzr;
    private static com.google.android.gms.iid.zzk zzs;
    private static com.google.android.gms.iid.zzk zzt;

    private final synchronized com.google.android.gms.iid.zzk zzd(Context context, String str) {
        try {
            if ("com.google.android.c2dm.intent.RECEIVE".equals(str)) {
                if (zzt == null) {
                    zzt = new com.google.android.gms.iid.zzk(context, str);
                }
                return zzt;
            }
            if (zzs == null) {
                zzs = new com.google.android.gms.iid.zzk(context, str);
            }
            return zzs;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static int zze(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        Log.isLoggable("GcmReceiver", 3);
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || (serviceInfo = resolveService.serviceInfo) == null) {
            Log.e("GcmReceiver", "Failed to resolve target intent service, skipping classname enforcement");
        } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
            String str2 = serviceInfo.packageName;
            String str3 = serviceInfo.name;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + String.valueOf(str2).length() + 94);
            sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb.append(str2);
            sb.append("/");
            sb.append(str3);
            Log.e("GcmReceiver", sb.toString());
        } else {
            if (str.startsWith(Extension.DOT_CHAR)) {
                String valueOf = String.valueOf(context.getPackageName());
                str = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            }
            Log.isLoggable("GcmReceiver", 3);
            intent.setClassName(context.getPackageName(), str);
        }
        try {
            if ((context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 ? WakefulBroadcastReceiver.startWakefulService(context, intent) : context.startService(intent)) != null) {
                return -1;
            }
            Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 45);
            sb2.append("Failed to start service while in background: ");
            sb2.append(valueOf2);
            Log.e("GcmReceiver", sb2.toString());
            return 402;
        } catch (SecurityException e2) {
            Log.e("GcmReceiver", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        Log.isLoggable("GcmReceiver", 3);
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & SelfTester_JCP.IMITA) != 0;
        if (!z || z2) {
            int zze = "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()) ? zze(context, intent) : zze(context, intent);
            if (zze == 402) {
                zzd(context, intent);
                i = 403;
            } else {
                i = zze;
            }
        } else {
            i = zzd(context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    private final int zzd(Context context, Intent intent) {
        Log.isLoggable("GcmReceiver", 3);
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
        zzd(context, intent.getAction()).zzd(intent, goAsync());
        return -1;
    }
}
