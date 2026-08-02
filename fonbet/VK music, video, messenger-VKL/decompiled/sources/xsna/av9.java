package xsna;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CarouselOrientationHelper.java */
/* loaded from: classes13.dex */
public abstract class av9 {
    public final int a;

    public av9(int i) {
        this.a = i;
    }

    public abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract float b(RecyclerView.p pVar);

    public abstract RectF c(float f, float f2, float f3, float f4);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract void j(int i, int i2, View view);

    public abstract void k(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void l(View view, Rect rect, float f, float f2);
}
