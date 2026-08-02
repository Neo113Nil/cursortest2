package defpackage;

import com.yandex.div.core.expression.variables.a;
import com.yandex.go.flex.common.insets.experiments.HandleInsetsInFlexExperiment;

/* loaded from: classes.dex */
public final class mjr {
    public final njr a;

    public mjr(njr njrVar) {
        this.a = njrVar;
    }

    public final ljr a(rz4 rz4Var, a aVar) {
        ojr ojrVar = (ojr) this.a;
        ojrVar.getClass();
        HandleInsetsInFlexExperiment.ScreenConfiguration screenConfiguration = (HandleInsetsInFlexExperiment.ScreenConfiguration) ((HandleInsetsInFlexExperiment) ojrVar.a.b()).b.get(rz4Var.a);
        plr plrVar = new plr(ojr.b.contains(rz4Var) ? true : screenConfiguration != null ? jl40.l(screenConfiguration.getA(), Boolean.TRUE) : false, screenConfiguration != null ? jl40.l(screenConfiguration.getB(), Boolean.TRUE) : false);
        return new ljr(plrVar, new hzk(plrVar, aVar));
    }
}
