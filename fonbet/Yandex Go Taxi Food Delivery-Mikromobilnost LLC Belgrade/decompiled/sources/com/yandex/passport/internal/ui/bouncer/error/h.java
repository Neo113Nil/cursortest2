package com.yandex.passport.internal.ui.bouncer.error;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import com.yandex.passport.R;
import com.yandex.passport.internal.flags.presentation.s0;
import defpackage.l7e;
import defpackage.li91;
import defpackage.uc20;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class h extends l7e {
    public final d w;
    public final g x;
    public final LinearLayout y;
    public final ConstraintLayout z;

    public h(Activity activity, d dVar, g gVar) {
        super(activity);
        this.w = dVar;
        this.x = gVar;
        wj91.e(0, this.a);
        View root = gVar.getRoot();
        addToParent(root);
        this.y = (LinearLayout) root;
        wj91.e(0, this.a);
        View root2 = dVar.getRoot();
        addToParent(root2);
        this.z = (ConstraintLayout) root2;
    }

    @Override // defpackage.l7e
    public final void a(ConstraintSetBuilder constraintSetBuilder) {
        constraintSetBuilder.A(new b(1, constraintSetBuilder), this.z);
        constraintSetBuilder.A(new s0(9, constraintSetBuilder, this), this.y);
    }

    @Override // defpackage.l7e
    public final void c(ConstraintLayout constraintLayout) {
        li91.g(R.color.passport_error_slab_background, constraintLayout);
        int i = (int) (20.0f * uc20.a.density);
        constraintLayout.setPadding(i, constraintLayout.getPaddingTop(), i, constraintLayout.getPaddingBottom());
        constraintLayout.setId(R.id.passport_zero_page);
    }
}
