package xsna;

import android.view.ViewTreeObserver;
import com.vk.stickers.keyboard.page.StickersRecyclerView;

/* compiled from: StickersRecyclerView.kt */
/* loaded from: classes6.dex */
public final class ecl0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ StickersRecyclerView b;

    public ecl0(StickersRecyclerView stickersRecyclerView) {
        this.b = stickersRecyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        StickersRecyclerView stickersRecyclerView = this.b;
        stickersRecyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
        stickersRecyclerView.f();
        return false;
    }
}
