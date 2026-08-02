package xsna;

import android.view.View;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.pin.views.status.StatusView;
import com.vk.sharing.core.view.k;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import one.video.controls20.SimpleControlsView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ug implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ug(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v24, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractPollView.c cVar;
        bm9 presenter;
        bm9 presenter2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AbstractPollView abstractPollView = (AbstractPollView) obj;
                int i2 = AbstractPollView.S;
                if (!abstractPollView.getPoll().Bb() && abstractPollView.c && (cVar = abstractPollView.b) != null) {
                    cVar.J4(abstractPollView.getPoll());
                    break;
                }
                break;
            case 1:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                if (!cameraUIView.getClickLock().a() && !cameraUIView.getShutterLock().a() && (presenter = cameraUIView.getPresenter()) != null && presenter.U3() && (presenter2 = cameraUIView.getPresenter()) != null) {
                    presenter2.C4();
                    break;
                }
                break;
            case 2:
                qvl qvlVar = (qvl) obj;
                if (!jjc.b()) {
                    qvlVar.o.gm((iag) qvlVar.m, qvlVar);
                    break;
                }
                break;
            case 3:
                int i3 = vnt.n1;
                unt untVar = (unt) ((vnt) obj).f1;
                if (untVar != null) {
                    untVar.A();
                    break;
                }
                break;
            case 4:
                SimpleControlsView.P4((SimpleControlsView) obj);
                break;
            case 5:
                qfk0 qfk0Var = (qfk0) obj;
                qfk0Var.b.deactivate();
                qfk0Var.k.clearFocus();
                break;
            case 6:
                int i4 = StatusView.f;
                ((au) obj).b.invoke();
                break;
            case 7:
                k.a aVar = ((com.vk.sharing.core.view.k) obj).d;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
            case 8:
                ((ffo0) obj).b.invoke(deo0.a);
                break;
            case 9:
                ((com.vk.video.ui.discovery.minimizable.announce.a) obj).c.invoke();
                break;
            case 10:
                ((tts0) obj).f.invoke();
                break;
            case 11:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    break;
                }
                break;
            case 12:
                uxw0 uxw0Var = (uxw0) obj;
                uxw0Var.c.invoke(ScheduledAudioMuteOption.MutedPermanent);
                dw20 dw20Var = uxw0Var.i;
                if (dw20Var != null) {
                    dw20Var.tn();
                    break;
                }
                break;
            default:
                ((dhy0) obj).i.c(view, 2);
                break;
        }
    }
}
