package xsna;

import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.lang.ref.WeakReference;

/* compiled from: OpenOfflineMusicSnackbarVh.kt */
/* loaded from: classes16.dex */
public final class sr80 {
    public final WeakReference<Context> a;
    public ikv0 c;
    public io.reactivex.rxjava3.disposables.c b = EmptyDisposable.INSTANCE;
    public boolean d = true;

    public sr80(FragmentActivity fragmentActivity) {
        this.a = new WeakReference<>(fragmentActivity);
    }

    public final void a() {
        if (!Looper.getMainLooper().isCurrentThread()) {
            asu0.a.d().c(new n52(this, 12));
            return;
        }
        this.b.dispose();
        ikv0 ikv0Var = this.c;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        this.c = null;
    }
}
