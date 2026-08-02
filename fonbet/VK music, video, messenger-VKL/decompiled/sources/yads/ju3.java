package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ju3 extends Lambda implements gzs {
    public final /* synthetic */ nu3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju3(nu3 nu3Var) {
        super(0);
        this.b = nu3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.a.onAdClicked();
        return s3q0.a;
    }
}
