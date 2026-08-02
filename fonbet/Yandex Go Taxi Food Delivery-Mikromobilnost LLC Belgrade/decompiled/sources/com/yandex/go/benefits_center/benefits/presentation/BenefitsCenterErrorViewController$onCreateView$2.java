package com.yandex.go.benefits_center.benefits.presentation;

import com.yandex.go.benefits_center.benefits.analytics.BenefitsCenterAnalytics$BenefitsCenterTappedType;
import com.yandex.go.benefits_center.benefits.router.d;
import defpackage.hn5;
import defpackage.qu;
import defpackage.sls;
import defpackage.tm5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class BenefitsCenterErrorViewController$onCreateView$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        hn5 hn5Var = (hn5) this.receiver;
        d dVar = hn5Var.b;
        tm5.a(dVar.D, hn5Var.a.a, BenefitsCenterAnalytics$BenefitsCenterTappedType.Back);
        dVar.r(new qu(9));
        return zy11.a;
    }
}
