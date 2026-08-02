package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: MusicEditPlaylistTrackItemsAdapter.kt */
/* loaded from: classes3.dex */
public final class t0p implements VkCell.d {
    public final t3h a;
    public final VKImageView b;
    public final VKImageView c;

    public t0p(Context context, t3h t3hVar) {
        this.a = t3hVar;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setId(R.id.audio_action);
        float f = 48;
        vKImageView.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(f), iah0.a(f)));
        vKImageView.setScaleType(ImageView.ScaleType.CENTER);
        gpo0.f(vKImageView, Integer.valueOf(R.attr.vk_ui_icon_tertiary));
        this.b = vKImageView;
        this.c = vKImageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        s0p s0pVar = fVar instanceof s0p ? (s0p) fVar : null;
        if (s0pVar != null) {
            boolean z = s0pVar.b;
            int i = z ? R.drawable.vk_icon_add_24 : R.drawable.vk_icon_cancel_24;
            VKImageView vKImageView = this.b;
            vKImageView.setImageResource(i);
            vKImageView.setContentDescription(vKImageView.getContext().getString(z ? R.string.accessibility_add_to_playlist : R.string.accessibility_remove_from_playlist));
            vKImageView.setOnClickListener(new vq8(1, this, s0pVar));
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.c;
    }
}
