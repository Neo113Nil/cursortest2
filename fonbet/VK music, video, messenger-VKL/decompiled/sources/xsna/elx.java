package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public final /* synthetic */ class elx implements ouf0 {

    @NonNull
    public /* synthetic */ CreateRestoreCredentialRequest b;

    @Override // xsna.ouf0
    public final void accept(@NonNull Object obj, @NonNull Object obj2) {
        ((bov) ((acg0) obj).getService()).z1(this.b, new hlx((TaskCompletionSource) obj2));
    }
}
