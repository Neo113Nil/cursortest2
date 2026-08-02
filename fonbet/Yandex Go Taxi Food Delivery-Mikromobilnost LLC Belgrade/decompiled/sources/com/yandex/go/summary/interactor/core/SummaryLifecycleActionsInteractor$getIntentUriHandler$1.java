package com.yandex.go.summary.interactor.core;

import android.net.Uri;
import defpackage.hz00;
import defpackage.kma1;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SummaryLifecycleActionsInteractor$getIntentUriHandler$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ru.yandex.taxi.summary.deeplink.requirement.a aVar = (ru.yandex.taxi.summary.deeplink.requirement.a) this.receiver;
        aVar.getClass();
        aVar.c(kma1.f(hz00.D.f((Uri) obj)));
        return zy11.a;
    }
}
