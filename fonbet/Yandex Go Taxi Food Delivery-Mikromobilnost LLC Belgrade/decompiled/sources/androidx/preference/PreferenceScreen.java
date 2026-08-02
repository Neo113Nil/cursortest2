package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import defpackage.dme0;
import defpackage.fog0;
import defpackage.uvb1;

/* loaded from: classes10.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean o0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, uvb1.b(context, fog0.preferenceScreenStyle, R.attr.preferenceScreenStyle), 0);
        this.o0 = true;
    }

    @Override // androidx.preference.Preference
    public final void n() {
        dme0 dme0Var;
        if (this.E != null || this.F != null || this.j0.size() == 0 || (dme0Var = this.b.j) == null) {
            return;
        }
        dme0Var.onNavigateToScreen(this);
    }
}
