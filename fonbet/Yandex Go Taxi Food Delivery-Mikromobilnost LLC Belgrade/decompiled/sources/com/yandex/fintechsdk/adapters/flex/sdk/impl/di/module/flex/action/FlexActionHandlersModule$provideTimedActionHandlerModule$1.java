package com.yandex.fintechsdk.adapters.flex.sdk.impl.di.module.flex.action;

import android.os.SystemClock;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public /* synthetic */ class FlexActionHandlersModule$provideTimedActionHandlerModule$1 extends FunctionReferenceImpl implements sls {
    public static final FlexActionHandlersModule$provideTimedActionHandlerModule$1 INSTANCE = new FlexActionHandlersModule$provideTimedActionHandlerModule$1();

    public FlexActionHandlersModule$provideTimedActionHandlerModule$1() {
        super(0, 0, SystemClock.class, "uptimeMillis", "uptimeMillis()J");
    }

    @Override // defpackage.sls
    public final Long invoke() {
        return Long.valueOf(SystemClock.uptimeMillis());
    }
}
