package xsna;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class toz0 extends okz0 {
    public final /* synthetic */ TaskCompletionSource a;

    public toz0(fqz0 fqz0Var, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // xsna.okz0, xsna.wnz0
    public final void Z0(Status status, @Nullable ModuleAvailabilityResponse moduleAvailabilityResponse) {
        i7o0.k(status, moduleAvailabilityResponse, this.a);
    }
}
