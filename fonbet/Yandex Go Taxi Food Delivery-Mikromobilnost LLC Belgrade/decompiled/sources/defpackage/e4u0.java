package defpackage;

import com.ybsdk.common.repositiories.auth.g;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class e4u0 implements c4u0 {
    public final AppAnalyticsReporter a;
    public final g b;
    public final y1r0 c;
    public final r0 w = bvf0.c(Boolean.FALSE);
    public boolean x;

    public e4u0(AppAnalyticsReporter appAnalyticsReporter, g gVar, y1r0 y1r0Var) {
        this.a = appAnalyticsReporter;
        this.b = gVar;
        this.c = y1r0Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        this.b.f.updateAndGet(new saj(4, new fnb0(5)));
        Boolean bool = Boolean.FALSE;
        r0 r0Var = this.w;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        this.b.c();
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.w;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        this.b.c();
    }
}
