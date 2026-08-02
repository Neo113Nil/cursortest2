package xsna;

import android.content.Context;
import com.vk.core.view.components.cell.VkCell;
import xsna.nri0;

/* compiled from: ServicesAdapter.kt */
/* loaded from: classes5.dex */
public final class pri0 implements VkCell.e {
    public final /* synthetic */ nri0.b a;

    public pri0(nri0.b bVar) {
        this.a = bVar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new ori0(this.a);
    }
}
