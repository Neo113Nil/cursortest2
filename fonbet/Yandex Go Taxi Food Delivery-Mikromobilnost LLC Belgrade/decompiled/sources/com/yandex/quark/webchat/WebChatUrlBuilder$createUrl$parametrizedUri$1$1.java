package com.yandex.quark.webchat;

import android.net.Uri;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class WebChatUrlBuilder$createUrl$parametrizedUri$1$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((Uri.Builder) this.receiver).appendQueryParameter((String) obj, (String) obj2);
        return zy11.a;
    }
}
