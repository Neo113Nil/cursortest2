package ru.rustore.sdk.review;

import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.review.model.ReviewInfo;
import xsna.izs;
import xsna.kiz0;
import xsna.nsy0;
import xsna.s3q0;
import xsna.vtj0;

/* loaded from: classes9.dex */
public final class t extends Lambda implements izs<vtj0<ReviewInfo>, s3q0> {
    public final /* synthetic */ kiz0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kiz0 kiz0Var) {
        super(1);
        this.a = kiz0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(vtj0<ReviewInfo> vtj0Var) {
        Object failure;
        vtj0<ReviewInfo> vtj0Var2 = vtj0Var;
        kiz0 kiz0Var = this.a;
        try {
            kiz0.a(kiz0Var.a, new q(vtj0Var2), new nsy0(kiz0Var.a, kiz0Var.b, new r(vtj0Var2), new s(vtj0Var2)));
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            vtj0Var2.a(a);
        }
        return s3q0.a;
    }
}
