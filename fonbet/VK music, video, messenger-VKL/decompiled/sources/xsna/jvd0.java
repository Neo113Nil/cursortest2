package xsna;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jvd0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jvd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.b) {
            case 0:
                kvd0 kvd0Var = (kvd0) this.c;
                if (kvd0.e(kvd0Var.d(-1)) != 0) {
                    kvd0Var.b(-1);
                    kvd0Var.c();
                    break;
                }
                break;
            default:
                tcm0 tcm0Var = (tcm0) this.c;
                Rect rect = new Rect();
                tcm0Var.c.getWindowVisibleDisplayFrame(rect);
                int height = tcm0Var.c.getRootView().getHeight();
                bwt0.c0(height - (height - rect.bottom), tcm0Var.i);
                break;
        }
    }
}
