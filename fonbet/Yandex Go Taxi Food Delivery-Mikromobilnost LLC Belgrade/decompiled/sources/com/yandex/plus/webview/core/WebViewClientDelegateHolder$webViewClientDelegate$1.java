package com.yandex.plus.webview.core;

import defpackage.byt0;
import defpackage.hms;
import defpackage.on41;
import defpackage.pgz;
import defpackage.so41;
import defpackage.tls;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class WebViewClientDelegateHolder$webViewClientDelegate$1 extends FunctionReferenceImpl implements hms {
    @Override // defpackage.hms
    public final Object a(so41 so41Var, on41 on41Var, on41 on41Var2, on41 on41Var3, Object obj, zls zlsVar, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        pgz pgzVar = (pgz) obj4;
        ((a) this.receiver).getClass();
        return new PlusWebViewClient(pgzVar, so41Var, on41Var, on41Var2, on41Var3, (tls) obj, zlsVar, (byt0) obj2, booleanValue);
    }
}
