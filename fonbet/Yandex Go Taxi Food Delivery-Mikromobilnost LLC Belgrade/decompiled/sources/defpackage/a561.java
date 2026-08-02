package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class a561 implements zo31 {
    public final LinearLayout a;
    public final RecyclerView b;
    public final LinearLayout c;

    public a561(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.b = recyclerView;
        this.c = linearLayout2;
    }

    public static a561 o(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        layoutInflater.inflate(poh0.ybsdk_range_date_picker_calendar_view, linearLayout);
        int i = fch0.calendarRecyclerView;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, linearLayout);
        if (recyclerView != null) {
            i = fch0.weekDaysContainer;
            LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, linearLayout);
            if (linearLayout2 != null) {
                return new a561(linearLayout, recyclerView, linearLayout2);
            }
        }
        ny61.t("Missing required view with ID: ".concat(linearLayout.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
