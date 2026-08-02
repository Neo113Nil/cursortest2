package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.cxg0;
import defpackage.eng0;
import defpackage.fuz0;
import defpackage.g2i0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jvh0;
import defpackage.kxh0;
import defpackage.leh0;
import defpackage.ny61;
import defpackage.o751;
import defpackage.org0;
import defpackage.p751;
import defpackage.q5z;
import defpackage.q751;
import defpackage.u710;
import defpackage.v710;
import defpackage.va90;
import defpackage.vez0;
import defpackage.vng;
import defpackage.w710;
import defpackage.yv21;
import defpackage.z2i0;
import defpackage.z610;
import defpackage.zi6;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public class MaterialDatePicker<S> extends DialogFragment {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CALENDAR_FRAGMENT_TAG = "CALENDAR_FRAGMENT_TAG";
    private static final String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    public static final int INPUT_MODE_CALENDAR = 0;
    private static final String INPUT_MODE_KEY = "INPUT_MODE_KEY";
    public static final int INPUT_MODE_TEXT = 1;
    private static final String NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final String NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT_KEY";
    private static final String NEGATIVE_BUTTON_TEXT_RES_ID_KEY = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String OVERRIDE_THEME_RES_ID = "OVERRIDE_THEME_RES_ID";
    private static final String POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final String POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT_KEY";
    private static final String POSITIVE_BUTTON_TEXT_RES_ID_KEY = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String TEXT_INPUT_FRAGMENT_TAG = "TEXT_INPUT_FRAGMENT_TAG";
    private static final String TITLE_TEXT_KEY = "TITLE_TEXT_KEY";
    private static final String TITLE_TEXT_RES_ID_KEY = "TITLE_TEXT_RES_ID_KEY";
    private MaterialShapeDrawable background;
    private MaterialCalendar<S> calendar;
    private CalendarConstraints calendarConstraints;
    private Button confirmButton;
    private DateSelector<S> dateSelector;
    private DayViewDecorator dayViewDecorator;
    private boolean edgeToEdgeEnabled;
    private CharSequence fullTitleText;
    private boolean fullscreen;
    private TextView headerSelectionText;
    private TextView headerTitleTextView;
    private CheckableImageButton headerToggleButton;
    private int inputMode;
    private CharSequence negativeButtonContentDescription;
    private int negativeButtonContentDescriptionResId;
    private CharSequence negativeButtonText;
    private int negativeButtonTextResId;
    private int overrideThemeResId;
    private PickerFragment<S> pickerFragment;
    private CharSequence positiveButtonContentDescription;
    private int positiveButtonContentDescriptionResId;
    private CharSequence positiveButtonText;
    private int positiveButtonTextResId;
    private CharSequence singleLineTitleText;
    private CharSequence titleText;
    private int titleTextResId;
    static final Object CONFIRM_BUTTON_TAG = "CONFIRM_BUTTON_TAG";
    static final Object CANCEL_BUTTON_TAG = "CANCEL_BUTTON_TAG";
    static final Object TOGGLE_BUTTON_TAG = "TOGGLE_BUTTON_TAG";
    private final LinkedHashSet<w710> onPositiveButtonClickListeners = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> onNegativeButtonClickListeners = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> onCancelListeners = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> onDismissListeners = new LinkedHashSet<>();

    private static Drawable createHeaderToggleDrawable(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, vng.t(cxg0.material_ic_calendar_black_24dp, context));
        stateListDrawable.addState(new int[0], vng.t(cxg0.material_ic_edit_black_24dp, context));
        return stateListDrawable;
    }

    private void enableEdgeToEdgeIfNeeded(Window window) {
        if (this.edgeToEdgeEnabled) {
            return;
        }
        View findViewById = requireView().findViewById(leh0.fullscreen_header);
        ColorStateList y = q5z.y(findViewById.getBackground());
        Integer valueOf = y != null ? Integer.valueOf(y.getDefaultColor()) : null;
        boolean z = valueOf == null || valueOf.intValue() == 0;
        int x = vez0.x(window.getContext(), R.attr.colorBackground, ModalContentViewContainer.BASE_SHADOW_COLOR);
        if (z) {
            valueOf = Integer.valueOf(x);
        }
        jl40.L(window, false);
        window.getContext();
        window.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            window.setStatusBarColor(0);
        }
        if (i < 35) {
            window.setNavigationBarColor(0);
        }
        boolean z2 = vez0.F(0) || vez0.F(valueOf.intValue());
        va90 va90Var = new va90(window.getDecorView());
        (i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var)).U(z2);
        boolean z3 = vez0.F(0) || vez0.F(x);
        va90 va90Var2 = new va90(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 35 ? new q751(window, va90Var2) : i2 >= 30 ? new p751(window, va90Var2) : new o751(window, va90Var2)).T(z3);
        zi6 zi6Var = new zi6(findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(findViewById, zi6Var);
        this.edgeToEdgeEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector<S> getDateSelector() {
        if (this.dateSelector == null) {
            this.dateSelector = (DateSelector) getArguments().getParcelable(DATE_SELECTOR_KEY);
        }
        return this.dateSelector;
    }

    private static CharSequence getFirstLineBySeparator(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    private String getHeaderContentDescription() {
        return getDateSelector().getSelectionContentDescription(requireContext());
    }

    private static int getPaddedPickerWidth(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(org0.mtrl_calendar_content_padding);
        int i = Month.current().daysInWeek;
        return g8e.d(i, 1, resources.getDimensionPixelOffset(org0.mtrl_calendar_month_horizontal_padding), (resources.getDimensionPixelSize(org0.mtrl_calendar_day_width) * i) + (dimensionPixelOffset * 2));
    }

    private int getThemeResId(Context context) {
        int i = this.overrideThemeResId;
        return i != 0 ? i : getDateSelector().getDefaultThemeResId(context);
    }

    private void initHeaderToggle(Context context) {
        this.headerToggleButton.setTag(TOGGLE_BUTTON_TAG);
        this.headerToggleButton.setImageDrawable(createHeaderToggleDrawable(context));
        this.headerToggleButton.setChecked(this.inputMode != 0);
        androidx.core.view.b.p(this.headerToggleButton, null);
        updateToggleContentDescription(this.headerToggleButton);
        updateToggleTooltip(this.headerToggleButton);
        this.headerToggleButton.setOnClickListener(new u710(this, 0));
    }

    public static boolean isFullscreen(Context context) {
        return readMaterialCalendarStyleBoolean(context, R.attr.windowFullscreen);
    }

    private boolean isLandscape() {
        return getResources().getConfiguration().orientation == 2;
    }

    public static boolean isNestedScrollable(Context context) {
        return readMaterialCalendarStyleBoolean(context, eng0.nestedScrollable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initHeaderToggle$0(View view) {
        this.confirmButton.setEnabled(getDateSelector().isSelectionComplete());
        this.headerToggleButton.toggle();
        this.inputMode = this.inputMode == 1 ? 0 : 1;
        updateToggleContentDescription(this.headerToggleButton);
        updateToggleTooltip(this.headerToggleButton);
        startPickerFragment();
    }

    public static <S> MaterialDatePicker<S> newInstance(j jVar) {
        new MaterialDatePicker();
        new Bundle();
        throw null;
    }

    public static boolean readMaterialCalendarStyleBoolean(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z610.f(context, eng0.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    private void startPickerFragment() {
        int themeResId = getThemeResId(requireContext());
        String str = this.inputMode == 1 ? TEXT_INPUT_FRAGMENT_TAG : CALENDAR_FRAGMENT_TAG;
        Fragment F = getChildFragmentManager().F(str);
        MaterialCalendar<S> materialCalendar = F instanceof PickerFragment ? (PickerFragment<S>) ((PickerFragment) F) : null;
        if (materialCalendar == null) {
            if (this.inputMode == 1) {
                materialCalendar = MaterialTextInputPicker.newInstance(getDateSelector(), themeResId, this.calendarConstraints);
            } else {
                materialCalendar = MaterialCalendar.newInstance(getDateSelector(), themeResId, this.calendarConstraints, this.dayViewDecorator);
                this.calendar = materialCalendar;
            }
        }
        this.pickerFragment = materialCalendar;
        materialCalendar.addOnSelectionChangedListener(new v710(this));
        updateTitle();
        updateHeader(getHeaderText());
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.h(leh0.mtrl_calendar_frame, this.pickerFragment, str);
        aVar.m();
    }

    public static long thisMonthInUtcMilliseconds() {
        return Month.current().timeInMillis;
    }

    public static long todayInUtcMilliseconds() {
        return yv21.f().getTimeInMillis();
    }

    private void updateTitle() {
        this.headerTitleTextView.setText((this.inputMode == 1 && isLandscape()) ? this.singleLineTitleText : this.fullTitleText);
    }

    private void updateToggleContentDescription(CheckableImageButton checkableImageButton) {
        this.headerToggleButton.setContentDescription(this.inputMode == 1 ? checkableImageButton.getContext().getString(kxh0.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(kxh0.mtrl_picker_toggle_to_text_input_mode));
    }

    private void updateToggleTooltip(CheckableImageButton checkableImageButton) {
        fuz0.a(this.headerToggleButton, this.inputMode == 1 ? checkableImageButton.getContext().getString(kxh0.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton.getContext().getString(kxh0.mtrl_picker_toggle_to_text_input_mode_tooltip));
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.onCancelListeners.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.onDismissListeners.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.onNegativeButtonClickListeners.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(w710 w710Var) {
        return this.onPositiveButtonClickListeners.add(w710Var);
    }

    public void clearOnCancelListeners() {
        this.onCancelListeners.clear();
    }

    public void clearOnDismissListeners() {
        this.onDismissListeners.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.onNegativeButtonClickListeners.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.onPositiveButtonClickListeners.clear();
    }

    public String getHeaderText() {
        return getDateSelector().getSelectionDisplayString(getContext());
    }

    public int getInputMode() {
        return this.inputMode;
    }

    public final S getSelection() {
        return getDateSelector().getSelection();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.onCancelListeners.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.overrideThemeResId = bundle.getInt(OVERRIDE_THEME_RES_ID);
        this.dateSelector = (DateSelector) bundle.getParcelable(DATE_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.dayViewDecorator = (DayViewDecorator) bundle.getParcelable(DAY_VIEW_DECORATOR_KEY);
        this.titleTextResId = bundle.getInt(TITLE_TEXT_RES_ID_KEY);
        this.titleText = bundle.getCharSequence(TITLE_TEXT_KEY);
        this.inputMode = bundle.getInt(INPUT_MODE_KEY);
        this.positiveButtonTextResId = bundle.getInt(POSITIVE_BUTTON_TEXT_RES_ID_KEY);
        this.positiveButtonText = bundle.getCharSequence(POSITIVE_BUTTON_TEXT_KEY);
        this.positiveButtonContentDescriptionResId = bundle.getInt(POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY);
        this.positiveButtonContentDescription = bundle.getCharSequence(POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY);
        this.negativeButtonTextResId = bundle.getInt(NEGATIVE_BUTTON_TEXT_RES_ID_KEY);
        this.negativeButtonText = bundle.getCharSequence(NEGATIVE_BUTTON_TEXT_KEY);
        this.negativeButtonContentDescriptionResId = bundle.getInt(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY);
        this.negativeButtonContentDescription = bundle.getCharSequence(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY);
        CharSequence charSequence = this.titleText;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.titleTextResId);
        }
        this.fullTitleText = charSequence;
        this.singleLineTitleText = getFirstLineBySeparator(charSequence);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), getThemeResId(requireContext()));
        Context context = dialog.getContext();
        this.fullscreen = isFullscreen(context);
        this.background = new MaterialShapeDrawable(context, null, eng0.materialCalendarStyle, g2i0.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, z2i0.MaterialCalendar, eng0.materialCalendarStyle, g2i0.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(z2i0.MaterialCalendar_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        this.background.initializeElevationOverlay(context);
        this.background.setFillColor(ColorStateList.valueOf(color));
        this.background.setElevation(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.fullscreen ? jvh0.mtrl_picker_fullscreen : jvh0.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator != null) {
            dayViewDecorator.initialize(context);
        }
        if (this.fullscreen) {
            inflate.findViewById(leh0.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(getPaddedPickerWidth(context), -2));
        } else {
            inflate.findViewById(leh0.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(getPaddedPickerWidth(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(leh0.mtrl_picker_header_selection_text);
        this.headerSelectionText = textView;
        int i = 1;
        textView.setAccessibilityLiveRegion(1);
        this.headerToggleButton = (CheckableImageButton) inflate.findViewById(leh0.mtrl_picker_header_toggle);
        this.headerTitleTextView = (TextView) inflate.findViewById(leh0.mtrl_picker_title_text);
        initHeaderToggle(context);
        this.confirmButton = (Button) inflate.findViewById(leh0.confirm_button);
        boolean isSelectionComplete = getDateSelector().isSelectionComplete();
        Button button = this.confirmButton;
        if (isSelectionComplete) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.confirmButton.setTag(CONFIRM_BUTTON_TAG);
        CharSequence charSequence = this.positiveButtonText;
        if (charSequence != null) {
            this.confirmButton.setText(charSequence);
        } else {
            int i2 = this.positiveButtonTextResId;
            if (i2 != 0) {
                this.confirmButton.setText(i2);
            }
        }
        CharSequence charSequence2 = this.positiveButtonContentDescription;
        if (charSequence2 != null) {
            this.confirmButton.setContentDescription(charSequence2);
        } else if (this.positiveButtonContentDescriptionResId != 0) {
            this.confirmButton.setContentDescription(getContext().getResources().getText(this.positiveButtonContentDescriptionResId));
        }
        this.confirmButton.setOnClickListener(new u710(this, i));
        Button button2 = (Button) inflate.findViewById(leh0.cancel_button);
        button2.setTag(CANCEL_BUTTON_TAG);
        CharSequence charSequence3 = this.negativeButtonText;
        if (charSequence3 != null) {
            button2.setText(charSequence3);
        } else {
            int i3 = this.negativeButtonTextResId;
            if (i3 != 0) {
                button2.setText(i3);
            }
        }
        CharSequence charSequence4 = this.negativeButtonContentDescription;
        if (charSequence4 != null) {
            button2.setContentDescription(charSequence4);
        } else if (this.negativeButtonContentDescriptionResId != 0) {
            button2.setContentDescription(getContext().getResources().getText(this.negativeButtonContentDescriptionResId));
        }
        button2.setOnClickListener(new u710(this, 2));
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.onDismissListeners.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public void onNegativeButtonClick(View view) {
        Iterator<View.OnClickListener> it = this.onNegativeButtonClickListeners.iterator();
        while (it.hasNext()) {
            it.next().onClick(view);
        }
        dismiss();
    }

    public void onPositiveButtonClick(View view) {
        Iterator<w710> it = this.onPositiveButtonClickListeners.iterator();
        if (!it.hasNext()) {
            dismiss();
        } else if (it.next() != null) {
            ny61.u();
        } else {
            getSelection();
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        Month month;
        Month month2;
        Month month3;
        int i;
        CalendarConstraints.DateValidator dateValidator;
        super.onSaveInstanceState(bundle);
        bundle.putInt(OVERRIDE_THEME_RES_ID, this.overrideThemeResId);
        bundle.putParcelable(DATE_SELECTOR_KEY, this.dateSelector);
        CalendarConstraints calendarConstraints = this.calendarConstraints;
        CalendarConstraints.a aVar = new CalendarConstraints.a();
        aVar.b = DateValidatorPointForward.from(Long.MIN_VALUE);
        month = calendarConstraints.start;
        long j = month.timeInMillis;
        month2 = calendarConstraints.end;
        long j2 = month2.timeInMillis;
        month3 = calendarConstraints.openAt;
        aVar.a = Long.valueOf(month3.timeInMillis);
        i = calendarConstraints.firstDayOfWeek;
        dateValidator = calendarConstraints.validator;
        aVar.b = dateValidator;
        MaterialCalendar<S> materialCalendar = this.calendar;
        Month currentMonth = materialCalendar == null ? null : materialCalendar.getCurrentMonth();
        if (currentMonth != null) {
            aVar.a = Long.valueOf(currentMonth.timeInMillis);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dateValidator);
        Month create = Month.create(j);
        Month create2 = Month.create(j2);
        CalendarConstraints.DateValidator dateValidator2 = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = aVar.a;
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, new CalendarConstraints(create, create2, dateValidator2, l == null ? null : Month.create(l.longValue()), i));
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, this.dayViewDecorator);
        bundle.putInt(TITLE_TEXT_RES_ID_KEY, this.titleTextResId);
        bundle.putCharSequence(TITLE_TEXT_KEY, this.titleText);
        bundle.putInt(INPUT_MODE_KEY, this.inputMode);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_ID_KEY, this.positiveButtonTextResId);
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_KEY, this.positiveButtonText);
        bundle.putInt(POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY, this.positiveButtonContentDescriptionResId);
        bundle.putCharSequence(POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY, this.positiveButtonContentDescription);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_ID_KEY, this.negativeButtonTextResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_KEY, this.negativeButtonText);
        bundle.putInt(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY, this.negativeButtonContentDescriptionResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY, this.negativeButtonContentDescription);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.fullscreen) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.background);
            enableEdgeToEdgeIfNeeded(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(org0.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.background, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        startPickerFragment();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.pickerFragment.clearOnSelectionChangedListeners();
        super.onStop();
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.onCancelListeners.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.onDismissListeners.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.onNegativeButtonClickListeners.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(w710 w710Var) {
        return this.onPositiveButtonClickListeners.remove(w710Var);
    }

    public void updateHeader(String str) {
        this.headerSelectionText.setContentDescription(getHeaderContentDescription());
        this.headerSelectionText.setText(str);
    }
}
