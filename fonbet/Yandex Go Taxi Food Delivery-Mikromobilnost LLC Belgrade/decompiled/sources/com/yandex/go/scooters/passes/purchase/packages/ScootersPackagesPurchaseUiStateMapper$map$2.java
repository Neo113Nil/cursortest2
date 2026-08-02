package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseUiStateMapper", f = "ScootersPackagesPurchaseUiStateMapper.kt", l = {HProv.PP_RESERVED1, HProv.PP_BIO_STATISTICA_LEN}, m = PolicyMappingsExtension.MAP, v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseUiStateMapper$map$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseUiStateMapper$map$2(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.b(this.this$0, null, this);
    }
}
