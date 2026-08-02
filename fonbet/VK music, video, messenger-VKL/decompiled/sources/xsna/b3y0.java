package xsna;

import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/* compiled from: WriteView.java */
/* loaded from: classes3.dex */
public final class b3y0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ Point b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ f3y0 d;

    /* compiled from: WriteView.java */
    public class a implements Runnable {
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f3y0 f3y0Var = b3y0.this.d;
            f3y0Var.t.w(f3y0Var.c0.a(this.b, null));
        }
    }

    public b3y0(f3y0 f3y0Var, Point point, int[] iArr) {
        this.d = f3y0Var;
        this.b = point;
        this.c = iArr;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
            return;
        }
        f3y0 f3y0Var = this.d;
        f3y0Var.t.s(true);
        Display defaultDisplay = ((WindowManager) f3y0Var.getContext().getSystemService("window")).getDefaultDisplay();
        Point point = this.b;
        defaultDisplay.getSize(point);
        int[] iArr = this.c;
        view.getLocationOnScreen(iArr);
        if (point.y - ((i4 - i2) + iArr[1]) > 200) {
            pro0.c(new a(f3y0Var.n.getText().toString()));
        }
    }
}
