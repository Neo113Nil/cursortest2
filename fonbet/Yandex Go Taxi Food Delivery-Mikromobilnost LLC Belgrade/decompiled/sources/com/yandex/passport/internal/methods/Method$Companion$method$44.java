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
final /* synthetic */ class Method$Companion$method$44 extends FunctionReferenceImpl implements tls {
    public static final Method$Companion$method$44 b = new Method$Companion$method$44(1, 0, r0.class, "<init>", "<init>(Landroid/os/Bundle;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        return new r0(new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid")));
    }
}
