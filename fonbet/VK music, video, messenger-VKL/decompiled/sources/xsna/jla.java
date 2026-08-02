package xsna;

import android.content.Context;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: CategoryLinkVh.kt */
/* loaded from: classes16.dex */
public final class jla implements VkCell.e {
    public final int a;

    public jla(int i) {
        this.a = i;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new ila(context, this.a);
    }
}
