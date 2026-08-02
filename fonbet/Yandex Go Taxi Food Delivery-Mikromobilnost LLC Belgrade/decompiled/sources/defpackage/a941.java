package defpackage;

import android.widget.FrameLayout;
import com.yandex.go.flex.common.facade.routers.views.EmbeddedFlexView;

/* loaded from: classes12.dex */
public final class a941 {
    public final v841 a;
    public final FrameLayout b;

    public a941(v841 v841Var) {
        this.a = v841Var;
        this.b = v841Var.j;
    }

    public final void a() {
        this.a.b();
    }

    public final FrameLayout b() {
        return this.b;
    }

    public final void c() {
        v841 v841Var = this.a;
        EmbeddedFlexView embeddedFlexView = v841Var.k;
        if (embeddedFlexView != null) {
            embeddedFlexView.onPagePaused();
        }
        nbs0 nbs0Var = v841Var.h;
        nbs0Var.a.g(new y741("paused"));
        v841Var.m = true;
    }

    public final void d() {
        this.a.a();
    }

    public final void e() {
        v841 v841Var = this.a;
        hbp0 hbp0Var = v841Var.i;
        EmbeddedFlexView embeddedFlexView = v841Var.k;
        if (embeddedFlexView == null || !embeddedFlexView.isFlexDocumentAlive()) {
            v841Var.m = false;
            v841Var.b();
            v841Var.a();
            return;
        }
        embeddedFlexView.clearOverlayDetachPreserve();
        if (!hbp0Var.d()) {
            hbp0Var.a();
        }
        embeddedFlexView.onPageResumed();
        nbs0 nbs0Var = v841Var.h;
        nbs0Var.a.g(new y741("resumed"));
    }

    public final void f() {
        v841 v841Var = this.a;
        EmbeddedFlexView embeddedFlexView = v841Var.k;
        if (embeddedFlexView != null) {
            embeddedFlexView.prepareForOverlayDetach();
        }
        EmbeddedFlexView embeddedFlexView2 = v841Var.k;
        if (embeddedFlexView2 != null) {
            embeddedFlexView2.onPagePaused();
        }
        nbs0 nbs0Var = v841Var.h;
        nbs0Var.a.g(new y741("paused"));
        v841Var.m = false;
    }
}
