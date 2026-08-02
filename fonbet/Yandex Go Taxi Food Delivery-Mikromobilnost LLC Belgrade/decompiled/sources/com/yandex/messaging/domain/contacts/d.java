package com.yandex.messaging.domain.contacts;

import defpackage.jl40;
import defpackage.nbt;
import defpackage.ny61;
import defpackage.pbt;
import defpackage.qbt;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public d(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1 getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GetPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1) {
            getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1 = (GetPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1) continuation;
            int i2 = getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qbt qbtVar = (qbt) obj;
                    if (qbtVar instanceof pbt) {
                        Iterator it = ((pbt) qbtVar).a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (jl40.l(((nbt) next).b, this.b)) {
                                obj3 = next;
                                break;
                            }
                        }
                        obj3 = (nbt) obj3;
                    }
                    getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1) == coroutineSingletons) {
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
        getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1 = new GetPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getPhoneContactListUseCase$getPhoneContactByUserId$$inlined$map$1$2$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
