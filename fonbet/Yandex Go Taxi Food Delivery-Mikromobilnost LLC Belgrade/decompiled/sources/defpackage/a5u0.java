package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.plus.home.feature.webviews.internal.container.a;
import com.yandex.plus.home.feature.webviews.internal.overlap.ViewOverlappingDetector$State;
import com.yandex.plus.log.api.LogPriority;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes2.dex */
public final class a5u0 {
    public final long a;
    public final float b;
    public final sls c;
    public final View d;
    public final el11 e;
    public volatile boolean f;
    public ViewOverlappingDetector$State g = ViewOverlappingDetector$State.VIEW_IS_NOT_OVERLAPPED;
    public long h;

    public a5u0(long j, float f, sls slsVar, FrameLayout frameLayout, el11 el11Var) {
        this.a = j;
        this.b = f;
        this.c = slsVar;
        this.d = frameLayout;
        this.e = el11Var;
        this.h = ((Number) slsVar.invoke()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, android.view.View$OnLayoutChangeListener, dmn] */
    public final void a(z4u0 z4u0Var) {
        y4u0 y4u0Var = y4u0.a;
        if (this.f) {
            return;
        }
        if (!z4u0Var.equals(x4u0.a)) {
            if (!z4u0Var.equals(y4u0Var)) {
                w511.b();
                return;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? dmnVar = new dmn(4, this, ref$ObjectRef);
            ref$ObjectRef.element = dmnVar;
            this.d.addOnLayoutChangeListener(dmnVar);
            return;
        }
        ViewOverlappingDetector$State viewOverlappingDetector$State = gi91.c(this.d) <= this.b ? ViewOverlappingDetector$State.VIEW_IS_OVERLAPPED : ViewOverlappingDetector$State.VIEW_IS_NOT_OVERLAPPED;
        if (viewOverlappingDetector$State != this.g) {
            this.g = viewOverlappingDetector$State;
            a aVar = (a) this.e.b;
            pgz pgzVar = aVar.w;
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "WebViewsControllerImpl", "startViewOverlappingDetector(): " + viewOverlappingDetector$State);
            }
            dje l = aVar.l();
            int i = tv41.a[viewOverlappingDetector$State.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    w511.b();
                    return;
                } else if (l != null) {
                    l.onHasStoppedBeingOverlapped();
                }
            } else if (l != null) {
                l.onHasStartedBeingOverlapped();
            }
        }
        this.h = ((Number) this.c.invoke()).longValue();
        a(y4u0Var);
    }
}
