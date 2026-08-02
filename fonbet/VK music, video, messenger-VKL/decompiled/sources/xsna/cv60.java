package xsna;

import kotlin.Result;
import xsna.qn60;
import xsna.qr60;
import xsna.xh60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cv60 implements izs {
    public final /* synthetic */ dv60 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ cv60(dv60 dv60Var, int i, boolean z) {
        this.b = dv60Var;
        this.c = i;
        this.d = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dv60 dv60Var = this.b;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = dv60Var.b;
        k070 k070Var = ((qz60) nn50Var.getCurrentState()).f;
        qn60 qn60Var = dv60Var.h.g;
        pn60 pn60Var = dv60Var.m;
        int i = this.c;
        Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new dzi0(i, k070Var, pn60Var)));
        if (!(b instanceof Result.Failure)) {
            qn60.c cVar = (qn60.c) b;
            nn50Var.e(new kv60(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
        }
        Throwable a = Result.a(b);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(a);
        }
        dv60Var.c(new xh60.h.g(i, this.d));
        return s3q0.a;
    }
}
