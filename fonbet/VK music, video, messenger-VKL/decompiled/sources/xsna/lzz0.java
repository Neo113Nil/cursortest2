package xsna;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class lzz0 extends xq01 {
    public final /* synthetic */ int c;
    public final /* synthetic */ TaskCompletionSource d;
    public final /* synthetic */ x201 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzz0(x201 x201Var, TaskCompletionSource taskCompletionSource, int i, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.e = x201Var;
        this.c = i;
        this.d = taskCompletionSource2;
    }

    @Override // xsna.xq01
    public final void c() {
        TaskCompletionSource taskCompletionSource = this.d;
        int i = this.c;
        x201 x201Var = this.e;
        try {
            c401 c401Var = x201Var.b.m;
            String str = x201Var.a;
            Bundle bundle = new Bundle();
            bundle.putInt("playcore_version_code", 11004);
            c401Var.v1(str, i, bundle, new szz0(x201Var, taskCompletionSource));
        } catch (RemoteException e) {
            x201.c.c(e, "cancelInstall(%d)", Integer.valueOf(i));
            taskCompletionSource.trySetException(new RuntimeException(e));
        }
    }
}
