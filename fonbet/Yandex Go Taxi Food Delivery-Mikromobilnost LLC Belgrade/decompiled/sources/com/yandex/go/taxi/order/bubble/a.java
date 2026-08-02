package com.yandex.go.taxi.order.bubble;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.animation.DecelerateInterpolator;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.cwa1;
import defpackage.czo0;
import defpackage.f4c0;
import defpackage.fi70;
import defpackage.hbp0;
import defpackage.if2;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pzt0;
import defpackage.re2;
import defpackage.te2;
import defpackage.tje;
import defpackage.xm00;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class a extends fi70 {
    public XYPoint A;
    public final DecelerateInterpolator B;
    public final hbp0 C;
    public Bitmap D;
    public pzt0 E;
    public pzt0 F;
    public pzt0 G;
    public boolean H;
    public ValueAnimator I;
    public volatile boolean J;
    public Integer K;
    public final Context a;
    public final re2 b;
    public final pav c;
    public final ru.yandex.taxi.map_common.map.utils.a w;
    public final te2 x;
    public final f4c0 y;
    public final f4c0 z;

    public a(Context context, re2 re2Var, float f, pav pavVar, ru.yandex.taxi.map_common.map.utils.a aVar, te2 te2Var) {
        this.a = context;
        this.b = re2Var;
        this.c = pavVar;
        this.w = aVar;
        this.x = te2Var;
        f4c0 f4c0Var = new f4c0(cwa1.d(re2Var.a), null, 6);
        f4c0Var.k(f);
        f4c0Var.i(true);
        f4c0Var.A(0.0f);
        this.y = f4c0Var;
        f4c0 f4c0Var2 = new f4c0(cwa1.d(re2Var.a), null, 6);
        f4c0Var2.k(f);
        f4c0Var2.i(false);
        f4c0Var2.y(ImageProvider.fromBitmap(Bitmap.createBitmap((int) tje.x(context, 34.0f), (int) tje.x(context, 34.0f), Bitmap.Config.ARGB_8888)));
        this.z = f4c0Var2;
        this.B = new DecelerateInterpolator();
        this.C = new hbp0(new czo0(14), "", null);
    }

    public static final void b(a aVar) {
        if (aVar.H) {
            return;
        }
        pzt0 pzt0Var = aVar.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.F = tje.N(aVar.C.c(), null, null, new AnimatedOrderBubbleViewHolder$show$1(aVar, null), 3);
    }

    @Override // defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        pzt0 pzt0Var = this.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E = tje.N(this.C.c(), null, null, new AnimatedOrderBubbleViewHolder$updateIcon$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(xm00 xm00Var, Continuation continuation) {
        AnimatedOrderBubbleViewHolder$attachSelf$1 animatedOrderBubbleViewHolder$attachSelf$1;
        int i;
        xm00 xm00Var2;
        a aVar;
        pzt0 pzt0Var;
        if (continuation instanceof AnimatedOrderBubbleViewHolder$attachSelf$1) {
            animatedOrderBubbleViewHolder$attachSelf$1 = (AnimatedOrderBubbleViewHolder$attachSelf$1) continuation;
            int i2 = animatedOrderBubbleViewHolder$attachSelf$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                animatedOrderBubbleViewHolder$attachSelf$1.label = i2 - Integer.MIN_VALUE;
                Object obj = animatedOrderBubbleViewHolder$attachSelf$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = animatedOrderBubbleViewHolder$attachSelf$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Point d = cwa1.d(this.b.a);
                    animatedOrderBubbleViewHolder$attachSelf$1.L$0 = xm00Var;
                    animatedOrderBubbleViewHolder$attachSelf$1.L$1 = this;
                    animatedOrderBubbleViewHolder$attachSelf$1.label = 1;
                    obj = this.w.b(d, animatedOrderBubbleViewHolder$attachSelf$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    xm00Var2 = xm00Var;
                    aVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (a) animatedOrderBubbleViewHolder$attachSelf$1.L$1;
                    xm00Var2 = (xm00) animatedOrderBubbleViewHolder$attachSelf$1.L$0;
                    kotlin.b.b(obj);
                }
                aVar.A = (XYPoint) obj;
                hbp0 hbp0Var = this.C;
                hbp0Var.a();
                pzt0Var = this.E;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.E = tje.N(hbp0Var.c(), null, null, new AnimatedOrderBubbleViewHolder$loadIcon$1(this, null), 3);
                xm00Var2.getClass();
                this.y.b(xm00Var2);
                return zy11.a;
            }
        }
        animatedOrderBubbleViewHolder$attachSelf$1 = new AnimatedOrderBubbleViewHolder$attachSelf$1(this, continuation);
        Object obj2 = animatedOrderBubbleViewHolder$attachSelf$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = animatedOrderBubbleViewHolder$attachSelf$1.label;
        if (i != 0) {
        }
        aVar.A = (XYPoint) obj2;
        hbp0 hbp0Var2 = this.C;
        hbp0Var2.a();
        pzt0Var = this.E;
        if (pzt0Var != null) {
        }
        this.E = tje.N(hbp0Var2.c(), null, null, new AnimatedOrderBubbleViewHolder$loadIcon$1(this, null), 3);
        xm00Var2.getClass();
        this.y.b(xm00Var2);
        return zy11.a;
    }

    public final void d() {
        this.C.b();
        this.y.d();
    }

    public final void e(PropertyValuesHolder propertyValuesHolder) {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolder).setDuration(500L);
        this.I = duration;
        if (duration != null) {
            duration.setInterpolator(this.B);
        }
        ValueAnimator valueAnimator2 = this.I;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new if2(this, 1));
        }
        ValueAnimator valueAnimator3 = this.I;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public final void f() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = tje.N(this.C.c(), null, null, new AnimatedOrderBubbleViewHolder$updateWithAnimation$1(this, null), 3);
    }
}
