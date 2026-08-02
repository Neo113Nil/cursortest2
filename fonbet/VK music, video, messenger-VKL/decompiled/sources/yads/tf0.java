package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.kq9;
import xsna.lq9;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class tf0 extends Lambda implements izs {
    public final /* synthetic */ kq9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(lq9 lq9Var) {
        super(1);
        this.b = lq9Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (this.b.isActive()) {
            this.b.resumeWith(new Result.Failure(th));
        }
        return s3q0.a;
    }
}
