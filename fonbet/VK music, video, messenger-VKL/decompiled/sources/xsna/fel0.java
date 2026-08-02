package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ydl0;

/* compiled from: StickyBannerRegularViewTypeFactoryProviderImpl.kt */
/* loaded from: classes6.dex */
public final class fel0 implements mel0 {
    @Override // xsna.mel0
    public final lel0 a(ydl0.b bVar) {
        if (!(bVar instanceof ydl0.b.AbstractC4094b)) {
            if (bVar instanceof ydl0.b.a) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        ydl0.b.AbstractC4094b abstractC4094b = (ydl0.b.AbstractC4094b) bVar;
        if (abstractC4094b instanceof ydl0.b.AbstractC4094b.a) {
            return new sdu0(((ydl0.b.AbstractC4094b.a) abstractC4094b).a, new f9t(14));
        }
        if (abstractC4094b instanceof ydl0.b.AbstractC4094b.C4095b) {
            throw null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
