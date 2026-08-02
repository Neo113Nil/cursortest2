package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.fog0;
import defpackage.jme0;
import defpackage.n2i0;
import defpackage.uvb1;

/* loaded from: classes10.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final Listener n0;

    public class Listener implements CompoundButton.OnCheckedChangeListener {
        public Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CheckBoxPreference.this.a(Boolean.valueOf(z));
            CheckBoxPreference.this.A(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int b = uvb1.b(context, fog0.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle);
        this.n0 = new Listener();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2i0.CheckBoxPreference, b, 0);
        int i = n2i0.CheckBoxPreference_summaryOn;
        int i2 = n2i0.CheckBoxPreference_android_summaryOn;
        String string = obtainStyledAttributes.getString(i);
        this.j0 = string == null ? obtainStyledAttributes.getString(i2) : string;
        if (this.i0) {
            i();
        }
        int i3 = n2i0.CheckBoxPreference_summaryOff;
        int i4 = n2i0.CheckBoxPreference_android_summaryOff;
        String string2 = obtainStyledAttributes.getString(i3);
        this.k0 = string2 == null ? obtainStyledAttributes.getString(i4) : string2;
        if (!this.i0) {
            i();
        }
        this.m0 = obtainStyledAttributes.getBoolean(n2i0.CheckBoxPreference_disableDependentsState, obtainStyledAttributes.getBoolean(n2i0.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.i0);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.n0);
        }
    }

    @Override // androidx.preference.Preference
    public final void m(jme0 jme0Var) {
        super.m(jme0Var);
        C(jme0Var.W(R.id.checkbox));
        B(jme0Var.W(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void t(View view) {
        super.t(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(R.id.checkbox));
            B(view.findViewById(R.id.summary));
        }
    }
}
