package xsna;

import com.vk.clips.sdk.shared.api.external.action.ClipExternalAction;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ClipsExternalActionRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class z1e implements y1e {
    public final io.reactivex.rxjava3.subjects.f<qvc> a = new io.reactivex.rxjava3.subjects.f<>();
    public final ConcurrentHashMap<String, ClipExternalAction> b = new ConcurrentHashMap<>();

    @Override // xsna.y1e
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(String str) {
        nu0 nu0Var = new nu0(new qf5(str, 1), 11);
        io.reactivex.rxjava3.subjects.f<qvc> fVar = this.a;
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, nu0Var);
        int i = 17;
        return i0Var.D(new io1(new com.vk.libvideo.design.view.video.a(8, this, str), i)).U(new j8(new i8(i), 9));
    }

    @Override // xsna.y1e
    public final void b(qvc qvcVar) {
        this.b.put(qvcVar.a, qvcVar.b);
        this.a.onNext(qvcVar);
    }

    @Override // xsna.y1e
    public final ClipExternalAction get(String str) {
        return this.b.remove(str);
    }
}
