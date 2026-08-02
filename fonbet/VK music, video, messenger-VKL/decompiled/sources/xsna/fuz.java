package xsna;

import com.vk.dto.common.Source;
import kotlin.NoWhenBranchMatchedException;
import xsna.rfb;

/* compiled from: LocalChannelsHistoryDataSource.kt */
/* loaded from: classes.dex */
public final class fuz implements rfb {
    public final a1w a;

    public fuz(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.rfb
    public final sfb a(rfb.a aVar) {
        boolean z = aVar instanceof rfb.a.C3607a;
        a1w a1wVar = this.a;
        if (z) {
            rfb.a.C3607a c3607a = (rfb.a.C3607a) aVar;
            return (sfb) vdg0.c(a1wVar.n(this, new tfb(new ufb(null, c3607a.a(), c3607a.b(), Source.CACHE, false, 113))));
        }
        if (!(aVar instanceof rfb.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        rfb.a.b bVar = (rfb.a.b) aVar;
        return (sfb) vdg0.c(a1wVar.n(this, new tfb(new ufb(bVar.c(), bVar.a(), bVar.b(), Source.CACHE, false, 112))));
    }

    @Override // xsna.rfb
    public final void b(rfb.a.b bVar) {
        throw new UnsupportedOperationException("fetch not supported for LocalChannelsHistoryDataSource");
    }
}
