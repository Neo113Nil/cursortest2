package com.yandex.messaging.links;

import android.net.Uri;
import defpackage.rv10;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MessagingLinkParser$httpHandlers$9 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((a) this.receiver).getClass();
        String path = ((Uri) obj).getPath();
        if (path != null) {
            return a.c(path, "(?:/?messenger|/?chat)?(?:/?#)?/?/join/([a-z0-9-_]+)/(\\d*)/(\\d*)", new rv10(10));
        }
        return null;
    }
}
