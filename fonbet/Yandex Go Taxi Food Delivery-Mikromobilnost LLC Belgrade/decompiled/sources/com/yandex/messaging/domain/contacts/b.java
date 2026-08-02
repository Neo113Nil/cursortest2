package com.yandex.messaging.domain.contacts;

import defpackage.ny61;
import defpackage.o4b;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ String w;

    public b(vpr vprVar, c cVar, Long l, String str) {
        this.a = vprVar;
        this.b = cVar;
        this.c = l;
        this.w = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1 getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1) {
            getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1 = (GetContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    o4b d = c.d(this.b, this.c, this.w);
                    d.b.getCount();
                    getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(d, getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1 = new GetContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getContactListCursorUseCase$contactsFlow$1$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
