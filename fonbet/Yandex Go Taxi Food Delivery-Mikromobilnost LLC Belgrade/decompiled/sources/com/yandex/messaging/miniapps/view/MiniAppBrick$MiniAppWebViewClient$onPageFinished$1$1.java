package com.yandex.messaging.miniapps.view;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public /* synthetic */ class MiniAppBrick$MiniAppWebViewClient$onPageFinished$1$1 extends FunctionReferenceImpl implements tls {
    public final void i(int i) {
        a aVar = (a) this.receiver;
        if (aVar.L != MiniAppBrick$SizeSource.SIZE) {
            aVar.c.a(i);
        }
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i(((Number) obj).intValue());
        return zy11.a;
    }
}
