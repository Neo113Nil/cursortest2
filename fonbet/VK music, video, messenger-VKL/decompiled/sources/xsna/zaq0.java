package xsna;

import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.toggle.features.ClipsFeatures;
import kotlin.Pair;
import xsna.gij;

/* compiled from: UploadEventsObserverImpl.kt */
/* loaded from: classes4.dex */
public final class zaq0 implements uaq0 {
    public final eef a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;

    public zaq0(eef eefVar, p870 p870Var, p870 p870Var2, io.reactivex.rxjava3.internal.operators.observable.i0 i0Var, io.reactivex.rxjava3.internal.operators.observable.i0 i0Var2) {
        this.a = eefVar;
        this.b = new bpn0(new qah0(p870Var, 11));
        this.c = new bpn0(new qbc0(p870Var2, 22));
        this.d = new bpn0(new tsk0(i0Var, 11));
        this.e = new bpn0(new wzb0(i0Var2, 20));
    }

    @Override // xsna.uaq0
    public final io.reactivex.rxjava3.core.q<gij.d> a() {
        return (io.reactivex.rxjava3.core.q) this.d.getValue();
    }

    @Override // xsna.uaq0
    public final io.reactivex.rxjava3.core.q<gij.b> b() {
        return (io.reactivex.rxjava3.core.q) this.c.getValue();
    }

    @Override // xsna.uaq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c() {
        ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_NEW_UPLOADER;
        clipsFeatures.getClass();
        if (com.vk.toggle.b.A.a(clipsFeatures)) {
            io.reactivex.rxjava3.core.q<Pair<ClipUploadJob, ded>> i = this.a.i();
            pu50 pu50Var = new pu50(new u620(26), 14);
            i.getClass();
            return new io.reactivex.rxjava3.internal.operators.observable.i0(i, pu50Var).U(new mvc0(new kl60(21), 7));
        }
        io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) this.e.getValue();
        h8e0 h8e0Var = new h8e0(new yaq0(0), 2);
        qVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(qVar, h8e0Var).U(new n5j0(new y160(15), 4));
    }

    @Override // xsna.uaq0
    public final io.reactivex.rxjava3.core.q<gij.c> d() {
        return (io.reactivex.rxjava3.core.q) this.b.getValue();
    }
}
