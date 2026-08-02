package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.fog0;
import defpackage.jme0;
import defpackage.mbh0;
import defpackage.n2i0;

/* loaded from: classes10.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final Listener n0;
    public final String o0;
    public final String p0;

    public class Listener implements CompoundButton.OnCheckedChangeListener {
        public Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SwitchPreferenceCompat.this.a(Boolean.valueOf(z));
            SwitchPreferenceCompat.this.A(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = fog0.switchPreferenceCompatStyle;
        this.n0 = new Listener();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2i0.SwitchPreferenceCompat, i, 0);
        int i2 = n2i0.SwitchPreferenceCompat_summaryOn;
        int i3 = n2i0.SwitchPreferenceCompat_android_summaryOn;
        String string = obtainStyledAttributes.getString(i2);
        this.j0 = string == null ? obtainStyledAttributes.getString(i3) : string;
        if (this.i0) {
            i();
        }
        int i4 = n2i0.SwitchPreferenceCompat_summaryOff;
        int i5 = n2i0.SwitchPreferenceCompat_android_summaryOff;
        String string2 = obtainStyledAttributes.getString(i4);
        this.k0 = string2 == null ? obtainStyledAttributes.getString(i5) : string2;
        if (!this.i0) {
            i();
        }
        int i6 = n2i0.SwitchPreferenceCompat_switchTextOn;
        int i7 = n2i0.SwitchPreferenceCompat_android_switchTextOn;
        String string3 = obtainStyledAttributes.getString(i6);
        this.o0 = string3 == null ? obtainStyledAttributes.getString(i7) : string3;
        i();
        int i8 = n2i0.SwitchPreferenceCompat_switchTextOff;
        int i9 = n2i0.SwitchPreferenceCompat_android_switchTextOff;
        String string4 = obtainStyledAttributes.getString(i8);
        this.p0 = string4 == null ? obtainStyledAttributes.getString(i9) : string4;
        i();
        this.m0 = obtainStyledAttributes.getBoolean(n2i0.SwitchPreferenceCompat_disableDependentsState, obtainStyledAttributes.getBoolean(n2i0.SwitchPreferenceCompat_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.i0);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.o0);
            switchCompat.setTextOff(this.p0);
            switchCompat.setOnCheckedChangeListener(this.n0);
        }
    }

    @Override // androidx.preference.Preference
    public final void m(jme0 jme0Var) {
        super.m(jme0Var);
        C(jme0Var.W(mbh0.switchWidget));
        B(jme0Var.W(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void t(View view) {
        super.t(view);
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(mbh0.switchWidget));
            B(view.findViewById(R.id.summary));
        }
    }
}
