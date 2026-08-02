package com.yandex.go.drive.vertical.interactor;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class UpdateSourceAddressInteractor$startSourceAddressUpdates$3 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ZoneAddress zoneAddress, Continuation continuation) {
        k kVar = (k) this.receiver;
        tt2 tt2Var = kVar.e;
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new UpdateSourceAddressInteractor$setSourceAddress$2(kVar, zoneAddress, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
