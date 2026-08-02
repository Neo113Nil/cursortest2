package xsna;

import xsna.k840;

/* compiled from: MusicConfigureInformationProvider.kt */
/* loaded from: classes3.dex */
public final class tf40 {
    public final b25 a;

    public tf40(b25 b25Var) {
        this.a = b25Var;
    }

    public final boolean a() {
        boolean z = this.a.V().f;
        boolean b = k840.a.i.b();
        boolean z2 = z && !b;
        bn40.f("adEnabled = ", Boolean.valueOf(z2), "isAudioAdAvailable = ", Boolean.valueOf(z), "hs = ", Boolean.valueOf(b));
        return z2;
    }
}
