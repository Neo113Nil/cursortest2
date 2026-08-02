package com.yandex.go.taxi.order.map.overlay;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.animation.DecelerateInterpolator;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import defpackage.a380;
import defpackage.a3y0;
import defpackage.ah00;
import defpackage.ahf;
import defpackage.an91;
import defpackage.b01;
import defpackage.b2l0;
import defpackage.bf60;
import defpackage.bhf;
import defpackage.c0h0;
import defpackage.cta1;
import defpackage.doy;
import defpackage.egr0;
import defpackage.et00;
import defpackage.f4c0;
import defpackage.g18;
import defpackage.gh00;
import defpackage.gji;
import defpackage.h3y;
import defpackage.i080;
import defpackage.i3y;
import defpackage.j080;
import defpackage.j380;
import defpackage.j741;
import defpackage.jl40;
import defpackage.js00;
import defpackage.k080;
import defpackage.kf00;
import defpackage.ktk0;
import defpackage.l080;
import defpackage.l380;
import defpackage.l390;
import defpackage.la00;
import defpackage.lp00;
import defpackage.m080;
import defpackage.m380;
import defpackage.mo21;
import defpackage.mo6;
import defpackage.mrg0;
import defpackage.mt00;
import defpackage.n4h0;
import defpackage.no21;
import defpackage.o2y0;
import defpackage.o380;
import defpackage.ool0;
import defpackage.op70;
import defpackage.oyr;
import defpackage.p0c0;
import defpackage.p370;
import defpackage.pzt0;
import defpackage.q6l0;
import defpackage.ry1;
import defpackage.s080;
import defpackage.sgu0;
import defpackage.sls;
import defpackage.sq00;
import defpackage.ssd;
import defpackage.sy1;
import defpackage.sz8;
import defpackage.tdt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tu70;
import defpackage.u080;
import defpackage.u8b1;
import defpackage.ugf;
import defpackage.ugu0;
import defpackage.vdt0;
import defpackage.vgf;
import defpackage.vub;
import defpackage.w4e0;
import defpackage.w511;
import defpackage.xm00;
import defpackage.xqg0;
import defpackage.xw31;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.wrap.MapObjectAccessibilityPlaceMarkView;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.preorder.source.points.StopPointsProvider$StopPointPlace;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class c extends bhf implements u080 {
    public final tse A;
    public tu70 A0;
    public final xm00 B;
    public final b B0;
    public final c0 C;
    public final h3y D;
    public final h3y E;
    public final sz8 F;
    public final a380 G;
    public final com.yandex.go.pin.api.widget.b H;
    public final sy1 I;
    public final p370 J;
    public final h3y K;
    public final ru.yandex.taxi.map_common.style.domain.a L;
    public final ktk0 M;
    public final vgf N;
    public final et00 O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ImageProvider T;
    public final ImageProvider U;
    public final i3y V;
    public final int W;
    public final IconStyle Z;
    public final b01 a0;
    public final AnimatorSet b0;
    public final i3y c0;
    public final i3y d0;
    public final AnimUtils$AnimationEndListener e0;
    public final k080 f0;
    public final k080 g0;
    public boolean h0;
    public ValueAnimator i0;
    public float j0;
    public g18 k0;
    public pzt0 l0;
    public Bitmap m0;
    public Bitmap n0;
    public ImageProvider o0;
    public xm00 p0;
    public xm00 q0;
    public f4c0 r0;
    public f4c0 s0;
    public ValueAnimator t0;
    public vub u0;
    public f4c0 v0;
    public f4c0 w0;
    public w4e0 x0;
    public d y0;
    public final Context z;
    public w4e0 z0;

    /* JADX WARN: Type inference failed for: r10v3, types: [com.yandex.go.taxi.order.map.overlay.b] */
    public c(Context context, tse tseVar, ah00 ah00Var, xm00 xm00Var, ru.yandex.taxi.map.a aVar, c0 c0Var, h3y h3yVar, h3y h3yVar2, sz8 sz8Var, a380 a380Var, o2y0 o2y0Var, com.yandex.go.pin.api.widget.b bVar, sy1 sy1Var, no21 no21Var, p370 p370Var, h3y h3yVar3, ru.yandex.taxi.map_common.style.domain.a aVar2, ktk0 ktk0Var, vgf vgfVar, et00 et00Var) {
        super(ah00Var, no21Var);
        this.z = context;
        this.A = tseVar;
        this.B = xm00Var;
        this.C = c0Var;
        this.D = h3yVar;
        this.E = h3yVar2;
        this.F = sz8Var;
        this.G = a380Var;
        this.H = bVar;
        this.I = sy1Var;
        this.J = p370Var;
        this.K = h3yVar3;
        this.L = aVar2;
        this.M = ktk0Var;
        this.N = vgfVar;
        this.O = et00Var;
        new a3y0(TaxiOrderLogGroup.MAP.getTag(), "OrderMapOverlay");
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = ImageProvider.fromResource(context, n4h0.driver);
        this.U = ImageProvider.fromBitmap(u8b1.g(tje.y(c0h0.ic_order_map_destination_pin, context)));
        i080 i080Var = new i080(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.V = kotlin.a.b(lazyThreadSafetyMode, i080Var);
        kotlin.a.b(lazyThreadSafetyMode, new i080(this, 3));
        kotlin.a.b(lazyThreadSafetyMode, new i080(this, 4));
        this.W = context.getColor(xqg0.current_location_solid);
        this.Z = new IconStyle().setFlat(Boolean.FALSE).setRotationType(RotationType.NO_ROTATION);
        new IconStyle().setRotationType(RotationType.ROTATE);
        this.a0 = new b01(24, this);
        AnimatorSet animatorSet = new AnimatorSet();
        this.b0 = animatorSet;
        this.c0 = kotlin.a.b(lazyThreadSafetyMode, new i080(this, 5));
        int i = 6;
        this.d0 = kotlin.a.b(lazyThreadSafetyMode, new i080(this, i));
        AnimUtils$AnimationEndListener animUtils$AnimationEndListener = new AnimUtils$AnimationEndListener(new op70(i, this));
        this.e0 = animUtils$AnimationEndListener;
        this.f0 = new k080(this, 1);
        this.g0 = new k080(this, 2);
        this.j0 = 1.0f;
        this.k0 = g18.u1;
        this.o0 = ImageProvider.fromBitmap(aVar.g);
        this.B0 = new MapObjectTapListener() { // from class: com.yandex.go.taxi.order.map.overlay.b
            @Override // com.yandex.mapkit.map.MapObjectTapListener
            public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                c0 c0Var2 = c.this.C;
                c0Var2.V.a(cta1.d(c0Var2.A.c()));
                pzt0 pzt0Var = c0Var2.p1;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                c0Var2.p1 = com.yandex.go.coroutines.b.g(c0Var2.Kg(), null, null, new OrderMapOverlayPresenter$onCarPictureTap$1(c0Var2, null), 3);
                return false;
            }
        };
        if (!an91.i(o2y0Var.c())) {
            ((gh00) ah00Var).J(17.0f);
        }
        j080 j080Var = new j080(this, 1);
        ValueAnimator duration = ValueAnimator.ofFloat(0.6f, 0.2f).setDuration(800L);
        duration.addUpdateListener(j080Var);
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.2f, 0.6f).setDuration(200L);
        duration2.addUpdateListener(j080Var);
        animatorSet.playSequentially(duration, duration2);
        animatorSet.addListener(animUtils$AnimationEndListener);
    }

    @Override // defpackage.u080
    public final void A3(ry1 ry1Var) {
        ((ru.yandex.taxi.altpins.map.a) this.I).e(ry1Var);
        d dVar = this.y0;
        if (dVar != null) {
            boolean equals = ry1Var.equals(ry1.e);
            dVar.m = equals;
            dVar.c.i(equals);
        }
    }

    @Override // defpackage.u080
    public final void B1() {
        d dVar = this.y0;
        if (dVar != null) {
            f4c0 f4c0Var = dVar.c;
            f4c0Var.o(d.n);
            f4c0Var.i(false);
        }
    }

    @Override // defpackage.u080
    public final void E3() {
        d dVar = this.y0;
        if (dVar != null) {
            dVar.d.i(false);
        }
    }

    @Override // defpackage.u080
    public final void E7(final Bitmap bitmap) {
        final f4c0 f4c0Var = this.s0;
        if (f4c0Var == null) {
            return;
        }
        if (f4c0Var.b) {
            float f = f4c0Var.j;
            if (f > 0.0f) {
                ValueAnimator valueAnimator = this.t0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.addUpdateListener(new mt00(f4c0Var, 3));
                ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.map.overlay.OrderMapOverlay$animateCarOverlay$lambda$0$$inlined$doOnEnd$1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        f4c0.this.y(ImageProvider.fromBitmap(bitmap));
                        c cVar = this;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.setDuration(150L);
                        final f4c0 f4c0Var2 = f4c0.this;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.go.taxi.order.map.overlay.OrderMapOverlay$animateCarOverlay$1$2$1$1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                f4c0.this.A(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                            }
                        });
                        ofFloat2.start();
                        cVar.t0 = ofFloat2;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                ofFloat.start();
                this.t0 = ofFloat;
                return;
            }
        }
        ValueAnimator valueAnimator2 = this.t0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        f4c0Var.y(ImageProvider.fromBitmap(bitmap));
        f4c0Var.i(true);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(150L);
        ofFloat2.addUpdateListener(new mt00(f4c0Var, 4));
        ofFloat2.start();
        this.t0 = ofFloat2;
    }

    @Override // defpackage.u080
    public final void G8(p0c0 p0c0Var) {
        d dVar = this.y0;
        if (dVar != null) {
            pzt0 pzt0Var = dVar.k;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            dVar.k = tje.N(dVar.f.c(), null, null, new OrderMapOverlayIconHolder$applyDestinationStyle$1(dVar, p0c0Var, null), 3);
        }
    }

    @Override // defpackage.u080
    public final void H3(mo6 mo6Var) {
        f4c0 f4c0Var;
        String str = mo6Var.a;
        Bitmap bitmap = this.m0;
        if (bitmap != null) {
            O8();
            return;
        }
        if (bitmap == null) {
            Drawable drawable = mo6Var.b;
            ThemeType themeType = mo6Var.f;
            if (str.length() != 0) {
                if (mo6Var.e != themeType) {
                    Sg().applyTheme(themeType);
                    Bitmap t = xw31.t(Sg());
                    this.n0 = t;
                    f4c0 f4c0Var2 = this.w0;
                    if (f4c0Var2 != null) {
                        f4c0Var2.y(ImageProvider.fromBitmap(t));
                    }
                }
                if (this.n0 == null) {
                    if (drawable != null) {
                        ((egr0) Sg().getDecorator()).n(drawable);
                        xw31.B(ru.yandex.taxi.design.utils.c.d(mrg0.go_design_s_space, Sg()), Sg());
                    }
                    Sg().setText(str);
                    Sg().setTextGravity(17);
                    Sg().applyTheme(themeType);
                    xw31.r(Sg());
                    this.n0 = xw31.t(Sg());
                    f4c0 f4c0Var3 = this.w0;
                    if (f4c0Var3 != null) {
                        f4c0Var3.i(true);
                        f4c0Var3.k(1.0f);
                        f4c0Var3.y(ImageProvider.fromBitmap(this.n0));
                        f4c0Var3.g(this.g0);
                    }
                    Pg();
                }
                if (this.n0 == null || (f4c0Var = this.w0) == null) {
                    return;
                }
                f4c0Var.D(new IconStyle().setAnchor(new PointF(0.5f, 1.35f)));
                return;
            }
        }
        O8();
    }

    @Override // defpackage.u080
    public final void Id(Point point) {
        d dVar = this.y0;
        if (dVar != null) {
            f4c0 f4c0Var = dVar.c;
            if (dVar.m) {
                f4c0Var.o(point);
                f4c0Var.i(true);
            }
        }
    }

    @Override // defpackage.u080
    public final void J5() {
        if (this.h0) {
            return;
        }
        AnimatorSet animatorSet = this.b0;
        animatorSet.start();
        animatorSet.addListener(this.e0);
        this.h0 = true;
    }

    @Override // defpackage.bhf
    public final ugf Jg() {
        xm00 Tg = Tg();
        this.N.getClass();
        return new ahf(this.z, Tg);
    }

    @Override // defpackage.u080
    public final void K3(Bitmap bitmap) {
        this.o0 = ImageProvider.fromBitmap(bitmap);
        int height = bitmap.getHeight();
        a380 a380Var = this.G;
        a380Var.c = height;
        a380Var.a();
    }

    @Override // defpackage.bhf
    public final ScreenPoint Kg() {
        d dVar = this.y0;
        if (dVar == null) {
            return null;
        }
        ah00 ah00Var = (ah00) this.b;
        return ((gh00) ah00Var).e.e((Point) dVar.a.h);
    }

    @Override // defpackage.u080
    public final void Lb(boolean z) {
        d dVar = this.y0;
        if (dVar != null) {
            dVar.a.A(z ? 0.5f : 1.0f);
        }
    }

    @Override // defpackage.u080
    public final void O1(sq00 sq00Var) {
        d dVar = this.y0;
        if (dVar != null) {
            pzt0 pzt0Var = dVar.j;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            dVar.j = tje.N(dVar.f.c(), null, null, new OrderMapOverlayIconHolder$hideSourcePinText$1(dVar, sq00Var, null), 3);
        }
    }

    @Override // defpackage.u080
    public final void O4(Point point) {
        d dVar = this.y0;
        if (dVar != null) {
            f4c0 f4c0Var = dVar.a;
            f4c0Var.o(point);
            f4c0Var.i(true);
        }
    }

    @Override // defpackage.u080
    public final void O7(sq00 sq00Var, s080 s080Var) {
        d dVar = this.y0;
        if (dVar != null) {
            pzt0 pzt0Var = dVar.j;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            dVar.j = tje.N(dVar.f.c(), null, null, new OrderMapOverlayIconHolder$showSourcePinText$1(dVar, sq00Var, s080Var, null), 3);
        }
    }

    @Override // defpackage.u080
    public final void O8() {
        f4c0 f4c0Var;
        TaxiMapView h = ((gh00) ((ah00) this.b)).h();
        if (h != null && (f4c0Var = this.w0) != null) {
            f4c0Var.i(false);
            f4c0Var.g(null);
            f4c0Var.u(h);
        }
        this.n0 = null;
    }

    @Override // defpackage.u080
    public final void Oe(int i) {
        vub vubVar = this.u0;
        if (vubVar != null) {
            vubVar.o(new Circle(((Circle) vubVar.h).getCenter(), i));
            vubVar.i(true);
        }
    }

    public final void Og(float f) {
        Float valueOf = Float.valueOf(Math.max(Math.min(Math.max(0.0f, ((gh00) ((ah00) this.b)).j() / 9.0f), 2.0f) - 1.0f, 0.5f) * f);
        IconStyle iconStyle = this.Z;
        iconStyle.setScale(valueOf);
        f4c0 f4c0Var = this.r0;
        if (f4c0Var != null) {
            f4c0Var.D(iconStyle);
        }
        f4c0 f4c0Var2 = this.s0;
        if (f4c0Var2 != null) {
            f4c0Var2.D(iconStyle);
        }
    }

    @Override // defpackage.u080
    public final void P3() {
        d dVar = this.y0;
        if (dVar != null) {
            f4c0 f4c0Var = dVar.a;
            f4c0Var.o(d.n);
            f4c0Var.i(false);
        }
    }

    @Override // defpackage.u080
    public final void P8(WalkingRouteUiState walkingRouteUiState) {
        ((ru.yandex.taxi.map.c) ((j741) this.K.get())).d(walkingRouteUiState);
    }

    public final void Pg() {
        ScreenPoint screenPoint;
        ah00 ah00Var = (ah00) this.b;
        f4c0 f4c0Var = this.w0;
        if (f4c0Var != null) {
            screenPoint = ((gh00) ah00Var).e.e((Point) f4c0Var.h);
        } else {
            screenPoint = null;
        }
        ScreenRect c = ((gh00) ah00Var).a.c();
        if (this.n0 == null || screenPoint == null || c == null || !ru.yandex.taxi.map.utils.a.q(screenPoint, c)) {
            return;
        }
        c0 c0Var = this.C;
        if (c0Var.N1) {
            return;
        }
        c0Var.N1 = true;
        kf00 kf00Var = c0Var.m0;
        kf00Var.a.a("Map.Bubble.TrafficLight.Shown", oyr.A(kf00Var), 1, new HashMap());
    }

    @Override // defpackage.u080
    public final void Q8() {
        f4c0 f4c0Var;
        TaxiMapView h = ((gh00) ((ah00) this.b)).h();
        if (h != null && (f4c0Var = this.v0) != null) {
            f4c0Var.i(false);
            f4c0Var.g(null);
            f4c0Var.u(h);
        }
        this.m0 = null;
    }

    public final BubbleTextComponent Qg() {
        return (BubbleTextComponent) this.c0.getValue();
    }

    public final xm00 Rg() {
        xm00 xm00Var = this.q0;
        if (xm00Var != null && xm00Var.f != null) {
            return xm00Var;
        }
        xm00 p = this.B.p();
        p.k(0.0f);
        this.q0 = p;
        return p;
    }

    @Override // defpackage.u080
    public final void S7(ArrayList arrayList) {
        d dVar = this.y0;
        if (dVar != null) {
            Iterator it = kotlin.collections.a.P0(arrayList, dVar.b).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Point point = (Point) pair.getFirst();
                f4c0 f4c0Var = (f4c0) pair.getSecond();
                f4c0Var.o(point);
                f4c0Var.i(true);
            }
        }
    }

    public final BubbleTextComponent Sg() {
        return (BubbleTextComponent) this.d0.getValue();
    }

    public final xm00 Tg() {
        xm00 xm00Var = this.p0;
        if (xm00Var != null && xm00Var.f != null) {
            return xm00Var;
        }
        xm00 p = this.B.p();
        p.k(2.0f);
        this.p0 = p;
        return p;
    }

    @Override // defpackage.u080
    public final void U0() {
        f4c0 f4c0Var = this.r0;
        if (f4c0Var != null) {
            f4c0Var.i(false);
        }
        f4c0 f4c0Var2 = this.r0;
        if (f4c0Var2 != null) {
            List singletonList = Collections.singletonList(f4c0Var2);
            ktk0 ktk0Var = this.M;
            ktk0Var.l = singletonList;
            tje.N(ktk0Var.a, null, null, new RoadObjectsOverlay$updateVisibility$1(ktk0Var, true, null), 3);
        }
        a380 a380Var = this.G;
        a380Var.b = false;
        a380Var.a();
    }

    @Override // defpackage.u080
    public final void U2() {
        if (this.h0) {
            AnimatorSet animatorSet = this.b0;
            animatorSet.removeAllListeners();
            animatorSet.end();
            this.h0 = false;
        }
    }

    @Override // defpackage.u080
    public final void U5(zzs zzsVar) {
        d dVar = this.y0;
        if (dVar != null) {
            Point F = ru.yandex.taxi.map.utils.a.F(zzsVar);
            f4c0 f4c0Var = dVar.d;
            f4c0Var.o(F);
            f4c0Var.i(true);
            tje.N(dVar.f.c(), null, null, new OrderMapOverlayIconHolder$showCheckInZonePoint$1(dVar, null), 3);
        }
    }

    public final void Ug() {
        resume();
        this.C.resume();
        ((gh00) ((ah00) this.b)).e(this.a0);
        d dVar = this.y0;
        if (dVar != null) {
            dVar.a.g(new doy(2, new sls() { // from class: com.yandex.go.taxi.order.map.overlay.a
                @Override // defpackage.sls
                public final Object invoke() {
                    c0 c0Var = c.this.C;
                    m380 m380Var = o380.a((j380) c0Var.i0.a.getValue()).b;
                    boolean z = m380Var instanceof l380;
                    pzt0 pzt0Var = c0Var.v1;
                    if (z) {
                        l380 l380Var = (l380) m380Var;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        c0Var.v1 = com.yandex.go.coroutines.b.g(c0Var.Kg(), null, null, new OrderMapOverlayPresenter$onPickupPointPinStateClicked$1(c0Var, l380Var, null), 3);
                    } else {
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        c0Var.v1 = com.yandex.go.coroutines.b.g(c0Var.Kg(), null, null, new OrderMapOverlayPresenter$onChangeSourcePinStateClicked$1(c0Var, null), 3);
                    }
                    return Boolean.TRUE;
                }
            }));
        }
        ktk0 ktk0Var = this.M;
        ((gh00) ktk0Var.b).e(ktk0Var.k);
        f4c0 f4c0Var = this.r0;
        if (f4c0Var != null) {
            f4c0Var.g(this.B0);
        }
        this.k0 = Lg().u0(new la00(1, this));
        pzt0 pzt0Var = this.l0;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.l0 = tje.N(this.A, null, null, new OrderMapOverlay$resumeUpdates$$inlined$safeCollectIn$1(this.L.a(), null, this), 3);
        }
    }

    public final boolean Vg(l390 l390Var, ScreenRect screenRect, boolean z, boolean z2) {
        gh00 gh00Var = (gh00) ((ah00) this.b);
        boolean C = ru.yandex.taxi.map.utils.a.C(gh00Var.a.c(), screenRect);
        boolean z3 = !C;
        if (C && !z) {
            return false;
        }
        gh00Var.a.g(l390Var, screenRect, z2, 200L);
        if (!C) {
            c0 c0Var = this.C;
            DriveState c = c0Var.A.c();
            vdt0 vdt0Var = (vdt0) kotlinx.coroutines.flow.e.d(c0Var.h0.a).a.getValue();
            boolean z4 = c == DriveState.SEARCH || c == DriveState.PREORDER;
            boolean z5 = vdt0Var instanceof tdt0;
            if (!z4 && !z5 && c0Var.J.b()) {
                com.yandex.go.coroutines.b.g(c0Var.Kg(), null, null, new OrderMapOverlayPresenter$onFocusRectChanged$1(c0Var, null), 3);
            }
        }
        return z3;
    }

    public final void Wg() {
        pause();
        this.C.pause();
        ((gh00) ((ah00) this.b)).u(this.a0);
        U2();
        ValueAnimator valueAnimator = this.i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.i0 = null;
        d dVar = this.y0;
        if (dVar != null) {
            dVar.a.g(null);
        }
        ktk0 ktk0Var = this.M;
        ((gh00) ktk0Var.b).u(ktk0Var.k);
        f4c0 f4c0Var = this.r0;
        if (f4c0Var != null) {
            f4c0Var.g(null);
        }
        this.k0.cancel();
        pzt0 pzt0Var = this.l0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.u080
    public final void Xe() {
        ru.yandex.taxi.map.utils.a.B(Tg(), this.P);
        ru.yandex.taxi.map.utils.a.B(Tg(), this.Q);
        ru.yandex.taxi.map.utils.a.B(Tg(), this.R);
    }

    @Override // defpackage.u080
    public final void Y2(q6l0 q6l0Var) {
        this.O.d();
        Polyline polyline = (Polyline) q6l0Var.j.getValue();
        if (polyline == null) {
            return;
        }
        w4e0 w4e0Var = this.z0;
        if (w4e0Var != null) {
            w4e0Var.o(polyline);
        } else {
            w4e0Var = Tg().s(polyline);
            this.z0 = w4e0Var;
        }
        w4e0 w4e0Var2 = w4e0Var;
        ((b2l0) this.D.get()).b(w4e0Var2, q6l0Var.b, q6l0Var.c, q6l0Var.d, q6l0Var.f, false);
        w4e0Var2.k(1.0f);
    }

    @Override // defpackage.u080
    public final void Z1(ArrayList arrayList, ArrayList arrayList2) {
        ImageProvider imageProvider;
        xm00 Tg = Tg();
        int i = 5;
        ssd ssdVar = new ssd(i);
        ArrayList arrayList3 = this.Q;
        ru.yandex.taxi.map.utils.a.I(Tg, arrayList3, arrayList, ssdVar);
        Iterator it = arrayList3.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            imageProvider = this.U;
            if (!hasNext) {
                break;
            } else {
                ((f4c0) it.next()).y(imageProvider);
            }
        }
        ru.yandex.taxi.map.utils.a.B(Tg(), this.R);
        xm00 Tg2 = Tg();
        ssd ssdVar2 = new ssd(i);
        ArrayList arrayList4 = this.P;
        ru.yandex.taxi.map.utils.a.I(Tg2, arrayList4, arrayList2, ssdVar2);
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            ((f4c0) it2.next()).y(imageProvider);
        }
    }

    public final void attach() {
        xm00 Tg = Tg();
        Og(1.0f);
        Point point = new Point(0.0d, 0.0d);
        f4c0 r = Tg.r(point);
        float zIndex = Lg().getZIndex() + 1.0f;
        r.k(zIndex);
        this.G.d = zIndex;
        f4c0 r2 = Tg.r(point);
        r2.k(zIndex + 1.0f);
        int i = 1;
        ArrayList arrayList = new ArrayList(1);
        f4c0 r3 = Tg.r(point);
        r3.k(zIndex);
        arrayList.add(r3);
        f4c0 r4 = Tg.r(point);
        this.y0 = new d(r, arrayList, r2, r4, this.H);
        f4c0 r5 = Rg().r(point);
        r5.y(this.o0);
        IconStyle iconStyle = this.Z;
        r5.D(iconStyle);
        p370 p370Var = this.J;
        lp00 lp00Var = (lp00) p370Var.b;
        Participant participant = Participant.SOURCE_POINT_PIN;
        ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) lp00Var;
        aVar.a(participant, new gji(participant, r, p370Var));
        Participant participant2 = Participant.DESTINATION_POINT_PIN;
        aVar.a(participant2, new gji(participant2, r2, p370Var));
        Participant participant3 = Participant.CHECK_IN_POINT_PIN;
        aVar.a(participant3, new gji(participant3, r4, p370Var));
        Participant participant4 = Participant.CAR_ICON;
        aVar.a(participant4, new gji(participant4, r5, p370Var));
        r5.i(false);
        r5.k(1.0f);
        this.r0 = r5;
        List singletonList = Collections.singletonList(r5);
        ktk0 ktk0Var = this.M;
        ktk0Var.l = singletonList;
        tje.N(ktk0Var.a, null, null, new RoadObjectsOverlay$updateVisibility$1(ktk0Var, true, null), 3);
        f4c0 r6 = Rg().r(point);
        r6.D(iconStyle);
        r6.i(false);
        r6.A(0.0f);
        r6.k(2.0f);
        this.s0 = r6;
        vub vubVar = new vub(new Circle(point, 0.0f));
        vubVar.b(Tg);
        vubVar.u(0);
        vubVar.p(0.0f);
        vubVar.r(this.W);
        this.u0 = vubVar;
        f4c0 r7 = Tg.r(point);
        r7.i(false);
        this.v0 = r7;
        f4c0 r8 = Tg.r(point);
        r8.i(false);
        this.w0 = r8;
        d dVar = this.y0;
        if (dVar != null) {
            dVar.f.a();
            dVar.i.b = dVar.a;
        }
        ktk0Var.e.Kg(ktk0Var.f);
        z3();
        c0 c0Var = this.C;
        c0Var.Bg(this);
        c0Var.W.j();
        if (!c0Var.N0) {
            com.yandex.go.coroutines.b.g(c0Var.Kg(), null, null, new OrderMapOverlayPresenter$attachView$1(c0Var, null), 3);
        }
        ((ru.yandex.taxi.altpins.map.a) this.I).c(new i080(this, i), new i080(this, 2));
    }

    public final void detach() {
        z3();
        this.P.clear();
        this.Q.clear();
        this.R.clear();
        this.S.clear();
        this.n0 = null;
        Ig();
        Tg().m();
        Tg().d();
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.t0 = null;
        this.s0 = null;
        this.r0 = null;
        ValueAnimator valueAnimator2 = this.i0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.i0 = null;
        this.j0 = 1.0f;
        Rg().m();
        Rg().d();
        this.x0 = null;
        ia();
        ec();
        d dVar = this.y0;
        if (dVar != null) {
            dVar.i.b = null;
            dVar.f.b();
        }
        ktk0 ktk0Var = this.M;
        ktk0Var.h.clear();
        ((xm00) ktk0Var.g.getValue()).m();
        ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) ((lp00) this.J.b);
        aVar.j(Participant.SOURCE_POINT_PIN);
        aVar.j(Participant.DESTINATION_POINT_PIN);
        aVar.j(Participant.CHECK_IN_POINT_PIN);
        aVar.j(Participant.CAR_ICON);
        this.C.Cg();
        Wg();
        ((ru.yandex.taxi.altpins.map.a) this.I).d();
    }

    @Override // defpackage.u080
    public final void e0() {
        w4e0 w4e0Var = this.x0;
        if (w4e0Var != null) {
            Tg().o(w4e0Var);
        }
        this.x0 = null;
    }

    @Override // defpackage.u080
    public final void ec() {
        w4e0 w4e0Var = this.z0;
        if (w4e0Var != null) {
            Tg().o(w4e0Var);
            this.z0 = null;
            this.O.e();
        }
    }

    @Override // defpackage.u080
    public final void f2(tu70 tu70Var) {
        w4e0 w4e0Var;
        this.A0 = tu70Var;
        PolylinePosition polylinePosition = tu70Var.c;
        ool0 ool0Var = tu70Var.a;
        if (polylinePosition == null) {
            e0();
            return;
        }
        Polyline geometry = ool0Var.getGeometry();
        w4e0 w4e0Var2 = this.x0;
        h3y h3yVar = this.D;
        if (w4e0Var2 != null) {
            w4e0Var2.o(geometry);
        } else {
            w4e0Var2 = Tg().s(geometry);
            this.x0 = w4e0Var2;
            js00 js00Var = this.C.M0;
            if (js00Var != null) {
                ((b2l0) h3yVar.get()).c(js00Var);
            }
        }
        w4e0Var2.k(0.0f);
        int size = geometry.getPoints().size() - 1;
        int i = m080.a[tu70Var.b.ordinal()];
        if (i == 1) {
            ((bf60) ((b2l0) h3yVar.get()).a.getValue()).f(w4e0Var2, size, tu70Var.d);
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            ((b2l0) h3yVar.get()).a(w4e0Var2);
            w4e0Var2.x(ool0Var.a());
        }
        PolylinePosition polylinePosition2 = tu70Var.c;
        if (polylinePosition2 == null || (w4e0Var = this.x0) == null) {
            return;
        }
        w4e0Var.r(Collections.singletonList(new Subpolyline(new PolylinePosition(0, 0.0d), polylinePosition2)));
    }

    @Override // defpackage.u080
    public final void f8(ArrayList arrayList) {
        d dVar = this.y0;
        int i = 0;
        if (dVar != null) {
            Iterator it = dVar.b.iterator();
            while (it.hasNext()) {
                ((f4c0) it.next()).i(false);
            }
        }
        xm00 Tg = Tg();
        ssd ssdVar = new ssd(5);
        ArrayList arrayList2 = this.R;
        ru.yandex.taxi.map.utils.a.I(Tg, arrayList2, arrayList, ssdVar);
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            f4c0 f4c0Var = (f4c0) arrayList2.get(i2);
            i2++;
            f4c0Var.x(((ugu0) ((sgu0) this.E.get())).b(i2, "", false, StopPointsProvider$StopPointPlace.MAP));
            f4c0Var.g(new k080(this, i));
        }
    }

    @Override // defpackage.u080
    public final void g2() {
        f4c0 f4c0Var = this.r0;
        if (f4c0Var != null) {
            f4c0Var.y(this.T);
            f4c0Var.i(true);
            f4c0Var.D(this.Z.setRotationType(RotationType.NO_ROTATION));
        }
        f4c0 f4c0Var2 = this.r0;
        if (f4c0Var2 != null) {
            List singletonList = Collections.singletonList(f4c0Var2);
            ktk0 ktk0Var = this.M;
            ktk0Var.l = singletonList;
            tje.N(ktk0Var.a, null, null, new RoadObjectsOverlay$updateVisibility$1(ktk0Var, true, null), 3);
        }
    }

    @Override // defpackage.u080
    public final void ia() {
        ((ru.yandex.taxi.map.c) ((j741) this.K.get())).a();
        this.C.Wg(null);
    }

    @Override // defpackage.u080
    public final void jg() {
        f4c0 f4c0Var = this.r0;
        if (f4c0Var != null) {
            f4c0Var.A(1.0f);
        }
    }

    @Override // defpackage.u080
    public final void lb(ArrayList arrayList) {
        d dVar = this.y0;
        if (dVar != null) {
            pzt0 pzt0Var = dVar.l;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            dVar.l = tje.N(dVar.f.c(), null, null, new OrderMapOverlayIconHolder$applyIntermediateStopsPinsInfo$1(arrayList, dVar, null), 3);
        }
    }

    @Override // defpackage.u080
    public final void mf(ArrayList arrayList) {
        xm00 Tg = Tg();
        ssd ssdVar = new ssd(5);
        ArrayList arrayList2 = this.P;
        ru.yandex.taxi.map.utils.a.I(Tg, arrayList2, arrayList, ssdVar);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((f4c0) it.next()).y(this.U);
        }
    }

    @Override // defpackage.u080
    public final void n8(String str, String str2, String str3) {
        CharSequence charSequence;
        f4c0 f4c0Var;
        f4c0 f4c0Var2;
        MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView;
        f4c0 f4c0Var3;
        ah00 ah00Var = (ah00) this.b;
        if (this.m0 == null || !jl40.l(str, Qg().getText())) {
            Qg().setText(str);
            xw31.r(Qg());
            this.m0 = xw31.t(Qg());
        }
        gh00 gh00Var = (gh00) ah00Var;
        TaxiMapView h = gh00Var.h();
        if (h != null && (f4c0Var3 = this.v0) != null && f4c0Var3.r != null) {
            f4c0Var3.E(this.z, h, new Size(Qg().getWidth(), Qg().getHeight()), new l080(this.C, 0));
        }
        f4c0 f4c0Var4 = this.v0;
        if (f4c0Var4 != null) {
            MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView2 = f4c0Var4.r;
            if (mapObjectAccessibilityPlaceMarkView2 == null || (charSequence = mapObjectAccessibilityPlaceMarkView2.getContentDescription()) == null) {
                charSequence = "";
            }
        } else {
            charSequence = null;
        }
        if (!jl40.l(str3, charSequence) && (f4c0Var2 = this.v0) != null && (mapObjectAccessibilityPlaceMarkView = f4c0Var2.r) != null) {
            mapObjectAccessibilityPlaceMarkView.setContentDescription(str3);
            mapObjectAccessibilityPlaceMarkView.announceForAccessibility(str3);
        }
        f4c0 f4c0Var5 = this.v0;
        if (f4c0Var5 != null) {
            f4c0Var5.i(true);
            f4c0Var5.y(ImageProvider.fromBitmap(this.m0));
            f4c0Var5.h(str2);
            f4c0Var5.g(this.f0);
        }
        O8();
        Bitmap bitmap = this.m0;
        if (bitmap == null) {
            return;
        }
        float height = this.o0.get$image().getHeight();
        float height2 = bitmap.getHeight();
        IconStyle iconStyle = new IconStyle();
        iconStyle.setAnchor(new PointF(0.5f, 0.5f - (((height - height2) / 2.0f) / height2)));
        TaxiMapView h2 = gh00Var.h();
        if (h2 == null || (f4c0Var = this.v0) == null) {
            return;
        }
        f4c0Var.D(iconStyle);
        f4c0Var.F(h2.worldToScreen((Point) f4c0Var.h));
    }

    @Override // defpackage.u080
    public final void o0(float f) {
        float f2 = this.j0;
        ValueAnimator valueAnimator = this.i0;
        if (f == f2) {
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Og(this.j0);
                return;
            }
            return;
        }
        Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        Float f3 = animatedValue instanceof Float ? (Float) animatedValue : null;
        float floatValue = f3 != null ? f3.floatValue() : this.j0;
        this.j0 = f;
        ValueAnimator valueAnimator2 = this.i0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new j080(this, 0));
        ofFloat.start();
        this.i0 = ofFloat;
    }

    @Override // defpackage.u080
    public final void qe(boolean z) {
        f4c0 f4c0Var = this.r0;
        if (f4c0Var != null) {
            f4c0Var.y(this.o0);
            IconStyle iconStyle = this.Z;
            f4c0Var.D(z ? iconStyle.setRotationType(RotationType.NO_ROTATION) : iconStyle.setRotationType(RotationType.ROTATE));
            f4c0Var.i(true);
        }
        f4c0 f4c0Var2 = this.r0;
        if (f4c0Var2 != null) {
            List singletonList = Collections.singletonList(f4c0Var2);
            ktk0 ktk0Var = this.M;
            ktk0Var.l = singletonList;
            tje.N(ktk0Var.a, null, null, new RoadObjectsOverlay$updateVisibility$1(ktk0Var, true, null), 3);
        }
        a380 a380Var = this.G;
        a380Var.b = true;
        a380Var.a();
    }

    @Override // defpackage.u080
    public final void r5(boolean z) {
        ((ru.yandex.taxi.map.c) ((j741) this.K.get())).b(z);
    }

    @Override // defpackage.u080
    public final void ra(zzs zzsVar) {
        Point F = ru.yandex.taxi.map.utils.a.F(zzsVar);
        f4c0 f4c0Var = this.r0;
        if (f4c0Var != null) {
            f4c0Var.o(F);
        }
        f4c0 f4c0Var2 = this.r0;
        if (f4c0Var2 != null) {
            f4c0Var2.i(true);
        }
        f4c0 f4c0Var3 = this.s0;
        if (f4c0Var3 != null) {
            f4c0Var3.o(F);
        }
        f4c0 f4c0Var4 = this.r0;
        if (f4c0Var4 != null) {
            List singletonList = Collections.singletonList(f4c0Var4);
            ktk0 ktk0Var = this.M;
            ktk0Var.l = singletonList;
            tje.N(ktk0Var.a, null, null, new RoadObjectsOverlay$updateVisibility$1(ktk0Var, true, null), 3);
        }
        vub vubVar = this.u0;
        if (vubVar != null) {
            vubVar.o(new Circle(F, ((Circle) vubVar.h).getRadius()));
        }
        f4c0 f4c0Var5 = this.v0;
        if (f4c0Var5 != null) {
            f4c0Var5.o(F);
        }
        f4c0 f4c0Var6 = this.w0;
        if (f4c0Var6 != null) {
            f4c0Var6.o(F);
        }
        this.F.a();
        a380 a380Var = this.G;
        a380Var.a = zzsVar;
        a380Var.b = true;
        a380Var.a();
    }

    @Override // defpackage.u080
    public final void t9() {
        final f4c0 f4c0Var = this.s0;
        if (f4c0Var != null && f4c0Var.b) {
            float f = f4c0Var.j;
            if (f == 0.0f) {
                return;
            }
            ValueAnimator valueAnimator = this.t0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new mt00(f4c0Var, 2));
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.map.overlay.OrderMapOverlay$hideCarOverlay$lambda$0$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    f4c0.this.i(false);
                    this.t0 = null;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            ofFloat.start();
            this.t0 = ofFloat;
        }
    }

    @Override // defpackage.u080
    public final void u5() {
        Lg().setVisible(true);
    }

    @Override // defpackage.u080
    public final void u7(float f) {
        f4c0 f4c0Var = this.r0;
        if (f4c0Var != null) {
            f4c0Var.v(f);
        }
        f4c0 f4c0Var2 = this.s0;
        if (f4c0Var2 != null) {
            f4c0Var2.v(f);
        }
    }

    @Override // defpackage.u080
    public final void updateUserLocation(mo21 mo21Var) {
        Ng(mo21Var.a, mo21Var.b, mo21Var.c);
    }

    @Override // defpackage.u080
    public final void z1() {
        vub vubVar = this.u0;
        if (vubVar != null) {
            vubVar.i(false);
        }
    }

    @Override // defpackage.u080
    public final void z3() {
        Lg().setVisible(false);
    }
}
