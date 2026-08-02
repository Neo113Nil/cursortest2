package xsna;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: GoodReviewsAndCommentsViewHolder.kt */
/* loaded from: classes18.dex */
public final class e8u implements View.OnAttachStateChangeListener {
    public final /* synthetic */ f8u b;

    public e8u(f8u f8uVar) {
        this.b = f8uVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        f8u f8uVar = this.b;
        ViewPager2 viewPager2 = f8uVar.r;
        if (viewPager2.getAdapter() != null) {
            f8uVar.q6();
            f8uVar.itemView.post(new yh9(f8uVar, 3));
        }
        viewPager2.b(f8uVar.p);
        com.vk.core.view.components.tabs.e eVar = f8uVar.s;
        if (eVar.f) {
            return;
        }
        eVar.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        f8u f8uVar = this.b;
        f8uVar.r.g(f8uVar.p);
    }
}
