package xsna;

import com.vk.im.engine.models.LongPollType;
import com.vk.im.reporters.api.engine.LongPollExpiredReporter;

/* compiled from: ApplySpacesLpTask.kt */
/* loaded from: classes2.dex */
public final class pd3 extends e500 {
    public final w2w c;
    public final LongPollExpiredReporter.Reason d;

    public pd3(w2w w2wVar, LongPollExpiredReporter.Reason reason) {
        super("ApplySpacesLpTask");
        this.c = w2wVar;
        this.d = reason;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Boolean bool = Boolean.TRUE;
        z300Var.a = bool;
        z300Var.d = bool;
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        w2wVar.I0().u(new od3(0));
        w2wVar.K().n().h().a(LongPollType.MESSAGES, this.d);
    }
}
