package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.group.header.VkGroupHeader;
import xsna.tlo0;

/* compiled from: CaptionItem.kt */
/* loaded from: classes5.dex */
public final class wr9 extends we6 {
    public final String g;
    public final Integer h;
    public final String i;
    public final gzs<s3q0> j;
    public final boolean k;
    public final int l;

    /* compiled from: CaptionItem.kt */
    public static final class a extends vif0<wr9> {
        public final VkGroupHeader n;

        public a(VkGroupHeader vkGroupHeader, ViewGroup viewGroup) {
            super(vkGroupHeader, viewGroup);
            this.n = vkGroupHeader;
            vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        }

        @Override // xsna.vif0
        public final void i6(wr9 wr9Var) {
            com.vk.core.view.components.group.header.c cVar;
            VkGroupHeader.Right right;
            wr9 wr9Var2 = wr9Var;
            String str = wr9Var2.i;
            tlo0.h d = oq.d(tlo0.Companion, wr9Var2.g);
            Integer num = wr9Var2.h;
            VkGroupHeader.Right right2 = null;
            if (num != null) {
                cVar = new com.vk.core.view.components.group.header.c(num.intValue(), VkCounter.CounterAppearance.Appearance.Neutral, VkCounter.Mode.Tertiary, 8);
            } else {
                cVar = null;
            }
            VkGroupHeader.d dVar = new VkGroupHeader.d(d, cVar, null, null, 0, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            VkGroupHeader vkGroupHeader = this.n;
            vkGroupHeader.setTitle(dVar);
            gzs<s3q0> gzsVar = wr9Var2.j;
            if (gzsVar != null) {
                if (wr9Var2.k) {
                    if (str == null) {
                        str = "";
                    }
                    right = new VkGroupHeader.Right(null, null, new VkGroupHeader.Right.a.C0841a(gzsVar, new tlo0.h(str)), 3);
                } else {
                    if (str == null) {
                        str = "";
                    }
                    right = new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(new tlo0.h(str), gzsVar, null, null, VkButton.Appearance.Accent, null, 492), null, null, 6);
                }
                right2 = right;
            }
            vkGroupHeader.setRight(right2);
        }
    }

    public wr9() {
        throw null;
    }

    public wr9(String str, Integer num, String str2, b010 b010Var, int i) {
        num = (i & 2) != 0 ? null : num;
        str2 = (i & 4) != 0 ? null : str2;
        b010Var = (i & 8) != 0 ? null : b010Var;
        this.g = str;
        this.h = num;
        this.i = str2;
        this.j = b010Var;
        this.k = false;
        this.l = -1016;
    }

    @Override // xsna.we6
    public final vif0 a(ViewGroup viewGroup) {
        VkGroupHeader vkGroupHeader = new VkGroupHeader(viewGroup.getContext(), null, 6);
        vkGroupHeader.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new a(vkGroupHeader, viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.l;
    }
}
