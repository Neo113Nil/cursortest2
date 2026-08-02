package xsna;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Size;
import com.vk.core.util.measure.ScaleType;
import java.util.List;

/* compiled from: EnhancedImageBackend.kt */
/* loaded from: classes17.dex */
public interface zlp {
    ColorFilter c();

    void clear();

    boolean d();

    void e();

    boolean f(Drawable drawable);

    void g(List<? extends fxj0> list);

    void h();

    gzs<Boolean> i();

    void j(fxj0 fxj0Var);

    void k(int i, int i2, int i3, int i4);

    void l(fxj0 fxj0Var);

    void m();

    void n(int i);

    void o();

    void p(List<? extends fxj0> list);

    void q(Drawable drawable);

    Size r(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ScaleType scaleType, float f);

    void s(boolean z);

    void setColorFilter(ColorFilter colorFilter);

    void setPlaceholder(Drawable drawable);

    void t(ScaleType scaleType);

    void u(gzs<Boolean> gzsVar);

    void v(boolean z);

    boolean w();
}
