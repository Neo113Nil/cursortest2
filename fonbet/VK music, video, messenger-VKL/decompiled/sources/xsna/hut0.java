package xsna;

import android.view.View;
import com.vkontakte.android.R;
import xsna.iut0;

/* compiled from: ViewCompat.java */
/* loaded from: classes11.dex */
public final class hut0 extends iut0.b<Boolean> {
    public hut0() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // xsna.iut0.b
    public final Boolean a(View view) {
        return Boolean.valueOf(iut0.h.c(view));
    }

    @Override // xsna.iut0.b
    public final void b(View view, Boolean bool) {
        iut0.h.f(view, bool.booleanValue());
    }

    @Override // xsna.iut0.b
    public final boolean e(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
