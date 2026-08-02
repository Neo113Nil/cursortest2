package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ks3 extends Lambda implements gzs {
    public final /* synthetic */ os3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks3(os3 os3Var) {
        super(0);
        this.b = os3Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.b.a.onAdClicked();
        return s3q0.a;
    }
}
