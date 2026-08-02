package xsna;

import android.view.View;
import android.view.ViewParent;
import kotlin.NoWhenBranchMatchedException;
import xsna.xor;

/* compiled from: FlexLayoutCarouselDragListener.kt */
/* loaded from: classes18.dex */
public final class zor implements Runnable {
    public final yfc0 b;
    public final /* synthetic */ xor c;

    public zor(xor xorVar) {
        this.c = xorVar;
        ViewParent parent = xorVar.b.getParent();
        this.b = parent instanceof yfc0 ? (yfc0) parent : null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xor xorVar = this.c;
        int i = xorVar.l;
        yfc0 yfc0Var = this.b;
        if (yfc0Var == null) {
            return;
        }
        xor.a aVar = xorVar.o;
        if (epx.f(aVar, xor.a.C4030a.a)) {
            yfc0Var.setScrollX(yfc0Var.getScrollX() - i);
            if (yfc0Var.canScrollHorizontally(-i)) {
                xorVar.j -= i;
            }
        } else {
            if (!epx.f(aVar, xor.a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            yfc0Var.setScrollX(yfc0Var.getScrollX() + i);
            if (yfc0Var.canScrollHorizontally(i)) {
                xorVar.j += i;
            }
        }
        View view = xorVar.q;
        if (view != null) {
            view.setTranslationX(xorVar.j - xorVar.h);
        }
        xorVar.r.postDelayed(this, 5L);
    }
}
