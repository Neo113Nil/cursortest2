package com.yandex.go.blockeduser.data;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BlockedUserRepositoryImpl$special$$inlined$map$1$2$1 blockedUserRepositoryImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof BlockedUserRepositoryImpl$special$$inlined$map$1$2$1) {
            blockedUserRepositoryImpl$special$$inlined$map$1$2$1 = (BlockedUserRepositoryImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = blockedUserRepositoryImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blockedUserRepositoryImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = blockedUserRepositoryImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = blockedUserRepositoryImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(this.b.a());
                    blockedUserRepositoryImpl$special$$inlined$map$1$2$1.L$0 = null;
                    blockedUserRepositoryImpl$special$$inlined$map$1$2$1.L$1 = null;
                    blockedUserRepositoryImpl$special$$inlined$map$1$2$1.L$2 = null;
                    blockedUserRepositoryImpl$special$$inlined$map$1$2$1.L$3 = null;
                    blockedUserRepositoryImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, blockedUserRepositoryImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        blockedUserRepositoryImpl$special$$inlined$map$1$2$1 = new BlockedUserRepositoryImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = blockedUserRepositoryImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = blockedUserRepositoryImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
