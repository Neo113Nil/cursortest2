package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: VideoBackgroundAutoPlayStrategy.kt */
/* loaded from: classes2.dex */
public final class p4s0 {
    public final Context a;
    public final a b;
    public final com.vk.libvideo.autoplay.background.controller.d c;

    /* compiled from: VideoBackgroundAutoPlayStrategy.kt */
    public static final class a {
        public List<Pair<Integer, Integer>> a;
        public boolean b;

        public a() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(tasksActivitiesCount=");
            sb.append(this.a);
            sb.append(", isLastInvalidationFailed=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public a(Object obj) {
            this.a = EmptyList.b;
            this.b = false;
        }
    }

    public p4s0(Context context, a aVar, com.vk.libvideo.autoplay.background.controller.d dVar) {
        q4s0 q4s0Var = q4s0.a;
        this.a = context;
        this.b = aVar;
        this.c = dVar;
        c();
    }

    public static ArrayList b(Context context) {
        int i;
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks();
        ArrayList arrayList = new ArrayList(c5g.u(appTasks, 10));
        Iterator<T> it = appTasks.iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = ((ActivityManager.AppTask) it.next()).getTaskInfo();
            int i2 = Build.VERSION.SDK_INT >= 29 ? taskInfo.taskId : taskInfo.persistentId;
            i = taskInfo.numActivities;
            arrayList.add(new Pair(Integer.valueOf(i2), Integer.valueOf(i)));
        }
        return arrayList;
    }

    public final boolean a(yg5 yg5Var) {
        boolean z;
        boolean b = this.c.b(yg5Var);
        q4s0 q4s0Var = q4s0.a;
        boolean z2 = false;
        boolean z3 = q4s0Var.d() && q4s0Var.c();
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_OPEN_STANDALONE_BOTTOMSHEET_BGR_VIEW;
        videoFeatures.getClass();
        boolean z4 = !com.vk.toggle.b.A.a(videoFeatures) || !BuildInfo.s() || yg5Var.A().v() || yg5Var.A().Ia();
        if (b && z3) {
            a aVar = this.b;
            if (aVar.b) {
                c63 c63Var = c63.a;
                z = c63.f;
            } else {
                List<Pair<Integer, Integer>> list = aVar.a;
                try {
                    ArrayList b2 = b(this.a);
                    if (b2.size() == list.size()) {
                        int size = b2.size();
                        for (int i = 0; i < size; i++) {
                            Pair<Integer, Integer> pair = list.get(i);
                            int intValue = pair.d().intValue();
                            int intValue2 = pair.g().intValue();
                            Pair pair2 = (Pair) b2.get(i);
                            int intValue3 = ((Number) pair2.d()).intValue();
                            int intValue4 = ((Number) pair2.g()).intValue();
                            if (intValue3 == intValue && intValue4 == intValue2) {
                            }
                        }
                        z = false;
                    }
                    z = true;
                    break;
                } catch (Throwable th) {
                    L.E(th, "Tasks activities counts calculation has failed. Fallback to application background check.");
                    c63 c63Var2 = c63.a;
                    z = c63.f;
                }
            }
            if (!z && z4) {
                z2 = true;
            }
        }
        c();
        return z2;
    }

    public final void c() {
        a aVar = this.b;
        if (q4s0.a.d()) {
            try {
                aVar.a = b(this.a);
                aVar.b = false;
            } catch (Throwable th) {
                L.E(th, "Invalidation has failed. Fallback to application background check.");
                aVar.a = EmptyList.b;
                aVar.b = true;
            }
        }
    }
}
