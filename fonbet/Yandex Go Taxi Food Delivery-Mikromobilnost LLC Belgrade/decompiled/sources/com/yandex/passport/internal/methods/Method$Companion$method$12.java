package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.ny61;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Method$Companion$method$12 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$12 b = new Method$Companion$method$12(1, 0, o2.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid"));
        String string = bundle.getString("stash-cell");
        if (string != null) {
            return new o2(passportUidImpl, string, bundle.getString("stash-value", null));
        }
        ny61.r("can't get required string stash-cell");
        return null;
    }
}
