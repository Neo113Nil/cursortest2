package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class da61 implements zo31 {
    public final ConstraintLayout a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;

    public da61(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.b = appCompatImageView;
        this.c = appCompatTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
