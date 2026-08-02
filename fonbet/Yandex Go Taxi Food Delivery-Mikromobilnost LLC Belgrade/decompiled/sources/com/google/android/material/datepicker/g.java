package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.sa90;
import defpackage.vf7;
import defpackage.yv21;
import java.util.Calendar;

/* loaded from: classes11.dex */
public final class g extends RecyclerView.d {
    public final Calendar a = yv21.g(null);
    public final Calendar b = yv21.g(null);
    public final /* synthetic */ MaterialCalendar c;

    public g(MaterialCalendar materialCalendar) {
        this.c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        DateSelector dateSelector;
        vf7 vf7Var;
        vf7 vf7Var2;
        vf7 vf7Var3;
        if ((recyclerView.getAdapter() instanceof o) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            o oVar = (o) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.c;
            dateSelector = materialCalendar.dateSelector;
            for (sa90 sa90Var : dateSelector.getSelectedRanges()) {
                Object obj = sa90Var.a;
                Object obj2 = sa90Var.b;
                if (obj != null && obj2 != null) {
                    long longValue = ((Long) obj).longValue();
                    Calendar calendar = this.a;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = ((Long) obj2).longValue();
                    Calendar calendar2 = this.b;
                    calendar2.setTimeInMillis(longValue2);
                    int i = calendar.get(1) - oVar.a.getCalendarConstraints().getStart().year;
                    int i2 = calendar2.get(1) - oVar.a.getCalendarConstraints().getStart().year;
                    View X = gridLayoutManager.X(i);
                    View X2 = gridLayoutManager.X(i2);
                    int i3 = gridLayoutManager.c0;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View X3 = gridLayoutManager.X(gridLayoutManager.c0 * i6);
                        if (X3 != null) {
                            int top = X3.getTop();
                            vf7Var = materialCalendar.calendarStyle;
                            int i7 = top + vf7Var.d.a.top;
                            int bottom = X3.getBottom();
                            vf7Var2 = materialCalendar.calendarStyle;
                            int i8 = bottom - vf7Var2.d.a.bottom;
                            int width = (i6 != i4 || X == null) ? 0 : (X.getWidth() / 2) + X.getLeft();
                            int width2 = (i6 != i5 || X2 == null) ? recyclerView.getWidth() : (X2.getWidth() / 2) + X2.getLeft();
                            vf7Var3 = materialCalendar.calendarStyle;
                            canvas.drawRect(width, i7, width2, i8, vf7Var3.h);
                        }
                    }
                }
            }
        }
    }
}
