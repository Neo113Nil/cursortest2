package com.yandex.quark.lite.setup;

import defpackage.cya0;
import defpackage.s2b0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class QuarkInitializerImpl$initiate$permissionRequester$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((s2b0) this.receiver).a.getStringSet("permissions", EmptySet.a).contains(((cya0) obj).a()));
    }
}
