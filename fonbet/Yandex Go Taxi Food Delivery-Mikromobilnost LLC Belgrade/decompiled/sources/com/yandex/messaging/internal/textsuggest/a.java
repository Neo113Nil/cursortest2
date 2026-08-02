package com.yandex.messaging.internal.textsuggest;

import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.internal.storage.chats.ChatEventsFlag;
import defpackage.j3b;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.oet;
import defpackage.pet;
import defpackage.tz10;
import defpackage.u2b;
import defpackage.vpr;
import defpackage.wly0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pet b;

    public a(vpr vprVar, pet petVar) {
        this.a = vprVar;
        this.b = petVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetTextSuggestConfigUseCase$execute$$inlined$map$1$2$1 getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetTextSuggestConfigUseCase$execute$$inlined$map$1$2$1) {
            getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1 = (GetTextSuggestConfigUseCase$execute$$inlined$map$1$2$1) continuation;
            int i2 = getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pet petVar = this.b;
                    BackendConfig.TextSuggestConfig textSuggest = petVar.c.a().getTextSuggest();
                    wly0 wly0Var = u2b.b;
                    long j = ((j3b) obj).A;
                    wly0Var.getClass();
                    u2b u2bVar = new u2b(j);
                    ChatEventsFlag chatEventsFlag = ChatEventsFlag.InlineSuggest;
                    kgx kgxVar = u2b.c[3];
                    oet oetVar = (chatEventsFlag.a(u2bVar).booleanValue() || petVar.a.a(tz10.J)) ? new oet(textSuggest.getMin(), textSuggest.getMax()) : null;
                    getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(oetVar, getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1 = new GetTextSuggestConfigUseCase$execute$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getTextSuggestConfigUseCase$execute$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
