package xsna;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MarketAdsItemViewEventImmediateHandler.kt */
/* loaded from: classes17.dex */
public final class cr00 {
    public final Object a;
    public final js50 b;
    public final zr50 c;

    public cr00(fh9 fh9Var, yof yofVar, cpq cpqVar) {
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new de4(20));
        this.a = a;
        this.b = yofVar.g() ? new js50((ks50) a.getValue(), fh9Var) : null;
        this.c = yofVar.g() ? new zr50((ks50) a.getValue(), fh9Var, cpqVar) : null;
    }
}
