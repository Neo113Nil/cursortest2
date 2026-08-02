package com.yandex.messaging.extension.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.io.Closeable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ vpr b;

    public a(vpr vprVar, Ref$ObjectRef ref$ObjectRef) {
        this.a = ref$ObjectRef;
        this.b = vprVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Closeable closeable, Continuation continuation) {
        FlowKt$autoClosing$1$1$emit$1 flowKt$autoClosing$1$1$emit$1;
        int i;
        T t;
        if (continuation instanceof FlowKt$autoClosing$1$1$emit$1) {
            flowKt$autoClosing$1$1$emit$1 = (FlowKt$autoClosing$1$1$emit$1) continuation;
            int i2 = flowKt$autoClosing$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt$autoClosing$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt$autoClosing$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt$autoClosing$1$1$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Closeable closeable2 = (Closeable) this.a.element;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    flowKt$autoClosing$1$1$emit$1.L$0 = this;
                    flowKt$autoClosing$1$1$emit$1.L$1 = closeable;
                    flowKt$autoClosing$1$1$emit$1.label = 1;
                    Object emit = this.b.emit(closeable, flowKt$autoClosing$1$1$emit$1);
                    t = closeable;
                    if (emit == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Closeable closeable3 = (Closeable) flowKt$autoClosing$1$1$emit$1.L$1;
                    this = (a) flowKt$autoClosing$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                    t = closeable3;
                }
                this.a.element = t;
                return zy11.a;
            }
        }
        flowKt$autoClosing$1$1$emit$1 = new FlowKt$autoClosing$1$1$emit$1(this, continuation);
        Object obj2 = flowKt$autoClosing$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt$autoClosing$1$1$emit$1.label;
        if (i != 0) {
        }
        this.a.element = t;
        return zy11.a;
    }
}
