package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.ecomm.clipproductattaches.models.GoodBadge;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.wid0;

/* compiled from: ProductAttachesTileViewBinder.kt */
/* loaded from: classes18.dex */
public final class tid0 implements uid0 {
    public final Context a;
    public final ah5 b;
    public Integer d;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new hp30(this, 15));
    public final LinkedHashSet e = new LinkedHashSet();

    public tid0(Context context, ah5 ah5Var) {
        this.a = context;
        this.b = ah5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e6  */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
    @Override // xsna.uid0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(List list, tmc tmcVar, izs izsVar, nk0 nk0Var) {
        int i;
        boolean z;
        boolean z2;
        String str;
        EmptyList emptyList;
        ?? r0;
        Float f;
        int i2;
        String str2;
        wid0 aVar;
        ely elyVar;
        int i3 = tmcVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof c5u) {
                arrayList.add(obj);
            }
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            c5u c5uVar = (c5u) next;
            w530 w530Var = (w530) this.b.b;
            c530 c530Var = c5uVar.h;
            c530 c530Var2 = c5uVar.h;
            boolean z3 = c5uVar.l;
            boolean h = w530Var.a(c530Var).h();
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_text_contrast);
            j5u j5uVar = c5uVar.n;
            p7u p7uVar = c5uVar.m;
            Image image = c5uVar.g;
            boolean z4 = c530Var2.b;
            boolean z5 = c530Var2.c;
            if (!z4 && z5) {
                image = null;
            }
            int i4 = R.drawable.vk_icon_gallery_outline_56;
            if (!z4 && z5) {
                i4 = R.drawable.vk_icon_do_not_disturb_outline_56;
            }
            MarketProductTileConfig.ProductStatus productStatus = c5uVar.k ? MarketProductTileConfig.ProductStatus.Moderation : z5 ? MarketProductTileConfig.ProductStatus.HardBlock : !z3 ? MarketProductTileConfig.ProductStatus.OutOfStock : MarketProductTileConfig.ProductStatus.Normal;
            String str3 = c5uVar.c;
            Iterator it2 = it;
            Context context = this.a;
            if (!z4) {
                if (z5) {
                    str3 = context.getString(R.string.product_tile_unavailable);
                } else if (h) {
                    str3 = context.getString(R.string.product_tile_specify_age);
                }
            }
            String str4 = str3;
            List<GoodBadge> list2 = c5uVar.o;
            if (list2 != null) {
                ?? arrayList2 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    Iterator it4 = it3;
                    GoodBadge goodBadge = (GoodBadge) it3.next();
                    boolean z6 = z3;
                    GoodBadge.BadgeType badgeType = goodBadge.a;
                    int i5 = badgeType == null ? -1 : lid0.$EnumSwitchMapping$0[badgeType.ordinal()];
                    Image image2 = image;
                    if (i5 == 1) {
                        i2 = i3;
                        str2 = str4;
                        aVar = new wid0.a(new wid0.a.InterfaceC3933a.C3934a(goodBadge.b));
                    } else if (i5 == 2) {
                        i2 = i3;
                        str2 = str4;
                        aVar = new wid0.c(null);
                    } else if (i5 != 3) {
                        i2 = i3;
                        str2 = str4;
                        aVar = null;
                    } else {
                        dly dlyVar = goodBadge.c;
                        if (dlyVar != null) {
                            str2 = str4;
                            i2 = i3;
                            elyVar = new ely(dlyVar.a, dlyVar.b, dlyVar.c, dlyVar.d);
                        } else {
                            i2 = i3;
                            str2 = str4;
                            elyVar = null;
                        }
                        aVar = new wid0.d(elyVar);
                    }
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                    z3 = z6;
                    it3 = it4;
                    image = image2;
                    str4 = str2;
                    i3 = i2;
                }
                z2 = z3;
                str = null;
                emptyList = arrayList2;
            } else {
                z2 = z3;
                str = null;
                emptyList = null;
            }
            int i6 = i3;
            Image image3 = image;
            String str5 = str4;
            EmptyList emptyList2 = emptyList;
            if (emptyList == null) {
                emptyList2 = EmptyList.b;
            }
            EmptyList emptyList3 = emptyList2;
            boolean z7 = c530Var2.b;
            boolean z8 = c530Var2.c;
            if (!z7) {
                if (!z8) {
                    if (h) {
                        r0 = Integer.valueOf(R.string.product_tile_status_badge_for_adults);
                    } else if (!z2) {
                        r0 = Integer.valueOf(R.string.product_tile_status_badge_not_in_stock);
                    }
                }
                r0 = str;
            } else if (z8) {
                r0 = Integer.valueOf(R.string.product_tile_status_badge_blocked);
            } else {
                if (!h && !z2) {
                    r0 = Integer.valueOf(R.string.product_tile_status_badge_inactive);
                }
                r0 = str;
            }
            String string = r0 != 0 ? context.getString(r0.intValue()) : str;
            String string2 = c5uVar.f ? context.getString(R.string.product_clip_attach_action_service) : context.getString(R.string.product_clip_attach_action);
            boolean z9 = ((p7uVar == null || (f = p7uVar.a) == null) ? 0.0f : f.floatValue()) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            boolean z10 = ((j5uVar != null ? j5uVar.b : str) == null || z9) ? false : true;
            MarketProductTileConfig.d dVar = new MarketProductTileConfig.d(image3, str5, Integer.valueOf(i4), !z2, h, true);
            MarketProductTileConfig.k kVar = new MarketProductTileConfig.k(string, string != null);
            d5u d5uVar = c5uVar.d;
            linkedHashMap.put(new MarketProductTileConfig(dVar, (MarketProductTileConfig.g) null, new MarketProductTileConfig.h(d5uVar.a, d5uVar.b, d5uVar.c, productStatus, c530Var2.b, true, new i9r(valueOf, Integer.valueOf(R.attr.vk_ui_text_secondary))), new MarketProductTileConfig.e(str5, c530Var2.b, productStatus, true, new iq6(valueOf)), new MarketProductTileConfig.f(j5uVar != null ? j5uVar.b : null, j5uVar != null ? j5uVar.c : false, z10, new v7x(valueOf, 3)), new MarketProductTileConfig.b(c5uVar.j, true), new MarketProductTileConfig.c(false, false), new MarketProductTileConfig.j(p7uVar != null ? p7uVar.a : null, p7uVar != null ? p7uVar.b : null, z9, new aek(valueOf, Integer.valueOf(R.attr.vk_ui_icon_contrast), valueOf)), kVar, emptyList3, new MarketProductTileConfig.a(null, VkButton.Appearance.Overlay, string2, null, true, null, 41), (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 61698), next);
            it = it2;
            i3 = i6;
        }
        int i7 = i3;
        List O0 = j5g.O0(linkedHashMap.keySet());
        CommonMarketStat$TypeRefSource a = kid0.a(tmcVar.c);
        Integer num = this.d;
        if (num == null) {
            i = i7;
        } else {
            i = i7;
            if (num.intValue() == i) {
                z = false;
                ?? r02 = this.c;
                ((bbd) r02.getValue()).setShouldScroll(z);
                if (z) {
                    bbd bbdVar = (bbd) r02.getValue();
                    int i8 = 0;
                    while (true) {
                        if (!(i8 < bbdVar.getChildCount())) {
                            break;
                        }
                        int i9 = i8 + 1;
                        View childAt = bbdVar.getChildAt(i8);
                        if (childAt == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        ((bbd) r02.getValue()).removeView(childAt);
                        i8 = i9;
                    }
                }
                this.d = Integer.valueOf(i);
                ((bbd) r02.getValue()).a(O0, new w35(O0, linkedHashMap, this, a, tmcVar, 3), new sid0(linkedHashMap, izsVar, this, tmcVar, a), new u9(26, linkedHashMap, nk0Var));
            }
        }
        z = true;
        ?? r022 = this.c;
        ((bbd) r022.getValue()).setShouldScroll(z);
        if (z) {
        }
        this.d = Integer.valueOf(i);
        ((bbd) r022.getValue()).a(O0, new w35(O0, linkedHashMap, this, a, tmcVar, 3), new sid0(linkedHashMap, izsVar, this, tmcVar, a), new u9(26, linkedHashMap, nk0Var));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uid0
    public final View b() {
        return (bbd) this.c.getValue();
    }
}
