package com.yandex.go.places.organization.card.api.navigation.common;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.organization.card.api.navigation.common.OrganizationCardPayloadMapper", f = "OrganizationCardPayloadMapper.kt", l = {HProv.PP_LICENSE, 159, 161}, m = "getConfig", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardPayloadMapper$getConfig$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardPayloadMapper$getConfig$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(false, null, this);
    }
}
