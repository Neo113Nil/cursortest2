package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ls3 extends Lambda implements gzs {
    public final /* synthetic */ os3 b;
    public final /* synthetic */ ps3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls3(os3 os3Var, ps3 ps3Var) {
        super(0);
        this.b = os3Var;
        this.c = ps3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.a.onImpression(this.c);
        return s3q0.a;
    }
}
