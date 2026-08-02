package defpackage;

import android.view.View;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final class fxk0 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ double b;

    public fxk0(View view, double d) {
        this.a = view;
        this.b = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null && view2.getTag(mih0.rotation_extension_original_width) == null) {
            view2.setTag(mih0.rotation_extension_original_width, Integer.valueOf(view2.getWidth()));
            view2.setTag(mih0.rotation_extension_original_height, Integer.valueOf(view2.getHeight()));
        }
        int width = view.getWidth();
        int height = view.getHeight();
        double d = this.b;
        double radians = Math.toRadians(d);
        double abs = Math.abs(Math.cos(radians));
        double abs2 = Math.abs(Math.sin(radians));
        double d2 = width;
        double d3 = height;
        int a = m810.a((d3 * abs2) + (d2 * abs));
        int a2 = m810.a((d3 * abs) + (d2 * abs2));
        if (view2 != null) {
            c.D(view2.getLayoutParams().width, a2, view2);
        }
        if (view2 != null) {
            c.D(a, view2.getLayoutParams().height, view2);
        }
        view.setRotation((float) d);
    }
}
