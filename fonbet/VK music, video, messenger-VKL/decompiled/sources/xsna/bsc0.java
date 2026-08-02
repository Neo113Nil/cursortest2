package xsna;

import kotlin.Lazy;
import xsna.jm50;

/* compiled from: PostponedPostsMviItemTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class bsc0 extends evg0<nsc0, on50, vsc0, zsc0, lsc0, wrc0> {
    public final rq60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bsc0(qn60 qn60Var, pn60 pn60Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, Lazy lazy, Lazy lazy2, Lazy lazy3, esc0 esc0Var, nn50 nn50Var) {
        super(r7, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new rq60(qn60Var, pn60Var, cVar, lazy, lazy2, lazy3, aVar, new eht(this, esc0Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        return this.f.d(((vsc0) hn50Var).b);
    }
}
