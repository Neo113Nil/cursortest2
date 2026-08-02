package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import xsna.g1e0;

/* compiled from: BotButtonLpTask.kt */
/* loaded from: classes2.dex */
public final class w28 extends e500 {
    public final w2w c;
    public final v28 d;

    public w28(w2w w2wVar, v28 v28Var) {
        super("BotButtonLpTask");
        this.c = w2wVar;
        this.d = v28Var;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        this.c.J0(this, new p28(this.d.c, CampaignEx.CLICKMODE_ON));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        w2wVar.O0().l(new h5(this, 11));
        g1e0.a aVar = new g1e0.a();
        v28 v28Var = this.d;
        aVar.a.c(v28Var.b);
        aVar.b = Source.CACHE;
        aVar.c = true;
        ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        if (w2wVar.I0().s().d(v28Var.c) == null || v28Var.d == null) {
            return;
        }
        w2wVar.S0().m(v28Var.a.b, v28Var.b.b, v28Var.d, profilesInfo);
    }
}
