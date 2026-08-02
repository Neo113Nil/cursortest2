package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes11.dex */
public final class d62 extends Lambda implements izs<igi0, Boolean> {
    final /* synthetic */ f9x<lgi0> $currentSemanticsNodes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d62(f9x<lgi0> f9xVar) {
        super(1);
        this.$currentSemanticsNodes = f9xVar;
    }

    @Override // xsna.izs
    public final Boolean invoke(igi0 igi0Var) {
        return Boolean.valueOf(this.$currentSemanticsNodes.a(igi0Var.f));
    }
}
