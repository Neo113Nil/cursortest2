package xsna;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: VkImageBackend.kt */
/* loaded from: classes.dex */
public interface p0v0 {
    void A(Drawable drawable);

    void B(Drawable drawable);

    void C(String str);

    void D(int i);

    void E(String str);

    void F();

    void G(Uri uri, Size size, Uri uri2, Size size2);

    int H();

    float I();

    void J(String str);

    void K(Uri uri, Size size);

    void L(int i, ImageView.ScaleType scaleType);

    void M(qhv0 qhv0Var);

    void N();

    void O(Drawable drawable, ImageView.ScaleType scaleType);

    void P(int i);

    void Q(float f);

    void a(float f, int i);

    void b();

    void c();

    void cancel();

    void clear();

    boolean d(MotionEvent motionEvent);

    void e(boolean z);

    void f(float f);

    void g(Path path);

    float h();

    void i(String str);

    void j(boolean z);

    void k(Drawable drawable, ImageView.ScaleType scaleType);

    void l(Canvas canvas, dxh dxhVar);

    int m();

    boolean n();

    void o(cir cirVar);

    void p(Uri uri, Uri uri2, Size size);

    float q();

    void r(jtc0 jtc0Var);

    boolean s();

    void setAspectRatio(float f);

    void setBackgroundImage(Drawable drawable);

    void setColorFilter(ColorFilter colorFilter);

    void setOnLoadCallback(b780 b780Var);

    void setPlaceholderColor(int i);

    void setScaleType(ImageView.ScaleType scaleType);

    void t();

    float u();

    void v(boolean z);

    qhv0 w();

    void x(float f, float f2, float f3, float f4);

    void y(String str, Size size);

    void z(AttributeSet attributeSet);
}
