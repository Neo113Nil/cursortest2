package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import defpackage.au50;
import defpackage.b43;
import defpackage.h6b1;
import defpackage.qef0;
import defpackage.qje;
import defpackage.z50;
import java.io.File;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    public static final String ACTION_BENCHMARK_OPERATION = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    public static final String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";
    public static final String ACTION_SAVE_PROFILE = "androidx.profileinstaller.action.SAVE_PROFILE";
    public static final String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";
    private static final String EXTRA_BENCHMARK_OPERATION = "EXTRA_BENCHMARK_OPERATION";
    private static final String EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE = "DROP_SHADER_CACHE";
    private static final String EXTRA_BENCHMARK_OPERATION_SAVE_PROFILE = "SAVE_PROFILE";
    private static final String EXTRA_PID = "EXTRA_PID";
    private static final String EXTRA_SKIP_FILE_OPERATION = "EXTRA_SKIP_FILE_OPERATION";
    private static final String EXTRA_SKIP_FILE_OPERATION_DELETE = "DELETE_SKIP_FILE";
    private static final String EXTRA_SKIP_FILE_OPERATION_WRITE = "WRITE_SKIP_FILE";

    public static void saveProfile(int i, qef0 qef0Var) {
        Process.sendSignal(i, 10);
        qef0Var.c(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (ACTION_INSTALL_PROFILE.equals(action)) {
            qje.f0(context, new b43(1), new au50(29, this), true);
            return;
        }
        if (!ACTION_SKIP_FILE.equals(action)) {
            if (ACTION_SAVE_PROFILE.equals(action)) {
                saveProfile(new au50(29, this));
                return;
            }
            if (!ACTION_BENCHMARK_OPERATION.equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string = extras.getString(EXTRA_BENCHMARK_OPERATION);
            au50 au50Var = new au50(29, this);
            if (EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE.equals(string)) {
                h6b1.c(context, au50Var);
                return;
            } else if (EXTRA_BENCHMARK_OPERATION_SAVE_PROFILE.equals(string)) {
                saveProfile(extras.getInt(EXTRA_PID, Process.myPid()), au50Var);
                return;
            } else {
                au50Var.c(16, null);
                return;
            }
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            String string2 = extras2.getString(EXTRA_SKIP_FILE_OPERATION);
            if (!EXTRA_SKIP_FILE_OPERATION_WRITE.equals(string2)) {
                if (EXTRA_SKIP_FILE_OPERATION_DELETE.equals(string2)) {
                    au50 au50Var2 = new au50(29, this);
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new z50(au50Var2, 11, (Object) null, 11).run();
                    return;
                }
                return;
            }
            au50 au50Var3 = new au50(29, this);
            try {
                qje.J(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                new z50(au50Var3, 10, (Object) null, 11).run();
            } catch (PackageManager.NameNotFoundException e) {
                new z50(au50Var3, 7, e, 11).run();
            }
        }
    }

    public static void saveProfile(qef0 qef0Var) {
        saveProfile(Process.myPid(), qef0Var);
    }
}
