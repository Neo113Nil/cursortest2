package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import defpackage.g691;
import defpackage.ny61;
import defpackage.o3w;
import defpackage.w53;
import java.io.File;
import java.io.UnsupportedEncodingException;

@Deprecated
/* loaded from: classes11.dex */
public class InstanceIDListenerService extends zze {
    public static void zzd(Context context, g691 g691Var) {
        g691Var.b();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    @Override // com.google.android.gms.iid.zze
    public void handleIntent(Intent intent) {
        Bundle bundle;
        String string;
        o3w o3wVar;
        String sb;
        if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("subtype");
            if (stringExtra != null) {
                bundle = new Bundle();
                bundle.putString("subtype", stringExtra);
            } else {
                bundle = null;
            }
            w53 w53Var = o3w.b;
            synchronized (o3w.class) {
                if (bundle == null) {
                    string = "";
                } else {
                    try {
                        string = bundle.getString("subtype");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (string == null) {
                    string = "";
                }
                Context applicationContext = getApplicationContext();
                if (o3w.c == null) {
                    new StringBuilder(String.valueOf(applicationContext.getPackageName()).length() + 73);
                    o3w.c = new g691(applicationContext);
                    new w53();
                }
                int i = 0;
                try {
                    i = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    new StringBuilder(String.valueOf(e).length() + 38);
                }
                Integer.toString(i);
                w53 w53Var2 = o3w.b;
                o3wVar = (o3w) w53Var2.get(string);
                if (o3wVar == null) {
                    o3wVar = new o3w();
                    o3wVar.a = "";
                    applicationContext.getApplicationContext();
                    o3wVar.a = string;
                    w53Var2.put(string, o3wVar);
                }
            }
            String stringExtra2 = intent.getStringExtra("CMD");
            if (Log.isLoggable("InstanceID", 3)) {
                new StringBuilder(String.valueOf(stringExtra2).length() + String.valueOf(stringExtra).length() + 34);
            }
            if (!"RST".equals(stringExtra2)) {
                if ("RST_FULL".equals(stringExtra2)) {
                    if (o3w.c.a.getAll().isEmpty()) {
                        return;
                    }
                    o3w.c.b();
                    onTokenRefresh();
                    return;
                }
                if ("SYNC".equals(stringExtra2)) {
                    g691 g691Var = o3w.c;
                    g691Var.a(String.valueOf(stringExtra).concat("|T|"));
                    g691Var.a(String.valueOf(stringExtra).concat("|T-timestamp|"));
                    onTokenRefresh();
                    return;
                }
                return;
            }
            g691 g691Var2 = o3w.c;
            String str = o3wVar.a;
            synchronized (g691Var2) {
                g691Var2.c.remove(str);
            }
            Context context = g691Var2.b;
            if (TextUtils.isEmpty(str)) {
                sb = "com.google.InstanceId.properties";
            } else {
                try {
                    String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                    sb2.append("com.google.InstanceId_");
                    sb2.append(encodeToString);
                    sb2.append(".properties");
                    sb = sb2.toString();
                } catch (UnsupportedEncodingException e2) {
                    ny61.f(e2);
                    return;
                }
            }
            File noBackupFilesDir = context.getNoBackupFilesDir();
            if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
                noBackupFilesDir = context.getFilesDir();
            }
            File file = new File(noBackupFilesDir, sb);
            if (file.exists()) {
                file.delete();
            }
            g691Var2.a(String.valueOf(str).concat("|"));
            onTokenRefresh();
        }
    }

    public void onTokenRefresh() {
    }
}
