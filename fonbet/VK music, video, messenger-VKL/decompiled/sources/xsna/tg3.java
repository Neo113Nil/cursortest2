package xsna;

import android.os.Bundle;
import com.vk.archive.impl.channels.ArchiveChannelsFragment;
import xsna.eh3;
import xsna.xn50;

/* compiled from: ArchiveChannelsComponent.kt */
/* loaded from: classes15.dex */
public final class tg3 extends yj50<zg3, hh3, eh3, fh3, gh3, bh3, dh3> {
    public final ArchiveChannelsFragment n;
    public final qgb o;
    public final yi3 p;
    public final ah3 q;
    public final gi3 r;
    public final ui3 s;
    public final boolean t;
    public final boolean u;

    public tg3(ArchiveChannelsFragment archiveChannelsFragment, qgb qgbVar, com.vk.archive.impl.a aVar, ah3 ah3Var, gi3 gi3Var, ui3 ui3Var, boolean z, boolean z2) {
        super(archiveChannelsFragment, archiveChannelsFragment, eh3.class, false);
        this.n = archiveChannelsFragment;
        this.o = qgbVar;
        this.p = aVar;
        this.q = ah3Var;
        this.r = gi3Var;
        this.s = ui3Var;
        this.t = z;
        this.u = z2;
    }

    @Override // xsna.yj50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        xn50.a.c(this, eh3.b.b);
    }

    @Override // xsna.yj50
    public final zg3 a(Bundle bundle) {
        return new zg3(this.o, this.q, this.r, this.s, this.u);
    }

    @Override // xsna.yj50
    public final dh3 b() {
        return new dh3(this.n.requireContext(), this.p, new sg3(1, this, tg3.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 0));
    }

    @Override // xsna.yj50
    public final fh3 d() {
        return new fh3(this.t);
    }
}
