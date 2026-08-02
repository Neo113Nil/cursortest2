package xsna;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.vk.core.apps.BuildInfo;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.lifecycle.ProcessStateProvider;
import com.vk.metrics.performance.memory.LargeTransactionChecker;
import java.util.ArrayList;
import kotlin.Result;
import xsna.p.a;
import xsna.p.b;

/* compiled from: PerformanceReporterInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class rw90 extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "PerformanceReporter";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Object failure;
        SharedPreferences sharedPreferences;
        ow90 ow90Var = ow90.a;
        cu2 cu2Var = new cu2(8);
        ab3 ab3Var = new ab3(11);
        y0f y0fVar = new y0f(6);
        String str = "";
        if (!TextUtils.isEmpty("config_app_performance_enable") && (sharedPreferences = bl20.a) != null) {
            str = sharedPreferences.getString("config_app_performance_enable", "");
        }
        boolean equals = TextUtils.equals(str, "1");
        Application application = this.b;
        if (equals && ((BuildInfo.h() || BuildInfo.i()) && ow90.j == null)) {
            ow90.j = new LargeTransactionChecker(application, cu2Var);
        }
        ow90.d = (application.getApplicationInfo().flags & 2) != 0;
        ArrayList<aw90> arrayList = ow90.b;
        if (arrayList.isEmpty()) {
            p pVar = (p) ow90.h.getValue();
            pVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            if (!Debug.isDebuggerConnected()) {
                arrayList2.add(pVar.new a(5000L, true));
                if (ow90.d) {
                    arrayList2.add(pVar.new a(4000L, false));
                }
                d4k.a(pVar.new b());
            }
            arrayList.addAll(arrayList2);
            arrayList.add(new r220(application));
        }
        int myTid = Process.myTid();
        rgd0.a.getClass();
        try {
            failure = Integer.valueOf(Process.getThreadPriority(myTid));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Integer num = (Integer) failure;
        if ((num == null ? ProcessStateProvider.ProcessState.Gone : num.intValue() == -10 ? ProcessStateProvider.ProcessState.Foreground : ProcessStateProvider.ProcessState.Background) == ProcessStateProvider.ProcessState.Foreground) {
            ow90.b(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
        }
        c63 c63Var = c63.a;
        c63.a(new pw90());
        ow90.m = ab3Var;
        ow90.e.Q = y0fVar;
        return s3q0.a;
    }
}
