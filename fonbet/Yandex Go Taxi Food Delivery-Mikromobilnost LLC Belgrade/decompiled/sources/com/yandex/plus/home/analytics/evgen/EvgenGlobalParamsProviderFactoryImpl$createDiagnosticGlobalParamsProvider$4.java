package com.yandex.plus.home.analytics.evgen;

import defpackage.UserStatusType;
import defpackage.dmd0;
import defpackage.emd0;
import defpackage.fmd0;
import defpackage.gmd0;
import defpackage.hmd0;
import defpackage.sls;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class EvgenGlobalParamsProviderFactoryImpl$createDiagnosticGlobalParamsProvider$4 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        sls slsVar = ((b) this.receiver).l;
        hmd0 hmd0Var = slsVar != null ? (hmd0) slsVar.invoke() : null;
        if (hmd0Var instanceof emd0) {
            return UserStatusType.WithPlus;
        }
        if (hmd0Var instanceof fmd0) {
            return UserStatusType.WithoutPlus;
        }
        if (hmd0Var instanceof dmd0) {
            return UserStatusType.Frozen;
        }
        if (hmd0Var instanceof gmd0) {
            return UserStatusType.Unauthorized;
        }
        if (hmd0Var == null) {
            return UserStatusType.Unknown;
        }
        w511.b();
        return null;
    }
}
