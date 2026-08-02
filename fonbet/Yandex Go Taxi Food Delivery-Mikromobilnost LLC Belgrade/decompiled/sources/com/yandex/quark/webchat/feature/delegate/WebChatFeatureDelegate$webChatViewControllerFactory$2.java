package com.yandex.quark.webchat.feature.delegate;

import android.content.SharedPreferences;
import defpackage.ne1;
import defpackage.r5z0;
import defpackage.rpb1;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class WebChatFeatureDelegate$webChatViewControllerFactory$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        com.yandex.quark.webchat.auth.internal.synchronizer.a aVar = (com.yandex.quark.webchat.auth.internal.synchronizer.a) this.receiver;
        aVar.c.info("SmartCookieRefresh", "on cookie used");
        ne1 ne1Var = aVar.b;
        r5z0 r5z0Var = (r5z0) aVar.e.invoke();
        SharedPreferences.Editor edit = ne1Var.a.edit();
        if (r5z0Var != null) {
            edit.putLong("cookie_used_time", rpb1.g(r5z0Var));
        } else {
            edit.remove("cookie_used_time");
        }
        edit.apply();
        return zy11.a;
    }
}
