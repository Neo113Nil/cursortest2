package com.google.android.material.loadingindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import defpackage.bk2;
import defpackage.cxg0;
import defpackage.ex21;
import defpackage.jdf;
import defpackage.jub1;
import defpackage.nwt0;
import defpackage.owt0;
import defpackage.rcc;
import defpackage.swh;
import defpackage.tzy;
import defpackage.uzy;
import defpackage.vez0;
import defpackage.vzy;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes11.dex */
public final class LoadingIndicatorDrawable extends Drawable implements Drawable.Callback {
    int alpha;
    private a animatorDelegate;
    private final Context context;
    private uzy drawingDelegate;
    private final vzy specs;
    private Drawable staticDummyDrawable;
    bk2 animatorDurationScaleProvider = new bk2();
    Paint paint = new Paint();

    public LoadingIndicatorDrawable(Context context, vzy vzyVar, uzy uzyVar, a aVar) {
        this.context = context;
        this.specs = vzyVar;
        this.drawingDelegate = uzyVar;
        this.animatorDelegate = aVar;
        aVar.g = this;
        setAlpha(255);
    }

    public static LoadingIndicatorDrawable create(Context context, vzy vzyVar) {
        uzy uzyVar = new uzy(vzyVar);
        a aVar = new a();
        aVar.f = vzyVar;
        aVar.h = new tzy();
        LoadingIndicatorDrawable loadingIndicatorDrawable = new LoadingIndicatorDrawable(context, vzyVar, uzyVar, aVar);
        loadingIndicatorDrawable.setStaticDummyDrawable(VectorDrawableCompat.create(context.getResources(), cxg0.ic_mtrl_arrow_circle, null));
        return loadingIndicatorDrawable;
    }

    private boolean isSystemAnimatorDisabled() {
        return this.animatorDurationScaleProvider != null && bk2.a(this.context.getContentResolver()) == 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        Drawable drawable;
        Rect rect = new Rect();
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            int i2 = 0;
            if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
                drawable.setBounds(bounds);
                this.staticDummyDrawable.setTint(this.specs.d[0]);
                this.staticDummyDrawable.draw(canvas);
                return;
            }
            canvas.save();
            uzy uzyVar = this.drawingDelegate;
            uzyVar.getClass();
            vzy vzyVar = uzyVar.a;
            canvas.translate(bounds.centerX(), bounds.centerY());
            vzyVar.getClass();
            float f = 2.0f;
            canvas.clipRect((-Math.max(vzyVar.c, vzyVar.a)) / 2.0f, (-Math.max(vzyVar.b, vzyVar.a)) / 2.0f, Math.max(vzyVar.c, vzyVar.a) / 2.0f, Math.max(vzyVar.b, vzyVar.a) / 2.0f);
            canvas.rotate(-90.0f);
            uzy uzyVar2 = this.drawingDelegate;
            Paint paint = this.paint;
            int i3 = this.specs.e;
            int alpha = getAlpha();
            vzy vzyVar2 = uzyVar2.a;
            float min = Math.min(vzyVar2.b, vzyVar2.c) / 2.0f;
            paint.setColor(vez0.d(i3, alpha));
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            canvas.drawRoundRect(new RectF((-r9) / 2.0f, (-r2) / 2.0f, vzyVar2.b / 2.0f, vzyVar2.c / 2.0f), min, min, paint);
            uzy uzyVar3 = this.drawingDelegate;
            Paint paint2 = this.paint;
            tzy tzyVar = this.animatorDelegate.h;
            int alpha2 = getAlpha();
            Matrix matrix = uzyVar3.c;
            paint2.setColor(vez0.d(tzyVar.a, alpha2));
            paint2.setStyle(style);
            canvas.save();
            canvas.rotate(tzyVar.c);
            Path path = uzyVar3.b;
            path.rewind();
            int floor = (int) Math.floor(tzyVar.b);
            swh[] swhVarArr = uzy.e;
            int length = swhVarArr.length;
            int i4 = floor / length;
            if ((floor ^ length) < 0 && i4 * length != floor) {
                i4--;
            }
            float f2 = tzyVar.b - floor;
            swh swhVar = swhVarArr[floor - (i4 * length)];
            ListBuilder a = rcc.a();
            ArrayList arrayList = swhVar.a;
            int size = arrayList.size();
            jdf jdfVar = null;
            int i5 = 0;
            jdf jdfVar2 = null;
            while (i5 < size) {
                float[] fArr = new float[8];
                int i6 = i2;
                for (int i7 = 8; i2 < i7; i7 = 8) {
                    fArr[i2] = ex21.c(((jdf) ((Pair) arrayList.get(i5)).c()).a[i2], ((jdf) ((Pair) arrayList.get(i5)).f()).a[i2], f2);
                    i2++;
                    f = f;
                }
                float f3 = f;
                jdf jdfVar3 = new jdf(fArr);
                if (jdfVar2 == null) {
                    jdfVar2 = jdfVar3;
                }
                if (jdfVar != null) {
                    a.add(jdfVar);
                }
                i5++;
                jdfVar = jdfVar3;
                i2 = i6;
                f = f3;
            }
            int i8 = i2;
            float f4 = f;
            if (jdfVar != null && jdfVar2 != null) {
                float[] fArr2 = jdfVar.a;
                float f5 = fArr2[i8];
                float f6 = fArr2[1];
                float f7 = fArr2[2];
                float f8 = fArr2[3];
                float f9 = fArr2[4];
                float f10 = fArr2[5];
                float[] fArr3 = jdfVar2.a;
                a.add(jub1.a(f5, f6, f7, f8, f9, f10, fArr3[i8], fArr3[1]));
            }
            ListBuilder j = a.j();
            path.rewind();
            int i9 = i8;
            int i10 = 1;
            for (int size2 = j.size(); i9 < size2; size2 = size2) {
                jdf jdfVar4 = (jdf) j.get(i9);
                if (i10 != 0) {
                    float[] fArr4 = jdfVar4.a;
                    path.moveTo(fArr4[i8], fArr4[1]);
                    i = i8;
                } else {
                    i = i10;
                }
                float[] fArr5 = jdfVar4.a;
                path.cubicTo(fArr5[2], fArr5[3], fArr5[4], fArr5[5], jdfVar4.a(), jdfVar4.b());
                i9++;
                i10 = i;
            }
            path.close();
            float f11 = uzyVar3.a.a / f4;
            matrix.setScale(f11, f11);
            path.transform(matrix);
            canvas.drawPath(path, paint2);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    public a getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    public uzy getDrawingDelegate() {
        return this.drawingDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        vzy vzyVar = this.drawingDelegate.a;
        return Math.max(vzyVar.b, vzyVar.a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        vzy vzyVar = this.drawingDelegate.a;
        return Math.max(vzyVar.c, vzyVar.a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            invalidateSelf();
        }
    }

    public void setAnimatorDelegate(a aVar) {
        this.animatorDelegate = aVar;
        aVar.g = this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDrawingDelegate(uzy uzyVar) {
        this.drawingDelegate = uzyVar;
    }

    public void setStaticDummyDrawable(Drawable drawable) {
        this.staticDummyDrawable = drawable;
    }

    public boolean setVisible(boolean z, boolean z2, boolean z3) {
        boolean visible = super.setVisible(z, z2);
        a aVar = this.animatorDelegate;
        ObjectAnimator objectAnimator = aVar.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        nwt0 nwt0Var = aVar.e;
        if (nwt0Var != null) {
            nwt0Var.j();
        }
        if (z && z3 && !isSystemAnimatorDisabled()) {
            final a aVar2 = this.animatorDelegate;
            if (aVar2.e == null) {
                nwt0 nwt0Var2 = new nwt0(aVar2, a.j);
                owt0 owt0Var = new owt0();
                owt0Var.b(200.0f);
                owt0Var.a(0.6f);
                nwt0Var2.u = owt0Var;
                nwt0Var2.e(0.01f);
                aVar2.e = nwt0Var2;
            }
            if (aVar2.d == null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar2, (Property<a, Float>) a.i, 0.0f, 1.0f);
                aVar2.d = ofFloat;
                ofFloat.setDuration(650L);
                aVar2.d.setInterpolator(null);
                aVar2.d.setRepeatCount(-1);
                aVar2.d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.loadingindicator.LoadingIndicatorAnimatorDelegate$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        super.onAnimationRepeat(animator);
                        a aVar3 = a.this;
                        nwt0 nwt0Var3 = aVar3.e;
                        int i = aVar3.a + 1;
                        aVar3.a = i;
                        nwt0Var3.i(i);
                    }
                });
            }
            aVar2.a = 1;
            aVar2.a(0.0f);
            aVar2.h.a = aVar2.f.d[0];
            aVar2.e.i(aVar2.a);
            aVar2.d.start();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2, z);
    }
}
