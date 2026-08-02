package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.lang.ref.WeakReference;

/* compiled from: OpenCallbackImpl.kt */
/* loaded from: classes17.dex */
public class aq80 implements yp80 {
    public final WeakReference<Context> b;

    public aq80(Context context) {
        this.b = new WeakReference<>(context);
    }

    @Override // xsna.yp80
    public void onError(Throwable th) {
        Context context = this.b.get();
        if (context != null && (th instanceof VKApiExecutionException)) {
            j03.i(context, (VKApiExecutionException) th);
        }
    }

    @Override // xsna.yp80
    public final void I() {
    }

    @Override // xsna.yp80
    public void onSuccess() {
    }

    @Override // xsna.yp80
    public final void B0(boolean z) {
    }
}
