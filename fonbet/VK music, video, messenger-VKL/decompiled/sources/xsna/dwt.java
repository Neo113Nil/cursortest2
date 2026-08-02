package xsna;

import com.vk.pushes.PushComponent;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class dwt implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ bpn0 c;

    public /* synthetic */ dwt(bpn0 bpn0Var, int i) {
        this.b = i;
        this.c = bpn0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (a8e0) this.c.getValue();
            default:
                bpn0 bpn0Var = this.c;
                VKApplication.a aVar = VKApplication.c;
                ph20 ph20Var = (ph20) bpn0Var.getValue();
                ph20Var.a();
                ((PushComponent) ((nmg0) ph20Var.c.invoke()).a(fpf0.a(PushComponent.class))).sc().a((r2 & 1) == 0, null);
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                io.reactivex.rxjava3.internal.operators.observable.j1 b0 = a1wVar.l.a().b0(u180.class);
                final hh20 hh20Var = new hh20();
                io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(b0, new io.reactivex.rxjava3.functions.m() { // from class: xsna.ih20
                    @Override // io.reactivex.rxjava3.functions.m
                    public final boolean test(Object obj) {
                        return ((Boolean) hh20.this.invoke(obj)).booleanValue();
                    }
                });
                final pu2 pu2Var = new pu2(2);
                io.reactivex.rxjava3.functions.f fVar = new io.reactivex.rxjava3.functions.f() { // from class: xsna.jh20
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj) {
                        pu2.this.invoke(obj);
                    }
                };
                int i = kwg0.a;
                i0Var.subscribe(fVar, new hwg0());
                return s3q0.a;
        }
    }
}
