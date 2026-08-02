package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.google.ar.core.ImageMetadata;
import defpackage.i4u;
import defpackage.jvh0;
import defpackage.leh0;
import defpackage.ny61;
import defpackage.o070;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class n extends RecyclerView.Adapter {
    public int A = 0;
    public final CalendarConstraints a;
    public final DateSelector b;
    public final DayViewDecorator c;
    public final f w;
    public final i4u x;
    public final int y;
    public Month z;

    public n(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, f fVar, i4u i4uVar) {
        Month start = calendarConstraints.getStart();
        Month end = calendarConstraints.getEnd();
        Month openAt = calendarConstraints.getOpenAt();
        if (start.compareTo(openAt) > 0) {
            ny61.g("firstPage cannot be after currentPage");
            throw null;
        }
        if (openAt.compareTo(end) > 0) {
            ny61.g("currentPage cannot be after lastPage");
            throw null;
        }
        this.y = (MaterialCalendar.getDayHeight(contextThemeWrapper) * MonthAdapter.MAXIMUM_WEEKS) + (MaterialDatePicker.isFullscreen(contextThemeWrapper) ? MaterialCalendar.getDayHeight(contextThemeWrapper) : 0);
        this.a = calendarConstraints;
        this.b = dateSelector;
        this.c = dayViewDecorator;
        this.w = fVar;
        this.x = i4uVar;
        this.z = openAt;
        setHasStableIds(true);
    }

    public final Month f(int i) {
        return this.a.getStart().monthsLater(i);
    }

    public final int g(Month month) {
        return this.a.getStart().monthsUntil(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.getMonthSpan();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.a.getStart().monthsLater(i).getStableId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        m mVar = (m) x0Var;
        CalendarConstraints calendarConstraints = this.a;
        Month monthsLater = calendarConstraints.getStart().monthsLater(i);
        mVar.N.setText(monthsLater.getLongName());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) mVar.O.findViewById(leh0.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthsLater.equals(materialCalendarGridView.getAdapter().month)) {
            MonthAdapter monthAdapter = new MonthAdapter(monthsLater, this.b, calendarConstraints, this.c);
            materialCalendarGridView.setNumColumns(monthsLater.daysInWeek);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().updateSelectedStates(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter$1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                CalendarConstraints calendarConstraints2;
                DateSelector dateSelector;
                RecyclerView recyclerView;
                RecyclerView recyclerView2;
                RecyclerView recyclerView3;
                DateSelector dateSelector2;
                if (materialCalendarGridView.getAdapter().withinMonth(i2)) {
                    f fVar = n.this.w;
                    long longValue = materialCalendarGridView.getAdapter().getItem(i2).longValue();
                    MaterialCalendar materialCalendar = fVar.a;
                    calendarConstraints2 = materialCalendar.calendarConstraints;
                    if (calendarConstraints2.getDateValidator().isValid(longValue)) {
                        dateSelector = materialCalendar.dateSelector;
                        dateSelector.select(longValue);
                        Iterator<o070> it = materialCalendar.onSelectionChangedListeners.iterator();
                        while (it.hasNext()) {
                            o070 next = it.next();
                            dateSelector2 = materialCalendar.dateSelector;
                            next.b(dateSelector2.getSelection());
                        }
                        recyclerView = materialCalendar.recyclerView;
                        recyclerView.getAdapter().notifyDataSetChanged();
                        recyclerView2 = materialCalendar.yearSelector;
                        if (recyclerView2 != null) {
                            recyclerView3 = materialCalendar.yearSelector;
                            recyclerView3.getAdapter().notifyDataSetChanged();
                        }
                    }
                }
            }
        });
        materialCalendarGridView.setOnMonthNavigationListener(this.x);
        boolean isFullscreen = MaterialDatePicker.isFullscreen(mVar.a.getContext());
        if (isFullscreen || monthsLater.equals(this.z)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(ImageMetadata.HOT_PIXEL_MODE);
        }
        if (isFullscreen || !monthsLater.equals(this.z)) {
            return;
        }
        final int i2 = this.A;
        this.A = 0;
        materialCalendarGridView.post(new Runnable(this) { // from class: com.google.android.material.datepicker.l
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                int findFirstValidDayPosition;
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                if (!materialCalendarGridView2.hasFocus() || (i3 = i2) == 0) {
                    return;
                }
                MonthAdapter adapter = materialCalendarGridView2.getAdapter();
                if (i3 == 1) {
                    findFirstValidDayPosition = adapter.findLastValidDayPosition();
                    if (findFirstValidDayPosition == -1) {
                        findFirstValidDayPosition = adapter.lastPositionInMonth();
                    }
                } else {
                    findFirstValidDayPosition = adapter.findFirstValidDayPosition();
                    if (findFirstValidDayPosition == -1) {
                        findFirstValidDayPosition = adapter.firstPositionInMonth();
                    }
                }
                materialCalendarGridView2.setSelection(findFirstValidDayPosition);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(jvh0.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.isFullscreen(viewGroup.getContext())) {
            return new m(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.y));
        return new m(linearLayout, true);
    }
}
