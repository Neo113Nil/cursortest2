package com.yandex.go.flex.main_screen.presentation;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.FlexStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.flex.common.FlexibleGridVersion;
import com.yandex.go.flex.main_screen.experiments.SuperappMainFeedClientFeaturesExperiment;
import com.yandex.go.flex.main_screen.experiments.j;
import com.yandex.go.flex.screens.common.flexible.layout.manager.FlexibleGridLayoutManager;
import com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid.VerticalStaggeredGridLayoutManager;
import core.flex.ui.OrientationAwareRecyclerView;
import defpackage.amt0;
import defpackage.bki0;
import defpackage.ca00;
import defpackage.cfx;
import defpackage.da00;
import defpackage.f800;
import defpackage.ipq;
import defpackage.jln;
import defpackage.jpq;
import defpackage.kpq;
import defpackage.nbw0;
import defpackage.ob00;
import defpackage.pnr;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.zbw0;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class d implements bki0 {
    public final Context a;
    public final nbw0 b;
    public final j c;
    public final zbw0 d;
    public final ob00 e;
    public final tse f;
    public final com.yandex.div.core.expression.variables.a g;
    public final ipq h;

    public d(Context context, nbw0 nbw0Var, j jVar, zbw0 zbw0Var, ob00 ob00Var, tse tseVar, com.yandex.div.core.expression.variables.a aVar, ipq ipqVar) {
        this.a = context;
        this.b = nbw0Var;
        this.c = jVar;
        this.d = zbw0Var;
        this.e = ob00Var;
        this.f = tseVar;
        this.g = aVar;
        this.h = ipqVar;
    }

    @Override // defpackage.bki0
    public final void a(final OrientationAwareRecyclerView orientationAwareRecyclerView) {
        FlexibleGridVersion flexibleGridVersion;
        RecyclerView.e eVar;
        orientationAwareRecyclerView.setItemAnimator(null);
        orientationAwareRecyclerView.setClipChildren(false);
        ((jpq) this.h).getClass();
        orientationAwareRecyclerView.addOnScrollListener(new kpq(this.g));
        orientationAwareRecyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkRecyclerConfigurator$configure$$inlined$doOnEveryAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                d dVar = d.this;
                tje.N(dVar.f, null, null, new MainScreenFlexSdkRecyclerConfigurator$configure$1$1(dVar, v, null), 3);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        });
        boolean isAttachedToWindow = orientationAwareRecyclerView.isAttachedToWindow();
        tse tseVar = this.f;
        if (isAttachedToWindow) {
            tje.N(tseVar, null, null, new MainScreenFlexSdkRecyclerConfigurator$configure$1$1(this, orientationAwareRecyclerView, null), 3);
        }
        this.c.getClass();
        androidx.core.view.b.p(orientationAwareRecyclerView, new f800(orientationAwareRecyclerView));
        RecyclerView.Adapter adapter = orientationAwareRecyclerView.getAdapter();
        SuperappMainFeedClientFeaturesExperiment superappMainFeedClientFeaturesExperiment = (SuperappMainFeedClientFeaturesExperiment) this.b.a.c();
        if (superappMainFeedClientFeaturesExperiment.f) {
            pnr pnrVar = FlexibleGridVersion.Companion;
            String str = superappMainFeedClientFeaturesExperiment.g;
            pnrVar.getClass();
            flexibleGridVersion = pnr.a(str);
        } else {
            flexibleGridVersion = null;
        }
        if ((adapter instanceof cfx) && flexibleGridVersion != null) {
            amt0 amt0Var = new amt0((cfx) adapter);
            int i = ca00.a[flexibleGridVersion.ordinal()];
            if (i == 1) {
                eVar = new VerticalStaggeredGridLayoutManager(amt0Var);
            } else if (i == 2) {
                FlexStaggeredGridLayoutManager flexStaggeredGridLayoutManager = new FlexStaggeredGridLayoutManager(amt0Var);
                flexStaggeredGridLayoutManager.W1();
                eVar = flexStaggeredGridLayoutManager;
            } else if (i != 3) {
                w511.b();
                return;
            } else {
                eVar = new FlexibleGridLayoutManager(amt0Var.e, new jln(20, amt0Var), this.a);
            }
            orientationAwareRecyclerView.setLayoutManager(eVar);
            final ob00 ob00Var = this.e;
            ob00Var.getClass();
            orientationAwareRecyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.flex.main_screen.presentation.MainScreenRecyclerStateKeeper$attach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v) {
                    ob00 ob00Var2 = ob00.this;
                    RecyclerView.e layoutManager = orientationAwareRecyclerView.getLayoutManager();
                    ob00Var2.a = layoutManager != null ? layoutManager.X0() : null;
                }
            });
            RecyclerView.e layoutManager = orientationAwareRecyclerView.getLayoutManager();
            Parcelable parcelable = ob00Var.a;
            if (parcelable != null) {
                if (layoutManager != null) {
                    layoutManager.W0(parcelable);
                }
                ob00Var.a = null;
            }
            if (((Boolean) tje.Y(EmptyCoroutineContext.a, new MainScreenFlexSdkRecyclerConfigurator$configure$isSuperappFloatingHeaderEnabled$1(this, null))).booleanValue() && (orientationAwareRecyclerView.getLayoutManager() instanceof FlexibleGridLayoutManager)) {
                orientationAwareRecyclerView.addOnScrollListener(new da00(orientationAwareRecyclerView));
            }
        }
        com.yandex.go.flex.main_screen.presentation.scroll.a.a(orientationAwareRecyclerView, this.d, tseVar);
    }
}
