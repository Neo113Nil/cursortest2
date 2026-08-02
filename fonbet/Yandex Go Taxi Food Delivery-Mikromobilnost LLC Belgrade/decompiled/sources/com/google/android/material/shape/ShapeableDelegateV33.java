package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import defpackage.vir0;

/* loaded from: classes11.dex */
public final class ShapeableDelegateV33 extends vir0 {
    public ShapeableDelegateV33(FrameLayout frameLayout) {
        d(frameLayout);
    }

    private void d(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV33.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                if (ShapeableDelegateV33.this.e.isEmpty()) {
                    return;
                }
                outline.setPath(ShapeableDelegateV33.this.e);
            }
        });
    }

    @Override // defpackage.vir0
    public final void a(FrameLayout frameLayout) {
        frameLayout.setClipToOutline(!this.a);
        if (this.a) {
            frameLayout.invalidate();
        } else {
            frameLayout.invalidateOutline();
        }
    }

    @Override // defpackage.vir0
    public final boolean b() {
        return this.a;
    }
}
