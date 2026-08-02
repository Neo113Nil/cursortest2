package xsna;

import android.content.Context;
import android.os.Handler;
import com.vk.api.sdk.exceptions.VKApiExecutionException;

/* compiled from: CartAmountErrorHandlerImpl.kt */
/* loaded from: classes18.dex */
public final class uv9 implements sv9 {
    public final bpn0 a = new bpn0(new z34(2));

    @Override // xsna.sv9
    public final boolean a(Context context, Throwable th) {
        VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
        if (context == null || vKApiExecutionException == null || vKApiExecutionException.s() != 1530) {
            return false;
        }
        ((Handler) this.a.getValue()).post(new tv9(this, context));
        return true;
    }
}
