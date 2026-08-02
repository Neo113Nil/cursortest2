package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.tra0;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class yh2 extends Lambda implements izs<tra0.a, s3q0> {
    final /* synthetic */ tra0 $placeable;
    final /* synthetic */ llj $specOnEnter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh2(tra0 tra0Var, llj lljVar) {
        super(1);
        this.$placeable = tra0Var;
        this.$specOnEnter = lljVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(tra0.a aVar) {
        aVar.q(this.$placeable, 0, 0, ((vak0) this.$specOnEnter.c).getFloatValue());
        return s3q0.a;
    }
}
