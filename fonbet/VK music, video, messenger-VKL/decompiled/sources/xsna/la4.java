package xsna;

import com.vk.voip.dto.type.StartCallType;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;
import xsna.qwi0;
import xsna.wjy;
import xsna.xtb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class la4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ la4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        jhu P0;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                na4 na4Var = (na4) obj2;
                x94 x94Var = (x94) obj;
                final ra4 ra4Var = na4Var.b;
                final String d = x94Var.d();
                io.reactivex.rxjava3.internal.operators.completable.l l = io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.pa4
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        ra4.this.a.p(new tkv(d, false, 4));
                    }
                });
                io.reactivex.rxjava3.internal.operators.completable.l b = na4Var.a.b(x94Var.c());
                a.x xVar = io.reactivex.rxjava3.internal.functions.a.g;
                return new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.x(l.c(new io.reactivex.rxjava3.internal.operators.completable.v(b, xVar)), new s41(new u9(2, x94Var, na4Var), 3)), xVar);
            case 1:
                return ((Boolean) obj).booleanValue() ? ((e8e0) ((gwt) obj2).d.getValue()).b() : io.reactivex.rxjava3.internal.operators.observable.g0.b;
            case 2:
                ihu ihuVar = (ihu) obj2;
                miu miuVar = ihuVar.b;
                fjw0 fjw0Var = (fjw0) obj;
                VoipViewModelState a = fjw0Var.a();
                VoipViewModelState voipViewModelState = VoipViewModelState.Idle;
                if (a == voipViewModelState) {
                    miuVar.c.e();
                }
                if (fjw0Var.a() != voipViewModelState && fjw0Var.b() == voipViewModelState) {
                    io.reactivex.rxjava3.internal.operators.observable.t2 w0 = miuVar.b.w0(100L, TimeUnit.MILLISECONDS);
                    asu0 asu0Var = asu0.a;
                    io.reactivex.rxjava3.disposables.c subscribe = w0.a0(asu0Var.d()).subscribe(new c40(new zxo(miuVar, 14), 23));
                    io.reactivex.rxjava3.disposables.b bVar = miuVar.c;
                    bVar.b(subscribe);
                    GroupCallViewModel.b.getClass();
                    bVar.b(GroupCallViewModel.g().a0(asu0Var.d()).subscribe(new tz(new cws(miuVar, 7), 19)));
                }
                if (fjw0Var.a() == VoipViewModelState.CallingPeer && fjw0Var.b() == VoipViewModelState.AboutToCallPeer) {
                    boolean c = rpk0.c((StartCallType) ihuVar.a.q().a);
                    io.reactivex.rxjava3.subjects.d<jhu> dVar = miuVar.d;
                    jhu P02 = dVar.P0();
                    if (P02 != null) {
                        dVar.onNext(jhu.a(P02, c, false, false, false, false, 0, 62));
                    }
                    if (c && (P0 = dVar.P0()) != null) {
                        dVar.onNext(jhu.a(P0, false, false, false, false, false, 0, 49));
                    }
                }
                return s3q0.a;
            case 3:
                if (((a460) obj2).c) {
                    return tz80.a(new zru(), "GzipRequest");
                }
                return null;
            case 4:
                return (Boolean) ((wjy.a) obj2).i.invoke();
            default:
                com.vk.voip.ui.sessionrooms.d dVar2 = (com.vk.voip.ui.sessionrooms.d) obj2;
                xtb xtbVar = (xtb) obj;
                if (xtbVar instanceof xtb.a) {
                    dVar2.k().C(new qwi0.o(((xtb.a) xtbVar).a().getText()));
                }
                return s3q0.a;
        }
    }
}
