package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes12.dex */
public final class iui implements zo31 {
    public final ViewGroup a;
    public final FrameLayout b;
    public final View c;
    public final ConstraintLayout d;
    public final FrameLayout e;

    public iui(ViewGroup viewGroup, FrameLayout frameLayout, View view, ConstraintLayout constraintLayout, FrameLayout frameLayout2) {
        this.a = viewGroup;
        this.b = frameLayout;
        this.c = view;
        this.d = constraintLayout;
        this.e = frameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
