package com.yandex.plus.pay.internal.di;

import defpackage.dbd0;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference0Impl;
import okhttp3.OkHttpClient;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class PlusPaySdkComponentImpl$getInternalDependencies$1 extends PropertyReference0Impl {
    @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
    public final Object get() {
        return (OkHttpClient) ((dbd0) this.receiver).i.getValue();
    }
}
