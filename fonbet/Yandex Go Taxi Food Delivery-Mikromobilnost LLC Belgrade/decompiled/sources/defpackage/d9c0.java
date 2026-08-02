package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.places.flex.container.ui.PlacesFlexContainerScreenView;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;

/* loaded from: classes13.dex */
public final class d9c0 extends c9c0 {
    public final ffe F;
    public final PlacesFlexContainerScreenView G;

    public d9c0(ffe ffeVar, PlacesFlexContainerScreenView placesFlexContainerScreenView, boolean z) {
        super(z);
        this.F = ffeVar;
        this.G = placesFlexContainerScreenView;
    }

    @Override // defpackage.tmr
    public final void P(Object obj, ylr ylrVar) {
        ffe ffeVar = this.F;
        ffeVar.a.addView(ylrVar.asView());
        ffeVar.a(ylrVar.asView(), ContentContainer$ZOrder.MOST_IMPORTANT);
    }

    @Override // defpackage.tmr
    public final ylr Q(Object obj) {
        return this.G;
    }

    @Override // defpackage.c9c0
    public final void R(RecyclerView.g gVar) {
        this.G.addScrollListener(gVar);
    }

    @Override // defpackage.c9c0
    public final ywl S() {
        return this.G.currentDocument();
    }

    @Override // defpackage.c9c0
    public final void T() {
        this.G.onDestroy(true);
    }

    @Override // defpackage.c9c0
    public final void U(kr krVar) {
        this.G.dispatchAction(krVar);
    }

    @Override // defpackage.c9c0
    public final void V(o8c0 o8c0Var, k8c0 k8c0Var) {
        this.G.reloadDocument(o8c0Var, k8c0Var);
    }

    @Override // defpackage.c9c0
    public final void W() {
        this.G.pauseManually();
    }

    @Override // defpackage.c9c0
    public final void X(RecyclerView.g gVar) {
        this.G.removeScrollListener(gVar);
    }

    @Override // defpackage.c9c0
    public final void Y() {
        this.G.resumeManually();
    }

    @Override // defpackage.c9c0
    public final void Z() {
        this.G.scrollToTop();
    }

    @Override // defpackage.c9c0
    public final void a0(boolean z) {
        this.G.setLifecycleManagedExternally(z);
    }

    @Override // defpackage.c9c0
    public final boolean b0(boolean z) {
        return this.G.setRecyclerVerticalScrollEnabled$impl(z);
    }

    @Override // defpackage.c9c0
    public final void c0(ywl ywlVar) {
        this.G.showDocument(ywlVar);
    }
}
