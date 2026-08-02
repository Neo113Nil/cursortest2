package com.yandex.passport.internal.methods;

import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class h1 extends x2 {
    public final f3 b;
    public final List c;
    public final d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Bundle bundle) {
        super(MethodRef.GetInvalideCookiesAndDeleteAuthCookie);
        f3 f3Var = new f3(new PassportUidImpl(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT)), bundle.getLong("passport-uid")));
        this.b = f3Var;
        this.c = Collections.singletonList(f3Var);
        this.d = d.c;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final List b() {
        return this.c;
    }

    @Override // com.yandex.passport.internal.methods.x2
    public final f c() {
        return this.d;
    }
}
