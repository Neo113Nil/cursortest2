package xsna;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class p9f implements View.OnLayoutChangeListener {
    public final /* synthetic */ Rect b;
    public final /* synthetic */ Rect c;

    public p9f(Rect rect, Rect rect2) {
        this.b = rect;
        this.c = rect2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        ArrayList arrayList = new ArrayList();
        Rect rect = this.b;
        f4m.d(rect, view);
        int i9 = rect.left;
        Rect rect2 = this.c;
        arrayList.add(new Rect(i9, rect2.top, rect.right, rect2.bottom));
        view.setSystemGestureExclusionRects(arrayList);
    }
}
