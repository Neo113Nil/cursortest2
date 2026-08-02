package com.yandex.messaging.domain.folders;

import com.yandex.messaging.internal.entities.ChatId;
import defpackage.iyj0;
import defpackage.l7t;
import defpackage.myj0;
import defpackage.ny61;
import defpackage.ojt;
import defpackage.oyj0;
import defpackage.sjt;
import defpackage.tjt;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xjt;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l7t b;

    public e(vpr vprVar, l7t l7tVar) {
        this.a = vprVar;
        this.b = l7tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1 getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof GetFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1) {
            getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1 = (GetFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1) continuation;
            int i2 = getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    oyj0 oyj0Var = (oyj0) obj;
                    if (oyj0Var instanceof myj0) {
                        xjt xjtVar = (xjt) ((myj0) oyj0Var).a;
                        ArrayList m0 = kotlin.collections.a.m0(xjtVar.b, xjtVar.a);
                        obj2 = new ArrayList();
                        Iterator it = m0.iterator();
                        while (it.hasNext()) {
                            tjt tjtVar = (tjt) it.next();
                            String str = tjtVar instanceof ojt ? ((ojt) tjtVar).a : tjtVar instanceof sjt ? new ChatId.PrivateChatId(this.b.g.c(), ((sjt) tjtVar).a).a : null;
                            if (str != null) {
                                obj2.add(str);
                            }
                        }
                    } else {
                        if (!(oyj0Var instanceof iyj0)) {
                            w511.b();
                            return null;
                        }
                        obj2 = EmptyList.a;
                    }
                    getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1) == obj4) {
                        return obj4;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1 = new GetFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getFolderAllChatsUseCase$getGlobalSearchFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
