package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.woy;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes11.dex */
public final class yoy extends Lambda implements gzs<s3q0> {
    final /* synthetic */ woy.b $this_deactivateOutOfFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yoy(woy.b bVar) {
        super(0);
        this.$this_deactivateOutOfFrame = bVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        qfg0 qfg0Var;
        if (!((Boolean) ((zak0) this.$this_deactivateOutOfFrame.g).getValue()).booleanValue() && (qfg0Var = this.$this_deactivateOutOfFrame.c) != null) {
            qfg0Var.deactivate();
        }
        return s3q0.a;
    }
}
