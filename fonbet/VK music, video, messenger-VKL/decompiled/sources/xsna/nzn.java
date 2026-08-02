package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DonutDocumentHolder.kt */
/* loaded from: classes4.dex */
public final class nzn extends rp6<ozn, NewsEntry> {
    public final VkText E;
    public final String F;
    public final Object G;

    public nzn(ViewGroup viewGroup) {
        super(new VkText(viewGroup.getContext(), null, 6, 0), viewGroup);
        View view = this.itemView;
        VkText vkText = (VkText) view;
        this.E = vkText;
        this.F = view.getContext().getString(R.string.feed_donut_teaser_file_accessibility);
        this.G = msy.a(LazyThreadSafetyMode.NONE, new iz3(8));
        vkText.setPaddingRelative(e3m.a(R.dimen.vk_ui_base_padding_horizontal, this.itemView.getContext()), e3m.a(R.dimen.vk_ui_spacing_size_l, this.itemView.getContext()), e3m.a(R.dimen.vk_ui_base_padding_horizontal, this.itemView.getContext()), e3m.a(R.dimen.vk_ui_spacing_size_xs, this.itemView.getContext()));
        getContext();
        vkText.setTextAppearance(R.style.VkUiTypography_FootnoteMedium);
        vkText.setTextColor(krv0.m(R.attr.vk_ui_text_secondary, this.itemView.getContext()));
        vkText.setOnClickListener(new aj6(this, 2));
    }

    @Override // xsna.rp6
    public final void R6(ozn oznVar) {
        String str = oznVar.h;
        VkText vkText = this.E;
        vkText.setText(str);
        vkText.setContentDescription(this.F + ' ' + str);
    }
}
