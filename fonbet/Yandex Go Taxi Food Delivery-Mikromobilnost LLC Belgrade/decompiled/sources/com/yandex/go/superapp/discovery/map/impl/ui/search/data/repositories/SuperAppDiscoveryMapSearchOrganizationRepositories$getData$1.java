package com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.SuperAppDiscoveryMapSearchOrganizationRepositories", f = "SuperAppDiscoveryMapSearchOrganizationRepositories.kt", l = {81, MSException.ERROR_INVALID_PASSWORD}, m = "getData", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapSearchOrganizationRepositories$getData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapSearchOrganizationRepositories$getData$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
