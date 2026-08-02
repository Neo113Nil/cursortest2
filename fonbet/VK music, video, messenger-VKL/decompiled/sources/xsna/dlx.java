package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.glx;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public final /* synthetic */ class dlx implements ouf0 {

    @NonNull
    public /* synthetic */ ClearRestoreCredentialRequest b;

    @Override // xsna.ouf0
    public final void accept(@NonNull Object obj, @NonNull Object obj2) {
        ((bov) ((acg0) obj).getService()).D(this.b, new glx.b((TaskCompletionSource) obj2));
    }
}
