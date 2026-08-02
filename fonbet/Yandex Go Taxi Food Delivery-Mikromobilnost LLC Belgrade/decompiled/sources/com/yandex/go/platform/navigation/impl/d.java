package com.yandex.go.platform.navigation.impl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat$Api21Impl;
import defpackage.aj31;
import defpackage.apg0;
import defpackage.bvf0;
import defpackage.cma1;
import defpackage.cmm0;
import defpackage.e6q;
import defpackage.eyh0;
import defpackage.fx00;
import defpackage.g8e;
import defpackage.gmp;
import defpackage.gtq0;
import defpackage.h8;
import defpackage.hz40;
import defpackage.i3h0;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.lb20;
import defpackage.mdh;
import defpackage.n650;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pa50;
import defpackage.pmp;
import defpackage.s6h0;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tmp;
import defpackage.unr0;
import defpackage.uyj;
import defpackage.w53;
import defpackage.xuh0;
import defpackage.yg50;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.PropertyReference0;

/* loaded from: classes13.dex */
public final class d implements pa50 {
    public final Context a;
    public final sls b;
    public final c c;
    public final i3y d = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.navigation.impl.NavigatorViewHolderImpl$contentContainer$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            FrameLayout frameLayout = new FrameLayout(d.this.a);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            frameLayout.setId(View.generateViewId());
            return frameLayout;
        }
    });
    public final i3y e = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.navigation.impl.NavigatorViewHolderImpl$bottomNavigationView$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            LinearLayout linearLayout = new LinearLayout(d.this.a);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(0);
            linearLayout.setVisibility(8);
            linearLayout.setBackgroundColor(linearLayout.getContext().getColor(apg0.warm_gray_100));
            return linearLayout;
        }
    });
    public final i3y f;
    public final i3y g;
    public final e6q h;
    public final aj31 i;
    public com.yandex.go.platform.navigation.model.a j;
    public final hz40 k;
    public final ike l;
    public final kotlinx.coroutines.sync.a m;

    public d(lb20 lb20Var, Context context, sls slsVar, c cVar, final sls slsVar2) {
        this.a = context;
        this.b = slsVar;
        this.c = cVar;
        i3y a = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.navigation.impl.NavigatorViewHolderImpl$rootView$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                LinearLayout linearLayout = new LinearLayout(d.this.a);
                d dVar = d.this;
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout.setOrientation(1);
                linearLayout.addView((FrameLayout) dVar.d.getValue());
                linearLayout.addView(dVar.c());
                yg50 yg50Var = new yg50(dVar);
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                ViewCompat$Api21Impl.o(linearLayout, yg50Var);
                return linearLayout;
            }
        });
        this.f = a;
        this.g = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.navigation.impl.NavigatorViewHolderImpl$mainScreenFeature$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i = i3h0.ic_main_screen;
                int i2 = eyh0.main_screen_navigation_name;
                return new com.yandex.go.platform.navigation.model.a(new gmp(i), new pmp(i2), sls.this, new yg50(this));
            }
        });
        this.h = new e6q();
        this.i = new aj31(context);
        this.k = cmm0.b();
        sjh sjhVar = uyj.a;
        this.l = g8e.f(o400.a);
        this.m = gtq0.a();
        ((LinearLayout) a.getValue()).addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.platform.navigation.impl.NavigatorViewHolderImpl$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                d dVar = d.this;
                dVar.b(dVar.d());
                e6q e6qVar = dVar.h;
                e6qVar.a.o("main_screen", dVar.d());
                dVar.e(dVar.d());
                c cVar2 = d.this.c;
                d dVar2 = d.this;
                cVar2.d = new NavigatorViewHolderImpl$1$onViewAttachedToWindow$1(2, dVar2, d.class, "onViewStateChanged", "onViewStateChanged(Lcom/yandex/go/platform/navigation/impl/NavigationPresenter$NavigationViewState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                sjh sjhVar2 = uyj.a;
                cVar2.e = g8e.f(o400.a);
                List list = cVar2.b;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw unr0.i(it);
                }
                ike ikeVar = cVar2.e;
                if (ikeVar != null) {
                    tje.N(ikeVar, mdh.b, null, new NavigationPresenter$onLaunched$1(cVar2, arrayList, dVar2, null), 2);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                c cVar2 = d.this.c;
                ike ikeVar = cVar2.e;
                if (ikeVar != null) {
                    bvf0.j(ikeVar, null);
                }
                cVar2.e = null;
                cVar2.d = null;
                ((LinearLayout) d.this.f.getValue()).removeAllViews();
            }
        });
    }

    public static final void a(final d dVar, com.yandex.go.platform.navigation.model.a aVar) {
        hz40 hz40Var = dVar.k;
        i3y i3yVar = dVar.d;
        w53 w53Var = (w53) dVar.i.b;
        SoftReference softReference = (SoftReference) w53Var.get("main_screen");
        tmp tmpVar = softReference != null ? (tmp) softReference.get() : null;
        if (tmpVar == null) {
            tmp tmpVar2 = new tmp((View) ((PropertyReference0) aVar.e.a.b).get());
            w53Var.put("main_screen", new SoftReference(tmpVar2));
            tmpVar = tmpVar2;
        }
        View view = tmpVar.a;
        h8 h8Var = new h8(3, (FrameLayout) i3yVar.getValue());
        int i = 0;
        while (true) {
            if (!h8Var.hasNext()) {
                i = -1;
                break;
            }
            Object next = h8Var.next();
            if (i < 0) {
                scc.m();
                throw null;
            }
            if (jl40.l(view, next)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            ((FrameLayout) i3yVar.getValue()).removeAllViews();
            ((FrameLayout) i3yVar.getValue()).addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
        final n650 n650Var = (n650) hz40Var.d(aVar);
        com.yandex.go.platform.navigation.model.a aVar2 = dVar.j;
        final float f = 1.0f;
        if (aVar2 != null) {
            final n650 n650Var2 = (n650) hz40Var.d(aVar2);
            if (n650Var2 != null) {
                final float alpha = n650Var2.c.getAlpha();
                ViewPropertyAnimator animate = n650Var2.a.animate();
                animate.setDuration(200L);
                final float f2 = 0.3f;
                animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(dVar) { // from class: xg50
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float f3 = f2;
                        float f4 = alpha;
                        float b = g8e.b(f3, f4, floatValue, f4);
                        n650 n650Var3 = n650Var2;
                        n650Var3.d.setAlpha(b);
                        n650Var3.c.setAlpha(b);
                    }
                });
                animate.start();
            }
            if (n650Var != null) {
                final float alpha2 = n650Var.c.getAlpha();
                ViewPropertyAnimator animate2 = n650Var.a.animate();
                animate2.setDuration(200L);
                animate2.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(dVar) { // from class: xg50
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float f3 = f;
                        float f4 = alpha2;
                        float b = g8e.b(f3, f4, floatValue, f4);
                        n650 n650Var3 = n650Var;
                        n650Var3.d.setAlpha(b);
                        n650Var3.c.setAlpha(b);
                    }
                });
                animate2.start();
            }
        } else if (n650Var != null) {
            n650Var.d.setAlpha(1.0f);
            n650Var.c.setAlpha(1.0f);
        }
        dVar.j = aVar;
        aVar.d.invoke();
    }

    public final void b(com.yandex.go.platform.navigation.model.a aVar) {
        View inflate = LayoutInflater.from(this.a).inflate(xuh0.navigation_bar_item, (ViewGroup) null, false);
        int i = s6h0.badge;
        TextView textView = (TextView) cma1.O(i, inflate);
        if (textView != null) {
            i = s6h0.icon;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                i = s6h0.icon_container;
                if (((FrameLayout) cma1.O(i, inflate)) != null) {
                    i = s6h0.title;
                    TextView textView2 = (TextView) cma1.O(i, inflate);
                    if (textView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        n650 n650Var = new n650(linearLayout, textView, imageView, textView2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                        layoutParams.weight = 1.0f;
                        linearLayout.setLayoutParams(layoutParams);
                        float f = jl40.l(aVar, d()) ? 1.0f : 0.3f;
                        textView2.setAlpha(f);
                        imageView.setAlpha(f);
                        imageView.setImageResource(aVar.a.a);
                        textView2.setText(aVar.b.a);
                        final int i2 = Integer.MAX_VALUE;
                        textView.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.go.platform.utils.ViewUtilsKt$makeViewRounded$1
                            @Override // android.view.ViewOutlineProvider
                            public void getOutline(View view, Outline outline) {
                                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i2);
                            }
                        });
                        textView.setClipToOutline(true);
                        textView.setVisibility(4);
                        linearLayout.setOnClickListener(new fx00(8, this, aVar));
                        this.k.o(aVar, n650Var);
                        c().addView(linearLayout);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final LinearLayout c() {
        return (LinearLayout) this.e.getValue();
    }

    public final com.yandex.go.platform.navigation.model.a d() {
        return (com.yandex.go.platform.navigation.model.a) this.g.getValue();
    }

    public final void e(com.yandex.go.platform.navigation.model.a aVar) {
        if (jl40.l(this.j, aVar)) {
            return;
        }
        tje.N(this.l, null, null, new NavigatorViewHolderImpl$navigateTo$1(this, aVar, null), 3);
    }
}
