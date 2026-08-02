package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.search.SearchQuickInnerFilterItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dw20;
import xsna.rju0;
import xsna.tlo0;

/* compiled from: CommunitiesFilterSelectorBottomSheet.kt */
/* loaded from: classes16.dex */
public final class pog extends udr {
    public dw20 e;
    public final ArrayList f = new ArrayList();
    public int g = -1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r2v7, types: [xsna.dw20$a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // xsna.udr
    public final void a(Context context, SearchQuickFilterItem searchQuickFilterItem, final defpackage.v vVar) {
        Object obj;
        Object obj2;
        ArrayList arrayList = this.f;
        arrayList.clear();
        int i = -1;
        this.g = -1;
        List<SearchQuickInnerFilterItem> list = searchQuickFilterItem.n;
        AttributeSet attributeSet = null;
        int i2 = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_page_filter_selector, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.filter_selector_root);
        List<SearchQuickInnerFilterItem> list2 = list;
        int i3 = 0;
        for (Object obj3 : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                ?? r16 = attributeSet;
                e43.t();
                throw r16;
            }
            final SearchQuickInnerFilterItem searchQuickInnerFilterItem = (SearchQuickInnerFilterItem) obj3;
            final rju0 rju0Var = new rju0(context);
            AttributeSet attributeSet2 = attributeSet;
            rju0Var.setLayoutParams(new ViewGroup.LayoutParams(i, -2));
            tlo0.a aVar = tlo0.Companion;
            String str = searchQuickInnerFilterItem.b;
            boolean z = searchQuickInnerFilterItem.g;
            aVar.getClass();
            rju0Var.setTitle(new tlo0.h(str));
            rju0Var.setChecked(z);
            if (z) {
                this.g = i3;
            }
            if (searchQuickInnerFilterItem.j) {
                rju0Var.setListener(new rju0.a() { // from class: xsna.oog
                    @Override // xsna.rju0.a
                    public final void b(boolean z2) {
                        Object obj4;
                        pog pogVar = pog.this;
                        int i5 = pogVar.g;
                        ArrayList arrayList2 = pogVar.f;
                        int i6 = 0;
                        int i7 = -1;
                        if (i5 != -1 && ((rju0) arrayList2.get(i5)).t.isChecked()) {
                            ((rju0) arrayList2.get(pogVar.g)).setChecked(false);
                            pogVar.g = -1;
                        }
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (epx.f(((rju0) it.next()).getTitle(), rju0Var.getTitle())) {
                                i7 = i6;
                                break;
                            }
                            i6++;
                        }
                        ((rju0) arrayList2.get(i7)).setChecked(z2);
                        pogVar.g = i7;
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj4 = null;
                                break;
                            } else {
                                obj4 = it2.next();
                                if (((rju0) obj4).t.isChecked()) {
                                    break;
                                }
                            }
                        }
                        if (obj4 == null) {
                            ((rju0) arrayList2.get(i7)).setChecked(true);
                        }
                        com.vk.catalog2.common.ui.holders.search.b bVar = com.vk.catalog2.common.ui.holders.search.b.a;
                        SearchQuickInnerFilterItem searchQuickInnerFilterItem2 = searchQuickInnerFilterItem;
                        com.vk.catalog2.common.ui.holders.search.b.c(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP, searchQuickInnerFilterItem2.d);
                        vVar.invoke(searchQuickInnerFilterItem2);
                        dw20 dw20Var = pogVar.e;
                        if (dw20Var != null) {
                            dw20Var.hide();
                        }
                    }
                });
            } else {
                rju0Var.setEnabled(false);
                rju0Var.setAlpha(0.64f);
            }
            arrayList.add(rju0Var);
            i3 = i4;
            attributeSet = attributeSet2;
            i = -1;
        }
        AttributeSet attributeSet3 = attributeSet;
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((SearchQuickInnerFilterItem) obj).g) {
                    break;
                }
            } else {
                obj = attributeSet3;
                break;
            }
        }
        SearchQuickInnerFilterItem searchQuickInnerFilterItem2 = (SearchQuickInnerFilterItem) obj;
        if (searchQuickInnerFilterItem2 == null || !searchQuickInnerFilterItem2.g) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (((SearchQuickInnerFilterItem) obj2).h) {
                        break;
                    }
                } else {
                    obj2 = attributeSet3;
                    break;
                }
            }
            SearchQuickInnerFilterItem searchQuickInnerFilterItem3 = (SearchQuickInnerFilterItem) obj2;
            if (searchQuickInnerFilterItem3 != null) {
                Iterator it3 = arrayList.iterator();
                int i5 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (epx.f(((rju0) it3.next()).getTitle(), searchQuickInnerFilterItem3.b)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1) {
                    ((rju0) arrayList.get(i5)).setChecked(true);
                    this.g = i5;
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            rju0 rju0Var2 = (rju0) it4.next();
            View findViewById = rju0Var2.findViewById(R.id.check_circle);
            if (findViewById != null) {
                findViewById.setVisibility(rju0Var2.t.isChecked() ? 0 : 4);
            }
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            linearLayout.addView((View) it5.next());
        }
        String str2 = searchQuickFilterItem.c;
        ?? a = io.reactivex.rxjava3.internal.operators.observable.q1.a(1, context);
        a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        VkTopBar vkTopBar = new VkTopBar(context, attributeSet3, 6, i2);
        com.vk.core.compose.component.semantics.a aVar2 = null;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(str2, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, aVar2, 14));
        vkTopBar.setBefore(new VkTopBar.c.d(null, new pce(this, 7), 0 == true ? 1 : 0, aVar2, 13));
        vkTopBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        a.addView(vkTopBar);
        NestedScrollView nestedScrollView = new NestedScrollView(context, null);
        nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        nestedScrollView.addView(inflate);
        a.addView(nestedScrollView);
        dw20.b a0 = ((dw20.b) new dw20.b(context, null).D0(a, false)).F0(true).c(new jgj(inflate, context.getResources().getDimensionPixelOffset(R.dimen.vk_ui_panel_header_height), 0, 12)).B(context.getResources().getDimensionPixelOffset(R.dimen.vk_ui_border_radius_paper), true, false).a0(new wqf(this, 2));
        trf trfVar = new trf(this, 1);
        a0.getClass();
        a0.d.A1 = trfVar;
        this.e = a0.H0(((FragmentActivity) e3m.h(context)).getSupportFragmentManager(), "CommunitiesQuickFilterSelectorBottomSheet");
    }
}
