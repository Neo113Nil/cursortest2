package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class d561 implements zo31 {
    public final ConstraintLayout a;
    public final View b;
    public final AppCompatImageView c;

    public d561(ConstraintLayout constraintLayout, View view, AppCompatImageView appCompatImageView) {
        this.a = constraintLayout;
        this.b = view;
        this.c = appCompatImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
