package defpackage;

import android.view.ViewTreeObserver;
import ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class j100 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaasMetroPickModalView b;

    public /* synthetic */ j100(MaasMetroPickModalView maasMetroPickModalView, int i) {
        this.a = i;
        this.b = maasMetroPickModalView;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        int i = this.a;
        MaasMetroPickModalView maasMetroPickModalView = this.b;
        switch (i) {
            case 0:
                maasMetroPickModalView.updateDoneFramePosition();
                break;
            default:
                maasMetroPickModalView.updateDoneFramePosition();
                break;
        }
    }
}
