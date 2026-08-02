package xsna;

import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public final class hlx extends qmv {
    public final /* synthetic */ TaskCompletionSource<CreateRestoreCredentialResponse> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlx(TaskCompletionSource<CreateRestoreCredentialResponse> taskCompletionSource) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
        this.a = taskCompletionSource;
    }
}
