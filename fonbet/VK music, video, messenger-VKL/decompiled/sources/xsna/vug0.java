package xsna;

import android.os.Looper;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vug0 implements izs {
    public final /* synthetic */ io.reactivex.rxjava3.core.w b;

    public /* synthetic */ vug0(io.reactivex.rxjava3.core.w wVar) {
        this.b = wVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.q T = io.reactivex.rxjava3.core.q.T((io.reactivex.rxjava3.core.p) obj);
        if (!epx.f(Looper.getMainLooper(), Looper.myLooper())) {
            T = T.a0(this.b);
        }
        return new io.reactivex.rxjava3.internal.operators.observable.w(T, new yq(new juz(24), 27));
    }
}
