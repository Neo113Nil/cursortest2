package xsna;

import android.view.View;
import android.view.ViewParent;

/* compiled from: FlexLayoutCarouselDragListener.kt */
/* loaded from: classes4.dex */
public final class yor implements Runnable {
    public final zfc0 b;
    public final /* synthetic */ apr c;

    public yor(apr aprVar) {
        this.c = aprVar;
        ViewParent parent = aprVar.b.getParent();
        this.b = parent instanceof zfc0 ? (zfc0) parent : null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        apr aprVar = this.c;
        int i = aprVar.n;
        zfc0 zfc0Var = this.b;
        if (zfc0Var == null) {
            return;
        }
        if (aprVar.p) {
            zfc0Var.setScrollX(zfc0Var.getScrollX() - i);
            if (zfc0Var.canScrollHorizontally(-i)) {
                aprVar.k -= i;
            }
        } else {
            zfc0Var.setScrollX(zfc0Var.getScrollX() + i);
            if (zfc0Var.canScrollHorizontally(i)) {
                aprVar.k += i;
            }
        }
        View view = aprVar.r;
        if (view != null) {
            float f = aprVar.k;
            ror rorVar = aprVar.b;
            view.setTranslationX(f - aprVar.j);
            rorVar.getCornersStateKeeper().g(view);
            rorVar.invalidate();
        }
        aprVar.v.postDelayed(this, 5L);
    }
}
