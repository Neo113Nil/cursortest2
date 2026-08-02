package xsna;

import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;
import xsna.rdm0;

/* compiled from: StoryShareCreationItemHolder.kt */
/* loaded from: classes16.dex */
public final class tdm0 extends vfz<rdm0.a> {
    public final izs<x7j0, s3q0> l;

    /* JADX WARN: Multi-variable type inference failed */
    public tdm0(ViewGroup viewGroup, izs<? super x7j0, s3q0> izsVar) {
        super(tf3.b(viewGroup, R.layout.item_editor_story_author_holder, viewGroup, false));
        this.l = izsVar;
        VkAvatar vkAvatar = (VkAvatar) this.itemView.findViewById(R.id.photo);
        TextView textView = (TextView) this.itemView.findViewById(R.id.name);
        bwt0.i0(this.itemView, new j6l0(this, 5));
        LayerDrawable layerDrawable = (LayerDrawable) m33.a(R.drawable.story_add_narrative, this.itemView.getContext());
        layerDrawable.findDrawableByLayerId(R.id.add_outline_28).setTint(this.itemView.getContext().getColor(R.color.vk_white));
        vkAvatar.setContent(new c.b(new eko(layerDrawable)));
        at.d(this.itemView, R.string.create, textView);
    }

    @Override // xsna.vfz
    public final /* bridge */ /* synthetic */ void W5(rdm0.a aVar) {
    }
}
