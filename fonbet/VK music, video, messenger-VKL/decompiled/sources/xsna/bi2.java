package xsna;

import androidx.compose.animation.EnterExitState;
import kotlin.jvm.internal.Lambda;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class bi2 extends Lambda implements wzs<EnterExitState, EnterExitState, Boolean> {
    final /* synthetic */ d5q $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi2(d5q d5qVar) {
        super(2);
        this.$exit = d5qVar;
    }

    @Override // xsna.wzs
    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
        EnterExitState enterExitState3 = enterExitState;
        EnterExitState enterExitState4 = enterExitState2;
        EnterExitState enterExitState5 = EnterExitState.PostExit;
        return Boolean.valueOf(enterExitState3 == enterExitState5 && enterExitState4 == enterExitState5 && !this.$exit.a().e);
    }
}
