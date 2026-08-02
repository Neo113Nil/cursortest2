package xsna;

import android.view.View;
import com.vk.clips.tool.view.newsfeed.mytarget.ClipEndOverlayAdWrapperView;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import xsna.zu50;

/* compiled from: ClipEndOverlayAdWrapperView.kt */
/* loaded from: classes17.dex */
public final class kvc implements zu50.c {
    public final /* synthetic */ ClipEndOverlayAdWrapperView a;
    public final /* synthetic */ lvc b;
    public final /* synthetic */ gzs<Boolean> c;

    public kvc(ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView, lvc lvcVar, gzs<Boolean> gzsVar) {
        this.a = clipEndOverlayAdWrapperView;
        this.b = lvcVar;
        this.c = gzsVar;
    }

    @Override // xsna.zu50.c
    public final void b(zu50 zu50Var) {
        ClipEndOverlayView.b bVar;
        lyk0 lyk0Var;
        ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView = this.a;
        gmc gmcVar = clipEndOverlayAdWrapperView.h;
        if (gmcVar == null || (bVar = clipEndOverlayAdWrapperView.i) == null || (lyk0Var = ClipEndOverlayView.this.l) == null) {
            return;
        }
        ((xme) lyk0Var.b).c((String) lyk0Var.c, gmcVar);
    }

    @Override // xsna.zu50.c
    public final void c(iaz0 iaz0Var, zu50 zu50Var) {
        int i = ClipEndOverlayAdWrapperView.m;
        ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView = this.a;
        clipEndOverlayAdWrapperView.h();
        f4m.j(clipEndOverlayAdWrapperView);
    }

    @Override // xsna.zu50.c
    public final void d(cw50 cw50Var, zu50 zu50Var) {
        tkp endOverlayBannerAdConfig;
        ClipEndOverlayView.b bVar;
        lyk0 lyk0Var;
        boolean z = this.b.c;
        gmc gmcVar = new gmc(zu50Var, cw50Var, z);
        ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView = this.a;
        endOverlayBannerAdConfig = clipEndOverlayAdWrapperView.getEndOverlayBannerAdConfig();
        if (endOverlayBannerAdConfig != null && (bVar = clipEndOverlayAdWrapperView.i) != null && (lyk0Var = ClipEndOverlayView.this.l) != null) {
            ((xme) lyk0Var.b).a((String) lyk0Var.c, gmcVar);
        }
        clipEndOverlayAdWrapperView.h = gmcVar;
        if (this.c.invoke().booleanValue()) {
            clipEndOverlayAdWrapperView.f();
            clipEndOverlayAdWrapperView.g(zu50Var, cw50Var, z);
        }
    }

    @Override // xsna.zu50.c
    public final void onClick() {
    }

    @Override // xsna.zu50.c
    @ozl
    public final void onVideoComplete() {
    }

    @Override // xsna.zu50.c
    @ozl
    public final void onVideoPause() {
    }

    @Override // xsna.zu50.c
    @ozl
    public final void onVideoPlay() {
    }

    @Override // xsna.zu50.c
    public final void a(View view, zu50 zu50Var) {
    }
}
