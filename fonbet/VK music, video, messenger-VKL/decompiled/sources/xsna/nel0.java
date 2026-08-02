package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ydl0;

/* compiled from: StickyBannerViewFactoryProviderImpl.kt */
/* loaded from: classes6.dex */
public final class nel0 implements mel0 {
    @Override // xsna.mel0
    public final lel0 a(ydl0.b bVar) {
        if (!(bVar instanceof ydl0.b.AbstractC4094b)) {
            if (!(bVar instanceof ydl0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }
        ydl0.b.AbstractC4094b abstractC4094b = (ydl0.b.AbstractC4094b) bVar;
        if (abstractC4094b instanceof ydl0.b.AbstractC4094b.a) {
            return new sdu0(((ydl0.b.AbstractC4094b.a) abstractC4094b).a, new u36());
        }
        if (abstractC4094b instanceof ydl0.b.AbstractC4094b.C4095b) {
            throw null;
        }
        return null;
    }
}
