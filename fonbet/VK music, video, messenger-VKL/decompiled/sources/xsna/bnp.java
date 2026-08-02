package xsna;

import androidx.compose.animation.EnterExitState;
import kotlin.jvm.internal.Lambda;
import xsna.wlp0;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class bnp extends Lambda implements izs<wlp0.b<EnterExitState>, phr<Float>> {
    final /* synthetic */ qpp $enter;
    final /* synthetic */ d5q $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnp(qpp qppVar, d5q d5qVar) {
        super(1);
        this.$enter = qppVar;
        this.$exit = d5qVar;
    }

    @Override // xsna.izs
    public final phr<Float> invoke(wlp0.b<EnterExitState> bVar) {
        phr<Float> phrVar;
        phr<Float> phrVar2;
        wlp0.b<EnterExitState> bVar2 = bVar;
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (bVar2.a(enterExitState, enterExitState2)) {
            ciq ciqVar = this.$enter.a().a;
            return (ciqVar == null || (phrVar2 = ciqVar.b) == null) ? anp.b : phrVar2;
        }
        if (!bVar2.a(enterExitState2, EnterExitState.PostExit)) {
            return anp.b;
        }
        ciq ciqVar2 = this.$exit.a().a;
        return (ciqVar2 == null || (phrVar = ciqVar2.b) == null) ? anp.b : phrVar;
    }
}
