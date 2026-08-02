package com.yandex.messaging.links;

import android.net.Uri;
import com.yandex.messaging.action.MessagingAction;
import defpackage.tls;
import defpackage.u1l;
import defpackage.w610;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MessagingLinkParser$httpHandlers$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((a) this.receiver).getClass();
        w610 g = new Regex("(?:http[s]?|messenger)://(?:telemost\\.(?:360\\.)?yandex\\.[a-z]{2,})/link#([a-z0-9-_]+)/?$").g(((Uri) obj).toString());
        if (g != null) {
            return new MessagingAction.ResolveInviteLink((String) ((u1l) g.a()).get(1));
        }
        return null;
    }
}
