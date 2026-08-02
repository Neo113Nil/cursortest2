package xsna;

import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.util.List;
import kotlin.Pair;
import ru.ok.call_effects.internal.tensorflow.TensorflowConfigurator;
import ru.ok.gl.tf.Tensorflow;
import ru.rustore.sdk.activitylauncher.a;
import ru.rustore.sdk.appupdate.errors.RuStoreInstallException;
import xsna.kkl0;
import xsna.s9u;
import xsna.u8r0;
import xsna.uon0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class osk0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, Tensorflow.InitializeCallback, uon0.a, io.reactivex.rxjava3.functions.c, s9u.h, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.h, qa80 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ osk0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((xdi) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (c.s0.k) ((kxr0) this.c).invoke(obj, obj2, obj3);
    }

    @Override // xsna.s9u.h
    public boolean e(eo00 eo00Var) {
        return ((her0) this.c).c(new qdr0(eo00Var));
    }

    @Override // xsna.uon0.a
    public Object execute() {
        return ((klc) this.c).n();
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (VoipActionsFeatureState.k) ((eni) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // xsna.qa80
    public void g(ru.rustore.sdk.activitylauncher.a aVar) {
        vtj0 vtj0Var = (vtj0) this.c;
        if (aVar instanceof a.d ? true : aVar.equals(a.e.b) ? true : aVar.equals(a.f.b) ? true : aVar.equals(a.C2395a.b)) {
            vtj0Var.a(new RuStoreInstallException(aVar.a()));
            return;
        }
        if (aVar.equals(a.b.b) ? true : aVar.equals(a.c.b)) {
            vtj0Var.b(Integer.valueOf(aVar.a()));
        }
    }

    @Override // ru.ok.gl.tf.Tensorflow.InitializeCallback
    public void onInitialized() {
        TensorflowConfigurator.m399tryConfigureTensorflow$lambda6$lambda5((TensorflowConfigurator) this.c);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        eqr0 eqr0Var = (eqr0) this.c;
        eqr0Var.e = Integer.valueOf(com.vk.upload.impl.a.h(new aqr0(eqr0Var.a, eqr0Var.b), new y5m0(6, eqr0Var, rVar)));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 3:
                return ((Boolean) ((zlm0) this.c).invoke(obj)).booleanValue();
            case 15:
                return ((Boolean) ((r9c0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((zlm0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((ulz) this.c).invoke(obj);
            case 1:
                return (kkl0.e) ((fu10) this.c).invoke(obj);
            case 2:
                return (Pair) ((zlm0) this.c).invoke(obj);
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                return (io.reactivex.rxjava3.core.t) ((xat0) this.c).invoke(obj);
            case 7:
                return (List) ((zlm0) this.c).invoke(obj);
            case 8:
                return (u8r0.a) ((r9c0) this.c).invoke(obj);
            case 11:
                return (VideoAdvertisementsRepository.a) ((zlm0) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.t) ((h9i0) this.c).invoke(obj);
        }
    }
}
