package xsna;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vkt implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vkt(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                xkt xktVar = (xkt) this.c;
                Rect rect = new Rect();
                xktVar.o.getHitRect(rect);
                int a = iah0.a(48) - rect.height();
                if (a <= 0) {
                    xktVar.itemView.setTouchDelegate(null);
                    break;
                } else {
                    int i9 = a / 2;
                    rect.top -= (a % 2) + i9;
                    rect.bottom += i9;
                    xktVar.itemView.setTouchDelegate(new TouchDelegate(rect, xktVar.o));
                    break;
                }
            default:
                xgy xgyVar = (xgy) this.c;
                if (i != i5 || i4 != i8) {
                    xgyVar.f();
                    break;
                }
        }
    }
}
