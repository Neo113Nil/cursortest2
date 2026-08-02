package com.yandex.messaging.domain.folders;

import defpackage.bc0;
import defpackage.cc0;
import defpackage.el21;
import defpackage.iyj0;
import defpackage.jwr;
import defpackage.k020;
import defpackage.kse;
import defpackage.lwr;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.w511;
import defpackage.xw50;
import defpackage.zwr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a extends com.yandex.messaging.domain.k {
    public final com.yandex.messaging.domain.actions.a b;
    public final com.yandex.messaging.internal.storage.folders.d c;
    public final k020 d;
    public final el21 e;
    public final xw50 f;
    public final com.yandex.messaging.internal.backendconfig.a g;
    public final zwr h;

    public a(com.yandex.messaging.domain.actions.a aVar, com.yandex.messaging.internal.storage.folders.d dVar, k020 k020Var, el21 el21Var, xw50 xw50Var, com.yandex.messaging.internal.backendconfig.a aVar2, zwr zwrVar, kse kseVar) {
        super(kseVar.e);
        this.b = aVar;
        this.c = dVar;
        this.d = k020Var;
        this.e = el21Var;
        this.f = xw50Var;
        this.g = aVar2;
        this.h = zwrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.yandex.messaging.domain.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cc0 cc0Var, ContinuationImpl continuationImpl) {
        AddChatToFolderUseCase$run$1 addChatToFolderUseCase$run$1;
        int i;
        oyj0 oyj0Var;
        a aVar = this;
        cc0 cc0Var2 = cc0Var;
        if (continuationImpl instanceof AddChatToFolderUseCase$run$1) {
            addChatToFolderUseCase$run$1 = (AddChatToFolderUseCase$run$1) continuationImpl;
            int i2 = addChatToFolderUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addChatToFolderUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addChatToFolderUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addChatToFolderUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!aVar.f.a()) {
                        return new iyj0(lwr.a);
                    }
                    bc0 bc0Var = new bc0(cc0Var2.a, cc0Var2.b, cc0Var2.c, aVar.c, aVar.d, aVar.g, aVar.e);
                    addChatToFolderUseCase$run$1.L$0 = aVar;
                    addChatToFolderUseCase$run$1.L$1 = cc0Var2;
                    addChatToFolderUseCase$run$1.label = 1;
                    obj = aVar.b.a(bc0Var, addChatToFolderUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cc0 cc0Var3 = (cc0) addChatToFolderUseCase$run$1.L$1;
                    a aVar2 = (a) addChatToFolderUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    cc0Var2 = cc0Var3;
                    aVar = aVar2;
                }
                oyj0Var = (oyj0) obj;
                if (!(oyj0Var instanceof myj0)) {
                    zwr zwrVar = aVar.h;
                    zwrVar.a.f("add_chat_to_folder", "folderId", cc0Var2.b, "chatId", cc0Var2.c);
                    return oyj0Var;
                }
                if (!(oyj0Var instanceof iyj0)) {
                    w511.b();
                    return null;
                }
                if (((iyj0) oyj0Var).a instanceof jwr) {
                    zwr zwrVar2 = aVar.h;
                    zwrVar2.a.c("add_chat_to_folder_limit", "folderId", cc0Var2.b);
                }
                return oyj0Var;
            }
        }
        addChatToFolderUseCase$run$1 = new AddChatToFolderUseCase$run$1(aVar, continuationImpl);
        Object obj2 = addChatToFolderUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addChatToFolderUseCase$run$1.label;
        if (i != 0) {
        }
        oyj0Var = (oyj0) obj2;
        if (!(oyj0Var instanceof myj0)) {
        }
    }
}
