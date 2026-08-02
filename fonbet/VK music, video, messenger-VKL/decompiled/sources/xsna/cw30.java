package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: MsgSearchAnimationHelper.kt */
/* loaded from: classes2.dex */
public final class cw30 implements tvv {
    public final View b;
    public final long c;
    public boolean d;

    public cw30(View view, long j) {
        this.b = view;
        this.c = j;
    }

    public final void a(boolean z) {
        View view = this.b;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int i = 0;
        while (true) {
            if (i >= viewGroup.getChildCount()) {
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            if (!z) {
                r4 = 1;
            }
            childAt.setImportantForAccessibility(r4);
            i++;
        }
        view.setImportantForAccessibility(z ? 1 : 4);
    }

    @Override // xsna.tvv
    public final boolean isIdle() {
        return !this.d;
    }

    public final String toString() {
        return "MsgSearchAnimationHelper";
    }
}
