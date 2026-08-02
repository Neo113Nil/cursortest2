package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class qs3 extends Lambda implements gzs {
    public final /* synthetic */ rs3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs3(rs3 rs3Var) {
        super(0);
        this.b = rs3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.a.onInitializationCompleted();
        return s3q0.a;
    }
}
