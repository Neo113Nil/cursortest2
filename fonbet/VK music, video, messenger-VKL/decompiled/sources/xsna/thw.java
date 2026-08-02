package xsna;

import android.view.View;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.view.components.tile.VkTileImageView;

/* compiled from: RecommendationsViewHolder.kt */
/* loaded from: classes6.dex */
public final class thw implements VkTileImageView.b {
    public final VKImageController<View> a;
    public final View b;

    /* JADX WARN: Multi-variable type inference failed */
    public thw(VKImageController<? extends View> vKImageController) {
        this.a = vKImageController;
        this.b = vKImageController.getView();
    }

    @Override // com.vk.core.view.components.tile.VkTileImageView.b
    public final void a(VkTileImageView.c cVar) {
        qzt0 qzt0Var = cVar instanceof qzt0 ? (qzt0) cVar : null;
        if (qzt0Var == null) {
            return;
        }
        this.a.f(qzt0Var.a, qzt0Var.b);
    }

    @Override // com.vk.core.view.components.tile.VkTileImageView.b
    public final View getView() {
        return this.b;
    }
}
