package com.yandex.passport.sloth.ui;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import defpackage.kp31;
import defpackage.li91;
import defpackage.lzx;
import defpackage.t2y;
import defpackage.uc20;
import defpackage.wj91;

/* loaded from: classes2.dex */
public final class o0 extends t2y {
    public final Activity c;
    public final com.yandex.passport.sloth.ui.dependencies.o w;
    public final WebView x;
    public final i2 y;

    /* JADX WARN: Multi-variable type inference failed */
    public o0(Activity activity, com.yandex.passport.sloth.ui.string.a aVar, com.yandex.passport.sloth.ui.dependencies.o oVar) {
        super(activity);
        this.c = activity;
        this.w = oVar;
        View view = (View) SlothUi$special$$inlined$webView$default$1.b.invoke(wj91.e(0, activity), 0, 0);
        if (this instanceof lzx) {
            ((lzx) this).addToParent(view);
        }
        WebView webView = (WebView) view;
        webView.setVisibility(8);
        this.x = webView;
        this.y = new i2(activity, aVar, oVar);
    }

    @Override // defpackage.t2y
    public final View b(kp31 kp31Var) {
        FrameLayoutBuilder frameLayoutBuilder = new FrameLayoutBuilder(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(frameLayoutBuilder);
        }
        frameLayoutBuilder.setLayoutTransition(new LayoutTransition());
        com.yandex.passport.sloth.ui.dependencies.o oVar = this.w;
        com.yandex.passport.sloth.ui.dependencies.i b = oVar.b();
        if (b instanceof com.yandex.passport.sloth.ui.dependencies.h) {
            frameLayoutBuilder.setBackgroundResource(((com.yandex.passport.sloth.ui.dependencies.h) b).a);
        } else {
            li91.g(oVar.f().b, frameLayoutBuilder);
        }
        frameLayoutBuilder.invoke(this.x, new s(2, frameLayoutBuilder, this));
        wj91.e(0, frameLayoutBuilder.getCtx());
        frameLayoutBuilder.addToParent(this.y.getRoot());
        ViewGroup.LayoutParams generateLayoutParams = frameLayoutBuilder.generateLayoutParams(-2, -2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) generateLayoutParams;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
        int i = (int) (44.0f * uc20.a.density);
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        frameLayoutBuilder.setLayoutParams(generateLayoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = -1;
        frameLayoutBuilder.setLayoutParams(layoutParams2);
        return frameLayoutBuilder;
    }
}
