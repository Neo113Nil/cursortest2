package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: IgnoredHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class ewv extends rp6<fwv, NewsEntry> implements View.OnAttachStateChangeListener {
    public final VkPlaceholder E;
    public boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewv(ViewGroup viewGroup) {
        super(R.layout.news_item_ignored_header, viewGroup);
        viewGroup.getContext();
        this.D = t980.a;
        getContext();
        this.E = (VkPlaceholder) this.itemView.findViewById(R.id.item_ignored_header);
        this.F = true;
        this.itemView.addOnAttachStateChangeListener(this);
    }

    @Override // xsna.rp6
    public final void R6(fwv fwvVar) {
        fwv fwvVar2 = fwvVar;
        this.F = true;
        VkPlaceholder vkPlaceholder = this.E;
        if (vkPlaceholder != null) {
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_check_circle_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12));
        }
        if (vkPlaceholder != null) {
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, u11.f(tlo0.Companion, fwvVar2.h)), new VkPlaceholder.b.C0859b(14, new tlo0.h(fwvVar2.i))));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.F) {
            awt0.q(this.itemView);
            this.F = false;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
