package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;

/* compiled from: MessagesListDataLoader.kt */
/* loaded from: classes16.dex */
public final class vf20 {
    public final r920 a;
    public final ia20 b;
    public final yf20 c;
    public final io.reactivex.rxjava3.internal.operators.observable.y d;
    public final io.reactivex.rxjava3.core.q<ProfilesInfo> e;
    public final io.reactivex.rxjava3.subjects.f<wf20> f;
    public final io.reactivex.rxjava3.internal.operators.observable.z g;
    public final io.reactivex.rxjava3.subjects.d<Boolean> h;
    public final io.reactivex.rxjava3.internal.operators.observable.y i;
    public final io.reactivex.rxjava3.core.w j;
    public final io.reactivex.rxjava3.core.w k;
    public final io.reactivex.rxjava3.disposables.b l;
    public final io.reactivex.rxjava3.subjects.d<io.reactivex.rxjava3.functions.a> m;

    public vf20(eo9 eo9Var, r920 r920Var, ia20 ia20Var, bg20 bg20Var) {
        this.a = r920Var;
        this.b = ia20Var;
        this.c = bg20Var;
        io.reactivex.rxjava3.subjects.d N0 = io.reactivex.rxjava3.subjects.d.N0();
        io.reactivex.rxjava3.internal.operators.observable.j1 j1Var = (io.reactivex.rxjava3.internal.operators.observable.j1) eo9Var.a;
        j1Var.getClass();
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        new io.reactivex.rxjava3.internal.operators.observable.y(j1Var, qVar, aVar).subscribe(N0);
        this.d = new io.reactivex.rxjava3.internal.operators.observable.y(N0, qVar, aVar);
        this.e = ia20Var.e;
        io.reactivex.rxjava3.subjects.f<wf20> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.f = fVar;
        this.g = new io.reactivex.rxjava3.internal.operators.observable.z(new io.reactivex.rxjava3.internal.operators.observable.y(fVar, qVar, aVar), new fu0(new eiz(this, 5), 29));
        io.reactivex.rxjava3.subjects.d<Boolean> O0 = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
        this.h = O0;
        this.i = new io.reactivex.rxjava3.internal.operators.observable.y(O0, qVar, aVar);
        asu0 asu0Var = asu0.a;
        v860 A = asu0Var.A(1, "msg-list-loader");
        this.j = A;
        v860 A2 = asu0Var.A(1, "msg-list-loader-update");
        this.k = A2;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.l = bVar;
        io.reactivex.rxjava3.subjects.d<io.reactivex.rxjava3.functions.a> N02 = io.reactivex.rxjava3.subjects.d.N0();
        bVar.b(io.reactivex.rxjava3.kotlin.c.g(new io.reactivex.rxjava3.internal.operators.observable.b1(N02.a0(A2).U(new uf20(new p7x(3), 0))), new o3w(this, 11), null, 2));
        this.m = N02;
        io.reactivex.rxjava3.internal.operators.observable.c0 a = r920Var.a();
        a.getClass();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.y(a, qVar, aVar).a0(A), null, null, new j4x(this, 12)));
    }
}
