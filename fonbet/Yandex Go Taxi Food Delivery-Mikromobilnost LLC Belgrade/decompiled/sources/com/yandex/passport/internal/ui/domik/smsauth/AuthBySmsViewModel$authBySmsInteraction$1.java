package com.yandex.passport.internal.ui.domik.smsauth;

import com.yandex.passport.internal.analytics.DomikScreenSuccessMessages$AuthBySms;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.DomikResult;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class AuthBySmsViewModel$authBySmsInteraction$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) this.receiver;
        bVar.F.g(DomikScreenSuccessMessages$AuthBySms.authSuccessBySms);
        bVar.E.b((AuthTrack) obj, (DomikResult) obj2);
        return zy11.a;
    }
}
