package com.yandex.messaging.isolated;

import com.yandex.messaging.sdk.ChatFilterParams;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b b;
    public final /* synthetic */ ChatFilterParams c;

    public a(vpr vprVar, b bVar, ChatFilterParams chatFilterParams) {
        this.a = vprVar;
        this.b = bVar;
        this.c = chatFilterParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1 getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1) {
            getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1 = (GetIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList d = b.d(this.b, this.c);
                    getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(d, getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1 = new GetIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getIsolatedChatListUseCase$run$1$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
