package com.jakewharton.processphoenix;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import defpackage.ny61;
import defpackage.oyr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes.dex */
public final class ProcessPhoenix extends Activity {
    private static final String KEY_MAIN_PROCESS_PID = "phoenix_main_process_pid";
    private static final String KEY_RESTART_INTENTS = "phoenix_restart_intents";

    private static Intent getRestartIntent(Context context) {
        String packageName = context.getPackageName();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            return launchIntentForPackage;
        }
        ny61.r(oyr.p("Unable to determine default activity for ", packageName, ". Does an activity specify the DEFAULT category in its intent filter?"));
        return null;
    }

    public static boolean isPhoenixProcess(Context context) {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid && runningAppProcessInfo.processName.endsWith(":phoenix")) {
                return true;
            }
        }
        return false;
    }

    public static void triggerRebirth(Context context, Intent... intentArr) {
        if (intentArr.length < 1) {
            ny61.g("intents cannot be empty");
            return;
        }
        intentArr[0].addFlags(268468224);
        Intent intent = new Intent(context, (Class<?>) ProcessPhoenix.class);
        intent.addFlags(SelfTester_JCP.IMITA);
        intent.putParcelableArrayListExtra(KEY_RESTART_INTENTS, new ArrayList<>(Arrays.asList(intentArr)));
        intent.putExtra(KEY_MAIN_PROCESS_PID, Process.myPid());
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Process.killProcess(getIntent().getIntExtra(KEY_MAIN_PROCESS_PID, -1));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(KEY_RESTART_INTENTS);
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        finish();
        Runtime.getRuntime().exit(0);
    }

    public static void triggerRebirth(Context context) {
        triggerRebirth(context, getRestartIntent(context));
    }
}
