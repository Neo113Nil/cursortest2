package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.iid.InstanceIDListenerService;
import java.io.File;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class g691 {
    public final SharedPreferences a;
    public final Context b;
    public final w53 c = new w53();

    public g691(Context context) {
        this.b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || sharedPreferences.getAll().isEmpty()) {
                return;
            }
            Log.i("InstanceID/Store", "App restored, clearing state");
            InstanceIDListenerService.zzd(context, this);
        } catch (IOException unused) {
            Log.isLoggable("InstanceID/Store", 3);
        }
    }

    public final synchronized void a(String str) {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            for (String str2 : this.a.getAll().keySet()) {
                if (str2.startsWith(str)) {
                    edit.remove(str2);
                }
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        this.c.clear();
        Context context = this.b;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            noBackupFilesDir = context.getFilesDir();
        }
        for (File file : noBackupFilesDir.listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.a.edit().clear().commit();
    }
}
