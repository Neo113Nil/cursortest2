package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: RadioStationCellVh.kt */
/* loaded from: classes16.dex */
public final class coa implements VkCell.d {
    public final ImageView a;

    public coa(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.radio_toggle_subscription);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        float f = 28;
        bwt0.m0(iah0.a(f), iah0.a(f), imageView);
        imageView.setColorFilter(dhr0.t.c(R.attr.vk_ui_icon_secondary));
        this.a = imageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        eoa eoaVar = fVar instanceof eoa ? (eoa) fVar : null;
        if (eoaVar != null) {
            Pair pair = eoaVar.a.y.g ? new Pair(Integer.valueOf(R.drawable.vk_icon_done_outline_28), Integer.valueOf(R.string.music_radio_talkback_unfollow)) : new Pair(Integer.valueOf(R.drawable.vk_icon_add_outline_28), Integer.valueOf(R.string.music_radio_talkback_follow));
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            Drawable a = dhr0.t.a(intValue);
            ImageView imageView = this.a;
            imageView.setImageDrawable(a);
            imageView.setContentDescription(imageView.getContext().getString(intValue2));
            imageView.setOnClickListener(new bg0(eoaVar, 2));
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
