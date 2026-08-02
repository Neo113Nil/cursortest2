package xsna;

import android.content.Context;
import com.vk.dto.common.DeliveryInfo;
import com.vk.dto.common.Good;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Price;
import com.vk.dto.market.CharacteristicsItem;
import com.vk.dto.market.MarketBanner;
import com.vk.dto.market.Variant;
import com.vk.dto.market.VariantGroup;
import com.vk.dto.market.VariantGroupType;
import com.vk.dto.market.order.CancellationInfo;
import com.vk.dto.profile.Address;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelSubtype;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelType;
import com.vk.ecomm.market.good.ui.c;
import com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import xsna.a5u;
import xsna.h4u;
import xsna.kjf0;

/* compiled from: UiMainBlockBuilder.kt */
/* loaded from: classes18.dex */
public final class izp0 extends d76 {
    public static final HashSet<ProductLabelSubtype> e = izi0.d(ProductLabelSubtype.FOMO_VIEWS, ProductLabelSubtype.FOMO_PURCHASES, ProductLabelSubtype.FOMO_POPULAR, ProductLabelSubtype.FOMO_FRIENDS_VIEWS, ProductLabelSubtype.FOMO_BOOKMARKS, ProductLabelSubtype.FOMO_FRIENDS_PURCHASES);
    public static final HashSet<ProductLabelSubtype> f = izi0.d(ProductLabelSubtype.FOMO_POPULAR_SELLER, ProductLabelSubtype.FOMO_GOOD_SELLER);
    public final sld0 c;
    public final bpn0 d;

    /* compiled from: UiMainBlockBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VariantGroupType.values().length];
            try {
                iArr[VariantGroupType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VariantGroupType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VariantGroupType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public izp0(vyp0 vyp0Var, sld0 sld0Var) {
        super(vyp0Var);
        this.c = sld0Var;
        this.d = new bpn0(new e3c0(9));
    }

    @Override // xsna.d76
    public final void b(ezp0 ezp0Var) {
        LinkedHashMap linkedHashMap;
        int intValue;
        gzs<s3q0> gzsVar;
        Price price;
        int i;
        cxo cxoVar = ezp0Var.a;
        a5u.a aVar = ezp0Var.c;
        boolean z = aVar.e;
        Context context = aVar.f;
        duk dukVar = ezp0Var.b;
        k5u k5uVar = dukVar.b;
        Good good = dukVar.a;
        if (!dukVar.e.isEmpty() || !dukVar.d.isEmpty()) {
            a(kjf0.a.a(0, null));
        }
        LinkedHashMap<String, lpd0> linkedHashMap2 = k5uVar.u;
        if (linkedHashMap2 != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, lpd0> entry : linkedHashMap2.entrySet()) {
                if (entry.getValue().a != ProductLabelType.OZON || (entry.getValue().b != ProductLabelSubtype.PAYMENT && entry.getValue().b != ProductLabelSubtype.DELIVERY)) {
                    if (!e.contains(entry.getValue().b) && entry.getValue().b != ProductLabelSubtype.OZON_ONBOARDING) {
                        if (f.contains(entry.getValue().b)) {
                        }
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            linkedHashMap.isEmpty();
        }
        int i2 = 1;
        a(kjf0.a.a(1, null));
        MarketRejectInfo marketRejectInfo = good.e0;
        if (marketRejectInfo != null && marketRejectInfo.b.length() > 0 && marketRejectInfo.c.length() > 0) {
            a(kjf0.a.a(21, good.e0));
        }
        List<Address> list = good.X;
        if (list != null && !list.isEmpty()) {
            a(kjf0.a.a(17, good));
        }
        MarketBanner marketBanner = good.N;
        if (marketBanner != null) {
            a(kjf0.a.a(14, new mjd0(marketBanner.b, marketBanner.c, marketBanner.d)));
        }
        ArrayList arrayList = new ArrayList();
        for (VariantGroup variantGroup : good.z) {
            String str = variantGroup.b;
            List<Variant> list2 = variantGroup.c;
            VariantGroupType variantGroupType = variantGroup.d;
            ArrayList arrayList2 = new ArrayList();
            Object obj = null;
            for (Variant variant : list2) {
                int i3 = i2;
                boolean z2 = z;
                krd0 krd0Var = new krd0(variant.b, variant.d, variant.c, variant.g, variant.h, !variant.e);
                arrayList2.add(krd0Var);
                if (variant.f && obj == null) {
                    obj = krd0Var;
                }
                i2 = i3;
                z = z2;
            }
            boolean z3 = z;
            int i4 = i2;
            if (!arrayList2.isEmpty()) {
                if (obj == null) {
                    obj = arrayList2.get(0);
                }
                int i5 = a.$EnumSwitchMapping$0[variantGroupType.ordinal()];
                ProductPropertyType productPropertyType = i5 != i4 ? i5 != 2 ? i5 != 3 ? ProductPropertyType.TYPE_TEXT : ProductPropertyType.TYPE_IMAGE : ProductPropertyType.TYPE_COLOR : ProductPropertyType.TYPE_TEXT;
                krd0 krd0Var2 = (krd0) obj;
                if (krd0Var2 != null) {
                    arrayList.add(new ird0(str, productPropertyType, arrayList2, krd0Var2));
                }
            }
            z = z3;
            i2 = 1;
        }
        boolean z4 = z;
        bpn0 bpn0Var = this.d;
        if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ird0 ird0Var = (ird0) it.next();
                ArrayList arrayList3 = ird0Var.c;
                if (!arrayList3.isEmpty()) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        if (((krd0) it2.next()).e == null) {
                            i = 10;
                            break;
                        }
                    }
                }
                i = 35;
                a(kjf0.a.a(i, ird0Var));
            }
        } else {
            int i6 = z4 ? 11 : 7;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ird0 ird0Var2 = (ird0) it3.next();
                a(kjf0.a.a((ird0Var2.b != ProductPropertyType.TYPE_COLOR || ird0Var2.c.size() > i6) ? ird0Var2.b == ProductPropertyType.TYPE_IMAGE ? 12 : 10 : 11, ird0Var2));
            }
        }
        OwnerResponseTime ownerResponseTime = k5uVar.t;
        cxoVar.W = ownerResponseTime;
        com.vk.ecomm.market.good.ui.c a2 = c.a.a(context, new com.vk.ecomm.market.good.ui.b(dukVar.a, cxoVar.v, cxoVar.u, cxoVar.O, cxoVar.y, ownerResponseTime, cxoVar.d0));
        if (z4) {
            a(kjf0.a.a(5, a2));
        }
        if (!b210.a(good, this.c.a)) {
            intValue = good.y;
        } else if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            intValue = good.y;
        } else {
            int i7 = good.y;
            Integer valueOf = Integer.valueOf(i7);
            if (i7 != 0) {
                valueOf = null;
            }
            intValue = valueOf != null ? valueOf.intValue() : 31;
        }
        if (good.y != -1) {
            a(kjf0.a.a(16, Integer.valueOf(intValue)));
        }
        if (!good.V) {
            DeliveryInfo deliveryInfo = good.q;
            String str2 = deliveryInfo != null ? deliveryInfo.b : null;
            if (str2 != null && str2.length() != 0) {
                a(kjf0.a.a(13, new n8u(R.string.good_delivery_info_title, str2)));
            }
            if (cxoVar.v && !good.V && (price = k5uVar.e) != null) {
                a(kjf0.a.a(13, new n8u(R.string.good_min_price_info_title, price.e)));
            }
        }
        if (!dukVar.c && (gzsVar = cxoVar.I) != null) {
            a(kjf0.a.a(4, new ul3(gzsVar, context.getString(R.string.good_ext_info_title), k5uVar.d, false)));
        }
        String str3 = good.g;
        if (str3 != null && str3.length() > 0) {
            String str4 = good.g;
            a(kjf0.a.a(4, new ul3(str4 != null ? new defpackage.w(cxoVar, context, str4) : new jo60(16), context.getString(R.string.good_description_info_title), null, true)));
        }
        CancellationInfo cancellationInfo = good.U;
        if (cancellationInfo != null) {
            a(kjf0.a.a(4, new ul3(new qsd0(5, ezp0Var, cancellationInfo), cancellationInfo.c, null, true)));
        }
        List<CharacteristicsItem> list3 = good.o0;
        if (list3 == null || list3.isEmpty()) {
            a(kjf0.a.a(2, new ynd0(good.Q, good.e, good)));
            return;
        }
        ListBuilder e2 = e43.e();
        e2.add(new h4u.b(new ynd0(good.Q, good.e, good)));
        List<CharacteristicsItem> list4 = good.o0;
        List<CharacteristicsItem> list5 = list4;
        if (list5 != null && !list5.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            for (CharacteristicsItem characteristicsItem : list4) {
                arrayList4.add(new w3u(characteristicsItem.c, j5g.g0(characteristicsItem.d, ", \n", null, null, 0, new l140(22), 30)));
            }
            e2.add(new h4u.a(arrayList4));
        }
        a(kjf0.a.c(3, new g2m(e2.g())));
    }
}
