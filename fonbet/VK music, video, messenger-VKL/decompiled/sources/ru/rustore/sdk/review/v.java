package ru.rustore.sdk.review;

import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.review.model.ReviewInfo;
import xsna.ctj0;
import xsna.izs;
import xsna.kiz0;
import xsna.ntj0;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class v extends Lambda implements izs<s3q0, ctj0<s3q0>> {
    public final /* synthetic */ kiz0 a;
    public final /* synthetic */ ReviewInfo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kiz0 kiz0Var, ReviewInfo reviewInfo) {
        super(1);
        this.a = kiz0Var;
        this.b = reviewInfo;
    }

    @Override // xsna.izs
    public final ctj0<s3q0> invoke(s3q0 s3q0Var) {
        kiz0 kiz0Var = this.a;
        ReviewInfo reviewInfo = this.b;
        kiz0Var.getClass();
        return new ntj0(new u(kiz0Var, reviewInfo));
    }
}
