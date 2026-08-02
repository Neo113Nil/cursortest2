package defpackage;

import android.view.ViewTreeObserver;
import ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class a100 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaasExitChooseModalView b;

    public /* synthetic */ a100(MaasExitChooseModalView maasExitChooseModalView, int i) {
        this.a = i;
        this.b = maasExitChooseModalView;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        int i = this.a;
        MaasExitChooseModalView maasExitChooseModalView = this.b;
        switch (i) {
            case 0:
                maasExitChooseModalView.updateDoneFramePosition();
                break;
            default:
                maasExitChooseModalView.updateDoneFramePosition();
                break;
        }
    }
}
