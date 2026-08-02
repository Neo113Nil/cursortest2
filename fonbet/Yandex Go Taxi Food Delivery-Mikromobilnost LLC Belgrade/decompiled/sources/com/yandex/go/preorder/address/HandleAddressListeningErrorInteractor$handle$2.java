package com.yandex.go.preorder.address;

import defpackage.s8o;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class HandleAddressListeningErrorInteractor$handle$2 extends FunctionReferenceImpl implements tls {
    public static final HandleAddressListeningErrorInteractor$handle$2 b = new HandleAddressListeningErrorInteractor$handle$2(1, 1, s8o.class, "isServerError", "isServerError(Ljava/lang/Throwable;)Z");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(s8o.E((Throwable) obj));
    }
}
