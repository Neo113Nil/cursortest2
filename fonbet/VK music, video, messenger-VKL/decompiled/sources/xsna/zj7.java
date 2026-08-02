package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;

/* compiled from: BonusCatalogInactiveRewardsHolder.kt */
/* loaded from: classes5.dex */
public final class zj7 extends qf6 {
    public final View l;

    public zj7(ViewGroup viewGroup, BonusCatalogFragment bonusCatalogFragment) {
        super(viewGroup, R.layout.stickers_bonus_catalog_inactive_rewards_item_ds, 1);
        View findViewById = this.itemView.findViewById(R.id.show);
        this.l = findViewById;
        bwt0.i0(findViewById, new jy(bonusCatalogFragment, 13));
        bwt0.i0(this.itemView, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(bonusCatalogFragment, 8));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final /* bridge */ /* synthetic */ void i6(hfz hfzVar) {
    }
}
