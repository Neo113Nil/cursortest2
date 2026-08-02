package com.yandex.messaging.internal.gif;

import android.content.Context;
import android.net.Uri;
import defpackage.ike;
import defpackage.qoh;
import defpackage.tje;

/* loaded from: classes15.dex */
public abstract class a {
    public static qoh a(Context context, Uri uri, ike ikeVar, long j) {
        return tje.h(ikeVar, null, null, new PrecachingGifWrapper$Companion$readFromUriAsync$1(j, uri, context, ikeVar, null), 3);
    }
}
