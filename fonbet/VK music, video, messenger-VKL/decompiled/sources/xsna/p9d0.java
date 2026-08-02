package xsna;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.tile.VkTile;

/* compiled from: PrimaryHolder.kt */
/* loaded from: classes5.dex */
public final class p9d0 implements VkTile.g {
    public final AppCompatImageView a;

    public p9d0(AppCompatImageView appCompatImageView) {
        this.a = appCompatImageView;
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
        AppCompatImageView appCompatImageView = this.a;
        int i = q9d0.v;
        f4m.z(i, i, appCompatImageView);
    }

    @Override // com.vk.core.view.components.tile.VkTile.g
    public final View getView() {
        return this.a;
    }
}
