package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.kq9;
import xsna.lq9;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class sf0 extends Lambda implements gzs {
    public final /* synthetic */ kq9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(lq9 lq9Var) {
        super(0);
        this.b = lq9Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        if (this.b.isActive()) {
            this.b.resumeWith(new Result(s3q0.a));
        }
        return s3q0.a;
    }
}
