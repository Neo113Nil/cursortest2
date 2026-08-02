package com.yandex.messaging.domain.folders;

import defpackage.d2b;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x3b;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public h(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1 getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1) {
            getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1 = (GetFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1) continuation;
            int i2 = getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    d2b d2bVar = (d2b) obj;
                    x3b x3bVar = new x3b(this.b, d2bVar.a, d2bVar.b, d2bVar.c);
                    getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(x3bVar, getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1 = new GetFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getFolderChatDisplayDataUseCase$getChatDisplayData$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
