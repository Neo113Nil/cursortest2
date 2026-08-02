package com.yandex.messaging.internal.storage.folders;

import defpackage.ny61;
import defpackage.qi1;
import defpackage.vpr;
import defpackage.vwr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public a(vpr vprVar, String str, long j) {
        this.a = vprVar;
        this.b = str;
        this.c = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FoldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1 foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof FoldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1) {
            foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1 = (FoldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((qi1) obj).b.contains(new vwr(this.b, this.c))) {
                        foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1 = new FoldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = foldersRepository$getFolderChatData$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
