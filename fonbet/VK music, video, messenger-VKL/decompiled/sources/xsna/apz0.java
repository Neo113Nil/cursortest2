package xsna;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class apz0 extends okz0 {
    public final /* synthetic */ TaskCompletionSource a;

    public apz0(fqz0 fqz0Var, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // xsna.okz0, xsna.wnz0
    public final void C(Status status, @Nullable ModuleInstallResponse moduleInstallResponse) {
        i7o0.k(status, moduleInstallResponse, this.a);
    }
}
