package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$ShimmeringAnimation;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.runtime.image.ImageProvider;
import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.kdc;
import defpackage.p190;
import defpackage.pr00;
import defpackage.q6l0;
import defpackage.qr00;
import defpackage.scc;
import defpackage.tcc;
import defpackage.ufu;
import defpackage.w4e0;
import defpackage.w511;
import defpackage.xm00;
import defpackage.ylm;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.taxi.animation.BaseAnimatorListener;
import ru.yandex.taxi.preorder.source.DrivingRoutes$Type;
import ru.yandex.taxi.preorder.source.routeoverlay.TollRouteBubbleView;

/* loaded from: classes6.dex */
public final class p190 {
    public final xm00 a;
    public final yj2 b;
    public final b2l0 c;
    public final n6l0 d;
    public final Context e;
    public final et00 f;
    public final qr00 g;
    public final LinearInterpolator h;
    public final AccelerateDecelerateInterpolator i;
    public final ValueAnimator j;
    public w4e0 k;
    public w4e0 l;
    public f4c0 m;
    public ylm n;
    public PolylinePosition o;
    public ImageProvider p;
    public int q;
    public int r;
    public xm00 s;
    public TollRouteBubbleView t;

    public p190(xm00 xm00Var, yj2 yj2Var, b2l0 b2l0Var, lft0 lft0Var, Context context, et00 et00Var, qr00 qr00Var) {
        this.a = xm00Var;
        this.b = yj2Var;
        this.c = b2l0Var;
        this.d = lft0Var;
        this.e = context;
        this.f = et00Var;
        this.g = qr00Var;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.h = linearInterpolator;
        this.i = new AccelerateDecelerateInterpolator();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
        this.j = ofInt;
        ofInt.setDuration(OperationProgressView.ROTATION_ANIMATION_DURATION);
        ofInt.setInterpolator(linearInterpolator);
        ofInt.addUpdateListener(new yso(16, this));
        ofInt.addListener(new BaseAnimatorListener() { // from class: ru.yandex.taxi.preorder.source.routeoverlay.OverlayRouteHolder$2
            @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                MapRouteAppearance$ShimmeringAnimation.ShowPolicy showPolicy;
                TimeInterpolator timeInterpolator;
                p190.this.b();
                xm00 xm00Var2 = p190.this.s;
                if (xm00Var2 != null) {
                    xm00Var2.i(true);
                }
                p190 p190Var = p190.this;
                ylm ylmVar = p190Var.n;
                q6l0 q6l0Var = ylmVar != null ? ylmVar.g : null;
                final w4e0 w4e0Var = p190Var.k;
                MapRouteAppearance$ShimmeringAnimation mapRouteAppearance$ShimmeringAnimation = q6l0Var != null ? q6l0Var.g : null;
                if (w4e0Var == null || mapRouteAppearance$ShimmeringAnimation == null) {
                    return;
                }
                final qr00 qr00Var2 = p190Var.g;
                ValueAnimator valueAnimator = qr00Var2.c;
                if (((Polyline) w4e0Var.h).getPoints().isEmpty() || (showPolicy = mapRouteAppearance$ShimmeringAnimation.g) == null) {
                    return;
                }
                int i = showPolicy.a;
                Integer valueOf = i > 0 ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    final int intValue = valueOf.intValue();
                    final kdc b = ((ufu) qr00Var2.a).b(mapRouteAppearance$ShimmeringAnimation.d);
                    if (b == null) {
                        return;
                    }
                    d6w e = scc.e(((Polyline) w4e0Var.h).getPoints());
                    final ArrayList arrayList = new ArrayList(tcc.n(e, 10));
                    c6w it = e.iterator();
                    while (it.c) {
                        arrayList.add(Integer.valueOf(w4e0Var.v.get(it.nextInt(), -1)));
                    }
                    final int size = (int) ((((Polyline) w4e0Var.h).getPoints().size() / 100.0f) * mapRouteAppearance$ShimmeringAnimation.f);
                    float f = mapRouteAppearance$ShimmeringAnimation.e;
                    w4e0Var.q = f;
                    ((PolylineMapObject) w4e0Var.g).setGradientLength(f);
                    valueAnimator.setStartDelay(mapRouteAppearance$ShimmeringAnimation.a);
                    valueAnimator.setDuration(mapRouteAppearance$ShimmeringAnimation.b);
                    int i2 = pr00.a[mapRouteAppearance$ShimmeringAnimation.c.ordinal()];
                    if (i2 == 1) {
                        timeInterpolator = qr00Var2.e;
                    } else {
                        if (i2 != 2) {
                            w511.b();
                            return;
                        }
                        timeInterpolator = qr00Var2.d;
                    }
                    valueAnimator.setInterpolator(timeInterpolator);
                    valueAnimator.setIntValues(-size, ((Polyline) w4e0Var.h).getPoints().size() - 1);
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: or00
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            int intValue2 = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                            qr00 qr00Var3 = qr00.this;
                            qr00Var3.getClass();
                            w4e0 w4e0Var2 = w4e0Var;
                            int size2 = ((Polyline) w4e0Var2.h).getPoints().size();
                            int m = s8o.m(b, qr00Var3.b);
                            int i3 = 0;
                            int i4 = intValue2 < 0 ? 0 : intValue2;
                            int i5 = intValue2 + size;
                            int i6 = size2 - 1;
                            if (i5 > i6) {
                                i5 = i6;
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                int i7 = i3 + 1;
                                int intValue3 = ((Number) it2.next()).intValue();
                                if (i4 > i3 || i3 > i5) {
                                    w4e0Var2.A(i3, intValue3);
                                } else {
                                    w4e0Var2.A(i3, m);
                                }
                                i3 = i7;
                            }
                        }
                    });
                    final Ref$IntRef ref$IntRef = new Ref$IntRef();
                    valueAnimator.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.preorder.source.MapRouteShimmeringAnimator$startWithRepeats$$inlined$doOnEnd$1
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                            int i3 = ref$IntRef2.element + 1;
                            ref$IntRef2.element = i3;
                            if (i3 < intValue) {
                                qr00Var2.c.start();
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }
                    });
                    valueAnimator.start();
                }
            }

            @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                p190.this.b();
                xm00 xm00Var2 = p190.this.s;
                if (xm00Var2 != null) {
                    xm00Var2.i(false);
                }
            }
        });
    }

    public final void a(DrivingRoutes$Type drivingRoutes$Type) {
        ylm ylmVar = this.n;
        w4e0 w4e0Var = this.k;
        if (ylmVar != null) {
            DrivingRoute drivingRoute = ylmVar.b;
            if (w4e0Var == null) {
                return;
            }
            int i = o190.a[drivingRoutes$Type.ordinal()];
            if (i == 1) {
                ylm ylmVar2 = this.n;
                q6l0 q6l0Var = ylmVar2 != null ? ylmVar2.g : null;
                b2l0 b2l0Var = this.c;
                if (q6l0Var != null) {
                    b2l0Var.b(w4e0Var, q6l0Var.b, q6l0Var.c, q6l0Var.d, q6l0Var.f, q6l0Var.h);
                    return;
                } else {
                    ((bf60) b2l0Var.a.getValue()).a(w4e0Var);
                    return;
                }
            }
            b2l0 b2l0Var2 = this.c;
            if (i == 2) {
                ((hx1) b2l0Var2.b.getValue()).a(w4e0Var);
                return;
            }
            if (i == 3) {
                ((kiq0) b2l0Var2.e.getValue()).a(w4e0Var);
                w4e0Var.x(drivingRoute);
            } else if (i == 4) {
                b2l0Var2.a(w4e0Var);
                w4e0Var.x(drivingRoute);
            } else if (i == 5) {
                ((bf60) b2l0Var2.a.getValue()).a(w4e0Var);
            } else {
                w511.b();
            }
        }
    }

    public final void b() {
        if (this.s == null) {
            this.s = this.a.p();
        }
    }

    public final void c(String str) {
        Bitmap bitmap;
        f4c0 f4c0Var = this.m;
        if (f4c0Var == null) {
            return;
        }
        TollRouteBubbleView tollRouteBubbleView = this.t;
        if (tollRouteBubbleView == null) {
            TollRouteBubbleView tollRouteBubbleView2 = new TollRouteBubbleView(this.e, null, 0, 6, null);
            this.t = tollRouteBubbleView2;
            tollRouteBubbleView = tollRouteBubbleView2;
        }
        tollRouteBubbleView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        tollRouteBubbleView.setText(str);
        xw31.r(tollRouteBubbleView);
        f4c0Var.x(xw31.t(tollRouteBubbleView));
        ImageProvider imageProvider = this.p;
        float width = (imageProvider == null || (bitmap = imageProvider.get$image()) == null) ? 0 : bitmap.getWidth();
        f4c0Var.D(new IconStyle().setAnchor(new PointF((-((width / 2.0f) - tollRouteBubbleView.getLeftOpticalBound())) / r9.getWidth(), (width * 0.7f) / r9.getHeight())));
    }

    public final void d(ylm ylmVar) {
        CharSequence text;
        this.n = ylmVar;
        if (ylmVar.a().getPoints().size() < 2) {
            return;
        }
        q6l0 q6l0Var = ylmVar.g;
        et00 et00Var = this.f;
        if (q6l0Var != null) {
            et00Var.d();
        } else {
            et00Var.e();
        }
        a(ylmVar.c);
        ylm ylmVar2 = this.n;
        f4c0 f4c0Var = this.m;
        if (ylmVar2 != null) {
            String str = ylmVar2.d;
            if (f4c0Var != null) {
                TollRouteBubbleView tollRouteBubbleView = this.t;
                if (!jl40.l(str, (tollRouteBubbleView == null || (text = tollRouteBubbleView.getText()) == null) ? null : text.toString()) && str != null && str.length() != 0) {
                    c(str);
                }
                f4c0Var.i(!(str == null || str.length() == 0));
            }
        }
        w4e0 w4e0Var = this.k;
        if (w4e0Var != null) {
            w4e0Var.k(ylmVar.a ? -1.0f : -1.1f);
        }
    }
}
