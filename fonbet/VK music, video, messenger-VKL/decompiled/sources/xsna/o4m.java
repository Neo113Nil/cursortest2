package xsna;

import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: DetailsHeaderItem.kt */
/* loaded from: classes5.dex */
public final class o4m extends we6 {
    public final int g;
    public final Integer h;
    public final String i;
    public wu6 j;
    public final int k;
    public int l;

    /* compiled from: DetailsHeaderItem.kt */
    public static final class a extends vif0<o4m> {
        @Override // xsna.vif0
        public final void i6(o4m o4mVar) {
            com.vk.core.view.components.group.header.c cVar;
            VkGroupHeader.Right.ExtraContent.a aVar;
            o4m o4mVar2 = o4mVar;
            VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView;
            tlo0.f h = tq.h(tlo0.Companion, o4mVar2.g);
            Integer num = o4mVar2.h;
            if (num != null) {
                cVar = new com.vk.core.view.components.group.header.c(num.intValue(), VkCounter.CounterAppearance.Appearance.Neutral, VkCounter.Mode.Tertiary, VkCounter.Size.Large);
            } else {
                cVar = null;
            }
            vkGroupHeader.setTitle(new VkGroupHeader.d(h, cVar, null, null, 0, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
            if (o4mVar2.j != null) {
                aVar = new VkGroupHeader.Right.ExtraContent.a(new tlo0.f(R.string.show_all), new l1i(o4mVar2, 4), null, null, VkButton.Appearance.Accent, null, 492);
            } else {
                aVar = null;
            }
            vkGroupHeader.setRight(new VkGroupHeader.Right(aVar, null, null, 6));
            vkGroupHeader.setTag(o4mVar2.i);
        }
    }

    public o4m(int i, int i2, Integer num) {
        num = (i2 & 2) != 0 ? null : num;
        String str = (i2 & 4) != 0 ? null : "user_details_item_gifts_header_test_tag";
        this.g = i;
        this.h = num;
        this.i = str;
        this.j = null;
        this.k = -1004;
        this.l = 1;
    }

    @Override // xsna.we6
    public final vif0<o4m> a(ViewGroup viewGroup) {
        return new a(new VkGroupHeader(viewGroup.getContext(), null, 6), viewGroup);
    }

    @Override // xsna.we6
    public final int g() {
        return this.l;
    }

    @Override // xsna.we6
    public final int h() {
        return this.k;
    }

    @Override // xsna.we6
    public final void j(int i) {
        this.l = i;
    }
}
