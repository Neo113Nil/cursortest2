package defpackage;

import com.yandex.go.navigator.BaseNavigatorModalView;

/* loaded from: classes12.dex */
public final class k55 implements bwc {
    public final /* synthetic */ BaseNavigatorModalView a;

    public k55(BaseNavigatorModalView baseNavigatorModalView) {
        this.a = baseNavigatorModalView;
    }

    @Override // defpackage.bwc
    public final void k(gwc gwcVar) {
        boolean z = gwcVar.a;
        BaseNavigatorModalView baseNavigatorModalView = this.a;
        if ((baseNavigatorModalView.getCompassButton().getVisibility() == 0) != z) {
            baseNavigatorModalView.getCompassButton().setVisibility(0);
            baseNavigatorModalView.getCompassButton().animate().alpha(z ? 1.0f : 0.0f).withEndAction(new rg3(z, baseNavigatorModalView, 3)).start();
        }
        baseNavigatorModalView.getCompassButton().setImageRotation(gwcVar.b);
    }
}
