package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.ei;
import defpackage.i4u;
import defpackage.kbs;
import defpackage.leh0;
import defpackage.m710;
import defpackage.sa90;
import defpackage.vf7;
import defpackage.yv21;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes11.dex */
final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;
    private m710 onMonthNavigationListener;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dayCompute = yv21.g(null);
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(leh0.cancel_button);
            setNextFocusRightId(leh0.confirm_button);
        }
        this.nestedScrollable = MaterialDatePicker.isNestedScrollable(getContext());
        androidx.core.view.b.p(this, new ei(11));
    }

    private void ensureFocusRingSelector(MonthAdapter monthAdapter) {
        Drawable selector = getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Drawable wrap = FocusRingDrawable.wrap(getContext(), selector);
        if (wrap instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) wrap;
            vf7 vf7Var = monthAdapter.calendarStyle;
            if (vf7Var != null) {
                focusRingDrawable.setFocusRingShapeAppearance(vf7Var.a.f);
            }
            setDrawSelectorOnTop(true);
            setSelector(focusRingDrawable);
        }
    }

    private void gainFocus(int i, Rect rect) {
        int findLastValidDayPosition = (i == 33 || i == 1) ? getAdapter().findLastValidDayPosition() : (i == 130 || i == 2) ? getAdapter().findFirstValidDayPosition() : -1;
        if (findLastValidDayPosition != -1) {
            setSelection(findLastValidDayPosition);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private View getChildAtPosition(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    private boolean handleHorizontalNavigation(int i, boolean z) {
        m710 m710Var;
        boolean handleNavigateToMonthForKeyboard;
        m710 m710Var2;
        boolean handleNavigateToMonthForKeyboard2;
        int findNextValidDayPosition = z ? getAdapter().findNextValidDayPosition(i) : getAdapter().findPreviousValidDayPosition(i);
        if (findNextValidDayPosition != -1) {
            setSelection(findNextValidDayPosition);
            return true;
        }
        if (!z && (m710Var2 = this.onMonthNavigationListener) != null) {
            handleNavigateToMonthForKeyboard2 = ((MaterialCalendar) ((i4u) m710Var2).a).handleNavigateToMonthForKeyboard(false);
            return handleNavigateToMonthForKeyboard2;
        }
        if (!z || (m710Var = this.onMonthNavigationListener) == null) {
            return true;
        }
        handleNavigateToMonthForKeyboard = ((MaterialCalendar) ((i4u) m710Var).a).handleNavigateToMonthForKeyboard(true);
        return handleNavigateToMonthForKeyboard;
    }

    private boolean handleTabNavigation(int i, KeyEvent keyEvent) {
        int findPreviousValidDayPosition = keyEvent.isShiftPressed() ? getAdapter().findPreviousValidDayPosition(i) : getAdapter().findNextValidDayPosition(i);
        if (findPreviousValidDayPosition == -1) {
            return false;
        }
        setSelection(findPreviousValidDayPosition);
        return true;
    }

    private static int horizontalMidPoint(View view) {
        return (view.getWidth() / 2) + view.getLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAttachedToWindow$0() {
        ensureFocusRingSelector(getAdapter());
    }

    private static boolean skipMonth(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    private boolean trySelectNearestValidDayPosition(int i) {
        int findNearestValidDayPositionInRow = getAdapter().findNearestValidDayPositionInRow(i);
        if (findNearestValidDayPositionInRow == -1) {
            return false;
        }
        setSelection(findNearestValidDayPositionInRow);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public ListAdapter getAdapter2() {
        return (MonthAdapter) super.getAdapter();
    }

    public boolean handleVerticalNavigationOnDisabledDay(int i, int i2) {
        MonthAdapter adapter = getAdapter();
        if (trySelectNearestValidDayPosition(i2)) {
            return true;
        }
        if (19 == i) {
            int numColumns = getNumColumns();
            while (true) {
                i2 -= numColumns;
                if (i2 < adapter.firstPositionInMonth()) {
                    return false;
                }
                if (trySelectNearestValidDayPosition(i2)) {
                    return true;
                }
                numColumns = getNumColumns();
            }
        } else {
            if (i != 20) {
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                numColumns2 += i2;
                if (numColumns2 > adapter.lastPositionInMonth()) {
                    return false;
                }
                if (trySelectNearestValidDayPosition(numColumns2)) {
                    return true;
                }
                i2 = getNumColumns();
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.i
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.this.lambda$onAttachedToWindow$0();
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int dayToPosition;
        int horizontalMidPoint;
        int dayToPosition2;
        int horizontalMidPoint2;
        int i;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = materialCalendarGridView.getAdapter();
        DateSelector<?> dateSelector = adapter.dateSelector;
        vf7 vf7Var = adapter.calendarStyle;
        int max = Math.max(adapter.firstPositionInMonth(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(adapter.lastPositionInMonth(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        Iterator<sa90> it = dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            sa90 next = it.next();
            Object obj = next.a;
            Object obj2 = next.b;
            if (obj != null) {
                if (obj2 != null) {
                    Long l = (Long) obj;
                    long longValue = l.longValue();
                    Long l2 = (Long) obj2;
                    long longValue2 = l2.longValue();
                    if (!skipMonth(item, item2, l, l2)) {
                        boolean z = materialCalendarGridView.getLayoutDirection() == 1;
                        if (longValue < item.longValue()) {
                            horizontalMidPoint = adapter.isFirstInRow(max) ? 0 : !z ? materialCalendarGridView.getChildAtPosition(max - 1).getRight() : materialCalendarGridView.getChildAtPosition(max - 1).getLeft();
                            dayToPosition = max;
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue);
                            dayToPosition = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            horizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(dayToPosition));
                        }
                        if (longValue2 > item2.longValue()) {
                            horizontalMidPoint2 = adapter.isLastInRow(min) ? materialCalendarGridView.getWidth() : !z ? materialCalendarGridView.getChildAtPosition(min).getRight() : materialCalendarGridView.getChildAtPosition(min).getLeft();
                            dayToPosition2 = min;
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue2);
                            dayToPosition2 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            horizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(dayToPosition2));
                        }
                        int itemId = (int) adapter.getItemId(dayToPosition);
                        boolean z2 = true;
                        int itemId2 = (int) adapter.getItemId(dayToPosition2);
                        int i3 = itemId;
                        while (i3 <= itemId2) {
                            boolean z3 = z2;
                            int numColumns = materialCalendarGridView.getNumColumns() * i3;
                            MonthAdapter monthAdapter = adapter;
                            int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                            View childAtPosition = materialCalendarGridView.getChildAtPosition(numColumns);
                            int top = childAtPosition.getTop() + vf7Var.a.a.top;
                            Iterator<sa90> it2 = it;
                            int bottom = childAtPosition.getBottom() - vf7Var.a.a.bottom;
                            if (z) {
                                int i4 = dayToPosition2 > numColumns2 ? 0 : horizontalMidPoint2;
                                int width = numColumns > dayToPosition ? getWidth() : horizontalMidPoint;
                                i = i4;
                                i2 = width;
                            } else {
                                i = numColumns > dayToPosition ? 0 : horizontalMidPoint;
                                i2 = dayToPosition2 > numColumns2 ? getWidth() : horizontalMidPoint2;
                            }
                            canvas.drawRect(i, top, i2, bottom, vf7Var.h);
                            i3++;
                            materialCalendarGridView = this;
                            z2 = z3;
                            adapter = monthAdapter;
                            it = it2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            gainFocus(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = getLayoutDirection() == 1;
        if (i == 21) {
            return handleHorizontalNavigation(selectedItemPosition, z);
        }
        if (i == 22) {
            return handleHorizontalNavigation(selectedItemPosition, !z);
        }
        if (i == 61) {
            return handleTabNavigation(selectedItemPosition, keyEvent);
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        MonthAdapter adapter = getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || adapter.isDayPositionValid(selectedItemPosition2)) {
            return true;
        }
        return handleVerticalNavigationOnDisabledDay(i, selectedItemPosition2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.nestedScrollable) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof MonthAdapter) {
            super.setAdapter(listAdapter);
        } else {
            kbs.o("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()});
        }
    }

    public void setOnMonthNavigationListener(m710 m710Var) {
        this.onMonthNavigationListener = m710Var;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        super.setSelection(Math.max(i, getAdapter().findFirstValidDayPosition()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
