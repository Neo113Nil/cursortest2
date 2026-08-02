package xsna;

import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: FeedbackListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class i6r implements f39 {
    public final CopyOnWriteArraySet<f39> b = new CopyOnWriteArraySet<>();

    @Override // xsna.f39
    public final void c(String str) {
        StringBuilder sb = new StringBuilder("feedbackListeners: ");
        CopyOnWriteArraySet<f39> copyOnWriteArraySet = this.b;
        L.e("FeedbackListenerProxyImpl", fw3.d(copyOnWriteArraySet, sb));
        Iterator<f39> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    @Override // xsna.f39
    public final void j(ArrayList arrayList) {
        i0q0.i(0L, new ryc(new qk(10, this, arrayList), 4));
    }

    @Override // xsna.f39
    public final void n(ArrayList arrayList) {
        i0q0.i(0L, new ryc(new pk(9, this, arrayList), 4));
    }

    @Override // xsna.f39
    public final void onFeedbackEnabledChanged(boolean z) {
        i0q0.i(0L, new ryc(new h6r(this, z, 0), 4));
    }
}
