package com.yandex.go.scooters.ignition.controlling;

import com.yandex.go.scooters.ignition.domain.n;
import defpackage.crn0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersIgnitionControllingUiActionInteractor$clickOnOption$4 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((crn0) obj).a;
        Continuation continuation = (Continuation) obj2;
        n nVar = ((f) this.receiver).h;
        return i == 3 ? nVar.d(continuation) : i == 1 ? nVar.a(continuation) : i == 2 ? nVar.g(continuation) : zy11.a;
    }
}
