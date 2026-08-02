package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.passport.internal.ui.bouncer.model.f2;

/* loaded from: classes2.dex */
public final class u extends BottomSheetBehavior.a {
    public final /* synthetic */ v a;

    public u(v vVar) {
        this.a = vVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        if (i == 4 || i == 5) {
            this.a.J.a(f2.b);
        }
    }
}
