package xsna;

import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.core.view.components.topbar.VkTopBar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: ToolbarTitleDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class s3p0 {
    public final String a;
    public final wm80 b;
    public final iri0 c;
    public final b990 d;
    public final b3m0 e;

    public s3p0(String str, wm80 wm80Var, iri0 iri0Var, c3k0 c3k0Var, b990 b990Var, b3m0 b3m0Var) {
        this.a = str;
        this.b = wm80Var;
        this.c = iri0Var;
        this.d = b990Var;
        this.e = b3m0Var;
    }

    public static boolean b(UIBlockList uIBlockList) {
        UIBlockActionShowFilters uIBlockActionShowFilters;
        List<CatalogFilterData> list;
        if (uIBlockList == null || (uIBlockActionShowFilters = uIBlockList.B) == null || (list = uIBlockActionShowFilters.A) == null) {
            return false;
        }
        List<CatalogFilterData> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((CatalogFilterData) it.next()).e) {
                return true;
            }
        }
        return false;
    }

    public final void a(UIBlockList uIBlockList) {
        List<CatalogFilterData> list;
        Object obj;
        String str;
        String str2 = uIBlockList.z;
        if (!b(uIBlockList)) {
            String str3 = this.a;
            if (str3 != null) {
                str2 = str3;
            } else if (str2 == null) {
                str2 = "";
            }
            d(str2, false);
            return;
        }
        UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockList.B;
        if (uIBlockActionShowFilters == null || (list = uIBlockActionShowFilters.A) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((CatalogFilterData) obj).e) {
                    break;
                }
            }
        }
        CatalogFilterData catalogFilterData = (CatalogFilterData) obj;
        if (catalogFilterData == null || (str = catalogFilterData.c) == null) {
            return;
        }
        d(str, c(uIBlockList));
    }

    public final boolean c(UIBlockList uIBlockList) {
        return ((Boolean) this.c.invoke()).booleanValue() && b(uIBlockList);
    }

    public final void d(String str, boolean z) {
        this.e.invoke(ToolbarRedesignVh.a.a(((ToolbarRedesignVh) this.d.c).s, null, new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(str, (e4) null, z ? new VkTopBar.Middle.Text.Title.a.C0870a(null) : null, (VkTopBar.Middle.Text.Title.Size) null, 10), null, null, null, 14), null, 5));
    }
}
