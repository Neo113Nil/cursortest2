package com.yandex.passport.internal.ui.webview.webcases;

import android.os.Bundle;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class WebCaseFactory$resolveWebCaseCreator$8 extends FunctionReferenceImpl implements tls {
    public static final WebCaseFactory$resolveWebCaseCreator$8 b = new WebCaseFactory$resolveWebCaseCreator$8(1, 0, h.class, "<init>", "<init>(Lcom/yandex/passport/internal/ui/webview/webcases/WebCaseParams;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Bundle bundle = ((o) obj).d;
        h hVar = new h();
        String string = bundle.getString("web-view-url");
        if (string == null) {
            string = "https://yandex.ru/";
        }
        hVar.a = string;
        return hVar;
    }
}
