package com.ybsdk.feature.pfm.internal.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.date.YbDateFormat;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pfm.internal.ui.widgets.PFMCalendarView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.rangedatepicker.RangeDatePickerCalendarView;
import com.ybsdk.widgets.common.rangedatepicker.SelectionMode;
import defpackage.a461;
import defpackage.cma1;
import defpackage.dzh0;
import defpackage.jl40;
import defpackage.kdb1;
import defpackage.lbh0;
import defpackage.njb;
import defpackage.ny61;
import defpackage.nyg0;
import defpackage.q6i0;
import defpackage.sls;
import defpackage.th40;
import defpackage.tls;
import defpackage.unh0;
import defpackage.vng;
import defpackage.w390;
import defpackage.x390;
import defpackage.y390;
import defpackage.yxy;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0002<\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f*\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001f\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0015J!\u0010%\u001a\u00020\f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0\"¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/ybsdk/feature/pfm/internal/ui/widgets/PFMCalendarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/rangedatepicker/SelectionMode;", "newSelectionMode", "Lzy11;", "updateFieldsVisualState", "(Lcom/ybsdk/widgets/common/rangedatepicker/SelectionMode;)V", "Lcom/ybsdk/widgets/common/LoadableInput;", "Lkotlin/Function0;", "action", "setOnWholeViewClickListener", "(Lcom/ybsdk/widgets/common/LoadableInput;Lsls;)V", "setupInputClickListeners", "()V", "Ly390;", "oldState", "newState", "renderChangedOnlyInputs", "(Ly390;Ly390;)V", "Lcom/ybsdk/core/utils/text/Text;", "label", "Ljava/util/Calendar;", MetaDataField.DATE_FIELD, "render", "(Lcom/ybsdk/widgets/common/LoadableInput;Lcom/ybsdk/core/utils/text/Text;Ljava/util/Calendar;)V", "initDateInputs", "Lkotlin/Function1;", "Lq6i0;", "listener", "setOnRangePickerStateChangedListener", "(Ltls;)V", "scrollToStartDate", "(Ljava/util/Calendar;)V", "", "hasValidRangeDate", "()Z", "(Ly390;)V", "La461;", "binding", "La461;", "startDateTextView", "Lcom/ybsdk/widgets/common/LoadableInput;", "endDateTextView", "Lcom/ybsdk/widgets/common/rangedatepicker/RangeDatePickerCalendarView;", "calendar", "Lcom/ybsdk/widgets/common/rangedatepicker/RangeDatePickerCalendarView;", ClidProvider.STATE, "Ly390;", "Ljava/util/Locale;", "locale", "Ljava/util/Locale;", "Companion", "x390", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PFMCalendarView extends ConstraintLayout {
    private final a461 binding;
    private final RangeDatePickerCalendarView calendar;
    private final LoadableInput endDateTextView;
    private final Locale locale;
    private final LoadableInput startDateTextView;
    private y390 state;
    private static final x390 Companion = new x390();
    private static final int SELECTED_INPUT_BACKGROUND = nyg0.ybsdk_background_loadable_input_selected;
    private static final int DEFAULT_INPUT_BACKGROUND = nyg0.ybsdk_background_edit_text;

    public PFMCalendarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(unh0.ybsdk_pfm_calendar_view, this);
        int i2 = lbh0.endDate;
        LoadableInput loadableInput = (LoadableInput) cma1.O(i2, this);
        if (loadableInput != null) {
            i2 = lbh0.inputs;
            if (((LinearLayout) cma1.O(i2, this)) != null) {
                i2 = lbh0.startDate;
                LoadableInput loadableInput2 = (LoadableInput) cma1.O(i2, this);
                if (loadableInput2 != null) {
                    i2 = lbh0.verticalCalendar;
                    RangeDatePickerCalendarView rangeDatePickerCalendarView = (RangeDatePickerCalendarView) cma1.O(i2, this);
                    if (rangeDatePickerCalendarView != null) {
                        this.binding = new a461(this, loadableInput, loadableInput2, rangeDatePickerCalendarView);
                        this.startDateTextView = loadableInput2;
                        this.endDateTextView = loadableInput;
                        this.calendar = rangeDatePickerCalendarView;
                        this.state = y390.g;
                        this.locale = new Locale(context.getApplicationContext().getString(dzh0.ybsdk_ui_language));
                        initDateInputs();
                        setupInputClickListeners();
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void initDateInputs() {
        final int i = 0;
        LoadableInput.render$default(this.startDateTextView, false, new tls(this) { // from class: v390
            public final /* synthetic */ PFMCalendarView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                g initDateInputs$lambda$6;
                g initDateInputs$lambda$7;
                int i2 = i;
                PFMCalendarView pFMCalendarView = this.b;
                g gVar = (g) obj;
                switch (i2) {
                    case 0:
                        initDateInputs$lambda$6 = PFMCalendarView.initDateInputs$lambda$6(pFMCalendarView, gVar);
                        return initDateInputs$lambda$6;
                    default:
                        initDateInputs$lambda$7 = PFMCalendarView.initDateInputs$lambda$7(pFMCalendarView, gVar);
                        return initDateInputs$lambda$7;
                }
            }
        }, 1, null);
        final int i2 = 1;
        LoadableInput.render$default(this.endDateTextView, false, new tls(this) { // from class: v390
            public final /* synthetic */ PFMCalendarView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                g initDateInputs$lambda$6;
                g initDateInputs$lambda$7;
                int i22 = i2;
                PFMCalendarView pFMCalendarView = this.b;
                g gVar = (g) obj;
                switch (i22) {
                    case 0:
                        initDateInputs$lambda$6 = PFMCalendarView.initDateInputs$lambda$6(pFMCalendarView, gVar);
                        return initDateInputs$lambda$6;
                    default:
                        initDateInputs$lambda$7 = PFMCalendarView.initDateInputs$lambda$7(pFMCalendarView, gVar);
                        return initDateInputs$lambda$7;
                }
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g initDateInputs$lambda$6(PFMCalendarView pFMCalendarView, g gVar) {
        return g.a(gVar, null, yxy.a, false, null, pFMCalendarView.state.a, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554409);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g initDateInputs$lambda$7(PFMCalendarView pFMCalendarView, g gVar) {
        return g.a(gVar, null, yxy.a, false, null, pFMCalendarView.state.b, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554409);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$5(Calendar calendar, PFMCalendarView pFMCalendarView, Text text, g gVar) {
        String str;
        if (calendar != null) {
            Locale locale = pFMCalendarView.locale;
            String pattern = YbDateFormat.SHORT_USER_DATE_ONLY.getPattern();
            if (locale == null) {
                locale = Locale.getDefault();
            }
            str = new SimpleDateFormat(pattern, locale).format(calendar.getTime());
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return g.a(gVar, str, null, false, null, text, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554414);
    }

    private final void renderChangedOnlyInputs(y390 oldState, y390 newState) {
        q6i0 q6i0Var = oldState.c;
        q6i0 q6i0Var2 = newState.c;
        Text text = newState.b;
        q6i0 q6i0Var3 = newState.c;
        Text text2 = oldState.a;
        Text text3 = newState.a;
        if (!jl40.l(text2, text3) || !kdb1.k(q6i0Var.c, q6i0Var2.c)) {
            render(this.startDateTextView, text3, q6i0Var3.c);
        }
        if (!jl40.l(oldState.b, text) || !kdb1.k(q6i0Var.d, q6i0Var2.d)) {
            render(this.endDateTextView, text, q6i0Var3.d);
        }
        updateFieldsVisualState(q6i0Var3.b);
    }

    private final void setOnWholeViewClickListener(LoadableInput loadableInput, sls slsVar) {
        loadableInput.setOnClickListener(new njb(15, slsVar));
        loadableInput.getEditText().setOnClickListener(new njb(16, slsVar));
        loadableInput.getEditTextLayout().setOnClickListener(new njb(17, slsVar));
    }

    private final void setupInputClickListeners() {
        setOnWholeViewClickListener(this.startDateTextView, new w390(this, 0));
        setOnWholeViewClickListener(this.endDateTextView, new w390(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInputClickListeners$lambda$3(PFMCalendarView pFMCalendarView) {
        pFMCalendarView.calendar.changeSelectionMode(SelectionMode.START_DATE);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInputClickListeners$lambda$4(PFMCalendarView pFMCalendarView) {
        pFMCalendarView.calendar.changeSelectionMode(SelectionMode.END_DATE);
        return zy11.a;
    }

    private final void updateFieldsVisualState(SelectionMode newSelectionMode) {
        boolean z = newSelectionMode == SelectionMode.START_DATE;
        boolean z2 = newSelectionMode == SelectionMode.END_DATE;
        this.startDateTextView.setSelected(z);
        this.endDateTextView.setSelected(z2);
        this.startDateTextView.getEditTextLayout().setBackground(vng.t(z ? SELECTED_INPUT_BACKGROUND : DEFAULT_INPUT_BACKGROUND, getContext()));
        this.endDateTextView.getEditTextLayout().setBackground(vng.t(z2 ? SELECTED_INPUT_BACKGROUND : DEFAULT_INPUT_BACKGROUND, getContext()));
    }

    public final boolean hasValidRangeDate() {
        return this.calendar.hasValidDateRange();
    }

    public final void render(y390 newState) {
        y390 y390Var = this.state;
        if (jl40.l(y390Var, newState)) {
            return;
        }
        renderChangedOnlyInputs(y390Var, newState);
        this.calendar.render(newState.c);
        this.state = newState;
    }

    public final void scrollToStartDate(Calendar date) {
        this.calendar.scrollToDate(date);
    }

    public final void setOnRangePickerStateChangedListener(tls listener) {
        this.calendar.setOnStateChangedListener(listener);
    }

    private final void render(LoadableInput loadableInput, Text text, Calendar calendar) {
        LoadableInput.render$default(loadableInput, false, new th40(8, calendar, this, text), 1, null);
    }

    public /* synthetic */ PFMCalendarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
