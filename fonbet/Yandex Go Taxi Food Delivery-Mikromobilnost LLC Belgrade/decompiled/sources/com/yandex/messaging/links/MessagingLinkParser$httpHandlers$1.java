package com.yandex.messaging.links;

import android.net.Uri;
import defpackage.tls;
import defpackage.xz10;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MessagingLinkParser$httpHandlers$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        a aVar = (a) this.receiver;
        aVar.getClass();
        String path = uri.getPath();
        if (path != null) {
            return a.c(path, "(?:/?messenger|/?chat)?(?:/?#)?/?/p/([a-z0-9-_]+)/?$", new xz10(aVar, uri, 3));
        }
        return null;
    }
}
