package xsna;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class rl01 extends sl01 {
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ko01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl01(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str, ko01 ko01Var) {
        super(taskCompletionSource);
        this.e = ko01Var;
        this.c = taskCompletionSource2;
        this.d = str;
    }

    @Override // xsna.sl01
    public final void a() {
        TaskCompletionSource taskCompletionSource = this.c;
        ko01 ko01Var = this.e;
        try {
            ko01Var.a.m.q1(ko01Var.b, ko01.b(), new zm01(ko01Var, new tk01("OnCompleteUpdateCallback"), taskCompletionSource));
        } catch (RemoteException e) {
            ko01.e.b(e, "completeUpdate(%s)", this.d);
            taskCompletionSource.trySetException(new RuntimeException(e));
        }
    }
}
