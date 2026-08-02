package xsna;

import android.view.ViewGroup;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: PaginationErrorViewHolder.kt */
/* loaded from: classes17.dex */
public final class yd90 extends vfz<FeedItem.Pagination.a> {
    public final w8 l;
    public final VkPlaceholder m;

    public yd90(ViewGroup viewGroup, w8 w8Var) {
        super(new VkPlaceholder(viewGroup.getContext(), null, 6, 0));
        this.l = w8Var;
        VkPlaceholder vkPlaceholder = (VkPlaceholder) this.itemView;
        this.m = vkPlaceholder;
        vkPlaceholder.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        vkPlaceholder.setMode(VkPlaceholder.Mode.Overlay);
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.clip_feed_error_text))));
        vkPlaceholder.setImportantForAccessibility(2);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(FeedItem.Pagination.a aVar) {
        tlo0.f h = tq.h(tlo0.Companion, R.string.clip_feed_error_retry);
        VkButton.Mode mode = VkButton.Mode.Outline;
        this.m.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) h, (gzs) new yq1(14, this, aVar), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, mode, (VkButton.Appearance) null, false, 412), null, null, null, 8));
    }
}
