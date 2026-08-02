package com.pdfview.subsamplincscaleimageview;

import android.graphics.PointF;

/* loaded from: classes11.dex */
public final class b {
    public final float a;
    public final PointF b;
    public final PointF c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ SubsamplingScaleImageView i;

    public b(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
        this.i = subsamplingScaleImageView;
        this.d = 500L;
        this.e = 2;
        this.f = 1;
        this.g = true;
        this.h = true;
        this.a = subsamplingScaleImageView.scale;
        this.b = pointF;
        this.c = null;
    }

    public final void a() {
        a aVar;
        float limitedScale;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        a aVar6;
        a aVar7;
        a aVar8;
        a aVar9;
        a aVar10;
        a aVar11;
        a aVar12;
        a aVar13;
        a aVar14;
        a aVar15;
        a aVar16;
        a aVar17;
        a aVar18;
        a aVar19;
        SubsamplingScaleImageView subsamplingScaleImageView = this.i;
        aVar = subsamplingScaleImageView.anim;
        if (aVar != null) {
            aVar19 = subsamplingScaleImageView.anim;
            aVar19.getClass();
        }
        int width = (((subsamplingScaleImageView.getWidth() - subsamplingScaleImageView.getPaddingRight()) - subsamplingScaleImageView.getPaddingLeft()) / 2) + subsamplingScaleImageView.getPaddingLeft();
        int height = (((subsamplingScaleImageView.getHeight() - subsamplingScaleImageView.getPaddingBottom()) - subsamplingScaleImageView.getPaddingTop()) / 2) + subsamplingScaleImageView.getPaddingTop();
        limitedScale = subsamplingScaleImageView.limitedScale(this.a);
        boolean z = this.h;
        PointF pointF = this.b;
        if (z) {
            pointF = subsamplingScaleImageView.limitedSCenter(pointF.x, pointF.y, limitedScale, new PointF());
        }
        a aVar20 = new a();
        aVar20.h = 500L;
        aVar20.i = true;
        aVar20.j = 2;
        aVar20.k = 1;
        aVar20.l = System.currentTimeMillis();
        subsamplingScaleImageView.anim = aVar20;
        aVar2 = subsamplingScaleImageView.anim;
        aVar2.a = subsamplingScaleImageView.scale;
        aVar3 = subsamplingScaleImageView.anim;
        aVar3.b = limitedScale;
        aVar4 = subsamplingScaleImageView.anim;
        aVar4.l = System.currentTimeMillis();
        aVar5 = subsamplingScaleImageView.anim;
        aVar5.e = pointF;
        aVar6 = subsamplingScaleImageView.anim;
        aVar6.c = subsamplingScaleImageView.getCenter();
        aVar7 = subsamplingScaleImageView.anim;
        aVar7.d = pointF;
        aVar8 = subsamplingScaleImageView.anim;
        aVar8.f = subsamplingScaleImageView.sourceToViewCoord(pointF);
        aVar9 = subsamplingScaleImageView.anim;
        aVar9.g = new PointF(width, height);
        aVar10 = subsamplingScaleImageView.anim;
        aVar10.h = this.d;
        aVar11 = subsamplingScaleImageView.anim;
        aVar11.i = this.g;
        aVar12 = subsamplingScaleImageView.anim;
        aVar12.j = this.e;
        aVar13 = subsamplingScaleImageView.anim;
        aVar13.k = this.f;
        aVar14 = subsamplingScaleImageView.anim;
        aVar14.l = System.currentTimeMillis();
        aVar15 = subsamplingScaleImageView.anim;
        aVar15.getClass();
        PointF pointF2 = this.c;
        if (pointF2 != null) {
            float f = pointF2.x;
            aVar16 = subsamplingScaleImageView.anim;
            float f2 = f - (aVar16.c.x * limitedScale);
            float f3 = pointF2.y;
            aVar17 = subsamplingScaleImageView.anim;
            float f4 = f3 - (aVar17.c.y * limitedScale);
            PointF pointF3 = new PointF(f2, f4);
            subsamplingScaleImageView.fitToBounds(true, new c(limitedScale, pointF3));
            aVar18 = subsamplingScaleImageView.anim;
            aVar18.g = new PointF((pointF3.x - f2) + pointF2.x, (pointF3.y - f4) + pointF2.y);
        }
        subsamplingScaleImageView.invalidate();
    }

    public b(SubsamplingScaleImageView subsamplingScaleImageView, float f) {
        this.i = subsamplingScaleImageView;
        this.d = 500L;
        this.e = 2;
        this.f = 1;
        this.g = true;
        this.h = true;
        this.a = f;
        this.b = subsamplingScaleImageView.getCenter();
        this.c = null;
    }

    public b(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF) {
        this.i = subsamplingScaleImageView;
        this.d = 500L;
        this.e = 2;
        this.f = 1;
        this.g = true;
        this.h = true;
        this.a = f;
        this.b = pointF;
        this.c = null;
    }

    public b(SubsamplingScaleImageView subsamplingScaleImageView, float f, PointF pointF, PointF pointF2) {
        this.i = subsamplingScaleImageView;
        this.d = 500L;
        this.e = 2;
        this.f = 1;
        this.g = true;
        this.h = true;
        this.a = f;
        this.b = pointF;
        this.c = pointF2;
    }
}
