package xsna;

import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.vas.design.view.sticker.VkGradientButton;
import com.vkontakte.android.R;

/* compiled from: BonusCatalogJoinHolderDs.kt */
/* loaded from: classes5.dex */
public final class dk7 extends qf6 implements View.OnClickListener {
    public final BonusCatalogFragment l;
    public final TextView m;

    public dk7(ViewGroup viewGroup, BonusCatalogFragment bonusCatalogFragment) {
        super(viewGroup, R.layout.stickers_bonus_catalog_join_item_ds, 1);
        this.l = bonusCatalogFragment;
        this.m = (TextView) this.itemView.findViewById(R.id.status);
        VkGradientButton vkGradientButton = (VkGradientButton) this.itemView.findViewById(R.id.join);
        TextView textView = (TextView) this.itemView.findViewById(R.id.help);
        int[] iArr = zk7.a;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        vkGradientButton.getBackgroundDrawable().setColors(iArr);
        vkGradientButton.getBackgroundDrawable().setOrientation(orientation);
        vkGradientButton.R = -1;
        vkGradientButton.setBackgroundColorful(false);
        vkGradientButton.e5();
        vkGradientButton.setTextTint(R.attr.vk_ui_text_contrast);
        bwt0.h0(this, vkGradientButton);
        String string = this.itemView.getContext().getString(R.string.stickers_bonus_catalog_points_join_help_1);
        String string2 = this.itemView.getContext().getString(R.string.stickers_bonus_catalog_points_join_help, string);
        SpannableString spannableString = new SpannableString(string2);
        int K = drm0.K(0, 6, string2, string, false);
        spannableString.setSpan(new hdz(new e4(this, 6)), K, string.length() + K, 33);
        textView.setText(spannableString);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        int i = ((ek7) hfzVar).c.b;
        TextView textView = this.m;
        if (i == 0) {
            textView.setText(R.string.stickers_bonus_catalog_points_join_status);
        } else {
            textView.setText(enj.f(R.plurals.stickers_bonus_catalog_points_join_status_with_points, i, this.itemView.getContext()));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BonusCatalogFragment bonusCatalogFragment = this.l;
        bonusCatalogFragment.eo().a.getClass();
        bug0.d(rsg0.y0(yfb.x(new tfx("store.enableStickersBonus", new sr(29), new tr(27))), null, null, 3), bonusCatalogFragment.mo2getContext(), null, 6).subscribe(new ia(new ha(bonusCatalogFragment, 8), 8), new zl0(new lt0(11), 6));
    }
}
