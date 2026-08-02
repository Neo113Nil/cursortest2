package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.bonus.StickersBonusReward;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: BonusCatalogShopItemHolderDs.kt */
/* loaded from: classes5.dex */
public final class tk7 extends qf6 {
    public static final bpn0 n = new bpn0(new fn4(2));
    public final BonusCatalogFragment l;
    public final VkTile m;

    /* compiled from: BonusCatalogShopItemHolderDs.kt */
    public static final class a implements VkTile.g {
        public final VKImageView a;
        public final FrameLayout b;

        /* compiled from: BonusCatalogShopItemHolderDs.kt */
        /* renamed from: xsna.tk7$a$a, reason: collision with other inner class name */
        public static final class C3751a implements VkTile.h {
            public final String a;
            public final boolean b;

            public C3751a(String str, boolean z) {
                this.a = str;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3751a)) {
                    return false;
                }
                C3751a c3751a = (C3751a) obj;
                return epx.f(this.a, c3751a.a) && this.b == c3751a.b;
            }

            public final int hashCode() {
                String str = this.a;
                return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("BonusShopItemContentParams(imageUrl=");
                sb.append(this.a);
                sb.append(", isSelected=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        public a(Context context) {
            bpn0 bpn0Var = new bpn0(new sk7(context, 0));
            bpn0 bpn0Var2 = new bpn0(new uv0(4));
            bpn0 bpn0Var3 = new bpn0(new vv0(4));
            FrameLayout frameLayout = new FrameLayout(context);
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            vKImageView.setId(View.generateViewId());
            vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            bwt0.d(vKImageView, ((Number) bpn0Var3.getValue()).floatValue(), (r4 & 2) != 0, (r4 & 4) != 0);
            vKImageView.y0(((Number) bpn0Var2.getValue()).floatValue(), ((Number) bpn0Var.getValue()).intValue());
            this.a = vKImageView;
            int b = cn70.b(4);
            frameLayout.setPadding(b, b, b, b);
            frameLayout.addView(vKImageView, -1, -1);
            this.b = frameLayout;
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
            if (hVar instanceof C3751a) {
                C3751a c3751a = (C3751a) hVar;
                this.a.o0(c3751a.a, null);
                boolean z = c3751a.b;
                FrameLayout frameLayout = this.b;
                if (z) {
                    frameLayout.setBackgroundResource(R.drawable.shape_bonus_catalog_item_selection);
                } else {
                    frameLayout.setBackground(null);
                }
                androidx.constraintlayout.widget.b a = pq.a(constraintLayout);
                a.p(frameLayout.getId(), -1);
                a.n(frameLayout.getId(), 0);
                a.C(frameLayout.getId(), "1:1");
                a.b(constraintLayout);
            }
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final View getView() {
            return this.b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tk7(ViewGroup viewGroup, BonusCatalogFragment bonusCatalogFragment) {
        super(r0);
        Context context = viewGroup.getContext();
        VkTile vkTile = new VkTile(context, null, 6);
        vkTile.setId(R.id.shop_item_container);
        vkTile.setTextAlignment(VkTile.TextAlignment.Center);
        vkTile.setDecorator((uk7) n.getValue());
        vkTile.setVisualContentController(new a(context));
        vkTile.setLayoutParams(new ViewGroup.LayoutParams(cn70.b(112), -2));
        this.l = bonusCatalogFragment;
        this.m = (VkTile) this.itemView;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        qk7 qk7Var = (qk7) hfzVar;
        boolean z = qk7Var.e;
        StickersBonusReward stickersBonusReward = qk7Var.c;
        ImageList imageList = stickersBonusReward.f;
        a.C3751a c3751a = new a.C3751a(imageList != null ? imageList.Hb(cn70.b(112)) : null, qk7Var.f);
        VkTile vkTile = this.m;
        vkTile.setVisualContentParams(c3751a);
        vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, stickersBonusReward.c), Integer.MAX_VALUE, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
        String valueOf = String.valueOf(stickersBonusReward.g);
        SpannableString spannableString = new SpannableString(valueOf);
        spannableString.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_accent, this.itemView.getContext())), 0, valueOf.length(), 33);
        vkTile.setSubtitle(new VkTile.d(new tlo0.h(spannableString), Integer.MAX_VALUE, null, null, new gko(R.drawable.vk_icon_sticker_energy_product_12), new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), 12));
        this.itemView.setAlpha(z ? 1.0f : 0.4f);
        this.itemView.setEnabled(z);
        this.itemView.setOnClickListener(new rk7(this, stickersBonusReward, qk7Var, 0));
    }
}
