package com.yandex.passport.internal.ui.common.web;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import com.yandex.passport.R;
import com.yandex.passport.api.ProgressAnimation;
import com.yandex.passport.api.n3;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.p;
import defpackage.iog0;
import defpackage.l7e;
import defpackage.li91;
import defpackage.n7e;
import defpackage.tls;
import defpackage.uw51;
import defpackage.wj91;
import defpackage.zy11;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class j extends l7e {
    public final ViewGroup A;
    public final ProgressPropertiesImpl w;
    public final View x;
    public final n3 y;
    public final WebView z;

    public j(Activity activity, ProgressPropertiesImpl progressPropertiesImpl, p pVar) {
        super(activity);
        ViewGroup viewGroup;
        this.w = progressPropertiesImpl;
        this.x = com.yandex.passport.common.ui.b.b(this, activity, progressPropertiesImpl, pVar.w, 1.0f, 16);
        this.y = progressPropertiesImpl.getSize().toSize();
        int i = R.id.webview;
        View view = (View) WebViewUi$special$$inlined$webView$default$1.b.invoke(wj91.e(0, this.a), 0, 0);
        if (i != -1) {
            view.setId(i);
        }
        addToParent(view);
        WebView webView = (WebView) view;
        webView.setBackgroundColor(com.yandex.passport.internal.ui.c.q(iog0.colorBackgroundFloating, webView.getContext()));
        webView.setVisibility(8);
        ConstraintLayout.LayoutParams generateLayoutParams = this.b.generateLayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) generateLayoutParams).width = 0;
        ((ViewGroup.MarginLayoutParams) generateLayoutParams).height = 0;
        View decorView = activity.getWindow().getDecorView();
        com.yandex.passport.internal.ui.a aVar = new com.yandex.passport.internal.ui.a(9, generateLayoutParams);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(decorView, aVar);
        webView.setLayoutParams(generateLayoutParams);
        this.z = webView;
        int currentModeType = ((UiModeManager) this.a.getSystemService("uimode")).getCurrentModeType();
        Context context = this.a;
        if (currentModeType == 4) {
            View inflate = ((LayoutInflater) wj91.e(0, context).getSystemService("layout_inflater")).inflate(R.layout.passport_activity_web_view_error_layout, (ViewGroup) null, false);
            addToParent(inflate);
            viewGroup = (ViewGroup) inflate;
        } else {
            View inflate2 = ((LayoutInflater) wj91.e(0, context).getSystemService("layout_inflater")).inflate(R.layout.passport_activity_web_view_error_layout, (ViewGroup) null, false);
            addToParent(inflate2);
            viewGroup = (ViewGroup) inflate2;
        }
        this.A = viewGroup;
    }

    @Override // defpackage.l7e
    public final void a(final ConstraintSetBuilder constraintSetBuilder) {
        final int i = 0;
        constraintSetBuilder.A(new tls(this) { // from class: com.yandex.passport.internal.ui.common.web.i
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                ConstraintSetBuilder constraintSetBuilder2 = constraintSetBuilder;
                j jVar = this.b;
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                switch (i2) {
                    case 0:
                        ProgressPropertiesImpl progressPropertiesImpl = jVar.w;
                        n3 n3Var = jVar.y;
                        cVar.d(progressPropertiesImpl.getAnimation() instanceof ProgressAnimation.Lottie ? n3Var.a : 0);
                        cVar.c(n3Var.b);
                        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                        n7e d = uw51.d(side, side, cVar, 0);
                        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.BOTTOM;
                        n7e d2 = uw51.d(side2, side2, cVar, 0);
                        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.START;
                        n7e d3 = uw51.d(side3, side3, cVar, 0);
                        ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(d, d2, d3, uw51.d(side4, side4, cVar, 0));
                        break;
                    default:
                        if (((UiModeManager) jVar.a.getSystemService("uimode")).getCurrentModeType() == 4) {
                            cVar.d(0);
                            cVar.c(0);
                        }
                        ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.TOP;
                        n7e d4 = uw51.d(side5, side5, cVar, 0);
                        ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.BOTTOM;
                        n7e d5 = uw51.d(side6, side6, cVar, 0);
                        ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.START;
                        n7e d6 = uw51.d(side7, side7, cVar, 0);
                        ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(d4, d5, d6, uw51.d(side8, side8, cVar, 0));
                        break;
                }
                return zy11Var;
            }
        }, this.x);
        constraintSetBuilder.A(new com.yandex.passport.internal.ui.bouncer.error.b(6, constraintSetBuilder), this.z);
        final int i2 = 1;
        constraintSetBuilder.A(new tls(this) { // from class: com.yandex.passport.internal.ui.common.web.i
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                ConstraintSetBuilder constraintSetBuilder2 = constraintSetBuilder;
                j jVar = this.b;
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                switch (i22) {
                    case 0:
                        ProgressPropertiesImpl progressPropertiesImpl = jVar.w;
                        n3 n3Var = jVar.y;
                        cVar.d(progressPropertiesImpl.getAnimation() instanceof ProgressAnimation.Lottie ? n3Var.a : 0);
                        cVar.c(n3Var.b);
                        ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                        n7e d = uw51.d(side, side, cVar, 0);
                        ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.BOTTOM;
                        n7e d2 = uw51.d(side2, side2, cVar, 0);
                        ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.START;
                        n7e d3 = uw51.d(side3, side3, cVar, 0);
                        ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(d, d2, d3, uw51.d(side4, side4, cVar, 0));
                        break;
                    default:
                        if (((UiModeManager) jVar.a.getSystemService("uimode")).getCurrentModeType() == 4) {
                            cVar.d(0);
                            cVar.c(0);
                        }
                        ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.TOP;
                        n7e d4 = uw51.d(side5, side5, cVar, 0);
                        ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.BOTTOM;
                        n7e d5 = uw51.d(side6, side6, cVar, 0);
                        ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.START;
                        n7e d6 = uw51.d(side7, side7, cVar, 0);
                        ConstraintSetBuilder.Side side8 = ConstraintSetBuilder.Side.END;
                        constraintSetBuilder2.z(d4, d5, d6, uw51.d(side8, side8, cVar, 0));
                        break;
                }
                return zy11Var;
            }
        }, this.A);
    }

    @Override // defpackage.l7e
    public final void c(ConstraintLayout constraintLayout) {
        li91.g(R.color.passport_roundabout_background, constraintLayout);
    }
}
