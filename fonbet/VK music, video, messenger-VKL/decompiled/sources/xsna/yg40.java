package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;

/* compiled from: MusicDownloadIndicationView.kt */
/* loaded from: classes3.dex */
public final class yg40 implements VkCell.d {
    public final wg40 a;

    public yg40(Context context, izs izsVar) {
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_download_outline_16);
        wg40 wg40Var = new wg40(context);
        wg40Var.setId(R.id.download_indication);
        float f = 40;
        wg40Var.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(f), iah0.a(f)));
        wg40Var.setDownloadedIcon(R.drawable.vk_icon_arrow_down_circle_16);
        wg40Var.setNotLoadedIcon(valueOf);
        wg40Var.setContentDescriptionProvider(izsVar);
        wg40Var.setOnClickListener(null);
        this.a = wg40Var;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        if (fVar instanceof xg40) {
            this.a.setDownloadState(((xg40) fVar).a);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
