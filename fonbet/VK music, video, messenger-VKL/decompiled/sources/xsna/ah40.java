package xsna;

import android.content.Context;
import com.vk.core.view.components.cell.VkCell;

/* compiled from: MusicDownloadIndicationView.kt */
/* loaded from: classes3.dex */
public final class ah40 implements VkCell.e {
    public final /* synthetic */ izs<bi40, Integer> a;

    public ah40(izs izsVar) {
        this.a = izsVar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new yg40(context, this.a);
    }
}
