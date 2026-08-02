package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.Badge;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.utils.StickerPackButtonUtils;
import com.vk.vas.design.view.VKStickerPackView;
import com.vk.vas.design.view.VkDiscountTextView;
import com.vkontakte.android.R;
import java.util.Collection;
import xsna.p5l0;

/* compiled from: RecommendedPackBigHolder.kt */
/* loaded from: classes6.dex */
public final class ndf0 extends vfz<odf0> {
    public final f9l0 l;
    public final VKStickerPackView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final VkDiscountTextView q;
    public final VkImageSimple r;
    public final VkText s;
    public final VKImageView t;
    public final View u;

    public ndf0(ViewGroup viewGroup, f9l0 f9l0Var) {
        super(R.layout.sticker_details_recommendation_vertical_pack_item, viewGroup);
        this.l = f9l0Var;
        this.m = (VKStickerPackView) this.itemView.findViewById(R.id.pack_image);
        this.n = (TextView) this.itemView.findViewById(R.id.pack_title);
        this.o = (TextView) this.itemView.findViewById(R.id.pack_subtitle);
        this.p = (TextView) this.itemView.findViewById(R.id.badge);
        this.q = (VkDiscountTextView) this.itemView.findViewById(R.id.pack_buy);
        this.r = (VkImageSimple) this.itemView.findViewById(R.id.pack_gift);
        this.s = (VkText) this.itemView.findViewById(R.id.discount_note);
        this.t = (VKImageView) this.itemView.findViewById(R.id.context_user_avatar);
        this.u = this.itemView.findViewById(R.id.context_user_check);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(odf0 odf0Var) {
        odf0 odf0Var2 = odf0Var;
        final StickerStockItem stickerStockItem = odf0Var2.b;
        final ContextUser contextUser = odf0Var2.c;
        final GiftData giftData = odf0Var2.d;
        final String str = odf0Var2.e;
        dgr0.a(this.m, stickerStockItem);
        this.n.setText(stickerStockItem.d);
        this.o.setText(stickerStockItem.e);
        Badge badge = stickerStockItem.E;
        TextView textView = this.p;
        if (badge != null) {
            textView.setVisibility(0);
            textView.setText(badge.getText());
            Context context = textView.getContext();
            textView.setBackgroundTintList(p5l0.a.$EnumSwitchMapping$0[badge.zb().ordinal()] == 1 ? e3m.c(R.attr.vk_ui_background_accent, context) : e3m.c(R.attr.vk_ui_accent_red, context));
        } else {
            f4m.j(textView);
        }
        Context context2 = this.itemView.getContext();
        VkText vkText = this.s;
        VkDiscountTextView vkDiscountTextView = this.q;
        StickerPackButtonUtils.c(context2, stickerStockItem, vkDiscountTextView, vkText);
        final boolean b = StickerPackButtonUtils.b(stickerStockItem);
        boolean z = (!stickerStockItem.i || stickerStockItem.m || b) ? false : true;
        VkImageSimple vkImageSimple = this.r;
        bwt0.p0(vkImageSimple, z);
        Collection<UserId> collection = giftData.b;
        boolean z2 = collection != null && collection.size() == 1;
        View view = this.u;
        VKImageView vKImageView = this.t;
        if (contextUser != null && z && z2 && contextUser.zb(stickerStockItem)) {
            vKImageView.load(contextUser.d);
            vKImageView.setVisibility(0);
            view.setVisibility(0);
        } else {
            f4m.j(vKImageView);
            f4m.j(view);
        }
        bwt0.i0(this.itemView, new izs() { // from class: xsna.ldf0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ndf0 ndf0Var = ndf0.this;
                ndf0Var.l.f(ndf0Var.itemView.getContext(), stickerStockItem, str, giftData, contextUser, null);
                return s3q0.a;
            }
        });
        bwt0.i0(vkDiscountTextView, new izs() { // from class: xsna.mdf0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                boolean z3 = b;
                ndf0 ndf0Var = this;
                StickerStockItem stickerStockItem2 = stickerStockItem;
                String str2 = str;
                if (z3) {
                    ndf0Var.l.f(ndf0Var.itemView.getContext(), stickerStockItem2, str2, giftData, contextUser, null);
                } else if (stickerStockItem2.i) {
                    ndf0Var.l.c(ndf0Var.itemView.getContext(), stickerStockItem2, str2);
                } else {
                    o5l0.a(ndf0Var.itemView.getContext(), stickerStockItem2);
                }
                return s3q0.a;
            }
        });
        bwt0.i0(vkImageSimple, new rqb(this, stickerStockItem, str, giftData, 1));
    }
}
