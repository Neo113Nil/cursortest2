package xsna;

import android.os.Looper;
import xsna.k65;
import xsna.p600;

/* compiled from: VkAlfaBaseActivityDeps.kt */
/* loaded from: classes4.dex */
public final class y7u0 extends ajg {
    public final p600<k65> b;

    public y7u0(ws1 ws1Var) {
        p600.a aVar = p600.d;
        k65.f fVar = k65.f.a;
        aVar.getClass();
        p600<k65> p600Var = new p600<>(fVar, Looper.getMainLooper());
        this.b = p600Var;
        new u55(p600Var, new eml(0), ws1Var);
        new m670(p600Var, (io.reactivex.rxjava3.disposables.b) this.a.getValue());
    }
}
