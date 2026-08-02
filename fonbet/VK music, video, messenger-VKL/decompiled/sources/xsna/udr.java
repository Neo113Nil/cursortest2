package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.search.SearchQuickInnerFilterItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dw20;
import xsna.tlo0;

/* compiled from: FilterSelectorBottomSheet.kt */
/* loaded from: classes16.dex */
public class udr {
    public dw20 a;
    public final ArrayList b = new ArrayList();
    public int c = -1;
    public SearchQuickInnerFilterItem d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    public void a(Context context, SearchQuickFilterItem searchQuickFilterItem, defpackage.v vVar) {
        Object obj;
        Object obj2;
        int i;
        Context context2 = context;
        ArrayList arrayList = this.b;
        arrayList.clear();
        int i2 = -1;
        this.c = -1;
        String str = null;
        dw20.b bVar = new dw20.b(context2, null);
        View inflate = LayoutInflater.from(context2).inflate(R.layout.modal_page_filter_selector, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.filter_selector_root);
        List<SearchQuickInnerFilterItem> list = searchQuickFilterItem.n;
        int i3 = 0;
        for (Object obj3 : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                ?? r16 = str;
                e43.t();
                throw r16;
            }
            SearchQuickInnerFilterItem searchQuickInnerFilterItem = (SearchQuickInnerFilterItem) obj3;
            String str2 = str;
            rju0 rju0Var = new rju0(context2);
            rju0Var.setLayoutParams(new ViewGroup.LayoutParams(i2, -2));
            tlo0.a aVar = tlo0.Companion;
            String str3 = searchQuickInnerFilterItem.b;
            boolean z = searchQuickInnerFilterItem.g;
            aVar.getClass();
            rju0Var.setTitle(new tlo0.h(str3));
            rju0Var.setChecked(z);
            if (z) {
                this.c = i3;
            }
            if (searchQuickInnerFilterItem.j) {
                rju0Var.setListener(new tdr(this, searchQuickInnerFilterItem, rju0Var));
            } else {
                rju0Var.setEnabled(false);
                rju0Var.setAlpha(0.64f);
            }
            arrayList.add(rju0Var);
            context2 = context;
            i3 = i4;
            str = str2;
            i2 = -1;
        }
        String str4 = str;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((SearchQuickInnerFilterItem) obj).h) {
                    break;
                }
            } else {
                obj = str4;
                break;
            }
        }
        this.d = (SearchQuickInnerFilterItem) obj;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (((SearchQuickInnerFilterItem) obj2).g) {
                    break;
                }
            } else {
                obj2 = str4;
                break;
            }
        }
        SearchQuickInnerFilterItem searchQuickInnerFilterItem2 = (SearchQuickInnerFilterItem) obj2;
        if (searchQuickInnerFilterItem2 == null || !searchQuickInnerFilterItem2.g) {
            Iterator it3 = arrayList.iterator();
            int i5 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i = -1;
                    break;
                }
                String title = ((rju0) it3.next()).getTitle();
                SearchQuickInnerFilterItem searchQuickInnerFilterItem3 = this.d;
                if (epx.f(title, searchQuickInnerFilterItem3 != null ? searchQuickInnerFilterItem3.b : str4)) {
                    i = i5;
                    break;
                }
                i5++;
            }
            ((rju0) arrayList.get(i)).setChecked(true);
            this.c = i;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            linearLayout.addView((rju0) it4.next());
        }
        dw20.b t = bVar.D0(inflate, false).w0(searchQuickFilterItem.c).c(new cpo(false, 0, 7)).G(R.string.video_catalog_filters_reset).H(new mm1(13, this, vVar)).t();
        dne dneVar = new dne(this, 23);
        t.g();
        t.d.z1 = dneVar;
        dw20.b a0 = t.a0(new krh(this, 15));
        ldl ldlVar = new ldl(this, 12);
        a0.g();
        a0.d.A1 = ldlVar;
        this.a = a0.h0(R.string.modal_page_show_results, new sdr(this, vVar, searchQuickFilterItem, 0)).H0(((FragmentActivity) e3m.h(context)).getSupportFragmentManager(), "FilterSelectorBottomSheet");
    }
}
