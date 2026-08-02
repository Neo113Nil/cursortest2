package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import defpackage.jvh0;
import defpackage.kxh0;
import defpackage.mf7;
import defpackage.sa90;
import defpackage.vf7;
import defpackage.yv21;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes11.dex */
class MonthAdapter extends BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    vf7 calendarStyle;
    final DateSelector<?> dateSelector;
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = yv21.g(null).getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (yv21.g(null).getMaximum(7) + yv21.g(null).getMaximum(5)) - 1;

    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    private String getDayContentDescription(Context context, long j) {
        boolean isToday = isToday(j);
        boolean isStartOfRange = isStartOfRange(j);
        boolean isEndOfRange = isEndOfRange(j);
        Calendar f = yv21.f();
        Calendar g = yv21.g(null);
        g.setTimeInMillis(j);
        String format = f.get(1) == g.get(1) ? yv21.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : yv21.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (isToday) {
            format = String.format(context.getString(kxh0.mtrl_picker_today_description), format);
        }
        return isStartOfRange ? String.format(context.getString(kxh0.mtrl_picker_start_date_description), format) : isEndOfRange ? String.format(context.getString(kxh0.mtrl_picker_end_date_description), format) : format;
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new vf7(context);
        }
    }

    private boolean isSelected(long j) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (yv21.a(j) == yv21.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean isToday(long j) {
        return yv21.f().getTimeInMillis() == j;
    }

    private void updateSelectedState(TextView textView, long j, int i) {
        boolean z;
        mf7 mf7Var;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String dayContentDescription = getDayContentDescription(context, j);
        textView.setContentDescription(dayContentDescription);
        boolean isValid = this.calendarConstraints.getDateValidator().isValid(j);
        if (isValid) {
            textView.setEnabled(true);
            z = isSelected(j);
            textView.setSelected(z);
            if (z) {
                mf7Var = this.calendarStyle.b;
            } else {
                boolean isToday = isToday(j);
                vf7 vf7Var = this.calendarStyle;
                mf7Var = isToday ? vf7Var.c : vf7Var.a;
            }
        } else {
            z = false;
            textView.setEnabled(false);
            mf7Var = this.calendarStyle.g;
        }
        boolean z2 = z;
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator == null || i == -1) {
            mf7Var.b(textView, null, null);
            return;
        }
        Month month = this.month;
        int i2 = month.year;
        int i3 = month.month;
        mf7Var.b(textView, dayViewDecorator.getBackgroundColor(context, i2, i3, i, isValid, z2), this.dayViewDecorator.getTextColor(context, i2, i3, i, isValid, z2));
        textView.setCompoundDrawables(this.dayViewDecorator.getCompoundDrawableLeft(context, i2, i3, i, isValid, z2), this.dayViewDecorator.getCompoundDrawableTop(context, i2, i3, i, isValid, z2), this.dayViewDecorator.getCompoundDrawableRight(context, i2, i3, i, isValid, z2), this.dayViewDecorator.getCompoundDrawableBottom(context, i2, i3, i, isValid, z2));
        textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i2, i3, i, isValid, z2, dayContentDescription));
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.create(j).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j, dayOfMonth);
        }
    }

    public int dayToPosition(int i) {
        return firstPositionInMonth() + (i - 1);
    }

    public int findFirstValidDayPosition() {
        return findNextValidDayPosition(firstPositionInMonth() - 1);
    }

    public int findLastValidDayPosition() {
        return findPreviousValidDayPosition(lastPositionInMonth() + 1);
    }

    public int findNearestValidDayPositionInRow(int i) {
        if (isDayPositionValid(i)) {
            return i;
        }
        long itemId = getItemId(i);
        for (int i2 = 1; i2 < this.month.daysInWeek; i2++) {
            int i3 = i + i2;
            if (i3 < getCount() && getItemId(i3) == itemId && isDayPositionValid(i3)) {
                return i3;
            }
            int i4 = i - i2;
            if (i4 >= 0 && getItemId(i4) == itemId && isDayPositionValid(i4)) {
                return i4;
            }
        }
        return -1;
    }

    public int findNextValidDayPosition(int i) {
        do {
            i++;
            if (i > lastPositionInMonth()) {
                return -1;
            }
        } while (!isDayPositionValid(i));
        return i;
    }

    public int findPreviousValidDayPosition(int i) {
        do {
            i--;
            if (i < firstPositionInMonth()) {
                return -1;
            }
        } while (!isDayPositionValid(i));
        return i;
    }

    public int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public Long getItem(int i) {
        if (i < firstPositionInMonth() || i > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.month.daysInWeek;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        Long item;
        initializeStyles(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(jvh0.mtrl_calendar_day, viewGroup, false);
        }
        int firstPositionInMonth = i - firstPositionInMonth();
        if (firstPositionInMonth >= 0) {
            Month month = this.month;
            if (firstPositionInMonth < month.daysInMonth) {
                i2 = firstPositionInMonth + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(i2)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i);
                if (item != null) {
                    return textView;
                }
                updateSelectedState(textView, item.longValue(), i2);
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i2 = -1;
        item = getItem(i);
        if (item != null) {
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean isDayPositionValid(int i) {
        Long item = getItem(i);
        return item != null && this.calendarConstraints.getDateValidator().isValid(item.longValue());
    }

    public boolean isEndOfRange(long j) {
        Iterator<sa90> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Object obj = it.next().b;
            if (obj != null && ((Long) obj).longValue() == j) {
                return true;
            }
        }
        return false;
    }

    public boolean isFirstInRow(int i) {
        return i % this.month.daysInWeek == 0;
    }

    public boolean isLastInRow(int i) {
        return (i + 1) % this.month.daysInWeek == 0;
    }

    public boolean isStartOfRange(long j) {
        Iterator<sa90> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Object obj = it.next().a;
            if (obj != null && ((Long) obj).longValue() == j) {
                return true;
            }
        }
        return false;
    }

    public int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    public int positionToDay(int i) {
        return (i - firstPositionInMonth()) + 1;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    public boolean withinMonth(int i) {
        return i >= firstPositionInMonth() && i <= lastPositionInMonth();
    }
}
