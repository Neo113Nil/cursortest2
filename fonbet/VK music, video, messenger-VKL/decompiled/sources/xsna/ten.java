package xsna;

import com.vk.voip.ui.VoipViewModelState;
import java.util.concurrent.TimeUnit;
import xsna.cfn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ten implements izs {
    public final /* synthetic */ ven b;

    public /* synthetic */ ten(ven venVar) {
        this.b = venVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ven venVar = this.b;
        bfn bfnVar = venVar.c;
        afn afnVar = venVar.b;
        fjw0 fjw0Var = (fjw0) obj;
        VoipViewModelState a = fjw0Var.a();
        VoipViewModelState voipViewModelState = VoipViewModelState.Idle;
        if (a == voipViewModelState) {
            afnVar.e.e();
            bfnVar.a.b.remove(bfnVar);
            yen yenVar = venVar.e;
            yenVar.a.clear();
            yenVar.b.clear();
        }
        if (fjw0Var.a() != voipViewModelState && fjw0Var.b() == voipViewModelState) {
            io.reactivex.rxjava3.disposables.b bVar = afnVar.e;
            io.reactivex.rxjava3.subjects.f<cfn.a> fVar = afnVar.b.a;
            asu0 asu0Var = asu0.a;
            bVar.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.i0(fVar.a0(asu0Var.d()), new ql2(new hxl(afnVar, 2), 16)).w0(1L, TimeUnit.SECONDS).a0(asu0Var.d()), null, new rl2(19), new srg(afnVar, 10)));
            bfnVar.a.b.add(bfnVar);
        }
        return s3q0.a;
    }
}
