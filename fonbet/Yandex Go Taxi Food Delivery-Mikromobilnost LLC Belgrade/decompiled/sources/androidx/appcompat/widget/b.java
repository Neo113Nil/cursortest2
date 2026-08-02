package androidx.appcompat.widget;

import android.view.View;
import defpackage.eu31;

/* loaded from: classes10.dex */
public final class b implements eu31 {
    public boolean a = false;
    public int b;
    public final /* synthetic */ AbsActionBarView c;

    public b(AbsActionBarView absActionBarView) {
        this.c = absActionBarView;
    }

    @Override // defpackage.eu31
    public final void onAnimationCancel(View view) {
        this.a = true;
    }

    @Override // defpackage.eu31
    public final void onAnimationEnd(View view) {
        if (this.a) {
            return;
        }
        AbsActionBarView absActionBarView = this.c;
        absActionBarView.mVisibilityAnim = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.eu31
    public final void onAnimationStart(View view) {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }
}
