package com.lightside.artists;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import defpackage.ejb1;
import defpackage.sq90;
import defpackage.x73;

/* loaded from: classes11.dex */
public class ArtistDrawable<A extends x73> extends Drawable {
    private final A mArtist;
    private int mIntrinsicWidth = -1;
    private int mIntrinsicHeight = -1;

    public ArtistDrawable(A a) {
        this.mArtist = a;
        ((sq90) a).p = true;
    }

    private void onBoundsChange(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i2;
        sq90 sq90Var = (sq90) this.mArtist;
        PointF pointF = sq90Var.g;
        RectF rectF = sq90Var.e;
        if (!ejb1.b(rectF.width(), f) || !ejb1.b(rectF.height(), f2)) {
            if (pointF.equals(0.0f, 0.0f)) {
                rectF.set(0.0f, 0.0f, f, f2);
            } else {
                float f3 = pointF.x;
                float f4 = f / 2.0f;
                float f5 = pointF.y;
                float f6 = f2 / 2.0f;
                rectF.set(f3 - f4, f5 - f6, f3 + f4, f5 + f6);
            }
            sq90Var.n = true;
        }
        sq90 sq90Var2 = (sq90) this.mArtist;
        PointF pointF2 = sq90Var2.g;
        float f7 = i3;
        float f8 = i4;
        pointF2.set(f7, f8);
        RectF rectF2 = sq90Var2.e;
        float width = rectF2.width();
        float height = rectF2.height();
        if (pointF2.equals(0.0f, 0.0f)) {
            rectF2.set(0.0f, 0.0f, width, height);
        } else {
            float f9 = width / 2.0f;
            float f10 = height / 2.0f;
            rectF2.set(f7 - f9, f8 - f10, f7 + f9, f8 + f10);
        }
        sq90Var2.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        sq90 sq90Var = (sq90) this.mArtist;
        PointF pointF = sq90Var.h;
        Path path = sq90Var.b;
        if (sq90Var.p) {
            if (sq90Var.n) {
                RectF rectF = sq90Var.e;
                Matrix matrix = sq90Var.i;
                matrix.reset();
                RectF rectF2 = sq90Var.j;
                if (rectF2 == null) {
                    rectF2 = sq90Var.d;
                }
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                sq90Var.a.transform(matrix, path);
                sq90Var.b();
                sq90Var.f.set(rectF);
                Shader shader = sq90Var.k.getShader();
                if (shader != null) {
                    shader.setLocalMatrix(matrix);
                }
            } else if (sq90Var.o) {
                sq90Var.b();
            }
            sq90Var.n = false;
            sq90Var.o = false;
            boolean equals = pointF.equals(0.0f, 0.0f);
            boolean b = ejb1.b(0.0f, 0.0f);
            boolean z = (b && equals) ? false : true;
            if (z) {
                canvas.save();
            }
            if (!equals) {
                canvas.translate(pointF.x, pointF.y);
            }
            if (!b) {
                PointF pointF2 = sq90Var.g;
                canvas.rotate(0.0f, pointF2.x, pointF2.y);
            }
            if (sq90Var.m != 1.0f) {
                path = sq90Var.c;
            }
            canvas.drawPath(path, sq90Var.k);
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
    @Deprecated
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
        sq90 sq90Var = (sq90) this.mArtist;
        sq90Var.getClass();
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        sq90Var.k.setAlpha(Math.round(f * 255.0f));
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
