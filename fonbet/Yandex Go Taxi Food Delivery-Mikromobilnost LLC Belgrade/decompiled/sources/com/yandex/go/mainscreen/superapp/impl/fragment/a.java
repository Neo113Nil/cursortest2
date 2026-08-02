package com.yandex.go.mainscreen.superapp.impl.fragment;

import android.animation.Animator;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yandex.go.navigation.api.router.FragmentAnimation$TransitionType;
import defpackage.a2f0;
import defpackage.a400;
import defpackage.a850;
import defpackage.aos0;
import defpackage.ar;
import defpackage.b1c0;
import defpackage.c0u0;
import defpackage.cma1;
import defpackage.d0u0;
import defpackage.d350;
import defpackage.f600;
import defpackage.h3y;
import defpackage.hcs;
import defpackage.hes;
import defpackage.hpr0;
import defpackage.hst;
import defpackage.i3y;
import defpackage.ics;
import defpackage.jst;
import defpackage.mhf;
import defpackage.o500;
import defpackage.ooc;
import defpackage.oy01;
import defpackage.qje;
import defpackage.tje;
import defpackage.tse;
import defpackage.ubs;
import defpackage.vbs;
import defpackage.w511;
import defpackage.wbs;
import defpackage.xbs;
import defpackage.xby;
import defpackage.xng0;
import defpackage.y0c0;
import defpackage.ybs;
import defpackage.yvi0;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.activity.h;
import ru.yandex.taxi.animation.BaseAnimatorListener;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.map_common.map.MapViewInflateStrategy;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.settings.main.NativeMenuState;
import ru.yandex.taxi.settings.main.j;
import ru.yandex.taxi.settings.main.k;
import ru.yandex.taxi.ui.FragmentBackground;
import ru.yandex.taxi.viewholder.b;

/* loaded from: classes.dex */
public final class a implements a2f0 {
    public final Activity a;
    public final h3y b;
    public final h3y c;
    public final o500 d;
    public final h3y e;
    public final h3y f;
    public final hes g;
    public final mhf h;
    public final hcs i;
    public final a850 j;
    public final h k;
    public final p l;
    public final yvi0 m;
    public final tse n;
    public final i3y o;
    public final i3y p;

    public a(Activity activity, h3y h3yVar, h3y h3yVar2, o500 o500Var, h3y h3yVar3, h3y h3yVar4, hes hesVar, mhf mhfVar, hcs hcsVar, a850 a850Var, h hVar, p pVar, yvi0 yvi0Var, tse tseVar) {
        this.a = activity;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = o500Var;
        this.e = h3yVar3;
        this.f = h3yVar4;
        this.g = hesVar;
        this.h = mhfVar;
        this.i = hcsVar;
        this.j = a850Var;
        this.k = hVar;
        this.l = pVar;
        this.m = yvi0Var;
        this.n = tseVar;
        ar arVar = new ar(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = kotlin.a.b(lazyThreadSafetyMode, arVar);
        this.p = kotlin.a.b(lazyThreadSafetyMode, new ar(14));
    }

    @Override // defpackage.a2f0
    public final void c() {
        tje.N(this.n, null, null, new ActivityFragmentRouter$onActivityCreate$1(this, null), 3);
    }

    public final boolean d(BaseFragment baseFragment, xbs xbsVar) {
        oy01 oy01Var;
        View view;
        Activity activity = this.a;
        if (activity.isFinishing()) {
            jst.e.getClass();
            return false;
        }
        ((f600) this.b.get()).e();
        mhf mhfVar = this.h;
        mhfVar.c();
        this.j.i(baseFragment.getPromoName(), false);
        Fragment a = ((ics) this.i).a();
        hst hstVar = jst.e;
        hstVar.getClass();
        hes hesVar = this.g;
        if (hesVar.f()) {
            xby.t(hstVar, "AFR:TRANSACTION:COLLISION", new IllegalStateException("Trying to execute fragment transaction while transaction is running!"), null, 10);
            return false;
        }
        if (a == baseFragment) {
            return true;
        }
        FragmentBackground.Companion.getClass();
        FragmentBackground a2 = ybs.a(baseFragment);
        FragmentBackground a3 = ybs.a(a);
        if (xbsVar instanceof wbs) {
            d0u0 d0u0Var = d0u0.d;
            int i = c0u0.a[(((wbs) xbsVar).a == FragmentAnimation$TransitionType.ENTER ? NavigationDirection.FORWARD : NavigationDirection.BACKWARD).ordinal()];
            oy01Var = i != 1 ? i != 2 ? d0u0.d : d0u0.d : d0u0.e;
        } else if (xbsVar instanceof vbs) {
            FragmentAnimation$TransitionType fragmentAnimation$TransitionType = ((vbs) xbsVar).a;
            FragmentAnimation$TransitionType fragmentAnimation$TransitionType2 = FragmentAnimation$TransitionType.ENTER;
            if (fragmentAnimation$TransitionType == fragmentAnimation$TransitionType2 && a3 == FragmentBackground.MAP) {
                oy01Var = aos0.f;
            } else {
                aos0 aos0Var = aos0.e;
                oy01Var = ooc.n(fragmentAnimation$TransitionType == fragmentAnimation$TransitionType2 ? NavigationDirection.FORWARD : NavigationDirection.BACKWARD);
            }
        } else {
            if (!(xbsVar instanceof ubs)) {
                w511.b();
                return false;
            }
            oy01Var = oy01.a;
        }
        d350 d350Var = (d350) this.c.get();
        if (((k) d350Var.b.get()).g.a.getValue() != NativeMenuState.OPENING && !((j) d350Var.a.get()).d() && a3 != a2) {
            FragmentBackground fragmentBackground = FragmentBackground.MAP;
            h3y h3yVar = this.e;
            if (a2 == fragmentBackground) {
                this.l.b(MapViewInflateStrategy.OnMapScreenAppeared, "map screen opened");
                final b bVar = (b) h3yVar.get();
                if (bVar.d() != null) {
                    TaxiMapView d = bVar.d();
                    if (d != null && d.getVisibility() == 0 && bVar.b().getVisibility() == 8) {
                        bVar.b().animate().cancel();
                    } else {
                        TaxiMapView d2 = bVar.d();
                        if (d2 != null) {
                            d2.setVisibility(0);
                        }
                        bVar.b().setAlpha(1.0f);
                        cma1.c(bVar.b()).alpha(0.0f).setDuration(150L).setStartDelay(150L).setListener(new BaseAnimatorListener() { // from class: ru.yandex.taxi.viewholder.MapViewHolder$showMapAnimated$1
                            @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animation) {
                                b.this.b().setVisibility(8);
                            }
                        }).start();
                    }
                }
            } else {
                final b bVar2 = (b) h3yVar.get();
                if (bVar2.d() != null) {
                    TaxiMapView d3 = bVar2.d();
                    if (d3 != null && d3.getVisibility() == 8 && bVar2.b().getVisibility() == 0 && bVar2.b().getAlpha() == 1.0f) {
                        bVar2.b().animate().cancel();
                    } else {
                        bVar2.b().setVisibility(0);
                        bVar2.b().setAlpha(0.0f);
                        cma1.c(bVar2.b()).alpha(1.0f).setDuration(150L).setStartDelay(0L).setListener(new BaseAnimatorListener() { // from class: ru.yandex.taxi.viewholder.MapViewHolder$hideMapAnimated$1
                            @Override // ru.yandex.taxi.animation.BaseAnimatorListener, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animation) {
                                TaxiMapView d4 = b.this.d();
                                if (d4 != null) {
                                    d4.setVisibility(8);
                                }
                            }
                        }).start();
                    }
                }
            }
        }
        if (baseFragment instanceof YandexTaxiFragment) {
            this.d.a(((YandexTaxiFragment) baseFragment).getMainMenuOwner());
        }
        if (a instanceof BaseFragment) {
            ((BaseFragment) a).onDismissingStart();
        }
        baseFragment.onAppearingStart(activity);
        boolean z = baseFragment instanceof MapFragment;
        i3y i3yVar = this.p;
        i3y i3yVar2 = this.o;
        yvi0 yvi0Var = this.m;
        h3y h3yVar2 = this.f;
        if (z) {
            ((hpr0) h3yVar2.get()).b((y0c0) i3yVar2.getValue(), (b1c0) i3yVar.getValue());
            ((a400) yvi0Var.a).a.setMotionEventSplittingEnabled(false);
        } else {
            ((hpr0) h3yVar2.get()).a((y0c0) i3yVar2.getValue(), (b1c0) i3yVar.getValue());
            ((a400) yvi0Var.a).a.setMotionEventSplittingEnabled(true);
        }
        hesVar.g(baseFragment, oy01Var);
        if (mhfVar.a() != baseFragment) {
            mhfVar.b.l(baseFragment);
            mhfVar.c();
        }
        if (a2 != FragmentBackground.BLANK || (view = baseFragment.getView()) == null) {
            return true;
        }
        view.setBackgroundColor(qje.u(activity.getTheme(), xng0.bgMain));
        return true;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ActivityFragmentRouter";
    }
}
