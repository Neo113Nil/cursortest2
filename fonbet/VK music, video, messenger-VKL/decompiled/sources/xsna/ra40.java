package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookCellVh;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;

/* compiled from: AudioBookCellVh.kt */
/* loaded from: classes16.dex */
public final class ra40 implements VkCell.d {
    public final AudioBookCellVh.a a;
    public final ImageView b;
    public final LinearLayout c;

    public ra40(Context context, AudioBookCellVh.a aVar) {
        this.a = aVar;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.menu);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        float f = 16;
        bwt0.m0(iah0.a(f), iah0.a(f), imageView);
        abg0 abg0Var = dhr0.t;
        imageView.setImageDrawable(abg0Var.a(R.drawable.vk_icon_more_vertical_16));
        imageView.setColorFilter(abg0Var.c(R.attr.vk_ui_icon_secondary));
        imageView.setContentDescription(context.getString(R.string.music_talkback_more));
        imageView.setOnClickListener(new qj8(this, 6));
        this.b = imageView;
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        a.setGravity(17);
        a.setLayoutParams(layoutParams);
        a.addView(imageView);
        this.c = a;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        if ((fVar instanceof uj4 ? (uj4) fVar : null) != null) {
            awt0.u(this.b, true);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.c;
    }
}
