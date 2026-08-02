package defpackage;

import android.graphics.Rect;
import android.view.View;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes.dex */
public final class n9u {
    public final View a;
    public final float b;
    public t0d c;

    public n9u(View view) {
        float h = c.h(32, view);
        this.a = view;
        this.b = h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, Rect rect) {
        t0d t0dVar = this.c;
        View view = this.a;
        if (t0dVar != null) {
            view.removeCallbacks(t0dVar);
        }
        this.c = null;
        if (rect != null && i != 0) {
            int height = view.getHeight();
            int i2 = rect.top;
            if (height <= i2) {
                i = i2 - height;
            } else {
                int i3 = rect.bottom;
                i = height >= i3 ? height - i3 : height < (rect.height() / 2) + i2 ? height - rect.top : rect.bottom - height;
            }
        }
        float c = y6i0.c(view.getTranslationY() + i, 0.0f, this.b);
        if (view instanceof m9u) {
            ((m9u) view).onElevationChanged(c);
        } else {
            view.setElevation(c);
        }
    }
}
