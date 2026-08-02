package xsna;

import com.vk.clips.interests.api.ClipsInterestsStatusProvider;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ClipsInterestsStatusHolder.kt */
/* loaded from: classes16.dex */
public final class eie implements ClipsInterestsStatusProvider {
    public final AtomicInteger a = new AtomicInteger(0);
    public final io.reactivex.rxjava3.subjects.d<ClipsInterestsStatusProvider.Status> b = io.reactivex.rxjava3.subjects.d.N0();

    @Override // com.vk.clips.interests.api.ClipsInterestsStatusProvider
    public final io.reactivex.rxjava3.internal.operators.observable.y a() {
        u5 u5Var = new u5(new e1(this, 26), 6);
        io.reactivex.rxjava3.subjects.d<ClipsInterestsStatusProvider.Status> dVar = this.b;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(dVar, u5Var), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }
}
