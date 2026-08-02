package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Method$Companion$method$8 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$8 b = new Method$Companion$method$8(1, 0, m2.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PassportUidImpl passportUidImpl;
        Bundle bundle = (Bundle) obj;
        if (bundle.containsKey(WebViewActivity.KEY_ENVIRONMENT) && bundle.containsKey("passport-uid")) {
            int i = bundle.getInt(WebViewActivity.KEY_ENVIRONMENT);
            passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(i), bundle.getLong("passport-uid"));
        } else {
            passportUidImpl = null;
        }
        return new m2(passportUidImpl);
    }
}
