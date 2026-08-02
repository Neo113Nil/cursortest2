package com.yandex.messaging.links;

import android.net.Uri;
import defpackage.tls;
import defpackage.xz10;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MessagingLinkParser$messengerHandlers$7 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        a aVar = (a) this.receiver;
        aVar.getClass();
        return a.c(uri.toString(), "(?:http[s]?|messenger)://(?:[a-zA-Z0-9.-]+/)?(?:/?messenger|/?chat)(?:/?#)?/?/invite_byhash/?.*", new xz10(aVar, uri, 10));
    }
}
