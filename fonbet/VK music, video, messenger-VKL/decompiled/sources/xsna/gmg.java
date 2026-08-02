package xsna;

import xsna.emg;

/* compiled from: Delegates.kt */
/* loaded from: classes5.dex */
public final class gmg extends wq70<emg.a> {
    public final /* synthetic */ emg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmg(emg emgVar) {
        super(emg.a.b.a);
        this.b = emgVar;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, emg.a aVar, emg.a aVar2) {
        if (epx.f(aVar, aVar2)) {
            return;
        }
        this.b.h();
    }
}
