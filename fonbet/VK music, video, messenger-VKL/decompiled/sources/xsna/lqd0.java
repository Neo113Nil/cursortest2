package xsna;

import android.content.Context;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.ecomm.product_list.model.ProductListItem;
import com.vk.ecomm.product_list.model.ProductListParams;
import com.vk.ecomm.product_list.model.ProductListRefSource;
import com.vk.ecomm.product_list.presentation.a;
import com.vk.ecomm.product_list.router.ProductListContentType;
import com.vk.ecomm.product_list.router.ProductListInternalParams;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: ProductListRouterImpl.kt */
/* loaded from: classes18.dex */
public final class lqd0 implements kqd0 {

    /* compiled from: ProductListRouterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductListRefSource.values().length];
            try {
                iArr[ProductListRefSource.IM_CHAT_POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductListRefSource.IM_CHAT_CLIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductListRefSource.IM_CHAT_PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    @Override // xsna.kqd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, ProductListParams productListParams) {
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
        CommonMarketStat$TypeMarketContextContent.Type type;
        ProductListContentType productListContentType;
        ProductListRefSource productListRefSource = productListParams.c;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[productListRefSource.ordinal()];
        if (i == 1) {
            commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.IM_CHAT_POST;
        } else if (i == 2) {
            commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.IM_CHAT_CLIP;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.IM_CHAT_PHOTO;
        }
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2 = commonMarketStat$TypeRefSource;
        int i2 = iArr[productListRefSource.ordinal()];
        if (i2 == 1) {
            type = CommonMarketStat$TypeMarketContextContent.Type.POST;
        } else if (i2 == 2) {
            type = CommonMarketStat$TypeMarketContextContent.Type.CLIP;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            type = CommonMarketStat$TypeMarketContextContent.Type.PHOTO;
        }
        CommonMarketStat$TypeMarketContextContent.Type type2 = type;
        List<ProductListItem> list = productListParams.b;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((ProductListItem) obj).b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ProductListItem) it.next()).b);
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ProductListItem productListItem = (ProductListItem) it2.next();
            Pair pair = new Pair(productListItem.b, productListItem.d);
            linkedHashMap.put(pair.i(), pair.j());
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (!((ProductListItem) it3.next()).c) {
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (((ProductListItem) it4.next()).c) {
                                productListContentType = ProductListContentType.PRODUCTS_AND_SERVICES;
                                break;
                            }
                        }
                    }
                    productListContentType = ProductListContentType.PRODUCTS;
                    ProductListInternalParams productListInternalParams = new ProductListInternalParams(arrayList2, linkedHashMap, productListContentType, commonMarketStat$TypeRefSource2, type2, productListParams.d, productListParams.e, productListParams.f);
                    SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
                    UiTrackingScreen b = UiTracker.j.b();
                    SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b == null ? b.a : null, productListInternalParams.e, null, null, new MobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem(new CommonMarketStat$TypeMarketContextContent(productListInternalParams.f, productListInternalParams.g, productListInternalParams.h)), 57), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b2, uzp0Var.a).q();
                    new a.C1001a(context, productListInternalParams).I0("ProductListBottomSheet");
                }
            }
        }
        productListContentType = ProductListContentType.SERVICES;
        ProductListInternalParams productListInternalParams2 = new ProductListInternalParams(arrayList2, linkedHashMap, productListContentType, commonMarketStat$TypeRefSource2, type2, productListParams.d, productListParams.e, productListParams.f);
        SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        UiTrackingScreen b3 = UiTracker.j.b();
        SchemeStat$TypeClick b22 = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b3 == null ? b3.a : null, productListInternalParams2.e, null, null, new MobileOfficialAppsMarketStat$TypeMarketOpenItemsModalItem(new CommonMarketStat$TypeMarketContextContent(productListInternalParams2.f, productListInternalParams2.g, productListInternalParams2.h)), 57), 2);
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var2 = UiTracker.h;
        uzp0Var2.getClass();
        new bjc(c2, b22, uzp0Var2.a).q();
        new a.C1001a(context, productListInternalParams2).I0("ProductListBottomSheet");
    }
}
