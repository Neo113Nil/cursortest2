package com.yandex.go.taxi.summary.shared.requirement;

import defpackage.sls;
import defpackage.tse0;
import defpackage.xcv0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RequirementsNotificationInteractor$notificationFlow$2$result$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        xcv0 xcv0Var = ((e) this.receiver).b;
        xcv0Var.a.a("Summary.ChangeRequirementsShown", tse0.q(xcv0Var), 1, new HashMap());
        return zy11.a;
    }
}
