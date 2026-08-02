package xsna;

import android.view.ViewTreeObserver;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;

/* compiled from: PollEditorScreen.kt */
/* loaded from: classes17.dex */
public final class mpb0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ hpb0 b;
    public final /* synthetic */ VkRecyclerPaginatedView c;

    public mpb0(hpb0 hpb0Var, VkRecyclerPaginatedView vkRecyclerPaginatedView) {
        this.b = hpb0Var;
        this.c = vkRecyclerPaginatedView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ng<? extends Object> ngVar = this.b.n;
        if (ngVar.getItemCount() > 0 && ngVar.K0() == null) {
            ngVar.L0(0);
        }
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
