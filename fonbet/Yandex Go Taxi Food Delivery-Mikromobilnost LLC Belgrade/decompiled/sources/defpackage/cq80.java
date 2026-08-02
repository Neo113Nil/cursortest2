package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes6.dex */
public final class cq80 implements zo31 {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final FrameLayout c;
    public final View d;

    public /* synthetic */ cq80(ConstraintLayout constraintLayout, FrameLayout frameLayout, View view, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = frameLayout;
        this.d = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
