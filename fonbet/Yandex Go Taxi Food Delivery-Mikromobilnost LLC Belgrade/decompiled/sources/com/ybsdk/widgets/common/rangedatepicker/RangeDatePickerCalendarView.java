package com.ybsdk.widgets.common.rangedatepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.utils.ext.view.b;
import defpackage.a0;
import defpackage.a561;
import defpackage.af7;
import defpackage.bf7;
import defpackage.dzh0;
import defpackage.ef7;
import defpackage.egq0;
import defpackage.ff7;
import defpackage.hl7;
import defpackage.idb1;
import defpackage.kb61;
import defpackage.kdb1;
import defpackage.kf7;
import defpackage.l1i0;
import defpackage.lf7;
import defpackage.lum;
import defpackage.lwg0;
import defpackage.lz;
import defpackage.mq5;
import defpackage.ny61;
import defpackage.p6i0;
import defpackage.pf7;
import defpackage.q;
import defpackage.q6i0;
import defpackage.qa3;
import defpackage.r6i0;
import defpackage.rf7;
import defpackage.s6i0;
import defpackage.s7s0;
import defpackage.scc;
import defpackage.sf7;
import defpackage.tcc;
import defpackage.tls;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 M2\u00020\u0001:\u0002\u000eNB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\n2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0*¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b1\u0010\u001bJ\u0015\u00104\u001a\u00020\n2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\"\u0010B\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010\u00110\u00110@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/ybsdk/widgets/common/rangedatepicker/RangeDatePickerCalendarView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "createWeekDaysHeader", "()V", "setupRecyclerView", "Lq6i0;", "newState", "", "Lkf7;", "generateMonths", "(Lq6i0;)Ljava/util/List;", "Lpf7;", "month", "onMonthHeaderClicked", "(Lpf7;)V", "Ljava/util/Calendar;", MetaDataField.DATE_FIELD, "onDaySelected", "(Ljava/util/Calendar;)V", "selectedDate", "handleStartDateSelection", "handleEndDateSelection", "lastItemIndex", "scrollToBottomOnCreation", "(I)V", "firstAvailableDate", "calculateRecyclerHeight", "(Ljava/util/Calendar;)I", "render", "(Lq6i0;)V", "Legq0;", "getSelectedDates", "()Legq0;", "Lkotlin/Function1;", "listener", "setOnStateChangedListener", "(Ltls;)V", "", "hasValidDateRange", "()Z", "scrollToDate", "Lcom/ybsdk/widgets/common/rangedatepicker/SelectionMode;", "newSelectionMode", "changeSelectionMode", "(Lcom/ybsdk/widgets/common/rangedatepicker/SelectionMode;)V", "La561;", "binding", "La561;", "Ljava/util/Locale;", "currentLocale", "Ljava/util/Locale;", "", "calendarDayHeight", "F", "calendarMonthHeaderHeight", "Lqa3;", "kotlin.jvm.PlatformType", "calendarAdapter", "Lqa3;", "Landroidx/recyclerview/widget/GridLayoutManager;", "calendarLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", ClidProvider.STATE, "Lq6i0;", "isFirstRender", "Z", "onStateChangedListener", "Ltls;", "Companion", "p6i0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RangeDatePickerCalendarView extends LinearLayout {
    private static final p6i0 Companion = new p6i0();

    @Deprecated
    public static final int DAY_CELLS_COUNT = 1;

    @Deprecated
    public static final float DAY_VIEW_WEIGHT = 1.0f;

    @Deprecated
    public static final int MONTH_CELLS_COUNT = 7;

    @Deprecated
    public static final int TOTAL_VISIBLE_WEEKS = 6;
    private final a561 binding;
    private final qa3 calendarAdapter;
    private final float calendarDayHeight;
    private final GridLayoutManager calendarLayoutManager;
    private final float calendarMonthHeaderHeight;
    private final Locale currentLocale;
    private boolean isFirstRender;
    private tls onStateChangedListener;
    private q6i0 state;

    public RangeDatePickerCalendarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = a561.o(LayoutInflater.from(context), this);
        Locale locale = new Locale(context.getApplicationContext().getString(dzh0.ybsdk_ui_language));
        this.currentLocale = locale;
        this.calendarDayHeight = getResources().getDimension(lwg0.ybsdk_calendar_day_height);
        this.calendarMonthHeaderHeight = getResources().getDimension(lwg0.ybsdk_calendar_month_header_height);
        ef7 ef7Var = ef7.a;
        RangeDatePickerCalendarView$calendarAdapter$1 rangeDatePickerCalendarView$calendarAdapter$1 = new RangeDatePickerCalendarView$calendarAdapter$1(1, this, RangeDatePickerCalendarView.class, "onMonthHeaderClicked", "onMonthHeaderClicked(Lcom/ybsdk/widgets/common/rangedatepicker/CalendarMonth;)V", 0);
        this.calendarAdapter = new qa3(ef7Var, new lum(new mq5(6), rf7.a, new q(26, new s7s0(23), locale, rangeDatePickerCalendarView$calendarAdapter$1), sf7.a), new lum(new mq5(5), af7.a, new a0(20, new RangeDatePickerCalendarView$calendarAdapter$2(1, this, RangeDatePickerCalendarView.class, "onDaySelected", "onDaySelected(Ljava/util/Calendar;)V", 0)), bf7.a));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 7);
        gridLayoutManager.h0 = new s6i0(this);
        this.calendarLayoutManager = gridLayoutManager;
        this.state = q6i0.e;
        this.isFirstRender = true;
        createWeekDaysHeader();
        setupRecyclerView();
    }

    private final int calculateRecyclerHeight(Calendar firstAvailableDate) {
        int i;
        Calendar e = kdb1.e();
        if (new kb61(firstAvailableDate.get(1), firstAvailableDate.get(2)).equals(new kb61(e.get(1), e.get(2)))) {
            Calendar calendar = (Calendar) e.clone();
            calendar.setFirstDayOfWeek(2);
            int actualMaximum = ((kdb1.f(calendar).get(7) + 5) % 7) + calendar.getActualMaximum(5);
            i = (actualMaximum / 7) + (actualMaximum % 7 == 0 ? 0 : 1);
        } else {
            i = 6;
        }
        return (int) ((i * this.calendarDayHeight) + this.calendarMonthHeaderHeight);
    }

    private final void createWeekDaysHeader() {
        ArrayList g = kdb1.g(this.currentLocale);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            TextView textView = new TextView(getContext(), null, 0, l1i0.Widget_YB_Text_Body2);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            textView.setText(str);
            textView.setGravity(17);
            arrayList.add(textView);
        }
        LinearLayout linearLayout = this.binding.c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linearLayout.addView((View) it2.next());
        }
    }

    private final List<kf7> generateMonths(q6i0 newState) {
        return idb1.d(idb1.c(newState.a, newState.c, newState.d));
    }

    private final void handleEndDateSelection(Calendar selectedDate) {
        q6i0 q6i0Var = this.state;
        Calendar calendar = q6i0Var.c;
        Calendar calendar2 = calendar != null ? (Calendar) calendar.clone() : null;
        q6i0 a = calendar2 == null ? q6i0.a(q6i0Var, null, SelectionMode.START_DATE, null, (Calendar) selectedDate.clone(), 5) : kdb1.i(selectedDate, calendar2) ? q6i0.a(q6i0Var, null, SelectionMode.START_DATE, null, (Calendar) selectedDate.clone(), 1) : q6i0.a(q6i0Var, null, SelectionMode.START_DATE, null, (Calendar) selectedDate.clone(), 5);
        tls tlsVar = this.onStateChangedListener;
        if (tlsVar != null) {
            tlsVar.invoke(a);
        }
    }

    private final void handleStartDateSelection(Calendar selectedDate) {
        q6i0 q6i0Var = this.state;
        Calendar calendar = q6i0Var.d;
        Calendar calendar2 = calendar != null ? (Calendar) calendar.clone() : null;
        q6i0 a = calendar2 == null ? q6i0.a(q6i0Var, null, SelectionMode.END_DATE, (Calendar) selectedDate.clone(), null, 9) : kdb1.h(selectedDate, calendar2) ? q6i0.a(q6i0Var, null, SelectionMode.END_DATE, (Calendar) selectedDate.clone(), null, 1) : q6i0.a(q6i0Var, null, SelectionMode.END_DATE, (Calendar) selectedDate.clone(), null, 9);
        tls tlsVar = this.onStateChangedListener;
        if (tlsVar != null) {
            tlsVar.invoke(a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDaySelected(Calendar date) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = this.state.a;
        if (kdb1.h(date, calendar)) {
            return;
        }
        if (!kdb1.i(date, calendar2) || kdb1.j(date, calendar2)) {
            int i = r6i0.a[this.state.b.ordinal()];
            if (i == 1) {
                handleStartDateSelection(date);
            } else if (i == 2) {
                handleEndDateSelection(date);
            } else {
                w511.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMonthHeaderClicked(pf7 month) {
        Calendar calendar;
        tls tlsVar;
        Calendar calendar2 = month.d;
        if (calendar2 == null || (calendar = month.e) == null || (tlsVar = this.onStateChangedListener) == null) {
            return;
        }
        tlsVar.invoke(q6i0.a(this.state, null, SelectionMode.START_DATE, calendar2, calendar, 1));
    }

    private final void scrollToBottomOnCreation(int lastItemIndex) {
        RecyclerView recyclerView = this.binding.b;
        recyclerView.post(new hl7(recyclerView, lastItemIndex, 4));
    }

    private final void setupRecyclerView() {
        RecyclerView recyclerView = this.binding.b;
        recyclerView.setLayoutManager(this.calendarLayoutManager);
        recyclerView.setAdapter(this.calendarAdapter);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new lf7(this.calendarAdapter));
        b.q(recyclerView, new ff7());
    }

    public final void changeSelectionMode(SelectionMode newSelectionMode) {
        tls tlsVar = this.onStateChangedListener;
        if (tlsVar != null) {
            tlsVar.invoke(q6i0.a(this.state, null, newSelectionMode, null, null, 13));
        }
    }

    public final egq0 getSelectedDates() {
        q6i0 q6i0Var = this.state;
        return new egq0(q6i0Var.c, q6i0Var.d);
    }

    public final boolean hasValidDateRange() {
        q6i0 q6i0Var = this.state;
        return (q6i0Var.c == null || q6i0Var.d == null) ? false : true;
    }

    public final void render(q6i0 newState) {
        q6i0 q6i0Var = this.state;
        boolean k = kdb1.k(q6i0Var.c, newState.c);
        boolean k2 = kdb1.k(q6i0Var.d, newState.d);
        Calendar calendar = q6i0Var.a;
        Calendar calendar2 = newState.a;
        boolean j = kdb1.j(calendar, calendar2);
        if (!j) {
            RecyclerView recyclerView = this.binding.b;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams.height = calculateRecyclerHeight(calendar2);
                recyclerView.setLayoutParams(layoutParams);
            }
        }
        if (!k || !k2 || !j || this.calendarAdapter.b.f.isEmpty()) {
            List<kf7> generateMonths = generateMonths(newState);
            this.calendarAdapter.g(generateMonths);
            if (this.isFirstRender) {
                scrollToBottomOnCreation(scc.f(generateMonths));
                this.isFirstRender = false;
            }
        }
        this.state = newState;
    }

    public final void scrollToDate(Calendar date) {
        RecyclerView recyclerView = this.binding.b;
        recyclerView.post(new lz(20, recyclerView, date, this));
    }

    public final void setOnStateChangedListener(tls listener) {
        this.onStateChangedListener = listener;
    }

    public RangeDatePickerCalendarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RangeDatePickerCalendarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public RangeDatePickerCalendarView(Context context) {
        this(context, null, 0, 6, null);
    }
}
