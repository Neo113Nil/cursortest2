package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.data.CallProducerButton;
import com.vkontakte.android.R;

/* compiled from: GoodPreviewButtonsItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class d6u extends vfz<p5u> {
    public final VkButton l;
    public final VkButton m;
    public final VkButton n;
    public p5u o;

    public d6u(ViewGroup viewGroup, sop sopVar) {
        super(R.layout.good_preview_buttons_item, viewGroup);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.product_preview_add_to_bookmarks_button);
        this.l = vkButton;
        VkButton vkButton2 = (VkButton) this.itemView.findViewById(R.id.product_preview_add_to_cart_button);
        this.m = vkButton2;
        VkButton vkButton3 = (VkButton) this.itemView.findViewById(R.id.product_preview_write_to_seller_button);
        this.n = vkButton3;
        vkButton2.setOnClickListener(new a6u(0, this, sopVar));
        vkButton3.setOnClickListener(new b6u(0, sopVar, this));
        vkButton.setOnClickListener(new c6u(0, sopVar, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    @Override // xsna.vfz
    /* renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h6(p5u p5uVar) {
        boolean z;
        p5u p5uVar2 = p5uVar;
        this.o = p5uVar2;
        int i = p5uVar2.c ? 0 : 8;
        VkButton vkButton = this.m;
        vkButton.setVisibility(i);
        p5u p5uVar3 = this.o;
        if ((p5uVar3 == null ? null : p5uVar3).e != null) {
            vkButton.setVisibility(0);
            p5u p5uVar4 = this.o;
            if (p5uVar4 == null) {
                p5uVar4 = null;
            }
            CallProducerButton callProducerButton = p5uVar4.e;
            vkButton.setText(callProducerButton != null ? callProducerButton.c : null);
            vkButton.setAppearance(VkButton.Appearance.Accent);
        } else {
            if (p5uVar3 == null) {
                p5uVar3 = null;
            }
            if (p5uVar3.d) {
                vkButton.setText(vkButton.getContext().getString(R.string.good_preview_go_to_cart));
                vkButton.setAppearance(VkButton.Appearance.Positive);
            } else {
                vkButton.setText(vkButton.getContext().getString(R.string.market_cart_add));
                vkButton.setAppearance(VkButton.Appearance.Accent);
            }
        }
        p5u p5uVar5 = this.o;
        boolean z2 = (p5uVar5 == null ? null : p5uVar5).c;
        VkButton vkButton2 = this.n;
        if (!z2) {
            if (p5uVar5 == null) {
                p5uVar5 = null;
            }
            if (p5uVar5.e == null) {
                vkButton2.setMode(VkButton.Mode.Primary);
                p5u p5uVar6 = this.o;
                z = (p5uVar6 != null ? p5uVar6 : null).b.a.J;
                VkButton vkButton3 = this.l;
                if (z) {
                    vkButton3.setContentDescription(vkButton3.getContext().getString(R.string.fave_accessibility_add_to_favorite));
                    Integer valueOf = Integer.valueOf(R.drawable.vk_icon_bookmark_add_badge_outline_24);
                    int[] iArr = VkButton.W;
                    vkButton3.a5(true, valueOf);
                    return;
                }
                vkButton3.setContentDescription(vkButton3.getContext().getString(R.string.fave_accessibility_remove_from_favorite));
                Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_bookmark_check_badge_24);
                int[] iArr2 = VkButton.W;
                vkButton3.a5(true, valueOf2);
                return;
            }
        }
        vkButton2.setMode(VkButton.Mode.Secondary);
        p5u p5uVar62 = this.o;
        z = (p5uVar62 != null ? p5uVar62 : null).b.a.J;
        VkButton vkButton32 = this.l;
        if (z) {
        }
    }
}
