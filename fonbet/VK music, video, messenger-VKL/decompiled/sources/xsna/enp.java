package xsna;

import androidx.compose.animation.EnterExitState;
import kotlin.jvm.internal.Lambda;
import xsna.wlp0;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class enp extends Lambda implements izs<wlp0.b<EnterExitState>, phr<Float>> {
    final /* synthetic */ qpp $enter;
    final /* synthetic */ d5q $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enp(qpp qppVar, d5q d5qVar) {
        super(1);
        this.$enter = qppVar;
        this.$exit = d5qVar;
    }

    @Override // xsna.izs
    public final phr<Float> invoke(wlp0.b<EnterExitState> bVar) {
        dtp0 dtp0Var;
        dtp0 dtp0Var2;
        wlp0.b<EnterExitState> bVar2 = bVar;
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (bVar2.a(enterExitState, enterExitState2)) {
            h4h0 h4h0Var = this.$enter.a().d;
            return (h4h0Var == null || (dtp0Var2 = h4h0Var.c) == null) ? anp.b : dtp0Var2;
        }
        if (!bVar2.a(enterExitState2, EnterExitState.PostExit)) {
            return anp.b;
        }
        h4h0 h4h0Var2 = this.$exit.a().d;
        return (h4h0Var2 == null || (dtp0Var = h4h0Var2.c) == null) ? anp.b : dtp0Var;
    }
}
