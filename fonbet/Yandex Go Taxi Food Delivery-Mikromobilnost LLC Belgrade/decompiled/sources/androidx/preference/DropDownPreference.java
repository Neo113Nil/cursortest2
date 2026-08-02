package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import defpackage.fog0;
import defpackage.jme0;
import defpackage.mbh0;

/* loaded from: classes10.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter t0;
    public Spinner u0;
    public final AdapterView.OnItemSelectedListener v0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, fog0.dropdownPreferenceStyle);
        this.v0 = new AdapterView.OnItemSelectedListener() { // from class: androidx.preference.DropDownPreference.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (i >= 0) {
                    String charSequence = DropDownPreference.this.p0[i].toString();
                    if (charSequence.equals(DropDownPreference.this.q0)) {
                        return;
                    }
                    DropDownPreference.this.a(charSequence);
                    DropDownPreference.this.C(charSequence);
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item);
        this.t0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.o0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.ListPreference
    public final void B(CharSequence[] charSequenceArr) {
        this.o0 = charSequenceArr;
        ArrayAdapter arrayAdapter = this.t0;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr2 = this.o0;
        if (charSequenceArr2 != null) {
            for (CharSequence charSequence : charSequenceArr2) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void i() {
        super.i();
        ArrayAdapter arrayAdapter = this.t0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void m(jme0 jme0Var) {
        int i;
        Spinner spinner = (Spinner) jme0Var.a.findViewById(mbh0.spinner);
        this.u0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.t0);
        this.u0.setOnItemSelectedListener(this.v0);
        Spinner spinner2 = this.u0;
        String str = this.q0;
        CharSequence[] charSequenceArr = this.p0;
        if (str != null && charSequenceArr != null) {
            i = charSequenceArr.length - 1;
            while (i >= 0) {
                if (TextUtils.equals(charSequenceArr[i].toString(), str)) {
                    break;
                } else {
                    i--;
                }
            }
        }
        i = -1;
        spinner2.setSelection(i);
        super.m(jme0Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void n() {
        this.u0.performClick();
    }
}
