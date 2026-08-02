package xsna;

import xsna.axp;
import xsna.xup;

/* compiled from: ChangePlayerByBrokenCodecScenario.kt */
/* loaded from: classes8.dex */
public final class psa<T extends axp> implements m5h0<T> {
    public final String a;
    public boolean b;

    public psa(String str) {
        this.a = str;
    }

    @Override // xsna.m5h0
    public final xup a(T t, sht0 sht0Var) {
        if (this.b) {
            return new xup.i();
        }
        this.b = true;
        return new xup.e(this.a);
    }
}
