package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import defpackage.vvb;
import defpackage.wvb;
import defpackage.xvb;

/* loaded from: classes11.dex */
public class CircularRevealRelativeLayout extends RelativeLayout implements xvb {
    private final vvb helper;

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.helper = new vvb(this);
    }

    @Override // defpackage.xvb
    public void actualDraw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // defpackage.xvb
    public boolean actualIsOpaque() {
        return super.isOpaque();
    }

    @Override // defpackage.xvb
    public void buildCircularRevealCache() {
        this.helper.getClass();
    }

    @Override // defpackage.xvb
    public void destroyCircularRevealCache() {
        this.helper.getClass();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        vvb vvbVar = this.helper;
        if (vvbVar != null) {
            vvbVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.helper.e;
    }

    @Override // defpackage.xvb
    public int getCircularRevealScrimColor() {
        return this.helper.c.getColor();
    }

    @Override // defpackage.xvb
    public wvb getRevealInfo() {
        return this.helper.b();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        vvb vvbVar = this.helper;
        return vvbVar != null ? vvbVar.c() : super.isOpaque();
    }

    @Override // defpackage.xvb
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.helper.d(drawable);
    }

    @Override // defpackage.xvb
    public void setCircularRevealScrimColor(int i) {
        this.helper.e(i);
    }

    @Override // defpackage.xvb
    public void setRevealInfo(wvb wvbVar) {
        this.helper.f(wvbVar);
    }

    public CircularRevealRelativeLayout(Context context) {
        this(context, null);
    }
}
