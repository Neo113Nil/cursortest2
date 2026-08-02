package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.sf;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class j {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, androidx.appcompat.app.i] */
    public static OnBackInvokedCallback b(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
        Objects.requireNonNull(appCompatDelegateImpl);
        ?? r0 = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.i
            public final void onBackInvoked() {
                AppCompatDelegateImpl.this.onBackPressed();
            }
        };
        sf.n(obj).registerOnBackInvokedCallback(1000000, r0);
        return r0;
    }

    public static void c(Object obj, Object obj2) {
        sf.n(obj).unregisterOnBackInvokedCallback(sf.l(obj2));
    }
}
