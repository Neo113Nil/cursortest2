package com.yandex.plus.home.plaque.feature.internal.presentation;

import android.content.Context;
import android.view.View;
import com.yandex.plus.home.benchmark.BenchmarkState;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.plaquesdk.plaque.PlaqueView;
import defpackage.bvf0;
import defpackage.fy31;
import defpackage.g6u;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jb7;
import defpackage.jl40;
import defpackage.jse;
import defpackage.mic0;
import defpackage.oo2;
import defpackage.pgz;
import defpackage.pse;
import defpackage.s59;
import defpackage.tje;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final oo2 a;
    public final pgz b;
    public final jse c;
    public final i3y d;
    public ike e;
    public final PlaqueView f;

    public a(Context context, i3y i3yVar, mic0 mic0Var, fy31 fy31Var, oo2 oo2Var, pgz pgzVar, g6u g6uVar) {
        this.a = oo2Var;
        this.b = pgzVar;
        this.c = g6uVar;
        this.d = i3yVar;
        PlaqueView plaqueView = new PlaqueView(context, fy31Var, new s59(this), new PlaqueViewControllerImpl$view$2(1, (d) i3yVar.getValue(), d.class, "onWidgetClicked", "onWidgetClicked(Lcom/yandex/plus/plaquesdk/plaque/api/models/MicroWidgetModel;)V", 0), mic0Var);
        this.f = plaqueView;
        plaqueView.setId(View.generateViewId());
        plaqueView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.plaque.feature.internal.presentation.PlaqueViewControllerImpl$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                a aVar = a.this;
                pgz pgzVar2 = aVar.b;
                LogPriority logPriority = LogPriority.INFO;
                if (pgzVar2.e(logPriority)) {
                    pgzVar2.a(logPriority, "PlaqueViewControllerImpl", "onViewAttached()");
                }
                oo2 oo2Var2 = aVar.a;
                r0 r0Var = (r0) oo2Var2.b;
                Boolean bool = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool);
                oo2Var2.j();
                ike a = bvf0.a(aVar.c.plus(jl40.a()).plus(new pse("PlaqueViewControllerImpl")));
                aVar.e = a;
                tje.N(a, null, null, new PlaqueViewControllerImpl$onViewAttached$2(aVar, null), 3);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                a aVar = a.this;
                pgz pgzVar2 = aVar.b;
                LogPriority logPriority = LogPriority.INFO;
                if (pgzVar2.e(logPriority)) {
                    pgzVar2.a(logPriority, "PlaqueViewControllerImpl", "onViewDetached()");
                }
                ike ikeVar = aVar.e;
                if (ikeVar != null) {
                    bvf0.j(ikeVar, null);
                }
                aVar.e = null;
                oo2 oo2Var2 = aVar.a;
                jb7 jb7Var = (jb7) oo2Var2.w;
                if (jb7Var != null) {
                    AtomicReference atomicReference = (AtomicReference) jb7Var.w;
                    BenchmarkState benchmarkState = BenchmarkState.STARTED;
                    BenchmarkState benchmarkState2 = BenchmarkState.ERROR;
                    while (true) {
                        if (atomicReference.compareAndSet(benchmarkState, benchmarkState2)) {
                            ((com.yandex.plus.core.benchmark.b) jb7Var.b).c();
                            break;
                        } else if (atomicReference.get() != benchmarkState) {
                            break;
                        }
                    }
                }
                oo2Var2.w = null;
                r0 r0Var = (r0) oo2Var2.b;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
            }
        });
    }
}
