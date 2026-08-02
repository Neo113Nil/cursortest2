package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TtsSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.eng0;
import defpackage.jvh0;
import defpackage.kxh0;
import defpackage.leh0;
import defpackage.m4m0;
import defpackage.o070;
import defpackage.sa90;
import defpackage.vez0;
import defpackage.yv21;
import defpackage.z610;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() { // from class: com.google.android.material.datepicker.SingleDateSelector.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    };
    private CharSequence error;
    private Long selectedItem;
    private SimpleDateFormat textInputFormat;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelection() {
        this.selectedItem = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        return z610.f(context, eng0.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return kxh0.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedItem;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<sa90> getSelectedRanges() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionContentDescription(Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedItem;
        return resources.getString(kxh0.mtrl_picker_announce_current_selection, l == null ? resources.getString(kxh0.mtrl_picker_announce_current_selection_none) : m4m0.g(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionDisplayString(Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedItem;
        if (l == null) {
            return resources.getString(kxh0.mtrl_picker_date_header_unselected);
        }
        return resources.getString(kxh0.mtrl_picker_date_header_selected, m4m0.g(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        return this.selectedItem != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if ((r12 != null ? r12.toLowerCase(java.util.Locale.ENGLISH) : "").equals(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG) != false) goto L15;
     */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, final o070 o070Var) {
        View inflate = layoutInflater.inflate(jvh0.mtrl_picker_text_input_date, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(leh0.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer y = vez0.y(eng0.colorOnSurfaceVariant, inflate.getContext());
        if (y != null) {
            editText.setHintTextColor(y.intValue());
        }
        String str = Build.MANUFACTURER;
        if (!(str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
        }
        editText.setInputType(17);
        SimpleDateFormat simpleDateFormat = this.textInputFormat;
        boolean z = simpleDateFormat != null;
        if (!z) {
            simpleDateFormat = yv21.d();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        String pattern = z ? simpleDateFormat2.toPattern() : yv21.e(inflate.getResources(), simpleDateFormat2);
        AtomicReference atomicReference = yv21.a;
        SpannableString spannableString = new SpannableString(pattern);
        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), 0, spannableString.length(), 33);
        textInputLayout.setPlaceholderText(spannableString);
        Long l = this.selectedItem;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
            Editable text = editText.getText();
            if (text != null) {
                editText.setSelection(text.length());
            }
        }
        editText.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat2, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.SingleDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                SingleDateSelector.this.error = textInputLayout.getError();
                o070Var.a();
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(Long l2) {
                SingleDateSelector singleDateSelector = SingleDateSelector.this;
                if (l2 == null) {
                    singleDateSelector.clearSelection();
                } else {
                    singleDateSelector.select(l2.longValue());
                }
                SingleDateSelector.this.error = null;
                o070Var.b(SingleDateSelector.this.getSelection());
            }
        });
        if (!DateSelector.isTouchExplorationEnabled(inflate.getContext())) {
            DateSelector.showKeyboardWithAutoHideBehavior(editText);
        }
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        this.selectedItem = Long.valueOf(j);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(Long l) {
        this.selectedItem = l == null ? null : Long.valueOf(yv21.a(l.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            AtomicReference atomicReference = yv21.a;
            DateFormat dateFormat = (DateFormat) simpleDateFormat.clone();
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            simpleDateFormat = (SimpleDateFormat) dateFormat;
        }
        this.textInputFormat = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.selectedItem);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public Long getSelection() {
        return this.selectedItem;
    }
}
