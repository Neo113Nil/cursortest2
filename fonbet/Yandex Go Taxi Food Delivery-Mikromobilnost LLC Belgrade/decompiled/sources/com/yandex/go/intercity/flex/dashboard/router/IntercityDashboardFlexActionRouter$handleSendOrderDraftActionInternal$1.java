package com.yandex.go.intercity.flex.dashboard.router;

import defpackage.sls;
import defpackage.u45;
import defpackage.w030;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class IntercityDashboardFlexActionRouter$handleSendOrderDraftActionInternal$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        w030 w030Var = ((a) this.receiver).a;
        u45 e = w030Var.e();
        if (e != null) {
            e.dismiss();
        } else {
            w030Var.p();
        }
        return zy11.a;
    }
}
