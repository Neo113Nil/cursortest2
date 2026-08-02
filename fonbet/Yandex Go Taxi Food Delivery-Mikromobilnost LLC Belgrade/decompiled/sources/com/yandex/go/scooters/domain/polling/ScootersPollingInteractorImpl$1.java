package com.yandex.go.scooters.domain.polling;

import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersPollingInteractorImpl$1 extends FunctionReferenceImpl implements sls {
    public static final ScootersPollingInteractorImpl$1 b = new ScootersPollingInteractorImpl$1(0, 0, System.class, "currentTimeMillis", "currentTimeMillis()J");

    @Override // defpackage.sls
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
