package com.yandex.messaging.domain.folders;

import defpackage.l4t;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.vpr;
import defpackage.xvr;
import defpackage.zy11;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar, long j) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1 getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1) {
            getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1 = (GetChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1) continuation;
            int i2 = getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    xvr xvrVar = (xvr) obj;
                    Set h = xvrVar != null ? v4r0.h(v4r0.g(xvrVar.e, xvrVar.f), v4r0.g(xvrVar.c, xvrVar.d)) : null;
                    if (h == null) {
                        h = EmptySet.a;
                    }
                    l4t l4tVar = new l4t(h);
                    getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l4tVar, getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1 = new GetChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChatIdsByFolderIdUseCase$handleCustomFolder$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
