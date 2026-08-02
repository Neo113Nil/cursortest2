package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.install.InstallException;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class dc01 implements ra3 {
    public final ko01 a;
    public final r501 b;
    public final Context c;

    public dc01(ko01 ko01Var, r501 r501Var, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = ko01Var;
        this.b = r501Var;
        this.c = context;
    }

    @Override // xsna.ra3
    public final Task<qa3> a() {
        String packageName = this.c.getPackageName();
        ko01 ko01Var = this.a;
        as01 as01Var = ko01Var.a;
        if (as01Var != null) {
            ko01.e.c("requestUpdateInfo(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            as01Var.a().post(new tn01(as01Var, taskCompletionSource, taskCompletionSource, new il01(taskCompletionSource, taskCompletionSource, packageName, ko01Var)));
            return taskCompletionSource.getTask();
        }
        tk01 tk01Var = ko01.e;
        Object[] objArr = {-9};
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", tk01.d(tk01Var.a, "onError(%d)", objArr));
        } else {
            tk01Var.getClass();
        }
        return Tasks.forException(new InstallException(-9));
    }

    @Override // xsna.ra3
    public final boolean b(qa3 qa3Var, int i, Activity activity) throws IntentSender.SendIntentException {
        byte b = (byte) (((byte) 1) | 2);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" appUpdateType");
            }
            if ((b & 2) == 0) {
                sb.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        zr01 zr01Var = new zr01(i);
        if (activity == null || qa3Var.a(zr01Var) == null || qa3Var.i) {
            return false;
        }
        qa3Var.i = true;
        activity.startIntentSenderForResult(qa3Var.a(zr01Var).getIntentSender(), 10101, null, 0, 0, 0, null);
        return true;
    }

    @Override // xsna.ra3
    public final synchronized void c(a3u a3uVar) {
        this.b.b(a3uVar);
    }

    @Override // xsna.ra3
    public final synchronized void d(a3u a3uVar) {
        this.b.a(a3uVar);
    }

    @Override // xsna.ra3
    public final Task<Void> e() {
        String packageName = this.c.getPackageName();
        ko01 ko01Var = this.a;
        as01 as01Var = ko01Var.a;
        if (as01Var != null) {
            ko01.e.c("completeUpdate(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            as01Var.a().post(new tn01(as01Var, taskCompletionSource, taskCompletionSource, new rl01(taskCompletionSource, taskCompletionSource, packageName, ko01Var)));
            return taskCompletionSource.getTask();
        }
        tk01 tk01Var = ko01.e;
        Object[] objArr = {-9};
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", tk01.d(tk01Var.a, "onError(%d)", objArr));
        } else {
            tk01Var.getClass();
        }
        return Tasks.forException(new InstallException(-9));
    }
}
