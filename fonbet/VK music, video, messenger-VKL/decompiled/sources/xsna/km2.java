package xsna;

import androidx.compose.animation.EnterExitState;
import kotlin.jvm.internal.Lambda;

/* compiled from: AnimatedVisibility.kt */
/* loaded from: classes11.dex */
public final class km2 extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ yzs<om2, androidx.compose.runtime.a, Integer, s3q0> $content;
    final /* synthetic */ qpp $enter;
    final /* synthetic */ d5q $exit;
    final /* synthetic */ q630 $modifier;
    final /* synthetic */ c780 $onLookaheadMeasured;
    final /* synthetic */ wzs<EnterExitState, EnterExitState, Boolean> $shouldDisposeBlock;
    final /* synthetic */ wlp0<Object> $transition;
    final /* synthetic */ izs<Object, Boolean> $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km2(wlp0 wlp0Var, izs izsVar, q630 q630Var, qpp qppVar, d5q d5qVar, wzs wzsVar, yzs yzsVar, int i, int i2) {
        super(2);
        this.$transition = wlp0Var;
        this.$visible = izsVar;
        this.$modifier = q630Var;
        this.$enter = qppVar;
        this.$exit = d5qVar;
        this.$shouldDisposeBlock = wzsVar;
        this.$content = yzsVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        mm2.a(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$shouldDisposeBlock, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
        return s3q0.a;
    }
}
