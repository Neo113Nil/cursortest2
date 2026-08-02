package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.media.AudioManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import defpackage.a7z0;
import defpackage.kxh0;
import defpackage.leh0;
import defpackage.mza1;
import defpackage.vmu0;
import defpackage.x6z0;
import java.util.Locale;
import java.util.WeakHashMap;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class i implements a7z0, x6z0 {
    public final EditText A;
    public final TextView B;
    public final TextView C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final String H;
    public final MaterialButtonToggleGroup I;
    public final LinearLayout a;
    public final TimeModel b;
    public final TextWatcher c;
    public final TextWatcher w;
    public final ChipTextInputComboView x;
    public final ChipTextInputComboView y;
    public final EditText z;

    public i(LinearLayout linearLayout, TimeModel timeModel) {
        TextWatcherAdapter textWatcherAdapter = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter$1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                try {
                    if (TextUtils.isEmpty(editable)) {
                        i.this.b.setMinute(0);
                        i.this.d();
                        return;
                    }
                    if (editable.length() > 2) {
                        editable.delete(2, editable.length());
                        i.g(i.this.z);
                        return;
                    }
                    int parseInt = Integer.parseInt(editable.toString());
                    i iVar = i.this;
                    if (parseInt > 59) {
                        iVar.x.setError(true);
                        TextView textView = iVar.B;
                        textView.setText(iVar.F);
                        textView.announceForAccessibility(textView.getText());
                        i.g(textView);
                    } else {
                        iVar.d();
                    }
                    i.this.b.setMinute(parseInt);
                } catch (NumberFormatException unused) {
                    i iVar2 = i.this;
                    iVar2.x.setError(true);
                    TextView textView2 = iVar2.B;
                    textView2.setText(iVar2.F);
                    textView2.announceForAccessibility(textView2.getText());
                    i.g(textView2);
                }
            }
        };
        this.c = textWatcherAdapter;
        TextWatcherAdapter textWatcherAdapter2 = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter$2
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                try {
                    if (TextUtils.isEmpty(editable)) {
                        i.this.b.setHour(0);
                        i.this.c();
                        return;
                    }
                    if (editable.length() > 2) {
                        editable.delete(2, editable.length());
                        i.g(i.this.A);
                        return;
                    }
                    int parseInt = Integer.parseInt(editable.toString());
                    i iVar = i.this;
                    int i = iVar.b.format;
                    if ((i != 0 || parseInt <= 12) && (i != 1 || parseInt <= 23)) {
                        iVar.c();
                    } else {
                        i.b(iVar);
                    }
                    i.this.b.setHour(parseInt);
                } catch (NumberFormatException unused) {
                    i.b(i.this);
                }
            }
        };
        this.w = textWatcherAdapter2;
        this.a = linearLayout;
        this.b = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(leh0.material_minute_text_input);
        this.x = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(leh0.material_hour_text_input);
        this.y = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(leh0.material_label);
        this.B = textView;
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(leh0.material_label);
        this.C = textView2;
        textView.setText(resources.getString(kxh0.material_timepicker_minute));
        textView.setImportantForAccessibility(2);
        textView2.setText(resources.getString(kxh0.material_timepicker_hour));
        textView2.setImportantForAccessibility(2);
        this.D = resources.getString(kxh0.material_timepicker_minute);
        this.E = resources.getString(kxh0.material_timepicker_hour);
        this.F = resources.getString(kxh0.material_timepicker_minute_error);
        this.G = resources.getString(kxh0.material_timepicker_hour_error);
        this.H = resources.getString(kxh0.material_timepicker_hour_error_24h);
        chipTextInputComboView.setTag(leh0.selection_type, 12);
        chipTextInputComboView2.setTag(leh0.selection_type, 10);
        if (timeModel.format == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(leh0.material_clock_period_toggle);
            this.I = materialButtonToggleGroup;
            materialButtonToggleGroup.addOnButtonCheckedListener(new g(0, this));
            this.I.setVisibility(0);
            MaterialButtonToggleGroup materialButtonToggleGroup2 = this.I;
            if (materialButtonToggleGroup2 != null) {
                materialButtonToggleGroup2.check(timeModel.period == 0 ? leh0.material_clock_period_am_button : leh0.material_clock_period_pm_button);
            }
        }
        vmu0 vmu0Var = new vmu0(11, this);
        chipTextInputComboView2.setOnClickListener(vmu0Var);
        chipTextInputComboView.setOnClickListener(vmu0Var);
        EditText editText = chipTextInputComboView2.getTextInput().getEditText();
        this.A = editText;
        final Resources resources2 = linearLayout.getResources();
        final int i = kxh0.material_timepicker_hour;
        editText.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter$5
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(resources2.getString(i));
            }
        });
        EditText editText2 = chipTextInputComboView.getTextInput().getEditText();
        this.z = editText2;
        final Resources resources3 = linearLayout.getResources();
        final int i2 = kxh0.material_timepicker_minute;
        editText2.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter$5
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(resources3.getString(i2));
            }
        });
        TimePickerTextInputKeyController timePickerTextInputKeyController = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.setChipDelegate(new h(linearLayout.getContext(), kxh0.material_hour_selection, resources, timeModel, 0));
        chipTextInputComboView.setChipDelegate(new h(linearLayout.getContext(), kxh0.material_minute_selection, resources, timeModel, 1));
        editText.addTextChangedListener(textWatcherAdapter2);
        editText2.addTextChangedListener(textWatcherAdapter);
        f(timeModel);
        timePickerTextInputKeyController.bind();
    }

    public static void b(i iVar) {
        iVar.y.setError(true);
        TextView textView = iVar.C;
        textView.setText(iVar.b.format == 1 ? iVar.H : iVar.G);
        textView.announceForAccessibility(textView.getText());
        g(textView);
    }

    public static void g(View view) {
        AudioManager audioManager;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        int a = mza1.a(17);
        if (a != -1) {
            view.performHapticFeedback(a);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if ((accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) && (audioManager = (AudioManager) view.getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) != null) {
            audioManager.playSoundEffect(9);
        }
    }

    @Override // defpackage.a7z0
    public final void a(int i) {
        TimeModel timeModel = this.b;
        timeModel.selection = i;
        this.x.setChecked(i == 12);
        this.y.setChecked(i == 10);
        MaterialButtonToggleGroup materialButtonToggleGroup = this.I;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.check(timeModel.period == 0 ? leh0.material_clock_period_am_button : leh0.material_clock_period_pm_button);
    }

    public final void c() {
        this.y.setError(false);
        this.C.setText(this.E);
    }

    public final void d() {
        this.x.setError(false);
        this.B.setText(this.D);
    }

    public final void e() {
        TimeModel timeModel = this.b;
        this.x.setChecked(timeModel.selection == 12);
        this.y.setChecked(timeModel.selection == 10);
    }

    public final void f(TimeModel timeModel) {
        EditText editText = this.A;
        TextWatcher textWatcher = this.w;
        editText.removeTextChangedListener(textWatcher);
        EditText editText2 = this.z;
        TextWatcher textWatcher2 = this.c;
        editText2.removeTextChangedListener(textWatcher2);
        Locale locale = this.a.getResources().getConfiguration().locale;
        String format = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.minute));
        String format2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.getHourForDisplay()));
        this.x.setText(format);
        this.y.setText(format2);
        editText.addTextChangedListener(textWatcher);
        editText2.addTextChangedListener(textWatcher2);
        a(timeModel.selection);
    }

    @Override // defpackage.x6z0
    public final void hide() {
        LinearLayout linearLayout = this.a;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null) {
            com.google.android.material.internal.e.h(focusedChild, false);
        }
        linearLayout.setVisibility(8);
    }

    @Override // defpackage.x6z0
    public final void invalidate() {
        f(this.b);
    }

    @Override // defpackage.x6z0
    public final void show() {
        this.a.setVisibility(0);
        a(this.b.selection);
    }
}
