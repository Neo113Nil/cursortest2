package com.yandex.messaging.links;

import android.net.Uri;
import defpackage.rv10;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MessagingLinkParser$httpHandlers$21 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        a aVar = (a) this.receiver;
        rv10 rv10Var = new rv10(9);
        aVar.getClass();
        return a.c(((Uri) obj).toString(), "(?:http[s]?|messenger)://(?:telemost\\.(?:360\\.)?yandex\\.[a-z]{2,})/join#([a-z0-9-_]+)/(\\d*)/(\\d*)", rv10Var);
    }
}
