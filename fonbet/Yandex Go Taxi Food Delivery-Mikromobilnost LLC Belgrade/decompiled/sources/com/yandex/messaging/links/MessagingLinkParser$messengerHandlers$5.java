package com.yandex.messaging.links;

import android.net.Uri;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MessagingLinkParser$messengerHandlers$5 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        ((a) this.receiver).getClass();
        if (new Regex("(?:http[s]?|messenger)://(?:[a-zA-Z0-9.-]+/)?(?:/?messenger|/?chat)(?:/?#)?/?/open[/?].*").g(uri.toString()) != null) {
            return a.e(uri, false);
        }
        return null;
    }
}
