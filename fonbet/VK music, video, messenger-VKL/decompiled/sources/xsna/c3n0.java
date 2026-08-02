package xsna;

import android.view.View;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.channels.impl.list.item.SuggestHeaderItem;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: SuggestHeaderViewHolder.kt */
/* loaded from: classes16.dex */
public final class c3n0 extends vfz<SuggestHeaderItem> {
    public final lgb l;
    public final VkGroupHeader m;

    public c3n0(View view, com.vk.channels.impl.list.f fVar) {
        super(view);
        this.l = fVar;
        this.m = (VkGroupHeader) view.findViewById(R.id.suggested_channels_header);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(SuggestHeaderItem suggestHeaderItem) {
        SuggestHeaderItem suggestHeaderItem2 = suggestHeaderItem;
        VkGroupHeader.d dVar = new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.vkapp_channels_suggested_title_short), new com.vk.core.view.components.group.header.c(suggestHeaderItem2.b, VkCounter.CounterAppearance.Appearance.Accent, VkCounter.Mode.Primary, 8), null, null, 0, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
        VkGroupHeader vkGroupHeader = this.m;
        vkGroupHeader.setTitle(dVar);
        vkGroupHeader.setSize(VkGroupHeader.Size.Small);
        SuggestHeaderItem.DropdownState dropdownState = suggestHeaderItem2.c;
        VkGroupHeader.Right right = null;
        if (dropdownState != SuggestHeaderItem.DropdownState.NoNeed) {
            final boolean z = dropdownState == SuggestHeaderItem.DropdownState.Expanded;
            right = new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(new tlo0.f(z ? R.string.vkim_channels_suggests_collapse : R.string.vkim_channels_suggests_show_more), new gzs() { // from class: xsna.b3n0
                @Override // xsna.gzs
                public final Object invoke() {
                    lgb lgbVar = this.l;
                    if (z) {
                        lgbVar.o();
                    } else {
                        lgbVar.t();
                    }
                    return s3q0.a;
                }
            }, VkButton.Size.Small, VkButton.Mode.Link, VkButton.Appearance.Accent, null, 480), null, null, 6);
        }
        vkGroupHeader.setRight(right);
    }
}
