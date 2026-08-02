package ru.rustore.sdk.review;

import android.content.Context;
import android.content.Intent;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.review.model.ReviewInfo;
import xsna.izs;
import xsna.kiz0;
import xsna.o860;
import xsna.s3q0;
import xsna.vtj0;
import xsna.xx1;

/* loaded from: classes9.dex */
public final class u extends Lambda implements izs<vtj0<s3q0>, s3q0> {
    public final /* synthetic */ kiz0 a;
    public final /* synthetic */ ReviewInfo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kiz0 kiz0Var, ReviewInfo reviewInfo) {
        super(1);
        this.a = kiz0Var;
        this.b = reviewInfo;
    }

    @Override // xsna.izs
    public final s3q0 invoke(vtj0<s3q0> vtj0Var) {
        Object failure;
        vtj0<s3q0> vtj0Var2 = vtj0Var;
        kiz0 kiz0Var = this.a;
        ReviewInfo reviewInfo = this.b;
        try {
            Context context = kiz0Var.a;
            Intent intent = new Intent("ru.vk.store.RequestAppReview");
            intent.putExtra("KEY_APPLICATION_ID", kiz0Var.b);
            intent.putExtras(reviewInfo.toBundle$sdk_public_review_release());
            xx1.z(context, intent, new o860(vtj0Var2, 19));
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
