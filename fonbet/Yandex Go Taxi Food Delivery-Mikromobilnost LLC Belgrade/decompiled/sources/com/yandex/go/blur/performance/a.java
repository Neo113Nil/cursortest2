package com.yandex.go.blur.performance;

import android.os.Build;
import android.view.View;
import defpackage.g8e;
import defpackage.j73;
import defpackage.jl40;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.v66;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptySet;

/* loaded from: classes12.dex */
public final class a implements v66 {
    public final v66 a;
    public final ru.yandex.taxi.perf.frame.a b;
    public final tse c;
    public final String d;
    public final AtomicReference e = new AtomicReference();
    public pzt0 f;

    public a(String str, v66 v66Var, ru.yandex.taxi.perf.frame.a aVar, tse tseVar) {
        this.a = v66Var;
        this.b = aVar;
        this.c = tseVar;
        this.d = g8e.p(str, "/", v66Var.a());
    }

    @Override // defpackage.v66
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.v66
    public final void b(View view) {
        this.a.b(view);
        View view2 = (View) this.e.getAndSet(view);
        if (jl40.l(view2, view)) {
            return;
        }
        String str = this.d;
        ru.yandex.taxi.perf.frame.a aVar = this.b;
        if (view2 != null) {
            aVar.b(str);
        }
        aVar.a(str, v4r0.h(j73.f0(new Integer[]{4, 5, 6, 8, 2, 1}), Build.VERSION.SDK_INT >= 31 ? j73.f0(new Integer[]{12, 13}) : EmptySet.a));
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = tje.N(this.c, null, null, new PerformanceTrackingBlurDelegate$attachTo$1(this, view, null), 3);
    }

    @Override // defpackage.v66
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.v66
    public final void d(tls tlsVar, String str) {
        this.a.d(tlsVar, str);
    }

    @Override // defpackage.v66
    public final void detach() {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = null;
        if (this.e.getAndSet(null) != null) {
            this.b.b(this.d);
        }
        this.a.detach();
    }
}
