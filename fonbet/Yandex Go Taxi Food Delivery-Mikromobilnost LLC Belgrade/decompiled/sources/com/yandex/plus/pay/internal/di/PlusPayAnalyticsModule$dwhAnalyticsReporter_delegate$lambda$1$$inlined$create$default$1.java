package com.yandex.plus.pay.internal.di;

import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import okhttp3.OkHttpClient;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class PlusPayAnalyticsModule$dwhAnalyticsReporter_delegate$lambda$1$$inlined$create$default$1 extends FunctionReferenceImpl implements sls {
    public static final PlusPayAnalyticsModule$dwhAnalyticsReporter_delegate$lambda$1$$inlined$create$default$1 b = new PlusPayAnalyticsModule$dwhAnalyticsReporter_delegate$lambda$1$$inlined$create$default$1();

    public PlusPayAnalyticsModule$dwhAnalyticsReporter_delegate$lambda$1$$inlined$create$default$1() {
        super(0, 0, OkHttpClient.a.class, "<init>", "<init>()V");
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new OkHttpClient.a();
    }
}
