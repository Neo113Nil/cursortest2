package xsna;

import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public final class ilx extends bnv {
    public final /* synthetic */ TaskCompletionSource<GetRestoreCredentialResponse> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilx(TaskCompletionSource<GetRestoreCredentialResponse> taskCompletionSource) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
        this.a = taskCompletionSource;
    }
}
