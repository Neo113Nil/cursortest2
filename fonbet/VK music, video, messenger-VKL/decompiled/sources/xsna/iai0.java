package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.ecomm.core.models.product.ProductPrice;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.bsd0;
import xsna.wid0;

/* compiled from: SelectableGoodHolder.kt */
/* loaded from: classes18.dex */
public final class iai0 extends vfz<lei0> {
    public final csd0<bsd0> l;
    public final q530 m;
    public final MarketProductTileView n;

    /* JADX WARN: Multi-variable type inference failed */
    public iai0(ViewGroup viewGroup, csd0<? super bsd0> csd0Var, q530 q530Var) {
        super(new MarketProductTileView(viewGroup.getContext(), null));
        this.l = csd0Var;
        this.m = q530Var;
        this.n = (MarketProductTileView) this.itemView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x010c, code lost:
    
        if (r12 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011c, code lost:
    
        if (r12 == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba  */
    @Override // xsna.vfz
    /* renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(lei0 lei0Var) {
        Integer valueOf;
        Integer valueOf2;
        Image image;
        String str;
        boolean z;
        boolean z2;
        int i;
        lei0 lei0Var2 = lei0Var;
        kei0 kei0Var = lei0Var2.b;
        ModerationRestriction a = this.m.a(kei0Var.d);
        boolean z3 = kei0Var.h;
        boolean h = a.h();
        c530 c530Var = kei0Var.d;
        ProductPrice productPrice = kei0Var.c;
        String str2 = kei0Var.b;
        boolean z4 = kei0Var.e;
        boolean z5 = kei0Var.i;
        boolean z6 = c530Var.b;
        h530 h530Var = c530Var.e.c;
        boolean z7 = c530Var.c;
        int i2 = R.drawable.vk_icon_gallery_outline_56;
        if (!z6 && z7) {
            i2 = R.drawable.vk_icon_block_outline_56;
        }
        int i3 = i2;
        MarketProductTileConfig.ProductStatus productStatus = z4 ? MarketProductTileConfig.ProductStatus.Moderation : z7 ? MarketProductTileConfig.ProductStatus.HardBlock : h530Var != null ? MarketProductTileConfig.ProductStatus.SoftBlock : !z5 ? MarketProductTileConfig.ProductStatus.OutOfStock : MarketProductTileConfig.ProductStatus.Normal;
        if (!z6) {
            if (z7) {
                str2 = this.itemView.getContext().getString(R.string.product_tile_unavailable);
            } else if (h) {
                str2 = this.itemView.getContext().getString(R.string.product_tile_specify_age);
            }
        }
        String str3 = str2;
        List<Image> list = kei0Var.g;
        Integer num = null;
        List<Image> list2 = ((!z6 || list == null || list.size() <= 1) && (z7 || list == null || list.size() <= 1)) ? null : list;
        if (z6) {
            if (z4) {
                valueOf = Integer.valueOf(R.attr.vk_ui_accent_gray);
            } else if (z7) {
                valueOf = Integer.valueOf(R.attr.vk_ui_accent_red);
            } else if (h530Var != null) {
                valueOf = Integer.valueOf(R.attr.vk_ui_accent_orange);
            }
            if (z6) {
                if (z4) {
                    valueOf2 = Integer.valueOf(R.drawable.vk_icon_clock_outline_16);
                } else if (z7 || h530Var != null) {
                    valueOf2 = Integer.valueOf(R.drawable.vk_icon_error_circle_outline_16);
                }
                if (valueOf != null && valueOf2 != null) {
                    krv0.f(valueOf2.intValue(), valueOf.intValue(), this.itemView.getContext());
                }
                Context context = this.itemView.getContext();
                Integer valueOf3 = Integer.valueOf(R.string.product_tile_status_badge_not_in_stock);
                if (!z6) {
                    if (!z7) {
                        if (h) {
                            valueOf3 = Integer.valueOf(R.string.product_tile_status_badge_for_adults);
                        }
                    }
                    valueOf3 = null;
                } else if (z4) {
                    valueOf3 = Integer.valueOf(R.string.product_tile_status_badge_moderation);
                } else if (z7) {
                    valueOf3 = Integer.valueOf(R.string.product_tile_status_badge_blocked);
                } else {
                    if (!h) {
                    }
                    valueOf3 = null;
                }
                String string = valueOf3 != null ? context.getString(valueOf3.intValue()) : null;
                image = kei0Var.f;
                if (!z6 && z7) {
                    str = str3;
                    image = null;
                } else {
                    str = str3;
                }
                String str4 = string;
                MarketProductTileConfig.d dVar = new MarketProductTileConfig.d(image, str, Integer.valueOf(i3), !z5, h, true);
                boolean z8 = str4 == null;
                Integer valueOf4 = Integer.valueOf(i3);
                if (z6 || z7 || h || z5) {
                    z = h;
                    z2 = false;
                } else {
                    z = h;
                    z2 = true;
                }
                List<Image> list3 = list2;
                boolean z9 = !(list3 != null || list3.isEmpty());
                String str5 = str;
                MarketProductTileConfig.g gVar = new MarketProductTileConfig.g(list2, z8, str5, valueOf4, z2, z, z9);
                boolean z10 = z;
                MarketProductTileConfig.k kVar = new MarketProductTileConfig.k(str4, str4 != null);
                ListBuilder e = e43.e();
                i = productPrice.c;
                if (i != 0) {
                    e.add(new wid0.a(new wid0.a.InterfaceC3933a.b(i)));
                }
                ListBuilder g = e.g();
                MarketProductTileConfig.h hVar = new MarketProductTileConfig.h(productPrice.b, productPrice.d, productPrice.e, productStatus, c530Var.b, 64);
                MarketProductTileConfig.e eVar = new MarketProductTileConfig.e(str5, z6, productStatus, 16);
                MarketProductTileConfig.b bVar = new MarketProductTileConfig.b(z3, !z10);
                VkButton.Mode mode = VkButton.Mode.Primary;
                VkButton.Appearance appearance = VkButton.Appearance.Accent;
                String string2 = b6().getString(R.string.product_buy);
                if (kei0Var.j != null && (!drm0.N(r4))) {
                    num = Integer.valueOf(R.drawable.vk_icon_link_outline_16);
                }
                this.n.P4(new MarketProductTileConfig(dVar, gVar, hVar, eVar, (MarketProductTileConfig.f) null, bVar, (MarketProductTileConfig.c) null, (MarketProductTileConfig.j) null, kVar, g, new MarketProductTileConfig.a(mode, appearance, string2, num, true, null, 32), new com.vk.catalog2.common.ui.holders.b(23, this, lei0Var2), new com.vk.voip.a(25, this, lei0Var2), new wx0(20, this, lei0Var2), 33232));
                this.l.a(new bsd0.a(kei0Var.a));
            }
            valueOf2 = null;
            if (valueOf != null) {
                krv0.f(valueOf2.intValue(), valueOf.intValue(), this.itemView.getContext());
            }
            Context context2 = this.itemView.getContext();
            Integer valueOf32 = Integer.valueOf(R.string.product_tile_status_badge_not_in_stock);
            if (!z6) {
            }
            if (valueOf32 != null) {
            }
            image = kei0Var.f;
            if (z6) {
                str = str3;
                image = null;
                String str42 = string;
                MarketProductTileConfig.d dVar2 = new MarketProductTileConfig.d(image, str, Integer.valueOf(i3), !z5, h, true);
                if (str42 == null) {
                }
                Integer valueOf42 = Integer.valueOf(i3);
                if (z6) {
                    z = h;
                    z2 = true;
                    List<Image> list32 = list2;
                    boolean z92 = !(list32 != null || list32.isEmpty());
                    String str52 = str;
                    MarketProductTileConfig.g gVar2 = new MarketProductTileConfig.g(list2, z8, str52, valueOf42, z2, z, z92);
                    boolean z102 = z;
                    MarketProductTileConfig.k kVar2 = new MarketProductTileConfig.k(str42, str42 != null);
                    ListBuilder e2 = e43.e();
                    i = productPrice.c;
                    if (i != 0) {
                    }
                    ListBuilder g2 = e2.g();
                    MarketProductTileConfig.h hVar2 = new MarketProductTileConfig.h(productPrice.b, productPrice.d, productPrice.e, productStatus, c530Var.b, 64);
                    MarketProductTileConfig.e eVar2 = new MarketProductTileConfig.e(str52, z6, productStatus, 16);
                    MarketProductTileConfig.b bVar2 = new MarketProductTileConfig.b(z3, !z102);
                    VkButton.Mode mode2 = VkButton.Mode.Primary;
                    VkButton.Appearance appearance2 = VkButton.Appearance.Accent;
                    String string22 = b6().getString(R.string.product_buy);
                    if (kei0Var.j != null) {
                        num = Integer.valueOf(R.drawable.vk_icon_link_outline_16);
                    }
                    this.n.P4(new MarketProductTileConfig(dVar2, gVar2, hVar2, eVar2, (MarketProductTileConfig.f) null, bVar2, (MarketProductTileConfig.c) null, (MarketProductTileConfig.j) null, kVar2, g2, new MarketProductTileConfig.a(mode2, appearance2, string22, num, true, null, 32), new com.vk.catalog2.common.ui.holders.b(23, this, lei0Var2), new com.vk.voip.a(25, this, lei0Var2), new wx0(20, this, lei0Var2), 33232));
                    this.l.a(new bsd0.a(kei0Var.a));
                }
                z = h;
                z2 = false;
                List<Image> list322 = list2;
                boolean z922 = !(list322 != null || list322.isEmpty());
                String str522 = str;
                MarketProductTileConfig.g gVar22 = new MarketProductTileConfig.g(list2, z8, str522, valueOf42, z2, z, z922);
                boolean z1022 = z;
                MarketProductTileConfig.k kVar22 = new MarketProductTileConfig.k(str42, str42 != null);
                ListBuilder e22 = e43.e();
                i = productPrice.c;
                if (i != 0) {
                }
                ListBuilder g22 = e22.g();
                MarketProductTileConfig.h hVar22 = new MarketProductTileConfig.h(productPrice.b, productPrice.d, productPrice.e, productStatus, c530Var.b, 64);
                MarketProductTileConfig.e eVar22 = new MarketProductTileConfig.e(str522, z6, productStatus, 16);
                MarketProductTileConfig.b bVar22 = new MarketProductTileConfig.b(z3, !z1022);
                VkButton.Mode mode22 = VkButton.Mode.Primary;
                VkButton.Appearance appearance22 = VkButton.Appearance.Accent;
                String string222 = b6().getString(R.string.product_buy);
                if (kei0Var.j != null) {
                }
                this.n.P4(new MarketProductTileConfig(dVar2, gVar22, hVar22, eVar22, (MarketProductTileConfig.f) null, bVar22, (MarketProductTileConfig.c) null, (MarketProductTileConfig.j) null, kVar22, g22, new MarketProductTileConfig.a(mode22, appearance22, string222, num, true, null, 32), new com.vk.catalog2.common.ui.holders.b(23, this, lei0Var2), new com.vk.voip.a(25, this, lei0Var2), new wx0(20, this, lei0Var2), 33232));
                this.l.a(new bsd0.a(kei0Var.a));
            }
            str = str3;
            String str422 = string;
            MarketProductTileConfig.d dVar22 = new MarketProductTileConfig.d(image, str, Integer.valueOf(i3), !z5, h, true);
            if (str422 == null) {
            }
            Integer valueOf422 = Integer.valueOf(i3);
            if (z6) {
            }
            z = h;
            z2 = false;
            List<Image> list3222 = list2;
            boolean z9222 = !(list3222 != null || list3222.isEmpty());
            String str5222 = str;
            MarketProductTileConfig.g gVar222 = new MarketProductTileConfig.g(list2, z8, str5222, valueOf422, z2, z, z9222);
            boolean z10222 = z;
            MarketProductTileConfig.k kVar222 = new MarketProductTileConfig.k(str422, str422 != null);
            ListBuilder e222 = e43.e();
            i = productPrice.c;
            if (i != 0) {
            }
            ListBuilder g222 = e222.g();
            MarketProductTileConfig.h hVar222 = new MarketProductTileConfig.h(productPrice.b, productPrice.d, productPrice.e, productStatus, c530Var.b, 64);
            MarketProductTileConfig.e eVar222 = new MarketProductTileConfig.e(str5222, z6, productStatus, 16);
            MarketProductTileConfig.b bVar222 = new MarketProductTileConfig.b(z3, !z10222);
            VkButton.Mode mode222 = VkButton.Mode.Primary;
            VkButton.Appearance appearance222 = VkButton.Appearance.Accent;
            String string2222 = b6().getString(R.string.product_buy);
            if (kei0Var.j != null) {
            }
            this.n.P4(new MarketProductTileConfig(dVar22, gVar222, hVar222, eVar222, (MarketProductTileConfig.f) null, bVar222, (MarketProductTileConfig.c) null, (MarketProductTileConfig.j) null, kVar222, g222, new MarketProductTileConfig.a(mode222, appearance222, string2222, num, true, null, 32), new com.vk.catalog2.common.ui.holders.b(23, this, lei0Var2), new com.vk.voip.a(25, this, lei0Var2), new wx0(20, this, lei0Var2), 33232));
            this.l.a(new bsd0.a(kei0Var.a));
        }
        valueOf = null;
        if (z6) {
        }
        valueOf2 = null;
        if (valueOf != null) {
        }
        Context context22 = this.itemView.getContext();
        Integer valueOf322 = Integer.valueOf(R.string.product_tile_status_badge_not_in_stock);
        if (!z6) {
        }
        if (valueOf322 != null) {
        }
        image = kei0Var.f;
        if (z6) {
        }
        str = str3;
        String str4222 = string;
        MarketProductTileConfig.d dVar222 = new MarketProductTileConfig.d(image, str, Integer.valueOf(i3), !z5, h, true);
        if (str4222 == null) {
        }
        Integer valueOf4222 = Integer.valueOf(i3);
        if (z6) {
        }
        z = h;
        z2 = false;
        List<Image> list32222 = list2;
        boolean z92222 = !(list32222 != null || list32222.isEmpty());
        String str52222 = str;
        MarketProductTileConfig.g gVar2222 = new MarketProductTileConfig.g(list2, z8, str52222, valueOf4222, z2, z, z92222);
        boolean z102222 = z;
        MarketProductTileConfig.k kVar2222 = new MarketProductTileConfig.k(str4222, str4222 != null);
        ListBuilder e2222 = e43.e();
        i = productPrice.c;
        if (i != 0) {
        }
        ListBuilder g2222 = e2222.g();
        MarketProductTileConfig.h hVar2222 = new MarketProductTileConfig.h(productPrice.b, productPrice.d, productPrice.e, productStatus, c530Var.b, 64);
        MarketProductTileConfig.e eVar2222 = new MarketProductTileConfig.e(str52222, z6, productStatus, 16);
        MarketProductTileConfig.b bVar2222 = new MarketProductTileConfig.b(z3, !z102222);
        VkButton.Mode mode2222 = VkButton.Mode.Primary;
        VkButton.Appearance appearance2222 = VkButton.Appearance.Accent;
        String string22222 = b6().getString(R.string.product_buy);
        if (kei0Var.j != null) {
        }
        this.n.P4(new MarketProductTileConfig(dVar222, gVar2222, hVar2222, eVar2222, (MarketProductTileConfig.f) null, bVar2222, (MarketProductTileConfig.c) null, (MarketProductTileConfig.j) null, kVar2222, g2222, new MarketProductTileConfig.a(mode2222, appearance2222, string22222, num, true, null, 32), new com.vk.catalog2.common.ui.holders.b(23, this, lei0Var2), new com.vk.voip.a(25, this, lei0Var2), new wx0(20, this, lei0Var2), 33232));
        this.l.a(new bsd0.a(kei0Var.a));
    }
}
