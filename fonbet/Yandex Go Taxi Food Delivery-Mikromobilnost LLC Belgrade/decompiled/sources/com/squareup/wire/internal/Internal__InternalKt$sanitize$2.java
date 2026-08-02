package com.squareup.wire.internal;

import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* synthetic */ class Internal__InternalKt$sanitize$2 extends FunctionReferenceImpl implements tls {
    public static final Internal__InternalKt$sanitize$2 INSTANCE = new Internal__InternalKt$sanitize$2();

    public Internal__InternalKt$sanitize$2() {
        super(1, 1, Internal__InternalKt.class, "sanitize", "sanitize(Ljava/lang/String;)Ljava/lang/String;");
    }

    @Override // defpackage.tls
    public final String invoke(String str) {
        return Internal.sanitize(str);
    }
}
