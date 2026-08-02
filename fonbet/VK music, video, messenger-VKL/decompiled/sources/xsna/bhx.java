package xsna;

import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class bhx extends jnv {
    public final /* synthetic */ TaskCompletionSource<PendingGetCredentialHandle> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhx(TaskCompletionSource<PendingGetCredentialHandle> taskCompletionSource) {
        super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
        this.a = taskCompletionSource;
    }
}
