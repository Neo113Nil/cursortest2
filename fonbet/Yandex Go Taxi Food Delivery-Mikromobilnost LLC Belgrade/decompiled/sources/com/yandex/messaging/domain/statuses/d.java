package com.yandex.messaging.domain.statuses;

import defpackage.e370;
import defpackage.gu21;
import defpackage.ny61;
import defpackage.r0k;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public d(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1 getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1) {
            getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1 = (GetDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1) continuation;
            int i2 = getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.b.f.getClass();
                    r0k r0kVar = new r0k((gu21) obj, new e370(true, System.currentTimeMillis()));
                    getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(r0kVar, getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1 = new GetDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getDisplayUserStatusUseCase$handleOwnUserStatus$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
