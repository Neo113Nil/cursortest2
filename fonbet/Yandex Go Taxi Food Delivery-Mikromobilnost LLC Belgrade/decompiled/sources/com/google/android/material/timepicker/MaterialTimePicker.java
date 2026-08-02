package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.MaterialTimePicker;
import defpackage.eng0;
import defpackage.fbz;
import defpackage.fuz0;
import defpackage.fx00;
import defpackage.g2i0;
import defpackage.i810;
import defpackage.jvh0;
import defpackage.kog0;
import defpackage.kxh0;
import defpackage.leh0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.x6z0;
import defpackage.y6z0;
import defpackage.z2i0;
import defpackage.z610;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes11.dex */
public final class MaterialTimePicker extends DialogFragment implements y6z0 {
    public static final int INPUT_MODE_CLOCK = 0;
    static final String INPUT_MODE_EXTRA = "TIME_PICKER_INPUT_MODE";
    public static final int INPUT_MODE_KEYBOARD = 1;
    static final String NEGATIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    static final String NEGATIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    static final String OVERRIDE_THEME_RES_ID = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    static final String POSITIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    static final String POSITIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    static final String TIME_MODEL_EXTRA = "TIME_PICKER_TIME_MODEL";
    static final String TITLE_RES_EXTRA = "TIME_PICKER_TITLE_RES";
    static final String TITLE_TEXT_EXTRA = "TIME_PICKER_TITLE_TEXT";
    private x6z0 activePresenter;
    private Button cancelButton;
    private int clockIcon;
    private int keyboardIcon;
    private MaterialButton modeButton;
    private CharSequence negativeButtonText;
    private Button okButton;
    private CharSequence positiveButtonText;
    private ViewStub textInputStub;
    private TimeModel time;
    private f timePickerClockPresenter;
    private i timePickerTextInputPresenter;
    private TimePickerView timePickerView;
    private CharSequence titleText;
    private final Set<View.OnClickListener> positiveButtonListeners = new LinkedHashSet();
    private final Set<View.OnClickListener> negativeButtonListeners = new LinkedHashSet();
    private final Set<DialogInterface.OnCancelListener> cancelListeners = new LinkedHashSet();
    private final Set<DialogInterface.OnDismissListener> dismissListeners = new LinkedHashSet();
    private int titleResId = 0;
    private int positiveButtonTextResId = 0;
    private int negativeButtonTextResId = 0;
    private int inputMode = 0;
    private int overrideThemeResId = 0;

    public static final class a {
        public final TimeModel a = new TimeModel();
    }

    private i810 getModeButtonData(int i) {
        if (i == 0) {
            return new i810(this.keyboardIcon, kxh0.material_timepicker_text_input_mode_description, kxh0.material_timepicker_text_input_mode_tooltip);
        }
        if (i == 1) {
            return new i810(this.clockIcon, kxh0.material_timepicker_clock_mode_description, kxh0.material_timepicker_clock_mode_tooltip);
        }
        ny61.g(oyr.i(i, "no button data for mode: "));
        return null;
    }

    private int getThemeResId() {
        int i = this.overrideThemeResId;
        if (i != 0) {
            return i;
        }
        TypedValue a2 = z610.a(eng0.materialTimePickerTheme, requireContext());
        if (a2 == null) {
            return 0;
        }
        return a2.data;
    }

    private x6z0 initializeOrRetrieveActivePresenterForMode(int i, TimePickerView timePickerView, ViewStub viewStub) {
        if (i == 0) {
            f fVar = this.timePickerClockPresenter;
            if (fVar == null) {
                fVar = new f(timePickerView, this.time);
            }
            this.timePickerClockPresenter = fVar;
            return fVar;
        }
        if (this.timePickerTextInputPresenter == null) {
            this.timePickerTextInputPresenter = new i((LinearLayout) viewStub.inflate(), this.time);
        }
        i iVar = this.timePickerTextInputPresenter;
        iVar.d();
        iVar.c();
        i iVar2 = this.timePickerTextInputPresenter;
        iVar2.x.setChecked(false);
        iVar2.y.setChecked(false);
        return this.timePickerTextInputPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCreateView$0(ViewGroup viewGroup, View view) {
        x6z0 x6z0Var = this.activePresenter;
        if (x6z0Var instanceof i) {
            i iVar = (i) x6z0Var;
            ChipTextInputComboView chipTextInputComboView = iVar.x;
            ChipTextInputComboView chipTextInputComboView2 = iVar.y;
            if (chipTextInputComboView.hasError() || chipTextInputComboView2.hasError()) {
                i.g(viewGroup);
                if (chipTextInputComboView2.hasError()) {
                    TextView textView = iVar.C;
                    chipTextInputComboView2.requestAccessibilityFocus();
                    textView.announceForAccessibility(textView.getText());
                    return;
                } else {
                    if (chipTextInputComboView.hasError()) {
                        TextView textView2 = iVar.B;
                        chipTextInputComboView.requestAccessibilityFocus();
                        textView2.announceForAccessibility(textView2.getText());
                        return;
                    }
                    return;
                }
            }
        }
        Iterator<View.OnClickListener> it = this.positiveButtonListeners.iterator();
        while (it.hasNext()) {
            it.next().onClick(view);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(View view) {
        Iterator<View.OnClickListener> it = this.negativeButtonListeners.iterator();
        while (it.hasNext()) {
            it.next().onClick(view);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$2(View view) {
        this.inputMode = this.inputMode == 0 ? 1 : 0;
        updateInputMode(this.modeButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$3() {
        x6z0 x6z0Var = this.activePresenter;
        if (x6z0Var instanceof i) {
            ((i) x6z0Var).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaterialTimePicker newInstance(a aVar) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable(TIME_MODEL_EXTRA, aVar.a);
        bundle.putInt(TITLE_RES_EXTRA, 0);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, 0);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, 0);
        bundle.putInt(OVERRIDE_THEME_RES_ID, 0);
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    private void restoreState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable(TIME_MODEL_EXTRA);
        this.time = timeModel;
        if (timeModel == null) {
            this.time = new TimeModel();
        }
        int i = 1;
        if (!getResources().getBoolean(kog0.timepicker_force_input_mode_keyboard) && this.time.format != 1) {
            i = 0;
        }
        this.inputMode = bundle.getInt(INPUT_MODE_EXTRA, i);
        this.titleResId = bundle.getInt(TITLE_RES_EXTRA, 0);
        this.titleText = bundle.getCharSequence(TITLE_TEXT_EXTRA);
        this.positiveButtonTextResId = bundle.getInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, 0);
        this.positiveButtonText = bundle.getCharSequence(POSITIVE_BUTTON_TEXT_EXTRA);
        this.negativeButtonTextResId = bundle.getInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, 0);
        this.negativeButtonText = bundle.getCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA);
        this.overrideThemeResId = bundle.getInt(OVERRIDE_THEME_RES_ID, 0);
    }

    private void updateCancelButtonVisibility() {
        Button button = this.cancelButton;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    private void updateInputMode(MaterialButton materialButton) {
        if (materialButton == null || this.timePickerView == null || this.textInputStub == null) {
            return;
        }
        x6z0 x6z0Var = this.activePresenter;
        if (x6z0Var != null) {
            x6z0Var.hide();
        }
        x6z0 initializeOrRetrieveActivePresenterForMode = initializeOrRetrieveActivePresenterForMode(this.inputMode, this.timePickerView, this.textInputStub);
        this.activePresenter = initializeOrRetrieveActivePresenterForMode;
        initializeOrRetrieveActivePresenterForMode.show();
        this.activePresenter.invalidate();
        i810 modeButtonData = getModeButtonData(this.inputMode);
        materialButton.setIconResource(modeButtonData.a);
        materialButton.setContentDescription(getResources().getString(modeButtonData.b));
        fuz0.a(materialButton, getResources().getString(modeButtonData.c));
        materialButton.sendAccessibilityEvent(4);
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.cancelListeners.clear();
    }

    public void clearOnDismissListeners() {
        this.dismissListeners.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.negativeButtonListeners.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.positiveButtonListeners.clear();
    }

    public int getHour() {
        return this.time.hour % 24;
    }

    public int getInputMode() {
        return this.inputMode;
    }

    public int getMinute() {
        return this.time.minute;
    }

    public f getTimePickerClockPresenter() {
        return this.timePickerClockPresenter;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.cancelListeners.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        restoreState(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), getThemeResId());
        Context context = dialog.getContext();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, eng0.materialTimePickerStyle, g2i0.Widget_MaterialComponents_TimePicker);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, z2i0.MaterialTimePicker, eng0.materialTimePickerStyle, g2i0.Widget_MaterialComponents_TimePicker);
        this.clockIcon = obtainStyledAttributes.getResourceId(z2i0.MaterialTimePicker_clockIcon, 0);
        this.keyboardIcon = obtainStyledAttributes.getResourceId(z2i0.MaterialTimePicker_keyboardIcon, 0);
        int color = obtainStyledAttributes.getColor(z2i0.MaterialTimePicker_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.setElevation(window.getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(jvh0.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(leh0.material_timepicker_view);
        this.timePickerView = timePickerView;
        timePickerView.setOnDoubleTapListener(this);
        this.textInputStub = (ViewStub) viewGroup2.findViewById(leh0.material_textinput_timepicker);
        this.modeButton = (MaterialButton) viewGroup2.findViewById(leh0.material_timepicker_mode_button);
        this.okButton = (Button) viewGroup2.findViewById(leh0.material_timepicker_ok_button);
        this.cancelButton = (Button) viewGroup2.findViewById(leh0.material_timepicker_cancel_button);
        TextView textView = (TextView) viewGroup2.findViewById(leh0.header_title);
        int i = this.titleResId;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.titleText)) {
            textView.setText(this.titleText);
        }
        updateInputMode(this.modeButton);
        this.okButton.setOnClickListener(new fx00(2, this, viewGroup2));
        int i2 = this.positiveButtonTextResId;
        if (i2 != 0) {
            this.okButton.setText(i2);
        } else if (!TextUtils.isEmpty(this.positiveButtonText)) {
            this.okButton.setText(this.positiveButtonText);
        }
        final int i3 = 0;
        this.cancelButton.setOnClickListener(new View.OnClickListener(this) { // from class: h810
            public final /* synthetic */ MaterialTimePicker b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                MaterialTimePicker materialTimePicker = this.b;
                switch (i4) {
                    case 0:
                        materialTimePicker.lambda$onCreateView$1(view);
                        break;
                    default:
                        materialTimePicker.lambda$onCreateView$2(view);
                        break;
                }
            }
        });
        int i4 = this.negativeButtonTextResId;
        if (i4 != 0) {
            this.cancelButton.setText(i4);
        } else if (!TextUtils.isEmpty(this.negativeButtonText)) {
            this.cancelButton.setText(this.negativeButtonText);
        }
        updateCancelButtonVisibility();
        final int i5 = 1;
        this.modeButton.setOnClickListener(new View.OnClickListener(this) { // from class: h810
            public final /* synthetic */ MaterialTimePicker b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                MaterialTimePicker materialTimePicker = this.b;
                switch (i42) {
                    case 0:
                        materialTimePicker.lambda$onCreateView$1(view);
                        break;
                    default:
                        materialTimePicker.lambda$onCreateView$2(view);
                        break;
                }
            }
        });
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.activePresenter = null;
        this.timePickerClockPresenter = null;
        this.timePickerTextInputPresenter = null;
        TimePickerView timePickerView = this.timePickerView;
        if (timePickerView != null) {
            timePickerView.setOnDoubleTapListener(null);
            this.timePickerView = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.dismissListeners.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.y6z0
    public void onDoubleTap() {
        this.inputMode = 1;
        updateInputMode(this.modeButton);
        this.timePickerTextInputPresenter.e();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(TIME_MODEL_EXTRA, this.time);
        bundle.putInt(INPUT_MODE_EXTRA, this.inputMode);
        bundle.putInt(TITLE_RES_EXTRA, this.titleResId);
        bundle.putCharSequence(TITLE_TEXT_EXTRA, this.titleText);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, this.positiveButtonTextResId);
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_EXTRA, this.positiveButtonText);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, this.negativeButtonTextResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA, this.negativeButtonText);
        bundle.putInt(OVERRIDE_THEME_RES_ID, this.overrideThemeResId);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.activePresenter instanceof i) {
            view.postDelayed(new fbz(20, this), 100L);
        }
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.remove(onClickListener);
    }

    public void setActivePresenter(x6z0 x6z0Var) {
        this.activePresenter = x6z0Var;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        updateCancelButtonVisibility();
    }

    public void setHour(int i) {
        this.time.setHourOfDay(i);
        x6z0 x6z0Var = this.activePresenter;
        if (x6z0Var != null) {
            x6z0Var.invalidate();
        }
    }

    public void setMinute(int i) {
        this.time.setMinute(i);
        x6z0 x6z0Var = this.activePresenter;
        if (x6z0Var != null) {
            x6z0Var.invalidate();
        }
    }
}
