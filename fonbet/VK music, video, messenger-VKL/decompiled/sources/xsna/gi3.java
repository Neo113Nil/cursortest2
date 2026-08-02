package xsna;

import com.vk.dto.common.Source;
import kotlin.NoWhenBranchMatchedException;
import xsna.rfb;

/* compiled from: ArchiveLocalChannelsListDataSource.kt */
/* loaded from: classes15.dex */
public final class gi3 implements rfb {
    public final a1w a;

    public gi3(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.rfb
    public final sfb a(rfb.a aVar) {
        boolean z = aVar instanceof rfb.a.C3607a;
        a1w a1wVar = this.a;
        if (z) {
            rfb.a.C3607a c3607a = (rfb.a.C3607a) aVar;
            vdg0.c(a1wVar.n(this, new xhc(c3607a.a)));
            return (sfb) vdg0.c(a1wVar.n(this, new tfb(new ufb(null, c3607a.a, c3607a.b, Source.CACHE, false, 113))));
        }
        if (!(aVar instanceof rfb.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        rfb.a.b bVar = (rfb.a.b) aVar;
        return (sfb) vdg0.c(a1wVar.n(this, new tfb(new ufb(bVar.a, bVar.b, bVar.c, Source.CACHE, false, 112))));
    }

    @Override // xsna.rfb
    public final void b(rfb.a.b bVar) {
        throw new UnsupportedOperationException("fetch not supported for ArchiveLocalChannelsListDataSource");
    }
}
