package defpackage;

import android.animation.ObjectAnimator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.scooters.photocontrol.camera_ui.take_photo.b;
import java.util.List;

/* loaded from: classes13.dex */
public final class djo0 implements fjo0 {
    public final ObjectAnimator a;
    public final /* synthetic */ b b;

    public djo0(b bVar) {
        this.b = bVar;
        this.a = ObjectAnimator.ofFloat(bVar.j().a, CaretView.ALPHA_PROPERTY, 0.5f, 1.0f);
    }

    @Override // defpackage.fjo0
    public final void De(boolean z) {
        b bVar = this.b;
        ObjectAnimator objectAnimator = this.a;
        if (z) {
            objectAnimator.setRepeatMode(2);
            objectAnimator.setRepeatCount(-1);
        } else {
            bVar.j().e.setEnabled(true);
            bVar.j().c.setTitle(bVar.m.d);
        }
        objectAnimator.setDuration(1000L);
        objectAnimator.start();
        bVar.n.a("Perf.ScootersPhotocontrolTakePhotoCameraLayer.InitPreview");
    }

    @Override // defpackage.fjo0
    public final void e() {
        this.b.g();
    }

    @Override // defpackage.fjo0
    public final void v4(List list) {
        ObjectAnimator objectAnimator = this.a;
        boolean isRunning = objectAnimator.isRunning();
        b bVar = this.b;
        if (isRunning) {
            objectAnimator.cancel();
            cma1.I(bVar.j().a);
        }
        bVar.m.a.setPoints(list);
    }
}
