package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DonutPostTeaserTextHolder.kt */
/* loaded from: classes4.dex */
public final class t1o extends rp6<b4o, NewsEntry> {
    public final VkText E;
    public final Object F;

    public t1o(ViewGroup viewGroup) {
        super(new VkText(viewGroup.getContext(), null, 6, 0), viewGroup);
        VkText vkText = (VkText) this.itemView;
        this.E = vkText;
        this.F = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.tools.controls.seekbar.n(17));
        vkText.setPaddingRelative(e3m.a(R.dimen.vk_ui_base_padding_horizontal, this.itemView.getContext()), e3m.a(R.dimen.vk_ui_spacing_size_m, this.itemView.getContext()), e3m.a(R.dimen.vk_ui_base_padding_horizontal, this.itemView.getContext()), 0);
        getContext();
        vkText.setTextAppearance(R.style.VkUiTypography_Paragraph);
        vkText.setTextColor(krv0.m(R.attr.vk_ui_text_primary, this.itemView.getContext()));
        vkText.setOnClickListener(new com.vk.im.video.d(this, 4));
    }

    @Override // xsna.rp6
    public final void R6(b4o b4oVar) {
        this.E.setText(b4oVar.h);
    }
}
