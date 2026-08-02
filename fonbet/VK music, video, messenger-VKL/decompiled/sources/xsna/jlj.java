package xsna;

import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: ContentTitlePhotosInfoItem.kt */
/* loaded from: classes4.dex */
public final class jlj extends xe6 {
    public final CharSequence b;
    public final int c;
    public final boolean d;
    public final Runnable e;
    public final String f;
    public final int g;

    /* compiled from: ContentTitlePhotosInfoItem.kt */
    public static final class a extends vif0<jlj> {
        public final VkGroupHeader n;

        public a(ViewGroup viewGroup) {
            super(new VkGroupHeader(viewGroup.getContext(), null, 6), viewGroup);
            VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView;
            vkGroupHeader.setMinimumHeight(iah0.a(45));
            vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
            vkGroupHeader.setShowTopDivider(true);
            vkGroupHeader.setPadding(0, iah0.a(1), 0, 0);
            this.n = vkGroupHeader;
        }

        @Override // xsna.vif0
        public final void i6(jlj jljVar) {
            jlj jljVar2 = jljVar;
            VkGroupHeader.Right right = null;
            VkGroupHeader.d dVar = new VkGroupHeader.d(jljVar2.b.toString(), null, new com.vk.core.view.components.group.header.c(jljVar2.c, VkCounter.CounterAppearance.Appearance.Neutral, VkCounter.Mode.Tertiary, 8), null, 0, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            VkGroupHeader vkGroupHeader = this.n;
            vkGroupHeader.setTitle(dVar);
            if (jljVar2.d) {
                tlo0.h d = oq.d(tlo0.Companion, jljVar2.f);
                VkButton.Size size = VkButton.Size.Medium;
                VkButton.Appearance appearance = VkButton.Appearance.Neutral;
                right = new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(d, new q5f(jljVar2, 8), size, VkButton.Mode.Link, appearance, null, 480), null, null, 6);
            }
            vkGroupHeader.setRight(right);
        }
    }

    public /* synthetic */ jlj(String str, int i) {
        this(str, i, false, null);
    }

    @Override // xsna.xe6
    public final vif0 a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.xe6
    public final int b() {
        return this.g;
    }

    public jlj(CharSequence charSequence, int i, boolean z, or4 or4Var) {
        this.b = charSequence;
        this.c = i;
        this.d = z;
        this.e = or4Var;
        this.f = y8g0.e(R.string.media_picker_photo_vk_show_all);
        this.g = -25;
    }
}
