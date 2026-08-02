package xsna;

import xsna.qni0;
import xsna.uni0;

/* compiled from: ServerClock.kt */
/* loaded from: classes6.dex */
public final class rni0 implements uni0.a {
    public rni0(qni0.a aVar) {
    }

    @Override // xsna.uni0.a
    public final void a(long j) {
        qni0.a.getClass();
        ro roVar = qni0.r;
        if (roVar != null) {
            roVar.k("time resolved");
        }
        qni0.e(j);
    }

    @Override // xsna.uni0.a
    public final void b() {
        qni0.a.getClass();
        ro roVar = qni0.r;
        if (roVar != null) {
            roVar.k("time resolve failed");
        }
    }
}
