package com.yandex.feedsdk.internal;

import defpackage.aqq;
import defpackage.tls;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class SkeletonContentControllerFactory$getContentController$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        Integer a = ((aqq) this.receiver).a.a(str);
        return a != null ? String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(a.intValue())}, 1)) : str;
    }
}
