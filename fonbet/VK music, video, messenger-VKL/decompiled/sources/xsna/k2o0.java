package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.photo.PhotoTag;
import com.vk.typography.FontFamily;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TagsOverlayView.kt */
/* loaded from: classes18.dex */
public final class k2o0 extends View {
    public static final float q = iah0.a(8);
    public static final float r = iah0.a(5);
    public static final float s = iah0.a(2);
    public static final PorterDuffColorFilter t;
    public static final PorterDuffColorFilter u;
    public static final RectF v;
    public eea0 b;
    public final ArrayList c;
    public final LinkedHashMap d;
    public izs<? super PhotoTag, s3q0> e;
    public PhotoTag f;
    public float g;
    public float h;
    public final int i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final Bitmap m;
    public final Bitmap n;
    public final a o;
    public dac0 p;

    /* compiled from: TagsOverlayView.kt */
    public final class a extends y9q {
        public a(k2o0 k2o0Var) {
            super(k2o0Var);
        }

        @Override // xsna.y9q
        public final int getVirtualViewAt(float f, float f2) {
            int a = k2o0.this.a(f, f2);
            if (a == -1) {
                return Integer.MIN_VALUE;
            }
            return a;
        }

        @Override // xsna.y9q
        public final void getVisibleVirtualViews(List<Integer> list) {
            Iterator it = k2o0.this.c.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                list.add(Integer.valueOf(i));
                i = i2;
            }
        }

        @Override // xsna.y9q
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            k2o0 k2o0Var = k2o0.this;
            ArrayList arrayList = k2o0Var.c;
            if (i2 != 16 || ((PhotoTag) j5g.b0(i, arrayList)) == null) {
                return false;
            }
            k2o0Var.playSoundEffect(0);
            izs<? super PhotoTag, s3q0> izsVar = k2o0Var.e;
            if (izsVar != null) {
                izsVar.invoke(arrayList.get(i));
            }
            k2o0Var.f = null;
            k2o0Var.invalidate();
            return true;
        }

        @Override // xsna.y9q
        public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            PhotoTag photoTag = (PhotoTag) j5g.b0(i, k2o0.this.c);
            if (photoTag != null) {
                accessibilityEvent.getText().add(photoTag.f);
            }
        }

        @Override // xsna.y9q
        public final void onPopulateNodeForVirtualView(int i, am amVar) {
            Rect rect;
            String str;
            k2o0 k2o0Var = k2o0.this;
            PhotoTag photoTag = (PhotoTag) j5g.b0(i, k2o0Var.c);
            RectF rectF = (RectF) k2o0Var.d.get(photoTag);
            if (rectF != null) {
                rect = new Rect();
                rectF.roundOut(rect);
            } else {
                rect = null;
            }
            String str2 = "";
            if (rect == null) {
                amVar.j(new Rect());
                amVar.A("");
                amVar.a.setImportantForAccessibility(false);
                return;
            }
            amVar.j(rect);
            if (photoTag != null && (str = photoTag.f) != null) {
                str2 = str;
            }
            amVar.A(str2);
            amVar.a(16);
            amVar.l(false);
            amVar.C(false);
        }
    }

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t = new PorterDuffColorFilter(-13421773, mode);
        u = new PorterDuffColorFilter(-654311424, mode);
        v = new RectF();
    }

    public k2o0(Context context) {
        super(context, null, 0);
        this.c = new ArrayList();
        this.d = new LinkedHashMap();
        Paint b = rqi.b(3, -654311424);
        this.j = b;
        Paint b2 = rqi.b(1, -1);
        com.vk.typography.b.j(b2, getContext(), FontFamily.MEDIUM, Float.valueOf(12.0f), 8);
        this.k = b2;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.l = paint;
        Path path = new Path();
        path.moveTo(12.586f, 3.633f);
        path.lineTo(9.414f, 0.567f);
        path.rCubicTo(-0.781f, -0.755f, -2.045f, -0.758f, -2.829f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.lineTo(3.415f, 3.633f);
        path.cubicTo(2.633f, 4.388f, 1.105f, 5.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5.0f);
        path.rLineTo(16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.cubicTo(14.895f, 5.0f, 13.369f, 4.391f, 12.586f, 3.633f);
        path.close();
        RectF rectF = v;
        path.computeBounds(rectF, true);
        Matrix matrix = new Matrix();
        matrix.postScale(iah0.f().density, iah0.f().density, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.transform(matrix);
        path.computeBounds(rectF, true);
        Bitmap createBitmap = Bitmap.createBitmap(Math.round(rectF.width()), (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        this.m = createBitmap;
        new Canvas(createBitmap).drawPath(path, b);
        Matrix matrix2 = new Matrix();
        matrix2.setRotate(180.0f);
        this.n = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix2, false);
        this.i = ViewConfiguration.get(context).getScaledTouchSlop();
        a aVar = new a(this);
        this.o = aVar;
        iut0.q(this, aVar);
    }

    private final RectF getDefaultDisplayRect() {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = v;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
        return rectF;
    }

    public final int a(float f, float f2) {
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            RectF rectF = (RectF) this.d.get((PhotoTag) next);
            if (rectF != null && rectF.contains(f, f2)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.o.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.o.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final eea0 getDisplayRectProvider() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF defaultDisplayRect;
        float f;
        RectF rectF;
        boolean z;
        float f2;
        float height;
        float descent;
        eea0 eea0Var = this.b;
        if (eea0Var == null || (defaultDisplayRect = eea0Var.a()) == null) {
            defaultDisplayRect = getDefaultDisplayRect();
        }
        float width = defaultDisplayRect.width();
        float height2 = defaultDisplayRect.height();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            PhotoTag photoTag = (PhotoTag) it.next();
            String str = photoTag.f;
            Paint paint = this.k;
            float measureText = paint.measureText(str);
            double d = photoTag.h;
            float f3 = defaultDisplayRect.left;
            float f4 = 2;
            float b = (io.reactivex.rxjava3.internal.operators.observable.n0.b((float) d, 100.0f, width, f3) + io.reactivex.rxjava3.internal.operators.observable.n0.b((float) photoTag.i, 100.0f, width, f3)) / f4;
            float b2 = io.reactivex.rxjava3.internal.operators.observable.n0.b((float) photoTag.k, 100.0f, height2, defaultDisplayRect.top) + iah0.a(10);
            float f5 = b - (measureText / 2.0f);
            float f6 = q;
            float f7 = f5 + measureText + f6;
            float f8 = width;
            float f9 = defaultDisplayRect.right;
            if (f7 > f9) {
                f5 = (f9 - measureText) - f6;
            }
            float f10 = f5 - f6;
            float f11 = defaultDisplayRect.left;
            if (f10 < f11) {
                f5 = f11 + f6;
            }
            boolean equals = photoTag.equals(this.f);
            Paint paint2 = this.j;
            Paint paint3 = this.l;
            if (equals) {
                f = height2;
                paint2.setColor(-13421773);
                paint3.setColorFilter(t);
            } else {
                f = height2;
                paint2.setColor(-654311424);
                paint3.setColorFilter(u);
            }
            Bitmap bitmap = this.m;
            Iterator it2 = it;
            float descent2 = paint.descent() + (bitmap.getHeight() - paint.ascent());
            float f12 = r;
            float f13 = (f4 * f12) + descent2;
            float f14 = f13 + b2;
            float f15 = b2 - f13;
            float f16 = defaultDisplayRect.bottom;
            boolean z2 = f14 < f16 || f14 - f16 < defaultDisplayRect.top - f15;
            RectF rectF2 = v;
            if (z2) {
                rectF = defaultDisplayRect;
                z = z2;
                f2 = b;
                rectF2.set(f5, bitmap.getHeight() + b2, f5 + measureText, b2 + descent2);
                height = b2 + bitmap.getHeight();
                descent = paint.ascent();
            } else {
                rectF = defaultDisplayRect;
                z = z2;
                f2 = b;
                rectF2.set(f5, b2 - descent2, f5 + measureText, b2 - bitmap.getHeight());
                height = b2 - bitmap.getHeight();
                descent = paint.descent();
            }
            float f17 = height - descent;
            rectF2.inset(-f6, -f12);
            float f18 = s;
            canvas.drawRoundRect(rectF2, f18, f18, paint2);
            canvas.drawText(str, f5, f17, paint);
            if (z) {
                canvas.drawBitmap(bitmap, f2 - (bitmap.getWidth() / 2), (rectF2.top - bitmap.getHeight()) + 1, paint3);
            } else {
                canvas.drawBitmap(this.n, f2 - (bitmap.getWidth() / 2), rectF2.bottom - 1, paint3);
            }
            LinkedHashMap linkedHashMap = this.d;
            RectF rectF3 = (RectF) linkedHashMap.get(photoTag);
            if (rectF3 == null) {
                rectF3 = new RectF();
            }
            rectF3.set(rectF2);
            linkedHashMap.put(photoTag, rectF3);
            width = f8;
            height2 = f;
            it = it2;
            defaultDisplayRect = rectF;
        }
        dac0 dac0Var = this.p;
        if (dac0Var != null) {
            dac0Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.o.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.d.clear();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 2 && this.f != null) {
                float abs = Math.abs(this.g - motionEvent.getX());
                float f = this.i;
                if (abs > f || gq.a(motionEvent, this.h) > f) {
                    this.f = null;
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && this.f != null) {
                int a2 = a(motionEvent.getX(), motionEvent.getY());
                if (a2 != -1) {
                    playSoundEffect(0);
                    izs<? super PhotoTag, s3q0> izsVar = this.e;
                    if (izsVar != null) {
                        izsVar.invoke(this.c.get(a2));
                    }
                    this.f = null;
                    invalidate();
                }
            }
            return true;
        }
        for (Map.Entry entry : j5g.y0(this.d.entrySet())) {
            PhotoTag photoTag = (PhotoTag) entry.getKey();
            if (((RectF) entry.getValue()).contains(motionEvent.getX(), motionEvent.getY())) {
                this.f = photoTag;
                getParent().requestDisallowInterceptTouchEvent(true);
                invalidate();
                this.g = motionEvent.getX();
                this.h = motionEvent.getY();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.d.clear();
    }

    public final void setDisplayRectProvider(eea0 eea0Var) {
        this.b = eea0Var;
    }

    public final void setOnTagClickListener(izs<? super PhotoTag, s3q0> izsVar) {
        this.e = izsVar;
    }

    public final void setPhotoTags(List<PhotoTag> list) {
        this.p = new dac0(this, 18);
        this.d.clear();
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.addAll(list);
        invalidate();
    }
}
