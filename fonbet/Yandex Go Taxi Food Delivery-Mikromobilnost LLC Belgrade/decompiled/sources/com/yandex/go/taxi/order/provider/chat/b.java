package com.yandex.go.taxi.order.provider.chat;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ g a;

    public b(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChatButtonDelegate$stateObservableFlow$$inlined$map$1$1 chatButtonDelegate$stateObservableFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChatButtonDelegate$stateObservableFlow$$inlined$map$1$1) {
            chatButtonDelegate$stateObservableFlow$$inlined$map$1$1 = (ChatButtonDelegate$stateObservableFlow$$inlined$map$1$1) continuation;
            int i2 = chatButtonDelegate$stateObservableFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatButtonDelegate$stateObservableFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatButtonDelegate$stateObservableFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatButtonDelegate$stateObservableFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    chatButtonDelegate$stateObservableFlow$$inlined$map$1$1.L$0 = null;
                    chatButtonDelegate$stateObservableFlow$$inlined$map$1$1.L$1 = null;
                    chatButtonDelegate$stateObservableFlow$$inlined$map$1$1.L$2 = null;
                    chatButtonDelegate$stateObservableFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, chatButtonDelegate$stateObservableFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        chatButtonDelegate$stateObservableFlow$$inlined$map$1$1 = new ChatButtonDelegate$stateObservableFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = chatButtonDelegate$stateObservableFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatButtonDelegate$stateObservableFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
