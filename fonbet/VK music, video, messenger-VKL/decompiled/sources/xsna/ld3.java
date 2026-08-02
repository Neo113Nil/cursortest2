package xsna;

import com.vk.im.engine.models.LongPollType;
import com.vk.im.reporters.api.engine.LongPollExpiredReporter;

/* compiled from: ApplyChannelsSpacesLpTask.kt */
/* loaded from: classes2.dex */
public final class ld3 extends e500 {
    public final w2w c;
    public final LongPollExpiredReporter.Reason d;
    public final boolean e;

    public ld3(w2w w2wVar, LongPollExpiredReporter.Reason reason, boolean z) {
        super("ApplyChannelsSpacesLpTask");
        this.c = w2wVar;
        this.d = reason;
        this.e = z;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Boolean bool = Boolean.TRUE;
        z300Var.b = bool;
        z300Var.d = bool;
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        w2wVar.I0().u(new v5(this, 8));
        w2wVar.K().n().h().a(LongPollType.CHANNELS, this.d);
    }
}
