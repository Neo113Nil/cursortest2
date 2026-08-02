package com.yandex.go.screenshot_screencast_tracker.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.screenshot_screencast_tracker.impl.ScreenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1", f = "ScreenshotAndScreencastInteractor.kt", l = {39}, m = "emit-N--JKf0", v = 2)
/* renamed from: com.yandex.go.screenshot_screencast_tracker.impl.ScreenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emit-N--JKf0$1, reason: invalid class name */
/* loaded from: classes12.dex */
final class ScreenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotAndScreencastInteractor$onFirstContentfulPaint$1$1$1$1$emitNJKf0$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
