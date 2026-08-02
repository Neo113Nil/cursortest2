package xsna;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StaticAdsItemViewEventImmediateHandler.kt */
/* loaded from: classes17.dex */
public final class exk0 {
    public final Object a;
    public final js50 b;

    public exk0(fh9 fh9Var, yof yofVar) {
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new y84(25));
        this.a = a;
        this.b = yofVar.v() ? new js50((ks50) a.getValue(), fh9Var) : null;
    }
}
