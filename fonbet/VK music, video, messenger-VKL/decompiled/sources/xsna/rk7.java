package xsna;

import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.holders.MusicGridLinkVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.dto.stickers.bonus.StickersBonusReward;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import xsna.nl7;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rk7 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rk7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                tk7 tk7Var = (tk7) this.c;
                StickersBonusReward stickersBonusReward = (StickersBonusReward) this.d;
                qk7 qk7Var = (qk7) this.e;
                BonusCatalogFragment bonusCatalogFragment = tk7Var.l;
                StickersBonusBalance stickersBonusBalance = qk7Var.d;
                bpn0 bpn0Var = bonusCatalogFragment.d0;
                bpn0 bpn0Var2 = bonusCatalogFragment.P;
                int i = stickersBonusReward.g;
                if (!epx.f(bonusCatalogFragment.c0, stickersBonusReward)) {
                    bonusCatalogFragment.c0 = stickersBonusReward;
                    bonusCatalogFragment.a0.J0(stickersBonusReward);
                    ImageList imageList = stickersBonusReward.f;
                    String str = stickersBonusReward.d;
                    String Hb = imageList != null ? imageList.Hb(((VkCell.Left.Main.Size) bpn0Var2.getValue()).k(bonusCatalogFragment.requireContext())) : null;
                    VkCell vkCell = bonusCatalogFragment.Y;
                    if (vkCell != null) {
                        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new nl7.a(Hb, false), (VkCell.Left.Main.Size) bpn0Var2.getValue()), null));
                    }
                    CharSequence m = ((qdz) bpn0Var.getValue()).a().m(str);
                    String k = ((qdz) bpn0Var.getValue()).a().k(str);
                    qk qkVar = k != null ? new qk(2, bonusCatalogFragment, k) : null;
                    VkCell vkCell2 = bonusCatalogFragment.Y;
                    if (vkCell2 != null) {
                        tlo0.h d = oq.d(tlo0.Companion, stickersBonusReward.c);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        VkCell.Middle.e eVar = new VkCell.Middle.e(d, 0, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 54);
                        VkCell.Middle.d dVar = new VkCell.Middle.d(new tlo0.h(m), qkVar, 0, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 52);
                        String str2 = stickersBonusReward.e;
                        if (str2 == null) {
                            str2 = "";
                        }
                        vkCell2.setMiddle(new VkCell.Middle.b(eVar, dVar, new VkCell.Middle.c(new tlo0.h(str2), null, 0, 6), (VkCell.Middle.Size) null, 8));
                    }
                    VkCell vkCell3 = bonusCatalogFragment.Y;
                    if (vkCell3 != null) {
                        AppCompatTextView appCompatTextView = (AppCompatTextView) vkCell3.findViewById(R.id.ds_internal_cell_middle_title);
                        if (appCompatTextView != null) {
                            dhr0 dhr0Var = dhr0.a;
                            dhr0Var.getClass();
                            dhr0.D().getClass();
                            if ((appCompatTextView.getTag(R.id.theme_tag_key) != null ? (SparseIntArray) appCompatTextView.getTag(R.id.theme_tag_key) : null) == null) {
                                dhr0Var.m0(appCompatTextView, R.attr.vk_ui_text_primary);
                            }
                        }
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) vkCell3.findViewById(R.id.ds_internal_cell_middle_subtitle);
                        if (appCompatTextView2 != null) {
                            dhr0 dhr0Var2 = dhr0.a;
                            dhr0Var2.getClass();
                            dhr0.D().getClass();
                            if ((appCompatTextView2.getTag(R.id.theme_tag_key) != null ? (SparseIntArray) appCompatTextView2.getTag(R.id.theme_tag_key) : null) == null) {
                                dhr0Var2.m0(appCompatTextView2, R.attr.vk_ui_text_secondary);
                            }
                        }
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) vkCell3.findViewById(R.id.ds_internal_cell_middle_extra_subtitle);
                        if (appCompatTextView3 != null) {
                            dhr0 dhr0Var3 = dhr0.a;
                            dhr0Var3.getClass();
                            dhr0.D().getClass();
                            if ((appCompatTextView3.getTag(R.id.theme_tag_key) != null ? (SparseIntArray) appCompatTextView3.getTag(R.id.theme_tag_key) : null) == null) {
                                dhr0Var3.m0(appCompatTextView3, R.attr.vk_ui_text_secondary);
                            }
                        }
                    }
                    String string = bonusCatalogFragment.getString(R.string.stickers_bonus_catalog_buy, Integer.valueOf(i));
                    VkButton vkButton = bonusCatalogFragment.U;
                    if (vkButton == null) {
                        vkButton = null;
                    }
                    vkButton.setText(string);
                    if (i > stickersBonusBalance.b) {
                        VkButton vkButton2 = bonusCatalogFragment.U;
                        if (vkButton2 == null) {
                            vkButton2 = null;
                        }
                        vkButton2.setEnabled(false);
                        TextView textView = bonusCatalogFragment.V;
                        if (textView == null) {
                            textView = null;
                        }
                        textView.setText(bonusCatalogFragment.getString(R.string.stickers_bonus_catalog_buy_not_enought));
                    } else {
                        VkButton vkButton3 = bonusCatalogFragment.U;
                        if (vkButton3 == null) {
                            vkButton3 = null;
                        }
                        vkButton3.setEnabled(true);
                        TextView textView2 = bonusCatalogFragment.V;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        String string2 = bonusCatalogFragment.getString(R.string.stickers_bonus_catalog_buy, Integer.valueOf(i));
                        String string3 = bonusCatalogFragment.getString(R.string.stickers_bonus_catalog_buy_offer_1);
                        String string4 = bonusCatalogFragment.getString(R.string.stickers_bonus_catalog_buy_offer_2);
                        boolean z = stickersBonusReward.h;
                        String string5 = z ? bonusCatalogFragment.getString(R.string.stickers_bonus_catalog_buy_offer, string2, string3, string4) : bonusCatalogFragment.getString(R.string.stickers_bonus_catalog_buy_offer_no_terms, string2, string3);
                        SpannableString spannableString = new SpannableString(string5);
                        sa0 sa0Var = new sa0(bonusCatalogFragment, 13);
                        int K = drm0.K(0, 6, string5, string3, false);
                        spannableString.setSpan(new hdz(sa0Var), K, string3.length() + K, 33);
                        if (z) {
                            com.vk.movika.sdk.base.ui.i iVar = new com.vk.movika.sdk.base.ui.i(1, bonusCatalogFragment, stickersBonusReward);
                            int K2 = drm0.K(0, 6, string5, string4, false);
                            spannableString.setSpan(new hdz(iVar), K2, string4.length() + K2, 33);
                        }
                        textView2.setText(spannableString);
                    }
                    BottomSheetBehavior<View> bottomSheetBehavior = bonusCatalogFragment.R;
                    if (bottomSheetBehavior == null) {
                        bottomSheetBehavior = null;
                    }
                    bottomSheetBehavior.X(3);
                    RecyclerPaginatedView recyclerPaginatedView = bonusCatalogFragment.S;
                    (recyclerPaginatedView != null ? recyclerPaginatedView : null).post(new w63(1, bonusCatalogFragment, stickersBonusReward));
                    break;
                } else {
                    bonusCatalogFragment.io();
                    break;
                }
            default:
                UIBlockLink uIBlockLink = (UIBlockLink) this.c;
                MusicGridLinkVh musicGridLinkVh = (MusicGridLinkVh) this.d;
                View view2 = (View) this.e;
                CatalogLink catalogLink = uIBlockLink.y;
                if (catalogLink != null) {
                    b5a b5aVar = musicGridLinkVh.b;
                    Meta meta = catalogLink.g;
                    SearchStatsLoggingInfo searchStatsLoggingInfo = null;
                    b5aVar.a(new cfp0(uIBlockLink, meta != null ? meta.c : null));
                    SearchStatInfoProvider searchStatInfoProvider = musicGridLinkVh.c;
                    if (searchStatInfoProvider != null) {
                        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.LINK;
                        String r = uIBlockLink.r();
                        if (r == null) {
                            r = "";
                        }
                        searchStatsLoggingInfo = searchStatInfoProvider.b(type, r, false);
                    }
                    LaunchContext.a aVar = new LaunchContext.a();
                    aVar.d = uIBlockLink.f;
                    if (searchStatsLoggingInfo != null) {
                        aVar.m = searchStatsLoggingInfo;
                    }
                    maz.c(xwk.d().e(), view2.getContext(), catalogLink.e, aVar.a(), null, null, 24);
                    break;
                }
                break;
        }
    }
}
