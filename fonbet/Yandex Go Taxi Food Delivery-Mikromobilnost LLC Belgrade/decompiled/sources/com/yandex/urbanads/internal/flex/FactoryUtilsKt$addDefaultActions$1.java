package com.yandex.urbanads.internal.flex;

import android.os.SystemClock;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class FactoryUtilsKt$addDefaultActions$1 extends FunctionReferenceImpl implements sls {
    public static final FactoryUtilsKt$addDefaultActions$1 b = new FactoryUtilsKt$addDefaultActions$1(0, 0, SystemClock.class, "uptimeMillis", "uptimeMillis()J");

    @Override // defpackage.sls
    public final Object invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
