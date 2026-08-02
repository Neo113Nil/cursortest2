package com.yandex.go.splash.performance;

import android.os.Build;
import com.yandex.go.splash.dynamic.experiment.DynamicSplashPerformanceExperiment;
import defpackage.i9n;
import defpackage.j73;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.v4r0;
import java.util.LinkedHashSet;
import kotlin.collections.EmptySet;

/* loaded from: classes13.dex */
public final class a {
    public static final LinkedHashSet g;
    public final ru.yandex.taxi.perf.frame.a a;
    public final i9n b;
    public final com.yandex.go.splash.dynamic.a c;
    public final tse d;
    public pzt0 e;
    public String f;

    static {
        g = v4r0.h(j73.f0(new Integer[]{4, 5, 6, 8, 2, 1}), Build.VERSION.SDK_INT >= 31 ? j73.f0(new Integer[]{12, 13}) : EmptySet.a);
    }

    public a(ru.yandex.taxi.perf.frame.a aVar, i9n i9nVar, com.yandex.go.splash.dynamic.a aVar2, tse tseVar) {
        this.a = aVar;
        this.b = i9nVar;
        this.c = aVar2;
        this.d = tseVar;
    }

    public final void a() {
        if (((DynamicSplashPerformanceExperiment) this.b.a.c()).b) {
            String str = ((String) this.c.a.n.get()) != null ? "splash/dynamic" : "splash/static";
            this.f = str;
            this.a.a(str, g);
            pzt0 pzt0Var = this.e;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.e = tje.N(this.d, null, null, new SplashFrameRenderTracker$start$1(this, str, null), 3);
        }
    }

    public final void b() {
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = null;
        if (((DynamicSplashPerformanceExperiment) this.b.a.c()).b) {
            String str = this.f;
            if (str != null) {
                this.a.b(str);
            }
            this.f = null;
        }
    }
}
