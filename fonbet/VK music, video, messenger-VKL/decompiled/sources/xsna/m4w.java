package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.market.CatalogNavigationTab;
import com.vk.catalog2.common.dto.ui.market.UIBlockNavigationTab;
import com.vk.catalog2.common.ui.mvp.holder.NavigationTabVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.hints.HintCategories;
import com.vk.dto.market.catalog.CatalogMarketSorting;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.im.video.e;
import com.vk.permission.dialog.VkSeparatePermissionDialog;
import com.vk.superapp.browser.ui.dialogs.DialogResultState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.as30;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m4w implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m4w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? r6;
        dw20.a i;
        List<CatalogMarketSorting.SortOption> list;
        kz50 kz50Var;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                com.vk.im.video.e eVar = (com.vk.im.video.e) obj;
                abi0 abi0Var = eVar.M;
                if (!epx.f(abi0Var != null ? Boolean.valueOf(abi0Var.b()) : eVar.I, Boolean.TRUE) && eVar.H == e.c.ACTIVE) {
                    as30.a aVar = eVar.h;
                    pk30 pk30Var = as30.this.h;
                    if (pk30Var != null) {
                        pk30Var.D();
                        break;
                    }
                }
                break;
            case 1:
                jd10 jd10Var = (jd10) obj;
                MediaContentItem mediaContentItem = jd10Var.g;
                if (mediaContentItem != null) {
                    jd10Var.i.k(jd10Var.a.getContext(), mediaContentItem);
                    break;
                }
                break;
            case 2:
                NavigationTabVh navigationTabVh = (NavigationTabVh) obj;
                CatalogNavigationTab catalogNavigationTab = navigationTabVh.m;
                if (catalogNavigationTab == null) {
                    catalogNavigationTab = null;
                }
                String str = catalogNavigationTab.d;
                switch (str.hashCode()) {
                    case -2024581756:
                        if (str.equals("sorting")) {
                            CatalogNavigationTab catalogNavigationTab2 = navigationTabVh.m;
                            if (catalogNavigationTab2 == null) {
                                catalogNavigationTab2 = null;
                            }
                            ViewGroup viewGroup = navigationTabVh.f;
                            if (viewGroup == null) {
                                viewGroup = null;
                            }
                            Context context = viewGroup.getContext();
                            CatalogMarketSorting catalogMarketSorting = catalogNavigationTab2.l;
                            if (catalogMarketSorting == null || (list = catalogMarketSorting.b) == null) {
                                r6 = EmptyList.b;
                            } else {
                                List<CatalogMarketSorting.SortOption> list2 = list;
                                r6 = new ArrayList(c5g.u(list2, 10));
                                for (CatalogMarketSorting.SortOption sortOption : list2) {
                                    String str2 = sortOption.b;
                                    String str3 = "";
                                    String str4 = str2 == null ? "" : str2;
                                    String str5 = sortOption.c;
                                    if (str5 != null) {
                                        str3 = str5;
                                    }
                                    r6.add(new dfk0(epx.f(catalogMarketSorting.c, str2), str4, str3));
                                }
                            }
                            pll pllVar = new pll();
                            i = new dw20.b(context, null).i(new bfk0(r6, new bp7(24, navigationTabVh, pllVar)), (r3 & 2) == 0, false);
                            pllVar.b = ((dw20.b) i).I(true).I0(null);
                            break;
                        }
                        break;
                    case -854547461:
                        if (str.equals("filters") && (kz50Var = navigationTabVh.o) != null) {
                            UIBlockNavigationTab uIBlockNavigationTab = navigationTabVh.l;
                            kz50Var.a(uIBlockNavigationTab != null ? uIBlockNavigationTab : null);
                            break;
                        }
                        break;
                    case 116079:
                        if (str.equals("url")) {
                            CatalogNavigationTab catalogNavigationTab3 = navigationTabVh.m;
                            String str6 = (catalogNavigationTab3 != null ? catalogNavigationTab3 : null).e;
                            if (str6 != null) {
                                maz.c(xwk.d().e(), view.getContext(), str6, LaunchContext.A, null, null, 24);
                                break;
                            }
                        }
                        break;
                    case 1296516636:
                        if (!str.equals(HintCategories.PARAM_NAME)) {
                        }
                        break;
                    case 1762953472:
                        if (!str.equals("classifieds_category_tree")) {
                        }
                        break;
                    case 1970241253:
                        if (str.equals("section")) {
                            CatalogNavigationTab catalogNavigationTab4 = navigationTabVh.m;
                            if (catalogNavigationTab4 == null) {
                                catalogNavigationTab4 = null;
                            }
                            String str7 = catalogNavigationTab4.f;
                            if (str7 != null) {
                                dhc dc = ((ClassifiedsComponent) ((k7m) m7m.f(navigationTabVh)).a(fpf0.a(ClassifiedsComponent.class))).dc();
                                Context context2 = view.getContext();
                                CatalogNavigationTab catalogNavigationTab5 = navigationTabVh.m;
                                dc.d(context2, new ngc(null, str7, null, null, null, null, null, null, null, null, navigationTabVh.c, null, false, (catalogNavigationTab5 != null ? catalogNavigationTab5 : null).c, 3604475));
                                break;
                            }
                        }
                        break;
                }
                kz50 kz50Var2 = navigationTabVh.o;
                if (kz50Var2 != null) {
                    UIBlockNavigationTab uIBlockNavigationTab2 = navigationTabVh.l;
                    kz50Var2.a(uIBlockNavigationTab2 != null ? uIBlockNavigationTab2 : null);
                    break;
                }
                break;
            case 3:
                int i3 = m760.A;
                ((m760) obj).Dn(DialogResultState.EXIT);
                break;
            case 4:
                RecyclerView recyclerView = (RecyclerView) ((WeakReference) obj).get();
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                    break;
                }
                break;
            case 5:
                int i4 = VkPlaceholder.A;
                ((gzs) obj).invoke();
                break;
            default:
                VkSeparatePermissionDialog vkSeparatePermissionDialog = (VkSeparatePermissionDialog) obj;
                VkSeparatePermissionDialog.b bVar = vkSeparatePermissionDialog.f1;
                Iterable<VkSeparatePermissionDialog.PermissionItem> iterable = bVar != null ? bVar.c : null;
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                for (VkSeparatePermissionDialog.PermissionItem permissionItem : iterable) {
                    String str8 = permissionItem.f ? permissionItem.b : null;
                    if (str8 != null) {
                        arrayList.add(str8);
                    }
                }
                qas qasVar = vkSeparatePermissionDialog.g1;
                if (qasVar != null) {
                    Set keySet = ((LinkedHashMap) qasVar.b).keySet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : keySet) {
                        if (arrayList.contains(((p53) obj2).a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    ((zu1) qasVar.c).invoke(arrayList2);
                }
                vkSeparatePermissionDialog.dismiss();
                break;
        }
    }
}
