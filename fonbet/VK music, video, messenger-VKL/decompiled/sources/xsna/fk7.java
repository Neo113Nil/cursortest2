package xsna;

import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;

/* compiled from: BonusCatalogLeaveHolder.kt */
/* loaded from: classes5.dex */
public final class fk7 extends qf6 {
    public final BonusCatalogFragment l;
    public final TextView m;

    public fk7(ViewGroup viewGroup, BonusCatalogFragment bonusCatalogFragment) {
        super(viewGroup, R.layout.stickers_bonus_catalog_leave_item_ds, 1);
        this.l = bonusCatalogFragment;
        this.m = (TextView) this.itemView.findViewById(R.id.description);
        bwt0.i0(this.itemView, new com.vk.im.ui.fragments.b(this, 10));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        String string = this.itemView.getContext().getString(R.string.stickers_bonus_catalog_leave_1);
        String string2 = this.itemView.getContext().getString(R.string.stickers_bonus_catalog_leave, string);
        SpannableString spannableString = new SpannableString(string2);
        int K = drm0.K(0, 6, string2, string, false);
        spannableString.setSpan(new hdz(new gy0(this, 10)), K, string.length() + K, 33);
        this.m.setText(spannableString);
    }
}
