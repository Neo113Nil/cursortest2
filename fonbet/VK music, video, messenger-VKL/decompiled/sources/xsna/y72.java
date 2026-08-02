package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes11.dex */
public final class y72 extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> $content;
    final /* synthetic */ q630 $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y72(q630 q630Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, int i, int i2) {
        super(2);
        this.$modifier = q630Var;
        this.$content = wzsVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        v72.b(this.$modifier, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
        return s3q0.a;
    }
}
