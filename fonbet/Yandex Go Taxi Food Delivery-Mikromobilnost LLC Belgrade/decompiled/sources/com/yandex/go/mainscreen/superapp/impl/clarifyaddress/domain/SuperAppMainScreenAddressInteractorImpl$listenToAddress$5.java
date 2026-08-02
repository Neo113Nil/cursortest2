package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import com.yandex.go.address.models.ZoneAddress;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class SuperAppMainScreenAddressInteractorImpl$listenToAddress$5 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ZoneAddress zoneAddress, Continuation continuation) {
        v vVar = (v) this.receiver;
        vVar.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new SuperAppMainScreenAddressInteractorImpl$onNewZoneAddress$2(vVar, zoneAddress, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
