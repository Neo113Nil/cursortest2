package com.yandex.plus.home.feature.webviews.internal.network;

import defpackage.jy00;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class WebViewHeader$1 extends FunctionReferenceImpl implements wls {
    public static final WebViewHeader$1 b = new WebViewHeader$1(2, 1, jy00.class, "defaultMaskHeaderValue", "defaultMaskHeaderValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        return (str.equals("X-OAuth-Token") || str.equals("Authorization")) ? "[hidden]" : (String) obj2;
    }
}
