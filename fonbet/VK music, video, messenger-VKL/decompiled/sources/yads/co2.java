package yads;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.SerializationException;
import xsna.izs;
import xsna.kq9;
import xsna.lq9;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class co2 extends Lambda implements izs {
    public final /* synthetic */ kq9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co2(lq9 lq9Var) {
        super(1);
        this.b = lq9Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        mn3 mn3Var = (mn3) obj;
        if (mn3Var.getCause() instanceof SerializationException) {
            throw mn3Var;
        }
        this.b.resumeWith(new Result(new Result.Failure(mn3Var)));
        return s3q0.a;
    }
}
