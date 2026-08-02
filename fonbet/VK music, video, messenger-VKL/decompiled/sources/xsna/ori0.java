package xsna;

import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import xsna.nri0;

/* compiled from: ServicesAdapter.kt */
/* loaded from: classes5.dex */
public final class ori0 implements VkCell.d {
    public final VkImage a;

    public ori0(nri0.b bVar) {
        this.a = bVar.n;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
    }
}
