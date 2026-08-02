package com.yandex.messaging.links;

import android.net.Uri;
import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.internal.StaffChat;
import defpackage.tls;
import defpackage.u1l;
import defpackage.w610;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MessagingLinkParser$httpHandlers$15 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((a) this.receiver).getClass();
        w610 g = new Regex("(?:http[s]?|messenger)://(?:[a-zA-Z0-9.-]+/)?(?:/?messenger|/?chat)?(?:/?#)?/?#/?staff/(.*)").g(((Uri) obj).toString());
        if (g != null) {
            return new MessagingAction.OpenChat(new StaffChat((String) ((u1l) g.a()).get(1)), null, null, null, false, false, null, false, null, false, null, false, false, null, 32766);
        }
        return null;
    }
}
