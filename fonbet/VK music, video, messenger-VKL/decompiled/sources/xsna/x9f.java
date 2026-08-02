package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: ClipsTooltipsController.kt */
/* loaded from: classes16.dex */
public final class x9f implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ baf c;
    public final /* synthetic */ View d;

    public x9f(View view, baf bafVar, View view2) {
        this.b = view;
        this.c = bafVar;
        this.d = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.b;
        int visibility = view.getVisibility();
        if (visibility == 0) {
            Object tag = view.getTag();
            if ((tag instanceof Integer) && visibility == ((Number) tag).intValue()) {
                return;
            }
            baf bafVar = this.c;
            com.vk.core.tips.b bVar = bafVar.b;
            if (bVar != null) {
                bVar.b(true);
                bafVar.b = null;
            }
            View view2 = this.d;
            if (view2 != null) {
                view2.postDelayed(new qe9(2, bafVar, view2), 300L);
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
