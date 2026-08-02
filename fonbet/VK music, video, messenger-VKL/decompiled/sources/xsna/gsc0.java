package xsna;

import kotlin.Lazy;
import xsna.jm50;

/* compiled from: PostponedPostsMviOptionsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class gsc0 extends evg0<nsc0, on50, xsc0, zsc0, lsc0, wrc0> {
    public final kr60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gsc0(com.vk.channels.impl.channel_screen.send_msg.c cVar, Lazy lazy, Lazy lazy2, bpn0 bpn0Var, Lazy lazy3, esc0 esc0Var, nn50 nn50Var) {
        super(r6, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new kr60(cVar, lazy, lazy2, bpn0Var, lazy3, aVar, new eht(this, esc0Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        return this.f.d(((xsc0) hn50Var).b);
    }
}
