package xsna;

import android.app.Activity;
import android.app.ActivityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: UiTrackingNavigationDetector.kt */
/* loaded from: classes.dex */
public final class q1q0 {
    public Object a;
    public boolean b;
    public boolean c;

    /* compiled from: UiTrackingNavigationDetector.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TaskActivitiesCount(taskId=");
            sb.append(this.a);
            sb.append(", activitiesCount=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public static ArrayList a(Activity activity) {
        int i;
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) activity.getSystemService("activity")).getAppTasks();
        ArrayList arrayList = new ArrayList(c5g.u(appTasks, 10));
        Iterator<T> it = appTasks.iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) it.next()).getTaskInfo();
            int i2 = gz80.a(29) ? taskInfo.taskId : taskInfo.persistentId;
            i = taskInfo.numActivities;
            arrayList.add(new a(i2, i));
        }
        return arrayList;
    }
}
