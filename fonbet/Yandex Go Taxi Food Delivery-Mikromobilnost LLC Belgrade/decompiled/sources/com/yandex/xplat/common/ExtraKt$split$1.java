package com.yandex.xplat.common;

import defpackage.tls;
import defpackage.tuu0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class ExtraKt$split$1 extends FunctionReferenceImpl implements tls {
    public static final ExtraKt$split$1 b = new ExtraKt$split$1(1, 1, tuu0.class, "isNotEmpty", "isNotEmpty(Ljava/lang/CharSequence;)Z");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((String) obj).length() > 0);
    }
}
