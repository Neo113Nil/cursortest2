package com.yandex.go.flex.common.facade.modules;

import android.os.SystemClock;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class FlexDescriptorsModule$provideMainScreenDescriptorsRepository$1$2 extends FunctionReferenceImpl implements sls {
    public static final FlexDescriptorsModule$provideMainScreenDescriptorsRepository$1$2 b = new FlexDescriptorsModule$provideMainScreenDescriptorsRepository$1$2(0, 0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J");

    @Override // defpackage.sls
    public final Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
