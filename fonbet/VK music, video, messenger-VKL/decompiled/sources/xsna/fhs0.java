package xsna;

import android.content.Context;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import java.lang.ref.WeakReference;

/* compiled from: VideoDisposableObserver.java */
/* loaded from: classes17.dex */
public abstract class fhs0<T> extends io.reactivex.rxjava3.observers.a<T> {
    public final WeakReference<Context> c;

    public fhs0(Context context) {
        this.c = new WeakReference<>(null);
        this.c = new WeakReference<>(context);
    }

    @Override // io.reactivex.rxjava3.core.v
    public void onError(Throwable th) {
        if (!(th instanceof VKApiExecutionException)) {
            L.i(th);
            return;
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        Context context = this.c.get();
        if (context != null) {
            j03.i(context, vKApiExecutionException);
        }
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
    }
}
