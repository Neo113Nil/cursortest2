package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class p23 implements View.OnLayoutChangeListener {
    public final bm a;
    public final bp b;
    public final q23 c;
    public final x41 d;
    public final Drawable e;

    public p23(bm bmVar, bp bpVar, q23 q23Var, x41 x41Var, Drawable drawable) {
        this.a = bmVar;
        this.b = bpVar;
        this.c = q23Var;
        this.d = x41Var;
        this.e = drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Bitmap bitmap;
        k23 k23Var;
        List list;
        Object next;
        dm dmVar;
        float f;
        float f2;
        String str;
        s23 s23Var;
        k23 k23Var2;
        dm dmVar2;
        k23 k23Var3;
        float width;
        int i9;
        String str2;
        String str3;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        Drawable drawable = this.e;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return;
        }
        boolean z = (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) ? false : true;
        boolean z2 = (i4 == i2 || i == i3) ? false : true;
        if (z && z2) {
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, imageView.getWidth(), imageView.getHeight());
            if (rectF.height() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            bm bmVar = this.a;
            x41 x41Var = this.d;
            bmVar.getClass();
            s23 s23Var2 = x41Var.e;
            if (s23Var2 != null && (dmVar = s23Var2.e) != null) {
                String str4 = dmVar.d;
                boolean z3 = (str4 == null || (str3 = dmVar.a) == null || !str4.equals(str3)) ? false : true;
                String str5 = dmVar.c;
                boolean z4 = (str5 == null || (str2 = dmVar.b) == null || !str5.equals(str2)) ? false : true;
                if (z3 || z4) {
                    bm bmVar2 = this.a;
                    x41 x41Var2 = this.d;
                    bmVar2.getClass();
                    s23 s23Var3 = x41Var2.e;
                    if (s23Var3 != null && (dmVar2 = s23Var3.e) != null && (k23Var3 = s23Var3.f) != null) {
                        float width2 = rectF.width();
                        float height = rectF.height();
                        float f3 = x41Var2.a;
                        float f4 = x41Var2.b;
                        float f5 = k23Var3.c;
                        float f6 = k23Var3.d;
                        if (width2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && height != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f2 = 1.0f;
                            f = 0.0f;
                            if (rectF.width() / rectF.height() > k23Var3.c / k23Var3.d) {
                                width = rectF.height();
                                i9 = k23Var3.d;
                            } else {
                                width = rectF.width();
                                i9 = k23Var3.c;
                            }
                            if (width / i9 <= 1.0f) {
                                if (width2 / height > f5 / f6) {
                                    if (epx.f(dmVar2.b, dmVar2.c)) {
                                        str = dmVar2.b;
                                    }
                                    str = null;
                                } else {
                                    if (epx.f(dmVar2.a, dmVar2.d)) {
                                        str = dmVar2.a;
                                    }
                                    str = null;
                                }
                            } else if (width2 / height > f3 / f4) {
                                if (epx.f(dmVar2.b, dmVar2.c)) {
                                    str = dmVar2.b;
                                }
                                str = null;
                            } else {
                                if (epx.f(dmVar2.a, dmVar2.d)) {
                                    str = dmVar2.a;
                                }
                                str = null;
                            }
                            s23Var = this.d.e;
                            if (s23Var != null || (k23Var2 = s23Var.f) == null) {
                                return;
                            }
                            if (str == null) {
                                this.c.a(imageView, bitmap, k23Var2);
                                return;
                            }
                            q23 q23Var = this.c;
                            q23Var.getClass();
                            float width3 = imageView.getWidth();
                            float height2 = imageView.getHeight();
                            float width4 = bitmap.getWidth();
                            float height3 = bitmap.getHeight();
                            float f7 = k23Var2.c;
                            float f8 = k23Var2.d;
                            if (height2 == f || f8 == f || height3 == f) {
                                return;
                            }
                            float f9 = width3 / height2;
                            float f10 = f9 < f7 / f8 ? width3 / f7 : height2 / f8;
                            if (f10 > f2) {
                                f10 = f9 < width4 / height3 ? width3 / width4 : height2 / height3;
                            }
                            float f11 = ((r12 / 2) + k23Var2.a) * f10;
                            float f12 = 2;
                            q23Var.b.setScale(f10, f10);
                            q23Var.b.postTranslate((width3 / f12) - f11, (height2 / f12) - (((r14 / 2) + k23Var2.b) * f10));
                            imageView.setScaleType(ImageView.ScaleType.MATRIX);
                            imageView.setImageMatrix(q23Var.b);
                            imageView.setBackgroundColor(Color.parseColor(str));
                            m23 m23Var = q23Var.a;
                            Context context = imageView.getContext();
                            m23Var.getClass();
                            if (((uh1) vh1.a(context, "YadPreferenceFile")).a("preference_smart_centers_debug_enabled", false)) {
                                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                                Canvas canvas = new Canvas(copy);
                                Rect rect = q23Var.d;
                                int i10 = k23Var2.a;
                                int i11 = k23Var2.b;
                                rect.set(i10, i11, k23Var2.c + i10, k23Var2.d + i11);
                                canvas.drawRect(rect, q23Var.c);
                                imageView.setImageBitmap(copy);
                                return;
                            }
                            return;
                        }
                    }
                    f = 0.0f;
                    f2 = 1.0f;
                    str = null;
                    s23Var = this.d.e;
                    if (s23Var != null) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            bp bpVar = this.b;
            x41 x41Var3 = this.d;
            bpVar.getClass();
            RectF rectF2 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, x41Var3.a, x41Var3.b);
            s23 s23Var4 = x41Var3.e;
            if (s23Var4 == null || (list = s23Var4.g) == null) {
                k23Var = null;
            } else {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    while (it.hasNext()) {
                        k23 k23Var4 = (k23) it.next();
                        next = (k23) next;
                        bpVar.a.getClass();
                        float a = o23.a(next, rectF, rectF2);
                        float a2 = o23.a(k23Var4, rectF, rectF2);
                        if (a != Float.MAX_VALUE) {
                            if (a == a2) {
                                if (next.e > k23Var4.e) {
                                }
                            } else if (a > a2) {
                            }
                        }
                        next = k23Var4;
                    }
                } else {
                    next = 0;
                }
                k23Var = (k23) next;
            }
            if (k23Var != null) {
                this.c.a(imageView, bitmap, k23Var);
            }
        }
    }
}
