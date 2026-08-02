package com.yandex.plus.home.feature.webviews.internal;

import defpackage.bv80;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xlv;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class b implements vpr {
    public final /* synthetic */ String a;
    public final /* synthetic */ c b;
    public final /* synthetic */ vpr c;

    public b(String str, c cVar, vpr vprVar) {
        this.a = str;
        this.b = cVar;
        this.c = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(bv80 bv80Var, Continuation continuation) {
        SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1 subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        vpr vprVar;
        Object b;
        if (continuation instanceof SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1) {
            subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1 = (SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1) continuation;
            int i2 = subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                vprVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(this.a, bv80Var.b)) {
                        xlv xlvVar = new xlv(bv80Var.a, bv80Var.c, bv80Var.d);
                        com.yandex.plus.home.feature.webviews.internalapi.bridge.a aVar = this.b.b;
                        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.L$0 = null;
                        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.L$1 = null;
                        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.label = 1;
                        b = aVar.b(xlvVar, subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1);
                    } else {
                        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.L$0 = null;
                        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.label = 3;
                        if (vprVar.emit(null, subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1) != coroutineSingletons) {
                            return zy11Var;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                    } else if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
                if (b instanceof Result.Failure) {
                    b = null;
                }
                subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.L$0 = null;
                subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.L$1 = null;
                subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.L$2 = null;
                subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.label = 2;
                if (vprVar.emit((String) b, subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1 = new SubscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1(this, continuation);
        Object obj2 = subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        vprVar = this.c;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.L$0 = null;
        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.L$1 = null;
        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.L$2 = null;
        subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1.label = 2;
        if (vprVar.emit((String) b, subscribeOnWebViewMessageUseCase$mapMessageAndSendToReceiver$1$1$emit$1) != coroutineSingletons) {
        }
    }
}
