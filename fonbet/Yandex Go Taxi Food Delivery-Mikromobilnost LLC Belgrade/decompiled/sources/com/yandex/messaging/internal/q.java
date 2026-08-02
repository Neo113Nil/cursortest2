package com.yandex.messaging.internal;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.x8t;
import defpackage.zy11;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Date c;

    public q(vpr vprVar, String str, Date date) {
        this.a = vprVar;
        this.b = str;
        this.c = date;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1 getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1) {
            getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1 = (GetMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1) continuation;
            int i2 = getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    x8t x8tVar = new x8t(this.b, (CharSequence) obj, this.c, MessageStatus.OTHER, false, true);
                    getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(x8tVar, getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1 = new GetMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMessageInfoFlowUseCase$MessageInfoHandler$onUnsupportedMessage$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
