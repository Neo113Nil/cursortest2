package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.shimmer.ThemableShimmer;

/* compiled from: View.kt */
/* loaded from: classes4.dex */
public final class i9n implements View.OnAttachStateChangeListener {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ ThemableShimmer c;

    public i9n(RecyclerView recyclerView, ThemableShimmer themableShimmer) {
        this.b = recyclerView;
        this.c = themableShimmer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
