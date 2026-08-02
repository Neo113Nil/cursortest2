package com.yandex.alicekit.core.artist;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import defpackage.g730;
import defpackage.gjb1;
import defpackage.w73;

/* loaded from: classes11.dex */
public class ArtistDrawable<A extends w73> extends Drawable {
    private final A mArtist;
    private int mIntrinsicWidth = -1;
    private int mIntrinsicHeight = -1;

    public ArtistDrawable(A a) {
        this.mArtist = a;
        ((g730) a).o = true;
    }

    private void onBoundsChange(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i2;
        g730 g730Var = (g730) this.mArtist;
        PointF pointF = g730Var.g;
        RectF rectF = g730Var.e;
        if (!gjb1.b(rectF.width(), f) || !gjb1.b(rectF.height(), f2)) {
            if (pointF.equals(0.0f, 0.0f)) {
                rectF.set(0.0f, 0.0f, f, f2);
            } else {
                float f3 = pointF.x;
                float f4 = f / 2.0f;
                float f5 = pointF.y;
                float f6 = f2 / 2.0f;
                rectF.set(f3 - f4, f5 - f6, f3 + f4, f5 + f6);
            }
            g730Var.n = true;
        }
        g730 g730Var2 = (g730) this.mArtist;
        PointF pointF2 = g730Var2.g;
        float f7 = i3;
        float f8 = i4;
        pointF2.set(f7, f8);
        RectF rectF2 = g730Var2.e;
        float width = rectF2.width();
        float height = rectF2.height();
        if (pointF2.equals(0.0f, 0.0f)) {
            rectF2.set(0.0f, 0.0f, width, height);
        } else {
            float f9 = width / 2.0f;
            float f10 = height / 2.0f;
            rectF2.set(f7 - f9, f8 - f10, f7 + f9, f8 + f10);
        }
        g730Var2.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        g730 g730Var = (g730) this.mArtist;
        PointF pointF = g730Var.h;
        float f2 = g730Var.m;
        Path path = g730Var.c;
        Paint paint = g730Var.k;
        Path path2 = g730Var.b;
        if (g730Var.o) {
            boolean z = true;
            if (g730Var.n) {
                RectF rectF = g730Var.e;
                Matrix matrix = g730Var.i;
                matrix.reset();
                RectF rectF2 = g730Var.j;
                if (rectF2 == null) {
                    rectF2 = g730Var.d;
                }
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                g730Var.a.transform(matrix, path2);
                if (f2 != 1.0f) {
                    float f3 = (f2 + 0.0f) % 1.0f;
                    if (g730Var.l == null) {
                        g730Var.l = new PathMeasure();
                    }
                    g730Var.l.setPath(path2, false);
                    float length = g730Var.l.getLength();
                    float f4 = 0.0f * length;
                    float f5 = f3 * length;
                    path.reset();
                    f = 1.0f;
                    PathMeasure pathMeasure = g730Var.l;
                    if (f4 > f5) {
                        pathMeasure.getSegment(f4, length, path, true);
                        g730Var.l.getSegment(0.0f, f5, path, true);
                    } else {
                        pathMeasure.getSegment(f4, f5, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                } else {
                    f = 1.0f;
                }
                g730Var.f.set(rectF);
                Shader shader = paint.getShader();
                if (shader != null) {
                    shader.setLocalMatrix(matrix);
                }
            } else {
                f = 1.0f;
            }
            g730Var.n = false;
            boolean equals = pointF.equals(0.0f, 0.0f);
            boolean b = gjb1.b(0.0f, 0.0f);
            if (b && equals) {
                z = false;
            }
            if (z) {
                canvas.save();
            }
            if (!equals) {
                canvas.translate(pointF.x, pointF.y);
            }
            if (!b) {
                PointF pointF2 = g730Var.g;
                canvas.rotate(0.0f, pointF2.x, pointF2.y);
            }
            if (f2 == f) {
                path = path2;
            }
            canvas.drawPath(path, paint);
            if (z) {
                canvas.restore();
            }
        }
    }

    public A getArtist() {
        return this.mArtist;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mIntrinsicHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mIntrinsicWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAlpha(int i) {
        float f = i;
        g730 g730Var = (g730) this.mArtist;
        g730Var.getClass();
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        g730Var.k.setAlpha(Math.round(f * 255.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    public void setIntrinsicSize(int i, int i2) {
        this.mIntrinsicWidth = i;
        this.mIntrinsicHeight = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int width = rect.width();
        int height = rect.height();
        onBoundsChange(width, height, (width / 2) + rect.left, (height / 2) + rect.top);
    }
}
