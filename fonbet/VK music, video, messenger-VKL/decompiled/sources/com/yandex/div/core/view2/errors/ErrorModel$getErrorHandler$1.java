package com.yandex.div.core.view2.errors;

import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.view2.Div2View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ErrorVisualMonitor.kt */
/* loaded from: classes7.dex */
public /* synthetic */ class ErrorModel$getErrorHandler$1 extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
    public ErrorModel$getErrorHandler$1(Object obj) {
        super(1, obj, DivActionTypedUtilsKt.class, "logError", "logError(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/Throwable;)V", 1);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
        invoke2(th);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        DivActionTypedUtilsKt.logError((Div2View) this.receiver, th);
    }
}
