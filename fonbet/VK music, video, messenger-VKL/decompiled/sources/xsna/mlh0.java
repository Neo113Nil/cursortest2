package xsna;

import androidx.media3.transformer.a0;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import xsna.aig;
import xsna.ihz;
import xsna.s8z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mlh0 implements io.reactivex.rxjava3.functions.l, ihz.a, Optional.Action, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, SwipeDrawableRefreshLayout.g, s8z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mlh0(androidx.media3.transformer.a0 a0Var, androidx.media3.transformer.t tVar) {
        this.b = 3;
        this.c = a0Var;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.c).lambda$requestIvrCall$18((VerificationListener) obj);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (it80) ((ehu) obj2).invoke(obj);
            case 1:
                return (it80) ((zyl0) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((zyl0) obj2).invoke(obj);
            case 3:
            case 5:
            default:
                int i2 = VideoSeekPreviewImage.G;
                return (io.reactivex.rxjava3.core.t) ((fk5) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((zyl0) obj2).invoke(obj);
            case 6:
                return (Integer) ((wd3) obj2).invoke(obj);
        }
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ((VoipScheduledCallsFragment) this.c).T.a(aig.e.a);
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((nuy0) this.c).P = z9z0Var;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((androidx.media3.transformer.a0) this.c).w.getClass();
        ((a0.c) obj).onCompleted();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((pzt0) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ mlh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (VoipActionsFeatureState.o) ((c80) this.c).invoke(obj, obj2);
    }
}
