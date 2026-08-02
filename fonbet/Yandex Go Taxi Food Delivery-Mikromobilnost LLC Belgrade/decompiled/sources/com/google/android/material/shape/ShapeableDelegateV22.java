package com.google.android.material.shape;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import defpackage.dyk0;
import defpackage.vir0;

/* loaded from: classes11.dex */
public final class ShapeableDelegateV22 extends vir0 {
    public boolean f = false;
    public float g = 0.0f;

    public ShapeableDelegateV22(FrameLayout frameLayout) {
        d(frameLayout);
    }

    private void d(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV22.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                ShapeableDelegateV22 shapeableDelegateV22 = ShapeableDelegateV22.this;
                if (shapeableDelegateV22.c == null || shapeableDelegateV22.d.isEmpty()) {
                    return;
                }
                ShapeableDelegateV22 shapeableDelegateV222 = ShapeableDelegateV22.this;
                RectF rectF = shapeableDelegateV222.d;
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, shapeableDelegateV222.g);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    @Override // defpackage.vir0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(FrameLayout frameLayout) {
        b bVar;
        b bVar2;
        RectF rectF;
        b bVar3 = this.c;
        this.g = (bVar3 == null || (rectF = this.d) == null) ? 0.0f : bVar3.f.a(rectF);
        boolean z = false;
        if (!((this.d.isEmpty() || (bVar2 = this.c) == null) ? false : bVar2.l(this.d))) {
            if (!this.d.isEmpty() && (bVar = this.c) != null && this.b && !bVar.l(this.d)) {
                b bVar4 = this.c;
                if ((bVar4.a instanceof dyk0) && (bVar4.b instanceof dyk0) && (bVar4.d instanceof dyk0) && (bVar4.c instanceof dyk0)) {
                    float a = bVar4.e.a(this.d);
                    float a2 = this.c.f.a(this.d);
                    float a3 = this.c.h.a(this.d);
                    float a4 = this.c.g.a(this.d);
                    if (a == 0.0f && a3 == 0.0f && a2 == a4) {
                        RectF rectF2 = this.d;
                        rectF2.set(rectF2.left - a2, rectF2.top, rectF2.right, rectF2.bottom);
                        this.g = a2;
                    } else if (a == 0.0f && a2 == 0.0f && a3 == a4) {
                        RectF rectF3 = this.d;
                        rectF3.set(rectF3.left, rectF3.top - a3, rectF3.right, rectF3.bottom);
                        this.g = a3;
                    } else if (a2 == 0.0f && a4 == 0.0f && a == a3) {
                        RectF rectF4 = this.d;
                        rectF4.set(rectF4.left, rectF4.top, rectF4.right + a, rectF4.bottom);
                        this.g = a;
                    } else if (a3 == 0.0f && a4 == 0.0f && a == a2) {
                        RectF rectF5 = this.d;
                        rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + a);
                        this.g = a;
                    }
                }
            }
            this.f = z;
            frameLayout.setClipToOutline(!b());
            if (b()) {
                frameLayout.invalidateOutline();
                return;
            } else {
                frameLayout.invalidate();
                return;
            }
        }
        z = true;
        this.f = z;
        frameLayout.setClipToOutline(!b());
        if (b()) {
        }
    }

    @Override // defpackage.vir0
    public final boolean b() {
        return !this.f || this.a;
    }
}
