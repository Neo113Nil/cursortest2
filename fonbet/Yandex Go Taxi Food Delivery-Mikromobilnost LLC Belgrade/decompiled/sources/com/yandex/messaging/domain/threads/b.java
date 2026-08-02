package com.yandex.messaging.domain.threads;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Long c;

    public b(vpr vprVar, c cVar, Long l) {
        this.a = vprVar;
        this.b = cVar;
        this.c = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        HasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1 hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof HasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1) {
            hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1 = (HasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Integer num = new Integer(c.d(this.b, this.c));
                    hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(num, hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1 = new HasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hasThreadsMentionUseCase$hasThreadMentionsCountFlow$1$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
