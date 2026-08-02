package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.xn60;

/* compiled from: NewsfeedListActor.kt */
/* loaded from: classes4.dex */
public final class go60 extends al50<ur60, xn60.d, on50, ds60, qr60, yo60> {
    public go60(dht dhtVar) {
        super(dhtVar);
    }

    @Override // xsna.qj50
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void p(xn60.d dVar) {
        if (dVar instanceof xn60.d.a) {
            a(ds60.f.d.b);
            return;
        }
        if (dVar instanceof xn60.d.c) {
            if (((ur60) this.b.getCurrentState()).e != ListLoadingState.IDLE) {
                return;
            }
            a(ds60.f.a.b);
        } else {
            if (!(dVar instanceof xn60.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a(ds60.f.b.b);
        }
    }
}
