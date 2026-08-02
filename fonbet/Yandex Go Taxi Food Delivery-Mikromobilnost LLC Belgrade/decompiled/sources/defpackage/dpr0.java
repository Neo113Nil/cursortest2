package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.widget.InsetsAwareFrameLayout;

/* loaded from: classes13.dex */
public final class dpr0 {
    public final ffe a;
    public final h3y b;
    public qor0 c;

    public dpr0(ffe ffeVar, h3y h3yVar) {
        this.a = ffeVar;
        this.b = h3yVar;
    }

    public final qor0 a() {
        if (this.c == null) {
            qor0 qor0Var = (qor0) this.b.get();
            if (qor0Var != null) {
                InsetsAwareFrameLayout insetsAwareFrameLayout = qor0Var.b;
                ffe ffeVar = this.a;
                ViewGroup viewGroup = ffeVar.a;
                ViewGroup viewGroup2 = ffeVar.a;
                if (viewGroup.indexOfChild(insetsAwareFrameLayout) < 0) {
                    ContentContainer$ZOrder contentContainer$ZOrder = ContentContainer$ZOrder.IMPORTANT;
                    viewGroup2.addView(insetsAwareFrameLayout);
                    ffeVar.a(insetsAwareFrameLayout, contentContainer$ZOrder);
                    mmp0 mmp0Var = new mmp0(15, qor0Var);
                    Rect rect = xw31.a;
                    viewGroup2.setFocusableInTouchMode(true);
                    viewGroup2.requestFocus();
                    viewGroup2.setOnKeyListener(new g9h(4, mmp0Var));
                }
            } else {
                qor0Var = null;
            }
            this.c = qor0Var;
        }
        return this.c;
    }
}
