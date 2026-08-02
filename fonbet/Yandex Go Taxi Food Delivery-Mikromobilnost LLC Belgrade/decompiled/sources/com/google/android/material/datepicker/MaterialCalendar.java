package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import com.google.android.material.button.MaterialButton;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.ei;
import defpackage.fuz0;
import defpackage.hl7;
import defpackage.i4u;
import defpackage.jjh0;
import defpackage.jvh0;
import defpackage.kxh0;
import defpackage.l710;
import defpackage.leh0;
import defpackage.mg;
import defpackage.o070;
import defpackage.org0;
import defpackage.vf7;
import defpackage.x4e;

/* loaded from: classes11.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private AccessibilityManager accessibilityManager;
    private CalendarConstraints calendarConstraints;
    private CalendarSelector calendarSelector;
    private vf7 calendarStyle;
    private Month current;
    private DateSelector<S> dateSelector;
    private View dayFrame;
    private DayViewDecorator dayViewDecorator;
    private boolean isFullscreen;
    private MaterialButton monthDropSelect;
    private View monthNext;
    private View monthPrev;
    private f0 pagerSnapHelper;
    private RecyclerView recyclerView;
    private int themeResId;
    private View yearFrame;
    private RecyclerView yearSelector;
    static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";
    static final Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";
    static final Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";
    static final Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CalendarSelector {
        private static final /* synthetic */ CalendarSelector[] $VALUES;
        public static final CalendarSelector DAY;
        public static final CalendarSelector YEAR;

        static {
            CalendarSelector calendarSelector = new CalendarSelector(DivkitThemeChangeListener.THEME_VARIABLE_DEFAULT_VALUE, 0);
            DAY = calendarSelector;
            CalendarSelector calendarSelector2 = new CalendarSelector("YEAR", 1);
            YEAR = calendarSelector2;
            $VALUES = new CalendarSelector[]{calendarSelector, calendarSelector2};
        }

        public static CalendarSelector valueOf(String str) {
            return (CalendarSelector) Enum.valueOf(CalendarSelector.class, str);
        }

        public static CalendarSelector[] values() {
            return (CalendarSelector[]) $VALUES.clone();
        }
    }

    private void addActionsToMonthNavigation(View view, final n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(leh0.month_navigation_fragment_toggle);
        this.monthDropSelect = materialButton;
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        androidx.core.view.b.p(this.monthDropSelect, new mg(20, this));
        View findViewById = view.findViewById(leh0.month_navigation_previous);
        this.monthPrev = findViewById;
        findViewById.setTag(NAVIGATION_PREV_TAG);
        fuz0.a(this.monthPrev, getString(kxh0.mtrl_picker_prev_month_tooltip));
        View findViewById2 = view.findViewById(leh0.month_navigation_next);
        this.monthNext = findViewById2;
        findViewById2.setTag(NAVIGATION_NEXT_TAG);
        fuz0.a(this.monthNext, getString(kxh0.mtrl_picker_next_month_tooltip));
        this.yearFrame = view.findViewById(leh0.mtrl_calendar_year_selector_frame);
        this.dayFrame = view.findViewById(leh0.mtrl_calendar_day_selector_frame);
        setSelector(CalendarSelector.DAY);
        this.monthDropSelect.setText(this.current.getLongName());
        this.recyclerView.addOnScrollListener(new h(this, nVar));
        this.monthDropSelect.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MaterialCalendar.this.toggleVisibleSelector();
            }
        });
        this.monthNext.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int K1 = MaterialCalendar.this.getLayoutManager().K1();
                n nVar2 = nVar;
                nVar2.A = 2;
                MaterialCalendar.this.setCurrentMonth(nVar2.f(K1 + 1));
            }
        });
        this.monthPrev.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int M1 = MaterialCalendar.this.getLayoutManager().M1();
                n nVar2 = nVar;
                nVar2.A = 1;
                MaterialCalendar.this.setCurrentMonth(nVar2.f(M1 - 1));
            }
        });
        updateNavigationButtonsEnabled(nVar.g(this.current));
    }

    private RecyclerView.d createItemDecoration() {
        return new g(this);
    }

    public static int getDayHeight(Context context) {
        return context.getResources().getDimensionPixelSize(org0.mtrl_calendar_day_height);
    }

    private static int getDialogPickerHeight(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(org0.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(org0.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(org0.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(org0.mtrl_calendar_days_of_week_height);
        int i = MonthAdapter.MAXIMUM_WEEKS;
        return x4e.D(dimensionPixelOffset, dimensionPixelSize, (resources.getDimensionPixelOffset(org0.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(org0.mtrl_calendar_day_height) * i), resources.getDimensionPixelOffset(org0.mtrl_calendar_bottom_padding));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleNavigateToMonthForKeyboard(boolean z) {
        Month month;
        if (this.isFullscreen) {
            return false;
        }
        if (this.recyclerView.getScrollState() != 0) {
            return true;
        }
        n nVar = (n) this.recyclerView.getAdapter();
        if (nVar != null && (month = this.current) != null) {
            int g = nVar.g(month) + (z ? 1 : -1);
            if (g >= 0 && g < nVar.a.getMonthSpan()) {
                nVar.A = z ? 2 : 1;
                setCurrentMonth(nVar.f(g));
                return true;
            }
        }
        return false;
    }

    public static <T> MaterialCalendar<T> newInstance(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void postSmoothRecyclerViewScroll(int i) {
        this.recyclerView.post(new hl7(this, i, 2));
    }

    private void setUpForAccessibility() {
        androidx.core.view.b.p(this.recyclerView, new ei(10));
    }

    private void updateAccessibilityPaneTitle(View view) {
        if (view == null) {
            return;
        }
        CalendarSelector calendarSelector = this.calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            androidx.core.view.b.r(view, getString(kxh0.mtrl_picker_pane_title_year_view));
        } else if (calendarSelector == CalendarSelector.DAY) {
            androidx.core.view.b.r(view, getString(kxh0.mtrl_picker_pane_title_calendar_view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentVisibleMonth() {
        Month month;
        n nVar = (n) this.recyclerView.getAdapter();
        if (nVar == null || this.isFullscreen || (month = this.current) == null || month.equals(nVar.z)) {
            return;
        }
        int g = nVar.g(nVar.z);
        nVar.z = month;
        int g2 = nVar.g(month);
        nVar.notifyItemChanged(g);
        nVar.notifyItemChanged(g2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigationButtonsEnabled(int i) {
        View view = this.monthNext;
        if (view != null) {
            view.setEnabled(i + 1 < this.recyclerView.getAdapter().getItemCount());
        }
        View view2 = this.monthPrev;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(o070 o070Var) {
        return super.addOnSelectionChangedListener(o070Var);
    }

    public CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public vf7 getCalendarStyle() {
        return this.calendarStyle;
    }

    public Month getCurrentMonth() {
        return this.current;
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public DateSelector<S> getDateSelector() {
        return this.dateSelector;
    }

    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.recyclerView.getLayoutManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.dayViewDecorator = (DayViewDecorator) bundle.getParcelable(DAY_VIEW_DECORATOR_KEY);
        this.current = (Month) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new vf7(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.accessibilityManager = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month start = this.calendarConstraints.getStart();
        boolean isFullscreen = MaterialDatePicker.isFullscreen(contextThemeWrapper);
        this.isFullscreen = isFullscreen;
        if (isFullscreen) {
            i = jvh0.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = jvh0.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        inflate.setMinimumHeight(getDialogPickerHeight(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(leh0.mtrl_calendar_days_of_week);
        androidx.core.view.b.p(gridView, new ei(9));
        int firstDayOfWeek = this.calendarConstraints.getFirstDayOfWeek();
        gridView.setAdapter((ListAdapter) (firstDayOfWeek > 0 ? new DaysOfWeekAdapter(firstDayOfWeek) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (RecyclerView) inflate.findViewById(leh0.mtrl_calendar_months);
        this.recyclerView.setLayoutManager(new l710(this, getContext(), i2, i2));
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        n nVar = new n(contextThemeWrapper, this.dateSelector, this.calendarConstraints, this.dayViewDecorator, new f(this), new i4u(this));
        this.recyclerView.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(jjh0.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(leh0.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.yearSelector.setAdapter(new o(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (!this.isFullscreen) {
            f0 f0Var = new f0();
            this.pagerSnapHelper = f0Var;
            f0Var.b(this.recyclerView);
        }
        if (inflate.findViewById(leh0.month_navigation_fragment_toggle) != null) {
            addActionsToMonthNavigation(inflate, nVar);
        }
        this.recyclerView.scrollToPosition(nVar.g(this.current));
        setUpForAccessibility();
        updateAccessibilityPaneTitle(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, this.dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    public void sendAccessibilityFocusEventToMonthDropdown() {
        MaterialButton materialButton = this.monthDropSelect;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    public void setCurrentMonth(Month month) {
        n nVar = (n) this.recyclerView.getAdapter();
        int g = nVar.g(month);
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int g2 = g - nVar.g(this.current);
            boolean z = Math.abs(g2) > 3;
            boolean z2 = g2 > 0;
            this.current = month;
            if (z && z2) {
                this.recyclerView.scrollToPosition(g - 3);
                postSmoothRecyclerViewScroll(g);
            } else if (z) {
                this.recyclerView.scrollToPosition(g + 3);
                postSmoothRecyclerViewScroll(g);
            } else {
                postSmoothRecyclerViewScroll(g);
            }
        } else {
            this.current = month;
            this.recyclerView.scrollToPosition(g);
        }
        updateCurrentVisibleMonth();
        updateNavigationButtonsEnabled(g);
    }

    public void setSelector(CalendarSelector calendarSelector) {
        this.calendarSelector = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.yearSelector.getLayoutManager().l1(this.current.year - ((o) this.yearSelector.getAdapter()).a.getCalendarConstraints().getStart().year);
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
            this.monthPrev.setVisibility(8);
            this.monthNext.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            this.monthPrev.setVisibility(0);
            this.monthNext.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    public void toggleVisibleSelector() {
        CalendarSelector calendarSelector = this.calendarSelector;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            setSelector(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            setSelector(calendarSelector2);
        }
        updateAccessibilityPaneTitle(getView());
    }

    public static <T> MaterialCalendar<T> newInstance(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i, calendarConstraints, null);
    }
}
