package xsna;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* compiled from: Alarms.java */
/* loaded from: classes12.dex */
public final class vc1 {
    public static final /* synthetic */ int a = 0;

    static {
        m100.d("Alarms");
    }

    public static void a(@NonNull Context context, @NonNull svx0 svx0Var, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        String str = dag.g;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        dag.d(intent, svx0Var);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        m100 c = m100.c();
        svx0Var.toString();
        c.getClass();
        alarmManager.cancel(service);
    }

    public static void b(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull svx0 svx0Var, long j) {
        hqn0 A = workDatabase.A();
        gqn0 c = A.c(svx0Var);
        if (c != null) {
            int i = c.c;
            a(context, svx0Var, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            String str = dag.g;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            dag.d(intent, svx0Var);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        int intValue = ((Number) workDatabase.t(new i7(new iv3(workDatabase), 1))).intValue();
        A.e(new gqn0(svx0Var.a, svx0Var.b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        String str2 = dag.g;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        dag.d(intent2, svx0Var);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
