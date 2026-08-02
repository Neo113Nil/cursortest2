package com.ybsdk.feature.transfer.version2.internal.screens.common;

import defpackage.evu0;
import defpackage.tls;
import defpackage.tuu0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContactsFuzzySearch$splitNameTokens$1 extends FunctionReferenceImpl implements tls {
    public static final ContactsFuzzySearch$splitNameTokens$1 b = new ContactsFuzzySearch$splitNameTokens$1(1, 1, tuu0.class, "isNotBlank", "isNotBlank(Ljava/lang/CharSequence;)Z");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(!evu0.J((String) obj));
    }
}
