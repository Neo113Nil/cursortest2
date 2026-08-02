package com.yandex.plus.webview.core;

import android.net.Uri;
import android.webkit.ValueCallback;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class PlusWebChromeClient$onShowFileChooser$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((ValueCallback) this.receiver).onReceiveValue((Uri[]) obj);
        return zy11.a;
    }
}
