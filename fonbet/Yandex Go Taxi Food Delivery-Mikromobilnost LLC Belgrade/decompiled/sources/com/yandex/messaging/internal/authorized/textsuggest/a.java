package com.yandex.messaging.internal.authorized.textsuggest;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b b;

    public a(vpr vprVar, b bVar) {
        this.b = bVar;
        this.a = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (kotlinx.coroutines.a.j(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r6.a.emit((defpackage.upq0) r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChatTextSuggestController$special$$inlined$transform$1$1$1 chatTextSuggestController$special$$inlined$transform$1$1$1;
        int i;
        if (continuation instanceof ChatTextSuggestController$special$$inlined$transform$1$1$1) {
            chatTextSuggestController$special$$inlined$transform$1$1$1 = (ChatTextSuggestController$special$$inlined$transform$1$1$1) continuation;
            int i2 = chatTextSuggestController$special$$inlined$transform$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatTextSuggestController$special$$inlined$transform$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chatTextSuggestController$special$$inlined$transform$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatTextSuggestController$special$$inlined$transform$1$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    chatTextSuggestController$special$$inlined$transform$1$1$1.L$0 = this;
                    chatTextSuggestController$special$$inlined$transform$1$1$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) chatTextSuggestController$special$$inlined$transform$1$1$1.L$0;
                    kotlin.b.b(obj2);
                }
                long j = this.b.i;
                chatTextSuggestController$special$$inlined$transform$1$1$1.L$0 = null;
                chatTextSuggestController$special$$inlined$transform$1$1$1.label = 2;
            }
        }
        chatTextSuggestController$special$$inlined$transform$1$1$1 = new ChatTextSuggestController$special$$inlined$transform$1$1$1(this, continuation);
        Object obj22 = chatTextSuggestController$special$$inlined$transform$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatTextSuggestController$special$$inlined$transform$1$1$1.label;
        if (i != 0) {
        }
        long j2 = this.b.i;
        chatTextSuggestController$special$$inlined$transform$1$1$1.L$0 = null;
        chatTextSuggestController$special$$inlined$transform$1$1$1.label = 2;
    }
}
