package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.cme0;
import defpackage.fog0;
import defpackage.n2i0;
import defpackage.uvb1;

/* loaded from: classes10.dex */
public abstract class DialogPreference extends Preference {
    public final CharSequence i0;
    public final String j0;
    public final Drawable k0;
    public final String l0;
    public final String m0;
    public final int n0;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2i0.DialogPreference, i, 0);
        int i2 = n2i0.DialogPreference_dialogTitle;
        int i3 = n2i0.DialogPreference_android_dialogTitle;
        String string = obtainStyledAttributes.getString(i2);
        string = string == null ? obtainStyledAttributes.getString(i3) : string;
        this.i0 = string;
        if (string == null) {
            this.i0 = this.z;
        }
        int i4 = n2i0.DialogPreference_dialogMessage;
        int i5 = n2i0.DialogPreference_android_dialogMessage;
        String string2 = obtainStyledAttributes.getString(i4);
        this.j0 = string2 == null ? obtainStyledAttributes.getString(i5) : string2;
        int i6 = n2i0.DialogPreference_dialogIcon;
        int i7 = n2i0.DialogPreference_android_dialogIcon;
        Drawable drawable = obtainStyledAttributes.getDrawable(i6);
        this.k0 = drawable == null ? obtainStyledAttributes.getDrawable(i7) : drawable;
        int i8 = n2i0.DialogPreference_positiveButtonText;
        int i9 = n2i0.DialogPreference_android_positiveButtonText;
        String string3 = obtainStyledAttributes.getString(i8);
        this.l0 = string3 == null ? obtainStyledAttributes.getString(i9) : string3;
        int i10 = n2i0.DialogPreference_negativeButtonText;
        int i11 = n2i0.DialogPreference_android_negativeButtonText;
        String string4 = obtainStyledAttributes.getString(i10);
        this.m0 = string4 == null ? obtainStyledAttributes.getString(i11) : string4;
        this.n0 = obtainStyledAttributes.getResourceId(n2i0.DialogPreference_dialogLayout, obtainStyledAttributes.getResourceId(n2i0.DialogPreference_android_dialogLayout, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void n() {
        cme0 cme0Var = this.b.i;
        if (cme0Var != null) {
            cme0Var.onDisplayPreferenceDialog(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, uvb1.b(context, fog0.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
