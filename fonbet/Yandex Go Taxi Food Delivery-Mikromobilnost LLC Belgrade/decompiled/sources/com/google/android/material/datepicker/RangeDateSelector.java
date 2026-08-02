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
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.d6z;
import defpackage.eng0;
import defpackage.jvh0;
import defpackage.kxh0;
import defpackage.leh0;
import defpackage.m4m0;
import defpackage.o070;
import defpackage.org0;
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
public class RangeDateSelector implements DateSelector<sa90> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    };
    private CharSequence error;
    private String invalidRangeStartError;
    private SimpleDateFormat textInputFormat;
    private final String invalidRangeEndError = " ";
    private Long selectedStartItem = null;
    private Long selectedEndItem = null;
    private Long proposedTextStart = null;
    private Long proposedTextEnd = null;

    private void clearInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean isValidRange(long j, long j2) {
        return j <= j2;
    }

    private void setInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(" ");
    }

    private void updateError(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.error = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.error = null;
        } else {
            this.error = textInputLayout2.getError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIfValidTextProposal(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, o070 o070Var) {
        Long l = this.proposedTextStart;
        if (l == null || this.proposedTextEnd == null) {
            clearInvalidRange(textInputLayout, textInputLayout2);
            o070Var.a();
        } else if (isValidRange(l.longValue(), this.proposedTextEnd.longValue())) {
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            o070Var.b(getSelection());
        } else {
            setInvalidRange(textInputLayout, textInputLayout2);
            o070Var.a();
        }
        updateError(textInputLayout, textInputLayout2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return z610.f(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(org0.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? eng0.materialCalendarTheme : eng0.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return kxh0.mtrl_picker_range_header_title;
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
        Long l = this.selectedStartItem;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.selectedEndItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<sa90> getSelectedRanges() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new sa90(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public sa90 getSelection() {
        return new sa90(this.selectedStartItem, this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionContentDescription(Context context) {
        Resources resources = context.getResources();
        sa90 c = m4m0.c(this.selectedStartItem, this.selectedEndItem);
        Object obj = c.a;
        String string = obj == null ? resources.getString(kxh0.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = c.b;
        return resources.getString(kxh0.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(kxh0.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionDisplayString(Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedStartItem;
        if (l == null && this.selectedEndItem == null) {
            return resources.getString(kxh0.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.selectedEndItem;
        if (l2 == null) {
            return resources.getString(kxh0.mtrl_picker_range_header_only_start_selected, m4m0.d(l.longValue()));
        }
        if (l == null) {
            return resources.getString(kxh0.mtrl_picker_range_header_only_end_selected, m4m0.d(l2.longValue()));
        }
        sa90 c = m4m0.c(l, l2);
        return resources.getString(kxh0.mtrl_picker_range_header_selected, c.a, c.b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l = this.selectedStartItem;
        return (l == null || this.selectedEndItem == null || !isValidRange(l.longValue(), this.selectedEndItem.longValue())) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        if ((r1 != null ? r1.toLowerCase(java.util.Locale.ENGLISH) : "").equals(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG) != false) goto L15;
     */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, final o070 o070Var) {
        View inflate = layoutInflater.inflate(jvh0.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(leh0.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(leh0.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer y = vez0.y(eng0.colorOnSurfaceVariant, inflate.getContext());
        if (y != null) {
            editText.setHintTextColor(y.intValue());
            editText2.setHintTextColor(y.intValue());
        }
        String str = Build.MANUFACTURER;
        if (!(str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
        }
        editText.setInputType(17);
        editText2.setInputType(17);
        this.invalidRangeStartError = inflate.getResources().getString(kxh0.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormat = this.textInputFormat;
        boolean z = simpleDateFormat != null;
        if (!z) {
            simpleDateFormat = yv21.d();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        Long l = this.selectedStartItem;
        if (l != null) {
            editText.setText(simpleDateFormat2.format(l));
            this.proposedTextStart = this.selectedStartItem;
            Editable text = editText.getText();
            if (text != null) {
                editText.setSelection(text.length());
            }
        }
        Long l2 = this.selectedEndItem;
        if (l2 != null) {
            editText2.setText(simpleDateFormat2.format(l2));
            this.proposedTextEnd = this.selectedEndItem;
        }
        String pattern = z ? simpleDateFormat2.toPattern() : yv21.e(inflate.getResources(), simpleDateFormat2);
        AtomicReference atomicReference = yv21.a;
        SpannableString spannableString = new SpannableString(pattern);
        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), 0, spannableString.length(), 33);
        textInputLayout.setPlaceholderText(spannableString);
        textInputLayout2.setPlaceholderText(spannableString);
        editText.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat2, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                RangeDateSelector.this.proposedTextStart = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, o070Var);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(Long l3) {
                RangeDateSelector.this.proposedTextStart = l3;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, o070Var);
            }
        });
        editText2.addTextChangedListener(new DateFormatTextWatcher(pattern, simpleDateFormat2, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                RangeDateSelector.this.proposedTextEnd = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, o070Var);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(Long l3) {
                RangeDateSelector.this.proposedTextEnd = l3;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, o070Var);
            }
        });
        if (!DateSelector.isTouchExplorationEnabled(inflate.getContext())) {
            DateSelector.showKeyboardWithAutoHideBehavior(editText, editText2);
        }
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        Long l = this.selectedStartItem;
        if (l == null) {
            this.selectedStartItem = Long.valueOf(j);
        } else if (this.selectedEndItem == null && isValidRange(l.longValue(), j)) {
            this.selectedEndItem = Long.valueOf(j);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(sa90 sa90Var) {
        Object obj = sa90Var.a;
        Object obj2 = sa90Var.b;
        if (obj != null && obj2 != null) {
            d6z.n(isValidRange(((Long) obj).longValue(), ((Long) obj2).longValue()));
        }
        Object obj3 = sa90Var.a;
        this.selectedStartItem = obj3 == null ? null : Long.valueOf(yv21.a(((Long) obj3).longValue()));
        this.selectedEndItem = obj2 != null ? Long.valueOf(yv21.a(((Long) obj2).longValue())) : null;
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
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }
}
