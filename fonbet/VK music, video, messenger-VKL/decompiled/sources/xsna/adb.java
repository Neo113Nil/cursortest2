package xsna;

/* compiled from: ChannelStateDataSource.kt */
/* loaded from: classes16.dex */
public final class adb implements zcb {
    public final long a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final io.reactivex.rxjava3.subjects.d<ycb> c;
    public final io.reactivex.rxjava3.internal.operators.observable.y d;

    public adb(long j, a1w a1wVar) {
        this.a = j;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.b = bVar;
        io.reactivex.rxjava3.subjects.d<ycb> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.c = N0;
        this.d = new io.reactivex.rxjava3.internal.operators.observable.y(N0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        g2v.c().getClass();
        b();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new ca6(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 18), 4));
        int i = kwg0.a;
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, i0Var, null, new nu2("DeactivationChannelDataSource", 2), new fb(this, 17)));
    }

    @Override // xsna.zcb
    public final io.reactivex.rxjava3.internal.operators.observable.y a() {
        return this.d;
    }

    public final void b() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        this.b.b(io.reactivex.rxjava3.kotlin.c.e(a1wVar.C(this, new kza(this.a, false)).q(asu0.a.c()), new com.vk.im.ui.fragments.b(this, 20), new a8(this, 17)));
    }

    @Override // xsna.zcb
    public final void dispose() {
        this.b.dispose();
    }
}
