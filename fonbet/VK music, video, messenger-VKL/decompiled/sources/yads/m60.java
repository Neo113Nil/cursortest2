package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class m60 extends Lambda implements gzs {
    public final /* synthetic */ m70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m60(m70 m70Var) {
        super(0);
        this.b = m70Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new jz0((o80) this.b.D.getValue());
    }
}
