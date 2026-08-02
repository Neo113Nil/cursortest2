package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: ContentVerticalCentralizer.kt */
/* loaded from: classes18.dex */
public final class ulj {
    public View a;
    public View b;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public final tlj e = new ViewTreeObserver.OnDrawListener() { // from class: xsna.tlj
        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            ulj uljVar = ulj.this;
            View view = uljVar.a;
            Rect rect = uljVar.c;
            Rect rect2 = uljVar.d;
            View view2 = uljVar.b;
            if (view == null || view2 == null) {
                return;
            }
            view.getLocalVisibleRect(rect2);
            if (rect.height() == rect2.height()) {
                return;
            }
            float height = ((rect2.height() - view2.getHeight()) / 2.0f) - view2.getTop();
            float height2 = (view2.getHeight() + (-view.getHeight())) / 2.0f;
            float height3 = (view.getHeight() - view2.getHeight()) / 2.0f;
            if (height < height2) {
                height = height2;
            } else if (height > height3) {
                height = height3;
            }
            view2.setTranslationY(height);
            rect.set(rect2);
        }
    };
}
