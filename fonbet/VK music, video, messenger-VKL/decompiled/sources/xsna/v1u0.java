package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* compiled from: ViewUtils.java */
/* loaded from: classes13.dex */
public final class v1u0 implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NonNull View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
