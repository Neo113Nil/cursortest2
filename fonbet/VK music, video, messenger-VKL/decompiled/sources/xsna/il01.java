package xsna;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class il01 extends sl01 {
    public final /* synthetic */ String c;
    public final /* synthetic */ TaskCompletionSource d;
    public final /* synthetic */ ko01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il01(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str, ko01 ko01Var) {
        super(taskCompletionSource);
        this.e = ko01Var;
        this.c = str;
        this.d = taskCompletionSource2;
    }

    @Override // xsna.sl01
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.d;
        ko01 ko01Var = this.e;
        String str = this.c;
        try {
            ko01Var.a.m.R(ko01Var.b, ko01.a(ko01Var, str), new sn01(ko01Var, taskCompletionSource, str));
        } catch (RemoteException e) {
            ko01.e.b(e, "requestUpdateInfo(%s)", str);
            taskCompletionSource.trySetException(new RuntimeException(e));
        }
    }
}
