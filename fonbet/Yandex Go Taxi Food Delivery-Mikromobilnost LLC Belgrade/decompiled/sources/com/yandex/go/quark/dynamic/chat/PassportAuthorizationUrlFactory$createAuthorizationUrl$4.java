package com.yandex.go.quark.dynamic.chat;

import android.net.Uri;
import defpackage.hg21;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class PassportAuthorizationUrlFactory$createAuthorizationUrl$4 extends FunctionReferenceImpl implements tls {
    public static final PassportAuthorizationUrlFactory$createAuthorizationUrl$4 b = new PassportAuthorizationUrlFactory$createAuthorizationUrl$4(1, 1, hg21.class, "toUri", "toUri(Ljava/lang/String;)Landroid/net/Uri;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Uri.parse((String) obj);
    }
}
