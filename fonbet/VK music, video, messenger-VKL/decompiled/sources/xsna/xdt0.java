package xsna;

import xsna.jkp0;
import xsna.wdt0;

/* compiled from: VideoReverterImpl.kt */
/* loaded from: classes16.dex */
public final class xdt0 implements jkp0.a {
    public final /* synthetic */ wdt0 a;
    public final /* synthetic */ wdt0.a b;

    public xdt0(wdt0 wdt0Var, wdt0.a aVar) {
        this.a = wdt0Var;
        this.b = aVar;
    }

    @Override // xsna.jkp0.a
    public final void a(int i) {
        this.a.e.post(new juw(this.b, i, 1));
    }

    @Override // xsna.jkp0.a
    public final void b(int i) {
    }
}
