package xsna;

import com.vk.core.ui.image.VKImageController;
import com.vk.core.view.components.tile.VkTileImageView;

/* compiled from: RecommendationsViewHolder.kt */
/* loaded from: classes6.dex */
public final class qzt0 implements VkTileImageView.c {
    public final String a;
    public final VKImageController.b b;

    public qzt0(String str, VKImageController.b bVar) {
        this.a = str;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzt0)) {
            return false;
        }
        qzt0 qzt0Var = (qzt0) obj;
        return epx.f(this.a, qzt0Var.a) && epx.f(this.b, qzt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewParams(imageUrl=" + this.a + ", imageParams=" + this.b + ')';
    }
}
