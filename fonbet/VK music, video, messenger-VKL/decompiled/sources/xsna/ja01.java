package xsna;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
public final class ja01 extends ah01 {
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ kf01 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja01(kf01 kf01Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.d = kf01Var;
        this.c = taskCompletionSource2;
    }

    @Override // xsna.ah01
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.c;
        kf01 kf01Var = this.d;
        try {
            kf01Var.a.m.u0(kf01Var.b, zg01.a(), new com.google.android.play.core.review.c(kf01Var, taskCompletionSource));
        } catch (RemoteException e) {
            lf01 lf01Var = kf01.c;
            Object[] objArr = {kf01Var.b};
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", lf01.b(lf01Var.a, "error requesting in-app review for %s", objArr), e);
            } else {
                lf01Var.getClass();
            }
            taskCompletionSource.trySetException(new RuntimeException(e));
        }
    }
}
