package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.groups.AdminLevel;

/* compiled from: ChannelAdminLevelChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class xta extends e500 {
    public final w2w c;
    public final Peer d;
    public final AdminLevel e;
    public final boolean f;

    public xta(w2w w2wVar, Peer peer, AdminLevel adminLevel, boolean z) {
        super("ChannelAdminLevelChangeLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = adminLevel;
        this.f = z;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.c(this.d.b);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().a().I(this.d.b, this.e, this.f);
    }
}
