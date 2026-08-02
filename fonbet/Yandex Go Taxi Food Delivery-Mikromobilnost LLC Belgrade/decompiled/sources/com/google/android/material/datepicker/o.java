package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.timepicker.TimeModel;
import defpackage.ib61;
import defpackage.jvh0;
import defpackage.kxh0;
import defpackage.mf7;
import defpackage.vf7;
import defpackage.yv21;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class o extends RecyclerView.Adapter {
    public final MaterialCalendar a;

    public o(MaterialCalendar materialCalendar) {
        this.a = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.getCalendarConstraints().getYearSpan();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ib61 ib61Var = (ib61) x0Var;
        MaterialCalendar materialCalendar = this.a;
        final int i2 = materialCalendar.getCalendarConstraints().getStart().year + i;
        ib61Var.N.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i2)));
        TextView textView = ib61Var.N;
        Context context = textView.getContext();
        textView.setContentDescription(yv21.f().get(1) == i2 ? String.format(context.getString(kxh0.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(kxh0.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        vf7 calendarStyle = materialCalendar.getCalendarStyle();
        Calendar f = yv21.f();
        mf7 mf7Var = f.get(1) == i2 ? calendarStyle.f : calendarStyle.d;
        Iterator<Long> it = materialCalendar.getDateSelector().getSelectedDays().iterator();
        while (it.hasNext()) {
            f.setTimeInMillis(it.next().longValue());
            if (f.get(1) == i2) {
                mf7Var = calendarStyle.e;
            }
        }
        mf7Var.b(textView, null, null);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Drawable wrap = FocusRingDrawable.wrap(textView.getContext(), textView.getForeground());
            if (wrap instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) wrap;
                focusRingDrawable.setFocusRingShapeAppearance(mf7Var.f);
                focusRingDrawable.setFocusRingInset(mf7Var.a.top);
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(mf7Var == calendarStyle.e);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter$1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                o.this.a.setCurrentMonth(o.this.a.getCalendarConstraints().clamp(Month.create(i2, o.this.a.getCurrentMonth().month)));
                o.this.a.setSelector(MaterialCalendar.CalendarSelector.DAY);
                o.this.a.sendAccessibilityFocusEventToMonthDropdown();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ib61((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(jvh0.mtrl_calendar_year, viewGroup, false));
    }
}
