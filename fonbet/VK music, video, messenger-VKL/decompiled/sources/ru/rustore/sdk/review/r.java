package ru.rustore.sdk.review;

import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.review.model.ReviewInfo;
import xsna.izs;
import xsna.s3q0;
import xsna.vtj0;

/* loaded from: classes9.dex */
public final class r extends Lambda implements izs<ReviewInfo, s3q0> {
    public final /* synthetic */ vtj0<ReviewInfo> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(vtj0<ReviewInfo> vtj0Var) {
        super(1);
        this.a = vtj0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(ReviewInfo reviewInfo) {
        this.a.b(reviewInfo);
        return s3q0.a;
    }
}
