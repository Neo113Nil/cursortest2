package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import defpackage.fog0;
import defpackage.jme0;
import defpackage.uvb1;

/* loaded from: classes10.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, uvb1.b(context, fog0.preferenceCategoryStyle, R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean h() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void m(jme0 jme0Var) {
        super.m(jme0Var);
        jme0Var.a.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public final boolean y() {
        return !super.h();
    }
}
