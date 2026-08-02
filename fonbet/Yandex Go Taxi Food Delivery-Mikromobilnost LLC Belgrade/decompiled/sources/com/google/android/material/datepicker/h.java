package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes11.dex */
public final class h extends RecyclerView.g {
    public final /* synthetic */ n a;
    public final /* synthetic */ MaterialCalendar b;

    public h(MaterialCalendar materialCalendar, n nVar) {
        this.b = materialCalendar;
        this.a = nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        f0 f0Var;
        f0 f0Var2;
        int childAdapterPosition;
        MaterialButton materialButton;
        if (i == 0) {
            MaterialCalendar materialCalendar = this.b;
            f0Var = materialCalendar.pagerSnapHelper;
            if (f0Var == null) {
                return;
            }
            f0Var2 = materialCalendar.pagerSnapHelper;
            View e = f0Var2.e(materialCalendar.getLayoutManager());
            if (e != null && (childAdapterPosition = recyclerView.getChildAdapterPosition(e)) != -1) {
                n nVar = this.a;
                materialCalendar.current = nVar.f(childAdapterPosition);
                materialButton = materialCalendar.monthDropSelect;
                materialButton.setText(nVar.f(childAdapterPosition).getLongName());
                materialCalendar.updateNavigationButtonsEnabled(childAdapterPosition);
            }
            materialCalendar.updateCurrentVisibleMonth();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        f0 f0Var;
        MaterialButton materialButton;
        MaterialCalendar materialCalendar = this.b;
        int K1 = i < 0 ? materialCalendar.getLayoutManager().K1() : materialCalendar.getLayoutManager().M1();
        f0Var = materialCalendar.pagerSnapHelper;
        n nVar = this.a;
        if (f0Var == null) {
            materialCalendar.current = nVar.f(K1);
        }
        materialButton = materialCalendar.monthDropSelect;
        materialButton.setText(nVar.f(K1).getLongName());
        materialCalendar.updateNavigationButtonsEnabled(K1);
    }
}
