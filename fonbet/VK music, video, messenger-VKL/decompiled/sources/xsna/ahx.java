package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final /* synthetic */ class ahx implements ouf0 {

    @NonNull
    public /* synthetic */ GetCredentialRequest b;

    @Override // xsna.ouf0
    public final void accept(@NonNull Object obj, @NonNull Object obj2) {
        GetCredentialRequest getCredentialRequest = this.b;
        ((knv) ((fvv) obj).getService()).W(new bhx((TaskCompletionSource) obj2), getCredentialRequest);
    }
}
