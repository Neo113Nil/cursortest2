package com.yandex.plus.core.graphql.internal;

import defpackage.mvg;
import defpackage.za70;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.core.graphql.internal.ApolloClientExtensionsKt", f = "ApolloClientExtensions.kt", l = {83}, m = "awaitOperation")
/* loaded from: classes8.dex */
final class ApolloClientExtensionsKt$awaitOperation$1<D extends za70, T extends za70> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(null, null, this);
    }
}
