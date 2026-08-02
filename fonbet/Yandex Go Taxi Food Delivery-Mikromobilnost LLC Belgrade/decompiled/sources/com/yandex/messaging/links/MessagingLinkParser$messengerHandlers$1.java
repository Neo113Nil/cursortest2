package com.yandex.messaging.links;

import android.net.Uri;
import defpackage.rv10;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MessagingLinkParser$messengerHandlers$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        a aVar = (a) this.receiver;
        rv10 rv10Var = new rv10(11);
        aVar.getClass();
        return a.b((Uri) obj, "(?:http[s]?|messenger)://(?:[a-zA-Z0-9.-]+/)?(?:/?messenger|/?chat)?(?:/?#)?/?/?settings/?.*", rv10Var);
    }
}
