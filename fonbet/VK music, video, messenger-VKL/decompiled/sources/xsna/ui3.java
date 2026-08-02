package xsna;

import com.vk.dto.common.Source;
import kotlin.NoWhenBranchMatchedException;
import xsna.rfb;

/* compiled from: ArchiveRemoteChannelsListDataSource.kt */
/* loaded from: classes15.dex */
public final class ui3 implements rfb {
    public final a1w a;

    public ui3(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.rfb
    public final sfb a(rfb.a aVar) {
        return c(aVar, true);
    }

    @Override // xsna.rfb
    public final void b(rfb.a.b bVar) {
        c(bVar, false);
    }

    public final sfb c(rfb.a aVar, boolean z) {
        boolean z2 = aVar instanceof rfb.a.C3607a;
        a1w a1wVar = this.a;
        if (z2) {
            rfb.a.C3607a c3607a = (rfb.a.C3607a) aVar;
            return (sfb) vdg0.c(a1wVar.n(this, new tfb(new ufb(null, c3607a.a, c3607a.b, Source.NETWORK, z, 33))));
        }
        if (!(aVar instanceof rfb.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        rfb.a.b bVar = (rfb.a.b) aVar;
        return (sfb) vdg0.c(a1wVar.n(this, new tfb(new ufb(bVar.a, bVar.b, bVar.c, Source.NETWORK, z, 32))));
    }
}
